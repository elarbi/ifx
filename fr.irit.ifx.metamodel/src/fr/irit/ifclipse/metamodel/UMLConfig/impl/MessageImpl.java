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
import org.eclipse.emf.ecore.impl.EObjectImpl;

import fr.irit.ifclipse.metamodel.UMLConfig.Message;
import fr.irit.ifclipse.metamodel.UMLConfig.Pid;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.MessageImpl#getSignalType
 * <em>Signal Type</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.MessageImpl#getDestinationPid
 * <em>Destination Pid</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MessageImpl extends EObjectImpl implements Message {
	/**
	 * The default value of the '{@link #getSignalType() <em>Signal Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNAL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignalType() <em>Signal Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSignalType()
	 * @generated
	 * @ordered
	 */
	protected String signalType = SIGNAL_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestinationPid()
	 * <em>Destination Pid</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getDestinationPid()
	 * @generated
	 * @ordered
	 */
	protected Pid destinationPid;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLConfigPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getSignalType() {
		return signalType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSignalType(String newSignalType) {
		String oldSignalType = signalType;
		signalType = newSignalType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.MESSAGE__SIGNAL_TYPE, oldSignalType,
					signalType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getDestinationPid() {
		return destinationPid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetDestinationPid(Pid newDestinationPid,
			NotificationChain msgs) {
		Pid oldDestinationPid = destinationPid;
		destinationPid = newDestinationPid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					UMLConfigPackage.MESSAGE__DESTINATION_PID,
					oldDestinationPid, newDestinationPid);
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
	public void setDestinationPid(Pid newDestinationPid) {
		if (newDestinationPid != destinationPid) {
			NotificationChain msgs = null;
			if (destinationPid != null)
				msgs = ((InternalEObject) destinationPid).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.MESSAGE__DESTINATION_PID,
						null, msgs);
			if (newDestinationPid != null)
				msgs = ((InternalEObject) newDestinationPid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.MESSAGE__DESTINATION_PID,
						null, msgs);
			msgs = basicSetDestinationPid(newDestinationPid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.MESSAGE__DESTINATION_PID,
					newDestinationPid, newDestinationPid));
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
		case UMLConfigPackage.MESSAGE__DESTINATION_PID:
			return basicSetDestinationPid(null, msgs);
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
		case UMLConfigPackage.MESSAGE__SIGNAL_TYPE:
			return getSignalType();
		case UMLConfigPackage.MESSAGE__DESTINATION_PID:
			return getDestinationPid();
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
		case UMLConfigPackage.MESSAGE__SIGNAL_TYPE:
			setSignalType((String) newValue);
			return;
		case UMLConfigPackage.MESSAGE__DESTINATION_PID:
			setDestinationPid((Pid) newValue);
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
		case UMLConfigPackage.MESSAGE__SIGNAL_TYPE:
			setSignalType(SIGNAL_TYPE_EDEFAULT);
			return;
		case UMLConfigPackage.MESSAGE__DESTINATION_PID:
			setDestinationPid((Pid) null);
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
		case UMLConfigPackage.MESSAGE__SIGNAL_TYPE:
			return SIGNAL_TYPE_EDEFAULT == null ? signalType != null
					: !SIGNAL_TYPE_EDEFAULT.equals(signalType);
		case UMLConfigPackage.MESSAGE__DESTINATION_PID:
			return destinationPid != null;
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
		result.append(" (signalType: ");
		result.append(signalType);
		result.append(')');
		return result.toString();
	}

} // MessageImpl
