package fr.irit.ifclipse.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfig;
import fr.irit.ifclipse.metamodel.IFConfig.provider.IFConfigItemProviderAdapterFactory;

public class IFConfigurationView extends IFClipseView {

	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.irit.ifclipse.views.IFConfigurationView";

	/**
	 * The constructor.
	 */
	public IFConfigurationView() {
		viewType = IFClipseView.IFCONFIG_VIEW;
		id = ID;
		controller.bindView(this, controller.getIfConfigORE());
	}

	@Override
	public void refresh(Resource resource) {
		// populate the view with the result
		adapterFactory
				.addAdapterFactory(new IFConfigItemProviderAdapterFactory());
		if (resource.getContents().size() > 0) {
			EObject input = resource.getContents().get(0);
			if (input instanceof IFConfig)
				viewer.setInput(input);
		}
	}
}