/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getSignalType
 * <em>Signal Type</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getFrom
 * <em>From</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getTo
 * <em>To</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getParameterSet
 * <em>Parameter Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends NamedElement {
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
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getMessage_SignalType()
	 * @model
	 * @generated
	 */
	String getSignalType();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getSignalType
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
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getMessage_From()
	 * @model containment="true"
	 * @generated
	 */
	Pid getFrom();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getFrom
	 * <em>From</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>From</em>' containment reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Pid value);

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
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getMessage_To()
	 * @model containment="true"
	 * @generated
	 */
	Pid getTo();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getTo
	 * <em>To</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>To</em>' containment reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Pid value);

	/**
	 * Returns the value of the '<em><b>Parameter Set</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Set</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameter Set</em>' containment reference.
	 * @see #setParameterSet(ParameterSet)
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getMessage_ParameterSet()
	 * @model containment="true"
	 * @generated
	 */
	ParameterSet getParameterSet();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message#getParameterSet
	 * <em>Parameter Set</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Parameter Set</em>' containment
	 *            reference.
	 * @see #getParameterSet()
	 * @generated
	 */
	void setParameterSet(ParameterSet value);

} // Message
