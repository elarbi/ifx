/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.Graph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.irit.ifclipse.visual.patterns.Graph.DirectedArc;
import fr.irit.ifclipse.visual.patterns.Graph.GraphPackage;
import fr.irit.ifclipse.visual.patterns.Graph.Node;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Directed Arc</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.DirectedArcImpl#getWeight
 * <em>Weight</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.DirectedArcImpl#getSourceNode
 * <em>Source Node</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.DirectedArcImpl#getTargetNode
 * <em>Target Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class DirectedArcImpl extends GraphElementImpl implements DirectedArc {
	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceNode() <em>Source Node</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSourceNode()
	 * @generated
	 * @ordered
	 */
	protected Node sourceNode;

	/**
	 * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetNode()
	 * @generated
	 * @ordered
	 */
	protected Node targetNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DirectedArcImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.DIRECTED_ARC;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GraphPackage.DIRECTED_ARC__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node getSourceNode() {
		if (sourceNode != null && sourceNode.eIsProxy()) {
			InternalEObject oldSourceNode = (InternalEObject) sourceNode;
			sourceNode = (Node) eResolveProxy(oldSourceNode);
			if (sourceNode != oldSourceNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GraphPackage.DIRECTED_ARC__SOURCE_NODE,
							oldSourceNode, sourceNode));
			}
		}
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node basicGetSourceNode() {
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSourceNode(Node newSourceNode) {
		Node oldSourceNode = sourceNode;
		sourceNode = newSourceNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GraphPackage.DIRECTED_ARC__SOURCE_NODE, oldSourceNode,
					sourceNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node getTargetNode() {
		if (targetNode != null && targetNode.eIsProxy()) {
			InternalEObject oldTargetNode = (InternalEObject) targetNode;
			targetNode = (Node) eResolveProxy(oldTargetNode);
			if (targetNode != oldTargetNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							GraphPackage.DIRECTED_ARC__TARGET_NODE,
							oldTargetNode, targetNode));
			}
		}
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node basicGetTargetNode() {
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTargetNode(Node newTargetNode) {
		Node oldTargetNode = targetNode;
		targetNode = newTargetNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					GraphPackage.DIRECTED_ARC__TARGET_NODE, oldTargetNode,
					targetNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case GraphPackage.DIRECTED_ARC__WEIGHT:
			return getWeight();
		case GraphPackage.DIRECTED_ARC__SOURCE_NODE:
			if (resolve)
				return getSourceNode();
			return basicGetSourceNode();
		case GraphPackage.DIRECTED_ARC__TARGET_NODE:
			if (resolve)
				return getTargetNode();
			return basicGetTargetNode();
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
		case GraphPackage.DIRECTED_ARC__WEIGHT:
			setWeight((Integer) newValue);
			return;
		case GraphPackage.DIRECTED_ARC__SOURCE_NODE:
			setSourceNode((Node) newValue);
			return;
		case GraphPackage.DIRECTED_ARC__TARGET_NODE:
			setTargetNode((Node) newValue);
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
		case GraphPackage.DIRECTED_ARC__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case GraphPackage.DIRECTED_ARC__SOURCE_NODE:
			setSourceNode((Node) null);
			return;
		case GraphPackage.DIRECTED_ARC__TARGET_NODE:
			setTargetNode((Node) null);
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
		case GraphPackage.DIRECTED_ARC__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case GraphPackage.DIRECTED_ARC__SOURCE_NODE:
			return sourceNode != null;
		case GraphPackage.DIRECTED_ARC__TARGET_NODE:
			return targetNode != null;
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
		result.append(" (weight: ");
		result.append(weight);
		result.append(')');
		return result.toString();
	}

} // DirectedArcImpl
