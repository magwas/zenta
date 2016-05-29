package org.rulez.magwas.zenta.model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.BasicEList;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.rulez.magwas.zenta.model.impl.FolderBase;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase;
import org.rulez.magwas.zenta.model.impl.ZentaElementBase;
import org.rulez.magwas.zenta.model.testutils.TestModel;

public class ModelCheckTest {

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	public TestModel builder;
	private IZentaModel model;
	private IZentaModel uncheckedModel;

	@Before
	public void setUp() throws Exception {
		builder = new TestModel();
		builder.createModel();
		model = builder.getModel();
		model.setFile(new File("/tmp/foo"));
		model.check();
		uncheckedModel =  IZentaFactory.eINSTANCE.createZentaModel();
		uncheckedModel.setId(null);
		uncheckedModel.setDocumentation(null);
		uncheckedModel.setVersion(null);
	}

	@Test
	public void unchecked_model_is_not_checked() {
		assertFalse(uncheckedModel.isChecked());
	}

	@Test
	public void model_check_sets_the_checked_attribute() throws ModelConsistencyException {
		assertTrue(model.isChecked());
	}
	
	@Test
	public void model_id_cannot_be_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		uncheckedModel.check();
	}

	@Test
	public void checked_model_id_cannot_be_set_to_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		model.setId(null);
	}

	@Test
	public void model_documentation_cannot_be_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		uncheckedModel.check();
	}

	@Test
	public void checked_model_documentation_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		model.setDocumentation(null);
	}


	@Test
	public void model_version_cannot_be_null() throws ModelConsistencyException {
		exception.expect(ModelConsistencyException.class);
		uncheckedModel.check();
	}

	@Test
	public void checked_model_version_cannot_be_set_to_null() {
		exception.expect(ModelConsistencyException.class);
		model.setVersion(null);
	}

	@Test()
	public void model_elements_are_checked_in_check() throws ModelConsistencyException {
		ZentaElementBase e=createMockedObject(ZentaElementBase.class);
		model.getElements().add(e);
		model.check();
		verify(e, atLeast(1)).check();
	}

	@Test()
	public void model_folders_are_checked_in_check() throws ModelConsistencyException {
		FolderBase e=createMockedObject(FolderBase.class);
		BasicEList<INameable> el = new BasicEList<INameable>();
		doReturn(el).when(e).getElements();
		doReturn(el).when(e).getFolders();
		model.getFolders().add(e);
		model.check();
		verify(e, atLeast(1)).check();
	}

	@Test()
	public void model_diagrams_are_checked_in_check() throws ModelConsistencyException {
		ZentaDiagramModelBase e = createMockedObject(ZentaDiagramModelBase.class);
		model.getElements().add(e);
		model.check();
		verify(e, atLeast(1)).check();
	}

	private <T extends ZentaObject> T createMockedObject(Class<T> klass) {
		T e=mock(klass);
		BasicEList<Adapter> el = new BasicEList<Adapter>();
		doReturn(el).when(e).eAdapters();
		return e;
	}
	

}
