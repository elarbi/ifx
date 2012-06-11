package fr.irit.ifclipse.transformer;

import java.net.URL;
import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;
import fr.irit.ifclipse.model.ModelRepo;

public class IF2UMLTransformer extends ResourceTransformer {

	private static final String TARGET_MM_NAME = "UMLConfig";
	private static final String SOURCE_MM_NAME = "IFConfig";
	private static final String TRAFO_MODULE_PATH = "resources/IFConfig2UMLConfig.asm";

	public IF2UMLTransformer() {
		URL trafoModuleURL = IF2UMLTransformer.class
				.getResource(TRAFO_MODULE_PATH);
		TransformerContext ctx = new TransformerContext(
				IFConfigPackage.eNS_URI, UMLConfigPackage.eNS_URI,
				SOURCE_MM_NAME, TARGET_MM_NAME, trafoModuleURL);
		targetModelNsUri = URI.createURI(ModelRepo.UMLCONFIG_MODEL_NS_URI);
		this.setContext(ctx);
	}

	@Deprecated
	@Override
	public void notifyChanged(Notification notification) {

		// TODO: refactoring wanted !
		// TODO: use AtlFacade.evaluate()

		if (notification.getEventType() == Notification.ADD
				|| notification.getEventType() == Notification.SET) {
			if (notification.getNotifier() instanceof Resource) {
				if (notification.getNotifier() instanceof Resource) {

					EMFInjector injector = new EMFInjector();
					emfVmLauncher = new EMFVMLauncher();
					emfVmLauncher.initialize(Collections
							.<String, Object> emptyMap());

					// load source MM
					EMFReferenceModel sourceMM = (EMFReferenceModel) emfModelFactory
							.newReferenceModel();
					injector.inject(sourceMM, EPackage.Registry.INSTANCE
							.getEPackage(context.sourceEPackageUri).eResource());

					// load target MM
					EMFReferenceModel targetMM = (EMFReferenceModel) emfModelFactory
							.newReferenceModel();
					injector.inject(targetMM, EPackage.Registry.INSTANCE
							.getEPackage(context.targetEPackageUri).eResource());

					// load source M
					EMFModel sourceM = (EMFModel) emfModelFactory
							.newModel(sourceMM);
					injector.inject(sourceM,
							(Resource) notification.getNotifier());
					emfVmLauncher.addInModel(sourceM, "IN",
							context.sourceMetamodelName);

					// load target M
					EMFModel targetM = (EMFModel) emfModelFactory
							.newModel(targetMM);

					emfVmLauncher.addOutModel(targetM, "OUT",
							context.targetMetamodelName);

					// launch the transfo
					emfVmLauncher.launch(ILauncher.RUN_MODE,
							new NullProgressMonitor(),
							Collections.<String, Object> emptyMap(),
							context.trafoModule);

					updateTargetResource(targetM);

				}
			}
		}
	}

}
