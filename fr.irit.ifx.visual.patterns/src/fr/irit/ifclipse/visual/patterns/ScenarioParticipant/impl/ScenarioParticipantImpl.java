/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ObserverInstance;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Scenario Participant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.ScenarioParticipantImpl#getInstances
 * <em>Instances</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.ScenarioParticipantImpl#getObservers
 * <em>Observers</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ScenarioParticipantImpl extends NamedElementImpl implements
		ScenarioParticipant {
	/**
	 * The cached value of the '{@link #getInstances() <em>Instances</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<Instance> instances;

	/**
	 * The cached value of the '{@link #getObservers() <em>Observers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObservers()
	 * @generated
	 * @ordered
	 */
	protected EList<ObserverInstance> observers;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ScenarioParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioParticipantPackage.Literals.SCENARIO_PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Instance>(Instance.class,
					this,
					ScenarioParticipantPackage.SCENARIO_PARTICIPANT__INSTANCES);
		}
		return instances;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ObserverInstance> getObservers() {
		if (observers == null) {
			observers = new EObjectContainmentEList<ObserverInstance>(
					ObserverInstance.class, this,
					ScenarioParticipantPackage.SCENARIO_PARTICIPANT__OBSERVERS);
		}
		return observers;
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
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd,
					msgs);
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__OBSERVERS:
			return ((InternalEList<?>) getObservers()).basicRemove(otherEnd,
					msgs);
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
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__INSTANCES:
			return getInstances();
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__OBSERVERS:
			return getObservers();
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
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Instance>) newValue);
			return;
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__OBSERVERS:
			getObservers().clear();
			getObservers().addAll(
					(Collection<? extends ObserverInstance>) newValue);
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
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__INSTANCES:
			getInstances().clear();
			return;
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__OBSERVERS:
			getObservers().clear();
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
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__INSTANCES:
			return instances != null && !instances.isEmpty();
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT__OBSERVERS:
			return observers != null && !observers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ScenarioParticipantImpl
