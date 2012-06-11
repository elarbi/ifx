package fr.irit.ifclipse.views;

import org.eclipse.emf.ecore.resource.Resource;

public interface ViewFactory {

	IFClipseView createView(Resource observedResource);
}
