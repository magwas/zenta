package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.Attribute;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;

public class ObjectClassTest{

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	protected IBasicObject fixture;
	private ModelAndMetaModelTestData testdata;
	private IZentaModel model;
	private IZentaDiagramModel diagramModel;

	@Before
	public void setUp() throws Exception {
		testdata = new ModelAndMetaModelTestData();
		model = testdata.getModel();
		diagramModel = testdata.getTemplateDiagramModel();
		fixture = testdata.metamodel.getBuiltinObjectClass();
	}

	@After
	public void tearDown() throws Exception {
		this.fixture = null;
		testdata.getFile().delete();
	}

	@Test
	public void Builtin_ObjectClass_is_named_Basic_Object() {
		assertEquals("Basic Object",fixture.getName());
	}

	
	@Test
	public void The_ancestor_cannot_be_set_for_the_Builtin_ObjectClass() {
		exception.expect(IZentaFactory.BuiltinClassShouldNotHaveAncestor.class);
		fixture.setAncestor(fixture);
	}
	
	
	@Test
	public void if_an_ObjectClass_is_set_as_ancestor_then_the_number_of_its_kids_grows() {
		EList<IBasicObject> kids = fixture.getChildren();
		int n = kids.size();
		IBasicObject obj2 = testdata.createNewObjectClass("foobar");
		obj2.setAncestor(fixture);
		kids = fixture.getChildren();
		assertEquals(n+1,kids.size());
	}

	@Test
	public void null_cannot_be_set_as_ancestor() {
		exception.expect(ModelConsistencyException.class);
		IBasicObject obj2 = testdata.createNewObjectClass("foobar");
		obj2.setAncestor(null);
	}

	@Test
	public void ObjectClass_can_be_created_using_a_zenta_object() {
		testdata.getTestObjectClass();
	}
	
	
	@Test
	public void The_elements_of_the_template_are_converted_to_ObjectClass() {
		ITemplate template = testdata.metamodel.getTemplateFor(diagramModel);
		int ocsize = template.getObjectClasses().size();
		assertTemplateHaveObjectClassFor(template, "ea94cf6c");
		assertTemplateHaveObjectClassFor(template, "c3d03626");
		assertEquals(ocsize,template.getObjectClasses().size());
	}
		private void assertTemplateHaveObjectClassFor(ITemplate template,
				String elementID) {
			IBasicObject element = (IBasicObject) testdata.getElementById(elementID);
			assertTrue(element.isTemplate());
		}
	
	@Test
	public void There_is_only_one_ObjectClass_for_an_element_occuring_more_times_in_a_template() {
		String id = "e13c9626";
		 IZentaDiagramModel dm = testdata.getZDiagramModelById(id);
		ITemplate template = testdata.metamodel.getTemplateFor(dm);
		String id2 = "8495ea84";
		IZentaElement element = testdata.getElementById(id2);
		int numOccurs = 0;
		for(IBasicObject oc:template.getObjectClasses())
			if(element.equals(oc))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void If_a_new_element_added_to_a_template__an_ObjectClass_will_be_created_for_it() {
		String id = "a885cd76";
		IBasicObject elementToAdd = (IBasicObject) testdata.getElementById(id);
		assertFalse(elementToAdd.isTemplate());
		addElementToDiagramModel(Util.verifyNonNull(diagramModel),elementToAdd);
		assertTrue(elementToAdd.isTemplate());
	}
	
	@Test
	public void If_a_new_element_added_to_a_non_template__an_ObjectClass_will_not_be_created_for_it() {
		String id = "a885cd76";
		IBasicObject elementToAdd = (IBasicObject) testdata.getElementById(id);
		assertNotNull(elementToAdd);
		String id2 = "63f1b081";
		IZentaDiagramModel dm = testdata.getZDiagramModelById(id2);
		assertFalse(elementToAdd.isTemplate());
		addElementToDiagramModel(dm,elementToAdd);
		assertFalse(elementToAdd.isTemplate());
	}

	@Test
	public void A_defining_object_for_an_ObjectClass_belongs_to_its_parents_ObjectClass_which_is_BasicObject_by_default() {
		IBasicObject element = (IBasicObject) testdata.getElementById("ea94cf6c");
		assertEquals("basicobject",element.getAncestor().getId());
	}
	
    @Test
    public void A_defining_object_for_an_ObjectClass_belongs_to_its_parents_ObjectClass() {
        String id = "ea94cf6c";//User
        IBasicObject user = (IBasicObject) testdata.getElementById(id);
        IFolder folder = ModelAndMetaModelTestData.getFolderByKid(user);
        IBasicObject newElement = (IBasicObject) user.create(folder);
        IDiagramModel dm = testdata.getTemplateDiagramModel();
        IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
        
        dm.getChildren().add(dmo);
        newElement.setName("ChildOfUser");
        assertEquals(user,newElement.getAncestor());
    }

	@Test
	public void An_unnamed_element_does_not_define_an_ObjectClass() {
		IBasicObject element = (IBasicObject) testdata.getElementById("e79192be");
		assertNotNull(element);
		assertFalse(element.isTemplate());
	}

	@Test
	public void An_empty_className_property_does_not_define_an_ObjectClass() {
		IBasicObject element = (IBasicObject) testdata.getElementById("252d482c");
		assertNotNull(element);
		assertFalse(element.isTemplate());		
	}
	
	@Test
	public void The_name_of_an_ObjectClass_is_the_name_of_the_defining_element_if_it_does_not_have_a_className_property() {
		IBasicObject element = (IBasicObject) testdata.getElementById("ea94cf6c");
		assertEquals("User",element.getDefiningName());
	}

	@Test
	public void The_name_of_an_ObjectClass_is_the_name_of_the_className_property_of_the_defining_element_if_it_has_one() {
		IBasicObject element = (IBasicObject) testdata.getElementById("8495ea84");
		assertEquals("NotActuallyDocumentation",element.getDefiningName());
	}
	
	@Test
	public void When_the_model_is_loaded_the_diagram_elements_are_not_converted_according_to_the_defining_element() {
		ModelTestData data = new ModelTestData();
		ensureVirginDMOsForLoadTest(data);
		IZentaFactory.eINSTANCE.getMetamodelFor(Util.verifyNonNull(data.model));
		ensureVirginDMOsForLoadTest(data);
		ensureCorrectFinalAttributes(data);
	}
		private void ensureCorrectFinalAttributes(ModelTestData data) {
			IDiagramModelZentaObject diagObject1 = (IDiagramModelZentaObject) data.getDMOById("b2608459");
			IDiagramModelZentaObject diagObject2 = (IDiagramModelZentaObject) data.getDMOById("9404b9cd");
	
			assertEquals("ellipseShape",diagObject2.getFinalElementShape());
			assertEquals("1|Arial Black|11.0|1|GTK|1|",diagObject2.getFinalFont());
			assertEquals("#ffffff",diagObject2.getFinalFontColor());
			assertEquals(2,diagObject2.getFinalTextAlignment());
			assertEquals("#ffa500",diagObject2.getFinalFillColor());
	
			assertEquals("ellipseShape",diagObject1.getFinalElementShape());
			assertEquals("1|Arial Black|11.0|1|GTK|1|",diagObject1.getFinalFont());
			assertEquals("#ffffff",diagObject1.getFinalFontColor());
			assertEquals(2,diagObject1.getFinalTextAlignment());
			assertEquals("#ffa500",diagObject1.getFinalFillColor());
		}
		private void ensureVirginDMOsForLoadTest(ModelTestData data) {
			IDiagramModelZentaObject diagObject1 = (IDiagramModelZentaObject) data.getDMOById("b2608459");
			IDiagramModelZentaObject diagObject2 = (IDiagramModelZentaObject) data.getDMOById("9404b9cd");
			
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
	public void When_the_ObjectClass_of_an_element_is_changed_the_corresponding_diagram_elements_are_not_updated() {
		IBasicObject element = (IBasicObject) testdata.getElementById("85b00ede");
		IBasicObject parent = (IBasicObject) testdata.getElementById("ea94cf6c");
		IDiagramModelObject dmo = testdata.getDMOById("be229c75");

		ModelTestData.assertNotEquals("ellipseShape",dmo.getElementShape());
		ModelTestData.assertNotEquals("1|Arial Black|11.0|1|GTK|1|",dmo.getFont());
		ModelTestData.assertNotEquals("#ffffff",dmo.getFontColor());
		ModelTestData.assertNotEquals(4,dmo.getTextAlignment());
		ModelTestData.assertNotEquals("#ffa500",dmo.getFillColor());

		element.setAncestor(Util.verifyNonNull(parent));

		ModelTestData.assertNotEquals("ellipseShape",dmo.getElementShape());
		ModelTestData.assertNotEquals("1|Arial Black|11.0|1|GTK|1|",dmo.getFont());
		ModelTestData.assertNotEquals("#ffffff",dmo.getFontColor());
		ModelTestData.assertNotEquals(4,dmo.getTextAlignment());
		ModelTestData.assertNotEquals("#ffa500",dmo.getFillColor());
	}

	@Test
	public void When_the_appearance_of_a_diagram_element_linked_to_a_defining_element_is_changed_the_aooearance_properties_of_the_defining_element_are_updated() {
		IZentaElement userObject = testdata.getElementById("ea94cf6c");
		IDiagramModelObject dmo = testdata.getDMOById("b2608459");
		assertFalse("rectangleShape".equals(dmo.getElementShape()));
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "elementShape", "ellipseShape");
		dmo.setElementShape("rectangleShape");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "elementShape", "rectangleShape");
		dmo.setFillColor("#fafafa");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "fillColor", "#fafafa");
		dmo.setFont("1|Arial Black|10.0|1|GTK|1|");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "font", "1|Arial Black|10.0|1|GTK|1|");
		dmo.setFontColor("#0f0f0f");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "fontColor", "#0f0f0f");
		dmo.setTextAlignment(1);
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "textAlignment", "1");
		dmo.setTextPosition(2);
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "textPosition", "2");
	}

	@Test
	public void The_objectclass_of_a_created_element_is_set_propertly() {
		String id = "ea94cf6c";
		IBasicObject user = (IBasicObject) testdata.getElementById(id);
		IFolder folder = ModelTestData.getFolderByKid(user);
		IBasicObject newelement = user.create(folder);
		assertEquals(user,newelement.getDefiningElement());
		IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		dmo.setZentaElement(newelement);
		dmo.setBounds(0, 0, 100, 100);
		IDiagramModel dm = testdata.getTemplateDiagramModel();
		dm.getChildren().add(dmo);
		assertNotNull(dmo);
		ModelTestData.assertNotEquals("ellipseShape",dmo.getElementShape());
		ModelTestData.assertNotEquals("1|Arial Black|11.0|1|GTK|1|",dmo.getFont());
		ModelTestData.assertNotEquals("#ffffff",dmo.getFontColor());
		ModelTestData.assertNotEquals(4,dmo.getTextAlignment());
		ModelTestData.assertNotEquals("#ffa500",dmo.getFillColor());
	}

	@Test
    public void An_ObjectClass_created_if_a_element_named_and_dropped_on_a_template() {
		IBasicObject newElement = testdata.createClassedTestElement();
		IDiagramModel dm = testdata.getTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
		assertNotNull(dmo);
		assertEquals(dmo.getZentaElement(),newElement);
		newElement.setName("New test OC");
		dm.getChildren().add(dmo);

		assertTrue(newElement.isTemplate());
		ModelTestData.assertOnePropertyWithNameAndValue(newElement, "elementShape", "emptyShape");    	
    }

	@Test
	public void An_ObjectClass_created_if_an_element_dropped_on_a_template_and_named() {
		String elementName = "New test OC";
		IBasicObject newElement = testdata.createNewObjectClass(elementName);
		assertTrue(newElement.isTemplate());
		ModelTestData.assertOnePropertyWithNameAndValue(newElement, "elementShape", "emptyShape");
	}

	@Test
	public void The_parent_objectclass_is_the_objectclass_of_the_defining_element() {
		String elementName = "ParentedOc";
		IBasicObject userClass = (IBasicObject) testdata.metamodel.getClassById("ea94cf6c");
		IBasicObject newElement = testdata.createNewObjectClass(elementName, userClass);
		
		assertEquals(userClass,newElement.getAncestor());
		assertEquals(newElement,newElement.getDefiningElement());
	}

	@Test
	public void An_ObjectClass_is_created_if_a_diagram_containing_it_becomes_template() {
		String elementName = "New test OC 3";
		IBasicObject newElement = testdata.createClassedTestElement();
		newElement.setName(elementName);
		IDiagramModel dm = IZentaFactory.eINSTANCE.createZentaDiagramModel();
		IFolder folder = model.getFolders().get(0);
		folder.getElements().add(dm);
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
		dm.getChildren().add(dmo);
		IProperty prop = IZentaFactory.eINSTANCE.createProperty();
		assertFalse(newElement.isTemplate());
		prop.setKey("Template");
		dm.getProperties().add(prop);
		assertTrue(newElement.isTemplate());
		ModelTestData.assertOnePropertyWithNameAndValue(newElement, "elementShape", "emptyShape");
	}

	@Test
	public void An_ObjectClass_is_created_if_a_diagram_containing_it_becomes_template_slowly() {
		IBasicObject newElement = testdata.createClassedTestElement();
		newElement.setName("New test OC 3");
		IDiagramModel dm = IZentaFactory.eINSTANCE.createZentaDiagramModel();
		IFolder folder = model.getFolders().get(0);
		folder.getElements().add(dm);
		IDiagramModelZentaObject dmo = ModelTestData.createDMOFor(newElement);
		dm.getChildren().add(dmo);
		IProperty prop = IZentaFactory.eINSTANCE.createProperty();
		dm.getProperties().add(prop);
		assertFalse(newElement.isTemplate());
		prop.setKey("Template");
		assertTrue(newElement.isTemplate());
		ModelTestData.assertOnePropertyWithNameAndValue(newElement, "elementShape", "emptyShape");
	}

	@Test
	public void An_ObjectClass_can_be_found_by_the_id_of_the_defining_element() {
		assertEquals("User",testdata.metamodel.getClassById("ea94cf6c").getName());
	}
	private static void addElementToDiagramModel(IZentaDiagramModel dm,
			IZentaElement elementToAdd) {
		IDiagramModelZentaObject mo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		mo.setZentaElement(elementToAdd);
        dm.getChildren().add(mo);
	}
	@Test
	public void When_a_defining_diagram_object_is_deleted_the_corresponding_objectclass_is_also_deleted() {
		IBasicObject element = testdata.createNewObjectClass("deletetest OC");
		assertTrue(element.isTemplate());
		IDiagramModelZentaObject diagElement = (IDiagramModelZentaObject) element.getDiagComponents().get(0);
		IDiagramModelContainer dia = (IDiagramModelContainer) diagElement.eContainer();
		dia.getChildren().remove(diagElement);
		assertFalse(element.isTemplate());
	}
	
	@Test
	public void When_a_defining_element_is_deleted_the_corresponding_objectclass_is_also_deleted() {
		IZentaElement element = testdata.createNewObjectClass("deletetest OC");
		String elemId = element.getId();
		IDiagramModelZentaObject dmo = (IDiagramModelZentaObject) element.getDiagComponents().get(0);
		assertNotNull(dmo);
		IBasicObject oc = testdata.metamodel.getClassById(elemId);
		assertNotNull(oc);
		element.delete();
		assertNull(dmo.eContainer());
		exception.expect(NoSuchElementException.class);
		testdata.metamodel.getClassById(elemId);
	}
	
	@Test
	public void A_defining_element_appearing_in_two_templates_results_only_one_objectClass() {
	    List<IBasicObject> oclist = testdata.metamodel.getObjectClasses();
	    int count = 0;
	    for(IBasicObject oc : oclist)
	        if(oc.getName().equals("Procedure"))
	            count++;
	    assertEquals(1,count);
	}
	
	@Test
	public void Basic_object_have_hint() {
		IBasicObject oc = testdata.metamodel.getBuiltinObjectClass();
		assertNotNull(oc.getHelpHintTitle());
		assertNotNull(oc.getHelpHintContent());
	}
	
	@Test
	public void an_inconsistent_attribute_cannot_be_added_to_element() throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		IBasicObject element = testdata.createNewObjectClass("attributetest OC");
		IAttribute att = testdata.createTestAttribute();
		Field field = Attribute.class.getDeclaredField("direction");
		field.setAccessible(true);
		field.set(att, null);
		EList<IAttribute> attributes = element.getAttributes();
		exception.expect(ModelConsistencyException.class);
		attributes.add(att);
	}

}
