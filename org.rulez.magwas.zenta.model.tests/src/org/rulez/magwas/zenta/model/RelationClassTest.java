package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;

public class RelationClassTest {

	protected IBasicRelationship fixture = null;

	private IMetamodel metamodel;

	private ModelTestData testdata;

	
	@Before
	public void setUp() throws Exception {
		testdata = new ModelTestData();
		ensureVirginDMRsForLoadTest(testdata);

		metamodel = IZentaFactory.eINSTANCE.getMetamodelFor(testdata.getModel());
		fixture = metamodel.getBuiltinRelationClass();
	}

	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}

	@Test
	public void have_children() {
		EList<IBasicObject> kids = fixture.getChildren();
		assertEquals(6,kids.size());
	}

	@Test
	public void have_name() {
		assertEquals("Basic Relation",fixture.getName());
	}
	
	@Test
	public void The_relations_of_the_template_are_converted_to_RelationClass() {
		ITemplate template = metamodel.getTemplateFor(testdata.getTemplateDiagramModel());
		int ocsize = template.getRelationClasses().size();
		assertTemplateHaveRelationClassFor(template, "a972e26e");
		assertTemplateHaveRelationClassFor(template, "3da94729");
		assertEquals(ocsize,template.getRelationClasses().size());
	}
	@Test
	public void Even_where_source_is_nondefining() {
		ITemplate template = metamodel.getTemplateFor(testdata.getZDiagramModelById("e13c9626"));
		int ocsize = template.getRelationClasses().size();
		assertTemplateHaveRelationClassFor(template, "9c441eb7");
		assertEquals(ocsize,template.getRelationClasses().size());
	}

	@Test
	public void There_is_only_one_relationClass_for_a_connection_occuring_more_times_in_a_template() {
		String id = "e13c9626";
		IZentaDiagramModel dm = testdata.getZDiagramModelById(id);
		ITemplate template = metamodel.getTemplateFor(dm);
		String id2 = "9c441eb7";
		IBasicRelationship element = testdata.getRelationByID(id2);
		int numOccurs = 0;
		for(IBasicRelationship oc:template.getRelationClasses())
			if(element.equals(oc))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void If_a_new_connection_added_to_a_template__a_RelationClass_will_be_created_for_it() {
		IBasicRelationship modelRelation = createRelationClass();
		assertTrue(modelRelation.isTemplate());
	}

	@Test
	public void The_parent_relationclass_is_the_relationclass_of_the_defining_element() {
		IBasicRelationship parentRc = (IBasicRelationship) metamodel.getClassById("9c441eb7");
		IBasicRelationship modelRelation = createRelationClass(parentRc,"test relation");
		assertTrue(modelRelation.isTemplate());
		IBasicRelationship parentOc = (IBasicRelationship) modelRelation.getAncestor();
		IBasicRelationship parentOc2 = (IBasicRelationship) modelRelation.getDefiningElement();
		assertEquals(parentRc,parentOc);
		assertEquals(modelRelation,parentOc2);
	}

	@Test
	public void A_defining_relation_for_a_RelationClass_belongs_to_its_parents_RelationClass_which_is_BasicRelation_by_default() {
		String id = "9c441eb7";
		IBasicRelationship element = testdata.getRelationByID(id);
		assertEquals("basicrelation",element.getAncestor().getId());
		assertEquals("Basic Relation",element.getAncestor().getName());
	}

	@Test
	public void An_unnamed_relation_does_not_define_a_RelationClass() {
		IBasicRelationship element = testdata.getRelationByID("44041ead");
		assertNotNull(element);
		assertFalse(element.isTemplate());
	}

	@Test
	public void A_RelationClass_is_unnamed_if_the_defining_element_have_an_empty_className_property() {
		IBasicRelationship element = testdata.getRelationByID("2fb235de");
		assertNotNull(element);
		assertFalse(element.isTemplate());
	}
	
	@Test
	public void The_name_of_a_RelationClass_is_the_name_of_the_defining_element_if_it_does_not_have_a_className_property() {
		IBasicRelationship element = testdata.getRelationByID("9c441eb7");
		assertEquals("describes",element.getDefiningName());
	}

	@Test
	public void The_name_of_a_RelationClass_is_the_name_of_the_className_property_of_the_defining_element_if_it_has_one() {
		IBasicRelationship element = testdata.getRelationByID("b0e2bfd8");
		assertEquals("TriesToDo",element.getDefiningName());
	}

	@Test
	public void When_the_model_is_loaded_the_diagram_relations_are_not_converted_according_to_the_defining_relation() {
		ModelTestData testdata = new ModelTestData();
		IBasicRelationship relation = testdata.getRelationByID("9c441eb7");
		
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "font", "1|Andika|10.0|3|GTK|1|");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "fontColor", "#ff0000");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "textPosition", "0");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "lineWidth", "2");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "lineColor", "#0000ff");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "lineDecoration", "DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration");
		
		ensureVirginDMRsForLoadTest(testdata);
		IZentaFactory.eINSTANCE.getMetamodelFor(testdata.getModel());
		ensureVirginDMRsForLoadTest(testdata);
		ensureCorrectFinalAttributes(testdata);

	}
		private void ensureCorrectFinalAttributes(ModelTestData testdata) {
			IDiagramModelZentaConnection conn1 = testdata.getDMRById("9dc4d23a");
			IDiagramModelZentaConnection conn2 = testdata.getDMRById("dcb9c1a2");
			assertEquals("1|Andika|10.0|3|GTK|1|",conn1.getFinalFont());
			assertEquals("#ff0000",conn1.getFinalFontColor());
			assertEquals(0,conn1.getFinalTextPosition());
			assertEquals(2,conn1.getFinalLineWidth());
			assertEquals("#0000ff",conn1.getFinalLineColor());
			assertEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration",conn1.getFinalLineDecoration());
	
			assertEquals("1|Andika|10.0|3|GTK|1|",conn2.getFinalFont());
			assertEquals("#ff0000",conn2.getFinalFontColor());
			assertEquals(0,conn2.getFinalTextPosition());
			assertEquals(2,conn2.getFinalLineWidth());
			assertEquals("#0000ff",conn2.getFinalLineColor());
			assertEquals("",conn2.getFinalLineDecoration());//dmo local
		}
		private void ensureVirginDMRsForLoadTest(ModelTestData testdata) {
			IDiagramModelZentaConnection conn1 = testdata.getDMRById("9dc4d23a");
			IDiagramModelZentaConnection conn2 = testdata.getDMRById("dcb9c1a2");
			
			ModelTestData.assertNotEquals("1|Andika|10.0|3|GTK|1|",conn1.getFont());
			ModelTestData.assertNotEquals("#ff0000",conn1.getFontColor());
			ModelTestData.assertNotEquals(0,conn1.getTextPosition());
			ModelTestData.assertNotEquals(2,conn1.getLineWidth());
			ModelTestData.assertNotEquals("#0000ff",conn1.getLineColor());
			ModelTestData.assertNotEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration",conn1.getLineDecoration());
	
			ModelTestData.assertNotEquals("1|Andika|10.0|3|GTK|1|",conn2.getFont());
			ModelTestData.assertNotEquals("#ff0000",conn2.getFontColor());
			ModelTestData.assertNotEquals(0,conn2.getTextPosition());
			ModelTestData.assertNotEquals(2,conn2.getLineWidth());
			ModelTestData.assertNotEquals("#0000ff",conn2.getLineColor());
			ModelTestData.assertNotEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration",conn2.getLineDecoration());
		}

	@Test
	public void When_the_ObjectClass_of_an_element_is_changed_the_corresponding_diagram_elements_are_not_updated() {
		IBasicRelationship element = testdata.getRelationByID("8aeb2efb");
		IBasicRelationship parent = testdata.getRelationByID("9c441eb7");
		IDiagramModelZentaConnection conn1 = testdata.getDMRById("2454f71b");

		ModelTestData.assertNotEquals("1|Andika|10.0|3|GTK|1|",conn1.getFont());
		ModelTestData.assertNotEquals("#ff0000",conn1.getFontColor());
		ModelTestData.assertNotEquals(0,conn1.getTextPosition());
		ModelTestData.assertNotEquals(2,conn1.getLineWidth());
		ModelTestData.assertNotEquals("#0000ff",conn1.getLineColor());
		ModelTestData.assertNotEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration",conn1.getLineDecoration());

		element.setAncestor(parent);
		
		ModelTestData.assertNotEquals("1|Andika|10.0|3|GTK|1|",conn1.getFont());
		ModelTestData.assertNotEquals("#ff0000",conn1.getFontColor());
		ModelTestData.assertNotEquals(0,conn1.getTextPosition());
		ModelTestData.assertNotEquals(2,conn1.getLineWidth());
		ModelTestData.assertNotEquals("#0000ff",conn1.getLineColor());
		ModelTestData.assertNotEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration",conn1.getLineDecoration());

	}
	
	@Test
	public void When_the_appearance_of_a_diagram_connection_linked_to_a_defining_relationship_is_changed_the_aooearance_properties_of_the_defining_relationship_are_updated() {
		IBasicRelationship userObject = testdata.getRelationByID("9c441eb7");
		IDiagramModelZentaConnection dmr = testdata.getDMRById("9dc4d23a");
		dmr.setFont("1|Arial Black|10.0|1|GTK|1|");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "font", "1|Arial Black|10.0|1|GTK|1|");
		dmr.setFontColor("#0f0f0f");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "fontColor", "#0f0f0f");
		dmr.setLineColor("#0f0f0f");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "lineColor", "#0f0f0f");
		dmr.setLineDecoration("DiamondSourceDecoration BigArrowTargetDecoration");
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "lineDecoration", "DiamondSourceDecoration BigArrowTargetDecoration");
		dmr.setLineWidth(3);
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "lineWidth", "3");
		dmr.setTextAlignment(2);
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "textAlignment", "2");
		dmr.setTextPosition(4);
		ModelTestData.assertOnePropertyWithNameAndValue(userObject, "textPosition", "4");
	}

	@Test
	public void When_a_defining_diagram_object_is_deleted_the_corresponding_objectclass_is_also_deleted() {
		IBasicRelationship element = createRelationClass();
		assertTrue(element.isTemplate());
		IDiagramModelZentaConnection diagElement = element.getDiagConnections().get(0);
		IDiagramModelZentaObject dia = (IDiagramModelZentaObject) diagElement.eContainer();
		EList<IDiagramModelConnection> sourceConnections = dia.getSourceConnections();
		sourceConnections.remove(diagElement);
		assertFalse(element.isTemplate());
	}
	
	@Test()
	public void When_a_defining_element_is_deleted_the_corresponding_objectclass_is_also_deleted() {
		IBasicRelationship element = createRelationClass();
		String elemId = element.getId();
		IDiagramModelZentaConnection dmo = element.getDiagConnections().get(0);
		assertNotNull(dmo);
		IBasicObject oc = metamodel.getClassById(elemId);
		assertNotNull(oc);
		element.delete();
		boolean thrown = false;
		try {
			metamodel.getClassById(elemId);
		} catch (NoSuchElementException e) {
			thrown = true;
		}
		assertTrue(thrown);
			
	}
	
	@Test
	public void A_defining_connection_in_more_templates_defines_one_RelationClass() {
		List<IBasicRelationship> classes = metamodel.getRelationClasses();
		int count = 0;
		for(IBasicRelationship rc : classes) {
			String name = rc.getDefiningName();
			if(name.equals("TriesToDo"))
				count++;
		}
		assertEquals(1,count);
	}

	private void assertTemplateHaveRelationClassFor(ITemplate template,
			String elementID) {
		IBasicRelationship element = testdata.getRelationByID(elementID);
		assertTrue(template == element.getTemplate());
	}

	private IBasicRelationship createRelationClass(IBasicRelationship parentClass, String name) {
		IFolder folder = (IFolder) parentClass.eContainer();
		IDiagramModelZentaObject diagramElement1 = (IDiagramModelZentaObject) testdata.getDMOById("b2608459");//User
		IDiagramModelZentaObject diagramElement2 = (IDiagramModelZentaObject) testdata.getDMOById("88f40127");//Procedure
		IBasicRelationship modelRelation = ZentaModelUtils.createChildRelation(
				parentClass, folder, name, 
				diagramElement1.getZentaElement(),
				diagramElement2.getZentaElement());
		return createRelationClass(modelRelation, diagramElement1,
				diagramElement2);
	}
	private IBasicRelationship createRelationClass() {
		IBasicRelationship modelRelation= testdata.getRelationByID("9a97ee2f");
		IDiagramModelObject diagramElement1 = testdata.getDMOById("b2608459");//User
		IDiagramModelObject diagramElement2 = testdata.getDMOById("f843c2f1");//ProcessStep
		return createRelationClass(modelRelation, diagramElement1,
				diagramElement2);
	}
		private IBasicRelationship createRelationClass(IBasicRelationship modelRelation,
				IDiagramModelObject diagramSource, IDiagramModelObject diagramTarget) {
			assertNotNull(modelRelation);
			assertFalse(modelRelation.isTemplate());
			IDiagramModelZentaConnection diagramRelation =
					IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
			diagramRelation.setSource(diagramSource);
			diagramRelation.setTarget(diagramTarget);
			diagramRelation.setRelationship(modelRelation);
			diagramSource.addConnection(diagramRelation);
			return modelRelation;
		}
	@Test
	public void Basic_Relation_have_hint() {
		IBasicRelationship oc = metamodel.getBuiltinRelationClass();
		assertNotNull(oc.getHelpHintTitle());
		assertNotNull(oc.getHelpHintContent());
	}

} 