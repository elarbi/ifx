/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.dsl.vd.VDMapping;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage
 * @generated
 */
public interface VDMappingFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	VDMappingFactory eINSTANCE = fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>VD Mapping</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>VD Mapping</em>'.
	 * @generated
	 */
	VDMapping createVDMapping();

	/**
	 * Returns a new object of class '<em>Mapping</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	VDMappingPackage getVDMappingPackage();

} // VDMappingFactory
