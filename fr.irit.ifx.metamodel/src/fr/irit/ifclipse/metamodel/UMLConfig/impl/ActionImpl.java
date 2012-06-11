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

import fr.irit.ifclipse.metamodel.UMLConfig.Action;
import fr.irit.ifclipse.metamodel.UMLConfig.Pid;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Action</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl#getKind <em>
 * Kind</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl#getValue <em>
 * Value</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl#getProcess
 * <em>Process</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl#getBy <em>By
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl#getFrom <em>
 * From</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl#getVia <em>
 * Via</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl#getTo <em>To
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
	 * The cached value of the '{@link #getProcess() <em>Process</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProcess()
	 * @generated
	 * @ordered
	 */
	protected Pid process;

	/**
	 * The cached value of the '{@link #getBy() <em>By</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBy()
	 * @generated
	 * @ordered
	 */
	protected Pid by;

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
	 * The cached value of the '{@link #getVia() <em>Via</em>}' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getVia()
	 * @generated
	 * @ordered
	 */
	protected Pid via;

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
		return UMLConfigPackage.Literals.ACTION;
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
					UMLConfigPackage.ACTION__KIND, oldKind, kind));
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
					UMLConfigPackage.ACTION__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getProcess() {
		return process;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetProcess(Pid newProcess,
			NotificationChain msgs) {
		Pid oldProcess = process;
		process = newProcess;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UMLConfigPackage.ACTION__PROCESS,
					oldProcess, newProcess);
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
	public void setProcess(Pid newProcess) {
		if (newProcess != process) {
			NotificationChain msgs = null;
			if (process != null)
				msgs = ((InternalEObject) process).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.ACTION__PROCESS, null, msgs);
			if (newProcess != null)
				msgs = ((InternalEObject) newProcess).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- UMLConfigPackage.ACTION__PROCESS, null, msgs);
			msgs = basicSetProcess(newProcess, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTION__PROCESS, newProcess, newProcess));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getBy() {
		return by;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetBy(Pid newBy, NotificationChain msgs) {
		Pid oldBy = by;
		by = newBy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UMLConfigPackage.ACTION__BY, oldBy, newBy);
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
	public void setBy(Pid newBy) {
		if (newBy != by) {
			NotificationChain msgs = null;
			if (by != null)
				msgs = ((InternalEObject) by).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__BY,
						null, msgs);
			if (newBy != null)
				msgs = ((InternalEObject) newBy).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__BY,
						null, msgs);
			msgs = basicSetBy(newBy, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTION__BY, newBy, newBy));
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
					Notification.SET, UMLConfigPackage.ACTION__FROM, oldFrom,
					newFrom);
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
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__FROM,
						null, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject) newFrom).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__FROM,
						null, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTION__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid getVia() {
		return via;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetVia(Pid newVia, NotificationChain msgs) {
		Pid oldVia = via;
		via = newVia;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET, UMLConfigPackage.ACTION__VIA, oldVia,
					newVia);
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
	public void setVia(Pid newVia) {
		if (newVia != via) {
			NotificationChain msgs = null;
			if (via != null)
				msgs = ((InternalEObject) via).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__VIA,
						null, msgs);
			if (newVia != null)
				msgs = ((InternalEObject) newVia).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__VIA,
						null, msgs);
			msgs = basicSetVia(newVia, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTION__VIA, newVia, newVia));
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
					Notification.SET, UMLConfigPackage.ACTION__TO, oldTo, newTo);
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
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__TO,
						null, msgs);
			if (newTo != null)
				msgs = ((InternalEObject) newTo).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - UMLConfigPackage.ACTION__TO,
						null, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					UMLConfigPackage.ACTION__TO, newTo, newTo));
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
		case UMLConfigPackage.ACTION__PROCESS:
			return basicSetProcess(null, msgs);
		case UMLConfigPackage.ACTION__BY:
			return basicSetBy(null, msgs);
		case UMLConfigPackage.ACTION__FROM:
			return basicSetFrom(null, msgs);
		case UMLConfigPackage.ACTION__VIA:
			return basicSetVia(null, msgs);
		case UMLConfigPackage.ACTION__TO:
			return basicSetTo(null, msgs);
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
		case UMLConfigPackage.ACTION__KIND:
			return getKind();
		case UMLConfigPackage.ACTION__VALUE:
			return getValue();
		case UMLConfigPackage.ACTION__PROCESS:
			return getProcess();
		case UMLConfigPackage.ACTION__BY:
			return getBy();
		case UMLConfigPackage.ACTION__FROM:
			return getFrom();
		case UMLConfigPackage.ACTION__VIA:
			return getVia();
		case UMLConfigPackage.ACTION__TO:
			return getTo();
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
		case UMLConfigPackage.ACTION__KIND:
			setKind((String) newValue);
			return;
		case UMLConfigPackage.ACTION__VALUE:
			setValue((String) newValue);
			return;
		case UMLConfigPackage.ACTION__PROCESS:
			setProcess((Pid) newValue);
			return;
		case UMLConfigPackage.ACTION__BY:
			setBy((Pid) newValue);
			return;
		case UMLConfigPackage.ACTION__FROM:
			setFrom((Pid) newValue);
			return;
		case UMLConfigPackage.ACTION__VIA:
			setVia((Pid) newValue);
			return;
		case UMLConfigPackage.ACTION__TO:
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
		case UMLConfigPackage.ACTION__KIND:
			setKind(KIND_EDEFAULT);
			return;
		case UMLConfigPackage.ACTION__VALUE:
			setValue(VALUE_EDEFAULT);
			return;
		case UMLConfigPackage.ACTION__PROCESS:
			setProcess((Pid) null);
			return;
		case UMLConfigPackage.ACTION__BY:
			setBy((Pid) null);
			return;
		case UMLConfigPackage.ACTION__FROM:
			setFrom((Pid) null);
			return;
		case UMLConfigPackage.ACTION__VIA:
			setVia((Pid) null);
			return;
		case UMLConfigPackage.ACTION__TO:
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
		case UMLConfigPackage.ACTION__KIND:
			return KIND_EDEFAULT == null ? kind != null : !KIND_EDEFAULT
					.equals(kind);
		case UMLConfigPackage.ACTION__VALUE:
			return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT
					.equals(value);
		case UMLConfigPackage.ACTION__PROCESS:
			return process != null;
		case UMLConfigPackage.ACTION__BY:
			return by != null;
		case UMLConfigPackage.ACTION__FROM:
			return from != null;
		case UMLConfigPackage.ACTION__VIA:
			return via != null;
		case UMLConfigPackage.ACTION__TO:
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
