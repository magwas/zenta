/**
 */
package org.rulez.magwas.metamodel.metamodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.metamodel.metamodel.MetamodelFactory;
import org.rulez.magwas.metamodel.metamodel.ObjectClass;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestUtils;

/**
 * @generated
 */
public class ObjectClassTest extends TestCase {

	/**
	 * @generated
	 */
	protected ObjectClass fixture = null;

	/**
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ObjectClassTest.class);
	}

	/**
	 * @generated
	 */
	public ObjectClassTest(String name) {
		super(name);
	}

	/**
	 * @generated
	 */
	protected void setFixture(ObjectClass fixture) {
		this.fixture = fixture;
	}

	/**
	 * @generated
	 */
	protected ObjectClass getFixture() {
		return fixture;
	}

	/**
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MetamodelFactory.eINSTANCE.createObjectClass());
	}

	/**
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * @generated NOT
	 */
	public void testGetChildren() {
		EList<ObjectClass> kids = fixture.getChildren();
		assertEquals(0,kids.size());
	}

	public void testGetName() {
		assertEquals("Basic Object",fixture.getName());
	}

	public void testTreetop() {
		createRootObject(fixture);
		EList<ObjectClass> kids = fixture.getChildren();
		assertEquals(1,kids.size());
	}
	//FIXME this should be in the factory
	private void createRootObject(ObjectClass rootobj) {
		rootobj.setAncestor(rootobj);
	}

	public void testNotTreeTop() {
		fixture.setAncestor(fixture);
		ObjectClass obj2 = createObjectClass();
		obj2.setAncestor(fixture);
		EList<ObjectClass> kids = fixture.getChildren();
		assertEquals(2,kids.size());
	}

		private ObjectClass createObjectClass() {
			return MetamodelFactory.eINSTANCE.createObjectClass();
		}

	public void testObjectClass_can_be_created_using_a_zenta_object() {
		ModelTestUtils.getTestZentaModelResource();
		fail();
	}

} //ObjectClassTest
