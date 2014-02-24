package org.rulez.magwas.zenta.editor.diagram;


import static org.junit.Assert.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteEntry;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.WorkbenchException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.nonnul.NonNullListIterator;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditorPalette;
import org.rulez.magwas.zenta.editor.diagram.editparts.business.BasicObjectEditPart;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.ZentaElementBase;
import org.rulez.magwas.zenta.model.testutils.ModelAndMetaModelTestData;
import org.rulez.magwas.zenta.model.viewpoints.IViewpoint;
import org.rulez.magwas.zenta.model.viewpoints.ViewpointsManager;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.tests.UITestWindow;

public class ZentaDiagramEditorPaletteTest {

	private ModelAndEditPartTestData testdata;
	private MagicConnectionCreationToolExerciser tool;

	@Before
	public void setUp() {
		testdata = new ModelAndEditPartTestData();
	}
	
	@After
	public void tearDown() {
		assertNull(testdata.getStatus());
	}

	@Test
	public void havePalette() throws PartInitException, WorkbenchException {
		EObject element = testdata.getById("2ea99535");
		assertNotNull(element);
		
		List<PaletteEntry> children = ModelAndEditPartTestData.getObjectClassPaletteEntries(testdata.getEditor());
		for (NonNullListIterator<IBasicObject> iterator = testdata.metamodel.getObjectClasses().iterator(); iterator
				.hasNext();) {
			IBasicObject klass = iterator.next();
			assertTrue(ModelAndEditPartTestData.haveCreatorFor(klass, children));
		}
	}
	
	@Test
	public void The_palette_contains_controls() {
		ZentaDiagramEditorPalette palette = testdata.getEditor().getPaletteRoot();
		PaletteContainer objectsgroup = palette._getControlsGroup();
		assertNotNull(objectsgroup);
		@SuppressWarnings("unchecked")
		List<PaletteEntry> children = objectsgroup.getChildren();
		List<String> expectedMenu = Arrays.asList(
				"Palette Entry (Select)",
				"Palette Container (Marquee Selection Tools)",
				"Palette Entry (Format Painter (empty))"
				);
		assertEquals(expectedMenu.toString(),children.toString());
	}
	@Test
	public void The_palette_contains_extras_group_with_two_entries_if_no_viewpoint_is_set() {
		ZentaDiagramEditorPalette palette = testdata.getEditor().getPaletteRoot();
		palette.setViewpoint(null);
		assertNull(palette._getViewPoint());
		PaletteContainer objectsgroup = palette._getExtrasGroup();
		assertNotNull(objectsgroup);
		@SuppressWarnings("unchecked")
		List<PaletteEntry> children = objectsgroup.getChildren();
		List<String> expectedMenu = Arrays.asList(
				"Palette Entry (Note)",
				"Palette Entry (Group)"
				);
		assertEquals(expectedMenu.toString(),children.toString());
	}
	@Test
	public void The_palette_contains_extras_group_with_three_entries_if_viewpoint_is_set() {
		assertNotNull(testdata.model);
		IViewpoint vp = ViewpointsManager.INSTANCE.getViewpoint(testdata.getTemplateDiagramModel());
		assertNotNull(vp);
		ZentaDiagramEditorPalette palette = testdata.getEditor().getPaletteRoot();
		palette.setViewpoint(vp);
		PaletteContainer objectsgroup = palette._getExtrasGroup();
		assertNotNull(objectsgroup);
		@SuppressWarnings("unchecked")
		List<PaletteEntry> children = objectsgroup.getChildren();
		List<String> expectedMenu = Arrays.asList(
				"Palette Entry (Note)",
				"Palette Entry (Group)",
				"Palette Entry (Connection)"
				);
		assertEquals(expectedMenu.toString(),children.toString());		
	}
	
	public void Magic_Connector_magically_connects_two_diagram_objects() throws IOException {
		ModelAndEditPartTestData data = new ModelAndEditPartTestData();
		BasicObjectEditPart spart = (BasicObjectEditPart) data.getEditPartFor("b2608459");
		BasicObjectEditPart tpart = (BasicObjectEditPart) data.getEditPartFor("88f40127");
		assertEquals(1,spart.getModel().getSourceConnections().size());
		tool = new MagicConnectionCreationToolExerciser(spart, tpart, "TriesToDo", data);
		assertFalse(tool.failed);
		assertEquals(2,spart.getModel().getSourceConnections().size());
		IEditorModelManager.INSTANCE.saveModel(data.getModel());
	}
	
	@Test
	@HaveGUI(waitUser = false)
	public void Magic_Connector_magically_knows_what_to_connect() throws IOException {
		UITestWindow win = new UITestWindow();
		ModelAndEditPartTestData data = new ModelAndEditPartTestData();
		BasicObjectEditPart spart = (BasicObjectEditPart) data.getEditPartFor("b2608459");
		assertEquals(1,spart.getModel().getSourceConnections().size());
		tool = new MagicConnectionCreationToolExerciser(spart, "Basic Object/Basic Relation", data);
		assertFalse(tool.failed);
		win.showWindow();
		assertEquals(2,spart.getModel().getSourceConnections().size());
		Set<String> expectedMenu = new HashSet<String>(Arrays.asList(
				"Basic Object",
				"Basic Object/Basic Relation",
				"Data",
				"Data/Basic Relation",
				"ProcessStep",
				"ProcessStep/Basic Relation",
				"NotActuallyDocumentation",
				"NotActuallyDocumentation/Basic Relation",
				"Procedure",
				"Procedure/Basic Relation",
				"Procedure/TriesToDo",
				"User",
				"User/Basic Relation",
				"Title",
				"Title/Basic Relation"
				));

		assertEquals(expectedMenu,tool.getMenu());
		IEditorModelManager.INSTANCE.saveModel(data.getModel());
	}

	@Test
	public void Magic_Connector_magically_knows_what_to_connect_on_non_template_as_well() throws IOException {
		IBasicObject procedure = (IBasicObject) testdata.getById("f33bd0d2");
		IFolder folder = ModelAndMetaModelTestData.getFolderByKid(procedure);
		IZentaElement element = (IZentaElement) procedure.create(folder);
		element.setName("testmcmkwtcontaw");
		IZentaDiagramModel dia = testdata.getNonTemplateDiagramModel();
		IDiagramModelZentaObject dmo = ModelAndEditPartTestData.createDMOFor(element);
		dia.getChildren().add(dmo);
		testdata.focusOnDiagram(dia.getId());
		BasicObjectEditPart spart = (BasicObjectEditPart) testdata.getEditPartFor(dmo.getId());
		assertNotNull(spart);

		assertEquals(0,spart.getModel().getSourceConnections().size());
		tool = new MagicConnectionCreationToolExerciser(spart, "Basic Object/Basic Relation", testdata);
		assertFalse(tool.failed);
		assertEquals(1,spart.getModel().getSourceConnections().size());
		Set<String> expectedMenu = new HashSet<String>(Arrays.asList(
				"Basic Object",
				"Basic Object/Basic Relation",
				"User",
				"User/Basic Relation",
				"Data",
				"Data/Basic Relation",
				"Data/uses",
				"Procedure",
				"Procedure/Basic Relation",
				"ProcessStep",
				"ProcessStep/Basic Relation",
				"NotActuallyDocumentation",
				"NotActuallyDocumentation/Basic Relation",
				"NotActuallyDocumentation/describes",
				"Title",
				"Title/Basic Relation"
				));
		assertEquals(expectedMenu,tool.getMenu());
		IEditorModelManager.INSTANCE.saveModel(testdata.getModel());
	}

	@Test
	public void The_created_objects_are_part_of_a_model() throws IOException {
		IBasicObject userClass = (IBasicObject) testdata.metamodel.getClassById("ea94cf6c");
		IFolder folder = (IFolder) testdata.getById("13144af6");
		ZentaElementBase newElement = (ZentaElementBase) userClass.create(folder);
		folder.getElements().add(newElement);
		assertEquals(testdata.model,newElement.getZentaModel());
		IEditorModelManager.INSTANCE.saveModel(testdata.getModel());
	}
	
	@Test
	public void If_a_new_ObjectClass_is_created_it_is_shown_on_the_ViewPoint() {
		ZentaDiagramEditorPalette palette = testdata.getEditor().getPaletteRoot();

		PaletteContainer objectsgroup0 = palette._getObjectsGroup();
		assertNotNull(objectsgroup0);

		String elementName = "New test OC";
		IBasicObject newElement = testdata.createNewObjectClass(elementName);
		
		PaletteContainer objectsgroup = palette._getObjectsGroup();
		List<PaletteEntry> children = getChildrenForRelationsGroup(objectsgroup);
		assertTrue(ModelAndEditPartTestData.haveCreatorFor(newElement, children));
	}
	
	@Test
	public void When_a_defining_diagram_object_is_deleted_the_corresponding_objectclass_is_also_deleted_from_the_palette() {
		String ocName = "deletetest OC";
		IBasicObject element = testdata.createNewObjectClass(ocName);
		String elemId = element.getId();
		IBasicObject oc = testdata.metamodel.getClassById(elemId);
		assertNotNull(oc);
		
		IDiagramModelZentaObject diagElement = element.getDiagObjects().get(0);
		IDiagramModelContainer dia = (IDiagramModelContainer) diagElement.eContainer();
		
		List<PaletteEntry> children = ModelAndEditPartTestData.getObjectClassPaletteEntries(testdata.getEditor());
		assertTrue(ModelAndEditPartTestData.haveCreatorNamed(ocName, children));
		dia.getChildren().remove(diagElement);
		assertFalse(element.isTemplate());
		assertFalse(ModelAndEditPartTestData.haveCreatorNamed(ocName, children));
	}
	@Test
	public void When_a_defining_element_is_deleted_the_corresponding_objectclass_is_also_deleted_from_the_palette() {
		String ocName = "deletetest OC";
		IZentaElement element = testdata.createNewObjectClass(ocName);
		String elemId = element.getId();
		IBasicObject oc = testdata.metamodel.getClassById(elemId);
		assertNotNull(oc);

		List<PaletteEntry> children = ModelAndEditPartTestData.getObjectClassPaletteEntries(testdata.getEditor());
		assertTrue(ModelAndEditPartTestData.haveCreatorNamed(ocName, children));
		element.getZentaModel().delete(element);
		boolean thrown = false;
		try {
			testdata.metamodel.getClassById(elemId);
		} catch (NoSuchElementException e) {
			thrown = true;
		}
		assertTrue(thrown);
		assertFalse(ModelAndEditPartTestData.haveCreatorNamed(ocName, children));
	}
	@Test
	public void If_a_new_RelationClass_is_created_it_is_shown_on_the_ViewPoint() {
		ZentaDiagramEditorPalette palette = testdata.getEditor().getPaletteRoot();

		IBasicRelationship newRelation = testdata.createNewRelationClass("New test RC");
		assertTrue(newRelation.isTemplate());
		PaletteContainer relationsgroup = palette._getRelationsGroup();
		@NonNull List<PaletteEntry> children = getChildrenForRelationsGroup(relationsgroup);
		assertTrue(ModelAndEditPartTestData.haveCreatorFor(newRelation, children));
	}

	private @NonNull List<PaletteEntry> getChildrenForRelationsGroup(
			PaletteContainer relationsgroup) {
		assertNotNull(relationsgroup);
		@SuppressWarnings("unchecked")
		List<PaletteEntry> children = Util.verifyNonNull(relationsgroup.getChildren());
		return children;
	}
	@Test
	public void If_a_RelationClass_is_deleted_it_is_removed_from_the_Palette() {
		ZentaDiagramEditorPalette palette = testdata.getEditor().getPaletteRoot();

		IBasicRelationship newElement = testdata.createNewRelationClass("New test RC");
		assertTrue(newElement.isTemplate());
		PaletteContainer relationsgroup = palette._getRelationsGroup();
		List<PaletteEntry> children = getChildrenForRelationsGroup(relationsgroup);
		assertTrue(ModelAndEditPartTestData.haveCreatorFor(newElement, children));
		
		newElement.getZentaModel().delete(newElement);
		assertFalse(newElement.isTemplate());
		assertFalse(ModelAndEditPartTestData.haveCreatorFor(newElement, children));
	}
	@Test
	public void A_defining_element_with_a_nondefining_connection_can_be_removed() {
		IBasicRelationship baserc = testdata.metamodel.getBuiltinRelationClass();
		IDiagramModel dm = testdata.getTemplateDiagramModel();
		IBasicRelationship newRelation = testdata.createUnnamedRelation(baserc, dm);
		assertFalse(newRelation.isTemplate());

		IZentaElement destElem = newRelation.getTarget();
		
		IDiagramModelZentaConnection reldmc = newRelation.getDiagConnections().get(0);
		assertNotNull(reldmc.eContainer());
		IDiagramModelZentaObject dmo = destElem.getDiagObjects().get(0);
		IDiagramModelContainer container = (IDiagramModelContainer) dmo.eContainer();
		
		IDiagramModelObject ccontainer = (IDiagramModelObject) reldmc.eContainer();
		
		assertFalse(newRelation.isTemplate());
		EList<IDiagramModelObject> kids = container.getChildren();
		
		EList<IDiagramModelConnection> kkids = ccontainer.getSourceConnections();
		int nn = kkids.size();
		int n = kids.size();
		
		kids.remove(dmo);
		kkids.remove(reldmc);

		assertNull(reldmc.eContainer());

		assertEquals(nn-1,kkids.size());
		assertEquals(n-1,kids.size());
	}
}
