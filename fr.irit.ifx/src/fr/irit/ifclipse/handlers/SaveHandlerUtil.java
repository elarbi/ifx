package fr.irit.ifclipse.handlers;

import java.util.Map;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.internal.l10n.Messages;
import fr.irit.ifclipse.model.ModelRepo;

public class SaveHandlerUtil {

	private static IFClipseController controller = IFClipseController
			.getInstance();

	public static Object save(String modelNsUri, ExecutionEvent event)
			throws ExecutionException {
		Shell shell = HandlerUtil.getActiveShellChecked(event);

		Resource resource = null;
		if (modelNsUri.equals(ModelRepo.IFCONFIG_MODEL_NS_URI)) {
			resource = controller.getIfConfigRes();
		} else if (modelNsUri.equals(ModelRepo.SCENARIO_MODEL_NS_URI)) {
			resource = controller.getScenarioRes();
		}

		if (resource != null) {
			FileDialog dlg = new FileDialog(shell, SWT.SAVE);
			dlg.setFilterExtensions(new String[] { "*.xmi" }); //$NON-NLS-1$
			dlg.setText(Messages.console_saveDlg_title);

			String file = dlg.open();

			if (file != null) {
				// TODO: copy the resource to avoid triggering the eAdapters
				resource.setURI(URI.createFileURI(file));
				try {

					Map<String, Object> saveOptions = new java.util.HashMap<String, Object>();

					saveOptions.put(XMLResource.OPTION_SAVE_TYPE_INFORMATION,
							true);
					resource.save(saveOptions);
					ResourcesPlugin
							.getWorkspace()
							.getRoot()
							.refreshLocal(IResource.DEPTH_INFINITE,
									new NullProgressMonitor());
				} catch (Exception e) {
					MessageDialog.openError(shell,
							Messages.console_saveError_title,
							e.getLocalizedMessage());
				}
			}
		} else {
			MessageDialog.openWarning(shell, Messages.console_saveWarn_title,
					Messages.console_saveWarn_nothing);
		}
		MessageDialog.openWarning(shell, Messages.console_saveDlg_title,
				Messages.console_save_info_OK);
		return null;

	}

}
