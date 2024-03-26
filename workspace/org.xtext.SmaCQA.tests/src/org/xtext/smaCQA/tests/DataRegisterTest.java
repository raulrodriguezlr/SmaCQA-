/**
 * generated by Xtext 2.18.0.M3
 */
package org.xtext.smaCQA.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.xtext.smaCQA.DataRegister;
import org.xtext.smaCQA.SmaCQAFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Data Register</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class DataRegisterTest extends TestCase {

	/**
	 * The fixture for this Data Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRegister fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(DataRegisterTest.class);
	}

	/**
	 * Constructs a new Data Register test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRegisterTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Data Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(DataRegister fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Data Register test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataRegister getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SmaCQAFactory.eINSTANCE.createDataRegister());
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

} //DataRegisterTest
