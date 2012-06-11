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

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.Message;
import fr.irit.ifclipse.metamodel.IFConfig.ParameterSet;
import fr.irit.ifclipse.metamodel.IFConfig.Pid;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl#getSignalType
 * <em>Signal Type</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl#getFrom <em>
 * From</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl#getTo <em>To
 * </em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl#getParameterSet
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Pid from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
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
		return IFConfigPackage.Literals.MESSAGE;
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
					IFConfigPackage.MESSAGE__SIGNAL_TYPE, oldSignalType,
					signalType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (Pid) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							IFConfigPackage.MESSAGE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFrom(Pid newFrom) {
		Pid oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.MESSAGE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (Pid) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							IFConfigPackage.MESSAGE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTo(Pid newTo) {
		Pid oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.MESSAGE__TO, oldTo, to));
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
					Notification.SET, IFConfigPackage.MESSAGE__PARAMETER_SET,
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
				msgs = ((InternalEObject) parameterSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.MESSAGE__PARAMETER_SET, null,
						msgs);
			if (newParameterSet != null)
				msgs = ((InternalEObject) newParameterSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.MESSAGE__PARAMETER_SET, null,
						msgs);
			msgs = basicSetParameterSet(newParameterSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.MESSAGE__PARAMETER_SET, newParameterSet,
					newParameterSet));
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
		case IFConfigPackage.MESSAGE__PARAMETER_SET:
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
		case IFConfigPackage.MESSAGE__SIGNAL_TYPE:
			return getSignalType();
		case IFConfigPackage.MESSAGE__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case IFConfigPackage.MESSAGE__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case IFConfigPackage.MESSAGE__PARAMETER_SET:
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
		case IFConfigPackage.MESSAGE__SIGNAL_TYPE:
			setSignalType((String) newValue);
			return;
		case IFConfigPackage.MESSAGE__FROM:
			setFrom((Pid) newValue);
			return;
		case IFConfigPackage.MESSAGE__TO:
			setTo((Pid) newValue);
			return;
		case IFConfigPackage.MESSAGE__PARAMETER_SET:
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
		case IFConfigPackage.MESSAGE__SIGNAL_TYPE:
			setSignalType(SIGNAL_TYPE_EDEFAULT);
			return;
		case IFConfigPackage.MESSAGE__FROM:
			setFrom((Pid) null);
			return;
		case IFConfigPackage.MESSAGE__TO:
			setTo((Pid) null);
			return;
		case IFConfigPackage.MESSAGE__PARAMETER_SET:
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
		case IFConfigPackage.MESSAGE__SIGNAL_TYPE:
			return SIGNAL_TYPE_EDEFAULT == null ? signalType != null
					: !SIGNAL_TYPE_EDEFAULT.equals(signalType);
		case IFConfigPackage.MESSAGE__FROM:
			return from != null;
		case IFConfigPackage.MESSAGE__TO:
			return to != null;
		case IFConfigPackage.MESSAGE__PARAMETER_SET:
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
