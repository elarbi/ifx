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

public class IFConfigurationXMLInjectorImpl implements
		IFConfigurationXMLInjector {

	private AtlEMFModelHandler modelHandler;
	private ModelLoader modelLoader;

	private static final String XML_ECORE_PATH = "org.eclipse.m2m.atl.projectors.xml/src/org/eclipse/m2m/atl/projectors/xml/resources/XML.ecore";
	private EMFModelFactory emfModelFactory;
	private ASMEMFModel XMLMetamodel;
	private ASMEMFModel IFConfigurationMetamodel;
	private URI XML_ecoreURI;
	private URI IFConfiguration_NS_URI;
	private URL XML2IFTransformation_PATH;

	/*
	 * inject an XML inputstream into an IFConfiguration resource
	 */
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

			// transform the XML EMFModel to IFConfig EMFModel using
			// XML2IFConfig.asm
			result = xml2ifConfig(sourceXMLEMFModel);

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

		IFConfiguration_NS_URI = URI
				.createURI("uri:http://irit.fr/ifconfiguration");

		XML2IFTransformation_PATH = IFConfigurationXMLInjectorImpl.class
				.getResource("resources/XML2IFConfig.asm");

	}

	private Resource xml2ifConfig(final EMFModel sourceXMLEMFModel) {
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
						// TODO: more effective => use
						// BufferedOutput/InputStream
						// (new EMFExtractor()).extract(sourceXMLEMFModel,
						// new BufferedOutputStream(outputStream), null);
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

			ASMEMFModel IFConfigOutputModel = (ASMEMFModel) modelLoader
					.newModel("OUT", "", IFConfigurationMetamodel);

			// load models
			models.put("IN", XMLInputModel);
			models.put("OUT", IFConfigOutputModel);

			// launch
			AtlLauncher.getDefault().launch(XML2IFTransformation_PATH,
					Collections.EMPTY_MAP, models, Collections.EMPTY_MAP,
					Collections.EMPTY_LIST, Collections.EMPTY_MAP);

			result = IFConfigOutputModel.getExtent();
			// URI saveURI_IF = URI
			// .createFileURI("d:/workspaces/wp_irit_ifgui/fr.irit.ifclipse/src/fr/irit/ifclipse/xml/savedIFConfig.ifconfig.xmi");
			// result.setURI(saveURI_IF);
			// result.save(Collections.EMPTY_MAP);

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

			IFConfigurationMetamodel = (ASMEMFModel) modelLoader.loadModel(
					"IFConfiguration", modelLoader.getMOF(),
					IFConfiguration_NS_URI.toString());

			models.put("IFConfiguration", IFConfigurationMetamodel);
			models.put("XML", XMLMetamodel);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Resource inject(Resource IFConfigResource, InputStream sourceXML,
			Map<String, Object> options) {
		return null;

	}

}
