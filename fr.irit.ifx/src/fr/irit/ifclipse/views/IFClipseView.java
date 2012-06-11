package fr.irit.ifclipse.views;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.examples.interpreter.console.IOCLFactory;
import org.eclipse.ocl.examples.interpreter.console.ModelingLevel;
import org.eclipse.ocl.examples.interpreter.console.OCLConsole;
import org.eclipse.ocl.examples.interpreter.console.OCLConsolePage;
import org.eclipse.ocl.examples.interpreter.console.text.ColorManager;
import org.eclipse.ocl.examples.interpreter.console.text.OCLDocument;
import org.eclipse.ocl.examples.interpreter.console.text.OCLSourceViewer;
import org.eclipse.ocl.examples.interpreter.internal.l10n.OCLInterpreterMessages;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;
import org.eclipse.ui.views.properties.PropertySheetPage;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.model.ModelRepo;
import fr.irit.ifclipse.ocl.EcoreOCLFactory;

public class IFClipseView extends ViewPart {

	public static final String ID = "fr.irit.ifclipse.views.IFClipseView";

	// view types

	public static final int IFCONFIG_VIEW = 1;
	public static final int UMLCONFIG_VIEW = 2;
	public static final int IFTRANSITIONS_VIEW = 3;
	public static final int SCENARIO_VIEW = 4;
	public static final int DIAGNOSTIC_VIEW = 5;
	public static final int DYNAMIC_VIEW = 6;

	protected Resource model;
	protected int viewType = -1;
	protected String id;
	protected TreeViewer viewer; // implements selectionProvider
	protected PropertySheetPage propertySheetPage;
	protected ComposedAdapterFactory adapterFactory;
	protected Adapter viewNotifier;
	private OCLSourceViewer input;
	private OCLDocument document;
	private OCLConsolePage oclConsolePage;
	private OCL<?, Object, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ocl;

	private ColorManager colorManager;
	protected IFClipseController controller;
	private IOCLFactory<Object> oclFactory;

	private Composite page;

	private OCLConsole oclConsole;

	public IFClipseView() {
		viewNotifier = new ViewNotifier();
		controller = IFClipseController.getInstance();
		oclConsole = OCLConsole.getInstance();
		document = new OCLDocument();

	}

	public String getId() {
		return id;
	}

	public int getViewType() {
		return viewType;
	}

	@Override
	/**
	 * This is a callback that will allow us to create the viewer and initialize
	 * it.
	 */
	public void createPartControl(Composite parent) {

		oclFactory = new EcoreOCLFactory(getModel());
		ocl = oclFactory.createOCL(ModelingLevel.M2);

		document.setOCLFactory(oclFactory);
		document.setModelingLevel(ModelingLevel.M2);

		page = new SashForm(parent, SWT.VERTICAL | SWT.LEFT_TO_RIGHT);

		viewer = new TreeViewer(page, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);

		adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		adapterFactory
				.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory
				.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		viewer.setContentProvider(new AdapterFactoryContentProvider(
				adapterFactory));
		viewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		getSite().setSelectionProvider(viewer);
		colorManager = new ColorManager();

		input = new OCLSourceViewer(page, colorManager, SWT.BORDER | SWT.MULTI);

		input.addTextListener(new ITextListener() {

			@Override
			public void textChanged(TextEvent event) {
				if (!document.get().isEmpty()) {
					controller.setDebugMode(true);
				} else {
					controller.setDebugMode(false);
				}

			}
		});

		input.setDocument(document);
		input.getTextWidget().addKeyListener(new InputKeyListener());
		((SashForm) page).setWeights(new int[] { 5, 1 });

		// document listens to viewer selection changed and update the OCL
		// context
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				ISelection selection = event.getSelection();
				if (selection instanceof StructuredSelection) {
					Object item = ((StructuredSelection) selection)
							.getFirstElement();
					if (item instanceof EObject) {
						document.setOCLContext((EObject) item);
					}
				}
			}
		});

	}

	@Deprecated
	// Should use emfResourceSet.getResource()
	public Resource getModel() {
		// return the model that populates the view
		// TODO: use controller getModel
		switch (viewType) {
		case IFCONFIG_VIEW:
			return controller.getIfConfigRes();
		case UMLCONFIG_VIEW:
			return controller.getUmlConfigRes();
		case IFTRANSITIONS_VIEW:
			return controller.getEnabledTransitionsRes();
		case SCENARIO_VIEW:
			return controller.getScenarioRes();
		case DIAGNOSTIC_VIEW:
			return controller.getVisualDRes();
		case DYNAMIC_VIEW: // TODO: the user should be able to choose the source
							// model and the target one
			return controller.getIfConfigRes();
		default:
			break;
		}
		return null;
	}

	// Should use emfResourceSet.getResource()
	public Resource getModel2() {
		// return the model that populates the view
		// TODO: use controller getModel
		ModelRepo modelRepo = controller.getModelRepo();
		switch (viewType) {
		case IFCONFIG_VIEW:
			return modelRepo.getModel(ModelRepo.IFCONFIG_MODEL_NS_URI);
		case UMLCONFIG_VIEW:
			return modelRepo.getModel(ModelRepo.UMLCONFIG_MODEL_NS_URI);
		case IFTRANSITIONS_VIEW:
			return modelRepo.getModel(ModelRepo.ENABLED_TRANS_MODEL_URI);
			// return controller.getEnabledTransitionsRes();
		case SCENARIO_VIEW:
			return modelRepo.getModel(ModelRepo.SCENARIO_MODEL_NS_URI);
		case DIAGNOSTIC_VIEW:
			return modelRepo.getModel(ModelRepo.VDIAGNOSTIC_MODEL_NS_URI);
		case DYNAMIC_VIEW: // FALSE !!
			return null;
			// return modelRepo.getModel(ModelRepo.DYNAMIC_MODEL_NS_URI);

		default:
			break;
		}
		return null;
	}

	@Override
	public Object getAdapter(Class adapter) {
		if (adapter.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		}
		return super.getAdapter(adapter);
	}

	public Adapter getViewNotifier() {
		return viewNotifier;
	}

	public void setViewNotifier(Adapter viewNotifier) {
		this.viewNotifier = viewNotifier;
	}

	private class ViewNotifier extends AdapterImpl {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getEventType() == Notification.ADD
					|| notification.getEventType() == Notification.SET) {
				if (notification.getNotifier() instanceof Resource) {
					// refresh the treeviewer
					// TODO: not optimized ? use a delta (see bookEclipse Eric
					// Gamma p. 349)
					Resource resource = (Resource) notification.getNotifier();
					refresh(resource);
					// refresh the ocl context
					if (!resource.getContents().isEmpty()) {
						document.setOCLContext(resource.getContents().get(0));
					} else {
						// not tested
						document.setOCLContext(null);
					}
				}
			}
		}
	}

	private Object evaluate(String expression, Resource resource) {

		Object result;
		try {
			result = controller.evaluate(expression, resource, this);
			print(expression, result);

			if (ocl.isInvalid(result)) {
				MessageDialog.openError(getSite().getShell(),
						"Invalid OCL expression", "OCL invalid");

			} else {
				return result;
			}

		} catch (ParserException e) {
			MessageDialog.openError(getSite().getShell(),
					"OCL expression error", e.getMessage());
			e.printStackTrace();
		}

		return null;
	}

	private void print(String expression, Object result) {
		oclConsolePage = oclConsole.getPage();
		IDocument doc = oclConsolePage.getDocument();
		oclConsolePage.setOcl(ocl);
		Color outputDefault = oclConsolePage.getColorManager().getColor(
				ColorManager.DEFAULT);
		Color outputResults = oclConsolePage.getColorManager().getColor(
				ColorManager.OUTPUT_RESULTS);

		if (doc.getLength() > 0) {
			// separate previous output by a blank line
			oclConsolePage.append("", outputDefault, false); //$NON-NLS-1$
		}
		oclConsolePage.append(OCLInterpreterMessages.console_evaluating,
				outputDefault, true);
		oclConsolePage.append(expression, outputDefault, false);
		oclConsolePage.append(OCLInterpreterMessages.console_results,
				outputDefault, true);

		// print the result
		oclConsolePage.print(result, outputResults, false);

	}

	public OCLDocument getDocument() {
		return document;
	}

	/**
	 * A key listener that listens for the Enter key to evaluate the OCL
	 * expression.
	 */
	private class InputKeyListener implements KeyListener {
		// private boolean evaluationSuccess = false;
		// private List<String> history = new ArrayList<String>();
		// private int currentHistoryPointer = 0;

		public void keyPressed(KeyEvent e) {
			switch (e.keyCode) {
			case SWT.CR:
				if (!input.isContentAssistActive()
						&& (e.stateMask & (SWT.CTRL | SWT.SHIFT)) == 0) {
					String text = document.get();
					String trim = text.trim();
					Object result = evaluate(trim, getModel());

					if (trim.isEmpty()) {
						// return the complete model
						if (getModel().getContents().size() > 0) {
							result = getModel().getContents().get(0);
							document.setOCLContext((EObject) result);
						}
					}
					viewer.setInput(result);
				}
				break;

			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			switch (e.keyCode) {
			case ' ':
				if ((e.stateMask & SWT.CTRL) == SWT.CTRL) {
					input.getContentAssistant().showPossibleCompletions();
				}
			}
		}

	}

	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage = new PropertySheetPage();

			propertySheetPage
					.setPropertySourceProvider(new AdapterFactoryContentProvider(
							adapterFactory));

		}
		return propertySheetPage;
	}

	/**
	 * Passing the focus request to the viewer's control.
	 */
	public void setFocus() {
		viewer.getControl().setFocus();
	}

	public void refresh(Resource resource) {

	}

	// Sets the ocl context of the ocl query source viewer
	public void setOCLContext(Resource res) {
		if (res.getContents().size() > 0)
			document.setOCLContext(res.getContents().get(0));
	}

	@Override
	public void dispose() {
		super.dispose();
		controller.unbindView(this);
	}

	public TreeViewer getViewer() {
		return viewer;
	}

}
