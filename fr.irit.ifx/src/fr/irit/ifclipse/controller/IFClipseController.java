package fr.irit.ifclipse.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.StatusLineManager;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.examples.interpreter.console.OCLConsoleFactory;
import org.eclipse.ocl.examples.interpreter.console.text.OCLDocument;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleFactory;
import org.eclipse.ui.internal.WorkbenchWindow;

import fr.irit.ifclipse.actions.StatusLineContribution;
import fr.irit.ifclipse.legacy.simlibrary.CIFSimProxy;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;
import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfig;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.Transition;
import fr.irit.ifclipse.metamodel.Scenario.Scenario;
import fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic;
import fr.irit.ifclipse.model.ModelRepo;
import fr.irit.ifclipse.model.OCLResourceEvaluator;
import fr.irit.ifclipse.transformer.IF2UMLTransformer;
import fr.irit.ifclipse.transformer.IF2VDTransformer;
import fr.irit.ifclipse.transformer.ResourceTransformer;
import fr.irit.ifclipse.transformer.TransformerContext;
import fr.irit.ifclipse.views.IFClipseView;
import fr.irit.ifclipse.views.ViewFactory;
import fr.irit.ifclipse.views.ViewFactoryImpl;
import fr.irit.ifclipse.xml.injector.IFConfigurationXMLInjector;
import fr.irit.ifclipse.xml.injector.IFConfigurationXMLInjectorImpl;

public class IFClipseController {

	private static IFClipseController instance;
	private IFConfigurationXMLInjector injector;
	private CIFSimProxy simProxy;
	private IWorkbenchWindow workbenchWindow;

	private ModelRepo modelRepo;
	private String server;
	private int port;
	private ResourceSet emfResourceSet;

	// TODO: use a ORERepository
	private OCLResourceEvaluator ifConfigORE;
	private OCLResourceEvaluator enabledTransitionsORE;
	private OCLResourceEvaluator umlConfigORE;
	private OCLResourceEvaluator scenarioORE;
	private OCLResourceEvaluator visualDiagORE;

	private ArrayList<String> viewIDs;

	// isDebugMode() => interpreting the OCL queries as a stop condition
	private boolean debugMode; // TODO: use bits instead of boolean if faster

	private BindingContext<IFClipseView, OCLResourceEvaluator> viewOreBinding;

	public void setWorkbenchWindow(IWorkbenchWindow workbenchWindow) {
		this.workbenchWindow = workbenchWindow;
	}

	public static synchronized IFClipseController getInstance() {
		if (instance == null)
			instance = new IFClipseController();
		return instance;
	}

	private IFClipseController() {

		debugMode = false;
		injector = new IFConfigurationXMLInjectorImpl();
		simProxy = CIFSimProxy.getInstance();
		emfResourceSet = new ResourceSetImpl();
		modelRepo = new ModelRepo(emfResourceSet);
		viewOreBinding = new BindingContext<IFClipseView, OCLResourceEvaluator>();

		// ifConfigORE = new OCLResourceEvaluator(
		// emfResourceSet.createResource(ifconfigUri));

		ifConfigORE = new OCLResourceEvaluator(
				modelRepo.newModel(ModelRepo.IFCONFIG_MODEL_NS_URI));
		enabledTransitionsORE = new OCLResourceEvaluator(modelRepo.newModel(URI
				.createURI(ModelRepo.ENABLED_TRANS_MODEL_URI)));
		umlConfigORE = new OCLResourceEvaluator(modelRepo.newModel(URI
				.createURI(ModelRepo.UMLCONFIG_MODEL_NS_URI)));
		scenarioORE = new OCLResourceEvaluator(modelRepo.newModel(URI
				.createURI(ModelRepo.SCENARIO_MODEL_NS_URI)));
		visualDiagORE = new OCLResourceEvaluator(modelRepo.newModel(URI
				.createURI(ModelRepo.VDIAGNOSTIC_MODEL_NS_URI)));

		viewIDs = new ArrayList<String>();

		IConsoleFactory factory = new OCLConsoleFactory();
		factory.openConsole();
	}

	public IFConfigurationXMLInjector getInjector() {
		return injector;
	}

	public OCLResourceEvaluator getIfConfigORE() {
		return ifConfigORE;
	}

	public OCLResourceEvaluator getEnabledTransitionsORE() {
		return enabledTransitionsORE;
	}

	public OCLResourceEvaluator getUmlConfigORE() {
		return umlConfigORE;
	}

	public OCLResourceEvaluator getScenarioORE() {
		return scenarioORE;
	}

	public OCLResourceEvaluator getVisualDiagORE() {
		return visualDiagORE;
	}

	public void setDebugMode(boolean debugMode) {
		this.debugMode = debugMode;
	}

	public void registerView(String viewId) {
		viewIDs.add(viewId);
	}

	public void initTransformerNotifiers() {
		Resource ifConfigResource = ifConfigORE.getInputModel();
		ifConfigResource.eAdapters().add(new IF2UMLTransformer());
		ifConfigResource.eAdapters().add(new IF2VDTransformer());
	}

	public void initViewNotifiers() {
		for (IFClipseView view : viewOreBinding.keySet()) {
			getModel(view).eAdapters().add(view.getViewNotifier());
			// view.getModel().eAdapters().add(view.getViewNotifier());
		}
	}

	public void connectToSimulator() throws UnknownHostException,
			SecurityException, IOException, EIFSimException {
		simProxy.Connect(server, port);
	}

	public void initializeSimulator() throws EIFSimException {
		simProxy.Init();
	}

	public void fire(int trno) throws EIFSimException {
		simProxy.Fire(trno);
	}

	public void redo() throws EIFSimException {
		simProxy.Redo();
	}

	public void undo() throws EIFSimException {
		simProxy.Undo();
	}

	public String getState() throws EIFSimException {
		return simProxy.GetStateString();
	}

	public String getListTransition() throws EIFSimException {
		return simProxy.ListTransitionsString();
	}

	public void injectConfigAndTrans() throws EIFSimException {
		// inject the getState xml string
		Resource ifConfigXML = injector.inject(new ByteArrayInputStream(
				getState().getBytes()));

		// update the ifconfig resource
		if (ifConfigXML.getContents().size() > 0) {
			IFConfig ifConfig = (IFConfig) ifConfigXML.getContents().get(0);
			updateIFConfigRes(ifConfig);

		}

		// inject the tansitionList xml string
		Resource transitionsXML = injector.inject(new ByteArrayInputStream(
				getListTransition().getBytes()));

		// update the enabledTransitions Resource
		if (transitionsXML.getContents().size() > 0) {
			EnabledTransitions enTransitions = (EnabledTransitions) transitionsXML
					.getContents().get(0);
			updateEnabledTransitionsRes(enTransitions);
		}

		statusLineRefresh();
		updateActionStatus();
	}

	/**
	 * use UpdateStategy instead.
	 */
	@Deprecated
	public void injectEnabledTrans() throws EIFSimException {

		// inject theLisxml string
		Resource transitionsXML = injector.inject(new ByteArrayInputStream(
				getListTransition().getBytes()));

		// update the enabledTransitions Resource
		if (transitionsXML.getContents().size() > 0) {
			EnabledTransitions enTransitions = (EnabledTransitions) transitionsXML
					.getContents().get(0);
			updateEnabledTransitionsRes(enTransitions);
		}
		statusLineRefresh();
		// updateActionsStatus();

	}

	public void updateActionStatus() {
		// Display.getDefault().syncExec(new Runnable() {
		// public void run() {
		IWorkbench workbench = PlatformUI.getWorkbench();
		Menu menubar = workbench.getActiveWorkbenchWindow().getShell()
				.getMenuBar();
		if (menubar == null) {
			return;
		}
		MenuItem[] mItems = menubar.getItems();
		if (mItems == null) {
			return;
		}
		int index = -1;
		for (int i = 0; i < mItems.length; i++) {
			if (mItems[i].getText().equals("Sim&ulate"))
				index = i;
		}
		if (index == -1)
			return;
		Object menuData = mItems[index].getData();
		if (menuData instanceof SubContributionItem) {
			SubContributionItem scItem = (SubContributionItem) menuData;
			IContributionItem innerItem = scItem.getInnerItem();
			if (innerItem instanceof MenuManager) {
				MenuManager mM = (MenuManager) innerItem;

				for (IContributionItem item : mM.getItems()) {
					if (item instanceof SubContributionItem) {
						SubContributionItem cItem = (SubContributionItem) item;
						IContributionItem consItem = cItem.getInnerItem();
						if (consItem instanceof ActionContributionItem) {
							ActionContributionItem acItem = (ActionContributionItem) consItem;
							String id = acItem.getId();
							if ((id != null)) {
								// re-init the system
								if (id.contains("reInitSystem")
										|| id.contains("gotoStep")) {
									acItem.getAction().setEnabled(
											simProxy.isConnected());
								}
								// Undo & Rewind
								if (id.contains("undo")
										|| id.contains("rewind")) {
									acItem.getAction()
											.setEnabled(
													simProxy.isConnected()
															&& simProxy
																	.getScenarioCurrent() > 0);
								}

								// Redo & Replay
								if (id.contains("redo")
										|| id.contains("replay")) {
									acItem.getAction()
											.setEnabled(
													simProxy.isConnected()
															&& simProxy
																	.getScenarioCurrent() < simProxy
																	.getScenarioMax());
								}
								// Start Random walk
								if (id.contains("startRandomWalk")) {
									acItem.getAction()
											.setEnabled(
													simProxy.isConnected()
															&& simProxy
																	.getScenarioCurrent() >= 0);
								}
							}
						}

					}
				}
			}
		}
	}

	@SuppressWarnings("restriction")
	public void statusLineRefresh() {

		IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		;
		if (activeWorkbenchWindow instanceof WorkbenchWindow) {
			WorkbenchWindow window = (WorkbenchWindow) activeWorkbenchWindow;
			IStatusLineManager slm = window.getStatusLineManager();
			// Status Line message update
			String message = "Connection: "
					+ port
					+ "@"
					+ server
					+ " -- Step: "
					+ (simProxy.getScenarioCurrent() == -1 ? "none" : Integer
							.toString(simProxy.getScenarioCurrent()))
					+ "/"
					+ (simProxy.getScenarioMax() == -1 ? "none" : Integer
							.toString(simProxy.getScenarioMax()));
			// slm.setMessage(message);
			StatusLineContribution statusLineContrib = new StatusLineContribution(
					"statusLine", 50);
			statusLineContrib.setText(message);
			slm.remove("statusLine");
			slm.appendToGroup(StatusLineManager.BEGIN_GROUP, statusLineContrib);
			slm.update(true);
			// slm.add(statusLineContrib);

		}
	}

	public IFClipseView getView(String viewId) throws PartInitException {
		return (IFClipseView) workbenchWindow.getActivePage().showView(viewId);

	}

	// TODO: use EcoreUtil.copyAll(contents) instead of add and set and
	// notification.getEventType...
	public void updateResource(URI nsURI, EObject resource) {
		Resource resourceToUpdate = modelRepo.getModel(nsURI.toString());
		EList<EObject> contents = resourceToUpdate.getContents();
		if (contents.size() == 0) {
			contents.add(resource);
		} else if (contents.size() > 0) {
			contents.set(0, resource);
		}
	}

	@Deprecated
	public void updateUMLConfigRes(UMLConfig umlconfig) {
		EList<EObject> contents = umlConfigORE.getInputModel().getContents();
		if (contents.size() == 0) {
			contents.add(umlconfig);
		} else if (contents.size() > 0) {
			contents.set(0, umlconfig);
		}
	}

	@Deprecated
	public void updateIFConfigRes(IFConfig ifConfig) {
		EList<EObject> contents = ifConfigORE.getInputModel().getContents();
		if (contents.size() == 0) {
			contents.add(ifConfig);
		} else if (contents.size() > 0) {
			contents.set(0, ifConfig);
		}

	}

	@Deprecated
	public void updateEnabledTransitionsRes(EnabledTransitions enTransitions) {
		EList<EObject> contents = enabledTransitionsORE.getInputModel()
				.getContents();
		if (contents.size() == 0) {
			contents.add(enTransitions);
		} else if (contents.size() > 0) {
			contents.set(0, enTransitions);
		}

	}

	@Deprecated
	public void updateScenarioRes(Scenario scenario) {
		EList<EObject> contents = scenarioORE.getInputModel().getContents();
		if (contents.size() == 0) {
			contents.add(scenario);
		} else if (contents.size() > 0) {
			contents.set(0, scenario);
		}

	}

	@Deprecated
	public void updateVisualDRes(VisualDiagnostic visualD) {
		EList<EObject> contents = visualDiagORE.getInputModel().getContents();
		if (contents.size() == 0) {
			contents.add(visualD);
		} else if (contents.size() > 0) {
			contents.set(0, visualD);
		}

	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void playScenario(Scenario scenario) throws EIFSimException {
		System.err.println("scenario.getFiredTransitions().size(): "
				+ scenario.getFiredTransitions().size());

		initializeSimulator();

		for (Transition scenarioTrans : scenario.getFiredTransitions()) {
			injectEnabledTrans(); // insure that the enabledTransitionsRes is up
									// to
			// date
			if (enabledTransitionsORE.getInputModel().getContents().isEmpty())
				return;
			EObject eObject = enabledTransitionsORE.getInputModel()
					.getContents().get(0);
			if (eObject instanceof EnabledTransitions) {

				EnabledTransitions enabledTrans = (EnabledTransitions) eObject;
				int transIndex = getIndexOfScenarioTransIn(scenarioTrans,
						enabledTrans);
				if (transIndex != -1) {
					simProxy.Fire(transIndex);
					System.err.println("simProxy.Fire(transIndex): "
							+ transIndex);
				}

			}
		}

		injectConfigAndTrans();
		updateActionStatus();
	}

	private int getIndexOfScenarioTransIn(Transition scenarioTrans,
			EnabledTransitions enabledTransitions) {
		int index = -1;
		for (EObject eObj : enabledTransitions.getEnabledTransitions()) {
			index++;
			Transition tr = (Transition) eObj;
			// normally the numbers are not equals so we need to make them equal
			// before the comparison:
			tr.setNumber(scenarioTrans.getNumber());
			if (EcoreUtil.equals(tr, scenarioTrans))
				return index;
		}
		return -1;
	}

	public void rewind() throws EIFSimException {
		simProxy.Rewind();

	}

	public void replay() throws EIFSimException {
		simProxy.Replay();

	}

	public Resource getIfConfigRes() {
		return ifConfigORE.getInputModel();
	}

	public Resource getEnabledTransitionsRes() {
		return enabledTransitionsORE.getInputModel();
	}

	public Resource getUmlConfigRes() {
		return umlConfigORE.getInputModel();
	}

	public Resource getScenarioRes() {
		return scenarioORE.getInputModel();
	}

	public Resource getVisualDRes() {
		return visualDiagORE.getInputModel();
	}

	public boolean isDebugMode() {
		return debugMode;
	}

	public Object evaluate(String expr, Resource resource, IFClipseView view)
			throws ParserException {

		OCLDocument document = view.getDocument();
		EObject documentContext = document.getOCLContext();
		// if (documentContext == null) {
		// if (resource.getContents().size() > 0) {
		// System.err.println("Context not inialized!!");
		// document.setOCLContext(resource.getContents().get(0));
		// }
		//
		// }
		OCLResourceEvaluator ore = getOclEvaluator(view);
		ore.setOclExpression(expr).setOclContext(documentContext).eval();

		return ore.getResult();

	}

	public OCLResourceEvaluator getOclEvaluator(IFClipseView view) {
		return viewOreBinding.get(view);
	}

	public List<IFClipseView> getViews(OCLResourceEvaluator ore) {
		List<IFClipseView> result = new ArrayList<IFClipseView>();

		for (IFClipseView view : viewOreBinding.keySet()) {
			if (viewOreBinding.get(view).equals(ore))
				result.add(view);
		}
		return result;

	}

	public Resource getModel(IFClipseView view) {
		// return the model that populates the view
		return getOclEvaluator(view).getInputModel();
	}

	public void bindView(IFClipseView view, OCLResourceEvaluator ore) {
		viewOreBinding.put(view, ore);

	}

	public BindingContext<IFClipseView, OCLResourceEvaluator> getViewOreBinding() {
		return viewOreBinding;
	}

	public void unbindView(IFClipseView view) {
		viewOreBinding.remove(view);
	}

	public IFClipseView getView(OCLResourceEvaluator ore) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param resource
	 *            the ASM of the ATL transformation
	 * @param metamodelURI
	 *            the source metamodel of the ATL transformation
	 * @return the newly created view
	 */
	public IFClipseView createView(final IResource resource,
			final String metamodelURI) {

		if (!resource.exists()) {
			// the ASM resource is not in the workspace
			MessageDialog
					.openError(PlatformUI.getWorkbench()
							.getActiveWorkbenchWindow().getShell(),
							"Creating dynamic view error",
							"resource not in the workspace, please refresh the resource");
			return null;
		}

		// create a new resource and an OCL Resouce evaluator
		Resource dynamicRes = modelRepo.newModel(URI.createURI(metamodelURI
				+ ModelRepo.DYNAMIC_MODEL_SUFFIX));
		OCLResourceEvaluator dynamicORE = new OCLResourceEvaluator(dynamicRes);

		// create a resource transfomer from the selected ASM file
		URL asmURL = null;
		try {
			asmURL = resource.getLocationURI().toURL();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// get the source metamodel choice
		String packageName = null;

		if (metamodelURI.equals(IFConfigPackage.eNS_URI)) {
			packageName = "IFConfig";
		} else if (metamodelURI.equals(ScenarioPackage.eNS_URI)) {
			packageName = "Scenario";

		}

		// create the resource transformer
		TransformerContext ctx = new TransformerContext(metamodelURI,
				metamodelURI, packageName, packageName + "2", asmURL);
		// replace by: TransformerContext ctx =
		// TransformerContext.getDefaultIFConfigContext(asmURL);

		// // create the resource transformer
		// TransformerContext ctx = new TransformerContext(metamodelURI,
		// metamodelURI, packageName, packageName+"2", asmURL);
		// + change ATL header: create OUT : IFConfig2 from IN : IFConfig;

		ResourceTransformer resourceTransformer = new ResourceTransformer(ctx);
		resourceTransformer.setTargetModelNsUri(dynamicRes.getURI());

		// make the transformer listens to the resource change
		Resource sourceModel = modelRepo.getModel(metamodelURI
				+ ModelRepo.MODEL_SUFFIX);
		sourceModel.eAdapters().add(resourceTransformer);

		ViewFactory factory = new ViewFactoryImpl();

		IFClipseView newView = factory.createView(dynamicORE.getInputModel());

		// bindView to its ORE
		bindView(newView, dynamicORE);

		// make the view listen to the new resource
		// re-init the view notifier (optimization required since it'll loop
		// on viewOreBinding.keySet()
		// for already binded views....)
		initViewNotifiers();

		return newView;

	}

	public ResourceSet getEmfResouceSet() {
		return emfResourceSet;
	}

	public ModelRepo getModelRepo() {
		return modelRepo;
	}
}
