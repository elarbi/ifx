/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc --> The <b>Factory</b> for the model. It provides a
 * create method for each non-abstract class of the model. <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage
 * @generated
 */
public interface ZestGraphFactory extends EFactory {
	/**
	 * The singleton instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ZestGraphFactory eINSTANCE = fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphFactoryImpl
			.init();

	/**
	 * Returns a new object of class '<em>Named Element</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Named Element</em>'.
	 * @generated
	 */
	NamedElement createNamedElement();

	/**
	 * Returns a new object of class '<em>Zest Graph</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Zest Graph</em>'.
	 * @generated
	 */
	ZestGraph createZestGraph();

	/**
	 * Returns a new object of class '<em>Graph Container</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Graph Container</em>'.
	 * @generated
	 */
	GraphContainer createGraphContainer();

	/**
	 * Returns a new object of class '<em>Graph Node</em>'. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Graph Node</em>'.
	 * @generated
	 */
	GraphNode createGraphNode();

	/**
	 * Returns a new object of class '<em>Graph Connection</em>'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return a new object of class '<em>Graph Connection</em>'.
	 * @generated
	 */
	GraphConnection createGraphConnection();

	/**
	 * Returns the package supported by this factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @return the package supported by this factory.
	 * @generated
	 */
	ZestGraphPackage getZestGraphPackage();

} // ZestGraphFactory
