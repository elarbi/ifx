/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.dsl.vd.VDMapping.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.dsl.vd.VDMapping.Mapping;
import fr.irit.ifclipse.dsl.vd.VDMapping.VDMapping;
import fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingFactory;
import fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class VDMappingFactoryImpl extends EFactoryImpl implements
		VDMappingFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static VDMappingFactory init() {
		try {
			VDMappingFactory theVDMappingFactory = (VDMappingFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/vdmapping");
			if (theVDMappingFactory != null) {
				return theVDMappingFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VDMappingFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public VDMappingFactoryImpl() {
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
		case VDMappingPackage.VD_MAPPING:
			return createVDMapping();
		case VDMappingPackage.MAPPING:
			return createMapping();
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
	public VDMapping createVDMapping() {
		VDMappingImpl vdMapping = new VDMappingImpl();
		return vdMapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Mapping createMapping() {
		MappingImpl mapping = new MappingImpl();
		return mapping;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VDMappingPackage getVDMappingPackage() {
		return (VDMappingPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VDMappingPackage getPackage() {
		return VDMappingPackage.eINSTANCE;
	}

} // VDMappingFactoryImpl
