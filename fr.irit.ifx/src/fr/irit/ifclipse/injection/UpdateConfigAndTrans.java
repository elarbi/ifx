package fr.irit.ifclipse.injection;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;
import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfig;

public class UpdateConfigAndTrans extends UpdateImpactStrategyImpl {

	@Override
	public void setController(IFClipseController controller) {
		ctlr = controller;
	}

	@Override
	public void execute() throws EIFSimException {
		// inject the getState xml string
		Resource ifConfigXML = injectXML(ctlr.getState());

		// update the ifconfig resource
		if (ifConfigXML.getContents().size() > 0) {
			IFConfig ifConfig = (IFConfig) ifConfigXML.getContents().get(0);
			ctlr.updateIFConfigRes(ifConfig);

		}

		// inject the tansitionList xml string
		Resource transitionsXML = injectXML(ctlr.getListTransition());

		// update the enabledTransitions Resource
		if (transitionsXML.getContents().size() > 0) {
			EnabledTransitions enTransitions = (EnabledTransitions) transitionsXML
					.getContents().get(0);
			ctlr.updateEnabledTransitionsRes(enTransitions);
		}

	}

}
