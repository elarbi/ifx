/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.GXL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.metamodel.GXL.GXL;
import fr.irit.ifclipse.metamodel.GXL.GXLPackage;
import fr.irit.ifclipse.metamodel.GXL.Graph;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GXL</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.GXL.impl.GXLImpl#getGraphs <em>Graphs
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GXLImpl extends EObjectImpl implements GXL {
	/**
	 * The cached value of the '{@link #getGraphs() <em>Graphs</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGraphs()
	 * @generated
	 * @ordered
	 */
	protected EList<Graph> graphs;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GXLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GXLPackage.Literals.GXL;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Graph> getGraphs() {
		if (graphs == null) {
			graphs = new EObjectContainmentEList<Graph>(Graph.class, this,
					GXLPackage.GXL__GRAPHS);
		}
		return graphs;
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
		case GXLPackage.GXL__GRAPHS:
			return ((InternalEList<?>) getGraphs()).basicRemove(otherEnd, msgs);
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
		case GXLPackage.GXL__GRAPHS:
			return getGraphs();
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
		case GXLPackage.GXL__GRAPHS:
			getGraphs().clear();
			getGraphs().addAll((Collection<? extends Graph>) newValue);
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
		case GXLPackage.GXL__GRAPHS:
			getGraphs().clear();
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
		case GXLPackage.GXL__GRAPHS:
			return graphs != null && !graphs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // GXLImpl
