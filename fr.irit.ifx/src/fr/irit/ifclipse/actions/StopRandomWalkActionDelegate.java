package fr.irit.ifclipse.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import fr.irit.ifclipse.controller.IFClipseController;

public class StopRandomWalkActionDelegate implements
		IWorkbenchWindowActionDelegate {

	private IFClipseController controller;

	public StopRandomWalkActionDelegate() {

	}

	@Override
	public void run(IAction action) {

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		controller = IFClipseController.getInstance();

	}

}
