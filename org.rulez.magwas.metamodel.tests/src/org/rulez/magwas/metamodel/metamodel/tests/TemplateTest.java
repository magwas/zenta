/**
 */
package org.rulez.magwas.metamodel.metamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.metamodel.metamodel.MetamodelFactory;
import org.rulez.magwas.metamodel.metamodel.ObjectClass;
import org.rulez.magwas.metamodel.metamodel.RelationClass;
import org.rulez.magwas.metamodel.metamodel.Template;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.rulez.magwas.metamodel.metamodel.referencesModelObject#getName() <em>Get Name</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TemplateTest extends TestCase {

	/**
	 * The fixture for this Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Template fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TemplateTest.class);
	}

	/**
	 * Constructs a new Template test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Template fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Template test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Template getFixture() {
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
		setFixture(MetamodelFactory.eINSTANCE.createTemplate());
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
	
	public void testGetName() {
		assertEquals("Builtins",fixture.getName());
	}
	
	public void testGetChildren() {
		EList<ObjectClass> objects = fixture.getObjectClasses();
		assertEquals(0,objects.size());
		EList<RelationClass> relations = fixture.getRelationClasses();
		assertEquals(0,relations.size());
	}


} //TemplateTest
