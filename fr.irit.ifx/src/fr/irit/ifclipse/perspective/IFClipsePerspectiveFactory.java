package fr.irit.ifclipse.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

import fr.irit.ifclipse.views.DiagnosticView;
import fr.irit.ifclipse.views.DynamicView;
import fr.irit.ifclipse.views.IFConfigurationView;
import fr.irit.ifclipse.views.IFTransitionsView;
import fr.irit.ifclipse.views.ScenarioView;

public class IFClipsePerspectiveFactory implements IPerspectiveFactory {
	public static final String IFCLIPSE_PERSPECTIVE_ID = "fr.irit.ifclipse.perspective";

	@Override
	public void createInitialLayout(IPageLayout layout) {
		// Get the editor area.
		String editorArea = layout.getEditorArea();

		String folderId = "iFFolder";
		IFolderLayout iFFolder = layout.createFolder(folderId, //$NON-NLS-1$
				IPageLayout.LEFT, 0.5f, editorArea);
		iFFolder.addView(IFConfigurationView.ID);
		// iFFolder.addView(UMLConfigurationView.ID);
		layout.addStandaloneView("fr.irit.ifclipse.views.NavigatorView",
				true /* show title */, IPageLayout.LEFT, 1.0f, editorArea);

		layout.addStandaloneView(DiagnosticView.ID, true, IPageLayout.RIGHT,
				0.30f, IFConfigurationView.ID);
		layout.addView(ScenarioView.ID, IPageLayout.RIGHT, 0.75f, editorArea);

		layout.addView(IFTransitionsView.ID, IPageLayout.BOTTOM, 0.54f,
				DiagnosticView.ID);

		IFolderLayout dynamicViewsFolder = layout.createFolder(
				"dynamicViewsFolder", //$NON-NLS-1$ 
				IPageLayout.BOTTOM, 0.6f, folderId);
		dynamicViewsFolder.addPlaceholder(DynamicView.ID);

		IFolderLayout bottom = layout.createFolder("bottom", //$NON-NLS-1$
				IPageLayout.BOTTOM, 0.5f, IFTransitionsView.ID);
		bottom.addView(IPageLayout.ID_PROJECT_EXPLORER);
		bottom.addView(IPageLayout.ID_PROP_SHEET);
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		layout.setEditorAreaVisible(true);
	}
}
