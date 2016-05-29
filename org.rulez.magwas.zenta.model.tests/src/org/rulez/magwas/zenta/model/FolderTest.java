package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FolderTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	private IZentaModel model;
	private IFolder folder;
	private IFolder uncheckedFolder;

	@Before
	public void setUp() throws Exception {
		model = IZentaFactory.eINSTANCE.createZentaModel();
		model.check();
		folder = IZentaFactory.eINSTANCE.createFolder();
		folder.setId("folder");
		folder.check();
		uncheckedFolder = IZentaFactory.eINSTANCE.createFolder();
		uncheckedFolder.setId("uncheckedFolder");
	}


	@Test
	public void id_cannot_be_null() throws ModelConsistencyException {
		uncheckedFolder.setId(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedFolder.check();
	}

	@Test
	public void checked_folder_id_cannot_be_set_to_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		folder.setId(null);
	}

	@Test
	public void folder_documentation_cannot_be_null() throws ModelConsistencyException {
		uncheckedFolder.setDocumentation(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedFolder.check();
	}

	@Test
	public void checked_folder_documentation_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		folder.setDocumentation(null);
	}

	@Test
	public void folder_Name_cannot_be_null() throws ModelConsistencyException {
		uncheckedFolder.setName(null);
		exception.expect(ModelConsistencyException.class);
		uncheckedFolder.check();
	}

	@Test
	public void checked_folder_name_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		folder.setName(null);
	}

	@Test
	public void an_inconsistent_folder_cannot_be_added_to_a_folder_in_the_model() {
		uncheckedFolder.setDocumentation(null);
		model.getFolders().add(folder);
		exception.expect(ModelConsistencyException.class);
		folder.getFolders().add(uncheckedFolder);
	}

}
