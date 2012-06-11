/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.dsl.vd.VDMapping;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Mapping</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getMetaclassName <em>
 * Metaclass Name</em>}</li>
 * <li>{@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getFigureType <em>Figure
 * Type</em>}</li>
 * <li>{@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getColor <em>Color</em>}
 * </li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Metaclass Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Metaclass Name</em>' attribute.
	 * @see #setMetaclassName(String)
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage#getMapping_MetaclassName()
	 * @model required="true"
	 * @generated
	 */
	String getMetaclassName();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getMetaclassName
	 * <em>Metaclass Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Metaclass Name</em>' attribute.
	 * @see #getMetaclassName()
	 * @generated
	 */
	void setMetaclassName(String value);

	/**
	 * Returns the value of the '<em><b>Figure Type</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Figure Type</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Figure Type</em>' attribute.
	 * @see #setFigureType(String)
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage#getMapping_FigureType()
	 * @model required="true"
	 * @generated
	 */
	String getFigureType();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getFigureType
	 * <em>Figure Type</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Figure Type</em>' attribute.
	 * @see #getFigureType()
	 * @generated
	 */
	void setFigureType(String value);

	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Color</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see fr.irit.ifclipse.dsl.vd.VDMapping.VDMappingPackage#getMapping_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.dsl.vd.VDMapping.Mapping#getColor <em>Color</em>}
	 * ' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

} // Mapping
