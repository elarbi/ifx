package fr.irit.ifclipse.injection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.ocl.ParserException;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.model.OCLResourceEvaluator;

public class EvalContext implements InjectionContext {

	EvalStrategy evalStrategy;
	List<OCLResourceEvaluator> results;

	public EvalContext(EvalStrategy evalStrategy, IFClipseController ctlr) {
		super();
		this.evalStrategy = evalStrategy;
		evalStrategy.setController(ctlr);
		evalStrategy.setEvalContext(this);
		results = new ArrayList<OCLResourceEvaluator>();
	}

	public List<OCLResourceEvaluator> eval() throws UpdateException {
		try {
			evalStrategy.execute();
		} catch (ParserException e) {
			throw new UpdateException(e.getMessage());
		}
		return results;

	}

	public void setResults(List<OCLResourceEvaluator> results) {
		this.results = results;
	}

	public List<OCLResourceEvaluator> getResults() {
		return results;
	}
}
