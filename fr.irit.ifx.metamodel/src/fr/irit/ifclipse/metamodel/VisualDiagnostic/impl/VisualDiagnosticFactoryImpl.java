/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.VisualDiagnostic.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.metamodel.VisualDiagnostic.Figure;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnostic;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticFactory;
import fr.irit.ifclipse.metamodel.VisualDiagnostic.VisualDiagnosticPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class VisualDiagnosticFactoryImpl extends EFactoryImpl implements
		VisualDiagnosticFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static VisualDiagnosticFactory init() {
		try {
			VisualDiagnosticFactory theVisualDiagnosticFactory = (VisualDiagnosticFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/visualdiagnostic");
			if (theVisualDiagnosticFactory != null) {
				return theVisualDiagnosticFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualDiagnosticFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public VisualDiagnosticFactoryImpl() {
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
		case VisualDiagnosticPackage.VISUAL_DIAGNOSTIC:
			return createVisualDiagnostic();
		case VisualDiagnosticPackage.FIGURE:
			return createFigure();
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
	public VisualDiagnostic createVisualDiagnostic() {
		VisualDiagnosticImpl visualDiagnostic = new VisualDiagnosticImpl();
		return visualDiagnostic;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Figure createFigure() {
		FigureImpl figure = new FigureImpl();
		return figure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VisualDiagnosticPackage getVisualDiagnosticPackage() {
		return (VisualDiagnosticPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualDiagnosticPackage getPackage() {
		return VisualDiagnosticPackage.eINSTANCE;
	}

} // VisualDiagnosticFactoryImpl
