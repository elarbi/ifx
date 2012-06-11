package fr.irit.ifclipse.injection;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.examples.interpreter.console.text.OCLDocument;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.model.OCLResourceEvaluator;
import fr.irit.ifclipse.views.IFClipseView;

public class EvalBeforeStrategy implements EvalStrategy {

	private IFClipseController controller;
	private EvalContext context;

	@Override
	public void execute() throws ParserException {
		// stopViews = getViewsWithStopCondition
		List<IFClipseView> stopViews = getViewsWithStopCondition();

		// trueOREs = getOres(stopViews) -> select(ore | ore instanceof Boolean
		// and ore.eval() == true)
		for (IFClipseView v : stopViews) {
			OCLResourceEvaluator ore = controller.getOclEvaluator(v);
			OCLDocument document = v.getDocument();
			// Resource inputModel = ore.getInputModel();
			// if (inputModel.getContents().size() > 0){//update the view
			// document ocl context
			// document.setOCLContext((EObject)
			// inputModel.getContents().get(0));
			// }
			Resource inputModel = ore.getInputModel();
			if (inputModel.getContents().size() > 0) {
				ore.setOclContext(ore.getInputModel().getContents().get(0))
						.setOclExpression(document.get().trim()).eval();
				Object result = ore.getResult();

				if (result instanceof Boolean) {
					if ((Boolean) result)
						context.getResults().add(ore);
				}
			}
		}

	}

	private List<IFClipseView> getViewsWithStopCondition() {
		List<IFClipseView> list = new ArrayList<IFClipseView>();
		for (IFClipseView view : controller.getViewOreBinding().keySet()) {
			OCLDocument document = view.getDocument();
			if (document.getLength() != 0) {
				list.add(view);
			}
		}
		return list;
	}

	@Override
	public void setController(IFClipseController controller) {
		this.controller = controller;

	}

	@Override
	public void setEvalContext(EvalContext evalContext) {
		context = evalContext;

	}

}
