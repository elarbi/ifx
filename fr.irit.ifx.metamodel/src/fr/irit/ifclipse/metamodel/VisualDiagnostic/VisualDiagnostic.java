/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.VisualDiagnostic;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Visual Diagnostic</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic#getFigures
 * <em>Figures</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage#getVisualDiagnostic()
 * @model
 * @generated
 */
public interface VisualDiagnostic extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Figures</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figures</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Figures</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage#getVisualDiagnostic_Figures()
	 * @model containment="true"
	 * @generated
	 */
	EList<Figure> getFigures();

} // VisualDiagnostic
