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
import org.rulez.magwas.zenta.model.IAssociationRelationship;
import org.rulez.magwas.zenta.model.IBusinessObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.AssociationRelationship;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.impl.DiagramModelObject;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObject;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;
import org.rulez.magwas.zenta.model.impl.ZentaFactory;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class MetamodelBuilderTest {

	private MetamodelBuilder builder;
	private IZentaModel zentaModel;
	private ZentaDiagramModel diagramModel;

	@Before
	public void setUp() {
		ModelTestData testdata = new ModelTestData();
		zentaModel = testdata.getModel();
		diagramModel = testdata.getTestDiagramModel();
		builder = new MetamodelBuilder(zentaModel);
	}
	
	@Test
	public void The_builder_listens_to_canges_of_the_model() {
		BusinessObject element = (BusinessObject) ZentaModelUtils.getObjectByID(zentaModel, "ea94cf6c");
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
			IBusinessObject element = (IBusinessObject) ZentaModelUtils.getObjectByID(zentaModel,elementID);
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
			IAssociationRelationship element = (IAssociationRelationship) ZentaModelUtils.getObjectByID(zentaModel,elementID);
			assertNotNull(template.getRelationClassReferencingElement(element));
		}
	
	@Test
	public void There_is_only_one_ObjectClass_for_an_element_occuring_more_times_in_a_template() {
		Metamodel metamodel = builder.getMetamodel();
		ZentaDiagramModel dm = (ZentaDiagramModel) ZentaModelUtils.getObjectByID(zentaModel,"e13c9626");
		Template template = metamodel.getTemplateFor(dm);
		BusinessObject element = (BusinessObject) ZentaModelUtils.getObjectByID(zentaModel,"8495ea84");
		int numOccurs = 0;
		for(ObjectClass oc:template.getObjectClasses())
			if(element.equals(oc.getReference()))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void There_is_only_one_relationClass_for_a_connection_occuring_more_times_in_a_template() {
		Metamodel metamodel = builder.getMetamodel();
		ZentaDiagramModel dm = (ZentaDiagramModel) ZentaModelUtils.getObjectByID(zentaModel,"e13c9626");
		Template template = metamodel.getTemplateFor(dm);
		AssociationRelationship element = (AssociationRelationship) ZentaModelUtils.getObjectByID(zentaModel,"9c441eb7");
		int numOccurs = 0;
		for(RelationClass oc:template.getRelationClasses())
			if(element.equals(oc.getReference()))
				numOccurs++;
		assertEquals(1,numOccurs);
	}

	@Test
	public void If_a_new_element_added_to_a_template__an_ObjectClass_will_be_created_for_it() {
		BusinessObject elementToAdd = (BusinessObject) ZentaModelUtils.getObjectByID(zentaModel,"a885cd76");
		addElementToDiagramModel(diagramModel,elementToAdd);
		assertEquals(diagramModel,builder.getLastObject());
		assertTrue(metamodelHasObjectClassReferencingElement(elementToAdd));
	}
	
	@Test
	public void If_a_new_element_added_to_a_non_template__an_ObjectClass_will_not_be_created_for_it() {
		BusinessObject elementToAdd = (BusinessObject) ZentaModelUtils.getObjectByID(zentaModel,"a885cd76");
		ZentaDiagramModel dm = (ZentaDiagramModel) ZentaModelUtils.getObjectByID(zentaModel,"63f1b081");
		addElementToDiagramModel(dm,elementToAdd);
		assertEquals(dm,builder.getLastObject());
		assertFalse(metamodelHasObjectClassReferencingElement(elementToAdd));
	}
	
	@Test
	public void If_a_new_connection_added_to_a_template__a_RelationClass_will_be_created_for_it() {
		DiagramModelObject diagramElement1 =
				(DiagramModelObject) ZentaModelUtils.getObjectByID(zentaModel,"b2608459");//User
		DiagramModelObject diagramElement2 =
				(DiagramModelObject) ZentaModelUtils.getObjectByID(zentaModel,"f843c2f1");//ProcessStep
		IAssociationRelationship modelRelation= 
				(IAssociationRelationship) ZentaModelUtils.getObjectByID(zentaModel,"2cf4d639");
		IDiagramModelZentaConnection diagramRelation = ZentaFactory.eINSTANCE.createDiagramModelZentaConnection();
		diagramRelation.setSource(diagramElement1);
		diagramRelation.setTarget(diagramElement2);
		diagramRelation.setRelationship(modelRelation);
		diagramElement1.addConnection(diagramRelation);
		assertEquals(diagramElement1,builder.getLastObject());
		assertTrue(metamodelHasRelationClassReferencingElement(modelRelation));
	}
	private Template getTemplateForFirstTemplateDiagram() {
		Metamodel metamodel = builder.getMetamodel();
		Template template = metamodel.getTemplateFor(diagramModel);
		return template;
	}
	private boolean metamodelHasRelationClassReferencingElement(
			IAssociationRelationship relation) {
		EList<Template> templates = builder.getMetamodel().getTemplates();
		for(Template template : templates) {
			if(template.getReference() != null)
				if(null != template.getRelationClassReferencingElement(relation))
					return true;
		}
		return false;
	}

	private boolean metamodelHasObjectClassReferencingElement(
			BusinessObject elementToAdd) {
		EList<Template> templates = builder.getMetamodel().getTemplates();
		for(Template template : templates) {
			if(template.getReference() != null)
				if(null != template.getObjectClassReferencingElement(elementToAdd))
					return true;
		}
		return false;
	}

	private void addElementToDiagramModel(ZentaDiagramModel dm,
			BusinessObject elementToAdd) {
		DiagramModelZentaObject mo = (DiagramModelZentaObject) IZentaFactory.eINSTANCE.createDiagramModelZentaObject();
		mo.setZentaElement(elementToAdd);
		AddDiagramObjectCommand cmd = new AddDiagramObjectCommand(dm, mo);
		cmd.execute();
	}
}
