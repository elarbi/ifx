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
 * <em><b>Action</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getKind <em>Kind</em>}
 * </li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getValue <em>Value
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getProcess <em>Process
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getBy <em>By</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getFrom <em>From</em>}
 * </li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getVia <em>Via</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see #setKind(String)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getKind <em>Kind</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Kind</em>' attribute.
	 * @see #getKind()
	 * @generated
	 */
	void setKind(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Process</em>' containment reference.
	 * @see #setProcess(Pid)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction_Process()
	 * @model containment="true"
	 * @generated
	 */
	Pid getProcess();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getProcess
	 * <em>Process</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Process</em>' containment reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(Pid value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>By</em>' containment reference.
	 * @see #setBy(Pid)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction_By()
	 * @model containment="true"
	 * @generated
	 */
	Pid getBy();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getBy <em>By</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>By</em>' containment reference.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(Pid value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From</em>' containment reference.
	 * @see #setFrom(Pid)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction_From()
	 * @model containment="true"
	 * @generated
	 */
	Pid getFrom();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getFrom <em>From</em>}
	 * ' containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Pid value);

	/**
	 * Returns the value of the '<em><b>Via</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Via</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Via</em>' containment reference.
	 * @see #setVia(Pid)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction_Via()
	 * @model containment="true"
	 * @generated
	 */
	Pid getVia();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getVia <em>Via</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Via</em>' containment reference.
	 * @see #getVia()
	 * @generated
	 */
	void setVia(Pid value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' containment reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To</em>' containment reference.
	 * @see #setTo(Pid)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getAction_To()
	 * @model containment="true"
	 * @generated
	 */
	Pid getTo();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getTo <em>To</em>}'
	 * containment reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Pid value);

} // Action
