package fr.irit.ifclipse.xml.injector;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.m2m.atl.core.emf.EMFExtractor;
import org.eclipse.m2m.atl.core.emf.EMFInjector;
import org.eclipse.m2m.atl.core.emf.EMFModel;
import org.eclipse.m2m.atl.core.emf.EMFModelFactory;
import org.eclipse.m2m.atl.core.emf.EMFReferenceModel;
import org.eclipse.m2m.atl.drivers.emf4atl.ASMEMFModel;
import org.eclipse.m2m.atl.drivers.emf4atl.AtlEMFModelHandler;
import org.eclipse.m2m.atl.engine.vm.AtlLauncher;
import org.eclipse.m2m.atl.engine.vm.AtlModelHandler;
import org.eclipse.m2m.atl.engine.vm.ModelLoader;
import org.eclipse.m2m.atl.projectors.xml.XMLInjector;

public class ScenarioXMLInjectorImpl implements ScenarioXMLInjector {
	private AtlEMFModelHandler modelHandler;
	private ModelLoader modelLoader;

	private static final String XML_ECORE_PATH = "org.eclipse.m2m.atl.projectors.xml/src/org/eclipse/m2m/atl/projectors/xml/resources/XML.ecore";
	private EMFModelFactory emfModelFactory;
	private ASMEMFModel XMLMetamodel;
	private ASMEMFModel scenarioMM;
	private URI XML_ecoreURI;
	private URI scenario_NS_URI;
	private URL XML2ScenarioTransformation_PATH;

	@Override
	public Resource inject(InputStream sourceXML) {
		// load the MetaM and M
		createResources();
		Resource result = null;

		EMFInjector emfInjector = new EMFInjector();
		try {
			emfModelFactory = new EMFModelFactory();
			EMFReferenceModel XMLReferenceModel = (EMFReferenceModel) emfModelFactory
					.newReferenceModel();
			emfInjector.inject(XMLReferenceModel, XML_ecoreURI.toString());
			EMFModel sourceXMLEMFModel = (EMFModel) emfModelFactory
					.newModel(XMLReferenceModel);

			// inject the inputstream in the XML EMFModel
			XMLInjector xmlInjector = new XMLInjector();
			xmlInjector.inject(sourceXMLEMFModel, sourceXML, null);

			sourceXMLEMFModel
					.getResource()
					.setURI(URI
							.createFileURI("D:/workspaces/wp_irit_ifgui/fr.irit.ifclipse/src/fr/irit/ifclipse/xml/Scenario_Error0.xml.xmi"));
			try {
				sourceXMLEMFModel.getResource().save(Collections.EMPTY_MAP);
			} catch (IOException e) {
				e.printStackTrace();
			}

			// transform the XML EMFModel to Scenario EMFModel using
			// XML2IFConfig.asm
			result = xml2Scenario(sourceXMLEMFModel);

		} catch (ATLCoreException e) {
			e.printStackTrace();
		}
		return result;
	}

	private void createResources() {
		modelHandler = (AtlEMFModelHandler) AtlModelHandler
				.getDefault(AtlModelHandler.AMH_EMF);
		modelLoader = modelHandler.createModelLoader();
		XML_ecoreURI = URI.createPlatformPluginURI(XML_ECORE_PATH, true);

		scenario_NS_URI = URI.createURI("uri:http://irit.fr/scenario");

		XML2ScenarioTransformation_PATH = IFConfigurationXMLInjectorImpl.class
				.getResource("resources/XML2Scenario.asm");

	}

	private Resource xml2Scenario(final EMFModel sourceXMLEMFModel) {
		Resource result = null;

		Map<String, Object> models = new HashMap<String, Object>();

		initMetamodels(models);
		// get/create models
		try {

			// put the source model into inputstream for loading
			final PipedOutputStream outputStream = new PipedOutputStream();
			PipedInputStream inputStream = new PipedInputStream(outputStream);

			new Thread(new Runnable() {
				public void run() {
					try {

						(new EMFExtractor()).extract(sourceXMLEMFModel,
								outputStream, null);
					} catch (ATLCoreException e) {
						e.printStackTrace();
					}
					try {
						outputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}).start();

			ASMEMFModel XMLInputModel = (ASMEMFModel) modelLoader.loadModel(
					"IN", XMLMetamodel, inputStream);
			inputStream.close();

			ASMEMFModel scenarioOutputModel = (ASMEMFModel) modelLoader
					.newModel("OUT", "", scenarioMM);

			// XMLInputModel
			// .getExtent()
			// .setURI(URI
			// .createFileURI("D:/workspaces/wp_irit_ifgui/fr.irit.ifclipse/src/fr/irit/ifclipse/xml/Scenario_Error.xml.xmi"));
			// XMLInputModel.getExtent().save(Collections.EMPTY_MAP);

			// load models
			models.put("IN", XMLInputModel);
			models.put("OUT", scenarioOutputModel);

			// launch
			AtlLauncher.getDefault().launch(XML2ScenarioTransformation_PATH,
					Collections.EMPTY_MAP, models, Collections.EMPTY_MAP,
					Collections.EMPTY_LIST, Collections.EMPTY_MAP);

			result = scenarioOutputModel.getExtent();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	// loads the metamodels in a Map<String, Object>
	private void initMetamodels(Map<String, Object> models) {

		try {
			XMLMetamodel = (ASMEMFModel) modelLoader.loadModel("XML",
					modelLoader.getMOF(), XML_ecoreURI.toString());

			scenarioMM = (ASMEMFModel) modelLoader.loadModel("Scenario",
					modelLoader.getMOF(), scenario_NS_URI.toString());

			models.put("Scenario", scenarioMM);
			models.put("XML", XMLMetamodel);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
