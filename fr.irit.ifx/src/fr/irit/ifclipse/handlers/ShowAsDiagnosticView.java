package fr.irit.ifclipse.handlers;

import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.irit.ifclipse.views.ZestView;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;

public class ShowAsDiagnosticView extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		// load the xmi file
		// get the selected XMI file
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil
				.getCurrentSelectionChecked(event);
		System.err.println(selection);
		IResource xmiResource = (IResource) selection.getFirstElement();

		Resource resource = null;
		if (xmiResource.getType() == IResource.FILE) {
			String path = xmiResource.getLocationURI().toString();
			System.err.println("path" + path);
			resource = load(path);
		}
		// launch the appropriate zest interpreter for the selected file
		if (resource == null)
			return null;

		// IFClipseController ctrl = IFClipseController.getInstance();
		// DiagnosticView diagnosticView;
		ZestView zestView;
		try {
			// ZestView is not yet integrated to IFclipse as a IFClipseView
			// zestView = (ZestView) ctrl.getView(ZestView.ID);

			IWorkbenchWindow activeWorkbenchWindow = PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow();
			zestView = (ZestView) activeWorkbenchWindow.getActivePage()
					.showView(ZestView.ID);
			zestView.refresh(resource);

		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public Resource load(String uri) {
		// Initialize the model
		ScenarioParticipantPackage.eINSTANCE.eClass();

		// Register the XMI resource factory for the .website extension

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("scenarioparticipant", new XMIResourceFactoryImpl());

		// Obtain a new resource set
		ResourceSet resSet = new ResourceSetImpl();

		// Get the resource
		Resource resource = resSet.getResource(URI.createURI(uri), true);
		return resource;
	}

}
