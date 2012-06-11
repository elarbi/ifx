package fr.irit.ifclipse.actions;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;

import fr.irit.ifclipse.controller.IFClipseController;

public class RandomWalkJob extends Job {
	public static final String NAME = "Random walk";

	private IFClipseController controller;

	public RandomWalkJob(String name, IFClipseController ctrl) {
		super(name);
		controller = ctrl;
	}

	@Override
	protected IStatus run(IProgressMonitor monitor) {
		monitor.beginTask("check for new version", 20);
		for (int i = 20; i > 0; --i) {
			monitor.subTask("seconds left = " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// Ignored.
			}
			monitor.worked(1);
		}
		monitor.done();
		// Reschedule job to execute in 2 minutes.
		schedule(120000);
		return Status.OK_STATUS;
	}

}
