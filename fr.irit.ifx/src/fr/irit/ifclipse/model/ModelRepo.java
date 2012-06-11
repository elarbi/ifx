package fr.irit.ifclipse.model;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage;

/**
 * Model repository for model management
 * 
 * @author ElArbi
 * 
 */
public class ModelRepo {

	public static final String MODEL_SUFFIX = "/model";
	public static final String DYNAMIC_MODEL_SUFFIX = "/dynamicModel";
	public static final String IFCONFIG_NS_URI = IFConfigPackage.eNS_URI;
	public static final String UMLCONFIG_NS_URI = UMLConfigPackage.eNS_URI;
	public static final String SCENARIO_NS_URI = ScenarioPackage.eNS_URI;
	public static final String VDIAGNOSTIC_NS_URI = VisualDiagnosticPackage.eNS_URI;
	public static final String IFCONFIG_MODEL_NS_URI = IFCONFIG_NS_URI
			+ MODEL_SUFFIX;
	public static final String ENABLED_TRANS_MODEL_URI = IFCONFIG_NS_URI
			+ "/transitionsModel";
	public static final String UMLCONFIG_MODEL_NS_URI = UMLCONFIG_NS_URI
			+ MODEL_SUFFIX;
	public static final String SCENARIO_MODEL_NS_URI = SCENARIO_NS_URI
			+ MODEL_SUFFIX;
	public static final String VDIAGNOSTIC_MODEL_NS_URI = VDIAGNOSTIC_NS_URI
			+ MODEL_SUFFIX;
	public static final String DYNAMIC_MODEL_NS_URI = "dynamicModel";

	private ResourceSet resourceSet;

	public ModelRepo() {
		resourceSet = new ResourceSetImpl();
	}

	public ModelRepo(ResourceSet resourceSet) {
		this.resourceSet = resourceSet;
	}

	public void setResourceSet(ResourceSet emfResourceSet) {
		resourceSet = emfResourceSet;
	}

	public Resource getModel(String nsUri) {
		URI uri = URI.createURI(nsUri);
		return resourceSet.getResource(uri, true);
	}

	public Resource newModel(URI uri) {
		Resource newResource = resourceSet.createResource(uri);
		// sets to resource.isLoaded() to true. If not the ResourceImpl will
		// look during loading for the URI's that starts by 'http...' on the
		// internet...
		newResource.getContents().clear();
		return newResource;
	}

	public Resource newModel(String uri) {
		return newModel(createURI(ModelRepo.IFCONFIG_MODEL_NS_URI));
	}

	public static URI createURI(String uri) {
		return URI.createURI(uri);
	}

}
