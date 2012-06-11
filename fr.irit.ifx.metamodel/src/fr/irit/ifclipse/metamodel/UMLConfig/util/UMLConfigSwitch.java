/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.irit.ifclipse.metamodel.UMLConfig.Action;
import fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup;
import fr.irit.ifclipse.metamodel.UMLConfig.CallStack;
import fr.irit.ifclipse.metamodel.UMLConfig.DbmTime;
import fr.irit.ifclipse.metamodel.UMLConfig.DiscreteTime;
import fr.irit.ifclipse.metamodel.UMLConfig.Entity;
import fr.irit.ifclipse.metamodel.UMLConfig.Event;
import fr.irit.ifclipse.metamodel.UMLConfig.EventSet;
import fr.irit.ifclipse.metamodel.UMLConfig.InitialThread;
import fr.irit.ifclipse.metamodel.UMLConfig.Message;
import fr.irit.ifclipse.metamodel.UMLConfig.NamedElement;
import fr.irit.ifclipse.metamodel.UMLConfig.Observer;
import fr.irit.ifclipse.metamodel.UMLConfig.Pid;
import fr.irit.ifclipse.metamodel.UMLConfig.Port;
import fr.irit.ifclipse.metamodel.UMLConfig.Queue;
import fr.irit.ifclipse.metamodel.UMLConfig.Time;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig;
import fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage;
import fr.irit.ifclipse.metamodel.UMLConfig.VariableValue;

/**
 * <!-- begin-user-doc --> The <b>Switch</b> for the model's inheritance
 * hierarchy. It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object and proceeding up the
 * inheritance hierarchy until a non-null result is returned, which is the
 * result of the switch. <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage
 * @generated
 */
public class UMLConfigSwitch<T> {
	/**
	 * The cached model package <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static UMLConfigPackage modelPackage;

	/**
	 * Creates an instance of the switch. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLConfigSwitch() {
		if (modelPackage == null) {
			modelPackage = UMLConfigPackage.eINSTANCE;
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
		case UMLConfigPackage.NAMED_ELEMENT: {
			NamedElement namedElement = (NamedElement) theEObject;
			T result = caseNamedElement(namedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.UML_CONFIG: {
			UMLConfig umlConfig = (UMLConfig) theEObject;
			T result = caseUMLConfig(umlConfig);
			if (result == null)
				result = caseNamedElement(umlConfig);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.ENTITY: {
			Entity entity = (Entity) theEObject;
			T result = caseEntity(entity);
			if (result == null)
				result = caseNamedElement(entity);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.ACTIVITY_GROUP: {
			ActivityGroup activityGroup = (ActivityGroup) theEObject;
			T result = caseActivityGroup(activityGroup);
			if (result == null)
				result = caseEntity(activityGroup);
			if (result == null)
				result = caseNamedElement(activityGroup);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.INITIAL_THREAD: {
			InitialThread initialThread = (InitialThread) theEObject;
			T result = caseInitialThread(initialThread);
			if (result == null)
				result = caseEntity(initialThread);
			if (result == null)
				result = caseNamedElement(initialThread);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.CALL_STACK: {
			CallStack callStack = (CallStack) theEObject;
			T result = caseCallStack(callStack);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.OBJECT: {
			fr.irit.ifclipse.metamodel.UMLConfig.Object object = (fr.irit.ifclipse.metamodel.UMLConfig.Object) theEObject;
			T result = caseObject(object);
			if (result == null)
				result = caseEntity(object);
			if (result == null)
				result = caseNamedElement(object);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.PORT: {
			Port port = (Port) theEObject;
			T result = casePort(port);
			if (result == null)
				result = caseEntity(port);
			if (result == null)
				result = caseNamedElement(port);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.OBSERVER: {
			Observer observer = (Observer) theEObject;
			T result = caseObserver(observer);
			if (result == null)
				result = caseEntity(observer);
			if (result == null)
				result = caseNamedElement(observer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.EVENT_SET: {
			EventSet eventSet = (EventSet) theEObject;
			T result = caseEventSet(eventSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.ACTION: {
			Action action = (Action) theEObject;
			T result = caseAction(action);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.TIME: {
			Time time = (Time) theEObject;
			T result = caseTime(time);
			if (result == null)
				result = caseEntity(time);
			if (result == null)
				result = caseNamedElement(time);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.DISCRETE_TIME: {
			DiscreteTime discreteTime = (DiscreteTime) theEObject;
			T result = caseDiscreteTime(discreteTime);
			if (result == null)
				result = caseTime(discreteTime);
			if (result == null)
				result = caseEntity(discreteTime);
			if (result == null)
				result = caseNamedElement(discreteTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.DBM_TIME: {
			DbmTime dbmTime = (DbmTime) theEObject;
			T result = caseDbmTime(dbmTime);
			if (result == null)
				result = caseTime(dbmTime);
			if (result == null)
				result = caseEntity(dbmTime);
			if (result == null)
				result = caseNamedElement(dbmTime);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.PID: {
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
		case UMLConfigPackage.VARIABLE_VALUE: {
			VariableValue variableValue = (VariableValue) theEObject;
			T result = caseVariableValue(variableValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.QUEUE: {
			Queue queue = (Queue) theEObject;
			T result = caseQueue(queue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case UMLConfigPackage.MESSAGE: {
			Message message = (Message) theEObject;
			T result = caseMessage(message);
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
	 * <em>UML Config</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>UML Config</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUMLConfig(UMLConfig object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Entity</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Activity Group</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Activity Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityGroup(ActivityGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Initial Thread</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Initial Thread</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInitialThread(InitialThread object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Call Stack</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Call Stack</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCallStack(CallStack object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Object</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObject(fr.irit.ifclipse.metamodel.UMLConfig.Object object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Port</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Observer</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Observer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObserver(Observer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Event Set</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Event Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEventSet(EventSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Event</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
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
	 * <em>Time</em>'. <!-- begin-user-doc --> This implementation returns null;
	 * returning a non-null result will terminate the switch. <!-- end-user-doc
	 * -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTime(Time object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Discrete Time</em>'. <!-- begin-user-doc --> This implementation
	 * returns null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Discrete Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscreteTime(DiscreteTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '
	 * <em>Dbm Time</em>'. <!-- begin-user-doc --> This implementation returns
	 * null; returning a non-null result will terminate the switch. <!--
	 * end-user-doc -->
	 * 
	 * @param object
	 *            the target of the switch.
	 * @return the result of interpreting the object as an instance of '
	 *         <em>Dbm Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDbmTime(DbmTime object) {
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

} // UMLConfigSwitch
