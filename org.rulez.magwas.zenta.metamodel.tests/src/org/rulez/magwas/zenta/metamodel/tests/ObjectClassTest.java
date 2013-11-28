package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.commands.AddDiagramObjectCommand;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ObjectClassTest{

	protected ObjectClass fixture = null;
	private Metamodel metamodel;
	private ModelTestData testdata;
	private IZentaModel model;
	private IZentaDiagramModel diagramModel;

	@Before
	public void setUp() throws Exception {
		testdata = new ModelTestData();
		model = testdata.getModel();
		
		ensureVirginDMOsForLoadTest();
				
		diagramModel = testdata.getTestDiagramModel();
		metamodel = MetamodelFactory.eINSTANCE.createMetamodel(model);
		fixture = metamodel.getBuiltinObjectClass();
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
		IBasicObject obj2 = IZentaFactory.eINSTANCE.createBasicObject();
		System.out.printf("fixture=%s\n", fixture);
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
	
	@Test
	public void The_elements_of_the_template_are_converted_to_ObjectClass() {
		Template template = metamodel.getTemplateForDiagram(diagramModel);
		int ocsize = template.getObjectClasses().size();
		assertTemplateHaveObjectClassFor(template, "ea94cf6c");
		assertTemplateHaveObjectClassFor(template, "c3d03626");
		assertEquals(ocsize,template.getObjectClasses().size());
	}
		private void assertTemplateHaveObjectClassFor(Template template,
				String elementID) {
			IZentaElement element = testdata.getElementById(elementID);
			assertNotNull(template.getObjectClassReferencingElement(element));
		}
	
	@Test
	public void There_is_only_one_ObjectClass_for_an_element_occuring_more_times_in_a_template() {
		String id = "e13c9626";
		IZentaDiagramModel getDiagramModelById = testdata.getZDiagramModelById(id);
		IZentaDiagramModel dm = getDiagramModelById;
		Template template = metamodel.getTemplateFor(dm);
		String id2 = "8495ea84";
		IZentaElement element = testdata.getElementById(id2);
		int numOccurs = 0;
		for(ObjectClass oc:template.getObjectClasses())
			if(element.equals(oc.getReference()))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void If_a_new_element_added_to_a_template__an_ObjectClass_will_be_created_for_it() {
		String id = "a885cd76";
		IZentaElement elementToAdd = testdata.getElementById(id);
		addElementToDiagramModel(diagramModel,elementToAdd);
		assertTrue(metamodel.hasObjectClassReferencing(elementToAdd));
	}
	
	@Test
	public void If_a_new_element_added_to_a_non_template__an_ObjectClass_will_not_be_created_for_it() {
		String id = "a885cd76";
		IZentaElement elementToAdd = testdata.getElementById(id);
		String id2 = "63f1b081";
		IZentaDiagramModel dm = testdata.getZDiagramModelById(id2);
		addElementToDiagramModel(dm,elementToAdd);
		assertNotNull(elementToAdd);
		assertFalse(metamodel.hasObjectClassReferencing(elementToAdd));
	}

	@Test
	public void A_defining_object_for_an_ObjectClass_becomes_of_that_ObjectClass() {
		IZentaElement element = testdata.getElementById("ea94cf6c");
		assertEquals("ea94cf6c",element.getObjectClass());
	}

	@Test
	public void An_unnamed_element_does_not_define_an_ObjectClass() {
		IZentaElement element = testdata.getElementById("e79192be");
		assertNotNull(element);
		assertFalse(metamodel.hasObjectClassReferencing(element));
	}

	@Test
	public void An_ObjectClass_is_unnamed_if_the_defining_element_have_an_empty_className_property() {
		IZentaElement element = testdata.getElementById("252d482c");
		assertNotNull(element);
		assertFalse(metamodel.hasObjectClassReferencing(element));		
	}
	
	@Test
	public void The_name_of_an_ObjectClass_is_the_name_of_the_defining_element_if_it_does_not_have_a_className_property() {
		IZentaElement element = testdata.getElementById("ea94cf6c");
		assertEquals("User",getObjectClassReferencing(element).getName());
	}

	@Test
	public void The_name_of_an_ObjectClass_is_the_name_of_the_className_property_of_the_defining_element_if_it_has_one() {
		IZentaElement element = testdata.getElementById("8495ea84");
		assertEquals("NotActuallyDocumentation",getObjectClassReferencing(element).getName());
	}
	
	@Test
	public void When_the_model_is_loaded_the_diagram_elements_are_converted_according_to_the_defining_element() {
		checkUserElement();
		checkDataElement();
	}
		private void checkUserElement() {
			IZentaElement userObject = testdata.getElementById("ea94cf6c");
			IDiagramModelObject diagObject1 = testdata.getDMOById("b2608459");
			IDiagramModelObject diagObject2 = testdata.getDMOById("9404b9cd");
			
			assertEquals("ellipseShape",diagObject1.getElementShape());
			assertEquals("1|Arial Black|11.0|1|GTK|1|",diagObject1.getFont());
			assertEquals("#ffffff",diagObject1.getFontColor());
			assertEquals(4,diagObject1.getTextAlignment());
			assertEquals("#ffa500",diagObject1.getFillColor());
			
			assertEquals("ellipseShape",diagObject2.getElementShape());
			assertEquals("1|Arial Black|11.0|1|GTK|1|",diagObject2.getFont());
			assertEquals("#ffffff",diagObject2.getFontColor());
			assertEquals(4,diagObject2.getTextAlignment());
			assertEquals("#ffa500",diagObject2.getFillColor());
			
			ModelTestData.assertOnePropertyWithNameAndValue(userObject, "elementShape", "ellipseShape");
			ModelTestData.assertOnePropertyWithNameAndValue(userObject, "font", "1|Arial Black|11.0|1|GTK|1|");
			ModelTestData.assertOnePropertyWithNameAndValue(userObject, "fontColor", "#ffffff");
			ModelTestData.assertOnePropertyWithNameAndValue(userObject, "textAlignment", "4");
			ModelTestData.assertOnePropertyWithNameAndValue(userObject, "fillColor", "#ffa500");
		}
		private void checkDataElement() {
			IZentaElement userObject = testdata.getElementById("23138a61");
			IDiagramModelObject diagObject1 = testdata.getDMOById("99b3ed89");
			IDiagramModelObject diagObject2 = testdata.getDMOById("843322b7");
			assertEquals("emptyShape",diagObject1.getElementShape());
			assertEquals("emptyShape",diagObject2.getElementShape());
			ModelTestData.assertOnePropertyWithNameAndValue(userObject, "elementShape", "emptyShape");
		}
		private void ensureVirginDMOsForLoadTest() {
			IDiagramModelObject diagObject1 = testdata.getDMOById("b2608459");
			IDiagramModelObject diagObject2 = testdata.getDMOById("9404b9cd");
			
			ModelTestData.assertNotEquals("ellipseShape",diagObject2.getElementShape());
			ModelTestData.assertNotEquals("1|Arial Black|11.0|1|GTK|1|",diagObject2.getFont());
			ModelTestData.assertNotEquals("#ffffff",diagObject2.getFontColor());
			ModelTestData.assertNotEquals(4,diagObject2.getTextAlignment());
			ModelTestData.assertNotEquals("#ffa500",diagObject2.getFillColor());

			ModelTestData.assertNotEquals("ellipseShape",diagObject1.getElementShape());
			ModelTestData.assertNotEquals("1|Arial Black|11.0|1|GTK|1|",diagObject1.getFont());
			ModelTestData.assertNotEquals("#ffffff",diagObject1.getFontColor());
			ModelTestData.assertNotEquals(4,diagObject1.getTextAlignment());
			ModelTestData.assertNotEquals("#ffa500",diagObject1.getFillColor());
		}

	@Test
	public void When_the_ObjectClass_of_an_element_is_changed_the_corresponding_diagram_elements_are_updated() {
		IZentaElement element = testdata.getElementById("85b00ede");
		IDiagramModelObject dmo = testdata.getDMOById("be229c75");

		ModelTestData.assertNotEquals("ellipseShape",dmo.getElementShape());
		ModelTestData.assertNotEquals("1|Arial Black|11.0|1|GTK|1|",dmo.getFont());
		ModelTestData.assertNotEquals("#ffffff",dmo.getFontColor());
		ModelTestData.assertNotEquals(4,dmo.getTextAlignment());
		ModelTestData.assertNotEquals("#ffa500",dmo.getFillColor());

		element.setObjectClass("ea94cf6c");

		assertEquals("ellipseShape",dmo.getElementShape());
		assertEquals("1|Arial Black|11.0|1|GTK|1|",dmo.getFont());
		assertEquals("#ffffff",dmo.getFontColor());
		assertEquals(4,dmo.getTextAlignment());
		assertEquals("#ffa500",dmo.getFillColor());
	}
	
	private ObjectClass getObjectClassReferencing(IZentaElement element) {
		return metamodel.getObjectClassReferencing(element);
	}

	private ObjectClass createTestObjectClass() {
		ModelTestData testdata = new ModelTestData();
		IZentaModel model = testdata.getModel();

		IZentaElement element = (IZentaElement) ZentaModelUtils.getObjectByID(model, "ea94cf6c");
		return MetamodelFactory.eINSTANCE
				.createObjectClass(
						element,
						metamodel.getTemplates().get(0));
	}

	private void addElementToDiagramModel(IZentaDiagramModel dm,
			IZentaElement elementToAdd) {
		IDiagramModelZentaObject mo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		mo.setZentaElement(elementToAdd);
		AddDiagramObjectCommand cmd = new AddDiagramObjectCommand(dm, mo);
		cmd.execute();
	}	
}
