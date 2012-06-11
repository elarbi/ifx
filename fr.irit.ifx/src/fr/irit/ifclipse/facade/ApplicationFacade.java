package fr.irit.ifclipse.facade;

import java.util.ArrayList;

import org.eclipse.emf.ecore.resource.ResourceSet;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.views.IFClipseView;

public class ApplicationFacade implements IFacade {

	@Override
	public IFClipseController getController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceSet getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<IFClipseView> getView() {
		// TODO Auto-generated method stub
		return null;
	}

	// singleton via lequel on communique avec les acteurs principaux: M, V, C
	// public Object getService(Class api) {
	// // TODO Auto-generated method stub
	// return null;
	// }

}
