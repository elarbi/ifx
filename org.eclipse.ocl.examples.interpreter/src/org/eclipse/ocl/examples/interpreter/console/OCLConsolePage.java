/**
 * <copyright>
 *
 * Copyright (c) 2005, 2008 IBM Corporation, Zeligsoft Inc. and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *   Zeligsoft - Bug 237205
 *   Patrick Könemann - Bug 294200 (history)
 *
 * </copyright>
 *
 * $Id: OCLConsolePage.java,v 1.2 2011/03/14 10:34:31 ewillink Exp $
 */

package org.eclipse.ocl.examples.interpreter.console;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.TextViewer;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.examples.interpreter.OCLExamplePlugin;
import org.eclipse.ocl.examples.interpreter.console.text.ColorManager;
import org.eclipse.ocl.examples.interpreter.console.text.OCLDocument;
import org.eclipse.ocl.examples.interpreter.internal.l10n.OCLInterpreterMessages;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.ConstraintKind;
import org.eclipse.ocl.helper.OCLHelper;
import org.eclipse.ocl.types.TupleType;
import org.eclipse.ocl.util.Tuple;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyleRange;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.actions.ClearOutputAction;
import org.eclipse.ui.part.Page;
import org.osgi.framework.Bundle;

/**
 * The page implementing the Interactive OCL console.
 */
public class OCLConsolePage extends Page {

	private static int BUNDLE_AVAILABLE = Bundle.RESOLVED | Bundle.ACTIVE
			| Bundle.STARTING;

	private Composite page;

	private ITextViewer output;
	private OCLDocument document;

	private ColorManager colorManager;

	private String lastOCLExpression;
	private EObject context;

	// private ISelectionService selectionService;
	// private ISelectionListener selectionListener;

	private IOCLFactory<Object> oclFactory = new EcoreOCLFactory();
	private OCL<?, Object, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ocl;

	public void setOcl(OCL<?, Object, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> ocl) {
		this.ocl = ocl;
	}

	private ModelingLevel modelingLevel = ModelingLevel.M2;

	private Map<TargetMetamodel, IAction> metamodelActions = new java.util.HashMap<TargetMetamodel, IAction>();

	private static final AdapterFactory reflectiveAdapterFactory = new ReflectiveItemProviderAdapterFactory();

	private static final AdapterFactory defaultAdapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	public IItemLabelProvider tupleTypeLabelProvider = new IItemLabelProvider() {

		public Object getImage(Object object) {
			return null;
		}

		public String getText(Object object) {
			@SuppressWarnings("unchecked")
			Tuple<?, Object> tuple = (Tuple<?, Object>) object;
			TupleType<?, ?> tupleType = tuple.getTupleType();

			StringBuffer result = new StringBuffer();
			result.append("Tuple{");//$NON-NLS-1$

			for (Iterator<?> iter = tupleType.oclProperties().iterator(); iter
					.hasNext();) {

				Object next = iter.next();

				result.append(oclFactory.getName(next));
				result.append(" = "); //$NON-NLS-1$
				result.append(OCLConsolePage.this.toString(tuple.getValue(next)));

				if (iter.hasNext()) {
					result.append(", "); //$NON-NLS-1$
				}
			}

			result.append('}');

			return result.toString();
		}
	};

	/**
	 * Initializes me.
	 */
	OCLConsolePage() {
		super();
	}

	@Override
	public void createControl(Composite parent) {
		// force left-to-right text direction in the console, because it
		// works with OCL text and the OCL language is based on English
		page = new SashForm(parent, SWT.VERTICAL | SWT.LEFT_TO_RIGHT);

		output = new TextViewer(page, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL
				| SWT.H_SCROLL);
		output.getTextWidget().setLayoutData(new GridData(GridData.FILL_BOTH));
		output.getTextWidget().setFont(
				JFaceResources.getFont(JFaceResources.TEXT_FONT));
		output.setEditable(false);
		output.setDocument(new Document());

		setColorManager(new ColorManager());
		document = new OCLDocument();
		document.setOCLFactory(oclFactory);
		document.setModelingLevel(modelingLevel);

		// input = new OCLSourceViewer(page, colorManager, SWT.BORDER |
		// SWT.MULTI);
		// input.setDocument(document);
		// input.getTextWidget().addKeyListener(new InputKeyListener());
		//
		// selectionListener = new ISelectionListener() {
		// public void selectionChanged(IWorkbenchPart part, ISelection
		// selection) {
		// OCLConsolePage.this.selectionChanged(selection);
		// }};
		// selectionService =
		// getSite().getWorkbenchWindow().getSelectionService();
		// selectionService.addPostSelectionListener(selectionListener);
		//
		// // get current selection
		// ISelection selection = selectionService.getSelection();
		// if (selection == null) {
		// selection = getActiveSelection();
		// }
		// selectionChanged(selection);
		//
		// ((SashForm) page).setWeights(new int[] {2, 1});

		ClearOutputAction clear = new ClearOutputAction(output);
		CloseAction close = new CloseAction();
		SaveAction save = new SaveAction();
		LoadAction load = new LoadAction();

		IMenuManager menu = getSite().getActionBars().getMenuManager();
		menu.add(load);
		menu.add(save);
		menu.add(clear);
		menu.add(close);

		IToolBarManager toolbar = getSite().getActionBars().getToolBarManager();
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, load);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, save);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, clear);
		toolbar.appendToGroup(IConsoleConstants.OUTPUT_GROUP, close);
	}

	/**
	 * Queries whether a bundle is available.
	 * 
	 * @param bundle
	 *            a bundle
	 * @return whether it is active or resolved
	 */
	static boolean isAvailable(Bundle bundle) {
		return (bundle.getState() & BUNDLE_AVAILABLE) != 0;
	}

	@Override
	public Control getControl() {
		return page;
	}

	@Override
	public void setFocus() {
		output.getTextWidget().setFocus();
	}

	/**
	 * Extends the inherited method to dispose of additional colour resources.
	 */
	@Override
	public void dispose() {
		getColorManager().dispose();
		super.dispose();
	}

	/**
	 * Programmatically sets my target metamodel.
	 * 
	 * @param metamodel
	 *            the target metamodel
	 */
	public void setTargetMetamodel(TargetMetamodel metamodel) {
		IAction action = metamodelActions.get(metamodel);

		if (action != null) {
			// deselect the old one
			metamodelActions.get(oclFactory.getTargetMetamodel()).setChecked(
					false);

			action.run();
			action.setChecked(true);
		}
	}

	/**
	 * Evaluates an OCL expression using the OCL Interpreter's {@link OCLHelper}
	 * API.
	 * 
	 * @param expression
	 *            an OCL expression
	 * 
	 * @return <code>true</code> on successful evaluation; <code>false</code> if
	 *         the expression failed to parse or evaluate
	 */
	boolean evaluate(String expression) {
		boolean result = true;

		if (context == null) {
			result = false;
			error(OCLInterpreterMessages.console_noContext);
		} else {
			// create an OCL helper to do our parsing and evaluating
			ocl = oclFactory.createOCL(modelingLevel);
			OCLHelper<Object, ?, ?, ?> helper = ocl.createOCLHelper();

			try {
				// set our helper's context classifier to parse against it
				ConstraintKind kind = modelingLevel.setContext(helper, context,
						oclFactory);

				IDocument doc = getDocument();
				Color outputDefault = getColorManager().getColor(
						ColorManager.DEFAULT);
				Color outputResults = getColorManager().getColor(
						ColorManager.OUTPUT_RESULTS);

				if (doc.getLength() > 0) {
					// separate previous output by a blank line
					append("", outputDefault, false); //$NON-NLS-1$
				}

				append(OCLInterpreterMessages.console_evaluating,
						outputDefault, true);
				append(expression, outputDefault, false);
				append(OCLInterpreterMessages.console_results, outputDefault,
						true);

				switch (modelingLevel) {
				case M2:
					OCLExpression<Object> parsed = helper
							.createQuery(expression);

					// evaluate the query
					print(ocl.evaluate(context, parsed), outputResults, false);
					break;
				case M1:
					helper.createConstraint(kind, expression);

					// just report a successful parse
					print(OCLInterpreterMessages.console_parsed, outputResults,
							false);
					break;
				}

				// store the successfully parsed expression
				lastOCLExpression = expression;
			} catch (Exception e) {
				result = false;
				error((e.getLocalizedMessage() == null) ? e.getClass()
						.getName() : e.getLocalizedMessage());
			}
		}

		return result;
	}

	/**
	 * Obtains the document in the output viewer.
	 * 
	 * @return the output document
	 */
	public IDocument getDocument() {
		return output.getDocument();
	}

	/**
	 * Prints the specified <code>object</code> to the output viewer. The object
	 * is converted to a string using the best matching EMF label provider
	 * adapter if it is an {@link EObject}; otherwise, just use
	 * {@link String#valueOf(java.lang.Object)} on it. If the
	 * <code>object</code> is a collection or an array, then we print each
	 * element on a separate line.
	 * 
	 * @param object
	 *            the object or collection to print
	 * @param color
	 *            the color to print the <code>object</code> with
	 * @param bold
	 *            whether to display it in bold text
	 */
	public void print(Object object, Color color, boolean bold) {
		Collection<?> toPrint;

		if (object == null) {
			toPrint = Collections.EMPTY_SET;
		} else if (object instanceof Collection) {
			toPrint = (Collection<?>) object;
		} else if (object.getClass().isArray()) {
			toPrint = Arrays.asList((Object[]) object);
		} else {
			toPrint = Collections.singleton(object);
		}

		for (Iterator<?> iter = toPrint.iterator(); iter.hasNext();) {
			append(toString(iter.next()), color, bold);
		}

		scrollText();
	}

	/**
	 * Converts a single object to a string, according to the rules described
	 * for the {@link #print(Object, Color, boolean)} method.
	 * 
	 * @param object
	 *            the object to print (not a collection type)
	 * @return the string form of the <code>object</code>
	 * 
	 * @see #print(Object, Color, boolean)
	 */
	String toString(Object object) {
		if (ocl.isInvalid(object)) {
			return "OclInvalid"; //$NON-NLS-1$
		} else if (object instanceof String) {
			return "'" + object + "'"; //$NON-NLS-1$//$NON-NLS-2$
		} else if (object instanceof Tuple) {
			return tupleTypeLabelProvider.getText(object);
		} else if (object instanceof EObject) {
			EObject eObject = (EObject) object;

			IItemLabelProvider labeler = (IItemLabelProvider) defaultAdapterFactory
					.adapt(eObject, IItemLabelProvider.class);

			if (labeler == null) {
				labeler = (IItemLabelProvider) reflectiveAdapterFactory.adapt(
						eObject, IItemLabelProvider.class);
			}

			if (labeler != null) {
				return labeler.getText(object);
			}
		}

		return String.valueOf(object);
	}

	/**
	 * Prints an error message to the output viewer, in red text.
	 * 
	 * @param message
	 *            the error message to print
	 */
	private void error(String message) {
		append(message, getColorManager().getColor(ColorManager.OUTPUT_ERROR),
				false);
		scrollText();
	}

	/**
	 * Ensures that the last text printed to the output viewer is shown.
	 */
	private void scrollText() {
		output.revealRange(getDocument().getLength(), 0);
	}

	/**
	 * Appends the specidied text to the output viewer.
	 * 
	 * @param text
	 *            the text to append
	 * @param color
	 *            the color to print the text with
	 * @param bold
	 *            whether to print the text bold
	 */
	public void append(String text, Color color, boolean bold) {

		IDocument doc = getDocument();
		try {
			int offset = doc.getLength();
			int length = text.length();

			text = text + '\n';

			if (offset > 0) {
				doc.replace(offset, 0, text);
			} else {
				doc.set(text);
			}

			StyleRange style = new StyleRange();
			style.start = offset;
			style.length = length;
			style.foreground = color;

			if (bold) {
				style.fontStyle = SWT.BOLD;
			}

			output.getTextWidget().setStyleRange(style);
		} catch (BadLocationException e) {
			IStatus status = new Status(IStatus.ERROR,
					OCLExamplePlugin.getPluginId(), 1,
					OCLInterpreterMessages.console_outputExc, e);

			OCLExamplePlugin.getDefault().getLog().log(status);
		}
	}

	public void setColorManager(ColorManager colorManager) {
		this.colorManager = colorManager;
	}

	public ColorManager getColorManager() {
		return colorManager;
	}

	/**
	 * An action that closes the Interactive OCL console.
	 */
	private class CloseAction extends Action {
		private final String tip;

		/**
		 * Initializes me.
		 */
		CloseAction() {
			super(OCLInterpreterMessages.console_closeAction_label, PlatformUI
					.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_TOOL_DELETE));

			tip = OCLInterpreterMessages.console_closeAction_tip;
		}

		@Override
		public String getToolTipText() {
			return tip;
		}

		@Override
		public void run() {
			OCLConsole.getInstance().close();
		}
	}

	/**
	 * An action that saves the last-evaluated OCL expression to an XMI file.
	 */
	private class SaveAction extends Action {
		private final String tip;

		/**
		 * Initializes me.
		 */
		SaveAction() {
			super(OCLInterpreterMessages.console_saveAction_label,
					ImageDescriptor.createFromURL(FileLocator.find(
							OCLExamplePlugin.getDefault().getBundle(),
							new Path("$nl$/icons/elcl16/save.gif"), //$NON-NLS-1$
							null)));

			tip = OCLInterpreterMessages.console_saveAction_tip;
		}

		@Override
		public String getToolTipText() {
			return tip;
		}

		@Override
		public void run() {
			Shell shell = getControl().getShell();

			if (lastOCLExpression != null) {
				FileDialog dlg = new FileDialog(shell, SWT.SAVE);
				dlg.setFilterExtensions(new String[] { "*.xmi" }); //$NON-NLS-1$
				dlg.setText(OCLInterpreterMessages.console_saveDlg_title);

				String file = dlg.open();
				if (file != null) {
					try {
						OCLResource.save(file, document, lastOCLExpression);
					} catch (Exception e) {
						MessageDialog.openError(shell,
								OCLInterpreterMessages.console_saveError_title,
								e.getLocalizedMessage());
					}
				}
			} else {
				MessageDialog.openWarning(shell,
						OCLInterpreterMessages.console_saveWarn_title,
						OCLInterpreterMessages.console_saveWarn_noExpr);
			}
		}
	}

	/**
	 * An action that loads the last-evaluated OCL expression to an XMI file.
	 */
	private class LoadAction extends Action {
		private final String tip;

		/**
		 * Initializes me.
		 */
		LoadAction() {
			super(OCLInterpreterMessages.console_loadAction_label, PlatformUI
					.getWorkbench().getSharedImages()
					.getImageDescriptor(ISharedImages.IMG_OBJ_FILE));

			tip = OCLInterpreterMessages.console_loadAction_tip;
		}

		@Override
		public String getToolTipText() {
			return tip;
		}

		@Override
		public void run() {
			Shell shell = getControl().getShell();

			FileDialog dlg = new FileDialog(shell, SWT.OPEN);
			dlg.setFilterExtensions(new String[] { "*.xmi" }); //$NON-NLS-1$
			dlg.setText(OCLInterpreterMessages.console_loadDlg_title);

			String file = dlg.open();
			if (file != null) {
				try {
					String text = OCLResource.load(file);

					if (text != null) {
						document.set(text);
					} else {
						MessageDialog.openWarning(shell,
								OCLInterpreterMessages.console_loadWarn_title,
								OCLInterpreterMessages.console_loadWarn_noExpr);
					}
				} catch (Exception e) {
					MessageDialog.openError(shell,
							OCLInterpreterMessages.console_loadError_title,
							e.getLocalizedMessage());
				}
			}
		}
	}

	private class EcoreOCLFactory implements IOCLFactory<Object> {
		public TargetMetamodel getTargetMetamodel() {
			return TargetMetamodel.Ecore;
		}

		@SuppressWarnings("unchecked")
		public OCL<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> createOCL(
				ModelingLevel level) {
			return OCL.newInstance(new EcoreEnvironmentFactory(
					new DelegatingPackageRegistry(context.eResource()
							.getResourceSet().getPackageRegistry(),
							EPackage.Registry.INSTANCE)));
		}

		@SuppressWarnings("unchecked")
		public OCL<?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?> createOCL(
				ModelingLevel level, Resource res) {

			return OCL.newInstance(new EcoreEnvironmentFactory(
					new DelegatingPackageRegistry(context.eResource()
							.getResourceSet().getPackageRegistry(),
							EPackage.Registry.INSTANCE)), res);
		}

		public Object getContextClassifier(EObject object) {
			return context.eClass();
		}

		public String getName(Object modelElement) {
			return ((ENamedElement) modelElement).getName();
		}
	}

}
