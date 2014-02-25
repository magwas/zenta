package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;

public class TemplateTest {

	protected ITemplate fixture = null;
	private IZentaDiagramModel diagramModel;
	private ITemplate template;
	private IMetamodel metamodel;
	private ModelTestData testdata;
	
	@Before
	public void setUp() throws Exception {
		testdata = new ModelTestData();
		assertNotNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "c3d03626"));
		assertNotNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "c3d03626"));
		diagramModel = testdata.getTemplateDiagramModel();
		assertNotNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "c3d03626"));
		setupMeta();
	}

	public void setupMeta() {
		metamodel = IZentaFactory.eINSTANCE.getMetamodelFor(testdata.getModel());
		assertNotNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "c3d03626"));
		fixture = metamodel.getBuiltinTemplate();
		template = metamodel.getTemplateFor(testdata.getTemplateDiagramModel());
		assertNotNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "c3d03626"));
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
		List<IBasicObject> objects = fixture.getObjectClasses();
		assertEquals(1,objects.size());
	}

	@Test
	public void The_Builtin_template_have_one_RelationClass() {
		List<IBasicRelationship> relations = fixture.getRelationClasses();
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
		IBasicObject classTemplate = (IBasicObject) Util.verifyNonNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "23138a61"));
		assertTrue(template == classTemplate.getTemplate());
	}

	@Test
	public void The_template_contains_the_objectclasses_for_the_embedded_elements_of_the_diagram() {
		IBasicObject classTemplate = (IBasicObject) Util.verifyNonNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "c3d03626"));
		assertTrue(template == ((IBasicObject) classTemplate).getTemplate());
	}
	
	@Test
	public void The_template_contains_the_relationclasses_for_the_diagram() {
		IBasicRelationship classTemplate = (IBasicRelationship) Util.verifyNonNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "a972e26e"));
		assertTrue(template == classTemplate.getTemplate());
	}
	
	@Test
	public void If_a_relationship_occurs_in_more_templates_removing_it_from_one_does_not_make_it_undefining() {
		IBasicRelationship rel = (IBasicRelationship) Util.verifyNonNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "b0e2bfd8"));
		assertTrue(rel.isTemplate());
		IDiagramModel dm = rel.getTemplate().getDiagram();
		for(IDiagramModelZentaConnection dmo : rel.getDiagConnections())
			if(dmo.getDiagramModel().equals(dm))
				dmo.getSource().getSourceConnections().remove(dmo);
		assertTrue(rel.isTemplate());
		assertNotSame(dm,rel.getTemplate().getDiagram());
		
	}
	
	@Test
	public void If_an_object_occurs_in_more_templates_removing_it_from_one_does_not_make_it_undefining() {
		IBasicObject obj = (IBasicObject) Util.verifyNonNull(ZentaModelUtils.getObjectByID(testdata.getModel(), "ea94cf6c"));
		assertTrue(obj.isTemplate());
		IDiagramModel dm = obj.getTemplate().getDiagram();
		for(IDiagramModelComponent dmo : obj.getDiagComponents())
			if(dmo.getDiagramModel().equals(dm))
				((IDiagramModelContainer)dmo.eContainer()).getChildren().remove(dmo);
		assertTrue(obj.isTemplate());
		assertNotSame(dm,obj.getTemplate().getDiagram());
	}

}
