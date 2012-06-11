/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.dsl.vd.VDMapping.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import fr.irit.ifclipse.dsl.vd.VDMapping.Mapping;
import fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Mapping</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>
 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.MappingImpl#getMetaclassName
 * <em>Metaclass Name</em>}</li>
 * <li>{@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.MappingImpl#getFigureType
 * <em>Figure Type</em>}</li>
 * <li>{@link fr.irit.ifclipse.dsl.vd.VDMapping.impl.MappingImpl#getColor <em>
 * Color</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class MappingImpl extends EObjectImpl implements Mapping {
	/**
	 * The default value of the '{@link #getMetaclassName()
	 * <em>Metaclass Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected static final String METACLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaclassName()
	 * <em>Metaclass Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getMetaclassName()
	 * @generated
	 * @ordered
	 */
	protected String metaclassName = METACLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFigureType() <em>Figure Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFigureType()
	 * @generated
	 * @ordered
	 */
	protected static final String FIGURE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFigureType() <em>Figure Type</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFigureType()
	 * @generated
	 * @ordered
	 */
	protected String figureType = FIGURE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected String color = COLOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VDMappingPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getMetaclassName() {
		return metaclassName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setMetaclassName(String newMetaclassName) {
		String oldMetaclassName = metaclassName;
		metaclassName = newMetaclassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VDMappingPackage.MAPPING__METACLASS_NAME, oldMetaclassName,
					metaclassName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFigureType() {
		return figureType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFigureType(String newFigureType) {
		String oldFigureType = figureType;
		figureType = newFigureType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VDMappingPackage.MAPPING__FIGURE_TYPE, oldFigureType,
					figureType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getColor() {
		return color;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setColor(String newColor) {
		String oldColor = color;
		color = newColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					VDMappingPackage.MAPPING__COLOR, oldColor, color));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case VDMappingPackage.MAPPING__METACLASS_NAME:
			return getMetaclassName();
		case VDMappingPackage.MAPPING__FIGURE_TYPE:
			return getFigureType();
		case VDMappingPackage.MAPPING__COLOR:
			return getColor();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case VDMappingPackage.MAPPING__METACLASS_NAME:
			setMetaclassName((String) newValue);
			return;
		case VDMappingPackage.MAPPING__FIGURE_TYPE:
			setFigureType((String) newValue);
			return;
		case VDMappingPackage.MAPPING__COLOR:
			setColor((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case VDMappingPackage.MAPPING__METACLASS_NAME:
			setMetaclassName(METACLASS_NAME_EDEFAULT);
			return;
		case VDMappingPackage.MAPPING__FIGURE_TYPE:
			setFigureType(FIGURE_TYPE_EDEFAULT);
			return;
		case VDMappingPackage.MAPPING__COLOR:
			setColor(COLOR_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case VDMappingPackage.MAPPING__METACLASS_NAME:
			return METACLASS_NAME_EDEFAULT == null ? metaclassName != null
					: !METACLASS_NAME_EDEFAULT.equals(metaclassName);
		case VDMappingPackage.MAPPING__FIGURE_TYPE:
			return FIGURE_TYPE_EDEFAULT == null ? figureType != null
					: !FIGURE_TYPE_EDEFAULT.equals(figureType);
		case VDMappingPackage.MAPPING__COLOR:
			return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT
					.equals(color);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (metaclassName: ");
		result.append(metaclassName);
		result.append(", figureType: ");
		result.append(figureType);
		result.append(", color: ");
		result.append(color);
		result.append(')');
		return result.toString();
	}

} // MappingImpl
