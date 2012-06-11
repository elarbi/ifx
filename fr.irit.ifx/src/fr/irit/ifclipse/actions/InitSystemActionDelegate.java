package fr.irit.ifclipse.actions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;

public class InitSystemActionDelegate implements IWorkbenchWindowActionDelegate {

	private IFClipseController controller;
	private IWorkbenchWindow window;

	@Override
	public void run(IAction action) {
		try {
			controller.initializeSimulator();
			controller.injectConfigAndTrans();
		} catch (EIFSimException e) {
			MessageDialog.openError(window.getShell(),
					"Initialization problem", e.getMessage());
		}

	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {

	}

	@Override
	public void dispose() {

	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
		controller = IFClipseController.getInstance();
	}

}
