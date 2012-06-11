/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.Transition;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Enabled Transitions</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.EnabledTransitionsImpl#getEnabledTransitions
 * <em>Enabled Transitions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class EnabledTransitionsImpl extends EObjectImpl implements
		EnabledTransitions {
	/**
	 * The cached value of the '{@link #getEnabledTransitions()
	 * <em>Enabled Transitions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEnabledTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> enabledTransitions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EnabledTransitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFConfigPackage.Literals.ENABLED_TRANSITIONS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Transition> getEnabledTransitions() {
		if (enabledTransitions == null) {
			enabledTransitions = new EObjectContainmentEList<Transition>(
					Transition.class, this,
					IFConfigPackage.ENABLED_TRANSITIONS__ENABLED_TRANSITIONS);
		}
		return enabledTransitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case IFConfigPackage.ENABLED_TRANSITIONS__ENABLED_TRANSITIONS:
			return ((InternalEList<?>) getEnabledTransitions()).basicRemove(
					otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case IFConfigPackage.ENABLED_TRANSITIONS__ENABLED_TRANSITIONS:
			return getEnabledTransitions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case IFConfigPackage.ENABLED_TRANSITIONS__ENABLED_TRANSITIONS:
			getEnabledTransitions().clear();
			getEnabledTransitions().addAll(
					(Collection<? extends Transition>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case IFConfigPackage.ENABLED_TRANSITIONS__ENABLED_TRANSITIONS:
			getEnabledTransitions().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case IFConfigPackage.ENABLED_TRANSITIONS__ENABLED_TRANSITIONS:
			return enabledTransitions != null && !enabledTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // EnabledTransitionsImpl
