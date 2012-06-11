package fr.irit.ifclipse;

import org.eclipse.jface.action.IStatusLineManager;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import fr.irit.ifclipse.actions.StatusLineContribution;
import fr.irit.ifclipse.controller.IFClipseController;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends AbstractUIPlugin {

	private static final String IFCLIPSE_PERSPECTIVE = "fr.irit.ifclipse.perspective";

	// The plug-in ID
	public static final String PLUGIN_ID = "fr.irit.ifx"; //$NON-NLS-1$

	// The shared instance
	private static Activator plugin;

	// The IFClipse perspective

	private StatusLineContribution statusContribution;

	private IFClipseController controller;

	/**
	 * The constructor
	 */
	public Activator() {
	}

	protected void fillStatusLine(IStatusLineManager statusLine) {
		// statusContribution = new StatusLineContribution("statusLine", 30);
		// statusContribution.setText("Not connected");
		// statusLine.add(statusContribution);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext
	 * )
	 */

	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
		Display display = PlatformUI.createDisplay();
		statusContribution = new StatusLineContribution("statusline", 20);
		controller = IFClipseController.getInstance();
		controller.setWorkbenchWindow(PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow());
		// controller.initTransformerNotifiers();
		// controller.initViewNotifiers();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext
	 * )
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

	/**
	 * Returns an image descriptor for the image file at the given plug-in
	 * relative path
	 * 
	 * @param path
	 *            the path
	 * @return the image descriptor
	 */
	public static ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(PLUGIN_ID, path);
	}
}
