/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Initial Thread</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.InitialThread#getCallStack
 * <em>Call Stack</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getInitialThread()
 * @model
 * @generated
 */
public interface InitialThread extends Entity {
	/**
	 * Returns the value of the '<em><b>Call Stack</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Call Stack</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Call Stack</em>' containment reference.
	 * @see #setCallStack(CallStack)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getInitialThread_CallStack()
	 * @model containment="true"
	 * @generated
	 */
	CallStack getCallStack();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.InitialThread#getCallStack
	 * <em>Call Stack</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Call Stack</em>' containment
	 *            reference.
	 * @see #getCallStack()
	 * @generated
	 */
	void setCallStack(CallStack value);

} // InitialThread
