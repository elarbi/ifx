/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.Graph;

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
 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "Graph";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/graph";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "graph";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	GraphPackage eINSTANCE = fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.NamedElementImpl
	 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.NamedElementImpl
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getNamedElement()
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
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.GraphImpl
	 * <em>Graph</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphImpl
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH__CONTENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.GraphElementImpl
	 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphElementImpl
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getGraphElement()
	 * @generated
	 */
	int GRAPH_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__GRAPH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__LABEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT__COLOR = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.NodeImpl
	 * <em>Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.NodeImpl
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPH = GRAPH_ELEMENT__GRAPH;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__COLOR = GRAPH_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__SHAPE = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__STYLE = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.DirectedArcImpl
	 * <em>Directed Arc</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.DirectedArcImpl
	 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getDirectedArc()
	 * @generated
	 */
	int DIRECTED_ARC = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__NAME = GRAPH_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__GRAPH = GRAPH_ELEMENT__GRAPH;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__LABEL = GRAPH_ELEMENT__LABEL;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__COLOR = GRAPH_ELEMENT__COLOR;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__WEIGHT = GRAPH_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source Node</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__SOURCE_NODE = GRAPH_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Node</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC__TARGET_NODE = GRAPH_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Directed Arc</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int DIRECTED_ARC_FEATURE_COUNT = GRAPH_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.Graph#getContents
	 * <em>Contents</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Contents</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.Graph#getContents()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Contents();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement
	 * <em>Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphElement
	 * @generated
	 */
	EClass getGraphElement();

	/**
	 * Returns the meta object for the container reference '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getGraph
	 * <em>Graph</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getGraph()
	 * @see #getGraphElement()
	 * @generated
	 */
	EReference getGraphElement_Graph();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getLabel
	 * <em>Label</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getLabel()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Label();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getColor
	 * <em>Color</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.GraphElement#getColor()
	 * @see #getGraphElement()
	 * @generated
	 */
	EAttribute getGraphElement_Color();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.Node <em>Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Node</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.Node#getShape
	 * <em>Shape</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.Node#getShape()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Shape();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.Node#getStyle
	 * <em>Style</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.Node#getStyle()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Style();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc
	 * <em>Directed Arc</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Directed Arc</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.DirectedArc
	 * @generated
	 */
	EClass getDirectedArc();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getWeight
	 * <em>Weight</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getWeight()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EAttribute getDirectedArc_Weight();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getSourceNode
	 * <em>Source Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source Node</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getSourceNode()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EReference getDirectedArc_SourceNode();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getTargetNode
	 * <em>Target Node</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target Node</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.Graph.DirectedArc#getTargetNode()
	 * @see #getDirectedArc()
	 * @generated
	 */
	EReference getDirectedArc_TargetNode();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

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
		 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.NamedElementImpl
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getNamedElement()
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
		 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.GraphImpl
		 * <em>Graph</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphImpl
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH__CONTENTS = eINSTANCE.getGraph_Contents();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.GraphElementImpl
		 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphElementImpl
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getGraphElement()
		 * @generated
		 */
		EClass GRAPH_ELEMENT = eINSTANCE.getGraphElement();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH_ELEMENT__GRAPH = eINSTANCE.getGraphElement_Graph();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__LABEL = eINSTANCE.getGraphElement_Label();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute GRAPH_ELEMENT__COLOR = eINSTANCE.getGraphElement_Color();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.NodeImpl
		 * <em>Node</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.NodeImpl
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NODE__SHAPE = eINSTANCE.getNode_Shape();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute NODE__STYLE = eINSTANCE.getNode_Style();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.Graph.impl.DirectedArcImpl
		 * <em>Directed Arc</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.DirectedArcImpl
		 * @see fr.irit.ifclipse.visual.patterns.Graph.impl.GraphPackageImpl#getDirectedArc()
		 * @generated
		 */
		EClass DIRECTED_ARC = eINSTANCE.getDirectedArc();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute DIRECTED_ARC__WEIGHT = eINSTANCE.getDirectedArc_Weight();

		/**
		 * The meta object literal for the '<em><b>Source Node</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIRECTED_ARC__SOURCE_NODE = eINSTANCE
				.getDirectedArc_SourceNode();

		/**
		 * The meta object literal for the '<em><b>Target Node</b></em>'
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference DIRECTED_ARC__TARGET_NODE = eINSTANCE
				.getDirectedArc_TargetNode();

	}

} // GraphPackage
