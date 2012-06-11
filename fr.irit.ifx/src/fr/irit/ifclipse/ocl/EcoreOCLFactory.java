package fr.irit.ifclipse.ocl;

import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.examples.interpreter.console.DelegatingPackageRegistry;
import org.eclipse.ocl.examples.interpreter.console.IOCLFactory;
import org.eclipse.ocl.examples.interpreter.console.ModelingLevel;
import org.eclipse.ocl.examples.interpreter.console.TargetMetamodel;

public class EcoreOCLFactory implements IOCLFactory<Object> {

	private Resource resource;

	public EcoreOCLFactory(Resource r) {
		resource = r;

	}

	public TargetMetamodel getTargetMetamodel() {
		return TargetMetamodel.Ecore;
	}

	@SuppressWarnings("unchecked")
	public OCL<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> createOCL(ModelingLevel level) {
		return OCL.newInstance(new EcoreEnvironmentFactory(
				new DelegatingPackageRegistry(resource.getResourceSet()
						.getPackageRegistry(), EPackage.Registry.INSTANCE)));
		// return OCL.newInstance(new EcoreEnvironmentFactory(
		// new DelegatingPackageRegistry(context.eResource()
		// .getResourceSet().getPackageRegistry(),
		// EPackage.Registry.INSTANCE)));
	}

	@SuppressWarnings("unchecked")
	public OCL<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> createOCL(
			ModelingLevel level, Resource res) {

		return OCL.newInstance(new EcoreEnvironmentFactory(
				new DelegatingPackageRegistry(resource.getResourceSet()
						.getPackageRegistry(), EPackage.Registry.INSTANCE)),
				res);
	}

	public Object getContextClassifier(EObject object) {
		return object.eClass();
	}

	public String getName(Object modelElement) {
		return ((ENamedElement) modelElement).getName();
	}
}