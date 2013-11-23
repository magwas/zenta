package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestUtils;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ObjectClassTest{

	protected ObjectClass fixture = null;

	@Before
	public void setUp() throws Exception {
		this.fixture = MetamodelFactory.eINSTANCE.getBuiltinObjectClass();
	}

	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}

	public void testGetChildren() {
		EList<ObjectClass> kids = fixture.getChildren();
		assertEquals(0,kids.size());
	}

	public void testGetName() {
		assertEquals("Basic Object",fixture.getName());
	}

	public void testTreetop() {
		EList<ObjectClass> kids = fixture.getChildren();
		assertEquals(1,kids.size());
	}

	@Test(expected = MetamodelFactory.BuiltinClassShouldNotHaveAncestor.class)
	public void testNotTreeTop() {
		fixture.setAncestor(fixture);
	}

	@Test(expected = MetamodelFactory.BuiltinClassShouldNotHaveReference.class)
	public void testReferenceForBuiltin() {
		ObjectClass obj2 = createTestObjectClass();
		fixture.setReference(obj2);
	}
	
	@Test
	public void test_Number_of_kids_when_a_kid_added() {
		EList<ObjectClass> kids = fixture.getChildren();
		assertEquals(0,kids.size());
		ObjectClass obj2 = createTestObjectClass();
		obj2.setAncestor(fixture);
		kids = fixture.getChildren();
		assertEquals(1,kids.size());
	}

	public void testObjectClass_can_be_created_using_a_zenta_object() {
		createTestObjectClass();
	}

	private ObjectClass createTestObjectClass() {
		Resource resource = ModelTestUtils.getTestZentaModelResource();
		IZentaModel zentaModel = ModelTestUtils.getModelFromResource(resource);
		EObject element = ZentaModelUtils.getObjectByID(zentaModel, "ea94cf6c");
		return MetamodelFactory.eINSTANCE.createObjectClass((BusinessObject) element);
	}

} //ObjectClassTest
