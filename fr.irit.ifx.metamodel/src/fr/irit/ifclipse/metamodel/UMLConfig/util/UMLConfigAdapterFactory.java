/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
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
 * <!-- begin-user-doc --> The <b>Adapter Factory</b> for the model. It provides
 * an adapter <code>createXXX</code> method for each class of the model. <!--
 * end-user-doc -->
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage
 * @generated
 */
public class UMLConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected static UMLConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public UMLConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UMLConfigPackage.eINSTANCE;
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
	protected UMLConfigSwitch<Adapter> modelSwitch = new UMLConfigSwitch<Adapter>() {
		@Override
		public Adapter caseNamedElement(NamedElement object) {
			return createNamedElementAdapter();
		}

		@Override
		public Adapter caseUMLConfig(UMLConfig object) {
			return createUMLConfigAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseActivityGroup(ActivityGroup object) {
			return createActivityGroupAdapter();
		}

		@Override
		public Adapter caseInitialThread(InitialThread object) {
			return createInitialThreadAdapter();
		}

		@Override
		public Adapter caseCallStack(CallStack object) {
			return createCallStackAdapter();
		}

		@Override
		public Adapter caseObject(
				fr.irit.ifclipse.metamodel.UMLConfig.Object object) {
			return createObjectAdapter();
		}

		@Override
		public Adapter casePort(Port object) {
			return createPortAdapter();
		}

		@Override
		public Adapter caseObserver(Observer object) {
			return createObserverAdapter();
		}

		@Override
		public Adapter caseEventSet(EventSet object) {
			return createEventSetAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseAction(Action object) {
			return createActionAdapter();
		}

		@Override
		public Adapter caseTime(Time object) {
			return createTimeAdapter();
		}

		@Override
		public Adapter caseDiscreteTime(DiscreteTime object) {
			return createDiscreteTimeAdapter();
		}

		@Override
		public Adapter caseDbmTime(DbmTime object) {
			return createDbmTimeAdapter();
		}

		@Override
		public Adapter casePid(Pid object) {
			return createPidAdapter();
		}

		@Override
		public Adapter caseVariableValue(VariableValue object) {
			return createVariableValueAdapter();
		}

		@Override
		public Adapter caseQueue(Queue object) {
			return createQueueAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
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
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.NamedElement
	 * @generated
	 */
	public Adapter createNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig
	 * <em>UML Config</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig
	 * @generated
	 */
	public Adapter createUMLConfigAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup
	 * <em>Activity Group</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup
	 * @generated
	 */
	public Adapter createActivityGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.InitialThread
	 * <em>Initial Thread</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.InitialThread
	 * @generated
	 */
	public Adapter createInitialThreadAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.CallStack
	 * <em>Call Stack</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.CallStack
	 * @generated
	 */
	public Adapter createCallStackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object <em>Object</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Object
	 * @generated
	 */
	public Adapter createObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Port <em>Port</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Observer <em>Observer</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Observer
	 * @generated
	 */
	public Adapter createObserverAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.EventSet <em>Event Set</em>}
	 * '. <!-- begin-user-doc --> This default implementation returns null so
	 * that we can easily ignore cases; it's useful to ignore a case when
	 * inheritance will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.EventSet
	 * @generated
	 */
	public Adapter createEventSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Event <em>Event</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Action <em>Action</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Time <em>Time</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Time
	 * @generated
	 */
	public Adapter createTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.DiscreteTime
	 * <em>Discrete Time</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.DiscreteTime
	 * @generated
	 */
	public Adapter createDiscreteTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.DbmTime <em>Dbm Time</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.DbmTime
	 * @generated
	 */
	public Adapter createDbmTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Pid <em>Pid</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Pid
	 * @generated
	 */
	public Adapter createPidAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.VariableValue
	 * <em>Variable Value</em>}'. <!-- begin-user-doc --> This default
	 * implementation returns null so that we can easily ignore cases; it's
	 * useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.VariableValue
	 * @generated
	 */
	public Adapter createVariableValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Queue <em>Queue</em>}'. <!--
	 * begin-user-doc --> This default implementation returns null so that we
	 * can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Queue
	 * @generated
	 */
	public Adapter createQueueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Message <em>Message</em>}'.
	 * <!-- begin-user-doc --> This default implementation returns null so that
	 * we can easily ignore cases; it's useful to ignore a case when inheritance
	 * will catch all the cases anyway. <!-- end-user-doc -->
	 * 
	 * @return the new adapter.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
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

} // UMLConfigAdapterFactory
