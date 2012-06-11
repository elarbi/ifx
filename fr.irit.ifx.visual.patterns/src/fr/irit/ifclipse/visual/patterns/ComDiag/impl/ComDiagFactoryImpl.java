/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ComDiag.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiag;
import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagElement;
import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagFactory;
import fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage;
import fr.irit.ifclipse.visual.patterns.ComDiag.Lifeline;
import fr.irit.ifclipse.visual.patterns.ComDiag.Message;
import fr.irit.ifclipse.visual.patterns.ComDiag.NamedElement;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Factory</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class ComDiagFactoryImpl extends EFactoryImpl implements ComDiagFactory {
	/**
	 * Creates the default factory implementation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public static ComDiagFactory init() {
		try {
			ComDiagFactory theComDiagFactory = (ComDiagFactory) EPackage.Registry.INSTANCE
					.getEFactory("http://irit.fr/comdiag");
			if (theComDiagFactory != null) {
				return theComDiagFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ComDiagFactoryImpl();
	}

	/**
	 * Creates an instance of the factory. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public ComDiagFactoryImpl() {
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
		case ComDiagPackage.NAMED_ELEMENT:
			return createNamedElement();
		case ComDiagPackage.COM_DIAG:
			return createComDiag();
		case ComDiagPackage.COM_DIAG_ELEMENT:
			return createComDiagElement();
		case ComDiagPackage.LIFELINE:
			return createLifeline();
		case ComDiagPackage.MESSAGE:
			return createMessage();
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
	public ComDiag createComDiag() {
		ComDiagImpl comDiag = new ComDiagImpl();
		return comDiag;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComDiagElement createComDiagElement() {
		ComDiagElementImpl comDiagElement = new ComDiagElementImpl();
		return comDiagElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Lifeline createLifeline() {
		LifelineImpl lifeline = new LifelineImpl();
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ComDiagPackage getComDiagPackage() {
		return (ComDiagPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ComDiagPackage getPackage() {
		return ComDiagPackage.eINSTANCE;
	}

} // ComDiagFactoryImpl
