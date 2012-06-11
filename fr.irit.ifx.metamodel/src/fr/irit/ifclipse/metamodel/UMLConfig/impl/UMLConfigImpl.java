/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup;
import fr.irit.ifclipse.metamodel.UMLConfig.InitialThread;
import fr.irit.ifclipse.metamodel.UMLConfig.Observer;
import fr.irit.ifclipse.metamodel.UMLConfig.Port;
import fr.irit.ifclipse.metamodel.UMLConfig.Time;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>UML Config</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl#getActivityGroups
 * <em>Activity Groups</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl#getInitialThread
 * <em>Initial Thread</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl#getObjects
 * <em>Objects</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl#getPorts
 * <em>Ports</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl#getObservers
 * <em>Observers</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl#getTime
 * <em>Time</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class UMLConfigImpl extends NamedElementImpl implements UMLConfig {
	/**
	 * The cached value of the '{@link #getActivityGroups()
	 * <em>Activity Groups</em>}' containment reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getActivityGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityGroup> activityGroups;
	/**
	 * The cached value of the '{@link #getInitialThread()
	 * <em>Initial Thread</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getInitialThread()
	 * @generated
	 * @ordered
	 */
	protected InitialThread initialThread;
	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<fr.irit.ifclipse.metamodel.UMLConfig.Object> objects;
	/**
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;
	/**
	 * The cached value of the '{@link #getObservers() <em>Observers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObservers()
	 * @generated
	 * @ordered
	 */
	protected EList<Observer> observers;
	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Time time;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected UMLConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLConfigPackage.Literals.UML_CONFIG;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<ActivityGroup> getActivityGroups() {
		if (activityGroups == null) {
			activityGroups = new EObjectContainmentEList<ActivityGroup>(
					ActivityGroup.class, this,
					UMLConfigPackage.UML_CONFIG__ACTIVITY_GROUPS);
		}
		return activityGroups;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InitialThread getInitialThread() {
		return initialThread;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetInitialThread(
			InitialThread newInitialThread, NotificationChain msgs) {
		InitialThread oldInitialThread = initialThread;
		initialThread = newInitialThread;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					UMLConfigPackage.UML_CONFIG__INITIAL_THREAD,
					oldInitialThread, newInitialThread);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setInitialThread(InitialThread newInitialThread) {
		if (newInitialThread != initialThread) {
			NotificationChain msgs = null;
			if (initialThread != null)
				msgs = ((InternalEObject) initialThread).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.UML_CONFIG__INITIAL_THREAD,
						null, msgs);
			if (newInitialThread != null)
				msgs = ((InternalEObject) newInitialThread).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.UML_CONFIG__INITIAL_THREAD,
						null, msgs);
			msgs = basicSetInitialThread(newInitialThread, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.UML_CONFIG__INITIAL_THREAD,
					newInitialThread, newInitialThread));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<fr.irit.ifclipse.metamodel.UMLConfig.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<fr.irit.ifclipse.metamodel.UMLConfig.Object>(
					fr.irit.ifclipse.metamodel.UMLConfig.Object.class, this,
					UMLConfigPackage.UML_CONFIG__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this,
					UMLConfigPackage.UML_CONFIG__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Observer> getObservers() {
		if (observers == null) {
			observers = new EObjectContainmentEList<Observer>(Observer.class,
					this, UMLConfigPackage.UML_CONFIG__OBSERVERS);
		}
		return observers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Time getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTime(Time newTime, NotificationChain msgs) {
		Time oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UMLConfigPackage.UML_CONFIG__TIME,
					oldTime, newTime);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTime(Time newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject) time)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.UML_CONFIG__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject) newTime)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.UML_CONFIG__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.UML_CONFIG__TIME, newTime, newTime));
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
		case UMLConfigPackage.UML_CONFIG__ACTIVITY_GROUPS:
			return ((InternalEList<?>) getActivityGroups()).basicRemove(
					otherEnd, msgs);
		case UMLConfigPackage.UML_CONFIG__INITIAL_THREAD:
			return basicSetInitialThread(null, msgs);
		case UMLConfigPackage.UML_CONFIG__OBJECTS:
			return ((InternalEList<?>) getObjects())
					.basicRemove(otherEnd, msgs);
		case UMLConfigPackage.UML_CONFIG__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case UMLConfigPackage.UML_CONFIG__OBSERVERS:
			return ((InternalEList<?>) getObservers()).basicRemove(otherEnd,
					msgs);
		case UMLConfigPackage.UML_CONFIG__TIME:
			return basicSetTime(null, msgs);
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
		case UMLConfigPackage.UML_CONFIG__ACTIVITY_GROUPS:
			return getActivityGroups();
		case UMLConfigPackage.UML_CONFIG__INITIAL_THREAD:
			return getInitialThread();
		case UMLConfigPackage.UML_CONFIG__OBJECTS:
			return getObjects();
		case UMLConfigPackage.UML_CONFIG__PORTS:
			return getPorts();
		case UMLConfigPackage.UML_CONFIG__OBSERVERS:
			return getObservers();
		case UMLConfigPackage.UML_CONFIG__TIME:
			return getTime();
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
		case UMLConfigPackage.UML_CONFIG__ACTIVITY_GROUPS:
			getActivityGroups().clear();
			getActivityGroups().addAll(
					(Collection<? extends ActivityGroup>) newValue);
			return;
		case UMLConfigPackage.UML_CONFIG__INITIAL_THREAD:
			setInitialThread((InitialThread) newValue);
			return;
		case UMLConfigPackage.UML_CONFIG__OBJECTS:
			getObjects().clear();
			getObjects()
					.addAll((Collection<? extends fr.irit.ifclipse.metamodel.UMLConfig.Object>) newValue);
			return;
		case UMLConfigPackage.UML_CONFIG__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case UMLConfigPackage.UML_CONFIG__OBSERVERS:
			getObservers().clear();
			getObservers().addAll((Collection<? extends Observer>) newValue);
			return;
		case UMLConfigPackage.UML_CONFIG__TIME:
			setTime((Time) newValue);
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
		case UMLConfigPackage.UML_CONFIG__ACTIVITY_GROUPS:
			getActivityGroups().clear();
			return;
		case UMLConfigPackage.UML_CONFIG__INITIAL_THREAD:
			setInitialThread((InitialThread) null);
			return;
		case UMLConfigPackage.UML_CONFIG__OBJECTS:
			getObjects().clear();
			return;
		case UMLConfigPackage.UML_CONFIG__PORTS:
			getPorts().clear();
			return;
		case UMLConfigPackage.UML_CONFIG__OBSERVERS:
			getObservers().clear();
			return;
		case UMLConfigPackage.UML_CONFIG__TIME:
			setTime((Time) null);
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
		case UMLConfigPackage.UML_CONFIG__ACTIVITY_GROUPS:
			return activityGroups != null && !activityGroups.isEmpty();
		case UMLConfigPackage.UML_CONFIG__INITIAL_THREAD:
			return initialThread != null;
		case UMLConfigPackage.UML_CONFIG__OBJECTS:
			return objects != null && !objects.isEmpty();
		case UMLConfigPackage.UML_CONFIG__PORTS:
			return ports != null && !ports.isEmpty();
		case UMLConfigPackage.UML_CONFIG__OBSERVERS:
			return observers != null && !observers.isEmpty();
		case UMLConfigPackage.UML_CONFIG__TIME:
			return time != null;
		}
		return super.eIsSet(featureID);
	}

} // UMLConfigImpl
