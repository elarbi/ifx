package fr.irit.ifclipse.actions;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbenchWindow;

import fr.irit.ifclipse.controller.IFClipseController;

public class AttachIFSimulatorDialog extends Dialog {

	// private static final String DEFAULT_HOST = "topcased";
	private static final String DEFAULT_HOST = "localhost";
	private static final String DEFAULT_PORT = "15555";
	private Text serverText;
	private Text portText;
	private IFClipseController controller;

	public AttachIFSimulatorDialog(Shell parentShell,
			IWorkbenchWindow workbenchWindow) {
		super(parentShell);

		// init the controller
		controller = IFClipseController.getInstance();
		// controller.setWorkbenchWindow(workbenchWindow);

		controller.initTransformerNotifiers();
		controller.initViewNotifiers();

	}

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Attach to IFx");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout(2, false);
		composite.setLayout(layout);

		Label serverLabel = new Label(composite, SWT.NONE);
		serverLabel.setText("&Server:");
		serverLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER,
				false, false));

		serverText = new Text(composite, SWT.BORDER);
		serverText.setLayoutData(new GridData(GridData.FILL, GridData.FILL,
				true, false));

		Label portLabel = new Label(composite, SWT.NONE);
		portLabel.setText("&Port:");
		portLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER,
				false, false));

		portText = new Text(composite, SWT.BORDER);
		GridData gridData = new GridData(GridData.FILL, GridData.FILL, true,
				false);
		gridData.widthHint = convertHeightInCharsToPixels(20);
		portText.setLayoutData(gridData);

		serverText.setText(DEFAULT_HOST);
		portText.setText(DEFAULT_PORT);
		return composite;
	}

	public Text getServerText() {
		return serverText;
	}

	public void setServerText(Text serverText) {
		this.serverText = serverText;
	}

	public Text getPortText() {
		return portText;
	}

	public void setPortText(Text portText) {
		this.portText = portText;
	}

	@Override
	protected void okPressed() {

		if (serverText.getText().equals("")) {
			MessageDialog.openError(getShell(), "Invalid Server",
					"Server field must not be blank.");
			return;
		}
		controller.setServer(serverText.getText());
		if (portText.getText().equals("")) {
			MessageDialog.openError(getShell(), "Invalid Port",
					"Port field must not be blank.");
			return;
		}
		try {
			controller.setPort(new Integer(portText.getText()).intValue());
		} catch (NumberFormatException e) {
			MessageDialog.openError(getShell(), "Invalid Port",
					"Port field must be an integer.");
			return;
		}

		super.okPressed();
	}
}
