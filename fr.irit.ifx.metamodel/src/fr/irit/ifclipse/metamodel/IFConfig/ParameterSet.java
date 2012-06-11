/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Parameter Set</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.IFConfig.ParameterSet#getParamaters
 * <em>Paramaters</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getParameterSet()
 * @model
 * @generated
 */
public interface ParameterSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Paramaters</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.IFConfig.Parameter}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramaters</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Paramaters</em>' containment reference
	 *         list.
	 * @see fr.irit.ifclipse.metamodel.IFConfig.IFConfigPackage#getParameterSet_Paramaters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParamaters();

} // ParameterSet
