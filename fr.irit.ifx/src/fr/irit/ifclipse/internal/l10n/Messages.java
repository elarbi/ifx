package fr.irit.ifclipse.internal.l10n;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "fr.irit.ifclipse.internal.messages"; //$NON-NLS-1$

	public static String console_save_info_OK;
	public static String OCLResourceEvaluator_model_empty;
	public static String console_saveDlg_title;
	public static String console_saveError_title;
	public static String console_saveWarn_title;
	public static String console_saveWarn_nothing;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
