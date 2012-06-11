/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.visual.patterns.ComDiag;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Message</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getOccurence <em>
 * Occurence</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getSource <em>
 * Source</em>}</li>
 * <li>{@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getTarget <em>
 * Target</em>}</li>
 * </ul>
 * </p>
 * 
 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends ComDiagElement {
	/**
	 * Returns the value of the '<em><b>Occurence</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurence</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Occurence</em>' attribute.
	 * @see #setOccurence(int)
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getMessage_Occurence()
	 * @model
	 * @generated
	 */
	int getOccurence();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getOccurence
	 * <em>Occurence</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Occurence</em>' attribute.
	 * @see #getOccurence()
	 * @generated
	 */
	void setOccurence(int value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Lifeline)
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getMessage_Source()
	 * @model
	 * @generated
	 */
	Lifeline getSource();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getSource
	 * <em>Source</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Lifeline)
	 * @see fr.irit.ifclipse.visual.patterns.ComDiag.ComDiagPackage#getMessage_Target()
	 * @model
	 * @generated
	 */
	Lifeline getTarget();

	/**
	 * Sets the value of the '
	 * {@link fr.irit.ifclipse.visual.patterns.ComDiag.Message#getTarget
	 * <em>Target</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Lifeline value);

} // Message
