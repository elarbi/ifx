package fr.irit.ifclipse.atl;

import java.util.Collections;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.core.launch.ILauncher;
import org.eclipse.m2m.atl.engine.emfvm.ASM;
import org.eclipse.m2m.atl.engine.emfvm.launch.EMFVMLauncher;

public class AtlFacade {

	private AtlExecutionContext context;

	public AtlFacade(AtlExecutionContext context) {
		this.context = context;
	}

	public Resource evaluate(ASM asm, Resource sourceM) {
		EMFInjector injector = new EMFInjector();
		EMFVMLauncher emfVmLauncher = new EMFVMLauncher();
		emfVmLauncher.initialize(Collections.<String, Object> emptyMap());
		EMFModelFactory emfModelFactory = new EMFModelFactory();
		// inject source MM
		EMFReferenceModel sourceEmfMM = (EMFReferenceModel) emfModelFactory
				.newReferenceModel();
		injector.inject(sourceEmfMM, context.sourceMM);

		// inject target MM
		EMFReferenceModel targetEmfMM = (EMFReferenceModel) emfModelFactory
				.newReferenceModel();
		injector.inject(targetEmfMM, context.targetMM);

		// inject source M
		EMFModel sourceEmfM = (EMFModel) emfModelFactory.newModel(sourceEmfMM);
		injector.inject(sourceEmfM, sourceM);

		// load source M
		emfVmLauncher.addInModel(sourceEmfM, "IN", context.sourceMetamodelName);

		// create & load target M
		EMFModel targetM = (EMFModel) emfModelFactory.newModel(targetEmfMM);
		emfVmLauncher.addOutModel(targetM, "OUT", context.targetMetamodelName);

		emfVmLauncher.launch(ILauncher.RUN_MODE, new NullProgressMonitor(),
				Collections.<String, Object> emptyMap(), asm);

		return targetM.getResource();
	}
}
