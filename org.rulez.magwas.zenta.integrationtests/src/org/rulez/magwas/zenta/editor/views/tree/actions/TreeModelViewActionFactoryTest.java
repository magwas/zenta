package org.rulez.magwas.zenta.editor.views.tree.actions;

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
import org.rulez.magwas.zenta.integrationtests.ModelAndEditPartTestData;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.testutils.ModelTestData;

public class TreeModelViewActionFactoryTest {

	
	public ModelAndEditPartTestData testdata;
	private TreeModelViewActionFactory fixture;
	
	@Before
	public void Initializes_with_a_model() {
		testdata = new ModelAndEditPartTestData();
		fixture = new TreeModelViewActionFactory(testdata.getModel());
		assertNotNull(fixture.getMetamodel());
	}
	
	@After
	public void tearDown() throws IOException {
		IEditorModelManager.INSTANCE.saveModel(testdata.getModel());
		fixture = null;
		assertNull(testdata.getStatus());
	}

	@Test
	public void Objects_are_created_in_the_respective_folder() {
		IZentaElement selected = testdata.getElementById("8495ea84");
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
		IZentaElement target = testdata.getElementById("23138a61");
		IZentaElement source = testdata.getElementById("a885cd76");
		IBasicRelationship relclass = (IBasicRelationship) testdata.metamodel.getClassById("a972e26e");
		assertNotNull(relclass);
		CreateRelationCommand command = new CreateRelationCommand(source,target,relclass);
		IFolder folder = ModelTestData.getFolderByKid(source);
		ArrayList<EObject> kidsBefore = new ArrayList<EObject>(folder.getElements());
		command.execute();
		ArrayList<EObject> kidsAfter = new ArrayList<EObject>(folder.getElements());
		kidsAfter.removeAll(kidsBefore);
		assertEquals(1,kidsAfter.size());		
	}

	@Test
	public void New_simple_objects_are_not_shown_in_the_New_menu() {
		IFolder selected = (IFolder) testdata.getById("196115c6");//Model root folder

		IDiagramModel dm = (IDiagramModel) testdata.getById("22d134df");

		String id = "ea94cf6c";//User
		IZentaElement user = testdata.getElementById(id);
		IFolder folder = ModelTestData.getFolderByKid(user);
		IBasicObject oc = testdata.metamodel.getBuiltinObjectClass();
		IBasicObject newElement = (IBasicObject) oc.create(folder);

		IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();

		assertNotNull(dmo);
		assertFalse("emptyShape".equals(dmo.getElementShape()));
		dmo.setElementShape("emptyShape");
		dmo.setZentaElement(newElement);
		dmo.setBounds(0, 0, 100, 100);


		dm.getChildren().add(dmo);
		newElement.setName("New test OCke");

		assertFalse(newElement.isTemplate());

		assertElementFound(selected, false);
	}

	@Test
	public void New_ObjectClasses_are_shown_in_the_New_menu() {
		IFolder selected = (IFolder) testdata.getById("196115c6");//Model root folder
		
		IDiagramModel dm = testdata.getTemplateDiagramModel();

		String id = "ea94cf6c";//User
		IZentaElement user = testdata.getElementById(id);
		IFolder folder = ModelTestData.getFolderByKid(user);
		IBasicObject oc = testdata.metamodel.getBuiltinObjectClass();
		IBasicObject newElement = (IBasicObject) oc.create(folder);

		IDiagramModelZentaObject dmo = IZentaFactory.eINSTANCE.createDiagramModelZentaObject();

		assertNotNull(dmo);
		assertFalse("emptyShape".equals(dmo.getElementShape()));
		dmo.setElementShape("emptyShape");
		dmo.setZentaElement(newElement);
		dmo.setBounds(0, 0, 100, 100);


		dm.getChildren().add(dmo);
		newElement.setName("New test OCke");

		assertTrue(newElement.isTemplate());

		assertElementFound(selected, true);
	}

	private void assertElementFound(IFolder selected, boolean shouldfind) {
		List<IAction> newactions = fixture.getNewObjectActions(selected);

		boolean found = false;
		for(IAction action : newactions) {
			if(action.getText().equals("New test OCke"))
				found = true;
		}
		assertEquals(shouldfind, found);
	}
	
	private IAction getAction(IZentaElement selected, String description) {
		List<IAction> actions = fixture.getNewObjectActions(selected);
		for(IAction action : actions)
			if(description.equals(action.getText()))
				return action;
		return null;
	}
	

}
