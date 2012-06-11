/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import fr.irit.ifclipse.metamodel.IFConfig.Cut;
import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance;
import fr.irit.ifclipse.metamodel.IFConfig.ParameterSet;
import fr.irit.ifclipse.metamodel.IFConfig.Pid;
import fr.irit.ifclipse.metamodel.IFConfig.Queue;
import fr.irit.ifclipse.metamodel.IFConfig.State;
import fr.irit.ifclipse.metamodel.IFConfig.Status;
import fr.irit.ifclipse.metamodel.IFConfig.VariableSet;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Observer Instance</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getState
 * <em>State</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getPid
 * <em>Pid</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getQueue
 * <em>Queue</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getVariableSet
 * <em>Variable Set</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getParamaterSet
 * <em>Paramater Set</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getEventSet
 * <em>Event Set</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getStatus
 * <em>Status</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl#getCut
 * <em>Cut</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ObserverInstanceImpl extends EObjectImpl implements
		ObserverInstance {
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
	 * The cached value of the '{@link #getEventSet() <em>Event Set</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getEventSet()
	 * @generated
	 * @ordered
	 */
	protected EnabledTransitions eventSet;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected Status status;

	/**
	 * The cached value of the '{@link #getCut() <em>Cut</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getCut()
	 * @generated
	 * @ordered
	 */
	protected Cut cut;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ObserverInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFConfigPackage.Literals.OBSERVER_INSTANCE;
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
					IFConfigPackage.OBSERVER_INSTANCE__TYPE, oldType, type));
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
					Notification.SET, IFConfigPackage.OBSERVER_INSTANCE__STATE,
					oldState, newState);
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
								- IFConfigPackage.OBSERVER_INSTANCE__STATE,
						null, msgs);
			if (newState != null)
				msgs = ((InternalEObject) newState).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__STATE,
						null, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__STATE, newState,
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
					Notification.SET, IFConfigPackage.OBSERVER_INSTANCE__PID,
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
								- IFConfigPackage.OBSERVER_INSTANCE__PID, null,
						msgs);
			if (newPid != null)
				msgs = ((InternalEObject) newPid).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__PID, null,
						msgs);
			msgs = basicSetPid(newPid, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__PID, newPid, newPid));
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
					Notification.SET, IFConfigPackage.OBSERVER_INSTANCE__QUEUE,
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
								- IFConfigPackage.OBSERVER_INSTANCE__QUEUE,
						null, msgs);
			if (newQueue != null)
				msgs = ((InternalEObject) newQueue).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__QUEUE,
						null, msgs);
			msgs = basicSetQueue(newQueue, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__QUEUE, newQueue,
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
					IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET,
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
										- IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET,
								null, msgs);
			if (newVariableSet != null)
				msgs = ((InternalEObject) newVariableSet)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET,
								null, msgs);
			msgs = basicSetVariableSet(newVariableSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET,
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
					IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET,
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
										- IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET,
								null, msgs);
			if (newParamaterSet != null)
				msgs = ((InternalEObject) newParamaterSet)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET,
								null, msgs);
			msgs = basicSetParamaterSet(newParamaterSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET,
					newParamaterSet, newParamaterSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnabledTransitions getEventSet() {
		return eventSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetEventSet(EnabledTransitions newEventSet,
			NotificationChain msgs) {
		EnabledTransitions oldEventSet = eventSet;
		eventSet = newEventSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET, oldEventSet,
					newEventSet);
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
	public void setEventSet(EnabledTransitions newEventSet) {
		if (newEventSet != eventSet) {
			NotificationChain msgs = null;
			if (eventSet != null)
				msgs = ((InternalEObject) eventSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET,
						null, msgs);
			if (newEventSet != null)
				msgs = ((InternalEObject) newEventSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET,
						null, msgs);
			msgs = basicSetEventSet(newEventSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET, newEventSet,
					newEventSet));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Status getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetStatus(Status newStatus,
			NotificationChain msgs) {
		Status oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__STATUS, oldStatus,
					newStatus);
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
	public void setStatus(Status newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject) status).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__STATUS,
						null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject) newStatus).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__STATUS,
						null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__STATUS, newStatus,
					newStatus));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Cut getCut() {
		return cut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetCut(Cut newCut, NotificationChain msgs) {
		Cut oldCut = cut;
		cut = newCut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, IFConfigPackage.OBSERVER_INSTANCE__CUT,
					oldCut, newCut);
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
	public void setCut(Cut newCut) {
		if (newCut != cut) {
			NotificationChain msgs = null;
			if (cut != null)
				msgs = ((InternalEObject) cut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__CUT, null,
						msgs);
			if (newCut != null)
				msgs = ((InternalEObject) newCut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.OBSERVER_INSTANCE__CUT, null,
						msgs);
			msgs = basicSetCut(newCut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.OBSERVER_INSTANCE__CUT, newCut, newCut));
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
		case IFConfigPackage.OBSERVER_INSTANCE__STATE:
			return basicSetState(null, msgs);
		case IFConfigPackage.OBSERVER_INSTANCE__PID:
			return basicSetPid(null, msgs);
		case IFConfigPackage.OBSERVER_INSTANCE__QUEUE:
			return basicSetQueue(null, msgs);
		case IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET:
			return basicSetVariableSet(null, msgs);
		case IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET:
			return basicSetParamaterSet(null, msgs);
		case IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET:
			return basicSetEventSet(null, msgs);
		case IFConfigPackage.OBSERVER_INSTANCE__STATUS:
			return basicSetStatus(null, msgs);
		case IFConfigPackage.OBSERVER_INSTANCE__CUT:
			return basicSetCut(null, msgs);
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
		case IFConfigPackage.OBSERVER_INSTANCE__TYPE:
			return getType();
		case IFConfigPackage.OBSERVER_INSTANCE__STATE:
			return getState();
		case IFConfigPackage.OBSERVER_INSTANCE__PID:
			return getPid();
		case IFConfigPackage.OBSERVER_INSTANCE__QUEUE:
			return getQueue();
		case IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET:
			return getVariableSet();
		case IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET:
			return getParamaterSet();
		case IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET:
			return getEventSet();
		case IFConfigPackage.OBSERVER_INSTANCE__STATUS:
			return getStatus();
		case IFConfigPackage.OBSERVER_INSTANCE__CUT:
			return getCut();
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
		case IFConfigPackage.OBSERVER_INSTANCE__TYPE:
			setType((String) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__STATE:
			setState((State) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__PID:
			setPid((Pid) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__QUEUE:
			setQueue((Queue) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET:
			setVariableSet((VariableSet) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET:
			setParamaterSet((ParameterSet) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET:
			setEventSet((EnabledTransitions) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__STATUS:
			setStatus((Status) newValue);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__CUT:
			setCut((Cut) newValue);
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
		case IFConfigPackage.OBSERVER_INSTANCE__TYPE:
			setType(TYPE_EDEFAULT);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__STATE:
			setState((State) null);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__PID:
			setPid((Pid) null);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__QUEUE:
			setQueue((Queue) null);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET:
			setVariableSet((VariableSet) null);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET:
			setParamaterSet((ParameterSet) null);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET:
			setEventSet((EnabledTransitions) null);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__STATUS:
			setStatus((Status) null);
			return;
		case IFConfigPackage.OBSERVER_INSTANCE__CUT:
			setCut((Cut) null);
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
		case IFConfigPackage.OBSERVER_INSTANCE__TYPE:
			return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT
					.equals(type);
		case IFConfigPackage.OBSERVER_INSTANCE__STATE:
			return state != null;
		case IFConfigPackage.OBSERVER_INSTANCE__PID:
			return pid != null;
		case IFConfigPackage.OBSERVER_INSTANCE__QUEUE:
			return queue != null;
		case IFConfigPackage.OBSERVER_INSTANCE__VARIABLE_SET:
			return variableSet != null;
		case IFConfigPackage.OBSERVER_INSTANCE__PARAMATER_SET:
			return paramaterSet != null;
		case IFConfigPackage.OBSERVER_INSTANCE__EVENT_SET:
			return eventSet != null;
		case IFConfigPackage.OBSERVER_INSTANCE__STATUS:
			return status != null;
		case IFConfigPackage.OBSERVER_INSTANCE__CUT:
			return cut != null;
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

} // ObserverInstanceImpl
