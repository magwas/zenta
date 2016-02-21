package org.rulez.magwas.zenta.editor.diagram;

import static org.junit.Assert.*;

import org.eclipse.ui.IWorkbenchPage;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;

public class EditorCloseTest extends EditorTest {

	@Test
	public void if_a_diagram_is_deleted_the_corresponding_view_is_closed() throws InterruptedException {

		DiagramEditorStateListener listener = setUpModelandEditor();
		
		templateDiagram.delete();
		
		assertEquals(listener.state,"closed");
	}

	private DiagramEditorStateListener setUpModelandEditor() {
		ZentaDiagramEditor ed = openDiagramEditorWithFirstGeneration();
		IWorkbenchPage page = ed.getSite().getPage();
		DiagramEditorStateListener listener = new DiagramEditorStateListener();
		page.addPartListener(listener);
		return listener;
	}

	@Test
	public void if_a_diagram_is_moved_the_corresponding_view_is_not_closed() {

		DiagramEditorStateListener listener = setUpModelandEditor();
		IFolder newFolder = IZentaFactory.eINSTANCE.createFolder();
		builder.getModel().getElements().add(newFolder);
		templateDiagram.move((IFolder) templateDiagram.eContainer(),newFolder);
		assertEquals(listener.state, null);

	}

}
