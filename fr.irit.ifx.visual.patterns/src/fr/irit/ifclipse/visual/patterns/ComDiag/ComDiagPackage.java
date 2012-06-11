/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ComDiag;

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
 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagFactory
 * @model kind="package"
 * @generated
 */
public interface ComDiagPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "ComDiag";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/comdiag";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "comdiag";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	ComDiagPackage eINSTANCE = fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.NamedElementImpl
	 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.NamedElementImpl
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getNamedElement()
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
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagImpl
	 * <em>Com Diag</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagImpl
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getComDiag()
	 * @generated
	 */
	int COM_DIAG = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COM_DIAG__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COM_DIAG__ELEMENTS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COM_DIAG__LEVEL = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Diag</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COM_DIAG_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagElementImpl
	 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagElementImpl
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getComDiagElement()
	 * @generated
	 */
	int COM_DIAG_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COM_DIAG_ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COM_DIAG_ELEMENT__GRAPH = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Element</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int COM_DIAG_ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.LifelineImpl
	 * <em>Lifeline</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.LifelineImpl
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getLifeline()
	 * @generated
	 */
	int LIFELINE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NAME = COM_DIAG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIFELINE__GRAPH = COM_DIAG_ELEMENT__GRAPH;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIFELINE__NUMBER = COM_DIAG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Lifeline</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int LIFELINE_FEATURE_COUNT = COM_DIAG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.MessageImpl
	 * <em>Message</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.MessageImpl
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = COM_DIAG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Graph</b></em>' container reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__GRAPH = COM_DIAG_ELEMENT__GRAPH;

	/**
	 * The feature id for the '<em><b>Occurence</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__OCCURENCE = COM_DIAG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__SOURCE = COM_DIAG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TARGET = COM_DIAG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Message</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = COM_DIAG_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag
	 * <em>Com Diag</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Com Diag</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag
	 * @generated
	 */
	EClass getComDiag();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getElements
	 * <em>Elements</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Elements</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getElements()
	 * @see #getComDiag()
	 * @generated
	 */
	EReference getComDiag_Elements();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getLevel
	 * <em>Level</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag#getLevel()
	 * @see #getComDiag()
	 * @generated
	 */
	EAttribute getComDiag_Level();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement
	 * <em>Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Element</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement
	 * @generated
	 */
	EClass getComDiagElement();

	/**
	 * Returns the meta object for the container reference '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement#getGraph
	 * <em>Graph</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the container reference '<em>Graph</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement#getGraph()
	 * @see #getComDiagElement()
	 * @generated
	 */
	EReference getComDiagElement_Graph();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Lifeline
	 * <em>Lifeline</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Lifeline</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.Lifeline
	 * @generated
	 */
	EClass getLifeline();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Lifeline#getNumber
	 * <em>Number</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.Lifeline#getNumber()
	 * @see #getLifeline()
	 * @generated
	 */
	EAttribute getLifeline_Number();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Message <em>Message</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Message</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getOccurence
	 * <em>Occurence</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Occurence</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.Message#getOccurence()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Occurence();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getSource
	 * <em>Source</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.Message#getSource()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Source();

	/**
	 * Returns the meta object for the reference '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getTarget
	 * <em>Target</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.Message#getTarget()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Target();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ComDiagFactory getComDiagFactory();

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
		 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.NamedElementImpl
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getNamedElement()
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
		 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagImpl
		 * <em>Com Diag</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagImpl
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getComDiag()
		 * @generated
		 */
		EClass COM_DIAG = eINSTANCE.getComDiag();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COM_DIAG__ELEMENTS = eINSTANCE.getComDiag_Elements();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute COM_DIAG__LEVEL = eINSTANCE.getComDiag_Level();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagElementImpl
		 * <em>Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagElementImpl
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getComDiagElement()
		 * @generated
		 */
		EClass COM_DIAG_ELEMENT = eINSTANCE.getComDiagElement();

		/**
		 * The meta object literal for the '<em><b>Graph</b></em>' container
		 * reference feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference COM_DIAG_ELEMENT__GRAPH = eINSTANCE
				.getComDiagElement_Graph();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.LifelineImpl
		 * <em>Lifeline</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.LifelineImpl
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getLifeline()
		 * @generated
		 */
		EClass LIFELINE = eINSTANCE.getLifeline();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute LIFELINE__NUMBER = eINSTANCE.getLifeline_Number();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.impl.MessageImpl
		 * <em>Message</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.MessageImpl
		 * @see fr.irit.ifclipse.visual.patterns.ComDiag.impl.ComDiagPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Occurence</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MESSAGE__OCCURENCE = eINSTANCE.getMessage_Occurence();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE__SOURCE = eINSTANCE.getMessage_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EReference MESSAGE__TARGET = eINSTANCE.getMessage_Target();

	}

} // ComDiagPackage
