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

import fr.irit.ifclipse.metamodel.IFConfig.Action;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.Message;
import fr.irit.ifclipse.metamodel.IFConfig.Pid;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Action</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getKind <em>
 * Kind</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getValue <em>
 * Value</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getMessage
 * <em>Message</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getProcess
 * <em>Process</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getBy <em>By
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getFrom <em>
 * From</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getVia <em>Via
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl#getTo <em>To
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ActionImpl extends EObjectImpl implements Action {
	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final String KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected String kind = KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected Message message;

	/**
	 * The cached value of the '{@link #getProcess() <em>Process</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected Pid process;

	/**
	 * The cached value of the '{@link #getBy() <em>By</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected Pid by;

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
	 * The cached value of the '{@link #getVia() <em>Via</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVia()
	 * @generated
	 * @ordered
	 */
	protected Pid via;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IFConfigPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setKind(String newKind) {
		String oldKind = kind;
		kind = newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.ACTION__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.ACTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Message getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetMessage(Message newMessage,
			NotificationChain msgs) {
		Message oldMessage = message;
		message = newMessage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, IFConfigPackage.ACTION__MESSAGE,
					oldMessage, newMessage);
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
	public void setMessage(Message newMessage) {
		if (newMessage != message) {
			NotificationChain msgs = null;
			if (message != null)
				msgs = ((InternalEObject) message).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.ACTION__MESSAGE, null, msgs);
			if (newMessage != null)
				msgs = ((InternalEObject) newMessage).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- IFConfigPackage.ACTION__MESSAGE, null, msgs);
			msgs = basicSetMessage(newMessage, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.ACTION__MESSAGE, newMessage, newMessage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getProcess() {
		if (process != null && process.eIsProxy()) {
			InternalEObject oldProcess = (InternalEObject) process;
			process = (Pid) eResolveProxy(oldProcess);
			if (process != oldProcess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							IFConfigPackage.ACTION__PROCESS, oldProcess,
							process));
			}
		}
		return process;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid basicGetProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setProcess(Pid newProcess) {
		Pid oldProcess = process;
		process = newProcess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.ACTION__PROCESS, oldProcess, process));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getBy() {
		if (by != null && by.eIsProxy()) {
			InternalEObject oldBy = (InternalEObject) by;
			by = (Pid) eResolveProxy(oldBy);
			if (by != oldBy) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							IFConfigPackage.ACTION__BY, oldBy, by));
			}
		}
		return by;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid basicGetBy() {
		return by;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBy(Pid newBy) {
		Pid oldBy = by;
		by = newBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.ACTION__BY, oldBy, by));
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
							IFConfigPackage.ACTION__FROM, oldFrom, from));
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
					IFConfigPackage.ACTION__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getVia() {
		if (via != null && via.eIsProxy()) {
			InternalEObject oldVia = (InternalEObject) via;
			via = (Pid) eResolveProxy(oldVia);
			if (via != oldVia) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							IFConfigPackage.ACTION__VIA, oldVia, via));
			}
		}
		return via;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid basicGetVia() {
		return via;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setVia(Pid newVia) {
		Pid oldVia = via;
		via = newVia;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					IFConfigPackage.ACTION__VIA, oldVia, via));
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
							IFConfigPackage.ACTION__TO, oldTo, to));
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
					IFConfigPackage.ACTION__TO, oldTo, to));
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
		case IFConfigPackage.ACTION__MESSAGE:
			return basicSetMessage(null, msgs);
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
		case IFConfigPackage.ACTION__KIND:
			return getKind();
		case IFConfigPackage.ACTION__VALUE:
			return getValue();
		case IFConfigPackage.ACTION__MESSAGE:
			return getMessage();
		case IFConfigPackage.ACTION__PROCESS:
			if (resolve)
				return getProcess();
			return basicGetProcess();
		case IFConfigPackage.ACTION__BY:
			if (resolve)
				return getBy();
			return basicGetBy();
		case IFConfigPackage.ACTION__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case IFConfigPackage.ACTION__VIA:
			if (resolve)
				return getVia();
			return basicGetVia();
		case IFConfigPackage.ACTION__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
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
		case IFConfigPackage.ACTION__KIND:
			setKind((String) newValue);
			return;
		case IFConfigPackage.ACTION__VALUE:
			setValue((String) newValue);
			return;
		case IFConfigPackage.ACTION__MESSAGE:
			setMessage((Message) newValue);
			return;
		case IFConfigPackage.ACTION__PROCESS:
			setProcess((Pid) newValue);
			return;
		case IFConfigPackage.ACTION__BY:
			setBy((Pid) newValue);
			return;
		case IFConfigPackage.ACTION__FROM:
			setFrom((Pid) newValue);
			return;
		case IFConfigPackage.ACTION__VIA:
			setVia((Pid) newValue);
			return;
		case IFConfigPackage.ACTION__TO:
			setTo((Pid) newValue);
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
		case IFConfigPackage.ACTION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case IFConfigPackage.ACTION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case IFConfigPackage.ACTION__MESSAGE:
			setMessage((Message) null);
			return;
		case IFConfigPackage.ACTION__PROCESS:
			setProcess((Pid) null);
			return;
		case IFConfigPackage.ACTION__BY:
			setBy((Pid) null);
			return;
		case IFConfigPackage.ACTION__FROM:
			setFrom((Pid) null);
			return;
		case IFConfigPackage.ACTION__VIA:
			setVia((Pid) null);
			return;
		case IFConfigPackage.ACTION__TO:
			setTo((Pid) null);
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
		case IFConfigPackage.ACTION__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT
					.equals(kind);
		case IFConfigPackage.ACTION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT
					.equals(value);
		case IFConfigPackage.ACTION__MESSAGE:
			return message != null;
		case IFConfigPackage.ACTION__PROCESS:
			return process != null;
		case IFConfigPackage.ACTION__BY:
			return by != null;
		case IFConfigPackage.ACTION__FROM:
			return from != null;
		case IFConfigPackage.ACTION__VIA:
			return via != null;
		case IFConfigPackage.ACTION__TO:
			return to != null;
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
		result.append(" (kind: ");
		result.append(kind);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} // ActionImpl
