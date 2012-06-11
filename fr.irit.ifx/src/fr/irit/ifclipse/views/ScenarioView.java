package fr.irit.ifclipse.views;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;

import fr.irit.ifclipse.metamodel.Scenario.provider.ScenarioItemProviderAdapterFactory;

public class ScenarioView extends IFClipseView {

	public static final String ID = "fr.irit.ifclipse.views.ScenarioView";

	public ScenarioView() {
		viewType = IFClipseView.SCENARIO_VIEW;
		id = ID;
		controller.bindView(this, controller.getScenarioORE());
	}

	@Override
	public void refresh(Resource resource) {
		// 1. show the view

		try {
			PlatformUI.getWorkbench().getActiveWorkbenchWindow()
					.getActivePage().showView(ID);

		} catch (PartInitException e) {
			MessageDialog.openError(getViewSite().getShell(), "Error",
					e.getMessage());
			e.printStackTrace();
		}
		// 2. populate the view with the result
		adapterFactory
				.addAdapterFactory(new ScenarioItemProviderAdapterFactory());
		viewer.setInput(resource);
	}

}
