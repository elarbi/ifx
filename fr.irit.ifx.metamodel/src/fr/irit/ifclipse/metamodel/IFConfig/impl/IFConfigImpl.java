/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.metamodel.IFConfig.Clock;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfig;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.Instance;
import fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>IF Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl#getInstances
 * <em>Instances</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl#getObservers
 * <em>Observers</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl#getClocks
 * <em>Clocks</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl#getTimeConstraint
 * <em>Time Constraint</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class IFConfigImpl extends NamedElementImpl implements IFConfig {
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
	 * The cached value of the '{@link #getClocks() <em>Clocks</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getClocks()
	 * @generated
	 * @ordered
	 */
	protected EList<Clock> clocks;

	/**
	 * The default value of the '{@link #getTimeConstraint()
	 * <em>Time Constraint</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_CONSTRAINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeConstraint()
	 * <em>Time Constraint</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTimeConstraint()
	 * @generated
	 * @ordered
	 */
	protected String timeConstraint = TIME_CONSTRAINT_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IFConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFConfigPackage.Literals.IF_CONFIG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Instance> getInstances() {
		if (instances == null) {
			instances = new EObjectContainmentEList<Instance>(Instance.class,
					this, IFConfigPackage.IF_CONFIG__INSTANCES);
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
					IFConfigPackage.IF_CONFIG__OBSERVERS);
		}
		return observers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Clock> getClocks() {
		if (clocks == null) {
			clocks = new EObjectContainmentEList<Clock>(Clock.class, this,
					IFConfigPackage.IF_CONFIG__CLOCKS);
		}
		return clocks;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTimeConstraint() {
		return timeConstraint;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTimeConstraint(String newTimeConstraint) {
		String oldTimeConstraint = timeConstraint;
		timeConstraint = newTimeConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.IF_CONFIG__TIME_CONSTRAINT,
					oldTimeConstraint, timeConstraint));
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
		case IFConfigPackage.IF_CONFIG__INSTANCES:
			return ((InternalEList<?>) getInstances()).basicRemove(otherEnd,
					msgs);
		case IFConfigPackage.IF_CONFIG__OBSERVERS:
			return ((InternalEList<?>) getObservers()).basicRemove(otherEnd,
					msgs);
		case IFConfigPackage.IF_CONFIG__CLOCKS:
			return ((InternalEList<?>) getClocks()).basicRemove(otherEnd, msgs);
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
		case IFConfigPackage.IF_CONFIG__INSTANCES:
			return getInstances();
		case IFConfigPackage.IF_CONFIG__OBSERVERS:
			return getObservers();
		case IFConfigPackage.IF_CONFIG__CLOCKS:
			return getClocks();
		case IFConfigPackage.IF_CONFIG__TIME_CONSTRAINT:
			return getTimeConstraint();
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
		case IFConfigPackage.IF_CONFIG__INSTANCES:
			getInstances().clear();
			getInstances().addAll((Collection<? extends Instance>) newValue);
			return;
		case IFConfigPackage.IF_CONFIG__OBSERVERS:
			getObservers().clear();
			getObservers().addAll(
					(Collection<? extends ObserverInstance>) newValue);
			return;
		case IFConfigPackage.IF_CONFIG__CLOCKS:
			getClocks().clear();
			getClocks().addAll((Collection<? extends Clock>) newValue);
			return;
		case IFConfigPackage.IF_CONFIG__TIME_CONSTRAINT:
			setTimeConstraint((String) newValue);
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
		case IFConfigPackage.IF_CONFIG__INSTANCES:
			getInstances().clear();
			return;
		case IFConfigPackage.IF_CONFIG__OBSERVERS:
			getObservers().clear();
			return;
		case IFConfigPackage.IF_CONFIG__CLOCKS:
			getClocks().clear();
			return;
		case IFConfigPackage.IF_CONFIG__TIME_CONSTRAINT:
			setTimeConstraint(TIME_CONSTRAINT_EDEFAULT);
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
		case IFConfigPackage.IF_CONFIG__INSTANCES:
			return instances != null && !instances.isEmpty();
		case IFConfigPackage.IF_CONFIG__OBSERVERS:
			return observers != null && !observers.isEmpty();
		case IFConfigPackage.IF_CONFIG__CLOCKS:
			return clocks != null && !clocks.isEmpty();
		case IFConfigPackage.IF_CONFIG__TIME_CONSTRAINT:
			return TIME_CONSTRAINT_EDEFAULT == null ? timeConstraint != null
					: !TIME_CONSTRAINT_EDEFAULT.equals(timeConstraint);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (timeConstraint: ");
		result.append(timeConstraint);
		result.append(')');
		return result.toString();
	}

} // IFConfigImpl
