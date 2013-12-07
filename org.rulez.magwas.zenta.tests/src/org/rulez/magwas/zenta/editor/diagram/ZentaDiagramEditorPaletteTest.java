package org.rulez.magwas.zenta.editor.diagram;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditorPalette;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionCreationTool;
import org.rulez.magwas.zenta.editor.diagram.tools.MagicConnectionModelFactory;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.ZentaElement;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class ZentaDiagramEditorPaletteTest {

	private ModelAndEditPartTestData testdata;
	private MagicConnectionCreationTool tool;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();
	}

	@Test
	public void havePalette() throws PartInitException, WorkbenchException {
		EObject element = testdata.getById("2ea99535");
		assertNotNull(element);
		
		List<PaletteEntry> children = getObjectClassPaletteEntries();
		for(ObjectClass klass : testdata.metamodel.getObjectClasses()) {
			assertTrue(haveCreatorFor(klass, children));
		}
	}
	
	@Test
	@HaveGUI(waitUser = false)
	public void Magic_Connector_magically_connects_two_diagram_objects() {
		UITestWindow win = new UITestWindow();
		ModelAndEditPartTestData data = new ModelAndEditPartTestData();
		IFolder folder = ModelAndEditPartTestData.getFolderByKid(data.getTestDiagramModel());
		MagicConnectionModelFactory factory = new MagicConnectionModelFactory(folder);
		tool = new MagicConnectionCreationTool();
		tool.setFactory(factory);
		tool.setViewer(data.editor.getGraphicalViewer());
		CreateConnectionRequest req = new CreateConnectionRequest();
		EditPart spart = data.getEditPartFor("b2608459");
		EditPart tpart = data.getEditPartFor("88f40127");
		req.setSourceEditPart(spart);
		req.setTargetEditPart(tpart);
		tool._setRequest(req);
		tool._setSkipModalMenu();
		tool.handleCreateConnection();
		win.showWindow();
	}

	@Test
	public void The_created_objects_are_part_of_a_model() throws IOException {
		ObjectClass userClass = (ObjectClass) testdata.metamodel.getClassById("ea94cf6c");
		IFolder folder = (IFolder) testdata.getById("13144af6");
		ZentaElement newElement = (ZentaElement) userClass.create(folder);
		folder.getElements().add(newElement);
		assertEquals(testdata.model,newElement.getZentaModel());
		IEditorModelManager.INSTANCE.saveModel(testdata.model);
	}
	
	@Test
	public void If_a_new_ObjectClass_is_created_it_is_shown_on_the_ViewPoint() {
		ZentaDiagramEditorPalette palette = testdata.editor.getPaletteRoot();

		String elementName = "New test OC";
		IZentaElement newElement = testdata.createNewObjectClass(elementName);
		ObjectClass newOc = testdata.metamodel.getObjectClassReferencing(newElement);
		
		PaletteContainer objectsgroup = palette._getObjectsGroup();
		assertNotNull(objectsgroup);
		@SuppressWarnings("unchecked")
		List<PaletteEntry> children = objectsgroup.getChildren();
		
		assertTrue(haveCreatorFor(newOc, children));
	}
	
	@Test
	public void When_a_defining_diagram_object_is_deleted_the_corresponding_objectclass_is_also_deleted_from_the_palette() {
		String ocName = "deletetest OC";
		IZentaElement element = testdata.createNewObjectClass(ocName);
		String elemId = element.getId();
		ReferencesModelObjectBase oc = testdata.metamodel.getClassById(elemId);
		assertNotNull(oc);
		
		IDiagramModelZentaObject diagElement = element.getDiagObjects().get(0);
		IDiagramModelContainer dia = (IDiagramModelContainer) diagElement.eContainer();
		
		List<PaletteEntry> children = getObjectClassPaletteEntries();
		assertTrue(haveCreatorNamed(ocName, children));
		dia.getChildren().remove(diagElement);
		assertNull(testdata.metamodel.getClassFor(element));
		assertFalse(haveCreatorNamed(ocName, children));
	}
	@Test
	public void When_a_defining_element_is_deleted_the_corresponding_objectclass_is_also_deleted_from_the_palette() {
		String ocName = "deletetest OC";
		IZentaElement element = testdata.createNewObjectClass(ocName);
		String elemId = element.getId();
		ReferencesModelObjectBase oc = testdata.metamodel.getClassById(elemId);
		assertNotNull(oc);

		List<PaletteEntry> children = getObjectClassPaletteEntries();
		assertTrue(haveCreatorNamed(ocName, children));
		
		((IFolder)element.eContainer()).getElements().remove(element);
		assertNull(testdata.metamodel.getClassById(elemId));
		assertFalse(haveCreatorNamed(ocName, children));
	}
	@Test
	public void If_a_new_RelationClass_is_created_it_is_shown_on_the_ViewPoint() {
		ZentaDiagramEditorPalette palette = testdata.editor.getPaletteRoot();

		IRelationship newElement = testdata.createNewRelationClass("New test RC");
		RelationClass newRc = testdata.metamodel.getRelationClassReferencing(newElement);
		assertNotNull(newRc);
		PaletteContainer relationsgroup = palette._getRelationsGroup();
		assertNotNull(relationsgroup);
		@SuppressWarnings("unchecked")
		List<PaletteEntry> children = relationsgroup.getChildren();
		assertTrue(haveCreatorFor(newRc, children));
	}
		private boolean haveCreatorFor(ReferencesModelObject klass, List<PaletteEntry> children) {
			return haveCreatorNamed(klass.getName(),children);
		}
		private boolean haveCreatorNamed(String klass, List<PaletteEntry> children) {
			for ( PaletteEntry kid : children)
				if(klass.equals(kid.getLabel()))
					return true;
			return false;
		}
		private List<PaletteEntry> getObjectClassPaletteEntries() {
			ZentaDiagramEditorPalette palette = testdata.editor.getPaletteRoot();
			PaletteContainer objectsgroup = palette._getObjectsGroup();
			assertNotNull(objectsgroup);
			@SuppressWarnings("unchecked")
			List<PaletteEntry> children = objectsgroup.getChildren();
			return children;
		}
}
