package org.rulez.magwas.zenta.help.hints;

import static org.junit.Assert.*;

import org.eclipse.ui.IViewPart;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.help.hints.HintsView;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.RelationshipBase;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestUtils;
import org.rulez.magwas.zenta.tests.UITestWindow;
public class HintsViewTest {

	private ModelAndEditPartTestData testdata;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();
	}
	
	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}

	@Test
	@HaveGUI(waitUser = false)
	public void The_Hints_view_contains_useful_information_about_the_selected_object() throws PartInitException, WorkbenchException {
		UITestWindow win = new UITestWindow();
		String viewId = "org.rulez.magwas.zenta.help.hintsView";
		IViewPart view = UITestUtils.openView(viewId);
		assertTrue(view instanceof HintsView);
		IFolder element = testdata.model.getFolders().get(0);
		UITestUtils.focusOnElement(element);
        
		win.resize(100, 100);
		view.createPartControl(win.getComposite());
		win.showWindow();
	}
	
	@Test
	public void The_Hints_view_contains_the_ancestry_and_description_of_the_ObjectClass_of_element() throws PartInitException, WorkbenchException {
		IZentaElement element = testdata.getElementById("f33bd0d2");//Procedure
		element.setDocumentation("this is a procedure");//FIXME: do it for a derived element and a connection as well
		UITestUtils.focusOnElement(element);
		HintsView view = prepareHintsView();
		assertEquals("Procedure", view.getTitleText());
		IObjectClass oc = (IObjectClass) testdata.metamodel.getClassOf(element);
		assertEquals("Procedure", oc.getHelpHintTitle());
		assertEquals("this is a procedure\nAncestry: Procedure => Basic Object\n",oc.getHelpHintContent());
	}

		private HintsView prepareHintsView() throws WorkbenchException,
				PartInitException {
			String viewId = "org.rulez.magwas.zenta.help.hintsView";
			IViewPart _view = UITestUtils.openView(viewId);
			assertTrue(_view instanceof HintsView);
			HintsView view = (HintsView) _view;
			return view;
		}
			
	@Test
	public void The_Hints_view_contains_the_ancestry_and_description_of_the_ObjectClass_of_element_for_nondefining_elements() throws PartInitException, WorkbenchException {
		IObjectClass oc = (IObjectClass) testdata.metamodel.getClassById("ea94cf6c");//User		
		IZentaElement classElement = (IZentaElement) oc.getReference();
		classElement.setDocumentation("this is a User");
		IZentaElement element = testdata.createClassedTestElement(oc);
		element.setName("Árvíztűrő Tükörfúrógépke");
		UITestUtils.focusOnElement(element);
		HintsView view = prepareHintsView();
		assertEquals("User", view.getTitleText());
		assertEquals("User", oc.getHelpHintTitle());
		assertEquals("this is a User\nAncestry: User => Basic Object\n",oc.getHelpHintContent());
	}

	@Test
	public void The_Hints_view_contains_the_name_and_description_of_the_ObjectClass_of_element() throws PartInitException, WorkbenchException {
		String id = "9c441eb7";
		IRelationClass baseRelationClass = (IRelationClass) testdata.metamodel.getClassById(id);
		RelationshipBase parentRel = (RelationshipBase) baseRelationClass.getReference();
		parentRel.setDocumentation("I guess this might describe something");
		IRelationship rel = testdata.createNewNondefiningRelationBasedOn(baseRelationClass);
		rel.setName("Displayable Relation Name");
		assertNotNull(rel);
		assertNotSame(rel.getId(),rel.getObjectClass());
		UITestUtils.focusOnElement(rel);
		HintsView view = prepareHintsView();
		assertEquals("describes", view.getTitleText());
		assertEquals("describes", baseRelationClass.getHelpHintTitle());
		assertEquals("I guess this might describe something\nAncestry: describes => Basic Relation\n",baseRelationClass.getHelpHintContent());
	}
	
	@Test
	public void The_Hints_view_shows_hint_based_on_ObjectClass_for_Diagram_Elements_as_well() throws PartInitException, WorkbenchException {
		String id = "ea94cf6c";//User
		IZentaElement element = testdata.getElementById(id);
		assertNotNull(element);
		IDiagramModelZentaObject diagElement = element.getDiagObjects().get(0);
		assertNotNull(diagElement);
		testdata.selectDiagElement(diagElement);
		HintsView view = prepareHintsView();
		assertEquals("User", view.getTitleText());
	}

}
