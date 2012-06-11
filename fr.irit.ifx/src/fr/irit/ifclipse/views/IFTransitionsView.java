package fr.irit.ifclipse.views;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.swt.widgets.Composite;

import fr.irit.ifclipse.actions.FireTransitionActionDelegate;
import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;
import fr.irit.ifclipse.metamodel.IFConfig.provider.IFConfigItemProviderAdapterFactory;

public class IFTransitionsView extends IFClipseView {
	/**
	 * The ID of the view as specified by the extension.
	 */
	public static final String ID = "fr.irit.ifclipse.views.IFTransitionsView";

	private FireTransitionActionDelegate fireTransitionActionDelegate;

	public IFTransitionsView() {
		viewType = IFClipseView.IFTRANSITIONS_VIEW;
		id = ID;
		controller.bindView(this, controller.getEnabledTransitionsORE());
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
		makeActions();

	}

	private void makeActions() {
		// instantiate the actionDelegate instead
		fireTransitionActionDelegate = new FireTransitionActionDelegate();
		viewer.addDoubleClickListener(new IDoubleClickListener() {

			@Override
			public void doubleClick(DoubleClickEvent event) {
				fireTransitionActionDelegate.init(getSite()
						.getWorkbenchWindow());
				fireTransitionActionDelegate.setSelection(event.getSelection());
				fireTransitionActionDelegate.run();

			}
		});

	}

	@Override
	public void refresh(Resource resource) {
		adapterFactory
				.addAdapterFactory(new IFConfigItemProviderAdapterFactory());
		if (resource.getContents().size() > 0) {
			EObject input = resource.getContents().get(0);
			if (input instanceof EnabledTransitions) {
				viewer.setInput(input);
			}
		}
	}

}
