/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.GXL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.metamodel.GXL.GXLPackage
 * @generated
 */
public interface GXLFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	GXLFactory eINSTANCE = fr.irit.ifclipse.metamodel.GXL.impl.GXLFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>GXL</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>GXL</em>'.
	 * @generated
	 */
	GXL createGXL();

	/**
	 * Returns a new object of class '<em>Attributed Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Attributed Element</em>'.
	 * @generated
	 */
	AttributedElement createAttributedElement();

	/**
	 * Returns a new object of class '<em>Typed Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Typed Element</em>'.
	 * @generated
	 */
	TypedElement createTypedElement();

	/**
	 * Returns a new object of class '<em>Graph</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Graph</em>'.
	 * @generated
	 */
	Graph createGraph();

	/**
	 * Returns a new object of class '<em>Node</em>'. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	GXLPackage getGXLPackage();

} // GXLFactory
