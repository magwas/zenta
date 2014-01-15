package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class TemplateTest {

	protected ITemplate fixture = null;
	private IZentaModel model;
	private IZentaDiagramModel diagramModel;
	private ITemplate template;
	private IMetamodel metamodel;
	private ModelTestData testdata;
	
	@Before
	public void setUp() throws Exception {
		testdata = new ModelTestData();
		model = testdata.getModel();
		diagramModel = testdata.getTemplateDiagramModel();
		metamodel = IZentaFactory.eINSTANCE.createMetamodel(model);
		fixture = metamodel.getBuiltinTemplate();
		template = metamodel.getTemplateFor(testdata.getTemplateDiagramModel());
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
		List<IObjectClass> objects = fixture.getObjectClasses();
		assertEquals(1,objects.size());
	}

	@Test
	public void The_Builtin_template_have_one_RelationClass() {
		List<IRelationClass> relations = fixture.getRelationClasses();
		assertEquals(1,relations.size());
	}

	@Test
	public void The_Builtin_template_have_null_as_reference() {
		assertEquals(null,fixture.getDiagram());
	}
	
	@Test
	public void The_reference_object_for_a_template_is_the_DiagramModel_from_which_it_is_created() {
		assertEquals(diagramModel,template.getDiagram());		
	}
	
	@Test
	public void The_template_contains_the_objectclasses_for_the_diagram() {
		IBasicObject classTemplate = (IBasicObject) ZentaModelUtils.getObjectByID(model, "23138a61");
		assertTrue(null != template.getObjectClassReferencingElement(classTemplate));
	}

	@Test
	public void The_template_contains_the_objectclasses_for_the_embedded_elements_of_the_diagram() {
		IBasicObject classTemplate = (IBasicObject) ZentaModelUtils.getObjectByID(model, "c3d03626");
		IZentaDiagramModel tdm = testdata.getTemplateDiagramModel();
		metamodel = IZentaFactory.eINSTANCE.createMetamodel(model);
		assertNotNull(tdm);
		template = metamodel.getTemplateFor(tdm);
		assertNotNull(template);
		System.out.printf("template=%s\nobj=%s\n", template,classTemplate);
		assertTrue(null != template.getObjectClassReferencingElement( classTemplate));
	}
	
	@Test
	public void The_template_contains_the_relationclasses_for_the_diagram() {
		IBasicRelationship classTemplate = (IBasicRelationship) ZentaModelUtils.getObjectByID(model, "b0e2bfd8");
		assertTrue(null != template.getRelationClassReferencingElement(classTemplate));
	}
}
