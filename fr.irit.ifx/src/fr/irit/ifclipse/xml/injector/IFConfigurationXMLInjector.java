package fr.irit.ifclipse.xml.injector;

import java.io.InputStream;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

public interface IFConfigurationXMLInjector {

	Resource inject(InputStream sourceXML);

	Resource inject(Resource IFConfigResource, InputStream sourceXML,
			Map<String, Object> options);
}
