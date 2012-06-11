package fr.irit.ifclipse.transformer;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.drivers.emf4atl.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.ASMXMLReader;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;

import fr.irit.ifclipse.controller.IFClipseController;

/*
 * listens to a resource update and perform a transformation for each update.
 */
public class ResourceTransformer extends AdapterImpl {

	protected IFClipseController controller;

	protected String sourceEPackageUri;
	protected String targetEPackageUri;

	// source and target metamodel names in the ATL ASM module
	protected String sourceMetamodelName;
	protected String targetMetamodelName;
	protected ASM trafoModule;

	protected ILauncher emfVmLauncher;
	protected ModelLoader modelLoader;
	protected EMFModelFactory emfModelFactory;

	protected TransformerContext context;

	protected URI targetModelNsUri;

	public ResourceTransformer() {
		controller = IFClipseController.getInstance();
		AtlEMFModelHandler modelHandler = (AtlEMFModelHandler) AtlModelHandler
				.getDefault(AtlModelHandler.AMH_EMF);
		modelLoader = modelHandler.createModelLoader();
		emfModelFactory = new EMFModelFactory();

	}

	public ResourceTransformer(TransformerContext ctx) {
		this();
		context = ctx;
	}

	public void setContext(TransformerContext context) {
		this.context = context;
	}

	public void setTargetModelNsUri(URI uri) {
		targetModelNsUri = uri;

	}

	@Deprecated
	/*
	 * use TransformerContext#buildTrafoASM instead
	 */
	protected void buildTrafoASM(URL trafoModuleURL) {
		try {
			trafoModule = new ASMXMLReader().read(new BufferedInputStream(
					trafoModuleURL.openStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void updateTargetResource(final EMFModel targetM) {
		EList<EObject> targetMContents = targetM.getResource().getContents();
		if (targetMContents.size() > 0) {
			controller.updateResource(targetModelNsUri, targetMContents.get(0));
		}
	}

	@Override
	public void notifyChanged(Notification notification) {

		// TODO: refactoring wanted !
		// TODO: use AtlFacade.evaluate()

		if (notification.getEventType() == Notification.ADD
				|| notification.getEventType() == Notification.SET) {
			if (notification.getNotifier() instanceof Resource) {
				if (notification.getNotifier() instanceof Resource) {

					// launch parameters
					Map<String, Object> parameters = new HashMap<String, Object>();
					parameters.put("allowInterModelReferences", Boolean.TRUE);
					EMFInjector injector = new EMFInjector();
					emfVmLauncher = new EMFVMLauncher();
					// emfVmLauncher.initialize(parameters);
					emfVmLauncher.initialize(Collections
							.<String, Object> emptyMap());

					// load source MM
					EMFReferenceModel sourceMM = (EMFReferenceModel) emfModelFactory
							.newReferenceModel();
					injector.inject(sourceMM, EPackage.Registry.INSTANCE
							.getEPackage(context.sourceEPackageUri).eResource());

					// load target MM
					// EMFReferenceModel targetMM = (EMFReferenceModel)
					// emfModelFactory
					// .newReferenceModel();
					// injector.inject(targetMM, EPackage.Registry.INSTANCE
					// .getEPackage(context.targetEPackageUri).eResource());

					// load source M
					EMFModel sourceM = (EMFModel) emfModelFactory
							.newModel(sourceMM);
					injector.inject(sourceM,
							(Resource) notification.getNotifier());
					emfVmLauncher.addInModel(sourceM, "IN",
							context.sourceMetamodelName);

					// load target M
					EMFModel targetM = (EMFModel) emfModelFactory
							.newModel(sourceMM);
					//
					// EMFModel targetM = (EMFModel) emfModelFactory
					// .newModel(sourceMM);

					emfVmLauncher.addOutModel(targetM, "OUT",
							context.targetMetamodelName);

					// launch the transfo
					emfVmLauncher.launch(ILauncher.RUN_MODE,
							new NullProgressMonitor(), parameters,
							context.trafoModule);

					updateTargetResource(targetM);

				}
			}
		}
	}

}