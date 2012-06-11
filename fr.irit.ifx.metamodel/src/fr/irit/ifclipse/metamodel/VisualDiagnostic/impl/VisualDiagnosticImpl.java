/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.VisualDiagnostic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Visual Diagnostic</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticImpl#getFigures
 * <em>Figures</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class VisualDiagnosticImpl extends NamedElementImpl implements
		VisualDiagnostic {
	/**
	 * The cached value of the '{@link #getFigures() <em>Figures</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFigures()
	 * @generated
	 * @ordered
	 */
	protected EList<Figure> figures;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VisualDiagnosticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualDiagnosticPackage.Literals.VISUAL_DIAGNOSTIC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Figure> getFigures() {
		if (figures == null) {
			figures = new EObjectContainmentEList<Figure>(Figure.class, this,
					VisualDiagnosticPackage.VISUAL_DIAGNOSTIC__FIGURES);
		}
		return figures;
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
		case VisualDiagnosticPackage.VISUAL_DIAGNOSTIC__FIGURES:
			return ((InternalEList<?>) getFigures())
					.basicRemove(otherEnd, msgs);
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
		case VisualDiagnosticPackage.VISUAL_DIAGNOSTIC__FIGURES:
			return getFigures();
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
		case VisualDiagnosticPackage.VISUAL_DIAGNOSTIC__FIGURES:
			getFigures().clear();
			getFigures().addAll((Collection<? extends Figure>) newValue);
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
		case VisualDiagnosticPackage.VISUAL_DIAGNOSTIC__FIGURES:
			getFigures().clear();
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
		case VisualDiagnosticPackage.VISUAL_DIAGNOSTIC__FIGURES:
			return figures != null && !figures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // VisualDiagnosticImpl
