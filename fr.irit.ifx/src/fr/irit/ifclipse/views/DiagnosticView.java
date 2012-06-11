package fr.irit.ifclipse.views;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.zest.core.viewers.GraphViewer;
import org.eclipse.zest.core.viewers.IGraphContentProvider;
import org.eclipse.zest.core.widgets.Graph;
import org.eclipse.zest.core.widgets.GraphConnection;
import org.eclipse.zest.core.widgets.GraphNode;
import org.eclipse.zest.core.widgets.ZestStyles;
import org.eclipse.zest.layouts.LayoutStyles;
import org.eclipse.zest.layouts.algorithms.SpringLayoutAlgorithm;

import fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic;
import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag;
import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement;
import fr.irit.ifclipse.visual.patterns.ComDiag.Lifeline;
import fr.irit.ifclipse.visual.patterns.ComDiag.Message;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant;

public class DiagnosticView extends IFClipseView {

	public static final String ID = "fr.irit.ifclipse.views.DiagnosticView";
	public static final int ENTER = 13;
	public static final int BACKSPACE = 8;
	private Composite parent;
	private Graph g;

	public DiagnosticView() {
		viewType = IFClipseView.DIAGNOSTIC_VIEW;
		id = ID;
		controller.bindView(this, controller.getVisualDiagORE());
	}

	@Override
	public void createPartControl(Composite parent) {

		// g = new Graph(parent, SWT.NONE); // selectionListener does not work!
		g = new Graph(parent.getShell(), SWT.NONE);
		this.parent = parent;
		// Selection listener on graphConnect or GraphNode is not supported
		// see https://bugs.eclipse.org/bugs/show_bug.cgi?id=236528

	}

	@Override
	public void refresh(Resource resource) {
		if (resource.getContents().size() > 0) {
			EObject eObj = resource.getContents().get(0);

			// TODO: Refactor in DiagnosticViewInterpreter classes
			if (eObj instanceof VisualDiagnostic) {
				visualDiagnostic2Graph(g, (VisualDiagnostic) eObj);
			}
			if (eObj instanceof ScenarioParticipant) {
				ScenarioParticipant2Graph(g, (ScenarioParticipant) eObj);
			}
			if (eObj instanceof ComDiag) {
				comDiag2ZestGraph((ComDiag) eObj);
			}

		}

	}

	private GraphNode getNodeByLabel(String label, Graph g) {

		for (Object obj : g.getNodes()) {
			if (obj instanceof GraphNode) {
				GraphNode gNode = (GraphNode) obj;
				if (gNode.getText().equals(label))
					return gNode;
			}
		}
		return null;
	}

	static class MyContentProvider implements IGraphContentProvider {

		public Object getSource(Object rel) {
			if ("Rock2Paper".equals(rel)) {
				return "Rock";
			} else if ("Paper2Scissors".equals(rel)) {
				return "Paper";
			} else if ("Scissors2Rock".equals(rel)) {
				return "Scissors";
			}
			return null;
		}

		public Object[] getElements(Object input) {
			return new Object[] { "Rock2Paper", "Paper2Scissors",
					"Scissors2Rock" };
		}

		public Object getDestination(Object rel) {
			if ("Rock2Paper".equals(rel)) {
				return "Paper";
			} else if ("Paper2Scissors".equals(rel)) {
				return "Scissors";
			} else if ("Scissors2Rock".equals(rel)) {
				return "Rock";
			}
			return null;
		}

		public double getWeight(Object connection) {
			return 0;
		}

		public void dispose() {
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

	}

	static class MyLabelProvider extends LabelProvider {
		final Image image = Display.getDefault().getSystemImage(
				SWT.ICON_WARNING);

		public Image getImage(Object element) {
			if (element.equals("Rock") || element.equals("Paper")
					|| element.equals("Scissors")) {
				return image;
			}
			return null;
		}

		public String getText(Object element) {
			return element.toString();
		}
	}

	private void comDiag2ZestGraph(ComDiag comDiag) {

		final Display d = parent.getDisplay();

		// Shell shell = new Shell(d);
		// shell.setText("GraphJFaceSnippet2");
		Composite shell = parent.getShell();
		shell.setLayout(new FillLayout(SWT.VERTICAL));
		// shell.setSize(400, 400);

		GraphViewer viewer = new GraphViewer(shell, SWT.NONE);
		viewer.setContentProvider(new MyContentProvider());
		viewer.setLabelProvider(new MyLabelProvider());
		viewer.setLayoutAlgorithm(new SpringLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING));
		viewer.setInput(comDiag);
		// ((Shell) shell).open();

		// while (!shell.isDisposed()) {
		// while (!d.readAndDispatch()) {
		// d.sleep();
		// }
		// }

	}

	private void comDiag2ZestGraph1(Graph g2, ComDiag comDiag) {

		// final Map figureListing = new HashMap();
		final StringBuffer stringBuffer = new StringBuffer();
		final Display d = parent.getDisplay();

		FontData fontData = d.getSystemFont().getFontData()[0];
		fontData.height = 24;

		final Font font = new Font(d, fontData);

		clearGraph(g);
		g.setLayoutAlgorithm(new SpringLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		g.setConnectionStyle(ZestStyles.CONNECTIONS_DIRECTED);

		// populate the graph
		String label = null;
		for (ComDiagElement element : comDiag.getElements()) {
			if (element instanceof Lifeline) {
				label = element.getName();
				GraphNode n = new GraphNode(g, SWT.NONE, label);
				n.setBackgroundColor(ColorConstants.lightBlue);
				// figureListing.put(n.getText().toLowerCase(), n);
			}
		}
		for (ComDiagElement element : comDiag.getElements()) {
			if (element instanceof Message) {
				Message l = (Message) element;
				GraphConnection c = new GraphConnection(g, SWT.NONE,
						getNodeByLabel(l.getSource().getName(), g),
						getNodeByLabel(l.getTarget().getName(), g));
				c.setText(l.getName());
				// figureListing.put(c.getText().toLowerCase(), c);
			}

		}

		// g.addSelectionListener(new SelectionAdapter() {
		// public void widgetSelected(SelectionEvent e) {
		// System.out.println(((Graph) e.widget).getSelection());
		// }
		// });

		// g.addKeyListener(new KeyAdapter() {
		//
		// public void keyPressed(KeyEvent e) {
		// boolean complete = false;
		// if (e.keyCode == BACKSPACE) {
		// if (stringBuffer.length() > 0) {
		// stringBuffer.deleteCharAt(stringBuffer.length() - 1);
		// }
		// } else if (e.keyCode == ENTER) {
		// complete = true;
		// } else if ((e.character >= 'a' && e.character <= 'z')
		// || (e.character >= 'A' && e.character <= 'Z')
		// || (e.character == '.') || (e.character == '_')
		// || (e.character >= '0' && e.character <= '9')) {
		// stringBuffer.append(e.character);
		// }
		// System.err.println("0. figureListing.size:"
		// + figureListing.size());
		//
		// Iterator iterator = figureListing.keySet().iterator();
		// // store the matching items in a list
		// List matchingList = new ArrayList();
		// if (stringBuffer.length() > 0) {
		// while (iterator.hasNext()) {
		// String string = (String) iterator.next();
		// if (string.indexOf(stringBuffer.toString()
		// .toLowerCase()) >= 0) {
		// matchingList.add(figureListing.get(string));
		// }
		// }
		// }
		// GraphItem[] selectedItems = (GraphItem[]) matchingList
		// .toArray(new GraphItem[matchingList.size()]);
		// //g.setSelection(selectedItems);
		//
		// // hide the not selected items
		// Collection graphItems = figureListing.values();
		// System.err.println("0. figureListing.values.size:"
		// + graphItems.size());
		//
		// for (Object obj : graphItems) {
		// if (obj instanceof GraphNode) {
		// ((GraphNode) obj)
		// .setBackgroundColor(ColorConstants.white); //BUG ??
		// System.err
		// .println("SetBackround whithe:");
		// // ((GraphNode)obj).setVisible(false);
		//
		// }
		// // if(!list.contains(obj)){
		// // ((GraphItem)obj).setVisible(false);
		// // }
		// }
		//
		// if (complete && stringBuffer.length() > 0) {
		// stringBuffer.delete(0, stringBuffer.length());
		// }
		//
		// g.redraw();
		// }
		//
		// });
		// g.addPaintListener(new PaintListener() {
		// public void paintControl(PaintEvent e) {
		// e.gc.setFont(font);
		// e.gc.setClipping((Region) null);
		// e.gc.setForeground(ColorConstants.gray);
		// e.gc.drawText(stringBuffer.toString(), 50, 50, true);
		// }
		// });

	}

	@Deprecated
	private void ScenarioParticipant2Graph(Graph g2,
			ScenarioParticipant participant) {

		// use content and label provider:
		// http://wiki.eclipse.org/index.php/GEF_Zest_Visualization#Getting_Started

		// boucler sur les element et les representer avec Zest
		clearGraph(g);
		g.setLayoutAlgorithm(new SpringLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);
		for (Instance instance : participant.getInstances()) {
			String label = instance.getPid().getName();
			GraphNode n = new GraphNode(g, SWT.NONE, label);
			n.setBackgroundColor(ColorConstants.lightBlue);
		}

	}

	private void visualDiagnostic2Graph(Graph g,
			VisualDiagnostic visualDiagnostic) {

		// use content and label provider:
		// http://wiki.eclipse.org/index.php/GEF_Zest_Visualization#Getting_Started

		// boucler sur les element et les representer avec Zest

		clearGraph(g);
		g.setLayoutAlgorithm(new SpringLayoutAlgorithm(
				LayoutStyles.NO_LAYOUT_NODE_RESIZING), true);

		// System.err.println("visualDiagnostic.getFigures() size ="
		// + visualDiagnostic.getFigures().size());
		String label = null;
		for (Figure fig : visualDiagnostic.getFigures()) {
			label = fig.getName();
			if (fig.getType().equals("rectangle")) {
				GraphNode n = new GraphNode(g, SWT.NONE, label);
				// size sould be added to VisualDiagnostic.ecore
				n.setSize(80, 20);
				if (fig.getColor().equals("blue")) {
					n.setBackgroundColor(ColorConstants.lightBlue);
				} else if (fig.getColor().equals("gray")) {
					n.setBackgroundColor(ColorConstants.gray);
				} else if (fig.getColor().equals("green"))
					n.setBackgroundColor(ColorConstants.green);
			}

		}

		// new GraphConnection(g, SWT.NONE, n1, n2);

	}

	private void clearGraph(Graph g) {
		// remove all the connections
		Object[] objects = g.getConnections().toArray();
		for (int x = 0; x < objects.length; x++) {
			((GraphConnection) objects[x]).dispose();
		}
		// remove all the nodes
		objects = g.getNodes().toArray();
		for (int x = 0; x < objects.length; x++) {
			((GraphNode) objects[x]).dispose();
		}

	}

	@Override
	public void setFocus() {
	}
}
