/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.UMLConfig;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Event Set</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.UMLConfig.EventSet#getEvents <em>Events
 * </em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getEventSet()
 * @model
 * @generated
 */
public interface EventSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.UMLConfig.Event}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.UMLConfig.UMLConfigPackage#getEventSet_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // EventSet
