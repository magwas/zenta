package org.rulez.magwas.zenta.model.manager;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.core.runtime.spi.IRegistryProvider;
import org.jdom.JDOMException;


public class AbstractEditorModelManagerTest implements IModelManagerTest {

	private TestModelManager modelManager;
	private IEditorModelInterface iface;
	private IZentaModel model;
	private File tempFile;
	private String absolutePath;
	boolean isDirty=false;
	private File testUserDir;
	static boolean providerHasBeenSet = false;

	@BeforeClass
	public static void setupClass() throws CoreException {
		IRegistryProvider provider = mock(IRegistryProvider.class);
		if(null == RegistryFactory.getRegistry()) {
			RegistryFactory.setDefaultRegistryProvider(provider);
		}
	}

	@Before
	public void setUp() throws IOException {
		AbstractEditorModelManager_can_be_instantiated_if_editorInterface_is_set_for_ZentaFactory();
		model = modelManager.createNewModel();
		IZentaDiagramModel dm = IZentaFactory.eINSTANCE.createZentaDiagramModel();
		model.getElements().add(dm);
		model.setName("the test model");
	}

	private void createASavedModel() throws IOException {
		tempFile = ModelTestUtils.createTempFile(".zenta");
		absolutePath = tempFile.getAbsolutePath();
		when(iface.askSavePath(model)).thenReturn(absolutePath);
		when(iface.sureToOverwriteDialog(tempFile)).thenReturn(true);
		modelManager.saveModel(model);
	}
	
	public void AbstractEditorModelManager_can_be_instantiated_if_editorInterface_is_set_for_ZentaFactory() throws IOException {
		iface = mock(IEditorModelInterface.class);
		IZentaFactory.eINSTANCE.setEditorInterface(iface);
		testUserDir = ModelTestUtils.createTempFile(".userfolder");
		testUserDir.delete();
		assertTrue(testUserDir.mkdir());
		when(iface.getUserDataFolder()).thenReturn(testUserDir);
		modelManager = new TestModelManager(this);
	}

	@Test
	public void getModels_return_a_list_of_opened_models() {
		assertEquals("the test model", modelManager.getModels().get(0).getName());
	}

	@Test
	public void createNewModel_creates_a_new_empty_model() throws IOException {
		modelManager.createNewModel();
	}
	
	@Test
	public void saveModel_saves_the_model() throws IOException {
		File tempFile = saveModelToTempFile(model);
		assertEquals(model.getFile(), tempFile);
	}

	@Test
	public void saveModel_does_not_save_the_model_if_path_is_null() throws IOException {
		when(iface.askSavePath(model)).thenReturn(null);
		assertFalse(modelManager.saveModel(model));
		assertEquals(null,model.getFile());
	}

	@Test
	public void saveModel_does_not_save_the_model_when_not_sure_to_rewrite_file() throws IOException {
		File tempFile = ModelTestUtils.createTempFile(".zenta");
		String absolutePath = tempFile.getAbsolutePath();
		when(iface.askSavePath(model)).thenReturn(absolutePath);
		when(iface.sureToOverwriteDialog(tempFile)).thenReturn(false);
		assertFalse(modelManager.saveModel(model));
		assertEquals(null,model.getFile());
	}

	@Test
	public void saveModel_does_not_call_sureToOverwriteDialog_if_nothing_to_overwrite() throws IOException {
		File tempFile = ModelTestUtils.createTempFile(".zenta");
		tempFile.delete();
		String absolutePath = tempFile.getAbsolutePath();
		when(iface.askSavePath(model)).thenReturn(absolutePath);
		when(iface.sureToOverwriteDialog(tempFile)).thenReturn(true);
		
		assertTrue(modelManager.saveModel(model));
		verify(iface,never()).sureToOverwriteDialog(tempFile);
		assertEquals(tempFile,model.getFile());
	}

	@Test
	public void registerModel_registers_a_model() {
		IZentaModel amodel = IZentaFactory.eINSTANCE.createZentaModel();
		amodel.setName("registered model");
		modelManager.registerModel(amodel);
		assertEquals("registered model", modelManager.getModels().get(1).getName());
	}

	@Test
	public void openModelFile_returns_the_same_model_for_an_already_opened_file() throws IOException {
		createASavedModel();
		IZentaModel amodel = modelManager.openModel(tempFile);
		assertEquals(amodel.hashCode(), model.hashCode());
	}

	@Test
	public void openModelFile_opens_an_existing_model() throws IOException, CoreException {
		createASavedModel();
		modelManager.closeModel(model);
		IZentaModel amodel = modelManager.openModel(tempFile);
		assertEquals("the test model", amodel.getName());
	}

	@Test
	public void openModelFile_opens_diagram_editors_if_editorInterface_asks_for_it() throws IOException, CoreException {
		createASavedModel();
		modelManager.closeModel(model);
		when(iface.doOpenDiagramsOnLoad()).thenReturn(true);
		IZentaModel amodel = modelManager.openModel(tempFile);
		verify(iface,atLeast(1)).openDiagramEditor(any(IDiagramModel.class));
		assertEquals("the test model", amodel.getName());
	}

	@Test
	public void getModel_registers_and_opens_a_model() {
		IZentaModel newmodel = IZentaFactory.eINSTANCE.createZentaModel();
		newmodel.setName("the new model");
		modelManager.openModel(newmodel);
		assertEquals("the new model", modelManager.getModels().get(1).getName());
	}

	@Test(expected=NoSuchFileException.class)
	public void loadModel_throws_NoSuchFileExcepton_if_file_does_not_exists() throws IOException {
		File file = new File("/This file does not exists");
		modelManager.loadModel(file);
	}
	
	@Test
	public void closeModel_asks_to_save_if_model_is_dirty() throws IOException {
		when(iface.askSaveModel(model, modelManager)).thenReturn(true);
		isDirty=true;
		modelManager.closeModel(model);
		verify(iface, atLeast(1)).askSaveModel(model, modelManager);
	}
	
	@Test
	public void closeModel_does_not_ask_to_save_if_model_is_not_dirty() throws IOException {
		when(iface.askSaveModel(model, modelManager)).thenReturn(true);
		isDirty=false;
		modelManager.closeModel(model);
		verify(iface, never()).askSaveModel(model, modelManager);
	}

	@Test
	public void closeModel_does_not_close_if_iface_says_not_to_save() throws IOException {
		when(iface.askSaveModel(model, modelManager)).thenReturn(false);
		isDirty=true;
		assertFalse(modelManager.closeModel(model));
		assertEquals("the test model", modelManager.getModels().get(0).getName());
	}

	@Test
	public void saveState_saves_model_list_in_userfolder_per_models_dot_xml() throws IOException {
		modelManager.saveState();
		assertTrue(new File(testUserDir,"models.xml").exists());
	}

	@Test
	public void saveState_saves_model_in_model_list_if_it_is_saved() throws IOException, XPathExpressionException {
		File tempFile = saveModelToTempFile(model);
		modelManager.saveState();
		File stateFile = new File(testUserDir,"models.xml");

		assertTrue(stateFile.exists());
		Document testDoc = Util.createXmlDocumentFromFileName(stateFile.getAbsolutePath());
        String xpathExpression = String.format("//model[@file='%s']",tempFile);
	    assertNotNull(ModelTestUtils.getElementByXpath(testDoc, xpathExpression));
	}

	private File saveModelToTempFile(IZentaModel model) throws IOException {
		File tempFile = ModelTestUtils.createTempFile(".zenta");
		tempFile.delete();
		String absolutePath = tempFile.getAbsolutePath();
		when(iface.askSavePath(model)).thenReturn(absolutePath);
		when(iface.sureToOverwriteDialog(tempFile)).thenReturn(true);
		assertTrue(modelManager.saveModel(model));
		return model.getFile();
	}
	
	@Test
	public void loadState_loads_models_from_state_file() throws ParserConfigurationException, SAXException, IOException, JDOMException {
		IZentaModel newModel = modelManager.createNewModel();
		newModel.setName("absolutely new model");
		File newModelPath = saveModelToTempFile(newModel);
		modelManager.closeModel(newModel);
		int modelnum = modelManager.getModels().size();
		String stateXml = String.format(
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?><models><model file=\"%s\" /></models>",
				newModelPath.getAbsolutePath());
		File stateFile = new File(testUserDir,"models.xml");
		PrintWriter out = new PrintWriter(stateFile);
		out.println(stateXml);
		out.close();
		modelManager.loadState();
		assertEquals(modelnum+1, modelManager.getModels().size());
	}

	@Override
	public boolean isDirty() {
		return isDirty;
	}
	
}
