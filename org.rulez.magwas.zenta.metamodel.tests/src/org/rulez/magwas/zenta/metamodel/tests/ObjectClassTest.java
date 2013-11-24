package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
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

	@Test
	public void Builtin_ObjectClass_is_named_Basic_Object() {
		assertEquals("Basic Object",fixture.getName());
	}

	@Test(expected = MetamodelFactory.BuiltinClassShouldNotHaveAncestor.class)
	public void The_ancestor_cannot_be_set_for_the_Builtin_ObjectClass() {
		fixture.setAncestor(fixture);
	}

	@Test(expected = MetamodelFactory.BuiltinClassShouldNotHaveReference.class)
	public void The_reference_cannot_be_set_for_the_Builtin_ObjectClass() {
		ObjectClass obj2 = createTestObjectClass();
		fixture.setReference(obj2);
	}
	
	@Test
	public void if_an_ObjectClass_is_set_as_ancestor_then_the_number_of_its_kids_grows() {
		EList<ObjectClass> kids = fixture.getChildren();
		assertEquals(0,kids.size());
		ObjectClass obj2 = createTestObjectClass();
		obj2.setAncestor(fixture);
		kids = fixture.getChildren();
		assertEquals(1,kids.size());
	}

	@Test
	public void ObjectClass_can_be_created_using_a_zenta_object() {
		createTestObjectClass();
	}

	private ObjectClass createTestObjectClass() {
		ModelTestData testdata = new ModelTestData();
		IZentaModel zentaModel = testdata.getModel();
		EObject element = ZentaModelUtils.getObjectByID(zentaModel, "ea94cf6c");
		Metamodel metamodel = MetamodelFactory.eINSTANCE.createMetamodel();
		return MetamodelFactory.eINSTANCE
				.createObjectClass(
						(BusinessObject) element,
						metamodel.getTemplates().get(0));
	}
}
