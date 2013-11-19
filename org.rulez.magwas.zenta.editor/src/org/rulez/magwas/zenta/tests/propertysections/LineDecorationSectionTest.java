package org.rulez.magwas.zenta.tests.propertysections;

import static org.junit.Assert.*;


import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.DiagramEditorInput;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.AssociationConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.impl.ZentaFactory;
import org.rulez.magwas.zenta.tests.HaveGUI;

public class LineDecorationSectionTest {

	private LineDecorationSection section;
	ModelAndEditPartTestData data;
	private ZentaDiagramEditor editor;

	@Test
	public void testEmptyInitialisation() throws PartInitException {
	}
	
	@Test
	public void testRealInitialisation() {
		ISelection a = section.getSelection();
		assertEquals(data.getEditPart(),((IStructuredSelection)a).getFirstElement());
	}
	
	@Test
	public void testDefaultButtonExistence() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		assertEquals(Button.class,but.getClass());
	}

	@Test//(expected=AssertionError.class)
	public void testInvalidDecoration() {
		IDiagramModelZentaConnection mco = data.getModelConnectionObject();
		mco.setLineDecoration("foo");
	}
	@Test
	public void testDefaultButtonPush() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		IDiagramModelZentaConnection mco = data.getModelConnectionObject();
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals("",mco.getLineDecoration());		
	}

	@Test
	@HaveGUI(waitUser=false)
	public void testGUILook() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		exerciser.run();
	}

	@Test
	public void testSetOneAttribute() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = exerciser.getButton("DashedLineDecoration");
		IDiagramModelZentaConnection mco = data.getModelConnectionObject();
		assertEquals(null,mco.getLineDecoration());		
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals("DashedLineDecoration",mco.getLineDecoration());	
	}

	@Test
	public void testSetTwoAttributes() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = exerciser.getButton("DashedLineDecoration");
		Button but2 = exerciser.getButton("SmallEndArrowDecoration");
		IDiagramModelZentaConnection mco = data.getModelConnectionObject();
		assertEquals(null,mco.getLineDecoration());		
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		but2.notifyListeners(SWT.Selection, event);
		assertEquals("DashedLineDecoration SmallEndArrowDecoration",mco.getLineDecoration());	
	}

	
	@Test
	public void testSetButtonStateAfterSettingOneAttribute() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = exerciser.getButton("DashedLineDecoration");
		IDiagramModelZentaConnection mco = data.getModelConnectionObject();
		mco.setLineDecoration("DashedLineDecoration");
		assertTrue(but.getSelection());
	}

	@Test
	public void testNullModelObject() throws PartInitException {
		LineDecorationSectionExerciser exerciser = getExerciser();
		exerciser.nullModelObject();
		section.refreshControls();
	}

	@Test
	public void testButtonStateOnInit() throws PartInitException {
		data = new ModelAndEditPartTestData();
		data.getModelConnectionObject().setLineDecoration("DashedLineDecoration");
		ZentaDiagramEditor editor = createEditor();
		section = new LineDecorationSectionExerciser(editor,data);
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = exerciser.getButton("DashedLineDecoration");
		assertTrue(but.getSelection());
	}

	@Test
	public void testButtonStateOnPartChange() throws PartInitException {
		data = new ModelAndEditPartTestData();
		IDiagramModelZentaConnection conn = data.getModelConnectionObject();
		conn.setLineDecoration("DashedLineDecoration");
		ZentaDiagramEditor editor = createEditor();
		section = new LineDecorationSectionExerciser(editor,data);
		AssociationConnectionEditPart conn2Part = data.getEditPart2();
		conn2Part.getModel().setLineDecoration("DottedLineDecoration");
		ISelection selection = new StructuredSelection(conn2Part);
		section.setInput(editor, selection);
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = exerciser.getButton("DottedLineDecoration");
		assertTrue(but.getSelection());
		Button but2 = exerciser.getButton("DashedLineDecoration");
		assertFalse(but2.getSelection());
	}


	@Test
	public void testButtonStateOnPartChangeToUndecorated() throws PartInitException {
		data = new ModelAndEditPartTestData();
		IDiagramModelZentaConnection conn = data.getModelConnectionObject();
		conn.setLineDecoration("DashedLineDecoration");
		ZentaDiagramEditor editor = createEditor();
		section = new LineDecorationSectionExerciser(editor,data);
		AssociationConnectionEditPart conn2Part = data.getEditPart2();
		ISelection selection = new StructuredSelection(conn2Part);
		section.setInput(editor, selection);
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but2 = exerciser.getButton("DashedLineDecoration");
		assertFalse(but2.getSelection());
	}

	private LineDecorationSectionExerciser getExerciser() {
		return (LineDecorationSectionExerciser)section;
	}

	@Before	
	public void setUp() throws PartInitException {
		data = new ModelAndEditPartTestData();
		editor = createEditor();
		section = new LineDecorationSectionExerciser(editor,data);
		checkSection();
	}

		ZentaDiagramEditor createEditor() throws PartInitException {
			ZentaDiagramEditor editor = new ZentaDiagramEditor();
			IEditorSite site = new EditorSiteMockup();
			ZentaFactory.init();
			IEditorInput input = createEditorInput();
			editor.init(site, input);
			return editor;
		}

			IEditorInput createEditorInput() {
				IEditorInput input = new DiagramEditorInput(data.getDiagramModelObject());
				return input;
			}

		void checkSection() {
			assertNotNull(getExerciser().getEObject());
			assertTrue(section instanceof LineDecorationSection);
			assertTrue(data.getEditPart() instanceof IDiagramConnectionEditPart);
			assertNotNull(section.getWidgetFactory());
		}
}
