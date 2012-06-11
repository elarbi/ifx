/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>UML Config</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getActivityGroups
 * <em>Activity Groups</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getInitialThread
 * <em>Initial Thread</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getObjects <em>
 * Objects</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getPorts <em>Ports
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getObservers <em>
 * Observers</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getTime <em>Time
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getUMLConfig()
 * @model
 * @generated
 */
public interface UMLConfig extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Activity Groups</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.ActivityGroup}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity Groups</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Activity Groups</em>' containment reference
	 *         list.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getUMLConfig_ActivityGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityGroup> getActivityGroups();

	/**
	 * Returns the value of the '<em><b>Initial Thread</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Thread</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Initial Thread</em>' containment reference.
	 * @see #setInitialThread(InitialThread)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getUMLConfig_InitialThread()
	 * @model containment="true"
	 * @generated
	 */
	InitialThread getInitialThread();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getInitialThread
	 * <em>Initial Thread</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Initial Thread</em>' containment
	 *            reference.
	 * @see #getInitialThread()
	 * @generated
	 */
	void setInitialThread(InitialThread value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Object}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Objects</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Objects</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getUMLConfig_Objects()
	 * @model containment="true"
	 * @generated
	 */
	EList<fr.irit.ifclipse.metamodel.UMLConfig.Object> getObjects();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Port}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getUMLConfig_Ports()
	 * @model containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Observers</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Observer}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observers</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Observers</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getUMLConfig_Observers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Observer> getObservers();

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Time)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getUMLConfig_Time()
	 * @model containment="true"
	 * @generated
	 */
	Time getTime();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.UMLConfig#getTime
	 * <em>Time</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Time value);

} // UMLConfig
