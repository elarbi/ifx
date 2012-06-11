/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

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
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigFactory
 * @model kind="package"
 * @generated
 */
public interface UMLConfigPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "UMLConfig";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/umlconfiguration";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "umlconf";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	UMLConfigPackage eINSTANCE = fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.NamedElementImpl
	 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.NamedElementImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getNamedElement()
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
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl
	 * <em>UML Config</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getUMLConfig()
	 * @generated
	 */
	int UML_CONFIG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Activity Groups</b></em>' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG__ACTIVITY_GROUPS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initial Thread</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG__INITIAL_THREAD = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG__OBJECTS = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG__PORTS = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Observers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG__OBSERVERS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG__TIME = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>UML Config</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int UML_CONFIG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.EntityImpl
	 * <em>Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.EntityImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Entity</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl
	 * <em>Activity Group</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getActivityGroup()
	 * @generated
	 */
	int ACTIVITY_GROUP = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>No</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__NO = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Objects</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__OBJECTS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__QUEUE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Runing</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__RUNING = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Call Stack</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP__CALL_STACK = ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Activity Group</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_GROUP_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.InitialThreadImpl
	 * <em>Initial Thread</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.InitialThreadImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getInitialThread()
	 * @generated
	 */
	int INITIAL_THREAD = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INITIAL_THREAD__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Call Stack</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INITIAL_THREAD__CALL_STACK = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Initial Thread</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int INITIAL_THREAD_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.CallStackImpl
	 * <em>Call Stack</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.CallStackImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getCallStack()
	 * @generated
	 */
	int CALL_STACK = 5;

	/**
	 * The number of structural features of the '<em>Call Stack</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int CALL_STACK_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObjectImpl
	 * <em>Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ObjectImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT__TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ports</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT__PORTS = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT__QUEUE = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Object</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBJECT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.PortImpl <em>Port</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.PortImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT__TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Queue</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT__QUEUE = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObserverImpl
	 * <em>Observer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ObserverImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getObserver()
	 * @generated
	 */
	int OBSERVER = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER__NAME = ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER__TYPE = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event Set</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER__EVENT_SET = ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Observer</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int OBSERVER_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.EventSetImpl
	 * <em>Event Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.EventSetImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getEventSet()
	 * @generated
	 */
	int EVENT_SET = 9;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_SET__EVENTS = 0;

	/**
	 * The number of structural features of the '<em>Event Set</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_SET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.EventImpl
	 * <em>Event</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.EventImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 10;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT__ACTIONS = 0;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT__NUMBER = 1;

	/**
	 * The number of structural features of the '<em>Event</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl
	 * <em>Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

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
	 * The feature id for the '<em><b>Process</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__PROCESS = 2;

	/**
	 * The feature id for the '<em><b>By</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__BY = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__FROM = 4;

	/**
	 * The feature id for the '<em><b>Via</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__VIA = 5;

	/**
	 * The feature id for the '<em><b>To</b></em>' containment reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION__TO = 6;

	/**
	 * The number of structural features of the '<em>Action</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.TimeImpl <em>Time</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.TimeImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getTime()
	 * @generated
	 */
	int TIME = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME__NAME = ENTITY__NAME;

	/**
	 * The number of structural features of the '<em>Time</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TIME_FEATURE_COUNT = ENTITY_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.DiscreteTimeImpl
	 * <em>Discrete Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.DiscreteTimeImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getDiscreteTime()
	 * @generated
	 */
	int DISCRETE_TIME = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISCRETE_TIME__NAME = TIME__NAME;

	/**
	 * The number of structural features of the '<em>Discrete Time</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DISCRETE_TIME_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.DbmTimeImpl
	 * <em>Dbm Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.DbmTimeImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getDbmTime()
	 * @generated
	 */
	int DBM_TIME = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DBM_TIME__NAME = TIME__NAME;

	/**
	 * The number of structural features of the '<em>Dbm Time</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DBM_TIME_FEATURE_COUNT = TIME_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.VariableValueImpl
	 * <em>Variable Value</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.VariableValueImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getVariableValue()
	 * @generated
	 */
	int VARIABLE_VALUE = 16;

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
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.PidImpl <em>Pid</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.PidImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getPid()
	 * @generated
	 */
	int PID = 15;

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
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.QueueImpl
	 * <em>Queue</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.QueueImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getQueue()
	 * @generated
	 */
	int QUEUE = 17;

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
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.MessageImpl
	 * <em>Message</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.MessageImpl
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 18;

	/**
	 * The feature id for the '<em><b>Signal Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SIGNAL_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Destination Pid</b></em>' containment
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__DESTINATION_PID = 1;

	/**
	 * The number of structural features of the '<em>Message</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 2;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig
	 * <em>UML Config</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>UML Config</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig
	 * @generated
	 */
	EClass getUMLConfig();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getActivityGroups
	 * <em>Activity Groups</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Activity Groups</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getActivityGroups()
	 * @see #getUMLConfig()
	 * @generated
	 */
	EReference getUMLConfig_ActivityGroups();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getInitialThread
	 * <em>Initial Thread</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Initial Thread</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getInitialThread()
	 * @see #getUMLConfig()
	 * @generated
	 */
	EReference getUMLConfig_InitialThread();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getObjects
	 * <em>Objects</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Objects</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getObjects()
	 * @see #getUMLConfig()
	 * @generated
	 */
	EReference getUMLConfig_Objects();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getPorts
	 * <em>Ports</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Ports</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getPorts()
	 * @see #getUMLConfig()
	 * @generated
	 */
	EReference getUMLConfig_Ports();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getObservers
	 * <em>Observers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Observers</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getObservers()
	 * @see #getUMLConfig()
	 * @generated
	 */
	EReference getUMLConfig_Observers();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getTime
	 * <em>Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getTime()
	 * @see #getUMLConfig()
	 * @generated
	 */
	EReference getUMLConfig_Time();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup
	 * <em>Activity Group</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Activity Group</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup
	 * @generated
	 */
	EClass getActivityGroup();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getNo
	 * <em>No</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>No</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getNo()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EAttribute getActivityGroup_No();

	/**
	 * Returns the meta object for the reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getObjects
	 * <em>Objects</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Objects</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getObjects()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Objects();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getQueue
	 * <em>Queue</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Queue</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getQueue()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Queue();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getRuning
	 * <em>Runing</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Runing</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getRuning()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_Runing();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getCallStack
	 * <em>Call Stack</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Call Stack</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup#getCallStack()
	 * @see #getActivityGroup()
	 * @generated
	 */
	EReference getActivityGroup_CallStack();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.InitialThread
	 * <em>Initial Thread</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Initial Thread</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.InitialThread
	 * @generated
	 */
	EClass getInitialThread();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.InitialThread#getCallStack
	 * <em>Call Stack</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Call Stack</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.InitialThread#getCallStack()
	 * @see #getInitialThread()
	 * @generated
	 */
	EReference getInitialThread_CallStack();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.CallStack
	 * <em>Call Stack</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Call Stack</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.CallStack
	 * @generated
	 */
	EClass getCallStack();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object <em>Object</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Object</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Object
	 * @generated
	 */
	EClass getObject();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getType <em>Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Object#getType()
	 * @see #getObject()
	 * @generated
	 */
	EAttribute getObject_Type();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getPorts
	 * <em>Ports</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Ports</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Object#getPorts()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Ports();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object#getQueue
	 * <em>Queue</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Queue</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Object#getQueue()
	 * @see #getObject()
	 * @generated
	 */
	EReference getObject_Queue();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Port <em>Port</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Port</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Port#getType <em>Type</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Port#getType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_Type();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Port#getQueue <em>Queue</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Queue</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Port#getQueue()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Queue();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Observer</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Observer
	 * @generated
	 */
	EClass getObserver();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Observer#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Observer#getType()
	 * @see #getObserver()
	 * @generated
	 */
	EAttribute getObserver_Type();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Observer#getEventSet
	 * <em>Event Set</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Event Set</em>
	 *         '.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Observer#getEventSet()
	 * @see #getObserver()
	 * @generated
	 */
	EReference getObserver_EventSet();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.EventSet <em>Event Set</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event Set</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.EventSet
	 * @generated
	 */
	EClass getEventSet();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.EventSet#getEvents
	 * <em>Events</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Events</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.EventSet#getEvents()
	 * @see #getEventSet()
	 * @generated
	 */
	EReference getEventSet_Events();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Event <em>Event</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Event#getActions
	 * <em>Actions</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Actions</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Event#getActions()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Actions();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Event#getNumber
	 * <em>Number</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Event#getNumber()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Number();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action <em>Action</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getKind <em>Kind</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action#getKind()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Kind();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getValue
	 * <em>Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getProcess
	 * <em>Process</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Process</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action#getProcess()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Process();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getBy <em>By</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>By</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action#getBy()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_By();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getFrom <em>From</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>From</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action#getFrom()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_From();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getVia <em>Via</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Via</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action#getVia()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Via();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action#getTo <em>To</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>To</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action#getTo()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_To();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Time <em>Time</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Time</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Time
	 * @generated
	 */
	EClass getTime();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.DiscreteTime
	 * <em>Discrete Time</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Discrete Time</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.DiscreteTime
	 * @generated
	 */
	EClass getDiscreteTime();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.DbmTime <em>Dbm Time</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Dbm Time</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.DbmTime
	 * @generated
	 */
	EClass getDbmTime();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Pid <em>Pid</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Pid</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Pid
	 * @generated
	 */
	EClass getPid();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Pid#getNumber
	 * <em>Number</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Pid#getNumber()
	 * @see #getPid()
	 * @generated
	 */
	EAttribute getPid_Number();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.VariableValue
	 * <em>Variable Value</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Variable Value</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.VariableValue
	 * @generated
	 */
	EClass getVariableValue();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Queue <em>Queue</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Queue
	 * @generated
	 */
	EClass getQueue();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Queue#getMessages
	 * <em>Messages</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Messages</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Queue#getMessages()
	 * @see #getQueue()
	 * @generated
	 */
	EReference getQueue_Messages();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Message <em>Message</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Message#getSignalType
	 * <em>Signal Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Signal Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Message#getSignalType()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_SignalType();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Message#getDestinationPid
	 * <em>Destination Pid</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '
	 *         <em>Destination Pid</em>'.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Message#getDestinationPid()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_DestinationPid();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UMLConfigFactory getUMLConfigFactory();

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
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.NamedElementImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getNamedElement()
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
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl
		 * <em>UML Config</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getUMLConfig()
		 * @generated
		 */
		EClass UML_CONFIG = eINSTANCE.getUMLConfig();

		/**
		 * The meta object literal for the '<em><b>Activity Groups</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_CONFIG__ACTIVITY_GROUPS = eINSTANCE
				.getUMLConfig_ActivityGroups();

		/**
		 * The meta object literal for the '<em><b>Initial Thread</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_CONFIG__INITIAL_THREAD = eINSTANCE
				.getUMLConfig_InitialThread();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_CONFIG__OBJECTS = eINSTANCE.getUMLConfig_Objects();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_CONFIG__PORTS = eINSTANCE.getUMLConfig_Ports();

		/**
		 * The meta object literal for the '<em><b>Observers</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_CONFIG__OBSERVERS = eINSTANCE.getUMLConfig_Observers();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference UML_CONFIG__TIME = eINSTANCE.getUMLConfig_Time();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.EntityImpl
		 * <em>Entity</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.EntityImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl
		 * <em>Activity Group</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ActivityGroupImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getActivityGroup()
		 * @generated
		 */
		EClass ACTIVITY_GROUP = eINSTANCE.getActivityGroup();

		/**
		 * The meta object literal for the '<em><b>No</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ACTIVITY_GROUP__NO = eINSTANCE.getActivityGroup_No();

		/**
		 * The meta object literal for the '<em><b>Objects</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTIVITY_GROUP__OBJECTS = eINSTANCE
				.getActivityGroup_Objects();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTIVITY_GROUP__QUEUE = eINSTANCE.getActivityGroup_Queue();

		/**
		 * The meta object literal for the '<em><b>Runing</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTIVITY_GROUP__RUNING = eINSTANCE.getActivityGroup_Runing();

		/**
		 * The meta object literal for the '<em><b>Call Stack</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTIVITY_GROUP__CALL_STACK = eINSTANCE
				.getActivityGroup_CallStack();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.InitialThreadImpl
		 * <em>Initial Thread</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.InitialThreadImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getInitialThread()
		 * @generated
		 */
		EClass INITIAL_THREAD = eINSTANCE.getInitialThread();

		/**
		 * The meta object literal for the '<em><b>Call Stack</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference INITIAL_THREAD__CALL_STACK = eINSTANCE
				.getInitialThread_CallStack();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.CallStackImpl
		 * <em>Call Stack</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.CallStackImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getCallStack()
		 * @generated
		 */
		EClass CALL_STACK = eINSTANCE.getCallStack();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObjectImpl
		 * <em>Object</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ObjectImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getObject()
		 * @generated
		 */
		EClass OBJECT = eINSTANCE.getObject();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBJECT__TYPE = eINSTANCE.getObject_Type();

		/**
		 * The meta object literal for the '<em><b>Ports</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBJECT__PORTS = eINSTANCE.getObject_Ports();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBJECT__QUEUE = eINSTANCE.getObject_Queue();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.PortImpl
		 * <em>Port</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.PortImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute PORT__TYPE = eINSTANCE.getPort_Type();

		/**
		 * The meta object literal for the '<em><b>Queue</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference PORT__QUEUE = eINSTANCE.getPort_Queue();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ObserverImpl
		 * <em>Observer</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ObserverImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getObserver()
		 * @generated
		 */
		EClass OBSERVER = eINSTANCE.getObserver();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute OBSERVER__TYPE = eINSTANCE.getObserver_Type();

		/**
		 * The meta object literal for the '<em><b>Event Set</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference OBSERVER__EVENT_SET = eINSTANCE.getObserver_EventSet();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.EventSetImpl
		 * <em>Event Set</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.EventSetImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getEventSet()
		 * @generated
		 */
		EClass EVENT_SET = eINSTANCE.getEventSet();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT_SET__EVENTS = eINSTANCE.getEventSet_Events();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.EventImpl
		 * <em>Event</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.EventImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference EVENT__ACTIONS = eINSTANCE.getEvent_Actions();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute EVENT__NUMBER = eINSTANCE.getEvent_Number();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl
		 * <em>Action</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.ActionImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getAction()
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
		 * The meta object literal for the '<em><b>Process</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__PROCESS = eINSTANCE.getAction_Process();

		/**
		 * The meta object literal for the '<em><b>By</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__BY = eINSTANCE.getAction_By();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__FROM = eINSTANCE.getAction_From();

		/**
		 * The meta object literal for the '<em><b>Via</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__VIA = eINSTANCE.getAction_Via();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ACTION__TO = eINSTANCE.getAction_To();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.TimeImpl
		 * <em>Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.TimeImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getTime()
		 * @generated
		 */
		EClass TIME = eINSTANCE.getTime();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.DiscreteTimeImpl
		 * <em>Discrete Time</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.DiscreteTimeImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getDiscreteTime()
		 * @generated
		 */
		EClass DISCRETE_TIME = eINSTANCE.getDiscreteTime();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.DbmTimeImpl
		 * <em>Dbm Time</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.DbmTimeImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getDbmTime()
		 * @generated
		 */
		EClass DBM_TIME = eINSTANCE.getDbmTime();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.PidImpl
		 * <em>Pid</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.PidImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getPid()
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
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.VariableValueImpl
		 * <em>Variable Value</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.VariableValueImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getVariableValue()
		 * @generated
		 */
		EClass VARIABLE_VALUE = eINSTANCE.getVariableValue();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.QueueImpl
		 * <em>Queue</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.QueueImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getQueue()
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
		 * {@link fr.irit.ifclipse.metamodel.UMLConfig.impl.MessageImpl
		 * <em>Message</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.MessageImpl
		 * @see fr.irit.ifclipse.metamodel.UMLConfig.impl.UMLConfigPackageImpl#getMessage()
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
		 * The meta object literal for the '<em><b>Destination Pid</b></em>'
		 * containment reference feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE__DESTINATION_PID = eINSTANCE
				.getMessage_DestinationPid();

	}

} // UMLConfigPackage
