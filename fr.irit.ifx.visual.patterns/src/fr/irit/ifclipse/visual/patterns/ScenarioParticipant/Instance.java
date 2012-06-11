/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Instance</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getType
 * <em>Type</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getState
 * <em>State</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getPid
 * <em>Pid</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getQueue
 * <em>Queue</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getVariableSet
 * <em>Variable Set</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getParamaterSet
 * <em>Paramater Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getInstance()
 * @model
 * @generated
 */
public interface Instance extends EObject {
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
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getInstance_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>State</em>' containment reference.
	 * @see #setState(State)
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getInstance_State()
	 * @model containment="true"
	 * @generated
	 */
	State getState();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getState
	 * <em>State</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>State</em>' containment reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(State value);

	/**
	 * Returns the value of the '<em><b>Pid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pid</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pid</em>' containment reference.
	 * @see #setPid(Pid)
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getInstance_Pid()
	 * @model containment="true"
	 * @generated
	 */
	Pid getPid();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getPid
	 * <em>Pid</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Pid</em>' containment reference.
	 * @see #getPid()
	 * @generated
	 */
	void setPid(Pid value);

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
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getInstance_Queue()
	 * @model containment="true"
	 * @generated
	 */
	Queue getQueue();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getQueue
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
	 * Returns the value of the '<em><b>Variable Set</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Set</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Variable Set</em>' containment reference.
	 * @see #setVariableSet(VariableSet)
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getInstance_VariableSet()
	 * @model containment="true"
	 * @generated
	 */
	VariableSet getVariableSet();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getVariableSet
	 * <em>Variable Set</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Variable Set</em>' containment
	 *            reference.
	 * @see #getVariableSet()
	 * @generated
	 */
	void setVariableSet(VariableSet value);

	/**
	 * Returns the value of the '<em><b>Paramater Set</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramater Set</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Paramater Set</em>' containment reference.
	 * @see #setParamaterSet(ParameterSet)
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getInstance_ParamaterSet()
	 * @model containment="true"
	 * @generated
	 */
	ParameterSet getParamaterSet();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance#getParamaterSet
	 * <em>Paramater Set</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Paramater Set</em>' containment
	 *            reference.
	 * @see #getParamaterSet()
	 * @generated
	 */
	void setParamaterSet(ParameterSet value);

} // Instance
