/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Graph Item</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getGraph <em>
 * Graph</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getText <em>
 * Text</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphItem()
 * @model abstract="true"
 * @generated
 */
public interface GraphItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Graph</b></em>' container reference. It
	 * is bidirectional and its opposite is '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getItems
	 * <em>Items</em>}'. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Graph</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Graph</em>' container reference.
	 * @see #setGraph(ZestGraph)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphItem_Graph()
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getItems
	 * @model opposite="items" transient="false"
	 * @generated
	 */
	ZestGraph getGraph();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getGraph
	 * <em>Graph</em>}' container reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Graph</em>' container reference.
	 * @see #getGraph()
	 * @generated
	 */
	void setGraph(ZestGraph value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#getGraphItem_Text()
	 * @model
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getText
	 * <em>Text</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // GraphItem
