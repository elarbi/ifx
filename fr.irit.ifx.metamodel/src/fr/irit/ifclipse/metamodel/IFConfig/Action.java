/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Action</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getKind <em>Kind</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getValue <em>Value
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getMessage <em>Message
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getProcess <em>Process
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getBy <em>By</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getFrom <em>From</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getVia <em>Via</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.Action#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction()
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
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_Kind()
	 * @model
	 * @generated
	 */
	String getKind();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getKind <em>Kind</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getValue
	 * <em>Value</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Message</em>' containment reference.
	 * @see #setMessage(Message)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_Message()
	 * @model containment="true"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getMessage
	 * <em>Message</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Message</em>' containment reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Process</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Process</em>' reference.
	 * @see #setProcess(Pid)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_Process()
	 * @model
	 * @generated
	 */
	Pid getProcess();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getProcess
	 * <em>Process</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Process</em>' reference.
	 * @see #getProcess()
	 * @generated
	 */
	void setProcess(Pid value);

	/**
	 * Returns the value of the '<em><b>By</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>By</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>By</em>' reference.
	 * @see #setBy(Pid)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_By()
	 * @model
	 * @generated
	 */
	Pid getBy();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getBy <em>By</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>By</em>' reference.
	 * @see #getBy()
	 * @generated
	 */
	void setBy(Pid value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Pid)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_From()
	 * @model
	 * @generated
	 */
	Pid getFrom();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getFrom <em>From</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Pid value);

	/**
	 * Returns the value of the '<em><b>Via</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Via</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Via</em>' reference.
	 * @see #setVia(Pid)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_Via()
	 * @model
	 * @generated
	 */
	Pid getVia();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getVia <em>Via</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Via</em>' reference.
	 * @see #getVia()
	 * @generated
	 */
	void setVia(Pid value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(Pid)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getAction_To()
	 * @model
	 * @generated
	 */
	Pid getTo();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getTo <em>To</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Pid value);

} // Action
