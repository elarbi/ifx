/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.irit.ifclipse.metamodel.IFConfig.tests;

import fr.irit.ifclipse.metamodel.IFConfig.IFConfigFactory;
import fr.irit.ifclipse.metamodel.IFConfig.IFInteger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IF Integer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IFIntegerTest extends VariableValueTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IFIntegerTest.class);
	}

	/**
	 * Constructs a new IF Integer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFIntegerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this IF Integer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IFInteger getFixture() {
		return (IFInteger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(IFConfigFactory.eINSTANCE.createIFInteger());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //IFIntegerTest
