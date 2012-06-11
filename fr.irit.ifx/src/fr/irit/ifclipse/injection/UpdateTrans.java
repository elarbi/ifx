package fr.irit.ifclipse.injection;

import org.eclipse.emf.ecore.resource.Resource;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;
import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;

/**
 * Update Enabled Transitions EMF resource.
 * 
 * @author ElArbi
 * 
 */
public class UpdateTrans extends UpdateImpactStrategyImpl {

	@Override
	public void execute() throws EIFSimException {
		// inject theLisxml string
		Resource transitionsXML = injectXML(ctlr.getListTransition());

		// update the enabledTransitions Resource
		if (transitionsXML.getContents().size() > 0) {
			EnabledTransitions enTransitions = (EnabledTransitions) transitionsXML
					.getContents().get(0);
			ctlr.updateEnabledTransitionsRes(enTransitions);
		}

	}

	@Override
	public void setController(IFClipseController controller) {
		this.ctlr = controller;

	}

}
