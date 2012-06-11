package fr.irit.ifclipse.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig;
import fr.irit.ifclipse.metamodel.UMLConfig.provider.UMLConfigItemProviderAdapterFactory;

public class UMLConfigurationView extends IFClipseView {
	public static final String ID = "fr.irit.ifclipse.views.UMLConfigurationView";

	public UMLConfigurationView() {
		viewType = IFClipseView.UMLCONFIG_VIEW;
		id = ID;
		controller.bindView(this, controller.getUmlConfigORE());
	}

	@Override
	public void refresh(Resource resource) {
		adapterFactory
				.addAdapterFactory(new UMLConfigItemProviderAdapterFactory());
		if (resource.getContents().size() > 0) {
			EObject input = resource.getContents().get(0);
			if (input instanceof UMLConfig)
				viewer.setInput(input);
		}
	}
}
