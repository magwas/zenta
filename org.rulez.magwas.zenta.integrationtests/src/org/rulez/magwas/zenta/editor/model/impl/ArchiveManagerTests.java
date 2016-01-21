/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import junit.framework.JUnit4TestAdapter;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.swt.graphics.Image;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.rulez.magwas.zenta.editor.model.IArchiveManager;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;


@SuppressWarnings("nls")
public class ArchiveManagerTests {
    
    private IZentaModel model;
    private IDiagramModel dm;
    private ArchiveManager archiveManager;
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(ArchiveManagerTests.class);
    }
    
    
	@Before
    public void runBeforeEachTest() {
        model = IZentaFactory.eINSTANCE.createZentaModel();
        
        dm = IZentaFactory.eINSTANCE.createZentaDiagramModel();
        model.getDefaultFolderForElement(dm).getElements().add(dm);
        
        archiveManager = new ArchiveManager(model);
    }
    
    @After
    public void tearDown() throws IOException {
    }
    
    
	@Test
    public void ArchiveManager_for_empty_model_has_no_images_and_model_has_its_adapter() throws Exception {
        assertNotNull(archiveManager);
        
        // Should have an ID Adapter and an extra EContentAdapter adapter
        assertEquals(2, model.eAdapters().size());
        assertEquals(ModelTestUtils.getPrivateField(archiveManager, "fModelAdapter"), model.eAdapters().get(1));
        
        assertTrue(archiveManager.getImagePaths().isEmpty());
        assertFalse(archiveManager.hasImages());
    }
    
    @Test
    public void DiagramImages_without_image_path_do_not_register__but_with_imagepath_do() throws Exception {
        assertTrue(archiveManager.getImagePaths().isEmpty());
        
        IDiagramModelImage dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
        
        // Add IDiagramModelImageProvider without an image path set - should not register
        dm.getChildren().add(dmImage);
        List<String> imagePaths = archiveManager.getImagePaths();
		assertTrue(imagePaths.isEmpty());
        assertTrue(archiveManager.getLoadedImagePaths().isEmpty());
        
        dm.getChildren().remove(dmImage);

        // Add IDiagramModelImageProvider with an image path set - should register
        String imagePath = "/somePath/image.png";
        dmImage.setImagePath(imagePath);
        dm.getChildren().add(dmImage);
        assertEquals(1, archiveManager.getImagePaths().size());
        assertEquals(1, archiveManager.getLoadedImagePaths().size());
        assertEquals(imagePath, archiveManager.getImagePaths().get(0));
        
        // Set image path, should still only be one
        String imagePath2 = "/somePath/image2.png";
        dmImage.setImagePath(imagePath2);
        assertEquals(1, archiveManager.getImagePaths().size());
        assertEquals(2, archiveManager.getLoadedImagePaths().size()); // This should be increased
        assertEquals(imagePath2, archiveManager.getImagePaths().get(0));
    }
    
    @Rule
    public ExpectedException expectedEx = ExpectedException.none();
    
    @Test
    public void Adding_image_from_bogus_file_throws_an_exception() throws IOException {
        expectedEx.expect(RuntimeException.class);
        archiveManager.addImageFromFile(new File("bogus.pomp"));
    }
    
    
	@Test
    public void Adding_image_from_wrong_file_format_throws_an_exception() throws IOException {
        expectedEx.expect(IOException.class);
        expectedEx.expectMessage("Not a supported image file");
        archiveManager.addImageFromFile(ModelTestUtils.TEST_MODEL_FILE_ZIPPED);
    }

    @Test
    public void An_image_can_be_added_from_a_file() throws Exception {
        IDiagramModelImage dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
        dm.getChildren().add(dmImage);
        
        assertTrue(archiveManager.getLoadedImagePaths().isEmpty()); // should be empty

        File imgFile = img1File();
        String pathName = archiveManager.addImageFromFile(imgFile);
        assertNotNull(pathName);
        assertTrue(archiveManager.getLoadedImagePaths().isEmpty()); // should still be empty
        
        dmImage.setImagePath(pathName);
        assertEquals(pathName, archiveManager.getLoadedImagePaths().get(0)); // This should now be increased
        assertEquals(pathName, archiveManager.getImagePaths().get(0)); // This should be set
    }

	private File img1File() {
		return new File(ModelTestUtils.convertNameToResourcePath("img1.png"));
	}
    
    @Test(expected=RuntimeException.class)
    public void create_image_with_wrong_path_throws_exception() throws Exception {
        archiveManager.createImage("something");
    }
    
    @Test
    public void An_image_can_be_creates_from_a_diagram_model() throws Exception {
        IDiagramModelImage dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
        dm.getChildren().add(dmImage);
        
        File imgFile = img1File();
        String pathName = archiveManager.addImageFromFile(imgFile);
        
        Image image = archiveManager.createImage(pathName);
        assertNotNull(image);
    }
    
    @Test
    public void getImagePaths_returns_a_list_of_active_image_paths() {
        assertTrue(archiveManager.getImagePaths().isEmpty());
        
        IDiagramModelImage dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
        dm.getChildren().add(dmImage);
        String pathName = "/aPath.png";
        dmImage.setImagePath(pathName);
        
        assertEquals(pathName, archiveManager.getImagePaths().get(0));
    }
    
    
	@Test
    public void Ater_loading_images_the_result_of_getLoadedImagePaths_is_not_empty() throws Exception {
        model.setFile(ModelTestUtils.TEST_MODEL_FILE_ZIPPED);
        
        assertTrue(archiveManager.getLoadedImagePaths().isEmpty());
        
        archiveManager.loadImages();
        List<String> loadedImagePaths = archiveManager.getLoadedImagePaths();
		assertFalse(loadedImagePaths.isEmpty());
    }
    
    @Test
    public void loadImagesFromModelFile_loads_images_from_model_file__what_a_surprise() throws Exception {
        boolean result = archiveManager.loadImagesFromModelFile(null);
        assertFalse(result);
        
        result = archiveManager.loadImagesFromModelFile(ModelTestUtils.TEST_MODEL_FILE_ZENTASURANCE);
        assertFalse(result);
        
        assertTrue(archiveManager.getLoadedImagePaths().isEmpty());
        
        result = archiveManager.loadImagesFromModelFile(ModelTestUtils.TEST_MODEL_FILE_ZIPPED);
        assertTrue(result);
        assertFalse(archiveManager.getLoadedImagePaths().isEmpty());
    }
    
    @Test
    public void if_a_DiagramModelImage_have_an_image_path_set_then_the_archive_manager_has_images() {
        assertFalse(archiveManager.hasImages());
        
        IDiagramModelImage dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
        dmImage.setImagePath("somePath");
        dm.getChildren().add(dmImage);
        
        assertTrue(archiveManager.hasImages());
    }    
    
    @Test
    public void a_model_containing_images_will_be_saved_in_zip_format() throws IOException {
        IDiagramModelImage dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
        dm.getChildren().add(dmImage);
        
        File file = ModelTestUtils.createTempFile(".zenta");
        model.setFile(file);
        assertFalse(archiveManager.hasImages());
        
        archiveManager.saveModel();
        
        // Not an archive file
        assertTrue(file.exists());
        assertFalse(IArchiveManager.FACTORY.isArchiveFile(file));
        
        // Is an archive file
        archiveManager.loadImagesFromModelFile(ModelTestUtils.TEST_MODEL_FILE_ZIPPED);
        dmImage.setImagePath(archiveManager.getLoadedImagePaths().get(0));
        
        archiveManager.saveModel();
        assertTrue(IArchiveManager.FACTORY.isArchiveFile(file));
        
        file.delete();
    }
    
    @Test
    public void the_resource_for_a_model_saved_in_another_name_will_be_the_same_as_before() throws IOException {
        File file = ModelTestUtils.createTempFile(".zenta");
        model.setFile(file);
        
        Resource resource = model.eResource();
        assertNull(resource);
        
        archiveManager.saveModel();
        resource = model.eResource();
        assertNotNull(resource);
        
        // Change file name
        file = ModelTestUtils.createTempFile(".zenta");
        model.setFile(file);
        archiveManager.saveModel();

        assertSame(resource, model.eResource());
    }
    
    @Test
    public void The_archiveManager_will_dispose_unused_images_when_disposed() throws IOException {
        IDiagramModelImage dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
        dm.getChildren().add(dmImage);
        archiveManager.loadImagesFromModelFile(ModelTestUtils.TEST_MODEL_FILE_ZIPPED);
        dmImage.setImagePath(archiveManager.getLoadedImagePaths().get(0));
        
        assertEquals(2, model.eAdapters().size());
        assertFalse(archiveManager.getLoadedImagePaths().isEmpty());
        
        archiveManager.dispose();
        
        assertEquals(1, model.eAdapters().size());
        assertTrue(archiveManager.getLoadedImagePaths().isEmpty());
    }
}