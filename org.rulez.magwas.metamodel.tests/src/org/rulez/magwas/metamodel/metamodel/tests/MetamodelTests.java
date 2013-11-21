/**
 */
package org.rulez.magwas.metamodel.metamodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>metamodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetamodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MetamodelTests("metamodel Tests");
		suite.addTestSuite(TemplateTest.class);
		suite.addTestSuite(ObjectClassTest.class);
		suite.addTestSuite(RelationClassTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelTests(String name) {
		super(name);
	}

} //MetamodelTests
