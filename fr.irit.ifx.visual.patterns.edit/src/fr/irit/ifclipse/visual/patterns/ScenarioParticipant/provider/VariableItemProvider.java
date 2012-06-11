/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant.provider;

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

import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantFactory;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Variable;

/**
 * This is the item provider adapter for a
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Variable} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class VariableItemProvider extends NamedElementItemProvider implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableItemProvider(AdapterFactory adapterFactory) {
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
					.add(ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE);
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
	 * This returns Variable.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Variable"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Variable) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Variable_type")
				: getString("_UI_Variable_type") + " " + label;
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

		switch (notification.getFeatureID(Variable.class)) {
		case ScenarioParticipantPackage.VARIABLE__VARIABLE:
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
				ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE,
				ScenarioParticipantFactory.eINSTANCE.createClock()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE,
				ScenarioParticipantFactory.eINSTANCE.createDiscreteClock()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE,
				ScenarioParticipantFactory.eINSTANCE.createContinuousClock()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE,
				ScenarioParticipantFactory.eINSTANCE.createPid()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE,
				ScenarioParticipantFactory.eINSTANCE.createIFInteger()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE,
				ScenarioParticipantFactory.eINSTANCE.createIFReal()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.VARIABLE__VARIABLE,
				ScenarioParticipantFactory.eINSTANCE.createIFBoolean()));
	}

}
