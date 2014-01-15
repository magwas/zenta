package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;
import org.eclipse.emf.common.util.EList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class TemplateTest {

	protected ITemplate fixture = null;
	private IZentaModel model;
	private IZentaDiagramModel diagramModel;
	private ITemplate template;
	
	@Before
	public void setUp() throws Exception {
		ModelTestData testdata = new ModelTestData();
		model = testdata.getModel();
		diagramModel = testdata.getTemplateDiagramModel();
		IMetamodel metamodel = IZentaFactory.eINSTANCE.createMetamodel(model);
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
		EList<IObjectClass> objects = fixture.getObjectClasses();
		assertEquals(1,objects.size());
	}

	@Test
	public void The_Builtin_template_have_one_RelationClass() {
		EList<IRelationClass> relations = fixture.getRelationClasses();
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
		IZentaElement classTemplate = (IZentaElement) ZentaModelUtils.getObjectByID(model, "23138a61");
		assertTrue(null != template.getObjectClassReferencingElement(classTemplate));
	}

	@Test
	public void The_template_contains_the_objectclasses_for_the_embedded_elements_of_the_diagram() {
		IZentaElement classTemplate = (IZentaElement) ZentaModelUtils.getObjectByID(model, "c3d03626");
		assertTrue(null != template.getObjectClassReferencingElement( classTemplate));
	}
	
	@Test
	public void The_template_contains_the_relationclasses_for_the_diagram() {
		IRelationship classTemplate = (IRelationship) ZentaModelUtils.getObjectByID(model, "b0e2bfd8");
		assertTrue(null != template.getRelationClassReferencingElement(classTemplate));
	}
}
