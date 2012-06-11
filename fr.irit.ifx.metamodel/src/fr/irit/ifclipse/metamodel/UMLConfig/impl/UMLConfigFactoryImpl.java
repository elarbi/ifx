/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.metamodel.UMLConfig.Action;
import fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup;
import fr.irit.ifclipse.metamodel.UMLConfig.CallStack;
import fr.irit.ifclipse.metamodel.UMLConfig.DbmTime;
import fr.irit.ifclipse.metamodel.UMLConfig.DiscreteTime;
import fr.irit.ifclipse.metamodel.UMLConfig.Event;
import fr.irit.ifclipse.metamodel.UMLConfig.EventSet;
import fr.irit.ifclipse.metamodel.UMLConfig.InitialThread;
import fr.irit.ifclipse.metamodel.UMLConfig.Message;
import fr.irit.ifclipse.metamodel.UMLConfig.Observer;
import fr.irit.ifclipse.metamodel.UMLConfig.Pid;
import fr.irit.ifclipse.metamodel.UMLConfig.Port;
import fr.irit.ifclipse.metamodel.UMLConfig.Queue;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigFactory;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class UMLConfigFactoryImpl extends EFactoryImpl implements
		UMLConfigFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static UMLConfigFactory init() {
		try {
			UMLConfigFactory theUMLConfigFactory = (UMLConfigFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/umlconfiguration");
			if (theUMLConfigFactory != null) {
				return theUMLConfigFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UMLConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLConfigFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case UMLConfigPackage.UML_CONFIG:
			return createUMLConfig();
		case UMLConfigPackage.ACTIVITY_GROUP:
			return createActivityGroup();
		case UMLConfigPackage.INITIAL_THREAD:
			return createInitialThread();
		case UMLConfigPackage.CALL_STACK:
			return createCallStack();
		case UMLConfigPackage.OBJECT:
			return createObject();
		case UMLConfigPackage.PORT:
			return createPort();
		case UMLConfigPackage.OBSERVER:
			return createObserver();
		case UMLConfigPackage.EVENT_SET:
			return createEventSet();
		case UMLConfigPackage.EVENT:
			return createEvent();
		case UMLConfigPackage.ACTION:
			return createAction();
		case UMLConfigPackage.DISCRETE_TIME:
			return createDiscreteTime();
		case UMLConfigPackage.DBM_TIME:
			return createDbmTime();
		case UMLConfigPackage.PID:
			return createPid();
		case UMLConfigPackage.QUEUE:
			return createQueue();
		case UMLConfigPackage.MESSAGE:
			return createMessage();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLConfig createUMLConfig() {
		UMLConfigImpl umlConfig = new UMLConfigImpl();
		return umlConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ActivityGroup createActivityGroup() {
		ActivityGroupImpl activityGroup = new ActivityGroupImpl();
		return activityGroup;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public InitialThread createInitialThread() {
		InitialThreadImpl initialThread = new InitialThreadImpl();
		return initialThread;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public CallStack createCallStack() {
		CallStackImpl callStack = new CallStackImpl();
		return callStack;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public fr.irit.ifclipse.metamodel.UMLConfig.Object createObject() {
		ObjectImpl object = new ObjectImpl();
		return object;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Observer createObserver() {
		ObserverImpl observer = new ObserverImpl();
		return observer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EventSet createEventSet() {
		EventSetImpl eventSet = new EventSetImpl();
		return eventSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiscreteTime createDiscreteTime() {
		DiscreteTimeImpl discreteTime = new DiscreteTimeImpl();
		return discreteTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DbmTime createDbmTime() {
		DbmTimeImpl dbmTime = new DbmTimeImpl();
		return dbmTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Pid createPid() {
		PidImpl pid = new PidImpl();
		return pid;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Queue createQueue() {
		QueueImpl queue = new QueueImpl();
		return queue;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLConfigPackage getUMLConfigPackage() {
		return (UMLConfigPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UMLConfigPackage getPackage() {
		return UMLConfigPackage.eINSTANCE;
	}

} // UMLConfigFactoryImpl
