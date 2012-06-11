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
 * <em><b>Variable Set</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableSet#getVariables
 * <em>Variables</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getVariableSet()
 * @model
 * @generated
 */
public interface VariableSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage#getVariableSet_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

} // VariableSet
