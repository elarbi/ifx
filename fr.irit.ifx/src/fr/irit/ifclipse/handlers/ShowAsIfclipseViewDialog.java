package fr.irit.ifclipse.handlers;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchWindow;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage;

public class ShowAsIfclipseViewDialog extends Dialog {

	private static final String IFConfigChoice = "IFConfiguration";
	private static final String ScenarioChoice = "Scenario";

	private String metamodelNsUri;

	public String getMetamodelNsUri() {
		return metamodelNsUri;
	}

	public ShowAsIfclipseViewDialog(Shell parentShell,
			IWorkbenchWindow workbenchWindow) {
		super(parentShell);

	}

	protected void configureShell(Shell newShell) {
		super.configureShell(newShell);
		newShell.setText("Choose source metamodel");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		// composite.setSize(240, 150);
		GridLayout layout = new GridLayout(3, false);
		layout.marginLeft = 10;
		composite.setLayout(layout);

		Label serverLabel = new Label(composite, SWT.NONE);
		serverLabel.setText("Source metamodel");
		serverLabel.setLayoutData(new GridData(GridData.END, GridData.CENTER,
				false, false));
		new Label(composite, SWT.NONE);

		Button btnRadioButton = new Button(composite, SWT.RADIO);
		btnRadioButton.addSelectionListener(new RadioButtonLst());
		btnRadioButton.setText(IFConfigChoice);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);

		Button btnScenario = new Button(composite, SWT.RADIO);
		btnScenario.setText(ScenarioChoice);
		btnScenario.addSelectionListener(new RadioButtonLst());
		composite.setVisible(true);
		return composite;
	}

	private final class RadioButtonLst extends SelectionAdapter {
		@Override
		public void widgetSelected(SelectionEvent e) {
			doAction(e);
		}
	}

	private void doAction(SelectionEvent e) {
		Button button = (Button) e.widget;
		if (button.getSelection()) {
			String metamodelName = button.getText();
			if (metamodelName.equals(IFConfigChoice)) {
				metamodelNsUri = IFConfigPackage.eNS_URI;
			} else if (metamodelName.equals(ScenarioChoice)) {
				metamodelNsUri = ScenarioPackage.eNS_URI;
			}
		}
	}

	@Override
	protected void okPressed() {
		super.okPressed();

	}
}
