package fr.irit.ifclipse.actions;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Lists.transform;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PlatformUI;

import com.google.common.base.Function;

import fr.irit.ifclipse.controller.IFClipseController;
import fr.irit.ifclipse.injection.EvalBeforeStrategy;
import fr.irit.ifclipse.injection.EvalContext;
import fr.irit.ifclipse.injection.EvalStrategy;
import fr.irit.ifclipse.injection.NoEvalStrategy;
import fr.irit.ifclipse.injection.UpdateConfig;
import fr.irit.ifclipse.injection.UpdateConfigAndTrans;
import fr.irit.ifclipse.injection.UpdateContext;
import fr.irit.ifclipse.injection.UpdateException;
import fr.irit.ifclipse.injection.UpdateImpactStrategy;
import fr.irit.ifclipse.injection.UpdateTrans;
import fr.irit.ifclipse.legacy.simlibrary.EIFSimException;
import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;
import fr.irit.ifclipse.model.OCLResourceEvaluator;
import fr.irit.ifclipse.views.IFClipseView;

public class StartRandomWalkActionDelegate implements
		IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	private IFClipseController controller;
	private int stepNumber = 0;
	// used for the breakpoint conditions in the views
	private boolean continueWalk = true;

	@Override
	public void run(IAction action) {
		final EvalStrategy evalStrategy;
		final UpdateImpactStrategy updateStrategy;
		// the transitions firing loop
		if (controller.isDebugMode()) {
			evalStrategy = new EvalBeforeStrategy();
			updateStrategy = new UpdateConfigAndTrans();
		} else {
			evalStrategy = new NoEvalStrategy();
			updateStrategy = new UpdateTrans();
		}

		try {
			PlatformUI.getWorkbench().getProgressService().busyCursorWhile(

			new IRunnableWithProgress() {

				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					monitor.beginTask("Random walk", 99999);

					while (continueWalk) {
						if (monitor.isCanceled()) {
							return;
						}

						randomWalk(monitor, evalStrategy, updateStrategy);

					}
					continueWalk = true;
				}
			});
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			controller.statusLineRefresh();
			controller.updateActionStatus();
			// if the update strategy is updateTrans the IFConfig has to be
			// updated at the end
			if (updateStrategy instanceof UpdateTrans) {
				updateConfig(new UpdateConfig());

			}
		}

	}

	private void updateConfig(final UpdateImpactStrategy updateStrategy) {
		try {
			new UpdateContext(updateStrategy, controller).update();
		} catch (UpdateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EIFSimException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void randomWalk(final IProgressMonitor monitor,
			final EvalStrategy evalStrategy,
			final UpdateImpactStrategy updateStrategy) {

		window.getWorkbench().getDisplay().syncExec(new Runnable() {

			@Override
			public void run() {
				try {

					EvalContext evalContext = new EvalContext(evalStrategy,
							controller);
					List<OCLResourceEvaluator> evalResult = evalContext.eval();

					if (evalResult.isEmpty()) {

						// recup enabledTransition.size
						if (controller.getEnabledTransitionsRes() == null)
							return;
						if (controller.getEnabledTransitionsRes().getContents()
								.isEmpty())
							return;

						EObject eObj = controller.getEnabledTransitionsRes()
								.getContents().get(0);
						if (eObj instanceof EnabledTransitions) {

							EnabledTransitions eTrans = (EnabledTransitions) eObj;
							int max = eTrans.getEnabledTransitions().size();
							int trno = (int) (Math.random() * max);
							monitor.subTask("Firing transition number: " + trno
									+ "/ step: " + stepNumber);
							controller.fire(trno);

							UpdateContext context = new UpdateContext(
									updateStrategy, controller);
							context.update();

						}
					} else {
						List<IFClipseView> stopedViews = newArrayList();
						for (OCLResourceEvaluator ore : evalResult) {
							// use bimap
							stopedViews.addAll(controller.getViews(ore));
						}

						MessageDialog.openInformation(
								window.getShell(),
								"Stop Condition",
								"Reached stop in:\n"
										+
										// boucle sur les views avec une
										// stopcondition et affiche les noms de
										// la vue responsable
										// de l'arret
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
						continueWalk = false;

					}

					stepNumber++;

				} catch (EIFSimException e) {
					MessageDialog.openError(window.getShell(),
							"Firing problem", e.getMessage());
					e.printStackTrace();
				} catch (UpdateException e) {
					MessageDialog.openError(window.getShell(),
							"Update problem", e.getMessage());
					e.printStackTrace();
				}
				monitor.worked(100);
			}

		});
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		this.window = window;
		controller = IFClipseController.getInstance();

	}

}
