package fr.irit.ifclipse.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.views.IFClipseView;

public class ShowAsIfclipseView extends AbstractHandler {

	private IFClipseController controller;
	private IWorkbenchWindow window;
	private ShowAsIfclipseViewDialog dialog;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO: filter the file extension to avoid context menu on "file.atl"

		// TODO: open a dialog for choosing the metamodel resource to bind with
		// the view
		window = HandlerUtil.getActiveWorkbenchWindow(event);

		dialog = new ShowAsIfclipseViewDialog(window.getShell(), window);
		dialog.open();
		if (dialog.getReturnCode() == Window.OK) {
			okPressed(event);
		}
		return null;
	}

	private void okPressed(ExecutionEvent event) throws ExecutionException {
		// event.
		controller = IFClipseController.getInstance();
		// get the selected ASM file
		IStructuredSelection selection = (IStructuredSelection) HandlerUtil
				.getCurrentSelectionChecked(event);
		System.err.println(selection);
		IResource asmResource = (IResource) selection.getFirstElement();

		if (asmResource.getType() == IResource.FILE) {
			// if (checkBox...)

			IFClipseView view = controller.createView(asmResource,
					dialog.getMetamodelNsUri());

			try {
				controller.getView(view.getId());
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub

		}

	}
}
