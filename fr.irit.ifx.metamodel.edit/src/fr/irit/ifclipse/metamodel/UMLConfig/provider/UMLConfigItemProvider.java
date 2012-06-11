/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigFactory;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * This is the item provider adapter for a
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig} object. <!--
 * begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class UMLConfigItemProvider extends NamedElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLConfigItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
					.add(UMLConfigPackage.Literals.UML_CONFIG__ACTIVITY_GROUPS);
			childrenFeatures
					.add(UMLConfigPackage.Literals.UML_CONFIG__INITIAL_THREAD);
			childrenFeatures.add(UMLConfigPackage.Literals.UML_CONFIG__OBJECTS);
			childrenFeatures.add(UMLConfigPackage.Literals.UML_CONFIG__PORTS);
			childrenFeatures
					.add(UMLConfigPackage.Literals.UML_CONFIG__OBSERVERS);
			childrenFeatures.add(UMLConfigPackage.Literals.UML_CONFIG__TIME);
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
	 * This returns UMLConfig.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/UMLConfig"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((UMLConfig) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_UMLConfig_type")
				: getString("_UI_UMLConfig_type") + " " + label;
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

		switch (notification.getFeatureID(UMLConfig.class)) {
		case UMLConfigPackage.UML_CONFIG__ACTIVITY_GROUPS:
		case UMLConfigPackage.UML_CONFIG__INITIAL_THREAD:
		case UMLConfigPackage.UML_CONFIG__OBJECTS:
		case UMLConfigPackage.UML_CONFIG__PORTS:
		case UMLConfigPackage.UML_CONFIG__OBSERVERS:
		case UMLConfigPackage.UML_CONFIG__TIME:
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
				UMLConfigPackage.Literals.UML_CONFIG__ACTIVITY_GROUPS,
				UMLConfigFactory.eINSTANCE.createActivityGroup()));

		newChildDescriptors.add(createChildParameter(
				UMLConfigPackage.Literals.UML_CONFIG__INITIAL_THREAD,
				UMLConfigFactory.eINSTANCE.createInitialThread()));

		newChildDescriptors.add(createChildParameter(
				UMLConfigPackage.Literals.UML_CONFIG__OBJECTS,
				UMLConfigFactory.eINSTANCE.createObject()));

		newChildDescriptors.add(createChildParameter(
				UMLConfigPackage.Literals.UML_CONFIG__PORTS,
				UMLConfigFactory.eINSTANCE.createPort()));

		newChildDescriptors.add(createChildParameter(
				UMLConfigPackage.Literals.UML_CONFIG__OBSERVERS,
				UMLConfigFactory.eINSTANCE.createObserver()));

		newChildDescriptors.add(createChildParameter(
				UMLConfigPackage.Literals.UML_CONFIG__TIME,
				UMLConfigFactory.eINSTANCE.createDiscreteTime()));

		newChildDescriptors.add(createChildParameter(
				UMLConfigPackage.Literals.UML_CONFIG__TIME,
				UMLConfigFactory.eINSTANCE.createDbmTime()));
	}

}
