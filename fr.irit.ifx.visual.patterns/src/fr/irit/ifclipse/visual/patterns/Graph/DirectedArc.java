/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.Graph;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Directed Arc</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getWeight <em>
 * Weight</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getSourceNode
 * <em>Source Node</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getTargetNode
 * <em>Target Node</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getDirectedArc()
 * @model
 * @generated
 */
public interface DirectedArc extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Weight</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getDirectedArc_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getWeight
	 * <em>Weight</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Source Node</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Node</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source Node</em>' reference.
	 * @see #setSourceNode(Node)
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getDirectedArc_SourceNode()
	 * @model
	 * @generated
	 */
	Node getSourceNode();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getSourceNode
	 * <em>Source Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source Node</em>' reference.
	 * @see #getSourceNode()
	 * @generated
	 */
	void setSourceNode(Node value);

	/**
	 * Returns the value of the '<em><b>Target Node</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Node</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target Node</em>' reference.
	 * @see #setTargetNode(Node)
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getDirectedArc_TargetNode()
	 * @model
	 * @generated
	 */
	Node getTargetNode();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getTargetNode
	 * <em>Target Node</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target Node</em>' reference.
	 * @see #getTargetNode()
	 * @generated
	 */
	void setTargetNode(Node value);

} // DirectedArc
