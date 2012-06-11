/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ComDiag.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage;
import fr.irit.ifclipse.visual.patterns.ComDiag.Lifeline;
import fr.irit.ifclipse.visual.patterns.ComDiag.Message;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.MessageImpl#getOccurence
 * <em>Occurence</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.MessageImpl#getSource
 * <em>Source</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.MessageImpl#getTarget
 * <em>Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MessageImpl extends ComDiagElementImpl implements Message {
	/**
	 * The default value of the '{@link #getOccurence() <em>Occurence</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOccurence()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurence() <em>Occurence</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOccurence()
	 * @generated
	 * @ordered
	 */
	protected int occurence = OCCURENCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Lifeline source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Lifeline target;

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
		return ComDiagPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getOccurence() {
		return occurence;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setOccurence(int newOccurence) {
		int oldOccurence = occurence;
		occurence = newOccurence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComDiagPackage.MESSAGE__OCCURENCE, oldOccurence, occurence));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lifeline getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Lifeline) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComDiagPackage.MESSAGE__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lifeline basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSource(Lifeline newSource) {
		Lifeline oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComDiagPackage.MESSAGE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lifeline getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Lifeline) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ComDiagPackage.MESSAGE__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lifeline basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTarget(Lifeline newTarget) {
		Lifeline oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ComDiagPackage.MESSAGE__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ComDiagPackage.MESSAGE__OCCURENCE:
			return getOccurence();
		case ComDiagPackage.MESSAGE__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case ComDiagPackage.MESSAGE__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
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
		case ComDiagPackage.MESSAGE__OCCURENCE:
			setOccurence((Integer) newValue);
			return;
		case ComDiagPackage.MESSAGE__SOURCE:
			setSource((Lifeline) newValue);
			return;
		case ComDiagPackage.MESSAGE__TARGET:
			setTarget((Lifeline) newValue);
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
		case ComDiagPackage.MESSAGE__OCCURENCE:
			setOccurence(OCCURENCE_EDEFAULT);
			return;
		case ComDiagPackage.MESSAGE__SOURCE:
			setSource((Lifeline) null);
			return;
		case ComDiagPackage.MESSAGE__TARGET:
			setTarget((Lifeline) null);
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
		case ComDiagPackage.MESSAGE__OCCURENCE:
			return occurence != OCCURENCE_EDEFAULT;
		case ComDiagPackage.MESSAGE__SOURCE:
			return source != null;
		case ComDiagPackage.MESSAGE__TARGET:
			return target != null;
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
		result.append(" (occurence: ");
		result.append(occurence);
		result.append(')');
		return result.toString();
	}

} // MessageImpl
