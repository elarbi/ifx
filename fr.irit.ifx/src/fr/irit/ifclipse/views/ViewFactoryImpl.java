package fr.irit.ifclipse.views;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ui.PartInitException;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.metamodel.IFConfig.provider.IFConfigItemProviderAdapterFactory;
import fr.irit.ifclipse.metamodel.Scenario.provider.ScenarioItemProviderAdapterFactory;

public class ViewFactoryImpl implements ViewFactory {

	@Override
	public IFClipseView createView(Resource observedResource) {

		IFClipseController controller = IFClipseController.getInstance();
		IFClipseView view = null;
		try {
			view = controller.getView(DynamicView.ID);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (view != null) {
			// TODO: the itemProviderAdapterFactory should be set depending on
			// the
			// metamodelUri param
			view.adapterFactory
					.addAdapterFactory(new IFConfigItemProviderAdapterFactory());
			view.adapterFactory
					.addAdapterFactory(new ScenarioItemProviderAdapterFactory());

		}

		return view;

	}
}
