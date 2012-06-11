/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Queue</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Queue#getMessages <em>Messages
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getQueue()
 * @model
 * @generated
 */
public interface Queue extends EObject {
	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Message}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Messages</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getQueue_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessages();

} // Queue
