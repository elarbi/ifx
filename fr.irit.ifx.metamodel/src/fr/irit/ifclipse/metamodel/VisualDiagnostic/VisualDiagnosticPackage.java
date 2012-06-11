/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.VisualDiagnostic;

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
 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticFactory
 * @model kind="package"
 * @generated
 */
public interface VisualDiagnosticPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "VisualDiagnostic";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/visualdiagnostic";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "vdiagnostic";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	VisualDiagnosticPackage eINSTANCE = fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.NamedElementImpl
	 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.NamedElementImpl
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 2;

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
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticImpl
	 * <em>Visual Diagnostic</em>}' class. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticImpl
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticPackageImpl#getVisualDiagnostic()
	 * @generated
	 */
	int VISUAL_DIAGNOSTIC = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VISUAL_DIAGNOSTIC__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Figures</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VISUAL_DIAGNOSTIC__FIGURES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Visual Diagnostic</em>'
	 * class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VISUAL_DIAGNOSTIC_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.FigureImpl
	 * <em>Figure</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.FigureImpl
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticPackageImpl#getFigure()
	 * @generated
	 */
	int FIGURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIGURE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIGURE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIGURE__COLOR = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Figure</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int FIGURE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic
	 * <em>Visual Diagnostic</em>}'. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @return the meta object for class '<em>Visual Diagnostic</em>'.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic
	 * @generated
	 */
	EClass getVisualDiagnostic();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic#getFigures
	 * <em>Figures</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Figures</em>'.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic#getFigures()
	 * @see #getVisualDiagnostic()
	 * @generated
	 */
	EReference getVisualDiagnostic_Figures();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure
	 * <em>Figure</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Figure</em>'.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure
	 * @generated
	 */
	EClass getFigure();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getType
	 * <em>Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getType()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Type();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getColor
	 * <em>Color</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure#getColor()
	 * @see #getFigure()
	 * @generated
	 */
	EAttribute getFigure_Color();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualDiagnosticFactory getVisualDiagnosticFactory();

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
		 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.NamedElementImpl
		 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticPackageImpl#getNamedElement()
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
		 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticImpl
		 * <em>Visual Diagnostic</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticImpl
		 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticPackageImpl#getVisualDiagnostic()
		 * @generated
		 */
		EClass VISUAL_DIAGNOSTIC = eINSTANCE.getVisualDiagnostic();

		/**
		 * The meta object literal for the '<em><b>Figures</b></em>' containment
		 * reference list feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VISUAL_DIAGNOSTIC__FIGURES = eINSTANCE
				.getVisualDiagnostic_Figures();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.FigureImpl
		 * <em>Figure</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.FigureImpl
		 * @see fr.irit.ifclipse.metamodel.VisualDiagnostic.impl.VisualDiagnosticPackageImpl#getFigure()
		 * @generated
		 */
		EClass FIGURE = eINSTANCE.getFigure();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FIGURE__TYPE = eINSTANCE.getFigure_Type();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute FIGURE__COLOR = eINSTANCE.getFigure_Color();

	}

} // VisualDiagnosticPackage
