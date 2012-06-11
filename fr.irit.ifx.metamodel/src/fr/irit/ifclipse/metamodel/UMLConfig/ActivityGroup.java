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
 * <em><b>Activity Group</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getNo <em>No
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getObjects <em>
 * Objects</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getQueue <em>
 * Queue</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getRuning <em>
 * Runing</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getCallStack
 * <em>Call Stack</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getActivityGroup()
 * @model
 * @generated
 */
public interface ActivityGroup extends Entity {
	/**
	 * Returns the value of the '<em><b>No</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>No</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>No</em>' attribute.
	 * @see #setNo(int)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getActivityGroup_No()
	 * @model
	 * @generated
	 */
	int getNo();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getNo
	 * <em>No</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>No</em>' attribute.
	 * @see #getNo()
	 * @generated
	 */
	void setNo(int value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' reference list. The
	 * list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Objects</em>' reference list.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getActivityGroup_Objects()
	 * @model
	 * @generated
	 */
	EList<fr.irit.ifclipse.metamodel.UMLConfig.Object> getObjects();

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
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getActivityGroup_Queue()
	 * @model containment="true"
	 * @generated
	 */
	Queue getQueue();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getQueue
	 * <em>Queue</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Queue</em>' containment reference.
	 * @see #getQueue()
	 * @generated
	 */
	void setQueue(Queue value);

	/**
	 * Returns the value of the '<em><b>Runing</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runing</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Runing</em>' reference.
	 * @see #setRuning(fr.irit.ifclipse.metamodel.UMLConfig.Object)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getActivityGroup_Runing()
	 * @model
	 * @generated
	 */
	fr.irit.ifclipse.metamodel.UMLConfig.Object getRuning();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getRuning
	 * <em>Runing</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Runing</em>' reference.
	 * @see #getRuning()
	 * @generated
	 */
	void setRuning(fr.irit.ifclipse.metamodel.UMLConfig.Object value);

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
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getActivityGroup_CallStack()
	 * @model containment="true"
	 * @generated
	 */
	CallStack getCallStack();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getCallStack
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

} // ActivityGroup
