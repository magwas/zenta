package org.rulez.magwas.zenta.editor.model.viewpoints;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.editor.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.metamodel.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class TotalViewpointTest {

	private ModelAndMetaModelTestData data;
	private IZentaDiagramModel dm;
	private IViewpoint vp;

	@Before
	public void setUp() {
		data = new ModelAndEditPartTestData();
		dm = data.getTemplateDiagramModel();
		vp = ViewpointsManager.INSTANCE.getViewpoint(dm);
	}

	@HaveGUI(waitUser = false)
	@Test
	public void TotalViewpoint_is_initialized_with_a_diagram() {
		UITestWindow win = new UITestWindow();
		assertNotNull(vp);
		win.showWindow();
	}

	@Test
	public void There_is_one_instance_of_ViewPoint_for_each_diagram() {
		IViewpoint vp2 = ViewpointsManager.INSTANCE.getViewpoint(dm);
		assertEquals(vp,vp2);
	}
	
	@Test
	public void Allowed_connections_are_based_on_the_metamodel() {
		IZentaElement sourceElement = data.getElementById("ea94cf6c");//User
		IDiagramModelZentaObject sourceDiagElement = (IDiagramModelZentaObject) data.getDMOById("b2608459");
		IZentaElement targetElement = data.getElementById("f33bd0d2");//Process
		List<RelationClass> rels = vp.getValidRelationships(sourceElement, targetElement);
		List<String> expectedList = Arrays.asList("Basic Relation","TriesToDo");
		ArrayList<String> actualList = getClassNames(rels);
		ModelTestUtils.assertEqualsAsSet(expectedList,actualList);
		
		ArrayList<String> actual2 = getClassNames(vp.getSourceRelationClassesFor(sourceDiagElement));
		ModelTestUtils.assertEqualsAsSet(expectedList,actual2);
	}

    @Test
	public void Allowed_connections_always_contain_builtin_relation() {
		String procedureId = "f33bd0d2";
		IZentaElement e1 = data.getElementById(procedureId);
		String processStepId = "c3d03626";
		IZentaElement e2 = data.getElementById(processStepId);
		List<RelationClass> valids = vp.getValidRelationships(e1, e2);
		assertEquals(1,valids.size());
		assertEquals("Basic Relation",valids.get(0).getName());
	}

	private ArrayList<String> getClassNames(List<RelationClass> rels) {
		ArrayList<String> actualList = new ArrayList<String>();
		for(RelationClass rel : rels) {
			actualList.add(rel.getName());
		}
		return actualList;
	}
}
