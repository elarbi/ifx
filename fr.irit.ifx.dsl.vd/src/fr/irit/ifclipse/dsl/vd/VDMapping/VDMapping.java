/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.dsl.vd.VDMapping;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>VD Mapping</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.dsl.vd.VDMapping.VDMapping#getMappings <em>
 * Mappings</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage#getVDMapping()
 * @model
 * @generated
 */
public interface VDMapping extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping}. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>Mappings</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Mappings</em>' containment reference list.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage#getVDMapping_Mappings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

} // VDMapping
