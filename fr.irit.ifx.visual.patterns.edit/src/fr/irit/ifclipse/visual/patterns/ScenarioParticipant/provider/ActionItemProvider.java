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

import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Action;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantFactory;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;

/**
 * This is the item provider adapter for a
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Action} object.
 * <!-- begin-user-doc --> <!-- end-user-doc -->
 * 
 * @generated
 */
public class ActionItemProvider extends ItemProviderAdapter implements
		IEditingDomainItemProvider, IStructuredItemContentProvider,
		ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActionItemProvider(AdapterFactory adapterFactory) {
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

			addKindPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Kind feature. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Action_kind_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Action_kind_feature", "_UI_Action_type"),
				ScenarioParticipantPackage.Literals.ACTION__KIND, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Value feature. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory)
						.getRootAdapterFactory(),
				getResourceLocator(),
				getString("_UI_Action_value_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_Action_value_feature", "_UI_Action_type"),
				ScenarioParticipantPackage.Literals.ACTION__VALUE, true, false,
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
					.add(ScenarioParticipantPackage.Literals.ACTION__MESSAGE);
			childrenFeatures
					.add(ScenarioParticipantPackage.Literals.ACTION__PROCESS);
			childrenFeatures
					.add(ScenarioParticipantPackage.Literals.ACTION__BY);
			childrenFeatures
					.add(ScenarioParticipantPackage.Literals.ACTION__FROM);
			childrenFeatures
					.add(ScenarioParticipantPackage.Literals.ACTION__VIA);
			childrenFeatures
					.add(ScenarioParticipantPackage.Literals.ACTION__TO);
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
	 * This returns Action.gif. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object,
				getResourceLocator().getImage("full/obj16/Action"));
	}

	/**
	 * This returns the label text for the adapted class. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Action) object).getKind();
		return label == null || label.length() == 0 ? getString("_UI_Action_type")
				: getString("_UI_Action_type") + " " + label;
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

		switch (notification.getFeatureID(Action.class)) {
		case ScenarioParticipantPackage.ACTION__KIND:
		case ScenarioParticipantPackage.ACTION__VALUE:
			fireNotifyChanged(new ViewerNotification(notification,
					notification.getNotifier(), false, true));
			return;
		case ScenarioParticipantPackage.ACTION__MESSAGE:
		case ScenarioParticipantPackage.ACTION__PROCESS:
		case ScenarioParticipantPackage.ACTION__BY:
		case ScenarioParticipantPackage.ACTION__FROM:
		case ScenarioParticipantPackage.ACTION__VIA:
		case ScenarioParticipantPackage.ACTION__TO:
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
				ScenarioParticipantPackage.Literals.ACTION__MESSAGE,
				ScenarioParticipantFactory.eINSTANCE.createMessage()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.ACTION__PROCESS,
				ScenarioParticipantFactory.eINSTANCE.createPid()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.ACTION__BY,
				ScenarioParticipantFactory.eINSTANCE.createPid()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.ACTION__FROM,
				ScenarioParticipantFactory.eINSTANCE.createPid()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.ACTION__VIA,
				ScenarioParticipantFactory.eINSTANCE.createPid()));

		newChildDescriptors.add(createChildParameter(
				ScenarioParticipantPackage.Literals.ACTION__TO,
				ScenarioParticipantFactory.eINSTANCE.createPid()));
	}

	/**
	 * This returns the label text for
	 * {@link org.eclipse.emf.edit.command.CreateChildCommand}. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature,
			Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == ScenarioParticipantPackage.Literals.ACTION__PROCESS
				|| childFeature == ScenarioParticipantPackage.Literals.ACTION__BY
				|| childFeature == ScenarioParticipantPackage.Literals.ACTION__FROM
				|| childFeature == ScenarioParticipantPackage.Literals.ACTION__VIA
				|| childFeature == ScenarioParticipantPackage.Literals.ACTION__TO;

		if (qualify) {
			return getString("_UI_CreateChild_text2", new Object[] {
					getTypeText(childObject), getFeatureText(childFeature),
					getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ScenarioParticipantEditPlugin.INSTANCE;
	}

}
