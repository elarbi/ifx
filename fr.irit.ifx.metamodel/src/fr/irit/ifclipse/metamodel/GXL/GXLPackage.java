/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.GXL;

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
 * @see fr.irit.ifclipse.metamodel.GXL.GXLFactory
 * @model kind="package"
 * @generated
 */
public interface GXLPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "GXL";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/gxl";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "gxl";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	GXLPackage eINSTANCE = fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.GXL.impl.GXLImpl <em>GXL</em>}' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLImpl
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getGXL()
	 * @generated
	 */
	int GXL = 0;

	/**
	 * The feature id for the '<em><b>Graphs</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GXL__GRAPHS = 0;

	/**
	 * The number of structural features of the '<em>GXL</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GXL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.GXL.impl.AttributedElementImpl
	 * <em>Attributed Element</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.AttributedElementImpl
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getAttributedElement()
	 * @generated
	 */
	int ATTRIBUTED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_ELEMENT__ID = 0;

	/**
	 * The number of structural features of the '<em>Attributed Element</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.GXL.impl.TypedElementImpl
	 * <em>Typed Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.TypedElementImpl
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__ID = ATTRIBUTED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = ATTRIBUTED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = ATTRIBUTED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.GXL.impl.GraphImpl <em>Graph</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.GraphImpl
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH__ID = TYPED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Graph</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.GXL.impl.NodeImpl <em>Node</em>}'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.NodeImpl
	 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__ID = TYPED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE__GRAPH = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Node</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.GXL.GXL <em>GXL</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>GXL</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.GXL
	 * @generated
	 */
	EClass getGXL();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.GXL.GXL#getGraphs <em>Graphs</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Graphs</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.GXL#getGraphs()
	 * @see #getGXL()
	 * @generated
	 */
	EReference getGXL_Graphs();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.GXL.AttributedElement
	 * <em>Attributed Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Attributed Element</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.AttributedElement
	 * @generated
	 */
	EClass getAttributedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.GXL.AttributedElement#getId
	 * <em>Id</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.AttributedElement#getId()
	 * @see #getAttributedElement()
	 * @generated
	 */
	EAttribute getAttributedElement_Id();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.GXL.TypedElement
	 * <em>Typed Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.GXL.TypedElement#getType <em>Type</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Type();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.GXL.Graph <em>Graph</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.GXL.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Nodes</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.GXL.Node <em>Node</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Node</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the containment reference '
	 * {@link fr.irit.ifclipse.metamodel.GXL.Node#getGraph <em>Graph</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference '<em>Graph</em>'.
	 * @see fr.irit.ifclipse.metamodel.GXL.Node#getGraph()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Graph();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GXLFactory getGXLFactory();

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
		 * {@link fr.irit.ifclipse.metamodel.GXL.impl.GXLImpl <em>GXL</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLImpl
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getGXL()
		 * @generated
		 */
		EClass GXL = eINSTANCE.getGXL();

		/**
		 * The meta object literal for the '<em><b>Graphs</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GXL__GRAPHS = eINSTANCE.getGXL_Graphs();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.GXL.impl.AttributedElementImpl
		 * <em>Attributed Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.AttributedElementImpl
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getAttributedElement()
		 * @generated
		 */
		EClass ATTRIBUTED_ELEMENT = eINSTANCE.getAttributedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute ATTRIBUTED_ELEMENT__ID = eINSTANCE.getAttributedElement_Id();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.GXL.impl.TypedElementImpl
		 * <em>Typed Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.TypedElementImpl
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.GXL.impl.GraphImpl <em>Graph</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.GraphImpl
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.GXL.impl.NodeImpl <em>Node</em>}'
		 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.NodeImpl
		 * @see fr.irit.ifclipse.metamodel.GXL.impl.GXLPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' containment
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference NODE__GRAPH = eINSTANCE.getNode_Graph();

	}

} // GXLPackage
