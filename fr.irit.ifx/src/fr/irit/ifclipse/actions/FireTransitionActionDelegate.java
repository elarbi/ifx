package fr.irit.ifclipse.actions;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IViewActionDelegate;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import com.google.common.base.Function;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.injection.EvalBeforeStrategy;
import fr.irit.ifclipse.injection.EvalContext;
import fr.irit.ifclipse.injection.EvalStrategy;
import fr.irit.ifclipse.injection.NoEvalStrategy;
import fr.irit.ifclipse.injection.UpdateConfigAndTrans;
import fr.irit.ifclipse.injection.UpdateContext;
import fr.irit.ifclipse.injection.UpdateException;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;
import fr.irit.ifclipse.metamodel.IFConfig.Transition;
import fr.irit.ifclipse.model.OCLResourceEvaluator;
import fr.irit.ifclipse.views.IFClipseView;

public class FireTransitionActionDelegate extends Action implements
		IWorkbenchWindowActionDelegate, IViewActionDelegate, ISelectionListener {

	private IWorkbenchWindow window;
	private IStructuredSelection selection;
	private IFClipseController controller;

	public FireTransitionActionDelegate() {
		controller = IFClipseController.getInstance();
	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
		this.window.getSelectionService().addSelectionListener(this);
	}

	@Override
	public void dispose() {
		window.getSelectionService().removeSelectionListener(this);
	}

	@Override
	public void run() {
		if (window == null)
			return;
		// selection is empty!!
		// TODO: recup la selection de ifTransitionsView
		// mais devrait se faire automatiquement via selectionChanged !
		Object item = selection.getFirstElement();
		if (item instanceof Transition) {
			Transition trans = (Transition) item;
			Integer trno = trans.getNumber();

			try {
				EvalStrategy evalStrategy;
				if (controller.isDebugMode()) {

					// TODO: use factory pattern:
					// EvalStrategy.newEvalStrategy(EvalStrategy.EvalBeforeStrategy)
					evalStrategy = new EvalBeforeStrategy();
				} else {
					evalStrategy = new NoEvalStrategy();
				}
				EvalContext evalContext = new EvalContext(evalStrategy,
						controller);
				List<OCLResourceEvaluator> evalResult = evalContext.eval();

				if (evalResult.isEmpty()) {

					controller.fire(trno);
					UpdateContext context = new UpdateContext(
							new UpdateConfigAndTrans(), controller);
					context.update();

				} else {
					List<IFClipseView> stopedViews = newArrayList();
					for (OCLResourceEvaluator ore : evalResult) {
						// use bimap
						stopedViews.addAll(controller.getViews(ore));
					}

					MessageDialog
							.openInformation(
									window.getShell(),
									"Stop Condition",
									"Reached stop in:\n"
											+

											transform(
													stopedViews,
													new Function<IFClipseView, String>() {

														@Override
														public String apply(
																IFClipseView input) {
															return input
																	.getPartName();

														}

													}));

				}

			} catch (EIFSimException e) {
				MessageDialog.openError(window.getShell(), "Firing problem",
						e.getMessage());
				e.printStackTrace();
			} catch (UpdateException e) {
				MessageDialog.openError(window.getShell(), "Update problem",
						e.getMessage());
				e.printStackTrace();
			}
		}
		controller.updateActionStatus();
		controller.statusLineRefresh();

	}

	@Override
	public void run(IAction action) {
		run();
	}

	public void setSelection(ISelection iSelection) {
		this.selection = (IStructuredSelection) iSelection;
	}

	// ISelectionListener.selectionChanged
	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection)
			this.selection = (IStructuredSelection) selection;
	}

	// IActionDelegate.selectionChanged
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection)
			this.selection = (IStructuredSelection) selection;
	}

	@Override
	public void init(IViewPart view) {

	}

}
