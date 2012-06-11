package fr.irit.ifclipse.actions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.metamodel.Scenario.Scenario;
import fr.irit.ifclipse.model.ModelRepo;
import fr.irit.ifclipse.views.IFClipseView;
import fr.irit.ifclipse.views.ScenarioView;
import fr.irit.ifclipse.xml.injector.ScenarioXMLInjector;
import fr.irit.ifclipse.xml.injector.ScenarioXMLInjectorImpl;

public class LoadScenario implements IWorkbenchWindowActionDelegate {
	private IWorkbenchWindow window;
	private String sourceFilePath = "";
	private IFClipseController controller;

	@Override
	public void run(IAction action) {
		// open file browser, look for XML file
		IPath path = browse(getSourceLocation(), false);
		if (path == null)
			MessageDialog.openError(window.getShell(), "Path", "Invalid path");

		// IPath rootLoc =
		// ResourcesPlugin.getWorkspace().getRoot().getLocation();
		// if (rootLoc.isPrefixOf(path))
		// path = path.setDevice(null).removeFirstSegments(
		// rootLoc.segmentCount());
		sourceFilePath = path.toString();
		// inject the XML to Scenario.ecore model
		ScenarioXMLInjector injector = new ScenarioXMLInjectorImpl();
		InputStream inStream = null;
		try {
			inStream = new FileInputStream(sourceFilePath);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (inStream == null)
			MessageDialog.openError(window.getShell(), "File error",
					"Could not open path: " + sourceFilePath);

		Resource scenarioXML = injector.inject(inStream);
		System.err.println("XML Scenario file injected !");

		if (scenarioXML.getContents().size() > 0) {
			Scenario scenario = (Scenario) scenarioXML.getContents().get(0);
			// controller.updateScenarioRes(scenario);
			controller.updateResource(
					ModelRepo.createURI(ModelRepo.SCENARIO_MODEL_NS_URI),
					scenario);

			try {
				IFClipseView view = controller.getView(ScenarioView.ID);
				view.setOCLContext(controller.getScenarioRes());
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private IPath browse(IPath path, boolean mustExist) {
		FileDialog dialog = new FileDialog(window.getShell(),
				mustExist ? SWT.OPEN : SWT.SAVE);
		if (path != null) {
			if (path.segmentCount() > 1)
				dialog.setFilterPath(path.removeLastSegments(1).toOSString());
			if (path.segmentCount() > 0)
				dialog.setFileName(path.lastSegment());
		}
		String result = dialog.open();
		if (result == null)
			return null;
		return new Path(result);
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	/**
	 * Answer the source file location or <code>null</code> if unspecified
	 */
	public IPath getSourceLocation() {
		String text = sourceFilePath.trim();
		if (text.length() == 0)
			return null;
		IPath path = new Path(text);
		if (!path.isAbsolute())
			path = ResourcesPlugin.getWorkspace().getRoot().getLocation()
					.append(path);
		return path;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
		controller = IFClipseController.getInstance();
	}

}
