/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigFactory
 * @model kind="package"
 * @generated
 */
public interface IFConfigPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "IFConfig";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/ifconfiguration";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "ifconf";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	IFConfigPackage eINSTANCE = fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.NamedElementImpl
	 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.NamedElementImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl
	 * <em>IF Config</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFConfig()
	 * @generated
	 */
	int IF_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_CONFIG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_CONFIG__INSTANCES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Observers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_CONFIG__OBSERVERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Clocks</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_CONFIG__CLOCKS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Time Constraint</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_CONFIG__TIME_CONSTRAINT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IF Config</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_CONFIG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.InstanceImpl
	 * <em>Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.InstanceImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PID = 2;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE__QUEUE = 3;

	/**
	 * The feature id for the '<em><b>Variable Set</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE__VARIABLE_SET = 4;

	/**
	 * The feature id for the '<em><b>Paramater Set</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE__PARAMATER_SET = 5;

	/**
	 * The number of structural features of the '<em>Instance</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl
	 * <em>Observer Instance</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getObserverInstance()
	 * @generated
	 */
	int OBSERVER_INSTANCE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__STATE = 1;

	/**
	 * The feature id for the '<em><b>Pid</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__PID = 2;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__QUEUE = 3;

	/**
	 * The feature id for the '<em><b>Variable Set</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__VARIABLE_SET = 4;

	/**
	 * The feature id for the '<em><b>Paramater Set</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__PARAMATER_SET = 5;

	/**
	 * The feature id for the '<em><b>Event Set</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__EVENT_SET = 6;

	/**
	 * The feature id for the '<em><b>Status</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__STATUS = 7;

	/**
	 * The feature id for the '<em><b>Cut</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE__CUT = 8;

	/**
	 * The number of structural features of the '<em>Observer Instance</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_INSTANCE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.StatusImpl
	 * <em>Status</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.StatusImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getStatus()
	 * @generated
	 */
	int STATUS = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATUS__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Status</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATUS_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.CutImpl <em>Cut</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.CutImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getCut()
	 * @generated
	 */
	int CUT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Cut</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CUT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.StateImpl <em>State</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.StateImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getState()
	 * @generated
	 */
	int STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>State</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.TransitionImpl
	 * <em>Transition</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.TransitionImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 7;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.EnabledTransitionsImpl
	 * <em>Enabled Transitions</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.EnabledTransitionsImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getEnabledTransitions()
	 * @generated
	 */
	int ENABLED_TRANSITIONS = 8;

	/**
	 * The feature id for the '<em><b>Enabled Transitions</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITIONS__ENABLED_TRANSITIONS = 0;

	/**
	 * The number of structural features of the '<em>Enabled Transitions</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENABLED_TRANSITIONS_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl
	 * <em>Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 9;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__KIND = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Process</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__PROCESS = 3;

	/**
	 * The feature id for the '<em><b>By</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__BY = 4;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__FROM = 5;

	/**
	 * The feature id for the '<em><b>Via</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__VIA = 6;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__TO = 7;

	/**
	 * The number of structural features of the '<em>Action</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.VariableSetImpl
	 * <em>Variable Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.VariableSetImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getVariableSet()
	 * @generated
	 */
	int VARIABLE_SET = 11;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterSetImpl
	 * <em>Parameter Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterSetImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getParameterSet()
	 * @generated
	 */
	int PARAMETER_SET = 12;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.QueueImpl <em>Queue</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.QueueImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 13;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl
	 * <em>Message</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIGNAL_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__FROM = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TO = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameter Set</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__PARAMETER_SET = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SET__VARIABLES = 0;

	/**
	 * The number of structural features of the '<em>Variable Set</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SET_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Paramaters</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET__PARAMATERS = 0;

	/**
	 * The number of structural features of the '<em>Parameter Set</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_SET_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Messages</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUEUE__MESSAGES = 0;

	/**
	 * The number of structural features of the '<em>Queue</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int QUEUE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.VariableImpl
	 * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.VariableImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VARIABLE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.VariableValueImpl
	 * <em>Variable Value</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.VariableValueImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getVariableValue()
	 * @generated
	 */
	int VARIABLE_VALUE = 15;

	/**
	 * The number of structural features of the '<em>Variable Value</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VARIABLE_VALUE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterImpl
	 * <em>Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = VARIABLE__NAME;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VARIABLE = VARIABLE__VARIABLE;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = VARIABLE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.TypeImpl <em>Type</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.TypeImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Type</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ClockImpl <em>Clock</em>}
	 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ClockImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getClock()
	 * @generated
	 */
	int CLOCK = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLOCK__ID = VARIABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clock</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CLOCK_FEATURE_COUNT = VARIABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.DiscreteClockImpl
	 * <em>Discrete Clock</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.DiscreteClockImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getDiscreteClock()
	 * @generated
	 */
	int DISCRETE_CLOCK = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISCRETE_CLOCK__ID = CLOCK__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISCRETE_CLOCK__VALUE = CLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Discrete Clock</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISCRETE_CLOCK_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ContinuousClockImpl
	 * <em>Continuous Clock</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ContinuousClockImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getContinuousClock()
	 * @generated
	 */
	int CONTINUOUS_CLOCK = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_CLOCK__ID = CLOCK__ID;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_CLOCK__VALUE = CLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Continuous Clock</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CONTINUOUS_CLOCK_FEATURE_COUNT = CLOCK_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.PidImpl <em>Pid</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.PidImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getPid()
	 * @generated
	 */
	int PID = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PID__NAME = VARIABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PID__NUMBER = VARIABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Pid</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PID_FEATURE_COUNT = VARIABLE_VALUE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFIntegerImpl
	 * <em>IF Integer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFIntegerImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFInteger()
	 * @generated
	 */
	int IF_INTEGER = 22;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_INTEGER__VALUE = VARIABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IF Integer</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_INTEGER_FEATURE_COUNT = VARIABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFRealImpl
	 * <em>IF Real</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFRealImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFReal()
	 * @generated
	 */
	int IF_REAL = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_REAL__VALUE = VARIABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IF Real</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_REAL_FEATURE_COUNT = VARIABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFBooleanImpl
	 * <em>IF Boolean</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFBooleanImpl
	 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFBoolean()
	 * @generated
	 */
	int IF_BOOLEAN = 24;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_BOOLEAN__VALUE = VARIABLE_VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IF Boolean</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int IF_BOOLEAN_FEATURE_COUNT = VARIABLE_VALUE_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig <em>IF Config</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IF Config</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfig
	 * @generated
	 */
	EClass getIFConfig();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getInstances
	 * <em>Instances</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Instances</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getInstances()
	 * @see #getIFConfig()
	 * @generated
	 */
	EReference getIFConfig_Instances();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getObservers
	 * <em>Observers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Observers</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getObservers()
	 * @see #getIFConfig()
	 * @generated
	 */
	EReference getIFConfig_Observers();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getClocks
	 * <em>Clocks</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Clocks</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getClocks()
	 * @see #getIFConfig()
	 * @generated
	 */
	EReference getIFConfig_Clocks();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getTimeConstraint
	 * <em>Time Constraint</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Time Constraint</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getTimeConstraint()
	 * @see #getIFConfig()
	 * @generated
	 */
	EAttribute getIFConfig_TimeConstraint();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Instance#getType()
	 * @see #getInstance()
	 * @generated
	 */
	EAttribute getInstance_Type();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance#getState
	 * <em>State</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Instance#getState()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_State();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance#getPid <em>Pid</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Pid</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Instance#getPid()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Pid();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance#getQueue
	 * <em>Queue</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Queue</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Instance#getQueue()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_Queue();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance#getVariableSet
	 * <em>Variable Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Variable Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Instance#getVariableSet()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_VariableSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance#getParamaterSet
	 * <em>Paramater Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Paramater Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Instance#getParamaterSet()
	 * @see #getInstance()
	 * @generated
	 */
	EReference getInstance_ParamaterSet();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance
	 * <em>Observer Instance</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Observer Instance</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance
	 * @generated
	 */
	EClass getObserverInstance();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getType()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EAttribute getObserverInstance_Type();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getState
	 * <em>State</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>State</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getState()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_State();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getPid
	 * <em>Pid</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Pid</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getPid()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_Pid();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getQueue
	 * <em>Queue</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Queue</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getQueue()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_Queue();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getVariableSet
	 * <em>Variable Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Variable Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getVariableSet()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_VariableSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getParamaterSet
	 * <em>Paramater Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Paramater Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getParamaterSet()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_ParamaterSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getEventSet
	 * <em>Event Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Event Set</em>
	 *         '.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getEventSet()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_EventSet();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getStatus
	 * <em>Status</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Status</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getStatus()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_Status();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getCut
	 * <em>Cut</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Cut</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance#getCut()
	 * @see #getObserverInstance()
	 * @generated
	 */
	EReference getObserverInstance_Cut();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Status <em>Status</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Status</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Status
	 * @generated
	 */
	EClass getStatus();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Cut <em>Cut</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Cut</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Cut
	 * @generated
	 */
	EClass getCut();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.State <em>State</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Transition
	 * <em>Transition</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Transition#getActions
	 * <em>Actions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Actions</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Transition#getActions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Actions();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Transition#getNumber
	 * <em>Number</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Transition#getNumber()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_Number();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions
	 * <em>Enabled Transitions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Enabled Transitions</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions
	 * @generated
	 */
	EClass getEnabledTransitions();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions#getEnabledTransitions
	 * <em>Enabled Transitions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Enabled Transitions</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions#getEnabledTransitions()
	 * @see #getEnabledTransitions()
	 * @generated
	 */
	EReference getEnabledTransitions_EnabledTransitions();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action <em>Action</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getKind <em>Kind</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getKind()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Kind();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getMessage
	 * <em>Message</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Message</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getMessage()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Message();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getProcess
	 * <em>Process</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Process</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getProcess()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Process();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getBy <em>By</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>By</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getBy()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_By();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getFrom <em>From</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getFrom()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_From();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getVia <em>Via</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Via</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getVia()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Via();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Action#getTo <em>To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Action#getTo()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_To();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.VariableSet
	 * <em>Variable Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.VariableSet
	 * @generated
	 */
	EClass getVariableSet();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.VariableSet#getVariables
	 * <em>Variables</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Variables</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.VariableSet#getVariables()
	 * @see #getVariableSet()
	 * @generated
	 */
	EReference getVariableSet_Variables();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ParameterSet
	 * <em>Parameter Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ParameterSet
	 * @generated
	 */
	EClass getParameterSet();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ParameterSet#getParamaters
	 * <em>Paramaters</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Paramaters</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ParameterSet#getParamaters()
	 * @see #getParameterSet()
	 * @generated
	 */
	EReference getParameterSet_Paramaters();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Queue <em>Queue</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Queue
	 * @generated
	 */
	EClass getQueue();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Queue#getMessages
	 * <em>Messages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Messages</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Queue#getMessages()
	 * @see #getQueue()
	 * @generated
	 */
	EReference getQueue_Messages();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Message <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Message#getSignalType
	 * <em>Signal Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Signal Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Message#getSignalType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_SignalType();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Message#getFrom <em>From</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Message#getFrom()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_From();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Message#getTo <em>To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Message#getTo()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_To();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Message#getParameterSet
	 * <em>Parameter Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Parameter Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Message#getParameterSet()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_ParameterSet();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Variable#getVariable
	 * <em>Variable</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Variable</em>
	 *         '.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Variable#getVariable()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Variable();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.VariableValue
	 * <em>Variable Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.VariableValue
	 * @generated
	 */
	EClass getVariableValue();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Parameter <em>Parameter</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Type <em>Type</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Clock <em>Clock</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Clock</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Clock
	 * @generated
	 */
	EClass getClock();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Clock#getId <em>Id</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Clock#getId()
	 * @see #getClock()
	 * @generated
	 */
	EAttribute getClock_Id();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.DiscreteClock
	 * <em>Discrete Clock</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Discrete Clock</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.DiscreteClock
	 * @generated
	 */
	EClass getDiscreteClock();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.DiscreteClock#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.DiscreteClock#getValue()
	 * @see #getDiscreteClock()
	 * @generated
	 */
	EAttribute getDiscreteClock_Value();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ContinuousClock
	 * <em>Continuous Clock</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Continuous Clock</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ContinuousClock
	 * @generated
	 */
	EClass getContinuousClock();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ContinuousClock#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.ContinuousClock#getValue()
	 * @see #getContinuousClock()
	 * @generated
	 */
	EAttribute getContinuousClock_Value();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Pid <em>Pid</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Pid</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Pid
	 * @generated
	 */
	EClass getPid();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Pid#getNumber <em>Number</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.Pid#getNumber()
	 * @see #getPid()
	 * @generated
	 */
	EAttribute getPid_Number();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFInteger <em>IF Integer</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IF Integer</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFInteger
	 * @generated
	 */
	EClass getIFInteger();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFInteger#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFInteger#getValue()
	 * @see #getIFInteger()
	 * @generated
	 */
	EAttribute getIFInteger_Value();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFReal <em>IF Real</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IF Real</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFReal
	 * @generated
	 */
	EClass getIFReal();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFReal#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFReal#getValue()
	 * @see #getIFReal()
	 * @generated
	 */
	EAttribute getIFReal_Value();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFBoolean <em>IF Boolean</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>IF Boolean</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFBoolean
	 * @generated
	 */
	EClass getIFBoolean();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFBoolean#isValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFBoolean#isValue()
	 * @see #getIFBoolean()
	 * @generated
	 */
	EAttribute getIFBoolean_Value();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IFConfigFactory getIFConfigFactory();

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
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.NamedElementImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl
		 * <em>IF Config</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFConfig()
		 * @generated
		 */
		EClass IF_CONFIG = eINSTANCE.getIFConfig();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IF_CONFIG__INSTANCES = eINSTANCE.getIFConfig_Instances();

		/**
		 * The meta object literal for the '<em><b>Observers</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IF_CONFIG__OBSERVERS = eINSTANCE.getIFConfig_Observers();

		/**
		 * The meta object literal for the '<em><b>Clocks</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference IF_CONFIG__CLOCKS = eINSTANCE.getIFConfig_Clocks();

		/**
		 * The meta object literal for the '<em><b>Time Constraint</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IF_CONFIG__TIME_CONSTRAINT = eINSTANCE
				.getIFConfig_TimeConstraint();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.InstanceImpl
		 * <em>Instance</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.InstanceImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute INSTANCE__TYPE = eINSTANCE.getInstance_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE__STATE = eINSTANCE.getInstance_State();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE__PID = eINSTANCE.getInstance_Pid();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE__QUEUE = eINSTANCE.getInstance_Queue();

		/**
		 * The meta object literal for the '<em><b>Variable Set</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE__VARIABLE_SET = eINSTANCE.getInstance_VariableSet();

		/**
		 * The meta object literal for the '<em><b>Paramater Set</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INSTANCE__PARAMATER_SET = eINSTANCE
				.getInstance_ParamaterSet();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl
		 * <em>Observer Instance</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ObserverInstanceImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getObserverInstance()
		 * @generated
		 */
		EClass OBSERVER_INSTANCE = eINSTANCE.getObserverInstance();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBSERVER_INSTANCE__TYPE = eINSTANCE
				.getObserverInstance_Type();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__STATE = eINSTANCE
				.getObserverInstance_State();

		/**
		 * The meta object literal for the '<em><b>Pid</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__PID = eINSTANCE.getObserverInstance_Pid();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__QUEUE = eINSTANCE
				.getObserverInstance_Queue();

		/**
		 * The meta object literal for the '<em><b>Variable Set</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__VARIABLE_SET = eINSTANCE
				.getObserverInstance_VariableSet();

		/**
		 * The meta object literal for the '<em><b>Paramater Set</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__PARAMATER_SET = eINSTANCE
				.getObserverInstance_ParamaterSet();

		/**
		 * The meta object literal for the '<em><b>Event Set</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__EVENT_SET = eINSTANCE
				.getObserverInstance_EventSet();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__STATUS = eINSTANCE
				.getObserverInstance_Status();

		/**
		 * The meta object literal for the '<em><b>Cut</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER_INSTANCE__CUT = eINSTANCE.getObserverInstance_Cut();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.StatusImpl
		 * <em>Status</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.StatusImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getStatus()
		 * @generated
		 */
		EClass STATUS = eINSTANCE.getStatus();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.CutImpl <em>Cut</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.CutImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getCut()
		 * @generated
		 */
		EClass CUT = eINSTANCE.getCut();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.StateImpl
		 * <em>State</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.StateImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.TransitionImpl
		 * <em>Transition</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.TransitionImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference TRANSITION__ACTIONS = eINSTANCE.getTransition_Actions();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TRANSITION__NUMBER = eINSTANCE.getTransition_Number();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.EnabledTransitionsImpl
		 * <em>Enabled Transitions</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.EnabledTransitionsImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getEnabledTransitions()
		 * @generated
		 */
		EClass ENABLED_TRANSITIONS = eINSTANCE.getEnabledTransitions();

		/**
		 * The meta object literal for the '<em><b>Enabled Transitions</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ENABLED_TRANSITIONS__ENABLED_TRANSITIONS = eINSTANCE
				.getEnabledTransitions_EnabledTransitions();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl
		 * <em>Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ActionImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION__KIND = eINSTANCE.getAction_Kind();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__MESSAGE = eINSTANCE.getAction_Message();

		/**
		 * The meta object literal for the '<em><b>Process</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__PROCESS = eINSTANCE.getAction_Process();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__BY = eINSTANCE.getAction_By();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__FROM = eINSTANCE.getAction_From();

		/**
		 * The meta object literal for the '<em><b>Via</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__VIA = eINSTANCE.getAction_Via();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__TO = eINSTANCE.getAction_To();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.VariableSetImpl
		 * <em>Variable Set</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.VariableSetImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getVariableSet()
		 * @generated
		 */
		EClass VARIABLE_SET = eINSTANCE.getVariableSet();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VARIABLE_SET__VARIABLES = eINSTANCE
				.getVariableSet_Variables();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterSetImpl
		 * <em>Parameter Set</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterSetImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getParameterSet()
		 * @generated
		 */
		EClass PARAMETER_SET = eINSTANCE.getParameterSet();

		/**
		 * The meta object literal for the '<em><b>Paramaters</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PARAMETER_SET__PARAMATERS = eINSTANCE
				.getParameterSet_Paramaters();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.QueueImpl
		 * <em>Queue</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.QueueImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getQueue()
		 * @generated
		 */
		EClass QUEUE = eINSTANCE.getQueue();

		/**
		 * The meta object literal for the '<em><b>Messages</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference QUEUE__MESSAGES = eINSTANCE.getQueue_Messages();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl
		 * <em>Message</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.MessageImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Signal Type</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MESSAGE__SIGNAL_TYPE = eINSTANCE.getMessage_SignalType();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE__FROM = eINSTANCE.getMessage_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE__TO = eINSTANCE.getMessage_To();

		/**
		 * The meta object literal for the '<em><b>Parameter Set</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE__PARAMETER_SET = eINSTANCE.getMessage_ParameterSet();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.VariableImpl
		 * <em>Variable</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.VariableImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VARIABLE__VARIABLE = eINSTANCE.getVariable_Variable();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.VariableValueImpl
		 * <em>Variable Value</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.VariableValueImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getVariableValue()
		 * @generated
		 */
		EClass VARIABLE_VALUE = eINSTANCE.getVariableValue();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterImpl
		 * <em>Parameter</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ParameterImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.TypeImpl
		 * <em>Type</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.TypeImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ClockImpl
		 * <em>Clock</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ClockImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getClock()
		 * @generated
		 */
		EClass CLOCK = eINSTANCE.getClock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CLOCK__ID = eINSTANCE.getClock_Id();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.DiscreteClockImpl
		 * <em>Discrete Clock</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.DiscreteClockImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getDiscreteClock()
		 * @generated
		 */
		EClass DISCRETE_CLOCK = eINSTANCE.getDiscreteClock();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DISCRETE_CLOCK__VALUE = eINSTANCE.getDiscreteClock_Value();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.ContinuousClockImpl
		 * <em>Continuous Clock</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.ContinuousClockImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getContinuousClock()
		 * @generated
		 */
		EClass CONTINUOUS_CLOCK = eINSTANCE.getContinuousClock();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute CONTINUOUS_CLOCK__VALUE = eINSTANCE
				.getContinuousClock_Value();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.PidImpl <em>Pid</em>}
		 * ' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.PidImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getPid()
		 * @generated
		 */
		EClass PID = eINSTANCE.getPid();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PID__NUMBER = eINSTANCE.getPid_Number();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFIntegerImpl
		 * <em>IF Integer</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFIntegerImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFInteger()
		 * @generated
		 */
		EClass IF_INTEGER = eINSTANCE.getIFInteger();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IF_INTEGER__VALUE = eINSTANCE.getIFInteger_Value();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFRealImpl
		 * <em>IF Real</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFRealImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFReal()
		 * @generated
		 */
		EClass IF_REAL = eINSTANCE.getIFReal();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IF_REAL__VALUE = eINSTANCE.getIFReal_Value();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.IFConfig.impl.IFBooleanImpl
		 * <em>IF Boolean</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFBooleanImpl
		 * @see fr.irit.ifclipse.metamodel.IFConfig.impl.IFConfigPackageImpl#getIFBoolean()
		 * @generated
		 */
		EClass IF_BOOLEAN = eINSTANCE.getIFBoolean();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute IF_BOOLEAN__VALUE = eINSTANCE.getIFBoolean_Value();

	}

} // IFConfigPackage
