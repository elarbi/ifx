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

import fr.irit.ifclipse.metamodel.UMLConfig.CallStack;
import fr.irit.ifclipse.metamodel.UMLConfig.InitialThread;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Initial Thread</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.InitialThreadImpl#getCallStack
 * <em>Call Stack</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InitialThreadImpl extends EntityImpl implements InitialThread {
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
	protected InitialThreadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UMLConfigPackage.Literals.INITIAL_THREAD;
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
					UMLConfigPackage.INITIAL_THREAD__CALL_STACK, oldCallStack,
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
								- UMLConfigPackage.INITIAL_THREAD__CALL_STACK,
						null, msgs);
			if (newCallStack != null)
				msgs = ((InternalEObject) newCallStack).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.INITIAL_THREAD__CALL_STACK,
						null, msgs);
			msgs = basicSetCallStack(newCallStack, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.INITIAL_THREAD__CALL_STACK, newCallStack,
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
		case UMLConfigPackage.INITIAL_THREAD__CALL_STACK:
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
		case UMLConfigPackage.INITIAL_THREAD__CALL_STACK:
			return getCallStack();
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
		case UMLConfigPackage.INITIAL_THREAD__CALL_STACK:
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
		case UMLConfigPackage.INITIAL_THREAD__CALL_STACK:
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
		case UMLConfigPackage.INITIAL_THREAD__CALL_STACK:
			return callStack != null;
		}
		return super.eIsSet(featureID);
	}

} // InitialThreadImpl
