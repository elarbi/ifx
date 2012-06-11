/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.Scenario;

import org.eclipse.emf.common.util.EList;

import fr.irit.ifclipse.metamodel.IFConfig.NamedElement;
import fr.irit.ifclipse.metamodel.IFConfig.Pid;
import fr.irit.ifclipse.metamodel.IFConfig.Transition;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Scenario</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.Scenario.Scenario#getPids <em>Pids
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.Scenario.Scenario#getFiredTransitions
 * <em>Fired Transitions</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage#getScenario()
 * @model
 * @generated
 */
public interface Scenario extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Pids</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Pid}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pids</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Pids</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage#getScenario_Pids()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pid> getPids();

	/**
	 * Returns the value of the '<em><b>Fired Transitions</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Transition}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fired Transitions</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Fired Transitions</em>' containment
	 *         reference list.
	 * @see fr.irit.ifclipse.metamodel.Scenario.ScenarioPackage#getScenario_FiredTransitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transition> getFiredTransitions();

} // Scenario
