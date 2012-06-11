/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.Graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graph</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.Graph.Graph#getContents <em>
 * Contents</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement}. It is
	 * bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getGraph
	 * <em>Graph</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contents</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphPackage#getGraph_Contents()
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getGraph
	 * @model opposite="graph" containment="true"
	 * @generated
	 */
	EList<GraphElement> getContents();

} // Graph
