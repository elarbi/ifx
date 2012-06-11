package fr.irit.ifclipse.injection;

import fr.irit.ifclipse.controller.IFClipseController;

public class NoEvalStrategy implements EvalStrategy {

	private EvalContext context;

	@Override
	public void execute() {
		// nothing to do

	}

	@Override
	public void setController(IFClipseController controller) {
	}

	@Override
	public void setEvalContext(EvalContext evalContext) {
		context = evalContext;

	}

}
