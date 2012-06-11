/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.NamedElement;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ObserverInstance;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Parameter;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ParameterSet;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Pid;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Queue;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.State;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Status;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Transition;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Type;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Variable;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableSet;
import fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableValue;

/**
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage
 * @generated
 */
public class ScenarioParticipantAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ScenarioParticipantPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ScenarioParticipantAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ScenarioParticipantPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc --> This implementation returns <code>true</code> if
	 * the object is either the model's package or is an instance object of the
	 * model. <!-- end-user-doc -->
	 * 
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ScenarioParticipantSwitch<Adapter> modelSwitch = new ScenarioParticipantSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseScenarioParticipant(ScenarioParticipant object) {
			return createScenarioParticipantAdapter();
		}

		@Override
		public Adapter caseInstance(Instance object) {
			return createInstanceAdapter();
		}

		@Override
		public Adapter caseObserverInstance(ObserverInstance object) {
			return createObserverInstanceAdapter();
		}

		@Override
		public Adapter caseStatus(Status object) {
			return createStatusAdapter();
		}

		@Override
		public Adapter caseCut(Cut object) {
			return createCutAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseTransition(Transition object) {
			return createTransitionAdapter();
		}

		@Override
		public Adapter caseEnabledTransitions(EnabledTransitions object) {
			return createEnabledTransitionsAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
		}

		@Override
		public Adapter caseVariableSet(VariableSet object) {
			return createVariableSetAdapter();
		}

		@Override
		public Adapter caseParameterSet(ParameterSet object) {
			return createParameterSetAdapter();
		}

		@Override
		public Adapter caseQueue(Queue object) {
			return createQueueAdapter();
		}

		@Override
		public Adapter caseVariable(Variable object) {
			return createVariableAdapter();
		}

		@Override
		public Adapter caseVariableValue(VariableValue object) {
			return createVariableValueAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseType(Type object) {
			return createTypeAdapter();
		}

		@Override
		public Adapter caseClock(Clock object) {
			return createClockAdapter();
		}

		@Override
		public Adapter caseDiscreteClock(DiscreteClock object) {
			return createDiscreteClockAdapter();
		}

		@Override
		public Adapter caseContinuousClock(ContinuousClock object) {
			return createContinuousClockAdapter();
		}

		@Override
		public Adapter casePid(Pid object) {
			return createPidAdapter();
		}

		@Override
		public Adapter caseIFInteger(IFInteger object) {
			return createIFIntegerAdapter();
		}

		@Override
		public Adapter caseIFReal(IFReal object) {
			return createIFRealAdapter();
		}

		@Override
		public Adapter caseIFBoolean(IFBoolean object) {
			return createIFBooleanAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param target
	 *            the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant
	 * <em>Scenario Participant</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipant
	 * @generated
	 */
	public Adapter createScenarioParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance
	 * <em>Instance</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Instance
	 * @generated
	 */
	public Adapter createInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ObserverInstance
	 * <em>Observer Instance</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ObserverInstance
	 * @generated
	 */
	public Adapter createObserverInstanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Status
	 * <em>Status</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Status
	 * @generated
	 */
	public Adapter createStatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Cut
	 * <em>Cut</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Cut
	 * @generated
	 */
	public Adapter createCutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.State
	 * <em>State</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Transition
	 * <em>Transition</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.EnabledTransitions
	 * <em>Enabled Transitions</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.EnabledTransitions
	 * @generated
	 */
	public Adapter createEnabledTransitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Action
	 * <em>Action</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message
	 * <em>Message</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableSet
	 * <em>Variable Set</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableSet
	 * @generated
	 */
	public Adapter createVariableSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ParameterSet
	 * <em>Parameter Set</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ParameterSet
	 * @generated
	 */
	public Adapter createParameterSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Queue
	 * <em>Queue</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Queue
	 * @generated
	 */
	public Adapter createQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Variable
	 * <em>Variable</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableValue
	 * <em>Variable Value</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.VariableValue
	 * @generated
	 */
	public Adapter createVariableValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Parameter
	 * <em>Parameter</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Type
	 * <em>Type</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Type
	 * @generated
	 */
	public Adapter createTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Clock
	 * <em>Clock</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Clock
	 * @generated
	 */
	public Adapter createClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.DiscreteClock
	 * <em>Discrete Clock</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.DiscreteClock
	 * @generated
	 */
	public Adapter createDiscreteClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ContinuousClock
	 * <em>Continuous Clock</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ContinuousClock
	 * @generated
	 */
	public Adapter createContinuousClockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Pid
	 * <em>Pid</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.Pid
	 * @generated
	 */
	public Adapter createPidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFInteger
	 * <em>IF Integer</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFInteger
	 * @generated
	 */
	public Adapter createIFIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFReal
	 * <em>IF Real</em>}'. <!-- begin-user-doc --> This default implementation
	 * returns null so that we can easily ignore cases; it's useful to ignore a
	 * case when inheritance will catch all the cases anyway. <!-- end-user-doc
	 * -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFReal
	 * @generated
	 */
	public Adapter createIFRealAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFBoolean
	 * <em>IF Boolean</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.IFBoolean
	 * @generated
	 */
	public Adapter createIFBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case. <!-- begin-user-doc --> This
	 * default implementation returns null. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} // ScenarioParticipantAdapterFactory
