/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Scenario Participant</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant#getInstances
 * <em>Instances</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant#getObservers
 * <em>Observers</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getScenarioParticipant()
 * @model
 * @generated
 */
public interface ScenarioParticipant extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getScenarioParticipant_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Observers</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ObserverInstance}
	 * . <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observers</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Observers</em>' containment reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getScenarioParticipant_Observers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObserverInstance> getObservers();

} // ScenarioParticipant
