/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.Scenario.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.metamodel.IFConfig.Pid;
import fr.irit.ifclipse.metamodel.IFConfig.Transition;
import fr.irit.ifclipse.metamodel.IFConfig.impl.NamedElementImpl;
import fr.irit.ifclipse.metamodel.Scenario.Scenario;
import fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Scenario</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioImpl#getPids <em>
 * Pids</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioImpl#getFiredTransitions
 * <em>Fired Transitions</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ScenarioImpl extends NamedElementImpl implements Scenario {
	/**
	 * The cached value of the '{@link #getPids() <em>Pids</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPids()
	 * @generated
	 * @ordered
	 */
	protected EList<Pid> pids;
	/**
	 * The cached value of the '{@link #getFiredTransitions()
	 * <em>Fired Transitions</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFiredTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> firedTransitions;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ScenarioImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioPackage.Literals.SCENARIO;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Pid> getPids() {
		if (pids == null) {
			pids = new EObjectContainmentEList<Pid>(Pid.class, this,
					ScenarioPackage.SCENARIO__PIDS);
		}
		return pids;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Transition> getFiredTransitions() {
		if (firedTransitions == null) {
			firedTransitions = new EObjectContainmentEList<Transition>(
					Transition.class, this,
					ScenarioPackage.SCENARIO__FIRED_TRANSITIONS);
		}
		return firedTransitions;
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
		case ScenarioPackage.SCENARIO__PIDS:
			return ((InternalEList<?>) getPids()).basicRemove(otherEnd, msgs);
		case ScenarioPackage.SCENARIO__FIRED_TRANSITIONS:
			return ((InternalEList<?>) getFiredTransitions()).basicRemove(
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
		case ScenarioPackage.SCENARIO__PIDS:
			return getPids();
		case ScenarioPackage.SCENARIO__FIRED_TRANSITIONS:
			return getFiredTransitions();
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
		case ScenarioPackage.SCENARIO__PIDS:
			getPids().clear();
			getPids().addAll((Collection<? extends Pid>) newValue);
			return;
		case ScenarioPackage.SCENARIO__FIRED_TRANSITIONS:
			getFiredTransitions().clear();
			getFiredTransitions().addAll(
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
		case ScenarioPackage.SCENARIO__PIDS:
			getPids().clear();
			return;
		case ScenarioPackage.SCENARIO__FIRED_TRANSITIONS:
			getFiredTransitions().clear();
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
		case ScenarioPackage.SCENARIO__PIDS:
			return pids != null && !pids.isEmpty();
		case ScenarioPackage.SCENARIO__FIRED_TRANSITIONS:
			return firedTransitions != null && !firedTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ScenarioImpl
