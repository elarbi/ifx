/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Observer</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Observer#getType <em>Type
 * </em>}</li>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.Observer#getEventSet <em>
 * Event Set</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getObserver()
 * @model
 * @generated
 */
public interface Observer extends Entity {

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getObserver_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Observer#getType
	 * <em>Type</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Event Set</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Set</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Event Set</em>' containment reference.
	 * @see #setEventSet(EventSet)
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getObserver_EventSet()
	 * @model containment="true"
	 * @generated
	 */
	EventSet getEventSet();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Observer#getEventSet
	 * <em>Event Set</em>}' containment reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Event Set</em>' containment
	 *            reference.
	 * @see #getEventSet()
	 * @generated
	 */
	void setEventSet(EventSet value);
} // Observer
