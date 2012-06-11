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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup;
import fr.irit.ifclipse.metamodel.UMLConfig.CallStack;
import fr.irit.ifclipse.metamodel.UMLConfig.Queue;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Activity Group</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl#getNo
 * <em>No</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl#getObjects
 * <em>Objects</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl#getQueue
 * <em>Queue</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl#getRuning
 * <em>Runing</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl#getCallStack
 * <em>Call Stack</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ActivityGroupImpl extends EntityImpl implements ActivityGroup {
	/**
	 * The default value of the '{@link #getNo() <em>No</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected static final int NO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNo() <em>No</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNo()
	 * @generated
	 * @ordered
	 */
	protected int no = NO_EDEFAULT;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<fr.irit.ifclipse.metamodel.UMLConfig.Object> objects;

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
	 * The cached value of the '{@link #getRuning() <em>Runing</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRuning()
	 * @generated
	 * @ordered
	 */
	protected fr.irit.ifclipse.metamodel.UMLConfig.Object runing;

	/**
	 * The cached value of the '{@link #getCallStack() <em>Call Stack</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCallStack()
	 * @generated
	 * @ordered
	 */
	protected CallStack callStack;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActivityGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLConfigPackage.Literals.ACTIVITY_GROUP;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getNo() {
		return no;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNo(int newNo) {
		int oldNo = no;
		no = newNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTIVITY_GROUP__NO, oldNo, no));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<fr.irit.ifclipse.metamodel.UMLConfig.Object> getObjects() {
		if (objects == null) {
			objects = new EObjectResolvingEList<fr.irit.ifclipse.metamodel.UMLConfig.Object>(
					fr.irit.ifclipse.metamodel.UMLConfig.Object.class, this,
					UMLConfigPackage.ACTIVITY_GROUP__OBJECTS);
		}
		return objects;
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
					Notification.SET, UMLConfigPackage.ACTIVITY_GROUP__QUEUE,
					oldQueue, newQueue);
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
				msgs = ((InternalEObject) queue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.ACTIVITY_GROUP__QUEUE, null,
						msgs);
			if (newQueue != null)
				msgs = ((InternalEObject) newQueue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.ACTIVITY_GROUP__QUEUE, null,
						msgs);
			msgs = basicSetQueue(newQueue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTIVITY_GROUP__QUEUE, newQueue, newQueue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public fr.irit.ifclipse.metamodel.UMLConfig.Object getRuning() {
		if (runing != null && runing.eIsProxy()) {
			InternalEObject oldRuning = (InternalEObject) runing;
			runing = (fr.irit.ifclipse.metamodel.UMLConfig.Object) eResolveProxy(oldRuning);
			if (runing != oldRuning) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							UMLConfigPackage.ACTIVITY_GROUP__RUNING, oldRuning,
							runing));
			}
		}
		return runing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public fr.irit.ifclipse.metamodel.UMLConfig.Object basicGetRuning() {
		return runing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRuning(fr.irit.ifclipse.metamodel.UMLConfig.Object newRuning) {
		fr.irit.ifclipse.metamodel.UMLConfig.Object oldRuning = runing;
		runing = newRuning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTIVITY_GROUP__RUNING, oldRuning, runing));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallStack getCallStack() {
		return callStack;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCallStack(CallStack newCallStack,
			NotificationChain msgs) {
		CallStack oldCallStack = callStack;
		callStack = newCallStack;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK, oldCallStack,
					newCallStack);
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
	public void setCallStack(CallStack newCallStack) {
		if (newCallStack != callStack) {
			NotificationChain msgs = null;
			if (callStack != null)
				msgs = ((InternalEObject) callStack).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK,
						null, msgs);
			if (newCallStack != null)
				msgs = ((InternalEObject) newCallStack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK,
						null, msgs);
			msgs = basicSetCallStack(newCallStack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK, newCallStack,
					newCallStack));
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
		case UMLConfigPackage.ACTIVITY_GROUP__QUEUE:
			return basicSetQueue(null, msgs);
		case UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK:
			return basicSetCallStack(null, msgs);
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
		case UMLConfigPackage.ACTIVITY_GROUP__NO:
			return getNo();
		case UMLConfigPackage.ACTIVITY_GROUP__OBJECTS:
			return getObjects();
		case UMLConfigPackage.ACTIVITY_GROUP__QUEUE:
			return getQueue();
		case UMLConfigPackage.ACTIVITY_GROUP__RUNING:
			if (resolve)
				return getRuning();
			return basicGetRuning();
		case UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK:
			return getCallStack();
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
		case UMLConfigPackage.ACTIVITY_GROUP__NO:
			setNo((Integer) newValue);
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__OBJECTS:
			getObjects().clear();
			getObjects()
					.addAll((Collection<? extends fr.irit.ifclipse.metamodel.UMLConfig.Object>) newValue);
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__QUEUE:
			setQueue((Queue) newValue);
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__RUNING:
			setRuning((fr.irit.ifclipse.metamodel.UMLConfig.Object) newValue);
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK:
			setCallStack((CallStack) newValue);
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
		case UMLConfigPackage.ACTIVITY_GROUP__NO:
			setNo(NO_EDEFAULT);
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__OBJECTS:
			getObjects().clear();
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__QUEUE:
			setQueue((Queue) null);
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__RUNING:
			setRuning((fr.irit.ifclipse.metamodel.UMLConfig.Object) null);
			return;
		case UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK:
			setCallStack((CallStack) null);
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
		case UMLConfigPackage.ACTIVITY_GROUP__NO:
			return no != NO_EDEFAULT;
		case UMLConfigPackage.ACTIVITY_GROUP__OBJECTS:
			return objects != null && !objects.isEmpty();
		case UMLConfigPackage.ACTIVITY_GROUP__QUEUE:
			return queue != null;
		case UMLConfigPackage.ACTIVITY_GROUP__RUNING:
			return runing != null;
		case UMLConfigPackage.ACTIVITY_GROUP__CALL_STACK:
			return callStack != null;
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
		result.append(" (no: ");
		result.append(no);
		result.append(')');
		return result.toString();
	}

} // ActivityGroupImpl
