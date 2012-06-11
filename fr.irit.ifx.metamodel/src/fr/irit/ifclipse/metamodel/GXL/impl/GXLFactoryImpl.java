/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.GXL.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.metamodel.GXL.AttributedElement;
import fr.irit.ifclipse.metamodel.GXL.GXL;
import fr.irit.ifclipse.metamodel.GXL.GXLFactory;
import fr.irit.ifclipse.metamodel.GXL.GXLPackage;
import fr.irit.ifclipse.metamodel.GXL.Graph;
import fr.irit.ifclipse.metamodel.GXL.Node;
import fr.irit.ifclipse.metamodel.GXL.TypedElement;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class GXLFactoryImpl extends EFactoryImpl implements GXLFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static GXLFactory init() {
		try {
			GXLFactory theGXLFactory = (GXLFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/gxl");
			if (theGXLFactory != null) {
				return theGXLFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GXLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public GXLFactoryImpl() {
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
		case GXLPackage.GXL:
			return createGXL();
		case GXLPackage.ATTRIBUTED_ELEMENT:
			return createAttributedElement();
		case GXLPackage.TYPED_ELEMENT:
			return createTypedElement();
		case GXLPackage.GRAPH:
			return createGraph();
		case GXLPackage.NODE:
			return createNode();
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
	public GXL createGXL() {
		GXLImpl gxl = new GXLImpl();
		return gxl;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AttributedElement createAttributedElement() {
		AttributedElementImpl attributedElement = new AttributedElementImpl();
		return attributedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public TypedElement createTypedElement() {
		TypedElementImpl typedElement = new TypedElementImpl();
		return typedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public GXLPackage getGXLPackage() {
		return (GXLPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GXLPackage getPackage() {
		return GXLPackage.eINSTANCE;
	}

} // GXLFactoryImpl
