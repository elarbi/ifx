/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Message#getSignalType <em>
 * Signal Type</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Message#getDestinationPid
 * <em>Destination Pid</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Signal Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Signal Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Signal Type</em>' attribute.
	 * @see #setSignalType(String)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getMessage_SignalType()
	 * @model
	 * @generated
	 */
	String getSignalType();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Message#getSignalType
	 * <em>Signal Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Signal Type</em>' attribute.
	 * @see #getSignalType()
	 * @generated
	 */
	void setSignalType(String value);

	/**
	 * Returns the value of the '<em><b>Destination Pid</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination Pid</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Destination Pid</em>' containment
	 *         reference.
	 * @see #setDestinationPid(Pid)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getMessage_DestinationPid()
	 * @model containment="true"
	 * @generated
	 */
	Pid getDestinationPid();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Message#getDestinationPid
	 * <em>Destination Pid</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Destination Pid</em>' containment
	 *            reference.
	 * @see #getDestinationPid()
	 * @generated
	 */
	void setDestinationPid(Pid value);

} // Message
