/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ComDiag;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Com Diag</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getElements <em>
 * Elements</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getLevel <em>
 * Level</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getComDiag()
 * @model
 * @generated
 */
public interface ComDiag extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement}. It is
	 * bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement#getGraph
	 * <em>Graph</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elements</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getComDiag_Elements()
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<ComDiagElement> getElements();

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see #setLevel(String)
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getComDiag_Level()
	 * @model
	 * @generated
	 */
	String getLevel();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getLevel
	 * <em>Level</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Level</em>' attribute.
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(String value);

} // ComDiag
