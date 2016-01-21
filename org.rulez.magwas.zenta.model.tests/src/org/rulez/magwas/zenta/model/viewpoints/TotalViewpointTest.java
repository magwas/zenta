package org.rulez.magwas.zenta.model.viewpoints;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.eclipse.jdt.annotation.NonNull;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;

public class TotalViewpointTest {

	private ModelAndMetaModelTestData testdata;
	private IZentaDiagramModel dm;
	private IViewpoint vp;

	@Before
	public void setUp() {
		testdata = new ModelAndMetaModelTestData();
		dm = testdata.getTemplateDiagramModel();
		vp = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(dm));
	}

	@After
	public void tearDown() {
	}

	@Test
	public void TotalViewpoint_is_initialized_with_a_diagram() {
		assertNotNull(vp);
	}

	@Test
	public void There_is_one_instance_of_ViewPoint_for_each_diagram() {
		IViewpoint vp2 = ViewpointsManager.INSTANCE.getViewpoint(Util.verifyNonNull(dm));
		assertEquals(vp,vp2);
	}
	
	
	@Test
	public void Allowed_connections_are_based_on_the_metamodel() {
		IBasicObject sourceElement = (IBasicObject) testdata.getElementById("ea94cf6c");//User
		IDiagramModelZentaObject sourceDiagElement = (IDiagramModelZentaObject) testdata.getDMOById("b2608459");
		IBasicObject targetElement = (IBasicObject) testdata.getElementById("f33bd0d2");//Process
		List<IBasicRelationship> rels = vp.getValidRelationships(sourceElement, targetElement);
		List<String> expectedList = Arrays.asList("Basic Relation","TriesToDo");
		ArrayList<String> actualList = getClassNames(rels);
		ModelTestUtils.assertEqualsAsSet(expectedList,actualList);
		
		ArrayList<String> actual2 = getClassNames(vp.getSourceRelationClassesFor(sourceDiagElement));
		ModelTestUtils.assertEqualsAsSet(expectedList,actual2);
	}

    @Test
	public void Allowed_connections_always_contain_builtin_relation() {
		String procedureId = "f33bd0d2";
		IZentaElement e1 = testdata.getElementById(procedureId);
		String processStepId = "c3d03626";
		IZentaElement e2 = testdata.getElementById(processStepId);
		List<IBasicRelationship> valids = vp.getValidRelationships(e1, e2);
		assertEquals(1,valids.size());
		assertEquals("Basic Relation",valids.get(0).getName());
	}

	private ArrayList<String> getClassNames(List<IBasicRelationship> rels) {
		ArrayList<String> actualList = new ArrayList<String>();
		for(IBasicRelationship rel : rels) {
			actualList.add(rel.getDefiningName());
		}
		return actualList;
	}
	
	@Test
	public void Root_RelationClass_connects_to_everything() {
		IBasicRelationship builtinRelationClass = testdata.metamodel.getBuiltinRelationClass();
		Collection<IBasicObject> targets = builtinRelationClass.getAllowedTargets();
		@NonNull
		HashSet<String> expectedTargets = ModelTestUtils.definingNames(testdata.metamodel.getObjectClasses());
		ModelTestUtils.assertEqualsAsSet(expectedTargets,ModelTestUtils.definingNames(targets));
	}

	@Test
	public void Root_ObjectClass_connects_to_everything() {
		IBasicObject builtinObjectClass = testdata.metamodel.getBuiltinObjectClass();
		Collection<IBasicObject> targets = vp.getAllowedTargets(builtinObjectClass);
		HashSet<String> expectedTargets = ModelTestUtils.definingNames(testdata.metamodel.getObjectClasses());
		ModelTestUtils.assertEqualsAsSet(expectedTargets,ModelTestUtils.definingNames(targets));
	}
	@Test
	public void Magic_Connector_magically_knows_what_to_connect() {
		IBasicObject element = (IBasicObject) testdata.getElementById("ea94cf6c");
		Collection<IBasicObject> targets = vp.getAllowedTargets(element);
		HashSet<String> expectedTargets = ModelTestUtils.definingNames(element.getTemplate().getMetamodel().getObjectClasses());
		ModelTestUtils.assertEqualsAsSet(expectedTargets,ModelTestUtils.definingNames(targets));
	}

	@Test
	public void Allowed_targets_contain_everything() {
		IBasicObject element = (IBasicObject) testdata.getElementById("f33bd0d2");
		Collection<IBasicObject> targets = vp.getAllowedTargets(element);
		HashSet<String> expectedTargets = new HashSet<String>(Arrays.asList(
				"Basic Object",
				"Data",
				"ProcessStep",
				"NotActuallyDocumentation",
				"Procedure",
				"User",
				"Title"));
		ModelTestUtils.assertEqualsAsSet(expectedTargets,ModelTestUtils.definingNames(targets));
	}

	@Test
	public void Allowed_connections_contain_Basic_Relationship() {
		IBasicObject dataElement = (IBasicObject) testdata.getElementById("23138a61");
		IBasicObject processStepElement = (IBasicObject) testdata.getElementById("c3d03626");
		Collection<IBasicRelationship> targets = vp.getValidRelationships(dataElement, processStepElement);
		HashSet<String> expectedTargets = new HashSet<String>(Arrays.asList(
				"Basic Relation"));
		ModelTestUtils.assertEqualsAsSet(expectedTargets,ModelTestUtils.definingNames(targets));
	}
}
