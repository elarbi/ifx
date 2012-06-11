package fr.irit.ifclipse.injection;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;

public class UpdateContext implements InjectionContext {

	private UpdateImpactStrategy impactStrategy;

	public UpdateContext(UpdateImpactStrategy impactStrategy,
			IFClipseController ctlr) {
		super();
		this.impactStrategy = impactStrategy;
		impactStrategy.setController(ctlr);
	}

	public void update() throws UpdateException, EIFSimException {
		impactStrategy.execute();
	}

}
