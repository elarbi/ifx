/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.GXL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graph</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.metamodel.GXL.Graph#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.metamodel.GXL.GXLPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends TypedElement {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link fr.irit.ifclipse.metamodel.GXL.Node}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see fr.irit.ifclipse.metamodel.GXL.GXLPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

} // Graph
