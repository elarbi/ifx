/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage
 * @generated
 */
public interface IFConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	IFConfigFactory eINSTANCE = fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>IF Config</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>IF Config</em>'.
	 * @generated
	 */
	IFConfig createIFConfig();

	/**
	 * Returns a new object of class '<em>Instance</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Instance</em>'.
	 * @generated
	 */
	Instance createInstance();

	/**
	 * Returns a new object of class '<em>Observer Instance</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Observer Instance</em>'.
	 * @generated
	 */
	ObserverInstance createObserverInstance();

	/**
	 * Returns a new object of class '<em>Status</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Cut</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Cut</em>'.
	 * @generated
	 */
	Cut createCut();

	/**
	 * Returns a new object of class '<em>State</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Transition</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Transition</em>'.
	 * @generated
	 */
	Transition createTransition();

	/**
	 * Returns a new object of class '<em>Enabled Transitions</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Enabled Transitions</em>'.
	 * @generated
	 */
	EnabledTransitions createEnabledTransitions();

	/**
	 * Returns a new object of class '<em>Action</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Variable Set</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Variable Set</em>'.
	 * @generated
	 */
	VariableSet createVariableSet();

	/**
	 * Returns a new object of class '<em>Parameter Set</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Parameter Set</em>'.
	 * @generated
	 */
	ParameterSet createParameterSet();

	/**
	 * Returns a new object of class '<em>Queue</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Queue</em>'.
	 * @generated
	 */
	Queue createQueue();

	/**
	 * Returns a new object of class '<em>Message</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Variable</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Parameter</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Type</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	Type createType();

	/**
	 * Returns a new object of class '<em>Clock</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Clock</em>'.
	 * @generated
	 */
	Clock createClock();

	/**
	 * Returns a new object of class '<em>Discrete Clock</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Discrete Clock</em>'.
	 * @generated
	 */
	DiscreteClock createDiscreteClock();

	/**
	 * Returns a new object of class '<em>Continuous Clock</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Continuous Clock</em>'.
	 * @generated
	 */
	ContinuousClock createContinuousClock();

	/**
	 * Returns a new object of class '<em>Pid</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Pid</em>'.
	 * @generated
	 */
	Pid createPid();

	/**
	 * Returns a new object of class '<em>IF Integer</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>IF Integer</em>'.
	 * @generated
	 */
	IFInteger createIFInteger();

	/**
	 * Returns a new object of class '<em>IF Real</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>IF Real</em>'.
	 * @generated
	 */
	IFReal createIFReal();

	/**
	 * Returns a new object of class '<em>IF Boolean</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>IF Boolean</em>'.
	 * @generated
	 */
	IFBoolean createIFBoolean();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	IFConfigPackage getIFConfigPackage();

} // IFConfigFactory
