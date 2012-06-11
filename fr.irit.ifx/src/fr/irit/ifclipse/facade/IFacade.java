package fr.irit.ifclipse.facade;

import java.util.ArrayList;

import org.eclipse.emf.ecore.resource.ResourceSet;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.views.IFClipseView;

public interface IFacade {
	IFClipseController getController();

	ResourceSet getModel();

	ArrayList<IFClipseView> getView();
}
