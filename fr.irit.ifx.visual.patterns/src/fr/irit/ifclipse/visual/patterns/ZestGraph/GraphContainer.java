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
 * <em><b>Graph Container</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer#getNodes
 * <em>Nodes</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphContainer()
 * @model
 * @generated
 */
public interface GraphContainer extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' reference list. The list
	 * contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' reference list isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nodes</em>' reference list.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphContainer_Nodes()
	 * @model
	 * @generated
	 */
	EList<GraphNode> getNodes();

} // GraphContainer
