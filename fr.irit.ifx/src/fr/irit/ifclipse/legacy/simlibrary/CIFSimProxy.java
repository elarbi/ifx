package fr.irit.ifclipse.legacy.simlibrary;

/*
 * CIFSimProxy.java
 *
 * Created on 25 avril 2003, 17:28
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.bootstrap.DOMImplementationRegistry;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

/**
 * 
 * @author ober
 */
public class CIFSimProxy {

	private static CIFSimProxy instance;
	protected Socket socket = null;
	protected PrintWriter socket_out = null;
	protected BufferedReader socket_in = null;

	protected int scenarioCurrent = -1;
	protected int scenarioMax = -1;
	protected Document scenario = null;
	protected Node scenarioNextStep = null;

	protected Node cacheConfig = null;
	protected Node cacheTransitions = null;

	protected LSSerializer DOMWriter = null;

	public final static String XMLHeader = "<?xml version = '1.0' encoding = 'ISO-8859-1' standalone = 'yes'  ?>";

	public static synchronized CIFSimProxy getInstance() {
		if (instance == null)
			instance = new CIFSimProxy();
		return instance;
	}

	/** Creates a new instance of CIFSimProxy */
	private CIFSimProxy() {
		DOMImplementationRegistry registry;
		try {
			registry = DOMImplementationRegistry.newInstance();

			DOMImplementationLS impl = // (DOMImplementationLS)_di.getFeature("LS",
										// "3.0");
			(DOMImplementationLS) registry.getDOMImplementation("LS");

			DOMWriter = impl.createLSSerializer();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	/**
	 * proxy commands
	 */
	public void Connect(String host, int port) throws UnknownHostException,
			IOException, SecurityException, EIFSimException {
		socket = new Socket(host, port);
		try {
			socket_out = new PrintWriter(socket.getOutputStream(), true);
			socket_in = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
		} catch (IOException e) {
			socket = null;
			throw e;
		} catch (SecurityException e) {
			socket = null;
			throw e;
		}

		scenarioCurrent = -1;
		scenarioMax = -1;
		_initScenario();
		scenarioNextStep = null;
		cacheConfig = cacheTransitions = null;

	}

	public void Close() throws IOException, EIFSimException {
		if (socket == null)
			throw new EIFSimException("Proxy not connected to simulator");
		socket.close();
		socket = null;
		socket_out = null;
		socket_in = null;

		scenarioCurrent = -1;
		scenarioMax = -1;
		scenario = null;
		scenarioNextStep = null;
		cacheConfig = cacheTransitions = null;

	}

	public void Init() throws EIFSimException {
		_SendXMLRequest("<IFSInit/>");
		testOK();

		scenarioCurrent = 0;
		scenarioMax = 0;
		cacheConfig = cacheTransitions = null;
		_initScenario();
		scenarioNextStep = null;

	}

	public void Undo() throws EIFSimException {
		if (scenarioCurrent <= 0)
			return;
		_SendXMLRequest("<IFSUndo/>");
		testOK();

		scenarioCurrent--;
		cacheConfig = cacheTransitions = null;
		if (scenarioNextStep == null)
			scenarioNextStep = scenario.getDocumentElement().getLastChild();
		else
			scenarioNextStep = scenarioNextStep.getPreviousSibling();

	}

	public void Rewind() throws EIFSimException {
		if (scenarioCurrent <= 0)
			return;
		_playInterrupt = false;
		_playLength = scenarioMax;
		_playStep = scenarioCurrent;
		while (scenarioCurrent > 0 && !_playInterrupt) {
			_playStep--;
			Undo();
		}
		_playLength = 0;

	}

	public void Redo() throws EIFSimException {
		if (scenarioCurrent >= scenarioMax)
			return;
		_SendXMLRequest("<IFSRedo/>");
		testOK();

		scenarioCurrent++;
		cacheConfig = cacheTransitions = null;
		scenarioNextStep = scenarioNextStep.getNextSibling();

	}

	public void Replay() throws EIFSimException {
		if (scenarioCurrent >= scenarioMax)
			return;
		_playInterrupt = false;
		_playLength = scenarioMax;
		_playStep = scenarioCurrent;
		while (scenarioCurrent < scenarioMax && !_playInterrupt) {
			_playStep++;
			Redo();
		}
		_playLength = 0;
	}

	public void GotoStep(int step) throws EIFSimException {
		if (step < 0 || step > scenarioMax || step == scenarioCurrent)
			return;
		_playInterrupt = false;
		_playLength = scenarioMax;
		_playStep = scenarioCurrent;
		while (scenarioCurrent < step && !_playInterrupt) {
			_playStep++;
			Redo();
		}
		while (scenarioCurrent > step && !_playInterrupt) {
			_playStep--;
			Undo();
		}
		_playLength = 0;
	}

	public void Fire(int trno) throws EIFSimException {
		if (scenarioCurrent < 0)
			return;

		ListTransitions(); // make sure the transitions cache is ok

		_SendXMLRequest("<IFSFire trno='" + trno + "'/>");
		testOK();

		// update scenario

		Element s = scenario.getDocumentElement();
		while (scenarioMax > scenarioCurrent) { // remove elements from
												// current+1 to max
			s.removeChild(s.getLastChild());
			scenarioMax--;
		}
		// add element
		Node trans = cacheTransitions.getFirstChild();
		while (trno-- > 0)
			trans = trans.getNextSibling();
		s.appendChild(scenario.importNode(trans, true));

		scenarioMax = ++scenarioCurrent;
		scenarioNextStep = null;

		// erase cache
		cacheConfig = cacheTransitions = null;

	}

	public Node getTransitionNode(int trno) throws EIFSimException {
		ListTransitions(); // make sure the transitions cache is ok
		Node trans = cacheTransitions.getFirstChild();
		while (trno-- > 0)
			trans = trans.getNextSibling();
		return trans;
	}

	public void Play(File saved) throws EIFSimException {
		_initDocumentBuilder();
		try {
			Document doc = _db.parse(new java.io.FileInputStream(saved));

			// remove text nodes
			{ // tree from org.w3c.dom.Node by Traverse wizard 2.02:
				(new Object() { // anonymous class
					void traverse(Node n, int depth) {
						Node node = n.getFirstChild();
						while (node != null) {
							// work with your node here
							Node next = node.getNextSibling();
							if (node.getNodeType() == Node.TEXT_NODE)
								node.getParentNode().removeChild(node);
							else
								traverse(node, depth + 1); // recursion
							node = next;
						}
					}
				}).traverse(doc, 0);
			}

			Play(doc.getDocumentElement());
		} catch (java.io.FileNotFoundException ex) {
			throw new EIFSimException("Cannot open file " + saved.toString());
		} catch (java.io.IOException ex) {
			throw new EIFSimException("Cannot read file " + saved.toString());
		} catch (org.xml.sax.SAXException ex1) {
			throw new EIFSimException("Cannot parse file " + saved.toString()
					+ ": " + ex1.toString());
		}
	}

	protected int _playStep = 0;
	protected int _playLength = 0;
	protected boolean _playInterrupt = false;

	public int getPlayStep() {
		return _playStep;
	}

	public int getPlayLength() {
		return _playLength;
	}

	public void interruptPlay() {
		_playInterrupt = true;
	}

	public void Play(Element saved) throws EIFSimException {
		_playLength = saved.getChildNodes().getLength();
		_playStep = 0;
		_playInterrupt = false;
		for (Node child = saved.getFirstChild(); child != null
				&& !_playInterrupt; child = child.getNextSibling()) {
			if (!(child instanceof Element))
				continue;
			_playStep++;
			int index;

			try {
				index = getTransitionNo(child);
			} catch (EIFSimException ex) {
				_playLength = 0;
				throw new EIFSimException("Scenario step " + _playStep + ": "
						+ ex.getMessage());
			}
			Fire(index);
		}
		_playLength = 0;
	}

	public String GetStateString() throws EIFSimException {

		_SendXMLRequest("<IFSGetState/>");
		return _GetXMLResponse();
	}

	public String ListTransitionsString() throws EIFSimException {

		_SendXMLRequest("<IFSListTransitions/>");
		return _GetXMLResponse();
	}

	//
	// public Node GetState() throws EIFSimException {
	// if(cacheConfig != null)
	// return cacheConfig;
	//
	// _SendXMLRequest("<IFSGetState/>");
	// cacheConfig = _GetXMLResponseNode();
	// return cacheConfig;
	// }

	public Node ListTransitions() throws EIFSimException {
		if (cacheTransitions != null)
			return cacheTransitions;

		_SendXMLRequest("<IFSListTransitions/>");
		cacheTransitions = _GetXMLResponseNode();
		return cacheTransitions;
	}

	public int getTransitionNo(Node xml) throws EIFSimException {
		Node trs = ListTransitions();
		Node tr = trs.getFirstChild();
		int index = 0;

		int chosenindex = -1;
		String scnTrans = DOMWriter.writeToString(xml);
		for (; tr != null; tr = tr.getNextSibling(), index++) {
			String modelTrans = DOMWriter.writeToString(tr);
			if (modelTrans.equals(scnTrans)) {
				if (chosenindex != -1)
					throw new EIFSimException(
							"non-determinism cannot be resolved between two identical transitions ("
									+ chosenindex + " and " + index + ")");
				chosenindex = index;
			}
		}

		if (chosenindex == -1)
			throw new EIFSimException(
					"XML node does not represent a fireable transition in the current state.");

		return chosenindex;
	}

	public int getScenarioNextStepTransitionNo() {
		if (scenarioNextStep == null)
			return -1;
		int x;
		try {
			x = getTransitionNo(scenarioNextStep);
		} catch (EIFSimException ex) {
			x = -1;
		}
		return x;
	}

	/**
	 * XML-Socket level methods
	 */
	protected void _SendXMLRequest(String xml) throws EIFSimException {
		if (socket == null)
			throw new EIFSimException("Proxy not connected to simulator");
		int PDULength = XMLHeader.length() + xml.length();

		// TRACE

		// System.out.println("------------------START: _SendXMLRequest: ------------------");
		// System.out.println(xml);
		// System.out.println("------------------END: _SendXMLRequest: ------------------");
		// System.out.println("\n");
		// END TRACE

		String PDUHead = Integer.toString(PDULength);
		int nbHeadSpaces = 8 - PDUHead.length();

		while (nbHeadSpaces-- > 0)
			socket_out.print(" ");
		socket_out.print(PDUHead);
		socket_out.print(XMLHeader);
		socket_out.print(xml);
		socket_out.flush();
	}

	protected String _GetXMLResponse() throws EIFSimException {
		if (socket == null)
			throw new EIFSimException("Proxy not connected to simulator");

		char PDULength[] = new char[8];
		char res[];
		int nPDULength;
		int nRead = 0;

		try {
			while (nRead < 8) {
				nRead += socket_in.read(PDULength, nRead, 8 - nRead);
				if (!socket.isConnected() || socket.isClosed())
					throw new EIFSimException("Protocol error");
			}

			nPDULength = Integer.parseInt((new String(PDULength, 0, 8)).trim());
			res = new char[nPDULength];
			nRead = 0;

			while (nRead < nPDULength) {
				nRead += socket_in.read(res, nRead, nPDULength - nRead);
				if (!socket.isConnected() || socket.isClosed())
					throw new EIFSimException("Protocol error");
			}
		} catch (IOException ex) {
			throw new EIFSimException("Protocol error");
		} catch (IndexOutOfBoundsException ex) {
			throw new EIFSimException("Protocol error");
		}

		// TRACE

		// System.out.println("------------------START: _GetXMLResponse: ------------------");
		// System.out.println(new String(res, 0, nPDULength));
		// System.out.println("------------------END: _GetXMLResponse: ------------------");
		// System.out.println("\n");

		// END TRACE

		return new String(res, 0, nPDULength);
	}

	protected void testOK() throws EIFSimException {
		String ret = _GetXMLResponse();
		if (!ret.substring(ret.length() - 8).equals("<IFSOk/>"))
			throw new EIFSimException("Simulator error");
	}

	protected static DocumentBuilderFactory _dbf = null;
	protected static DocumentBuilder _db = null;

	protected void _initDocumentBuilder() throws EIFSimException {
		try {
			if (_dbf == null)
				_dbf = DocumentBuilderFactory.newInstance();
			if (_db == null) {
				_dbf.setValidating(false);
				_dbf.setIgnoringComments(true);
				_dbf.setIgnoringElementContentWhitespace(true);
				_dbf.setCoalescing(true);
				_dbf.setExpandEntityReferences(true);
				_db = _dbf.newDocumentBuilder();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new EIFSimException(ex.getMessage());
		}
	}

	protected Node _GetXMLResponseNode() throws EIFSimException {
		String s = null;
		Document doc;

		_initDocumentBuilder();
		try {
			s = _GetXMLResponse();
			doc = _db.parse(new java.io.ByteArrayInputStream(s.getBytes()));

			// remove text nodes
			{ // tree from org.w3c.dom.Node by Traverse wizard 2.02:
				(new Object() { // anonymous class
					void traverse(Node n, int depth) {
						Node node = n.getFirstChild();
						while (node != null) {
							// work with your node here
							Node next = node.getNextSibling();
							if (node.getNodeType() == Node.TEXT_NODE)
								node.getParentNode().removeChild(node);
							else
								traverse(node, depth + 1); // recursion
							node = next;
						}
					}
				}).traverse(doc, 0);
			}

			return doc.getDocumentElement();
		} catch (Exception ex) {
			ex.printStackTrace();
			// System.err.println("xml document<<<<<<<<\n"+s+"\n>>>>>>>> end xml document");
			throw new EIFSimException(ex.getMessage());
		}
	}

	DOMImplementation _di = null;

	protected void _initScenario() throws EIFSimException {
		_initDocumentBuilder();
		_di = _db.getDOMImplementation();
		// _di =
		// (DOMImplementation)com.sun.org.apache.xerces.internal.dom.DOMImplementationImpl.getDOMImplementation();
		scenario = _di.createDocument("http://www-verimag.imag.fr", "scenario",
				null);
	}

	public void writeScenario(File file) throws java.io.FileNotFoundException,
			java.io.IOException {
		if (_di.getClass().getName()
				.equals("org.apache.xerces.dom.DOMImplementationImpl")) {
			String str = DOMWriter.writeToString(scenario.getDocumentElement());
			FileOutputStream fs = new FileOutputStream(file);
			fs.write(str.substring(str.indexOf('<', 2)).getBytes());
		} else {
			FileOutputStream fs = new FileOutputStream(file);
			fs.write(scenario.getDocumentElement().toString().getBytes());
		}

	}

	/**
	 * local data access
	 */
	public boolean isConnected() {
		return socket != null;
	}

	public int getScenarioMax() {
		return scenarioMax;
	}

	public int getScenarioCurrent() {
		return scenarioCurrent;
	}

	public Document getScenario() {
		return scenario;
	}

	/*
	 * public void notifyViews() { System.out.println("______");
	 * if(scenario!=null
	 * )System.out.println("%%%"+scenario.getDocumentElement());
	 * System.out.println("______"); System.out.println("%%%"+scenarioNextStep);
	 * super.notifyViews(); }
	 */

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) throws UnknownHostException,
			IOException, SecurityException, EIFSimException {
		CIFSimProxy p = new CIFSimProxy();

		p.Connect("localhost", 15555);
		p.Init();
		// System.out.println("start");
		// System.out.println(p.GetStateString());
		p.Fire(1);
		// System.out.println(p.GetStateString());
		p.Close();
	}

}
