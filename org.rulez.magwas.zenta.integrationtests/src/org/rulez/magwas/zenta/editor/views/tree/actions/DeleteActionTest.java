package org.rulez.magwas.zenta.editor.views.tree.actions;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.views.tree.TreeModelViewer;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class DeleteActionTest {

	private TestModel builder;
	private ArrayList<IDiagramModelComponent> dos;
	private IFolder folder;

	@Before
	public void setUp() {
		builder = new TestModel();
		builder.createFullModel();
		IEditorModelManager.INSTANCE.openModel(builder.getModel());
	}

	@After
	public void tearDown() {
		IEditorModelManager.INSTANCE.removeModelWithoutDirtyCheck(builder.getModel());
	}

	@Test
	public void Delete_command_deletes_relation_all_its_diagobjs_from_diagrams_and_reparents_kids() throws IOException {
		List<Object> l = new ArrayList<Object>();
		l.add(builder.firstgenRelation);
		ArrayList<IDiagramModelComponent> dos = new ArrayList<IDiagramModelComponent>();
		IBasicObject ancie = builder.firstgenRelation.getAncestor();
		dos.addAll(builder.firstgenRelation.getDiagComponents());
		assertEquals(1,dos.size());

		doDelete(l);
		
		assertDeleted(builder.firstgenRelation);
		assertEquals(ancie, builder.secondgenRelation.getAncestor());
		for(IDiagramModelComponent c : dos) {
			assertDeleted(c);
		}
		
	}

	@Test
	public void Delete_command_deletes_object__its_connected_relations__all_of_their_diagram_objects_and_reroots_kids() throws IOException {
		List<Object> l = new ArrayList<Object>();
		l.add(builder.getFirstgenSource());
		ArrayList<IDiagramModelComponent> dos = new ArrayList<IDiagramModelComponent>();
		dos.addAll(builder.firstgenRelation.getDiagComponents());
		dos.addAll(builder.firstgenSource.getDiagComponents());
		
		doDelete(l);
		
		assertDeleted(builder.firstgenSource);
		assertDeleted(builder.firstgenRelation);
		for(IDiagramModelComponent c : dos) {
			assertDeleted(c);
		}
		
	}

	@Test
	public void Delete_command_does_not_delete_root_object() throws IOException {
		List<Object> l = new ArrayList<Object>();
		IBasicObject rootElement = builder.getFirstgenSource().getAncestor();
		l.add(rootElement);
		
		assertUnDeleted(rootElement);
		doDelete(l);
		assertUnDeleted(rootElement);
		
	}

	
	@Test
	public void Delete_command_deletes_folder_its_contents_and_their_dependencies() throws IOException {
		List<Object> l = new ArrayList<Object>();
		folder = builder.factory.createFolder();
		builder.getModel().getFolders().add(folder);
		folder.getElements().add(builder.firstgenSource);
		l.add(folder);
		assertTrue(folder.getElements().contains(builder.firstgenSource));
		dos = new ArrayList<IDiagramModelComponent>();
		dos.addAll(builder.firstgenRelation.getDiagComponents());
		dos.addAll(builder.firstgenSource.getDiagComponents());
		
		doDelete(l);
		
		assertDeleted(folder);
		assertDeleted(builder.firstgenSource);
		assertDeleted(builder.firstgenRelation);
		for(IDiagramModelComponent c : dos) {
			assertDeleted(c);
		}
		
	}

	@Test
	public void Delete_can_be_undone() throws IOException {
		Delete_command_deletes_folder_its_contents_and_their_dependencies();
		IZentaModel model = builder.getModel();
		CommandStack stack = Util.verifyNonNull((CommandStack) model.getAdapter(CommandStack.class));
		
		assertTrue(stack.canUndo());
		Command undoCommand = stack.getUndoCommand();
		undoCommand.undo();

		assertUnDeleted(folder);
		assertUnDeleted(builder.firstgenSource);
		assertUnDeleted(builder.firstgenRelation);
		for(IDiagramModelComponent c : dos) {
			assertUnDeleted(c);
		}

	}
	@Test
	public void Delete_command_deletes_diagram() {
		List<Object> l = new ArrayList<Object>();
		l.add(builder.getDiagramModel());
		
		doDelete(l);
		
		assertDeleted(builder.getDiagramModel());
	}
	
	private void doDelete(List<Object> l) {
		IStructuredSelection s = mock(IStructuredSelection.class);
		doReturn(l).when(s).toList();
		TreeModelViewer viewer = mock(TreeModelViewer.class);
		doReturn(s).when(viewer).getSelection();
		DeleteAction action = new DeleteAction(viewer);
		DeleteAction spiedAction = spy(action);
		doReturn(true).when(spiedAction).doUserWantToRemoveObjectsEvenIfReferencedInDiagram();
		spiedAction.run();
		
		verify(s,atLeast(1)).toList();
	}

	private void assertDeleted(EObject obj) {
		if(null != obj.eContainer())
			fail(String.format("%s is not deleted", obj));
	}
	private void assertUnDeleted(EObject obj) {
		if(null == obj.eContainer())
			fail(String.format("%s is still deleted", obj));
	}

}
