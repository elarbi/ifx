/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage
 * @generated
 */
public interface UMLConfigFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	UMLConfigFactory eINSTANCE = fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>UML Config</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>UML Config</em>'.
	 * @generated
	 */
	UMLConfig createUMLConfig();

	/**
	 * Returns a new object of class '<em>Activity Group</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Activity Group</em>'.
	 * @generated
	 */
	ActivityGroup createActivityGroup();

	/**
	 * Returns a new object of class '<em>Initial Thread</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Initial Thread</em>'.
	 * @generated
	 */
	InitialThread createInitialThread();

	/**
	 * Returns a new object of class '<em>Call Stack</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Call Stack</em>'.
	 * @generated
	 */
	CallStack createCallStack();

	/**
	 * Returns a new object of class '<em>Object</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Object</em>'.
	 * @generated
	 */
	Object createObject();

	/**
	 * Returns a new object of class '<em>Port</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Port</em>'.
	 * @generated
	 */
	Port createPort();

	/**
	 * Returns a new object of class '<em>Observer</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Observer</em>'.
	 * @generated
	 */
	Observer createObserver();

	/**
	 * Returns a new object of class '<em>Event Set</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Event Set</em>'.
	 * @generated
	 */
	EventSet createEventSet();

	/**
	 * Returns a new object of class '<em>Event</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>Action</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Discrete Time</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Discrete Time</em>'.
	 * @generated
	 */
	DiscreteTime createDiscreteTime();

	/**
	 * Returns a new object of class '<em>Dbm Time</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Dbm Time</em>'.
	 * @generated
	 */
	DbmTime createDbmTime();

	/**
	 * Returns a new object of class '<em>Pid</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Pid</em>'.
	 * @generated
	 */
	Pid createPid();

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
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	UMLConfigPackage getUMLConfigPackage();

} // UMLConfigFactory
