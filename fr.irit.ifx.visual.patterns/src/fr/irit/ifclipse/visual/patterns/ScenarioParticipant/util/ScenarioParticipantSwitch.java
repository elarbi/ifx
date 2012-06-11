/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ScenarioParticipant.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
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
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.visual.patterns.ScenarioParticipant.ScenarioParticipantPackage
 * @generated
 */
public class ScenarioParticipantSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static ScenarioParticipantPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ScenarioParticipantSwitch() {
		if (modelPackage == null) {
			modelPackage = ScenarioParticipantPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		} else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return eSuperTypes.isEmpty() ? defaultCase(theEObject) : doSwitch(
					eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns
	 * a non null result; it yields that result. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return the first non-null result returned by a <code>caseXXX</code>
	 *         call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case ScenarioParticipantPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.SCENARIO_PARTICIPANT: {
			ScenarioParticipant scenarioParticipant = (ScenarioParticipant) theEObject;
			T result = caseScenarioParticipant(scenarioParticipant);
			if (result == null)
				result = caseNamedElement(scenarioParticipant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.INSTANCE: {
			Instance instance = (Instance) theEObject;
			T result = caseInstance(instance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.OBSERVER_INSTANCE: {
			ObserverInstance observerInstance = (ObserverInstance) theEObject;
			T result = caseObserverInstance(observerInstance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.STATUS: {
			Status status = (Status) theEObject;
			T result = caseStatus(status);
			if (result == null)
				result = caseNamedElement(status);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.CUT: {
			Cut cut = (Cut) theEObject;
			T result = caseCut(cut);
			if (result == null)
				result = caseNamedElement(cut);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = caseNamedElement(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.TRANSITION: {
			Transition transition = (Transition) theEObject;
			T result = caseTransition(transition);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.ENABLED_TRANSITIONS: {
			EnabledTransitions enabledTransitions = (EnabledTransitions) theEObject;
			T result = caseEnabledTransitions(enabledTransitions);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
			if (result == null)
				result = caseNamedElement(message);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.VARIABLE_SET: {
			VariableSet variableSet = (VariableSet) theEObject;
			T result = caseVariableSet(variableSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.PARAMETER_SET: {
			ParameterSet parameterSet = (ParameterSet) theEObject;
			T result = caseParameterSet(parameterSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.QUEUE: {
			Queue queue = (Queue) theEObject;
			T result = caseQueue(queue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.VARIABLE: {
			Variable variable = (Variable) theEObject;
			T result = caseVariable(variable);
			if (result == null)
				result = caseNamedElement(variable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.VARIABLE_VALUE: {
			VariableValue variableValue = (VariableValue) theEObject;
			T result = caseVariableValue(variableValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = caseVariable(parameter);
			if (result == null)
				result = caseNamedElement(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.TYPE: {
			Type type = (Type) theEObject;
			T result = caseType(type);
			if (result == null)
				result = caseNamedElement(type);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.CLOCK: {
			Clock clock = (Clock) theEObject;
			T result = caseClock(clock);
			if (result == null)
				result = caseVariableValue(clock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.DISCRETE_CLOCK: {
			DiscreteClock discreteClock = (DiscreteClock) theEObject;
			T result = caseDiscreteClock(discreteClock);
			if (result == null)
				result = caseClock(discreteClock);
			if (result == null)
				result = caseVariableValue(discreteClock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.CONTINUOUS_CLOCK: {
			ContinuousClock continuousClock = (ContinuousClock) theEObject;
			T result = caseContinuousClock(continuousClock);
			if (result == null)
				result = caseClock(continuousClock);
			if (result == null)
				result = caseVariableValue(continuousClock);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.PID: {
			Pid pid = (Pid) theEObject;
			T result = casePid(pid);
			if (result == null)
				result = caseVariableValue(pid);
			if (result == null)
				result = caseNamedElement(pid);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.IF_INTEGER: {
			IFInteger ifInteger = (IFInteger) theEObject;
			T result = caseIFInteger(ifInteger);
			if (result == null)
				result = caseVariableValue(ifInteger);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.IF_REAL: {
			IFReal ifReal = (IFReal) theEObject;
			T result = caseIFReal(ifReal);
			if (result == null)
				result = caseVariableValue(ifReal);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case ScenarioParticipantPackage.IF_BOOLEAN: {
			IFBoolean ifBoolean = (IFBoolean) theEObject;
			T result = caseIFBoolean(ifBoolean);
			if (result == null)
				result = caseVariableValue(ifBoolean);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Named Element</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Scenario Participant</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Scenario Participant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScenarioParticipant(ScenarioParticipant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Instance</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Observer Instance</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Observer Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObserverInstance(ObserverInstance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Status</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Status</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatus(Status object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Cut</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Cut</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCut(Cut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>State</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Transition</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Enabled Transitions</em>'. <!-- begin-user-doc --> This
	 * implementation returns null; returning a non-null result will terminate
	 * the switch. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Enabled Transitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnabledTransitions(EnabledTransitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Action</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Message</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Set</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableSet(VariableSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Parameter Set</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Parameter Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterSet(ParameterSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Queue</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQueue(Queue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariable(Variable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Variable Value</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableValue(VariableValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Parameter</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Type</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseType(Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Clock</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClock(Clock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Discrete Clock</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Discrete Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteClock(DiscreteClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Continuous Clock</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Continuous Clock</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContinuousClock(ContinuousClock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Pid</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Pid</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePid(Pid object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IF Integer</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IF Integer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFInteger(IFInteger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IF Real</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IF Real</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFReal(IFReal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>IF Boolean</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>IF Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIFBoolean(IFBoolean object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>EObject</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch, but this is
	 * the last case anyway. <!-- end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} // ScenarioParticipantSwitch
