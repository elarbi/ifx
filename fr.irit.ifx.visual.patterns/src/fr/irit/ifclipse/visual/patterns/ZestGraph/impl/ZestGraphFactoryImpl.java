/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ZestGraph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphConnection;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphContainer;
import fr.irit.ifclipse.visual.patterns.ZestGraph.GraphNode;
import fr.irit.ifclipse.visual.patterns.ZestGraph.NamedElement;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraph;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphFactory;
import fr.irit.ifclipse.visual.patterns.ZestGraph.ZestGraphPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ZestGraphFactoryImpl extends EFactoryImpl implements
		ZestGraphFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ZestGraphFactory init() {
		try {
			ZestGraphFactory theZestGraphFactory = (ZestGraphFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/zestgraph");
			if (theZestGraphFactory != null) {
				return theZestGraphFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZestGraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ZestGraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ZestGraphPackage.NAMED_ELEMENT:
			return createNamedElement();
		case ZestGraphPackage.ZEST_GRAPH:
			return createZestGraph();
		case ZestGraphPackage.GRAPH_CONTAINER:
			return createGraphContainer();
		case ZestGraphPackage.GRAPH_NODE:
			return createGraphNode();
		case ZestGraphPackage.GRAPH_CONNECTION:
			return createGraphConnection();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName()
					+ "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NamedElement createNamedElement() {
		NamedElementImpl namedElement = new NamedElementImpl();
		return namedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ZestGraph createZestGraph() {
		ZestGraphImpl zestGraph = new ZestGraphImpl();
		return zestGraph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphContainer createGraphContainer() {
		GraphContainerImpl graphContainer = new GraphContainerImpl();
		return graphContainer;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphNode createGraphNode() {
		GraphNodeImpl graphNode = new GraphNodeImpl();
		return graphNode;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GraphConnection createGraphConnection() {
		GraphConnectionImpl graphConnection = new GraphConnectionImpl();
		return graphConnection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ZestGraphPackage getZestGraphPackage() {
		return (ZestGraphPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZestGraphPackage getPackage() {
		return ZestGraphPackage.eINSTANCE;
	}

} // ZestGraphFactoryImpl
