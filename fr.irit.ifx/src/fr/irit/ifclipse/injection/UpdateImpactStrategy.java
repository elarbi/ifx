package fr.irit.ifclipse.injection;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;

public interface UpdateImpactStrategy extends Strategy {

	void execute() throws EIFSimException;

	void setController(IFClipseController controller);

}
