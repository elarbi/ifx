/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Graph Connection</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl#getColor
 * <em>Color</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl#getLineWidth
 * <em>Line Width</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl#getLineStyle
 * <em>Line Style</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl#getSourceNode
 * <em>Source Node</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl#getTargetNode
 * <em>Target Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class GraphConnectionImpl extends GraphItemImpl implements
		GraphConnection {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineStyle() <em>Line Style</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_STYLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineStyle() <em>Line Style</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLineStyle()
	 * @generated
	 * @ordered
	 */
	protected int lineStyle = LINE_STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceNode() <em>Source Node</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSourceNode()
	 * @generated
	 * @ordered
	 */
	protected GraphNode sourceNode;

	/**
	 * The cached value of the '{@link #getTargetNode() <em>Target Node</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTargetNode()
	 * @generated
	 * @ordered
	 */
	protected GraphNode targetNode;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected GraphConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZestGraphPackage.Literals.GRAPH_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_CONNECTION__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_CONNECTION__LINE_WIDTH,
					oldLineWidth, lineWidth));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public int getLineStyle() {
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setLineStyle(int newLineStyle) {
		int oldLineStyle = lineStyle;
		lineStyle = newLineStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_CONNECTION__LINE_STYLE,
					oldLineStyle, lineStyle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphNode getSourceNode() {
		if (sourceNode != null && sourceNode.eIsProxy()) {
			InternalEObject oldSourceNode = (InternalEObject) sourceNode;
			sourceNode = (GraphNode) eResolveProxy(oldSourceNode);
			if (sourceNode != oldSourceNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE,
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
	public GraphNode basicGetSourceNode() {
		return sourceNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetSourceNode(GraphNode newSourceNode,
			NotificationChain msgs) {
		GraphNode oldSourceNode = sourceNode;
		sourceNode = newSourceNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE,
					oldSourceNode, newSourceNode);
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
	public void setSourceNode(GraphNode newSourceNode) {
		if (newSourceNode != sourceNode) {
			NotificationChain msgs = null;
			if (sourceNode != null)
				msgs = ((InternalEObject) sourceNode).eInverseRemove(this,
						ZestGraphPackage.GRAPH_NODE__OUTGOING, GraphNode.class,
						msgs);
			if (newSourceNode != null)
				msgs = ((InternalEObject) newSourceNode).eInverseAdd(this,
						ZestGraphPackage.GRAPH_NODE__OUTGOING, GraphNode.class,
						msgs);
			msgs = basicSetSourceNode(newSourceNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE,
					newSourceNode, newSourceNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphNode getTargetNode() {
		if (targetNode != null && targetNode.eIsProxy()) {
			InternalEObject oldTargetNode = (InternalEObject) targetNode;
			targetNode = (GraphNode) eResolveProxy(oldTargetNode);
			if (targetNode != oldTargetNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE,
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
	public GraphNode basicGetTargetNode() {
		return targetNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTargetNode(GraphNode newTargetNode,
			NotificationChain msgs) {
		GraphNode oldTargetNode = targetNode;
		targetNode = newTargetNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this,
					Notification.SET,
					ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE,
					oldTargetNode, newTargetNode);
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
	public void setTargetNode(GraphNode newTargetNode) {
		if (newTargetNode != targetNode) {
			NotificationChain msgs = null;
			if (targetNode != null)
				msgs = ((InternalEObject) targetNode).eInverseRemove(this,
						ZestGraphPackage.GRAPH_NODE__INGOING, GraphNode.class,
						msgs);
			if (newTargetNode != null)
				msgs = ((InternalEObject) newTargetNode).eInverseAdd(this,
						ZestGraphPackage.GRAPH_NODE__INGOING, GraphNode.class,
						msgs);
			msgs = basicSetTargetNode(newTargetNode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE,
					newTargetNode, newTargetNode));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE:
			if (sourceNode != null)
				msgs = ((InternalEObject) sourceNode).eInverseRemove(this,
						ZestGraphPackage.GRAPH_NODE__OUTGOING, GraphNode.class,
						msgs);
			return basicSetSourceNode((GraphNode) otherEnd, msgs);
		case ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE:
			if (targetNode != null)
				msgs = ((InternalEObject) targetNode).eInverseRemove(this,
						ZestGraphPackage.GRAPH_NODE__INGOING, GraphNode.class,
						msgs);
			return basicSetTargetNode((GraphNode) otherEnd, msgs);
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
		case ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE:
			return basicSetSourceNode(null, msgs);
		case ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE:
			return basicSetTargetNode(null, msgs);
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
		case ZestGraphPackage.GRAPH_CONNECTION__COLOR:
			return getColor();
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_WIDTH:
			return getLineWidth();
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_STYLE:
			return getLineStyle();
		case ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE:
			if (resolve)
				return getSourceNode();
			return basicGetSourceNode();
		case ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE:
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
		case ZestGraphPackage.GRAPH_CONNECTION__COLOR:
			setColor((String) newValue);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_WIDTH:
			setLineWidth((Integer) newValue);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_STYLE:
			setLineStyle((Integer) newValue);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE:
			setSourceNode((GraphNode) newValue);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE:
			setTargetNode((GraphNode) newValue);
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
		case ZestGraphPackage.GRAPH_CONNECTION__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_WIDTH:
			setLineWidth(LINE_WIDTH_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_STYLE:
			setLineStyle(LINE_STYLE_EDEFAULT);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE:
			setSourceNode((GraphNode) null);
			return;
		case ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE:
			setTargetNode((GraphNode) null);
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
		case ZestGraphPackage.GRAPH_CONNECTION__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_WIDTH:
			return lineWidth != LINE_WIDTH_EDEFAULT;
		case ZestGraphPackage.GRAPH_CONNECTION__LINE_STYLE:
			return lineStyle != LINE_STYLE_EDEFAULT;
		case ZestGraphPackage.GRAPH_CONNECTION__SOURCE_NODE:
			return sourceNode != null;
		case ZestGraphPackage.GRAPH_CONNECTION__TARGET_NODE:
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
		result.append(" (color: ");
		result.append(color);
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineStyle: ");
		result.append(lineStyle);
		result.append(')');
		return result.toString();
	}

} // GraphConnectionImpl
