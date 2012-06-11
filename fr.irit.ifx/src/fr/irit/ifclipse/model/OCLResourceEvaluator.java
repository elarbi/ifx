package fr.irit.ifclipse.model;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.examples.interpreter.console.IOCLFactory;
import org.eclipse.ocl.examples.interpreter.console.ModelingLevel;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;

import fr.irit.ifclipse.internal.l10n.Messages;
import fr.irit.ifclipse.ocl.EcoreOCLFactory;

public class OCLResourceEvaluator {
	private String oclExpression = "self"; //$NON-NLS-1$
	private Resource inputModel;
	private EObject oclContext;
	private Object result; // evaluation result
	private IOCLFactory<Object> oclFactory;
	private OCL<?, Object, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ocl;

	public OCLResourceEvaluator(Resource r) {
		inputModel = r;
	}

	public OCLResourceEvaluator eval() throws ParserException {

		oclFactory = new EcoreOCLFactory(inputModel);
		ocl = oclFactory.createOCL(ModelingLevel.M2);
		OCLHelper<Object, ?, ?, ?> helper = ocl.createOCLHelper();
		helper.setInstanceContext(oclContext);

		OCLExpression<Object> oclExpr = helper.createQuery(oclExpression);
		result = ocl.evaluate(oclContext, oclExpr);

		return this;

	}

	public Object getResult() {
		return result;
	}

	public Resource getInputModel() {
		return inputModel;
	}

	public OCLResourceEvaluator setInputModel(Resource r) {
		this.inputModel = r;
		return this;
	}

	public OCLResourceEvaluator setOclExpression(String oclExpression) {
		this.oclExpression = oclExpression;
		return this;
	}

	public OCLResourceEvaluator setOclContext(EObject context) {
		oclContext = context;
		return this;
	}

	public OCLResourceEvaluator initContext()
			throws OCLResourceEvaluatorException {
		if (inputModel.getContents().size() > 0) {
			oclContext = inputModel.getContents().get(0);
		} else {
			throw new OCLResourceEvaluatorException(
					Messages.OCLResourceEvaluator_model_empty);
		}
		return this;
	}

}
