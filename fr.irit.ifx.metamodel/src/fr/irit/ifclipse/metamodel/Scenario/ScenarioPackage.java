/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.Scenario;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.metamodel.Scenario.ScenarioFactory
 * @model kind="package"
 * @generated
 */
public interface ScenarioPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "Scenario";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/scenario";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "scenario";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ScenarioPackage eINSTANCE = fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioImpl
	 * <em>Scenario</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioImpl
	 * @see fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioPackageImpl#getScenario()
	 * @generated
	 */
	int SCENARIO = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__NAME = IFConfigPackage.NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Pids</b></em>' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__PIDS = IFConfigPackage.NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fired Transitions</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO__FIRED_TRANSITIONS = IFConfigPackage.NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Scenario</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int SCENARIO_FEATURE_COUNT = IFConfigPackage.NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.Scenario.Scenario <em>Scenario</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Scenario</em>'.
	 * @see fr.irit.ifclipse.metamodel.Scenario.Scenario
	 * @generated
	 */
	EClass getScenario();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.Scenario.Scenario#getPids
	 * <em>Pids</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '<em>Pids</em>
	 *         '.
	 * @see fr.irit.ifclipse.metamodel.Scenario.Scenario#getPids()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_Pids();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.Scenario.Scenario#getFiredTransitions
	 * <em>Fired Transitions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Fired Transitions</em>'.
	 * @see fr.irit.ifclipse.metamodel.Scenario.Scenario#getFiredTransitions()
	 * @see #getScenario()
	 * @generated
	 */
	EReference getScenario_FiredTransitions();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ScenarioFactory getScenarioFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioImpl
		 * <em>Scenario</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioImpl
		 * @see fr.irit.ifclipse.metamodel.Scenario.impl.ScenarioPackageImpl#getScenario()
		 * @generated
		 */
		EClass SCENARIO = eINSTANCE.getScenario();

		/**
		 * The meta object literal for the '<em><b>Pids</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__PIDS = eINSTANCE.getScenario_Pids();

		/**
		 * The meta object literal for the '<em><b>Fired Transitions</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference SCENARIO__FIRED_TRANSITIONS = eINSTANCE
				.getScenario_FiredTransitions();

	}

} // ScenarioPackage
