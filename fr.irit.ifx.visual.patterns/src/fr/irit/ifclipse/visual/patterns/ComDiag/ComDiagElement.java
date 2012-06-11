/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ComDiag;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement#getGraph
 * <em>Graph</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getComDiagElement()
 * @model
 * @generated
 */
public interface ComDiagElement extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getElements
	 * <em>Elements</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(ComDiag)
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getComDiagElement_Graph()
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getElements
	 * @model opposite="elements" transient="false"
	 * @generated
	 */
	ComDiag getGraph();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement#getGraph
	 * <em>Graph</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(ComDiag value);

} // ComDiagElement
