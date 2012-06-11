package fr.irit.ifclipse.injection;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfig;

/**
 * Update Enabled Transitions EMF resource.
 * 
 * @author Aboussoror El Arbi
 * 
 */
public class UpdateConfig extends UpdateImpactStrategyImpl {

	@Override
	public void execute() throws EIFSimException {
		// inject the getState xml string
		Resource ifConfigXML = injectXML(ctlr.getState());

		// update the ifconfig resource
		if (ifConfigXML.getContents().size() > 0) {
			IFConfig ifConfig = (IFConfig) ifConfigXML.getContents().get(0);
			ctlr.updateIFConfigRes(ifConfig);

		}
	}

	@Override
	public void setController(IFClipseController controller) {
		this.ctlr = controller;

	}

}
