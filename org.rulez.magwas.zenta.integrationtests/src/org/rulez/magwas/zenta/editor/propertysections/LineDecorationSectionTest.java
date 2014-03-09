package org.rulez.magwas.zenta.editor.propertysections;

import static org.junit.Assert.*;

import java.io.IOException;


import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Event;
import org.eclipse.ui.PartInitException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.BasicConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;
import org.rulez.magwas.zenta.integrationtests.HaveGUI;
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;

public class LineDecorationSectionTest {

	private LineDecorationSectionExerciser section;
	ModelAndEditPartTestData data;
	private ZentaDiagramEditor editor;
	
	@Before	
	public void setUp() throws PartInitException {
		data = new ModelAndEditPartTestData();
		section = new LineDecorationSectionExerciser(data);
		BasicConnectionEditPart ep = data.editPart;
		assertNotNull(ep);
		section._setElement(data.editPart);
		checkSection();
	}

		private void checkSection() {
			assertNotNull(section.getEObject());
			assertTrue(section instanceof LineDecorationSection);
			assertTrue(data.editPart instanceof IDiagramConnectionEditPart);
			assertNotNull(section.getWidgetFactory());
		}
		
	@SuppressWarnings("null")
	@After
	public void tearDown() throws IOException {
		IEditorModelManager.INSTANCE.saveModel(data.model);
		IEditorModelManager.INSTANCE.closeModel(data.model);
		assertNull(data.getStatus());
	}

	@Test
	@HaveGUI(waitUser=false)
	public void The_GUI_shows_buttons_for_each_decorations_and_a_default_button() {
		section.run();
	}

	@Test
	public void There_is_a_default_button() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		assertEquals(Button.class,but.getClass());
	}

	@Test
	public void invalid_decoration_name_is_ignored_on_the_GUI() {
		IDiagramModelZentaConnection mco = data.connection;
		mco.setLineDecoration("foo");
	}
	
	@Test
	public void pushing_default_button_when_no_decoration_results_in_no_decoration() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		IDiagramModelZentaConnection mco = data.connection;
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals("",mco.getLineDecoration());		
	}

	@Test
	public void pushing_default_button_when_there_is_decoration_results_in_no_decoration() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		Button but2 = exerciser.getButton("DashedLineDecoration");
		Button but3 = exerciser.getButton("SmallEndArrowDecoration");
		IDiagramModelZentaConnection mco = data.connection;
		Event event = new Event();
		but2.notifyListeners(SWT.Selection, event );
		but3.notifyListeners(SWT.Selection, event);
		assertEquals("DashedLineDecoration SmallEndArrowDecoration",mco.getLineDecoration());	
		but.notifyListeners(SWT.Selection, event );
		assertEquals("",mco.getLineDecoration());		
	}


	@Test
	public void Pushing_a_decoration_button_results_in_the_decoration_being_set() {
		Button but = section.getButton("DashedLineDecoration");
		IDiagramModelZentaConnection mco = data.connection;
		assertEquals(null,mco.getLineDecoration());		
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals("DashedLineDecoration",mco.getLineDecoration());
	}

	@Test
	public void When_two_buttons_are_pushed_both_decorations_are_set() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = exerciser.getButton("DashedLineDecoration");
		Button but2 = exerciser.getButton("SmallEndArrowDecoration");
		IDiagramModelZentaConnection mco = data.connection;
		assertEquals(null,mco.getLineDecoration());		
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		but2.notifyListeners(SWT.Selection, event);
		assertEquals("DashedLineDecoration SmallEndArrowDecoration",mco.getLineDecoration());	
	}

	@Test
	public void When_an_object_have_a_decoration_set_on_initialisation_the_corresponding_button_is_pushed() throws PartInitException {
		data = new ModelAndEditPartTestData();
		data.connection.setLineDecoration("DashedLineDecoration");
		section = new LineDecorationSectionExerciser(data);
		section._setElement(data.editPart);
		Button but = section.getButton("DashedLineDecoration");
		assertTrue(but.getSelection());
	}

	@Test
	public void When_a_decoration_set_on_the_model_object_the_corresponding_button_gets_selected() {
		Button but = section.getButton("DashedLineDecoration");
		IDiagramModelZentaConnection mco = data.connection;
		mco.setLineDecoration("DashedLineDecoration");
		section._setElement(data.editPart);
		assertTrue(but.getSelection());
	}

	@Test
	public void A_model_object_can_be_selected() throws PartInitException {
		LineDecorationSectionExerciser exerciser = getExerciser();
		exerciser.nullModelObject();
		section.refreshControls();
	}

	@Test
	public void When_part_selection_is_changed_button_state_follows_it() throws PartInitException {
		data = new ModelAndEditPartTestData();
		IDiagramModelZentaConnection conn = data.connection;
		conn.setLineDecoration("DashedLineDecoration");
		section = new LineDecorationSectionExerciser(data);
		BasicConnectionEditPart conn2Part = data.editPart;
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
	public void When_part_selection_is_changed_to_an_undecorated_object_buttons_get_deselected() throws PartInitException {
		data = new ModelAndEditPartTestData();
		IDiagramModelZentaConnection conn = data.connection;
		conn.setLineDecoration("DashedLineDecoration");
		section = new LineDecorationSectionExerciser(data);
		BasicConnectionEditPart conn2Part = data.editPart2;
		ISelection selection = new StructuredSelection(conn2Part);
		section.setInput(editor, selection);
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but2 = exerciser.getButton("DashedLineDecoration");
		assertFalse(but2.getSelection());
	}

	private LineDecorationSectionExerciser getExerciser() {
		return (LineDecorationSectionExerciser)section;
	}
}
