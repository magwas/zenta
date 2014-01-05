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
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.tests.HaveGUI;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

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
		
	@After
	public void tearDown() throws IOException {
		IEditorModelManager.INSTANCE.saveModel(data.model);
		IEditorModelManager.INSTANCE.closeModel(data.model);
		assertNull(data.getStatus());
	}

	@Test
	@HaveGUI(waitUser=false)
	public void testTheGUIShowsButtonsForEachDecorationsAndADefaultButton() {
		section.run();
	}

	@Test
	public void testThereIsADefaultButton() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		assertEquals(Button.class,but.getClass());
	}

	@Test
	public void testInvalidDecorationNameIsIgnoredOnGUI() {
		IDiagramModelZentaConnection mco = data.connection;
		mco.setLineDecoration("foo");
	}
	
	@Test
	public void testPushingDefaultButtonWhenNoDecorationsResultsNoDecoration() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		IDiagramModelZentaConnection mco = data.connection;
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals("",mco.getLineDecoration());		
	}

	@Test
	public void testPushingDefaultButtonWhenThereAreDecorationsResultNoDecoration() {
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
	public void testPushingADecorationButtonResultsInTheDecorationBeingSet() {
		Button but = section.getButton("DashedLineDecoration");
		IDiagramModelZentaConnection mco = data.connection;
		assertEquals(null,mco.getLineDecoration());		
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals("DashedLineDecoration",mco.getLineDecoration());
	}

	@Test
	public void testWhenTwoButtonsArePushedBothDecorationsAreSet() {
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
	public void testWhenAnObjectHaveADecorationSetOnInitialisationTheCorrespondingButtonIsPushed() throws PartInitException {
		data = new ModelAndEditPartTestData();
		data.connection.setLineDecoration("DashedLineDecoration");
		section = new LineDecorationSectionExerciser(data);
		section._setElement(data.editPart);
		Button but = section.getButton("DashedLineDecoration");
		assertTrue(but.getSelection());
	}

	@Test
	public void testWhenADecoratonSetOnTheModelObjectTheCOrrespondingButtonGetsSelected() {
		Button but = section.getButton("DashedLineDecoration");
		IDiagramModelZentaConnection mco = data.connection;
		mco.setLineDecoration("DashedLineDecoration");
		section._setElement(data.editPart);
		assertTrue(but.getSelection());
	}

	@Test
	public void testNoCrashWhenNoModelObjectSelected() throws PartInitException {
		LineDecorationSectionExerciser exerciser = getExerciser();
		exerciser.nullModelObject();
		section.refreshControls();
	}

	@Test
	public void testWhenPartSelectionIsChangedButtonStateFollowsIt() throws PartInitException {
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
	public void testWhenPartSelectionIsChangedToAnUndecoratedObjectButtonsGetDeselected() throws PartInitException {
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
