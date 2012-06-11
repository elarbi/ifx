/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.dsl.vd.VDMapping;

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
 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingFactory
 * @model kind="package"
 * @generated
 */
public interface VDMappingPackage extends EPackage {
	/**
	 * The package name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNAME = "VDMapping";

	/**
	 * The package namespace URI. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_URI = "http://irit.fr/vdmapping";

	/**
	 * The package namespace name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	String eNS_PREFIX = "vdmap";

	/**
	 * The singleton instance of the package. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	VDMappingPackage eINSTANCE = fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingPackageImpl
			.init();

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.NamedElementImpl
	 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.NamedElementImpl
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingPackageImpl#getNamedElement()
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
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingImpl
	 * <em>VD Mapping</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingImpl
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingPackageImpl#getVDMapping()
	 * @generated
	 */
	int VD_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VD_MAPPING__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' containment reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VD_MAPPING__MAPPINGS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>VD Mapping</em>' class.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int VD_MAPPING_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.MappingImpl
	 * <em>Mapping</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.MappingImpl
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Metaclass Name</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAPPING__METACLASS_NAME = 0;

	/**
	 * The feature id for the '<em><b>Figure Type</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAPPING__FIGURE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAPPING__COLOR = 2;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 3;

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.VDMapping <em>VD Mapping</em>}'.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>VD Mapping</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMapping
	 * @generated
	 */
	EClass getVDMapping();

	/**
	 * Returns the meta object for the containment reference list '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.VDMapping#getMappings
	 * <em>Mappings</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the containment reference list '
	 *         <em>Mappings</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMapping#getMappings()
	 * @see #getVDMapping()
	 * @generated
	 */
	EReference getVDMapping_Mappings();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping <em>Mapping</em>}'. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getMetaclassName
	 * <em>Metaclass Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Metaclass Name</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getMetaclassName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_MetaclassName();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getFigureType
	 * <em>Figure Type</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Figure Type</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getFigureType()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_FigureType();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getColor <em>Color</em>}
	 * '. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getColor()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_Color();

	/**
	 * Returns the meta object for class '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.NamedElement
	 * <em>Named Element</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.NamedElement#getName
	 * <em>Name</em>}'. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VDMappingFactory getVDMappingFactory();

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
		 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingImpl
		 * <em>VD Mapping</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingImpl
		 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingPackageImpl#getVDMapping()
		 * @generated
		 */
		EClass VD_MAPPING = eINSTANCE.getVDMapping();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>'
		 * containment reference list feature. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @generated
		 */
		EReference VD_MAPPING__MAPPINGS = eINSTANCE.getVDMapping_Mappings();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.MappingImpl
		 * <em>Mapping</em>}' class. <!-- begin-user-doc --> <!-- end-user-doc
		 * -->
		 * 
		 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.MappingImpl
		 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Metaclass Name</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MAPPING__METACLASS_NAME = eINSTANCE
				.getMapping_MetaclassName();

		/**
		 * The meta object literal for the '<em><b>Figure Type</b></em>'
		 * attribute feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MAPPING__FIGURE_TYPE = eINSTANCE.getMapping_FigureType();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute
		 * feature. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		EAttribute MAPPING__COLOR = eINSTANCE.getMapping_Color();

		/**
		 * The meta object literal for the '
		 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.NamedElementImpl
		 * <em>Named Element</em>}' class. <!-- begin-user-doc --> <!--
		 * end-user-doc -->
		 * 
		 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.NamedElementImpl
		 * @see fr.irit.ifclipse.dsl.vd.VDMapping.impl.VDMappingPackageImpl#getNamedElement()
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

	}

} // VDMappingPackage
