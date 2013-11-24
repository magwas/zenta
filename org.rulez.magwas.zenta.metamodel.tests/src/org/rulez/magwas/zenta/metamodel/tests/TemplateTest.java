package org.rulez.magwas.zenta.metamodel.tests;

import static org.junit.Assert.*;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.AssociationRelationship;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class TemplateTest {

	protected Template fixture = null;
	private IZentaModel model;
	private ZentaDiagramModel diagramModel;
	private Template template;
	
	@Before
	public void setUp() throws Exception {
		Metamodel metamodel = MetamodelFactory.eINSTANCE.createMetamodel();
		fixture = metamodel.getBuiltinTemplate();
		ModelTestData testdata = new ModelTestData();
		model = testdata.getModel();
		diagramModel = testdata.getTestDiagramModel();
		template = createTemplateFromDiagramModel(diagramModel);
	}

	@After
	public void tearDown() throws Exception {
		this.fixture = null;
	}
	
	@Test
	public void There_is_a_default_template_named_Builtins() {
		assertEquals("Builtins",fixture.getName());
	}
	
	@Test
	public void The_Builtin_template_have_one_ObjectClass() {
		EList<ObjectClass> objects = fixture.getObjectClasses();
		assertEquals(1,objects.size());
	}

	@Test
	public void The_Builtin_template_have_one_RelationClass() {
		EList<RelationClass> relations = fixture.getRelationClasses();
		assertEquals(1,relations.size());
	}

	@Test
	public void The_Builtin_template_have_null_as_reference() {
		assertEquals(null,fixture.getReference());
	}
	
	@Test
	public void The_reference_object_for_a_template_is_the_DiagramModel_from_which_it_is_created() {
		assertEquals(diagramModel,template.getReference());		
	}
	
	@Test
	public void The_template_contains_the_objectclasses_for_the_diagram() {
		BusinessObject classTemplate = (BusinessObject) ZentaModelUtils.getObjectByID(model, "23138a61");
		assertTrue(null != template.getObjectClassReferencingElement(classTemplate));
	}

	@Test
	public void The_template_contains_the_objectclasses_for_the_embedded_elements_of_the_diagram() {
		BusinessObject classTemplate = (BusinessObject) ZentaModelUtils.getObjectByID(model, "c3d03626");
		assertTrue(null != template.getObjectClassReferencingElement( classTemplate));
	}
	
	@Test
	public void The_template_contains_the_relationclasses_for_the_diagram() {
		AssociationRelationship classTemplate = (AssociationRelationship) ZentaModelUtils.getObjectByID(model, "b0e2bfd8");
		assertTrue(null != template.getRelationClassReferencingElement(classTemplate));
	}
		private Template createTemplateFromDiagramModel(
				ZentaDiagramModel diagramModel) {
			Metamodel metamodel = MetamodelFactory.eINSTANCE.createMetamodel();
			Template template = MetamodelFactory.eINSTANCE.createTemplate(diagramModel, metamodel);
			return template;
		}
}
