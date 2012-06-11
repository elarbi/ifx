/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.irit.ifclipse.metamodel.UMLConfig.EventSet;
import fr.irit.ifclipse.metamodel.UMLConfig.Observer;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Observer</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObserverImpl#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObserverImpl#getEventSet
 * <em>Event Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ObserverImpl extends EntityImpl implements Observer {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getEventSet() <em>Event Set</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEventSet()
	 * @generated
	 * @ordered
	 */
	protected EventSet eventSet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ObserverImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLConfigPackage.Literals.OBSERVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.OBSERVER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventSet getEventSet() {
		return eventSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEventSet(EventSet newEventSet,
			NotificationChain msgs) {
		EventSet oldEventSet = eventSet;
		eventSet = newEventSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UMLConfigPackage.OBSERVER__EVENT_SET,
					oldEventSet, newEventSet);
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
	public void setEventSet(EventSet newEventSet) {
		if (newEventSet != eventSet) {
			NotificationChain msgs = null;
			if (eventSet != null)
				msgs = ((InternalEObject) eventSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.OBSERVER__EVENT_SET, null,
						msgs);
			if (newEventSet != null)
				msgs = ((InternalEObject) newEventSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.OBSERVER__EVENT_SET, null,
						msgs);
			msgs = basicSetEventSet(newEventSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.OBSERVER__EVENT_SET, newEventSet,
					newEventSet));
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
		case UMLConfigPackage.OBSERVER__EVENT_SET:
			return basicSetEventSet(null, msgs);
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
		case UMLConfigPackage.OBSERVER__TYPE:
			return getType();
		case UMLConfigPackage.OBSERVER__EVENT_SET:
			return getEventSet();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case UMLConfigPackage.OBSERVER__TYPE:
			setType((String) newValue);
			return;
		case UMLConfigPackage.OBSERVER__EVENT_SET:
			setEventSet((EventSet) newValue);
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
		case UMLConfigPackage.OBSERVER__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case UMLConfigPackage.OBSERVER__EVENT_SET:
			setEventSet((EventSet) null);
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
		case UMLConfigPackage.OBSERVER__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case UMLConfigPackage.OBSERVER__EVENT_SET:
			return eventSet != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} // ObserverImpl
