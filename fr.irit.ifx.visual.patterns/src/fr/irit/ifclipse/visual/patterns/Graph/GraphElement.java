/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.Graph;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getGraph <em>
 * Graph</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getLabel <em>
 * Label</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getColor <em>
 * Color</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getGraphElement()
 * @model
 * @generated
 */
public interface GraphElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.Graph#getContents
	 * <em>Contents</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(Graph)
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getGraphElement_Graph()
	 * @see fr.irit.ifclipse.visual.patterns.Graph.Graph#getContents
	 * @model opposite="contents" transient="false"
	 * @generated
	 */
	Graph getGraph();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getGraph
	 * <em>Graph</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(Graph value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getGraphElement_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getLabel
	 * <em>Label</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

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
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getGraphElement_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getColor
	 * <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // GraphElement
