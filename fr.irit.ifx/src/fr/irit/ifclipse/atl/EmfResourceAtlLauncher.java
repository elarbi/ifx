package fr.irit.ifclipse.atl;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.AtlLauncher;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;

/*
 * ATL launcher utility based on the AtlLauncher but takes EMF Resources instead of ASMModels as inputs and outputs.
 */
public class EmfResourceAtlLauncher {
	private AtlLauncher atlLauncher;
	private ModelLoader modelLoader;

	// should be set before lauch() call
	private URI sourceMetamodelUri;
	private URI targetMetamodelUri;
	private URI sourceModelUri;
	private InputStream sourceModelInputStream;
	private URL atlTransfo;

	public EmfResourceAtlLauncher() {
		atlLauncher = AtlLauncher.getDefault();
		AtlEMFModelHandler modelHandler = (AtlEMFModelHandler) AtlModelHandler
				.getDefault(AtlModelHandler.AMH_EMF);
		modelLoader = modelHandler.createModelLoader();
	}

	public Resource launch() {
		// TODO: ADD PARAMETERS: metamodel uURIs etc...
		Resource result = null;
		// TODO: consider using resourceSet instead of Map
		Map<String, Object> models = new HashMap<String, Object>();
		try {
			// metamodels loading
			ASMEMFModel IFConfigMM = (ASMEMFModel) modelLoader.loadModel(
					"IFConfig", modelLoader.getMOF(),
					sourceMetamodelUri.toString());
			ASMEMFModel UMLConfigMM;
			UMLConfigMM = (ASMEMFModel) modelLoader.loadModel("UMLConfig",
					modelLoader.getMOF(), targetMetamodelUri.toString());

			models.put("IFConfig", IFConfigMM);
			models.put("UMLConfig", UMLConfigMM);

			// source and target models loading
			ASMEMFModel UMLConfigOutputM = (ASMEMFModel) modelLoader.newModel(
					"OUT", "", UMLConfigMM);

			// TODO: use inputstream to load the model
			ASMEMFModel IFConfigInputM = (ASMEMFModel) modelLoader.loadModel(
					"IN", IFConfigMM, sourceModelUri.toString());

			models.put("IN", IFConfigInputM);
			models.put("OUT", UMLConfigOutputM);

			atlLauncher.launch(atlTransfo, Collections.EMPTY_MAP, models,
					Collections.EMPTY_MAP, Collections.EMPTY_LIST,
					Collections.EMPTY_MAP);
			result = UMLConfigOutputM.getExtent();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
