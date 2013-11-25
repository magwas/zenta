package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.util.MetamodelBuilder;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;

public class RelationClassTest {

	protected RelationClass fixture = null;

	private Metamodel metamodel;

	private IZentaModel model;

	private ModelTestData testdata;

	@Before
	public void setUp() throws Exception {
		testdata = new ModelTestData();
		model = testdata.getModel();
		MetamodelBuilder builder = new MetamodelBuilder(model);

		metamodel = builder.getMetamodel();
		fixture = metamodel.getBuiltinRelationClass();
	}

	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}

	@Test
	public void testGetChildren() {
		EList<RelationClass> kids = fixture.getChildren();
		assertEquals(0,kids.size());
	}

	@Test
	public void testGetName() {
		assertEquals("Basic Relation",fixture.getName());
	}
	
	@Test
	public void The_relations_of_the_template_are_converted_to_RelationClass() {
		Template template = metamodel.getTemplateForDiagram(testdata.getTestDiagramModel());
		int ocsize = template.getRelationClasses().size();
		assertTemplateHaveRelationClassFor(template, "a972e26e");
		assertTemplateHaveRelationClassFor(template, "3da94729");
		assertEquals(ocsize,template.getRelationClasses().size());
	}
	@Test
	public void Even_where_source_is_nondefining() {
		Template template = metamodel.getTemplateForDiagram(testdata.getZDiagramModelById("e13c9626"));
		int ocsize = template.getRelationClasses().size();
		assertTemplateHaveRelationClassFor(template, "9c441eb7");
		assertEquals(ocsize,template.getRelationClasses().size());
	}

	@Test
	public void There_is_only_one_relationClass_for_a_connection_occuring_more_times_in_a_template() {
		String id = "e13c9626";
		IZentaDiagramModel dm = testdata.getZDiagramModelById(id);
		Template template = metamodel.getTemplateFor(dm);
		String id2 = "9c441eb7";
		IRelationship element = testdata.getRelationByID(id2);
		int numOccurs = 0;
		for(RelationClass oc:template.getRelationClasses())
			if(element.equals(oc.getReference()))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void If_a_new_connection_added_to_a_template__a_RelationClass_will_be_created_for_it() {
		IDiagramModelObject diagramElement1 = testdata.getDMOById("b2608459");//User
		IDiagramModelObject diagramElement2 = testdata.getDMOById("f843c2f1");//ProcessStep
		IRelationship modelRelation= testdata.getRelationByID("9a97ee2f");
		assertNotNull(modelRelation);
		assertFalse(metamodel.hasRelationClassReferencing(modelRelation));
		IDiagramModelZentaConnection diagramRelation =
				IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		diagramRelation.setSource(diagramElement1);
		diagramRelation.setTarget(diagramElement2);
		diagramRelation.setRelationship(modelRelation);
		System.out.printf("relation id=%s,\n\tmodelrelation=%s\n",diagramRelation.getId(),diagramRelation.getRelationship());
		diagramElement1.addConnection(diagramRelation);
		assertTrue(metamodel.hasRelationClassReferencing(modelRelation));
	}

	@Test
	public void A_defining_relation_for_a_RelationClass_becomes_of_that_ObjectClass() {
		String id = "9c441eb7";
		IRelationship element = testdata.getRelationByID(id);
		assertEquals(id,element.getObjectClass());
	}

	@Test
	public void An_unnamed_relation_does_not_define_a_RelationClass() {
		IRelationship element = testdata.getRelationByID("44041ead");
		assertNotNull(element);
		assertFalse(metamodel.hasRelationClassReferencing(element));
	}

	@Test
	public void A_RelationClass_is_unnamed_if_the_defining_element_have_an_empty_className_property() {
		IRelationship element =	testdata.getRelationByID("2fb235de");
		assertNotNull(element);
		assertFalse(metamodel.hasRelationClassReferencing(element));		
	}
	
	@Test
	public void The_name_of_a_RelationClass_is_the_name_of_the_defining_element_if_it_does_not_have_a_className_property() {
		IRelationship element = testdata.getRelationByID("9c441eb7");
		assertEquals("describes",getRelationClassReferencing(element).getName());
	}

	@Test
	public void The_name_of_a_RelationClass_is_the_name_of_the_className_property_of_the_defining_element_if_it_has_one() {
		IRelationship element = testdata.getRelationByID("b0e2bfd8");
		assertEquals("TriesToDo",getRelationClassReferencing(element).getName());
	}

	@Test
	public void When_the_model_is_loaded_the_diagram_relations_are_converted_according_to_the_defining_relation() {
		IRelationship relation = testdata.getRelationByID("9c441eb7");
		IDiagramModelZentaConnection conn1 = testdata.getDMRById("9dc4d23a");
		IDiagramModelZentaConnection conn2 = testdata.getDMRById("dcb9c1a2");
		
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "font", "1|Andika|10.0|3|GTK|1|");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "fontColor", "#ff0000");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "textPosition", "0");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "lineWidth", "2");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "lineColor", "#0000ff");
		ModelTestData.assertOnePropertyWithNameAndValue(relation, "lineDecoration", "DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration");
		
		assertEquals("1|Andika|10.0|3|GTK|1|",conn1.getFont());
		assertEquals("#ff0000",conn1.getFontColor());
		assertEquals(0,conn1.getTextPosition());
		assertEquals(2,conn1.getLineWidth());
		assertEquals("#0000ff",conn1.getLineColor());
		assertEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration",conn1.getLineDecoration());

		assertEquals("1|Andika|10.0|3|GTK|1|",conn2.getFont());
		assertEquals("#ff0000",conn2.getFontColor());
		assertEquals(0,conn2.getTextPosition());
		assertEquals(2,conn2.getLineWidth());
		assertEquals("#0000ff",conn2.getLineColor());
		assertEquals("DiamondSourceDecoration SparseDashedLineDecoration BigArrowTargetDecoration",conn2.getLineDecoration());
	}

	private void assertTemplateHaveRelationClassFor(Template template,
			String elementID) {
		IRelationship element = testdata.getRelationByID(elementID);
		assertNotNull(template.getRelationClassReferencingElement(element));
	}

	private RelationClass getRelationClassReferencing(IRelationship element) {
		return metamodel.getRelatioClassReferencing(element);
	}
} 