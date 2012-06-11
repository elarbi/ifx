/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.metamodel.IFConfig.Action;
import fr.irit.ifclipse.metamodel.IFConfig.Clock;
import fr.irit.ifclipse.metamodel.IFConfig.ContinuousClock;
import fr.irit.ifclipse.metamodel.IFConfig.Cut;
import fr.irit.ifclipse.metamodel.IFConfig.DiscreteClock;
import fr.irit.ifclipse.metamodel.IFConfig.EnabledTransitions;
import fr.irit.ifclipse.metamodel.IFConfig.IFBoolean;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfig;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigFactory;
import fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage;
import fr.irit.ifclipse.metamodel.IFConfig.IFInteger;
import fr.irit.ifclipse.metamodel.IFConfig.IFReal;
import fr.irit.ifclipse.metamodel.IFConfig.Instance;
import fr.irit.ifclipse.metamodel.IFConfig.Message;
import fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance;
import fr.irit.ifclipse.metamodel.IFConfig.Parameter;
import fr.irit.ifclipse.metamodel.IFConfig.ParameterSet;
import fr.irit.ifclipse.metamodel.IFConfig.Pid;
import fr.irit.ifclipse.metamodel.IFConfig.Queue;
import fr.irit.ifclipse.metamodel.IFConfig.State;
import fr.irit.ifclipse.metamodel.IFConfig.Status;
import fr.irit.ifclipse.metamodel.IFConfig.Transition;
import fr.irit.ifclipse.metamodel.IFConfig.Type;
import fr.irit.ifclipse.metamodel.IFConfig.Variable;
import fr.irit.ifclipse.metamodel.IFConfig.VariableSet;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class IFConfigFactoryImpl extends EFactoryImpl implements
		IFConfigFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static IFConfigFactory init() {
		try {
			IFConfigFactory theIFConfigFactory = (IFConfigFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/ifconfiguration");
			if (theIFConfigFactory != null) {
				return theIFConfigFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IFConfigFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public IFConfigFactoryImpl() {
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
		case IFConfigPackage.IF_CONFIG:
			return createIFConfig();
		case IFConfigPackage.INSTANCE:
			return createInstance();
		case IFConfigPackage.OBSERVER_INSTANCE:
			return createObserverInstance();
		case IFConfigPackage.STATUS:
			return createStatus();
		case IFConfigPackage.CUT:
			return createCut();
		case IFConfigPackage.STATE:
			return createState();
		case IFConfigPackage.TRANSITION:
			return createTransition();
		case IFConfigPackage.ENABLED_TRANSITIONS:
			return createEnabledTransitions();
		case IFConfigPackage.ACTION:
			return createAction();
		case IFConfigPackage.MESSAGE:
			return createMessage();
		case IFConfigPackage.VARIABLE_SET:
			return createVariableSet();
		case IFConfigPackage.PARAMETER_SET:
			return createParameterSet();
		case IFConfigPackage.QUEUE:
			return createQueue();
		case IFConfigPackage.VARIABLE:
			return createVariable();
		case IFConfigPackage.PARAMETER:
			return createParameter();
		case IFConfigPackage.TYPE:
			return createType();
		case IFConfigPackage.CLOCK:
			return createClock();
		case IFConfigPackage.DISCRETE_CLOCK:
			return createDiscreteClock();
		case IFConfigPackage.CONTINUOUS_CLOCK:
			return createContinuousClock();
		case IFConfigPackage.PID:
			return createPid();
		case IFConfigPackage.IF_INTEGER:
			return createIFInteger();
		case IFConfigPackage.IF_REAL:
			return createIFReal();
		case IFConfigPackage.IF_BOOLEAN:
			return createIFBoolean();
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
	public IFConfig createIFConfig() {
		IFConfigImpl ifConfig = new IFConfigImpl();
		return ifConfig;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Instance createInstance() {
		InstanceImpl instance = new InstanceImpl();
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ObserverInstance createObserverInstance() {
		ObserverInstanceImpl observerInstance = new ObserverInstanceImpl();
		return observerInstance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Status createStatus() {
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Cut createCut() {
		CutImpl cut = new CutImpl();
		return cut;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EnabledTransitions createEnabledTransitions() {
		EnabledTransitionsImpl enabledTransitions = new EnabledTransitionsImpl();
		return enabledTransitions;
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
	public VariableSet createVariableSet() {
		VariableSetImpl variableSet = new VariableSetImpl();
		return variableSet;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ParameterSet createParameterSet() {
		ParameterSetImpl parameterSet = new ParameterSetImpl();
		return parameterSet;
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
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Type createType() {
		TypeImpl type = new TypeImpl();
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Clock createClock() {
		ClockImpl clock = new ClockImpl();
		return clock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public DiscreteClock createDiscreteClock() {
		DiscreteClockImpl discreteClock = new DiscreteClockImpl();
		return discreteClock;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ContinuousClock createContinuousClock() {
		ContinuousClockImpl continuousClock = new ContinuousClockImpl();
		return continuousClock;
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
	public IFInteger createIFInteger() {
		IFIntegerImpl ifInteger = new IFIntegerImpl();
		return ifInteger;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFReal createIFReal() {
		IFRealImpl ifReal = new IFRealImpl();
		return ifReal;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFBoolean createIFBoolean() {
		IFBooleanImpl ifBoolean = new IFBooleanImpl();
		return ifBoolean;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public IFConfigPackage getIFConfigPackage() {
		return (IFConfigPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IFConfigPackage getPackage() {
		return IFConfigPackage.eINSTANCE;
	}

} // IFConfigFactoryImpl
