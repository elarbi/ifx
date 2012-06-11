/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Zest Graph</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getItems <em>
 * Items</em>}</li>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getContainers
 * <em>Containers</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getZestGraph()
 * @model
 * @generated
 */
public interface ZestGraph extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem}. It is
	 * bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getGraph
	 * <em>Graph</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getZestGraph_Items()
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<GraphItem> getItems();

	/**
	 * Returns the value of the '<em><b>Containers</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containers</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Containers</em>' containment reference
	 *         list.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getZestGraph_Containers()
	 * @model containment="true"
	 * @generated
	 */
	EList<GraphContainer> getContainers();

} // ZestGraph
