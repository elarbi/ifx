package fr.irit.ifclipse.injection;

import org.eclipse.ocl.ParserException;

import fr.irit.ifclipse.controller.IFClipseController;

public interface EvalStrategy extends Strategy {

	void execute() throws ParserException;

	void setController(IFClipseController controller);

	void setEvalContext(EvalContext evalContext);

}
