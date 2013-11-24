package org.rulez.magwas.zenta.metamodel.tests.util;

import static org.junit.Assert.*;

import org.eclipse.emf.common.util.EList;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.commands.AddDiagramObjectCommand;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.util.MetamodelBuilder;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class MetamodelBuilderTest {

	private MetamodelBuilder builder;
	private IZentaModel zentaModel;
	private IZentaDiagramModel diagramModel;

	@Before
	public void setUp() {
		ModelTestData testdata = new ModelTestData();
		zentaModel = testdata.getModel();
		diagramModel = testdata.getTestDiagramModel();
		builder = new MetamodelBuilder(zentaModel);
	}
	
	@Test
	public void The_builder_listens_to_canges_of_the_model() {
		IZentaElement element = (IZentaElement) ZentaModelUtils.getObjectByID(zentaModel, "ea94cf6c");
		element.setName("newname");
		assertEquals(element,builder.getLastObject());
	}
	
	@Test
	public void The_builder_has_a_metamodel_of_the_model() {
		builder.getMetamodel();
	}
	
	@Test
	public void The_builder_processes_Templates_when_initializes() {
		EList<Template> templates = builder.getMetamodel().getTemplates();
		assertTrue(2 <= templates.size());
		Metamodel metamodel = builder.getMetamodel();
		int tsize = metamodel.getTemplates().size();
		Template template = metamodel.getTemplateFor(diagramModel);
		assertEquals(tsize,metamodel.getTemplates().size());
		assertNotNull(template);
	}
	
	@Test
	public void The_elements_of_the_template_are_converted_to_ObjectClass() {
		Template template = getTemplateForFirstTemplateDiagram();
		int ocsize = template.getObjectClasses().size();
		assertTemplateHaveObjectClassFor(template, "ea94cf6c");
		assertTemplateHaveObjectClassFor(template, "c3d03626");
		assertEquals(ocsize,template.getObjectClasses().size());
	}
		private void assertTemplateHaveObjectClassFor(Template template,
				String elementID) {
			IZentaElement element = (IZentaElement) ZentaModelUtils.getObjectByID(zentaModel,elementID);
			assertNotNull(template.getObjectClassReferencingElement(element));
		}
	
	@Test
	public void The_relations_of_the_template_are_converted_to_RelationClass() {
		Template template = getTemplateForFirstTemplateDiagram();
		int ocsize = template.getRelationClasses().size();
		assertTemplateHaveRelationClassFor(template, "a972e26e");
		assertTemplateHaveRelationClassFor(template, "3da94729");
		assertEquals(ocsize,template.getRelationClasses().size());
	}
		private void assertTemplateHaveRelationClassFor(Template template,
				String elementID) {
			IRelationship element = (IRelationship) ZentaModelUtils.getObjectByID(zentaModel,elementID);
			assertNotNull(template.getRelationClassReferencingElement(element));
		}
	
	@Test
	public void There_is_only_one_ObjectClass_for_an_element_occuring_more_times_in_a_template() {
		Metamodel metamodel = builder.getMetamodel();
		IZentaDiagramModel dm = (IZentaDiagramModel) ZentaModelUtils.getObjectByID(zentaModel,"e13c9626");
		Template template = metamodel.getTemplateFor(dm);
		IZentaElement element = (IZentaElement) ZentaModelUtils.getObjectByID(zentaModel,"8495ea84");
		int numOccurs = 0;
		for(ObjectClass oc:template.getObjectClasses())
			if(element.equals(oc.getReference()))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void There_is_only_one_relationClass_for_a_connection_occuring_more_times_in_a_template() {
		Metamodel metamodel = builder.getMetamodel();
		IZentaDiagramModel dm = (IZentaDiagramModel) ZentaModelUtils.getObjectByID(zentaModel,"e13c9626");
		Template template = metamodel.getTemplateFor(dm);
		IZentaElement element = (IZentaElement) ZentaModelUtils.getObjectByID(zentaModel,"9c441eb7");
		int numOccurs = 0;
		for(RelationClass oc:template.getRelationClasses())
			if(element.equals(oc.getReference()))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void If_a_new_element_added_to_a_template__an_ObjectClass_will_be_created_for_it() {
		IZentaElement elementToAdd = (IZentaElement) ZentaModelUtils.getObjectByID(zentaModel,"a885cd76");
		addElementToDiagramModel(diagramModel,elementToAdd);
		assertTrue(metamodelHasObjectClassReferencingElement(elementToAdd));
	}
	
	@Test
	public void If_a_new_element_added_to_a_non_template__an_ObjectClass_will_not_be_created_for_it() {
		IZentaElement elementToAdd = (IZentaElement) ZentaModelUtils.getObjectByID(zentaModel,"a885cd76");
		IZentaDiagramModel dm = (IZentaDiagramModel) ZentaModelUtils.getObjectByID(zentaModel,"63f1b081");
		addElementToDiagramModel(dm,elementToAdd);
		assertEquals(dm,builder.getLastObject());
		assertNotNull(elementToAdd);
		assertFalse(metamodelHasObjectClassReferencingElement(elementToAdd));
	}
	
	@Test
	public void If_a_new_connection_added_to_a_template__a_RelationClass_will_be_created_for_it() {
		IDiagramModelObject diagramElement1 =
				(IDiagramModelObject) ZentaModelUtils.getObjectByID(zentaModel,"b2608459");//User
		IDiagramModelObject diagramElement2 =
				(IDiagramModelObject) ZentaModelUtils.getObjectByID(zentaModel,"f843c2f1");//ProcessStep
		IRelationship modelRelation= 
				(IRelationship) ZentaModelUtils.getObjectByID(zentaModel,"9a97ee2f");
		assertNotNull(modelRelation);
		assertFalse(metamodelHasRelationClassReferencingElement(modelRelation));
		IDiagramModelZentaConnection diagramRelation =
				IZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		diagramRelation.setSource(diagramElement1);
		diagramRelation.setTarget(diagramElement2);
		diagramRelation.setRelationship(modelRelation);
		System.out.printf("relation id=%s,\n\tmodelrelation=%s\n",diagramRelation.getId(),diagramRelation.getRelationship());
		diagramElement1.addConnection(diagramRelation);
		assertTrue(metamodelHasRelationClassReferencingElement(modelRelation));
	}
	
	@Test
	public void A_defining_object_for_an_ObjectClass_becomes_of_that_ObjectClass() {
		IZentaElement element =
				(IZentaElement) ZentaModelUtils.getObjectByID(zentaModel, "ea94cf6c");
		assertEquals("ea94cf6c",element.getObjectClass());
	}
	@Test
	public void A_defining_relation_for_a_RelationClass_becomes_of_that_ObjectClass() {
		IRelationship element =
				(IRelationship) ZentaModelUtils.getObjectByID(zentaModel, "9c441eb7");
		assertEquals("9c441eb7",element.getObjectClass());
	}

	@Test
	public void An_unnamed_element_does_not_define_an_ObjectClass() {
		IZentaElement element =
				(IZentaElement) ZentaModelUtils.getObjectByID(zentaModel, "e79192be");
		assertNotNull(element);
		assertFalse(metamodelHasObjectClassReferencingElement(element));
	}
	
	@Test
	public void An_unnamed_relation_does_not_define_a_RelationClass() {
		IRelationship element = (IRelationship) ZentaModelUtils.getObjectByID(zentaModel, "44041ead");
		assertNotNull(element);
		assertFalse(metamodelHasRelationClassReferencingElement(element));
	}

	@Test
	public void An_ObjectClass_is_unnamed_if_the_defining_element_have_an_empty_className_property() {
		IZentaElement element =
				(IZentaElement) ZentaModelUtils.getObjectByID(zentaModel, "252d482c");
		assertNotNull(element);
		assertFalse(metamodelHasObjectClassReferencingElement(element));		
	}

	@Test
	public void A_RelationClass_is_unnamed_if_the_defining_element_have_an_empty_className_property() {
		IRelationship element =
				(IRelationship) ZentaModelUtils.getObjectByID(zentaModel, "2fb235de");
		assertNotNull(element);
		assertFalse(metamodelHasRelationClassReferencingElement(element));		
	}
	
	@Test
	public void The_name_of_an_ObjectClass_is_the_name_of_the_defining_element_if_it_does_not_have_a_className_property() {
		IZentaElement element =
				(IZentaElement) ZentaModelUtils.getObjectByID(zentaModel, "ea94cf6c");
		assertEquals("User",getObjectClassReferencing(element).getName());
	}
	
	@Test
	public void The_name_of_a_RelationClass_is_the_name_of_the_defining_element_if_it_does_not_have_a_className_property() {
		IRelationship element =
				(IRelationship) ZentaModelUtils.getObjectByID(zentaModel, "9c441eb7");
		assertEquals("describes",getRelationClassReferencing(element).getName());
	}

	@Test
	public void The_name_of_an_ObjectClass_is_the_name_of_the_className_property_of_the_defining_element_if_it_has_one() {
		IZentaElement element =
				(IZentaElement) ZentaModelUtils.getObjectByID(zentaModel, "8495ea84");
		assertEquals("NotActuallyDocumentation",getObjectClassReferencing(element).getName());
	}

	@Test
	public void The_name_of_a_RelationClass_is_the_name_of_the_className_property_of_the_defining_element_if_it_has_one() {
		IRelationship element =
				(IRelationship) ZentaModelUtils.getObjectByID(zentaModel, "b0e2bfd8");
		assertEquals("TriesToDo",getRelationClassReferencing(element).getName());
	}
	
	private Template getTemplateForFirstTemplateDiagram() {
		Metamodel metamodel = builder.getMetamodel();
		Template template = metamodel.getTemplateFor(diagramModel);
		return template;
	}

	private RelationClass getRelationClassReferencing(IRelationship element) {
		Metamodel metamodel = builder.getMetamodel();
		return metamodel.getRelatioClassReferencing(element);
	}
	
	private boolean metamodelHasRelationClassReferencingElement(
			IRelationship relation) {
		Metamodel metamodel = builder.getMetamodel();
		return null != metamodel.getRelatioClassReferencing(relation);
	}

	private ObjectClass getObjectClassReferencing(IZentaElement element) {
		Metamodel metamodel = builder.getMetamodel();
		return metamodel.getObjectClassReferencing(element);
	}

	private boolean metamodelHasObjectClassReferencingElement(
			IZentaElement elementToAdd) {
		return null != getObjectClassReferencing(elementToAdd);
	}

	private void addElementToDiagramModel(IZentaDiagramModel dm,
			IZentaElement elementToAdd) {
		IDiagramModelZentaObject mo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		mo.setZentaElement(elementToAdd);
		AddDiagramObjectCommand cmd = new AddDiagramObjectCommand(dm, mo);
		cmd.execute();
	}
}
