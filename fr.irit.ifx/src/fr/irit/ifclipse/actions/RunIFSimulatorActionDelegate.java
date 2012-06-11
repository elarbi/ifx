package fr.irit.ifclipse.actions;

import java.io.IOException;
import java.net.UnknownHostException;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;
import fr.irit.ifclipse.views.IFClipseView;

public class RunIFSimulatorActionDelegate implements
		IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	private IFClipseController controller;

	@Override
	public void run(IAction action) {
		// open a connect dialog (server, port)
		AttachIFSimulatorDialog dialog = new AttachIFSimulatorDialog(
				window.getShell(), window);
		dialog.open();
		if (dialog.getReturnCode() == Window.OK) {
			Display.getDefault().syncExec(new Runnable() {

				@Override
				public void run() {
					try {
						controller.connectToSimulator();
						controller.initializeSimulator();

					} catch (UnknownHostException ex) {
						MessageDialog.openError(window.getShell(),
								"Unknown host", "Network error");
					} catch (IOException ex) {
						MessageDialog.openError(window.getShell(), "I/O error:"
								+ ex.getMessage(), "Network error");
					} catch (EIFSimException ex) {
						MessageDialog.openError(window.getShell(),
								"Simulator error:" + ex.getMessage(),
								"Simulator error");
					}

				}
			});
			try {
				controller.injectConfigAndTrans();
				for (IFClipseView view : controller.getViewOreBinding()
						.keySet()) {
					view.setOCLContext(view.getModel());
				}

			} catch (EIFSimException e) {
				e.printStackTrace();
			}

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
		// cache the window in witch the actionDelegate is operating
		this.window = window;
		controller = IFClipseController.getInstance();

	}

}
