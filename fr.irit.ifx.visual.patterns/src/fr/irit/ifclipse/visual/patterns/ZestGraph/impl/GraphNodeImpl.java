/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Graph Node</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl#getShape
 * <em>Shape</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl#getNodeStyle
 * <em>Node Style</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl#getBackColor
 * <em>Back Color</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl#getWidth
 * <em>Width</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl#getHeight
 * <em>Height</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl#getOutgoing
 * <em>Outgoing</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl#getIngoing
 * <em>Ingoing</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GraphNodeImpl extends GraphItemImpl implements GraphNode {
	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected String shape = SHAPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNodeStyle() <em>Node Style</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNodeStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String NODE_STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodeStyle() <em>Node Style</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getNodeStyle()
	 * @generated
	 * @ordered
	 */
	protected String nodeStyle = NODE_STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackColor() <em>Back Color</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBackColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACK_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackColor() <em>Back Color</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBackColor()
	 * @generated
	 * @ordered
	 */
	protected String backColor = BACK_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final double HEIGHT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected double height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutgoing() <em>Outgoing</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOutgoing()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphConnection> outgoing;

	/**
	 * The cached value of the '{@link #getIngoing() <em>Ingoing</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getIngoing()
	 * @generated
	 * @ordered
	 */
	protected EList<GraphConnection> ingoing;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GraphNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZestGraphPackage.Literals.GRAPH_NODE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setShape(String newShape) {
		String oldShape = shape;
		shape = newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_NODE__SHAPE, oldShape, shape));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getNodeStyle() {
		return nodeStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setNodeStyle(String newNodeStyle) {
		String oldNodeStyle = nodeStyle;
		nodeStyle = newNodeStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_NODE__NODE_STYLE, oldNodeStyle,
					nodeStyle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getBackColor() {
		return backColor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setBackColor(String newBackColor) {
		String oldBackColor = backColor;
		backColor = newBackColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_NODE__BACK_COLOR, oldBackColor,
					backColor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_NODE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setHeight(double newHeight) {
		double oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_NODE__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GraphConnection> getOutgoing() {
		if (outgoing == null) {
			outgoing = new EObjectWithInverseResolvingEList<GraphConnection>(
					GraphConnection.class, this,
					ZestGraphPackage.GRAPH_NODE__OUTGOING,
					ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE);
		}
		return outgoing;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<GraphConnection> getIngoing() {
		if (ingoing == null) {
			ingoing = new EObjectWithInverseResolvingEList<GraphConnection>(
					GraphConnection.class, this,
					ZestGraphPackage.GRAPH_NODE__INGOING,
					ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE);
		}
		return ingoing;
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
		case ZestGraphPackage.GRAPH_NODE__OUTGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOutgoing())
					.basicAdd(otherEnd, msgs);
		case ZestGraphPackage.GRAPH_NODE__INGOING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getIngoing())
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
		case ZestGraphPackage.GRAPH_NODE__OUTGOING:
			return ((InternalEList<?>) getOutgoing()).basicRemove(otherEnd,
					msgs);
		case ZestGraphPackage.GRAPH_NODE__INGOING:
			return ((InternalEList<?>) getIngoing())
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
		case ZestGraphPackage.GRAPH_NODE__SHAPE:
			return getShape();
		case ZestGraphPackage.GRAPH_NODE__NODE_STYLE:
			return getNodeStyle();
		case ZestGraphPackage.GRAPH_NODE__BACK_COLOR:
			return getBackColor();
		case ZestGraphPackage.GRAPH_NODE__WIDTH:
			return getWidth();
		case ZestGraphPackage.GRAPH_NODE__HEIGHT:
			return getHeight();
		case ZestGraphPackage.GRAPH_NODE__OUTGOING:
			return getOutgoing();
		case ZestGraphPackage.GRAPH_NODE__INGOING:
			return getIngoing();
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
		case ZestGraphPackage.GRAPH_NODE__SHAPE:
			setShape((String) newValue);
			return;
		case ZestGraphPackage.GRAPH_NODE__NODE_STYLE:
			setNodeStyle((String) newValue);
			return;
		case ZestGraphPackage.GRAPH_NODE__BACK_COLOR:
			setBackColor((String) newValue);
			return;
		case ZestGraphPackage.GRAPH_NODE__WIDTH:
			setWidth((Double) newValue);
			return;
		case ZestGraphPackage.GRAPH_NODE__HEIGHT:
			setHeight((Double) newValue);
			return;
		case ZestGraphPackage.GRAPH_NODE__OUTGOING:
			getOutgoing().clear();
			getOutgoing().addAll(
					(Collection<? extends GraphConnection>) newValue);
			return;
		case ZestGraphPackage.GRAPH_NODE__INGOING:
			getIngoing().clear();
			getIngoing().addAll(
					(Collection<? extends GraphConnection>) newValue);
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
		case ZestGraphPackage.GRAPH_NODE__SHAPE:
			setShape(SHAPE_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_NODE__NODE_STYLE:
			setNodeStyle(NODE_STYLE_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_NODE__BACK_COLOR:
			setBackColor(BACK_COLOR_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_NODE__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_NODE__HEIGHT:
			setHeight(HEIGHT_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_NODE__OUTGOING:
			getOutgoing().clear();
			return;
		case ZestGraphPackage.GRAPH_NODE__INGOING:
			getIngoing().clear();
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
		case ZestGraphPackage.GRAPH_NODE__SHAPE:
			return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT
					.equals(shape);
		case ZestGraphPackage.GRAPH_NODE__NODE_STYLE:
			return NODE_STYLE_EDEFAULT == null ? nodeStyle != null
					: !NODE_STYLE_EDEFAULT.equals(nodeStyle);
		case ZestGraphPackage.GRAPH_NODE__BACK_COLOR:
			return BACK_COLOR_EDEFAULT == null ? backColor != null
					: !BACK_COLOR_EDEFAULT.equals(backColor);
		case ZestGraphPackage.GRAPH_NODE__WIDTH:
			return width != WIDTH_EDEFAULT;
		case ZestGraphPackage.GRAPH_NODE__HEIGHT:
			return height != HEIGHT_EDEFAULT;
		case ZestGraphPackage.GRAPH_NODE__OUTGOING:
			return outgoing != null && !outgoing.isEmpty();
		case ZestGraphPackage.GRAPH_NODE__INGOING:
			return ingoing != null && !ingoing.isEmpty();
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
		result.append(" (shape: ");
		result.append(shape);
		result.append(", nodeStyle: ");
		result.append(nodeStyle);
		result.append(", backColor: ");
		result.append(backColor);
		result.append(", width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} // GraphNodeImpl
