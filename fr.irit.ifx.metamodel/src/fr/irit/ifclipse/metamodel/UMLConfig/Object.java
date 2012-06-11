/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Object</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getType <em>Type</em>}
 * </li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getPorts <em>Ports
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getQueue <em>Queue
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getObject()
 * @model
 * @generated
 */
public interface Object extends Entity {
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
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getObject_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getType <em>Type</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Port}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getObject_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Queue</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queue</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Queue</em>' containment reference.
	 * @see #setQueue(Queue)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getObject_Queue()
	 * @model containment="true"
	 * @generated
	 */
	Queue getQueue();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getQueue
	 * <em>Queue</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Queue</em>' containment reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(Queue value);

} // Object
