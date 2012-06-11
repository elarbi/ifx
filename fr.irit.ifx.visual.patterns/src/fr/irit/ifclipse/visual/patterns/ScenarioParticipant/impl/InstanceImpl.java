/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ParameterSet;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Pid;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Queue;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.State;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.InstanceImpl#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.InstanceImpl#getState
 * <em>State</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.InstanceImpl#getPid
 * <em>Pid</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.InstanceImpl#getQueue
 * <em>Queue</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.InstanceImpl#getVariableSet
 * <em>Variable Set</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.InstanceImpl#getParamaterSet
 * <em>Paramater Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class InstanceImpl extends EObjectImpl implements Instance {
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
	 * The cached value of the '{@link #getState() <em>State</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected State state;

	/**
	 * The cached value of the '{@link #getPid() <em>Pid</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPid()
	 * @generated
	 * @ordered
	 */
	protected Pid pid;

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
	 * The cached value of the '{@link #getVariableSet() <em>Variable Set</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVariableSet()
	 * @generated
	 * @ordered
	 */
	protected VariableSet variableSet;

	/**
	 * The cached value of the '{@link #getParamaterSet()
	 * <em>Paramater Set</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParamaterSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterSet paramaterSet;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected InstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScenarioParticipantPackage.Literals.INSTANCE;
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
					ScenarioParticipantPackage.INSTANCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public State getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetState(State newState,
			NotificationChain msgs) {
		State oldState = state;
		state = newState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ScenarioParticipantPackage.INSTANCE__STATE, oldState,
					newState);
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
	public void setState(State newState) {
		if (newState != state) {
			NotificationChain msgs = null;
			if (state != null)
				msgs = ((InternalEObject) state).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.INSTANCE__STATE,
						null, msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.INSTANCE__STATE,
						null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.INSTANCE__STATE, newState,
					newState));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getPid() {
		return pid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetPid(Pid newPid, NotificationChain msgs) {
		Pid oldPid = pid;
		pid = newPid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScenarioParticipantPackage.INSTANCE__PID,
					oldPid, newPid);
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
	public void setPid(Pid newPid) {
		if (newPid != pid) {
			NotificationChain msgs = null;
			if (pid != null)
				msgs = ((InternalEObject) pid).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.INSTANCE__PID,
						null, msgs);
			if (newPid != null)
				msgs = ((InternalEObject) newPid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.INSTANCE__PID,
						null, msgs);
			msgs = basicSetPid(newPid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.INSTANCE__PID, newPid, newPid));
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
					Notification.SET,
					ScenarioParticipantPackage.INSTANCE__QUEUE, oldQueue,
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
				msgs = ((InternalEObject) queue).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.INSTANCE__QUEUE,
						null, msgs);
			if (newQueue != null)
				msgs = ((InternalEObject) newQueue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.INSTANCE__QUEUE,
						null, msgs);
			msgs = basicSetQueue(newQueue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.INSTANCE__QUEUE, newQueue,
					newQueue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VariableSet getVariableSet() {
		return variableSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetVariableSet(VariableSet newVariableSet,
			NotificationChain msgs) {
		VariableSet oldVariableSet = variableSet;
		variableSet = newVariableSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ScenarioParticipantPackage.INSTANCE__VARIABLE_SET,
					oldVariableSet, newVariableSet);
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
	public void setVariableSet(VariableSet newVariableSet) {
		if (newVariableSet != variableSet) {
			NotificationChain msgs = null;
			if (variableSet != null)
				msgs = ((InternalEObject) variableSet)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ScenarioParticipantPackage.INSTANCE__VARIABLE_SET,
								null, msgs);
			if (newVariableSet != null)
				msgs = ((InternalEObject) newVariableSet)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ScenarioParticipantPackage.INSTANCE__VARIABLE_SET,
								null, msgs);
			msgs = basicSetVariableSet(newVariableSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.INSTANCE__VARIABLE_SET,
					newVariableSet, newVariableSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterSet getParamaterSet() {
		return paramaterSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParamaterSet(ParameterSet newParamaterSet,
			NotificationChain msgs) {
		ParameterSet oldParamaterSet = paramaterSet;
		paramaterSet = newParamaterSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ScenarioParticipantPackage.INSTANCE__PARAMATER_SET,
					oldParamaterSet, newParamaterSet);
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
	public void setParamaterSet(ParameterSet newParamaterSet) {
		if (newParamaterSet != paramaterSet) {
			NotificationChain msgs = null;
			if (paramaterSet != null)
				msgs = ((InternalEObject) paramaterSet)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ScenarioParticipantPackage.INSTANCE__PARAMATER_SET,
								null, msgs);
			if (newParamaterSet != null)
				msgs = ((InternalEObject) newParamaterSet)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ScenarioParticipantPackage.INSTANCE__PARAMATER_SET,
								null, msgs);
			msgs = basicSetParamaterSet(newParamaterSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.INSTANCE__PARAMATER_SET,
					newParamaterSet, newParamaterSet));
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
		case ScenarioParticipantPackage.INSTANCE__STATE:
			return basicSetState(null, msgs);
		case ScenarioParticipantPackage.INSTANCE__PID:
			return basicSetPid(null, msgs);
		case ScenarioParticipantPackage.INSTANCE__QUEUE:
			return basicSetQueue(null, msgs);
		case ScenarioParticipantPackage.INSTANCE__VARIABLE_SET:
			return basicSetVariableSet(null, msgs);
		case ScenarioParticipantPackage.INSTANCE__PARAMATER_SET:
			return basicSetParamaterSet(null, msgs);
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
		case ScenarioParticipantPackage.INSTANCE__TYPE:
			return getType();
		case ScenarioParticipantPackage.INSTANCE__STATE:
			return getState();
		case ScenarioParticipantPackage.INSTANCE__PID:
			return getPid();
		case ScenarioParticipantPackage.INSTANCE__QUEUE:
			return getQueue();
		case ScenarioParticipantPackage.INSTANCE__VARIABLE_SET:
			return getVariableSet();
		case ScenarioParticipantPackage.INSTANCE__PARAMATER_SET:
			return getParamaterSet();
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
		case ScenarioParticipantPackage.INSTANCE__TYPE:
			setType((String) newValue);
			return;
		case ScenarioParticipantPackage.INSTANCE__STATE:
			setState((State) newValue);
			return;
		case ScenarioParticipantPackage.INSTANCE__PID:
			setPid((Pid) newValue);
			return;
		case ScenarioParticipantPackage.INSTANCE__QUEUE:
			setQueue((Queue) newValue);
			return;
		case ScenarioParticipantPackage.INSTANCE__VARIABLE_SET:
			setVariableSet((VariableSet) newValue);
			return;
		case ScenarioParticipantPackage.INSTANCE__PARAMATER_SET:
			setParamaterSet((ParameterSet) newValue);
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
		case ScenarioParticipantPackage.INSTANCE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case ScenarioParticipantPackage.INSTANCE__STATE:
			setState((State) null);
			return;
		case ScenarioParticipantPackage.INSTANCE__PID:
			setPid((Pid) null);
			return;
		case ScenarioParticipantPackage.INSTANCE__QUEUE:
			setQueue((Queue) null);
			return;
		case ScenarioParticipantPackage.INSTANCE__VARIABLE_SET:
			setVariableSet((VariableSet) null);
			return;
		case ScenarioParticipantPackage.INSTANCE__PARAMATER_SET:
			setParamaterSet((ParameterSet) null);
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
		case ScenarioParticipantPackage.INSTANCE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case ScenarioParticipantPackage.INSTANCE__STATE:
			return state != null;
		case ScenarioParticipantPackage.INSTANCE__PID:
			return pid != null;
		case ScenarioParticipantPackage.INSTANCE__QUEUE:
			return queue != null;
		case ScenarioParticipantPackage.INSTANCE__VARIABLE_SET:
			return variableSet != null;
		case ScenarioParticipantPackage.INSTANCE__PARAMATER_SET:
			return paramaterSet != null;
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

} // InstanceImpl
