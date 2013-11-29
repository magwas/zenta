package org.rulez.magwas.zenta.tests.editor.views.tree.actions;

import static org.junit.Assert.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.commands.CreateRelationCommand;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.views.tree.actions.TreeModelViewActionFactory;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.tests.utils.ModelTestData;
import org.rulez.magwas.zenta.tests.ModelAndEditPartTestData;

public class TreeModelViewActionFactoryTest {

	
	public ModelAndEditPartTestData data;
	private TreeModelViewActionFactory fixture;
	
	//FIXME: canvas and diagram view missing on folders.
	//FIXME: no connectors

	@Before
	public void Initializes_with_a_model() {
		data = new ModelAndEditPartTestData();
		fixture = new TreeModelViewActionFactory(data.model);
		assertNotNull(fixture.getMetamodel());
	}
	
	@Test
	public void Objects_are_created_in_the_respective_folder() {
		IZentaElement selected = data.getElementById("8495ea84");
		IFolder folder = ModelTestData.getFolderByKid(selected);
		ArrayList<EObject> kidsBefore = new ArrayList<EObject>(folder.getElements());
		IAction action = getAction(selected, "Data");
		assertNotNull(action);
		action.run();
		ArrayList<EObject> kidsAfter = new ArrayList<EObject>(folder.getElements());
		kidsAfter.removeAll(kidsBefore);
		assertEquals(1,kidsAfter.size());
	}
	
	@Test
	public void Relations_are_created_in_the_folder_of_the_source_element() {
		IZentaElement target = data.getElementById("23138a61");
		IZentaElement source = data.getElementById("a885cd76");
		RelationClass relclass = (RelationClass) data.metamodel.getClassById("a972e26e");
		assertNotNull(relclass);
		CreateRelationCommand command = new CreateRelationCommand(source,target,relclass);
		IFolder folder = ModelTestData.getFolderByKid(source);
		ArrayList<EObject> kidsBefore = new ArrayList<EObject>(folder.getElements());
		command.execute();
		ArrayList<EObject> kidsAfter = new ArrayList<EObject>(folder.getElements());
		kidsAfter.removeAll(kidsBefore);
		assertEquals(1,kidsAfter.size());		
	}

	private IAction getAction(IZentaElement selected, String description) {
		List<IAction> actions = fixture.getNewObjectActions(selected);
		for(IAction action : actions)
			if(description.equals(action.getText()))
				return action;
		return null;
	}

	@After
	public void tearDown() throws IOException {
		IEditorModelManager.INSTANCE.saveModel(data.model);
		fixture = null;
	}

}
