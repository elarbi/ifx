/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphItem;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode;
import fr.irit.ifclipse.visual.patterns.ZestGraph.NamedElement;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphFactory;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ZestGraphPackageImpl extends EPackageImpl implements
		ZestGraphPackage {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass zestGraphEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass graphContainerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass graphItemEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass graphNodeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass graphConnectionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ZestGraphPackageImpl() {
		super(eNS_URI, ZestGraphFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link ZestGraphPackage#eINSTANCE} when
	 * that field is accessed. Clients should not invoke it directly. Instead,
	 * they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ZestGraphPackage init() {
		if (isInited)
			return (ZestGraphPackage) EPackage.Registry.INSTANCE
					.getEPackage(ZestGraphPackage.eNS_URI);

		// Obtain or create and register package
		ZestGraphPackageImpl theZestGraphPackage = (ZestGraphPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof ZestGraphPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new ZestGraphPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theZestGraphPackage.createPackageContents();

		// Initialize created meta-data
		theZestGraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theZestGraphPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ZestGraphPackage.eNS_URI,
				theZestGraphPackage);
		return theZestGraphPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getZestGraph() {
		return zestGraphEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getZestGraph_Items() {
		return (EReference) zestGraphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getZestGraph_Containers() {
		return (EReference) zestGraphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGraphContainer() {
		return graphContainerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphContainer_Nodes() {
		return (EReference) graphContainerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGraphItem() {
		return graphItemEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphItem_Graph() {
		return (EReference) graphItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphItem_Text() {
		return (EAttribute) graphItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGraphNode() {
		return graphNodeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_Shape() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_NodeStyle() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_BackColor() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_Width() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphNode_Height() {
		return (EAttribute) graphNodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphNode_Outgoing() {
		return (EReference) graphNodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphNode_Ingoing() {
		return (EReference) graphNodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getGraphConnection() {
		return graphConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphConnection_Color() {
		return (EAttribute) graphConnectionEClass.getEStructuralFeatures().get(
				0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphConnection_LineWidth() {
		return (EAttribute) graphConnectionEClass.getEStructuralFeatures().get(
				1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getGraphConnection_LineStyle() {
		return (EAttribute) graphConnectionEClass.getEStructuralFeatures().get(
				2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphConnection_SourceNode() {
		return (EReference) graphConnectionEClass.getEStructuralFeatures().get(
				3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getGraphConnection_TargetNode() {
		return (EReference) graphConnectionEClass.getEStructuralFeatures().get(
				4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ZestGraphFactory getZestGraphFactory() {
		return (ZestGraphFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		zestGraphEClass = createEClass(ZEST_GRAPH);
		createEReference(zestGraphEClass, ZEST_GRAPH__ITEMS);
		createEReference(zestGraphEClass, ZEST_GRAPH__CONTAINERS);

		graphContainerEClass = createEClass(GRAPH_CONTAINER);
		createEReference(graphContainerEClass, GRAPH_CONTAINER__NODES);

		graphItemEClass = createEClass(GRAPH_ITEM);
		createEReference(graphItemEClass, GRAPH_ITEM__GRAPH);
		createEAttribute(graphItemEClass, GRAPH_ITEM__TEXT);

		graphNodeEClass = createEClass(GRAPH_NODE);
		createEAttribute(graphNodeEClass, GRAPH_NODE__SHAPE);
		createEAttribute(graphNodeEClass, GRAPH_NODE__NODE_STYLE);
		createEAttribute(graphNodeEClass, GRAPH_NODE__BACK_COLOR);
		createEAttribute(graphNodeEClass, GRAPH_NODE__WIDTH);
		createEAttribute(graphNodeEClass, GRAPH_NODE__HEIGHT);
		createEReference(graphNodeEClass, GRAPH_NODE__OUTGOING);
		createEReference(graphNodeEClass, GRAPH_NODE__INGOING);

		graphConnectionEClass = createEClass(GRAPH_CONNECTION);
		createEAttribute(graphConnectionEClass, GRAPH_CONNECTION__COLOR);
		createEAttribute(graphConnectionEClass, GRAPH_CONNECTION__LINE_WIDTH);
		createEAttribute(graphConnectionEClass, GRAPH_CONNECTION__LINE_STYLE);
		createEReference(graphConnectionEClass, GRAPH_CONNECTION__SOURCE_NODE);
		createEReference(graphConnectionEClass, GRAPH_CONNECTION__TARGET_NODE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		zestGraphEClass.getESuperTypes().add(this.getNamedElement());
		graphContainerEClass.getESuperTypes().add(this.getNamedElement());
		graphNodeEClass.getESuperTypes().add(this.getGraphItem());
		graphConnectionEClass.getESuperTypes().add(this.getGraphItem());

		// Initialize classes and features; add operations and parameters
		initEClass(namedElementEClass, NamedElement.class, "NamedElement",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, NamedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(zestGraphEClass, ZestGraph.class, "ZestGraph", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZestGraph_Items(), this.getGraphItem(),
				this.getGraphItem_Graph(), "items", null, 0, -1,
				ZestGraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getZestGraph_Containers(), this.getGraphContainer(),
				null, "containers", null, 0, -1, ZestGraph.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(graphContainerEClass, GraphContainer.class,
				"GraphContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphContainer_Nodes(), this.getGraphNode(), null,
				"nodes", null, 0, -1, GraphContainer.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(graphItemEClass, GraphItem.class, "GraphItem", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraphItem_Graph(), this.getZestGraph(),
				this.getZestGraph_Items(), "graph", null, 0, 1,
				GraphItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphItem_Text(), ecorePackage.getEString(), "text",
				null, 0, 1, GraphItem.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(graphNodeEClass, GraphNode.class, "GraphNode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphNode_Shape(), ecorePackage.getEString(),
				"shape", null, 0, 1, GraphNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphNode_NodeStyle(), ecorePackage.getEString(),
				"nodeStyle", null, 0, 1, GraphNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphNode_BackColor(), ecorePackage.getEString(),
				"backColor", null, 0, 1, GraphNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphNode_Width(), ecorePackage.getEDouble(),
				"width", null, 0, 1, GraphNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphNode_Height(), ecorePackage.getEDouble(),
				"height", null, 0, 1, GraphNode.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGraphNode_Outgoing(), this.getGraphConnection(),
				this.getGraphConnection_SourceNode(), "outgoing", null, 0, -1,
				GraphNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGraphNode_Ingoing(), this.getGraphConnection(),
				this.getGraphConnection_TargetNode(), "ingoing", null, 0, -1,
				GraphNode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(graphConnectionEClass, GraphConnection.class,
				"GraphConnection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphConnection_Color(), ecorePackage.getEString(),
				"color", null, 0, 1, GraphConnection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphConnection_LineWidth(), ecorePackage.getEInt(),
				"lineWidth", null, 0, 1, GraphConnection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphConnection_LineStyle(), ecorePackage.getEInt(),
				"lineStyle", null, 0, 1, GraphConnection.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getGraphConnection_SourceNode(), this.getGraphNode(),
				this.getGraphNode_Outgoing(), "sourceNode", null, 0, 1,
				GraphConnection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphConnection_TargetNode(), this.getGraphNode(),
				this.getGraphNode_Ingoing(), "targetNode", null, 0, 1,
				GraphConnection.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // ZestGraphPackageImpl
