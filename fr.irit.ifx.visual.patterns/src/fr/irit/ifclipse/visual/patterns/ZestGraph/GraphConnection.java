/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graph Connection</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getColor
 * <em>Color</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineWidth
 * <em>Line Width</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineStyle
 * <em>Line Style</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getSourceNode
 * <em>Source Node</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getTargetNode
 * <em>Target Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphConnection()
 * @model
 * @generated
 */
public interface GraphConnection extends GraphItem {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphConnection_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getColor
	 * <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Line Width</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Width</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Line Width</em>' attribute.
	 * @see #setLineWidth(int)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphConnection_LineWidth()
	 * @model
	 * @generated
	 */
	int getLineWidth();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineWidth
	 * <em>Line Width</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Line Width</em>' attribute.
	 * @see #getLineWidth()
	 * @generated
	 */
	void setLineWidth(int value);

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Style</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Line Style</em>' attribute.
	 * @see #setLineStyle(int)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphConnection_LineStyle()
	 * @model
	 * @generated
	 */
	int getLineStyle();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineStyle
	 * <em>Line Style</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Line Style</em>' attribute.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(int value);

	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getOutgoing
	 * <em>Outgoing</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Node</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Node</em>' reference.
	 * @see #setSourceNode(GraphNode)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphConnection_SourceNode()
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getOutgoing
	 * @model opposite="outgoing"
	 * @generated
	 */
	GraphNode getSourceNode();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getSourceNode
	 * <em>Source Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Node</em>' reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(GraphNode value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference. It is
	 * bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getIngoing
	 * <em>Ingoing</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(GraphNode)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphConnection_TargetNode()
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getIngoing
	 * @model opposite="ingoing"
	 * @generated
	 */
	GraphNode getTargetNode();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getTargetNode
	 * <em>Target Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(GraphNode value);

} // GraphConnection
