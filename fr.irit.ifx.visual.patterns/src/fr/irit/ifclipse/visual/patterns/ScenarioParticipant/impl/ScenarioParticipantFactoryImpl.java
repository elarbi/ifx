/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Action;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Clock;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ContinuousClock;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Cut;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.DiscreteClock;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.EnabledTransitions;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFBoolean;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFInteger;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFReal;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ObserverInstance;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Parameter;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ParameterSet;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Pid;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Queue;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantFactory;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.State;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Status;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Transition;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Type;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Variable;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableSet;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ScenarioParticipantFactoryImpl extends EFactoryImpl implements
		ScenarioParticipantFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ScenarioParticipantFactory init() {
		try {
			ScenarioParticipantFactory theScenarioParticipantFactory = (ScenarioParticipantFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/scenarioparticipant");
			if (theScenarioParticipantFactory != null) {
				return theScenarioParticipantFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ScenarioParticipantFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ScenarioParticipantFactoryImpl() {
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
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT:
			return createScenarioParticipant();
		case ScenarioParticipantPackage.INSTANCE:
			return createInstance();
		case ScenarioParticipantPackage.OBSERVER_INSTANCE:
			return createObserverInstance();
		case ScenarioParticipantPackage.STATUS:
			return createStatus();
		case ScenarioParticipantPackage.CUT:
			return createCut();
		case ScenarioParticipantPackage.STATE:
			return createState();
		case ScenarioParticipantPackage.TRANSITION:
			return createTransition();
		case ScenarioParticipantPackage.ENABLED_TRANSITIONS:
			return createEnabledTransitions();
		case ScenarioParticipantPackage.ACTION:
			return createAction();
		case ScenarioParticipantPackage.MESSAGE:
			return createMessage();
		case ScenarioParticipantPackage.VARIABLE_SET:
			return createVariableSet();
		case ScenarioParticipantPackage.PARAMETER_SET:
			return createParameterSet();
		case ScenarioParticipantPackage.QUEUE:
			return createQueue();
		case ScenarioParticipantPackage.VARIABLE:
			return createVariable();
		case ScenarioParticipantPackage.PARAMETER:
			return createParameter();
		case ScenarioParticipantPackage.TYPE:
			return createType();
		case ScenarioParticipantPackage.CLOCK:
			return createClock();
		case ScenarioParticipantPackage.DISCRETE_CLOCK:
			return createDiscreteClock();
		case ScenarioParticipantPackage.CONTINUOUS_CLOCK:
			return createContinuousClock();
		case ScenarioParticipantPackage.PID:
			return createPid();
		case ScenarioParticipantPackage.IF_INTEGER:
			return createIFInteger();
		case ScenarioParticipantPackage.IF_REAL:
			return createIFReal();
		case ScenarioParticipantPackage.IF_BOOLEAN:
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
	public ScenarioParticipant createScenarioParticipant() {
		ScenarioParticipantImpl scenarioParticipant = new ScenarioParticipantImpl();
		return scenarioParticipant;
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
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
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
	public ScenarioParticipantPackage getScenarioParticipantPackage() {
		return (ScenarioParticipantPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ScenarioParticipantPackage getPackage() {
		return ScenarioParticipantPackage.eINSTANCE;
	}

} // ScenarioParticipantFactoryImpl
