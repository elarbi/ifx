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

import fr.irit.ifclipse.metamodel.UMLConfig.Port;
import fr.irit.ifclipse.metamodel.UMLConfig.Queue;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Object</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObjectImpl#getType <em>
 * Type</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObjectImpl#getPorts <em>
 * Ports</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObjectImpl#getQueue <em>
 * Queue</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ObjectImpl extends EntityImpl implements
		fr.irit.ifclipse.metamodel.UMLConfig.Object {
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The cached value of the '{@link #getQueue() <em>Queue</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getQueue()
	 * @generated
	 * @ordered
	 */
	protected Queue queue;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLConfigPackage.Literals.OBJECT;
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
					UMLConfigPackage.OBJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentEList<Port>(Port.class, this,
					UMLConfigPackage.OBJECT__PORTS);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Queue getQueue() {
		return queue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetQueue(Queue newQueue,
			NotificationChain msgs) {
		Queue oldQueue = queue;
		queue = newQueue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UMLConfigPackage.OBJECT__QUEUE, oldQueue,
					newQueue);
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
	public void setQueue(Queue newQueue) {
		if (newQueue != queue) {
			NotificationChain msgs = null;
			if (queue != null)
				msgs = ((InternalEObject) queue)
						.eInverseRemove(this, EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.OBJECT__QUEUE, null, msgs);
			if (newQueue != null)
				msgs = ((InternalEObject) newQueue)
						.eInverseAdd(this, EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.OBJECT__QUEUE, null, msgs);
			msgs = basicSetQueue(newQueue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.OBJECT__QUEUE, newQueue, newQueue));
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
		case UMLConfigPackage.OBJECT__PORTS:
			return ((InternalEList<?>) getPorts()).basicRemove(otherEnd, msgs);
		case UMLConfigPackage.OBJECT__QUEUE:
			return basicSetQueue(null, msgs);
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
		case UMLConfigPackage.OBJECT__TYPE:
			return getType();
		case UMLConfigPackage.OBJECT__PORTS:
			return getPorts();
		case UMLConfigPackage.OBJECT__QUEUE:
			return getQueue();
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
		case UMLConfigPackage.OBJECT__TYPE:
			setType((String) newValue);
			return;
		case UMLConfigPackage.OBJECT__PORTS:
			getPorts().clear();
			getPorts().addAll((Collection<? extends Port>) newValue);
			return;
		case UMLConfigPackage.OBJECT__QUEUE:
			setQueue((Queue) newValue);
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
		case UMLConfigPackage.OBJECT__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case UMLConfigPackage.OBJECT__PORTS:
			getPorts().clear();
			return;
		case UMLConfigPackage.OBJECT__QUEUE:
			setQueue((Queue) null);
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
		case UMLConfigPackage.OBJECT__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case UMLConfigPackage.OBJECT__PORTS:
			return ports != null && !ports.isEmpty();
		case UMLConfigPackage.OBJECT__QUEUE:
			return queue != null;
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

} // ObjectImpl
