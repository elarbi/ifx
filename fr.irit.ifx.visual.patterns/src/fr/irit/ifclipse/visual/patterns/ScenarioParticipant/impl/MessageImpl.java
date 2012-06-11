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

import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ParameterSet;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Pid;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.MessageImpl#getSignalType
 * <em>Signal Type</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.MessageImpl#getFrom
 * <em>From</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.MessageImpl#getTo
 * <em>To</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl.MessageImpl#getParameterSet
 * <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MessageImpl extends NamedElementImpl implements Message {
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Pid from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected Pid to;

	/**
	 * The cached value of the '{@link #getParameterSet()
	 * <em>Parameter Set</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see #getParameterSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterSet parameterSet;

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
		return ScenarioParticipantPackage.Literals.MESSAGE;
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
					ScenarioParticipantPackage.MESSAGE__SIGNAL_TYPE,
					oldSignalType, signalType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetFrom(Pid newFrom, NotificationChain msgs) {
		Pid oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScenarioParticipantPackage.MESSAGE__FROM,
					oldFrom, newFrom);
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
	public void setFrom(Pid newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject) from).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.MESSAGE__FROM,
						null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject) newFrom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.MESSAGE__FROM,
						null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.MESSAGE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTo(Pid newTo, NotificationChain msgs) {
		Pid oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, ScenarioParticipantPackage.MESSAGE__TO,
					oldTo, newTo);
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
	public void setTo(Pid newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject) to).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.MESSAGE__TO, null,
						msgs);
			if (newTo != null)
				msgs = ((InternalEObject) newTo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- ScenarioParticipantPackage.MESSAGE__TO, null,
						msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.MESSAGE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterSet getParameterSet() {
		return parameterSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetParameterSet(ParameterSet newParameterSet,
			NotificationChain msgs) {
		ParameterSet oldParameterSet = parameterSet;
		parameterSet = newParameterSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ScenarioParticipantPackage.MESSAGE__PARAMETER_SET,
					oldParameterSet, newParameterSet);
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
	public void setParameterSet(ParameterSet newParameterSet) {
		if (newParameterSet != parameterSet) {
			NotificationChain msgs = null;
			if (parameterSet != null)
				msgs = ((InternalEObject) parameterSet)
						.eInverseRemove(
								this,
								EOPPOSITE_FEATURE_BASE
										- ScenarioParticipantPackage.MESSAGE__PARAMETER_SET,
								null, msgs);
			if (newParameterSet != null)
				msgs = ((InternalEObject) newParameterSet)
						.eInverseAdd(
								this,
								EOPPOSITE_FEATURE_BASE
										- ScenarioParticipantPackage.MESSAGE__PARAMETER_SET,
								null, msgs);
			msgs = basicSetParameterSet(newParameterSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ScenarioParticipantPackage.MESSAGE__PARAMETER_SET,
					newParameterSet, newParameterSet));
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
		case ScenarioParticipantPackage.MESSAGE__FROM:
			return basicSetFrom(null, msgs);
		case ScenarioParticipantPackage.MESSAGE__TO:
			return basicSetTo(null, msgs);
		case ScenarioParticipantPackage.MESSAGE__PARAMETER_SET:
			return basicSetParameterSet(null, msgs);
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
		case ScenarioParticipantPackage.MESSAGE__SIGNAL_TYPE:
			return getSignalType();
		case ScenarioParticipantPackage.MESSAGE__FROM:
			return getFrom();
		case ScenarioParticipantPackage.MESSAGE__TO:
			return getTo();
		case ScenarioParticipantPackage.MESSAGE__PARAMETER_SET:
			return getParameterSet();
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
		case ScenarioParticipantPackage.MESSAGE__SIGNAL_TYPE:
			setSignalType((String) newValue);
			return;
		case ScenarioParticipantPackage.MESSAGE__FROM:
			setFrom((Pid) newValue);
			return;
		case ScenarioParticipantPackage.MESSAGE__TO:
			setTo((Pid) newValue);
			return;
		case ScenarioParticipantPackage.MESSAGE__PARAMETER_SET:
			setParameterSet((ParameterSet) newValue);
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
		case ScenarioParticipantPackage.MESSAGE__SIGNAL_TYPE:
			setSignalType(SIGNAL_TYPE_EDEFAULT);
			return;
		case ScenarioParticipantPackage.MESSAGE__FROM:
			setFrom((Pid) null);
			return;
		case ScenarioParticipantPackage.MESSAGE__TO:
			setTo((Pid) null);
			return;
		case ScenarioParticipantPackage.MESSAGE__PARAMETER_SET:
			setParameterSet((ParameterSet) null);
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
		case ScenarioParticipantPackage.MESSAGE__SIGNAL_TYPE:
			return SIGNAL_TYPE_EDEFAULT == null ? signalType != null
					: !SIGNAL_TYPE_EDEFAULT.equals(signalType);
		case ScenarioParticipantPackage.MESSAGE__FROM:
			return from != null;
		case ScenarioParticipantPackage.MESSAGE__TO:
			return to != null;
		case ScenarioParticipantPackage.MESSAGE__PARAMETER_SET:
			return parameterSet != null;
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
