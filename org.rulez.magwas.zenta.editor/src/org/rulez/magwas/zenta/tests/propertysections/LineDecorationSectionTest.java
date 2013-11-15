package org.rulez.magwas.zenta.tests.propertysections;

import static org.junit.Assert.*;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Button;
import org.eclipse.ui.IWorkbenchPart;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.ZentaDiagramEditor;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.figures.connections.ConnectionDecorationFactory;
import org.rulez.magwas.zenta.editor.propertysections.LineDecorationSection;

public class LineDecorationSectionTest {

	private LineDecorationSection section;
	private DiagramConnectionMockup data;

	@Test
	public void testEmptyInitialisation() {
		assertTrue(data.getEditPart() instanceof IDiagramConnectionEditPart);
		assertNotNull(section.getWidgetFactory());
	}

	@Ignore
	@Test
	public void testRealInitialisation() {
		ISelection a = section.getSelection();
		assertEquals(data.getEditPart(),((IStructuredSelection)a).getFirstElement());
	}

	@Ignore
	@Test
	public void testDefaultButton() {
		LineDecorationSectionExerciser exerciser = (LineDecorationSectionExerciser)section;
		Button but = ((Button)exerciser.getInternal("DefaultButton"));
		System.out.println("but="+but);
		but.setSelection(true);
		assertTrue(but.getSelection());
		assertEquals(null,data.getModelConnectionObject().getLineDecoration());		
	}



	@Before
	public void setUp() {
		data = new DiagramConnectionMockup();
		ConnectionDecorationFactory.getInstance();
		section = new LineDecorationSectionExerciser();
		assertTrue(section instanceof LineDecorationSection);
		ISelection selection = new SelectionMockup(data.getEditPart());
		IWorkbenchPart editor = new ZentaDiagramEditor();
		section.setInput(editor, selection);
	}
}
