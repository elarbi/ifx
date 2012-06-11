package fr.irit.ifclipse.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfig;
import fr.irit.ifclipse.metamodel.IFConfig.provider.IFConfigItemProviderAdapterFactory;

public class DynamicView extends IFClipseView {
	public static final String ID = "fr.irit.ifclipse.views.DynamicView";

	public DynamicView() {
		viewType = IFClipseView.DYNAMIC_VIEW;
		id = ID;
	}

	@Override
	public void refresh(Resource resource) {
		// populate the view with the result
		// adapterFactory.addAdapterFactory(controller.getItemProviderAdapterFactory(this));
		adapterFactory
				.addAdapterFactory(new IFConfigItemProviderAdapterFactory());
		if (resource.getContents().size() > 0) {
			EObject input = resource.getContents().get(0);
			if (input instanceof IFConfig)
				viewer.setInput(input);
		}
	}

}
