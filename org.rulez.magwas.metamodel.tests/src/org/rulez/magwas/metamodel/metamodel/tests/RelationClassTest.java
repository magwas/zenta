/**
 */
package org.rulez.magwas.metamodel.metamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.metamodel.metamodel.MetamodelFactory;
import org.rulez.magwas.metamodel.metamodel.RelationClass;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Relation Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.rulez.magwas.metamodel.metamodel.RelationClass#getChildren() <em>Children</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.rulez.magwas.metamodel.metamodel.referencesModelObject#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RelationClassTest extends TestCase {

	/**
	 * The fixture for this Relation Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationClass fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RelationClassTest.class);
	}

	/**
	 * Constructs a new Relation Class test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationClassTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Relation Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RelationClass fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Relation Class test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationClass getFixture() {
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
		setFixture(MetamodelFactory.eINSTANCE.createRelationClass());
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

	/**
	 * Tests the '{@link org.rulez.magwas.metamodel.metamodel.RelationClass#getChildren() <em>Children</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.metamodel.metamodel.RelationClass#getChildren()
	 * @generated NOT
	 */
	public void testGetChildren() {
		EList<RelationClass> kids = fixture.getChildren();
		assertEquals(0,kids.size());
	}

	public void testGetName() {
		assertEquals("Basic Relation",fixture.getName());
	}

} //RelationClassTest
