/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>IF Config</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getInstances <em>
 * Instances</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getObservers <em>
 * Observers</em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getClocks <em>Clocks
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getTimeConstraint
 * <em>Time Constraint</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getIFConfig()
 * @model
 * @generated
 */
public interface IFConfig extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Instance}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Instances</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getIFConfig_Instances()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instance> getInstances();

	/**
	 * Returns the value of the '<em><b>Observers</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.ObserverInstance}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Observers</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Observers</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getIFConfig_Observers()
	 * @model containment="true"
	 * @generated
	 */
	EList<ObserverInstance> getObservers();

	/**
	 * Returns the value of the '<em><b>Clocks</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Clock}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Clocks</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Clocks</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getIFConfig_Clocks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Clock> getClocks();

	/**
	 * Returns the value of the '<em><b>Time Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Constraint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Time Constraint</em>' attribute.
	 * @see #setTimeConstraint(String)
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getIFConfig_TimeConstraint()
	 * @model
	 * @generated
	 */
	String getTimeConstraint();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.IFConfig#getTimeConstraint
	 * <em>Time Constraint</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Time Constraint</em>' attribute.
	 * @see #getTimeConstraint()
	 * @generated
	 */
	void setTimeConstraint(String value);

} // IFConfig
