package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class DeleteTest {

	private TestModel builder;

	@Before
	public void setUp() {
		builder = new TestModel();
		builder.createFullModel();
	}

	@After
	public void tearDown() {
	}

	@Test
	public void Delete_command_deletes_relation_all_its_diagobjs_from_diagrams_and_reparents_kids() throws IOException {
		List<INameable> l = new ArrayList<INameable>();
		l.add(builder.firstgenRelation);
		ArrayList<IDiagramModelComponent> dos = new ArrayList<IDiagramModelComponent>();
		IBasicObject ancie = builder.firstgenRelation.getAncestor();
		dos.addAll(builder.firstgenRelation.getDiagComponents());
		assertEquals(1,dos.size());

		List<UndoState> states = doDelete(l);
		
		assertDeleted(builder.getFirstgenRelation());
		assertEquals(ancie, builder.secondgenRelation.getAncestor());
		assertAllDiagramModelComponentsAreDeleted(dos);
		
		undelete(states);
		
		assertUnDeleted(builder.getFirstgenRelation());
		assertEquals(builder.firstgenRelation, builder.secondgenRelation.getAncestor());
		assertAllDiagramModelComponentsAreUnDeleted(dos);
		
	}

	@Test
	public void Delete_command_deletes_object__its_connected_relations__all_of_their_diagram_objects_and_reparents_kids() throws IOException {
		List<INameable> l = new ArrayList<INameable>();
		l.add(builder.getFirstgenSource());
		ArrayList<IDiagramModelComponent> dos = new ArrayList<IDiagramModelComponent>();
		dos.addAll(builder.firstgenRelation.getDiagComponents());
		dos.addAll(builder.firstgenSource.getDiagComponents());
		IBasicObject sourceParent = builder.firstgenSource.getAncestor();
		IBasicObject relationParent = builder.firstgenRelation.getAncestor();
		
		List<UndoState> states = doDelete(l);
		
		assertDeleted(builder.getFirstgenSource());
		assertDeleted(builder.getFirstgenRelation());
		assertAllDiagramModelComponentsAreDeleted(dos);
		assertEquals(builder.secondgenRelation.getAncestor(), relationParent);
		assertEquals(builder.secondgenSource.getAncestor(), sourceParent);
		
		undelete(states);
		
		assertUnDeleted(builder.getFirstgenSource());
		assertUnDeleted(builder.getFirstgenRelation());
		assertAllDiagramModelComponentsAreUnDeleted(dos);
	}

	@Test
	public void Deleting_a_folder_deletes_all_things_related() throws IOException {
		IFolder folder = builder.factory.createFolder();
		builder.getModel().getFolders().add(folder);
		folder.getElements().add(builder.firstgenTarget);
		IBasicObject ancie = builder.getFirstgenRelation().getAncestor();
		
		UndoState state = folder.delete();
		
		assertDeleted(folder);
		assertDeleted(builder.getFirstgenTarget());
		assertDeleted(builder.getFirstgenRelation());
		assertEquals(ancie, builder.secondgenRelation.getAncestor());
		
		state.undelete();
		
		assertUnDeleted(folder);
		assertUnDeleted(builder.getFirstgenTarget());
		assertUnDeleted(builder.getFirstgenRelation());
		assertEquals(builder.getFirstgenRelation(),builder.secondgenRelation.getAncestor());
		
	}

	private List<UndoState> doDelete(List<INameable> l) {
		List<UndoState> statelist = new ArrayList<UndoState>();
		for(INameable obj : l)
			statelist.add(obj.delete());
		return statelist;
	}
	
	private void undelete(List<UndoState> states) {
		for(UndoState state : states)
			state.undelete();
	}


	private void assertDeleted(INameable obj) {
		if(!obj.isDeleted())
			fail(String.format("%s is not deleted", obj));
	}
	
	private void assertUnDeleted(INameable obj) {
		if(obj.isDeleted())
			fail(String.format("%s is still deleted", obj));
	}

	@SuppressWarnings("null")
	private void assertAllDiagramModelComponentsAreDeleted(
			ArrayList<IDiagramModelComponent> dos) {
		for(IDiagramModelComponent c : dos) {
			assertDeleted(c);
		}
	}
	@SuppressWarnings("null")
	private void assertAllDiagramModelComponentsAreUnDeleted(
			ArrayList<IDiagramModelComponent> dos) {
		for(IDiagramModelComponent c : dos) {
			assertUnDeleted(c);
		}		
	}

}
