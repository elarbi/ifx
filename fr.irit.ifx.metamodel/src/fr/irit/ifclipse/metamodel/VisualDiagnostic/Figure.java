/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.VisualDiagnostic;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Figure</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getType <em>
 * Type</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getColor <em>
 * Color</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage#getFigure()
 * @model
 * @generated
 */
public interface Figure extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage#getFigure_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage#getFigure_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getColor
	 * <em>Color</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Figure
