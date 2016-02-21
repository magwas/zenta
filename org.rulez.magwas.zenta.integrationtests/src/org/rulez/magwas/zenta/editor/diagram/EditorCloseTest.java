package org.rulez.magwas.zenta.editor.diagram;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.ui.IWorkbenchPage;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class EditorCloseTest extends EditorTest {

	@Test
	public void if_a_diagram_is_deleted_the_corresponding_view_is_closed() throws InterruptedException {

		DiagramEditorStateListener listener = setUpModelandEditor();
		
		templateDiagram.delete();
		
		assertEquals(listener.state,"closed");
	}

	@Test
	public void if_a_diagram_is_moved_the_corresponding_view_is_not_closed() {

		DiagramEditorStateListener listener = setUpModelandEditor();
		IFolder newFolder = IZentaFactory.eINSTANCE.createFolder();
		builder.getModel().getElements().add(newFolder);
		
		
		IFolder oldFolder = (IFolder) templateDiagram.eContainer();
		
		((IDiagramModel) templateDiagram).move(oldFolder,newFolder);

		assertEquals(listener.state, null);
	}

	@Test
	public void if_a_diagram_is_moved_the_tree_is_modified_accordingly() {
		setUpModelandEditor();
		IFolder newFolder = IZentaFactory.eINSTANCE.createFolder();
		builder.getModel().getElements().add(newFolder);
		ArrayList<EObject> kidsBefore = new ArrayList<EObject>(newFolder.getElements());
		IFolder oldFolder = (IFolder) templateDiagram.eContainer();
		System.out.println("oldKids:"+oldFolder.getElements());

		oldFolder.getElements().remove(templateDiagram);
		newFolder.getElements().add(templateDiagram);
		
		System.out.println("oldKidsafter:"+oldFolder.getElements());
		ArrayList<EObject> kidsAfter = new ArrayList<EObject>(newFolder.getElements());
		System.out.println("kidsAfter="+kidsAfter);
		kidsAfter.removeAll(kidsBefore);
		assertEquals(1,kidsAfter.size());		

		
	}
	
	private DiagramEditorStateListener setUpModelandEditor() {
		ZentaDiagramEditor ed = openDiagramEditorWithFirstGeneration();
		IWorkbenchPage page = ed.getSite().getPage();
		DiagramEditorStateListener listener = new DiagramEditorStateListener();
		page.addPartListener(listener);
		return listener;
	}

}
