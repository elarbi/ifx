/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graph Node</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getShape <em>
 * Shape</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getNodeStyle
 * <em>Node Style</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getBackColor
 * <em>Back Color</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getWidth <em>
 * Width</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getHeight
 * <em>Height</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getOutgoing
 * <em>Outgoing</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getIngoing
 * <em>Ingoing</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode()
 * @model
 * @generated
 */
public interface GraphNode extends GraphItem {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode_Shape()
	 * @model
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getShape
	 * <em>Shape</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(String value);

	/**
	 * Returns the value of the '<em><b>Node Style</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Style</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Node Style</em>' attribute.
	 * @see #setNodeStyle(String)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode_NodeStyle()
	 * @model
	 * @generated
	 */
	String getNodeStyle();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getNodeStyle
	 * <em>Node Style</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Node Style</em>' attribute.
	 * @see #getNodeStyle()
	 * @generated
	 */
	void setNodeStyle(String value);

	/**
	 * Returns the value of the '<em><b>Back Color</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Back Color</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Back Color</em>' attribute.
	 * @see #setBackColor(String)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode_BackColor()
	 * @model
	 * @generated
	 */
	String getBackColor();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getBackColor
	 * <em>Back Color</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Back Color</em>' attribute.
	 * @see #getBackColor()
	 * @generated
	 */
	void setBackColor(String value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(double)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode_Width()
	 * @model
	 * @generated
	 */
	double getWidth();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getWidth
	 * <em>Width</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(double value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(double)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode_Height()
	 * @model
	 * @generated
	 */
	double getHeight();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getHeight
	 * <em>Height</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(double value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list. The
	 * list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection}. It is
	 * bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getSourceNode
	 * <em>Source Node</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode_Outgoing()
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getSourceNode
	 * @model opposite="sourceNode"
	 * @generated
	 */
	EList<GraphConnection> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Ingoing</b></em>' reference list. The
	 * list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection}. It is
	 * bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getTargetNode
	 * <em>Target Node</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ingoing</em>' reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphNode_Ingoing()
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getTargetNode
	 * @model opposite="targetNode"
	 * @generated
	 */
	EList<GraphConnection> getIngoing();

} // GraphNode
