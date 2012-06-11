/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc --> The <b>Package</b> for the model. It contains
 * accessors for the meta objects to represent
 * <ul>
 * <li>each class,</li>
 * <li>each feature of each class,</li>
 * <li>each enum,</li>
 * <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * 
 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphFactory
 * @model kind="package"
 * @generated
 */
public interface ZestGraphPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "ZestGraph";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/zestgraph";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "zestgraph";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ZestGraphPackage eINSTANCE = fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.NamedElementImpl
	 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.NamedElementImpl
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphImpl
	 * <em>Zest Graph</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphImpl
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getZestGraph()
	 * @generated
	 */
	int ZEST_GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEST_GRAPH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEST_GRAPH__ITEMS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Containers</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEST_GRAPH__CONTAINERS = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Zest Graph</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ZEST_GRAPH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphContainerImpl
	 * <em>Graph Container</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphContainerImpl
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphContainer()
	 * @generated
	 */
	int GRAPH_CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONTAINER__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONTAINER__NODES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graph Container</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONTAINER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphItemImpl
	 * <em>Graph Item</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphItemImpl
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphItem()
	 * @generated
	 */
	int GRAPH_ITEM = 3;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ITEM__GRAPH = 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ITEM__TEXT = 1;

	/**
	 * The number of structural features of the '<em>Graph Item</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ITEM_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl
	 * <em>Graph Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphNode()
	 * @generated
	 */
	int GRAPH_NODE = 4;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__GRAPH = GRAPH_ITEM__GRAPH;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__TEXT = GRAPH_ITEM__TEXT;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__SHAPE = GRAPH_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Style</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__NODE_STYLE = GRAPH_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Back Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__BACK_COLOR = GRAPH_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__WIDTH = GRAPH_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__HEIGHT = GRAPH_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__OUTGOING = GRAPH_ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Ingoing</b></em>' reference list. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE__INGOING = GRAPH_ITEM_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Graph Node</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_NODE_FEATURE_COUNT = GRAPH_ITEM_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl
	 * <em>Graph Connection</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphConnection()
	 * @generated
	 */
	int GRAPH_CONNECTION = 5;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION__GRAPH = GRAPH_ITEM__GRAPH;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION__TEXT = GRAPH_ITEM__TEXT;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION__COLOR = GRAPH_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION__LINE_WIDTH = GRAPH_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION__LINE_STYLE = GRAPH_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION__SOURCE_NODE = GRAPH_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION__TARGET_NODE = GRAPH_ITEM_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Graph Connection</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_CONNECTION_FEATURE_COUNT = GRAPH_ITEM_FEATURE_COUNT + 5;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph
	 * <em>Zest Graph</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Zest Graph</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph
	 * @generated
	 */
	EClass getZestGraph();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getItems
	 * <em>Items</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Items</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getItems()
	 * @see #getZestGraph()
	 * @generated
	 */
	EReference getZestGraph_Items();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getContainers
	 * <em>Containers</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Containers</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph#getContainers()
	 * @see #getZestGraph()
	 * @generated
	 */
	EReference getZestGraph_Containers();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer
	 * <em>Graph Container</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph Container</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer
	 * @generated
	 */
	EClass getGraphContainer();

	/**
	 * Returns the meta object for the reference list '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer#getNodes
	 * <em>Nodes</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Nodes</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer#getNodes()
	 * @see #getGraphContainer()
	 * @generated
	 */
	EReference getGraphContainer_Nodes();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem
	 * <em>Graph Item</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph Item</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem
	 * @generated
	 */
	EClass getGraphItem();

	/**
	 * Returns the meta object for the container reference '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getGraph
	 * <em>Graph</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getGraph()
	 * @see #getGraphItem()
	 * @generated
	 */
	EReference getGraphItem_Graph();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getText
	 * <em>Text</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem#getText()
	 * @see #getGraphItem()
	 * @generated
	 */
	EAttribute getGraphItem_Text();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode
	 * <em>Graph Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph Node</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode
	 * @generated
	 */
	EClass getGraphNode();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getShape
	 * <em>Shape</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getShape()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_Shape();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getNodeStyle
	 * <em>Node Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Node Style</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getNodeStyle()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_NodeStyle();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getBackColor
	 * <em>Back Color</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Back Color</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getBackColor()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_BackColor();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getWidth
	 * <em>Width</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getWidth()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_Width();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getHeight
	 * <em>Height</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getHeight()
	 * @see #getGraphNode()
	 * @generated
	 */
	EAttribute getGraphNode_Height();

	/**
	 * Returns the meta object for the reference list '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getOutgoing
	 * <em>Outgoing</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getOutgoing()
	 * @see #getGraphNode()
	 * @generated
	 */
	EReference getGraphNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getIngoing
	 * <em>Ingoing</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference list '<em>Ingoing</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode#getIngoing()
	 * @see #getGraphNode()
	 * @generated
	 */
	EReference getGraphNode_Ingoing();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection
	 * <em>Graph Connection</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Graph Connection</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection
	 * @generated
	 */
	EClass getGraphConnection();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getColor
	 * <em>Color</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getColor()
	 * @see #getGraphConnection()
	 * @generated
	 */
	EAttribute getGraphConnection_Color();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineWidth
	 * <em>Line Width</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineWidth()
	 * @see #getGraphConnection()
	 * @generated
	 */
	EAttribute getGraphConnection_LineWidth();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineStyle
	 * <em>Line Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Line Style</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getLineStyle()
	 * @see #getGraphConnection()
	 * @generated
	 */
	EAttribute getGraphConnection_LineStyle();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getSourceNode
	 * <em>Source Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source Node</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getSourceNode()
	 * @see #getGraphConnection()
	 * @generated
	 */
	EReference getGraphConnection_SourceNode();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getTargetNode
	 * <em>Target Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection#getTargetNode()
	 * @see #getGraphConnection()
	 * @generated
	 */
	EReference getGraphConnection_TargetNode();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ZestGraphFactory getZestGraphFactory();

	/**
	 * <!-- begin-user-doc --> Defines literals for the meta objects that
	 * represent
	 * <ul>
	 * <li>each class,</li>
	 * <li>each feature of each class,</li>
	 * <li>each enum,</li>
	 * <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.NamedElementImpl
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphImpl
		 * <em>Zest Graph</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphImpl
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getZestGraph()
		 * @generated
		 */
		EClass ZEST_GRAPH = eINSTANCE.getZestGraph();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ZEST_GRAPH__ITEMS = eINSTANCE.getZestGraph_Items();

		/**
		 * The meta object literal for the '<em><b>Containers</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference ZEST_GRAPH__CONTAINERS = eINSTANCE.getZestGraph_Containers();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphContainerImpl
		 * <em>Graph Container</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphContainerImpl
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphContainer()
		 * @generated
		 */
		EClass GRAPH_CONTAINER = eINSTANCE.getGraphContainer();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_CONTAINER__NODES = eINSTANCE.getGraphContainer_Nodes();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphItemImpl
		 * <em>Graph Item</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphItemImpl
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphItem()
		 * @generated
		 */
		EClass GRAPH_ITEM = eINSTANCE.getGraphItem();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_ITEM__GRAPH = eINSTANCE.getGraphItem_Graph();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_ITEM__TEXT = eINSTANCE.getGraphItem_Text();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl
		 * <em>Graph Node</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphNodeImpl
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphNode()
		 * @generated
		 */
		EClass GRAPH_NODE = eINSTANCE.getGraphNode();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__SHAPE = eINSTANCE.getGraphNode_Shape();

		/**
		 * The meta object literal for the '<em><b>Node Style</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__NODE_STYLE = eINSTANCE.getGraphNode_NodeStyle();

		/**
		 * The meta object literal for the '<em><b>Back Color</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__BACK_COLOR = eINSTANCE.getGraphNode_BackColor();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__WIDTH = eINSTANCE.getGraphNode_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_NODE__HEIGHT = eINSTANCE.getGraphNode_Height();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_NODE__OUTGOING = eINSTANCE.getGraphNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Ingoing</b></em>' reference
		 * list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_NODE__INGOING = eINSTANCE.getGraphNode_Ingoing();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl
		 * <em>Graph Connection</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.GraphConnectionImpl
		 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.impl.ZestGraphPackageImpl#getGraphConnection()
		 * @generated
		 */
		EClass GRAPH_CONNECTION = eINSTANCE.getGraphConnection();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_CONNECTION__COLOR = eINSTANCE
				.getGraphConnection_Color();

		/**
		 * The meta object literal for the '<em><b>Line Width</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_CONNECTION__LINE_WIDTH = eINSTANCE
				.getGraphConnection_LineWidth();

		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_CONNECTION__LINE_STYLE = eINSTANCE
				.getGraphConnection_LineStyle();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_CONNECTION__SOURCE_NODE = eINSTANCE
				.getGraphConnection_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_CONNECTION__TARGET_NODE = eINSTANCE
				.getGraphConnection_TargetNode();

	}

} // ZestGraphPackage
