package fr.irit.ifclipse.xml.injector;

import java.io.InputStream;

import org.eclipse.emf.ecore.resource.Resource;

public interface ScenarioXMLInjector {
	Resource inject(InputStream sourceXML);
}
