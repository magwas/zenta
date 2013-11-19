package org.rulez.magwas.zenta.tests.propertysections;

import static org.junit.Assert.*;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
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
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.ConnectionDecorationFactory;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.impl.ZentaFactory;
import org.rulez.magwas.zenta.tests.HaveGUI;

public class LineDecorationSectionTest {

	private LineDecorationSection section;
	ModelAndEditPartTestData data;

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

	@Test
	public void testDefaultButtonPush() {
		LineDecorationSectionExerciser exerciser = getExerciser();
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		IDiagramModelZentaConnection mco = data.getModelConnectionObject();
		mco.setLineDecoration("foo");
		assertEquals("foo",mco.getLineDecoration());		
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals(null,mco.getLineDecoration());		
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
		Button but = ((Button)exerciser.getInternal("but_assignmentDecor"));
		IDiagramModelZentaConnection mco = data.getModelConnectionObject();
		assertEquals(null,mco.getLineDecoration());		
		Event event = new Event();
		but.notifyListeners(SWT.Selection, event );
		assertEquals("assignmentDecor",mco.getLineDecoration());	
	}

	private LineDecorationSectionExerciser getExerciser() {
		return (LineDecorationSectionExerciser)section;
	}

	@Before
	public void setUp() throws PartInitException {
		data = new ModelAndEditPartTestData();
		ConnectionDecorationFactory.getInstance();
		ZentaDiagramEditor editor = createEditor();
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
