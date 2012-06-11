/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigFactory;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance;

/**
 * This is the item provider adapter for a
 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ObserverInstanceItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObserverInstanceItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_ObserverInstance_type_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_ObserverInstance_type_feature",
						"_UI_ObserverInstance_type"),
				IFConfigPackage.Literals.OBSERVER_INSTANCE__TYPE, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to
	 * deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand},
	 * {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in
	 * {@link #createCommand}. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(
			Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__STATE);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__PID);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__QUEUE);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__VARIABLE_SET);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__PARAMATER_SET);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__EVENT_SET);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__STATUS);
			childrenFeatures
					.add(IFConfigPackage.Literals.OBSERVER_INSTANCE__CUT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper
		// feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ObserverInstance.gif. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/ObserverInstance"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ObserverInstance) object).getType();
		return label == null || label.length() == 0 ? getString("_UI_ObserverInstance_type")
				: getString("_UI_ObserverInstance_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to
	 * update any cached children and by creating a viewer notification, which
	 * it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(ObserverInstance.class)) {
		case IFConfigPackage.OBSERVER_INSTANCE__TYPE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__STATE:
		case IFConfigPackage.OBSERVER_INSTANCE__PID:
		case IFConfigPackage.OBSERVER_INSTANCE__QUEUE:
		case IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET:
		case IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET:
		case IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET:
		case IFConfigPackage.OBSERVER_INSTANCE__STATUS:
		case IFConfigPackage.OBSERVER_INSTANCE__CUT:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s
	 * describing the children that can be created under this object. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(
			Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__STATE,
				IFConfigFactory.eINSTANCE.createState()));

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__PID,
				IFConfigFactory.eINSTANCE.createPid()));

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__QUEUE,
				IFConfigFactory.eINSTANCE.createQueue()));

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__VARIABLE_SET,
				IFConfigFactory.eINSTANCE.createVariableSet()));

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__PARAMATER_SET,
				IFConfigFactory.eINSTANCE.createParameterSet()));

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__EVENT_SET,
				IFConfigFactory.eINSTANCE.createEnabledTransitions()));

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__STATUS,
				IFConfigFactory.eINSTANCE.createStatus()));

		newChildDescriptors.add(createChildParameter(
				IFConfigPackage.Literals.OBSERVER_INSTANCE__CUT,
				IFConfigFactory.eINSTANCE.createCut()));
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return IFConfigurationEditPlugin.INSTANCE;
	}

}
