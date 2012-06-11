/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Enabled Transitions</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.EnabledTransitions#getEnabledTransitions
 * <em>Enabled Transitions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getEnabledTransitions()
 * @model
 * @generated
 */
public interface EnabledTransitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Enabled Transitions</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enabled Transitions</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Enabled Transitions</em>' containment
	 *         reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getEnabledTransitions_EnabledTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getEnabledTransitions();

} // EnabledTransitions
