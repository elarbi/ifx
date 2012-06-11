/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Variable</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Variable#getVariable <em>
 * Variable</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableValue)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getVariable_Variable()
	 * @model containment="true"
	 * @generated
	 */
	VariableValue getVariable();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Variable#getVariable
	 * <em>Variable</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Variable</em>' containment
	 *            reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableValue value);

} // Variable
