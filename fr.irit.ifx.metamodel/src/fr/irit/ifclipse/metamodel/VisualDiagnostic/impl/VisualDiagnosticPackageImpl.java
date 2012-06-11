/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.VisualDiagnostic.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.NamedElement;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticFactory;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class VisualDiagnosticPackageImpl extends EPackageImpl implements
		VisualDiagnosticPackage {
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
	private EClass visualDiagnosticEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass figureEClass = null;

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
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualDiagnosticPackageImpl() {
		super(eNS_URI, VisualDiagnosticFactory.eINSTANCE);
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
	 * This method is used to initialize
	 * {@link VisualDiagnosticPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access
	 * that field to obtain the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualDiagnosticPackage init() {
		if (isInited)
			return (VisualDiagnosticPackage) EPackage.Registry.INSTANCE
					.getEPackage(VisualDiagnosticPackage.eNS_URI);

		// Obtain or create and register package
		VisualDiagnosticPackageImpl theVisualDiagnosticPackage = (VisualDiagnosticPackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof VisualDiagnosticPackageImpl ? EPackage.Registry.INSTANCE
				.get(eNS_URI) : new VisualDiagnosticPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVisualDiagnosticPackage.createPackageContents();

		// Initialize created meta-data
		theVisualDiagnosticPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisualDiagnosticPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualDiagnosticPackage.eNS_URI,
				theVisualDiagnosticPackage);
		return theVisualDiagnosticPackage;
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
	public EClass getVisualDiagnostic() {
		return visualDiagnosticEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getVisualDiagnostic_Figures() {
		return (EReference) visualDiagnosticEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFigure() {
		return figureEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFigure_Type() {
		return (EAttribute) figureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getFigure_Color() {
		return (EAttribute) figureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VisualDiagnosticFactory getVisualDiagnosticFactory() {
		return (VisualDiagnosticFactory) getEFactoryInstance();
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
		visualDiagnosticEClass = createEClass(VISUAL_DIAGNOSTIC);
		createEReference(visualDiagnosticEClass, VISUAL_DIAGNOSTIC__FIGURES);

		figureEClass = createEClass(FIGURE);
		createEAttribute(figureEClass, FIGURE__TYPE);
		createEAttribute(figureEClass, FIGURE__COLOR);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);
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
		visualDiagnosticEClass.getESuperTypes().add(this.getNamedElement());
		figureEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(visualDiagnosticEClass, VisualDiagnostic.class,
				"VisualDiagnostic", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVisualDiagnostic_Figures(), this.getFigure(), null,
				"figures", null, 0, -1, VisualDiagnostic.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(figureEClass, Figure.class, "Figure", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFigure_Type(), ecorePackage.getEString(), "type",
				null, 0, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getFigure_Color(), ecorePackage.getEString(), "color",
				null, 0, 1, Figure.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(),
				"name", null, 0, 1, NamedElement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} // VisualDiagnosticPackageImpl
