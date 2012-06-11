/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Zest Graph</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphImpl#getItems
 * <em>Items</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphImpl#getContainers
 * <em>Containers</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class ZestGraphImpl extends NamedElementImpl implements ZestGraph {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphItem> items;

	/**
	 * The cached value of the '{@link #getContainers() <em>Containers</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getContainers()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphContainer> containers;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ZestGraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZestGraphPackage.Literals.ZEST_GRAPH;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GraphItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentWithInverseEList<GraphItem>(
					GraphItem.class, this, ZestGraphPackage.ZEST_GRAPH__ITEMS,
					ZestGraphPackage.GRAPH_ITEM__GRAPH);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GraphContainer> getContainers() {
		if (containers == null) {
			containers = new EObjectContainmentEList<GraphContainer>(
					GraphContainer.class, this,
					ZestGraphPackage.ZEST_GRAPH__CONTAINERS);
		}
		return containers;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ZestGraphPackage.ZEST_GRAPH__ITEMS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getItems())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
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
		case ZestGraphPackage.ZEST_GRAPH__ITEMS:
			return ((InternalEList<?>) getItems()).basicRemove(otherEnd, msgs);
		case ZestGraphPackage.ZEST_GRAPH__CONTAINERS:
			return ((InternalEList<?>) getContainers()).basicRemove(otherEnd,
					msgs);
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
		case ZestGraphPackage.ZEST_GRAPH__ITEMS:
			return getItems();
		case ZestGraphPackage.ZEST_GRAPH__CONTAINERS:
			return getContainers();
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
		case ZestGraphPackage.ZEST_GRAPH__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends GraphItem>) newValue);
			return;
		case ZestGraphPackage.ZEST_GRAPH__CONTAINERS:
			getContainers().clear();
			getContainers().addAll(
					(Collection<? extends GraphContainer>) newValue);
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
		case ZestGraphPackage.ZEST_GRAPH__ITEMS:
			getItems().clear();
			return;
		case ZestGraphPackage.ZEST_GRAPH__CONTAINERS:
			getContainers().clear();
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
		case ZestGraphPackage.ZEST_GRAPH__ITEMS:
			return items != null && !items.isEmpty();
		case ZestGraphPackage.ZEST_GRAPH__CONTAINERS:
			return containers != null && !containers.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // ZestGraphImpl
