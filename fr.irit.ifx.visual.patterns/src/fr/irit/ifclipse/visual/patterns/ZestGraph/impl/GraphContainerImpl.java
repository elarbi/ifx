/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Graph Container</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphContainerImpl#getNodes
 * <em>Nodes</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GraphContainerImpl extends NamedElementImpl implements
		GraphContainer {
	/**
	 * The cached value of the '{@link #getNodes() <em>Nodes</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphNode> nodes;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GraphContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZestGraphPackage.Literals.GRAPH_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GraphNode> getNodes() {
		if (nodes == null) {
			nodes = new EObjectResolvingEList<GraphNode>(GraphNode.class, this,
					ZestGraphPackage.GRAPH_CONTAINER__NODES);
		}
		return nodes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ZestGraphPackage.GRAPH_CONTAINER__NODES:
			return getNodes();
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
		case ZestGraphPackage.GRAPH_CONTAINER__NODES:
			getNodes().clear();
			getNodes().addAll((Collection<? extends GraphNode>) newValue);
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
		case ZestGraphPackage.GRAPH_CONTAINER__NODES:
			getNodes().clear();
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
		case ZestGraphPackage.GRAPH_CONTAINER__NODES:
			return nodes != null && !nodes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // GraphContainerImpl
