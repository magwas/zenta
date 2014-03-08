/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import junit.framework.JUnit4TestAdapter;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractDiagramModelObjectFigureTests;
import org.rulez.magwas.zenta.editor.model.IArchiveManager;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.testutils.ModelTestUtils;
import org.rulez.magwas.zenta.tests.AsyncTestRunner;

@SuppressWarnings("nls")
public class DiagramImageFigureTests extends AbstractDiagramModelObjectFigureTests {
    
    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(DiagramImageFigureTests.class);
    }
    
    private DiagramImageFigure figure;
    private IDiagramModelImage dmImage;
    

    @Override
    protected DiagramImageFigure createFigure() {
		// Add a DiagramModelImage
		dmImage = IZentaFactory.eINSTANCE.createDiagramModelImage();
		dmImage.setBounds(IZentaFactory.eINSTANCE.createBounds());
		dm.getChildren().add(dmImage);
		assertTrue(dm.getChildren().contains(dmImage));
		figure = (DiagramImageFigure)getFigureFromViewer(dmImage);
		return figure;
    }

	@Test
    public void testGetDefaultSize() throws Exception {
		assertEquals(DiagramImageFigure.DEFAULT_SIZE, figure.getDefaultSize());
        
        // Add image
        File file = new File(ModelTestUtils.convertNameToResourcePath("img1.png"));
        addImage(file);
        Image image = getPrivateImageField();
        assertEquals(new Dimension(image), figure.getDefaultSize());
        dmImage.setImagePath(null);
        assertEquals(DiagramImageFigure.DEFAULT_SIZE, figure.getDefaultSize());
    }

    @Test
    public void testBorderColor() {
        assertNull(figure.getBorderColor());
        
        dmImage.setBorderColor("#010203");
        Color expected = new Color(null, 1, 2, 3);
        assertEquals(expected, figure.getBorderColor());
        expected.dispose();
    }
    
    @Test
    public void testDiagramImage() throws Exception {
        Image image = getPrivateImageField();
        assertNull(image);
        
        // Add image
        File file = new File(ModelTestUtils.convertNameToResourcePath("img1.png"));
        addImage(file);
        
        // Check initial Image size
        image = getPrivateImageField();
        assertEquals(new Rectangle(0, 0, 1024, 1024), image.getBounds());
        
        // Check correct default size of image
        assertEquals(new Dimension(1024, 1024), figure.getDefaultSize());
        assertEquals(new Dimension(1024, 1024), figure.getPreferredSize(-1, -1));
        
        // Change size of DiagramModelImage and check it was rescaled
        IBounds bounds = IZentaFactory.eINSTANCE.createBounds(0, 0, 512, 512);
        dmImage.setBounds(bounds);
        
        AsyncTestRunner runner = new AsyncTestRunner() {
            @Override
            public void run() {
                super.run();
                try {
                    Image image = getPrivateImageField();
                    assertEquals(new Rectangle(0, 0, 512, 512), image.getBounds());
                }
                catch(Exception ex) {
                    Assert.fail(ex.getMessage());
                }
            }
        };
        
        runner.start();
    }
    
    @Test
    public void testSettingNewImagePath() throws Exception {
        Image image = getPrivateImageField();
        assertNull(image);
        
        // Add image
        File file = new File(ModelTestUtils.convertNameToResourcePath("img1.png"));
        addImage(file);
        
        // Check initial Image size
        image = getPrivateImageField();
        assertEquals(new Rectangle(0, 0, 1024, 1024), image.getBounds());
        
        // Check correct default size of image
        assertEquals(new Dimension(1024, 1024), figure.getDefaultSize());
        assertEquals(new Dimension(1024, 1024), figure.getPreferredSize(-1, -1));

        // Add new image
        file = new File(ModelTestUtils.convertNameToResourcePath("img3.png"));
        addImage(file);

        // Check initial Image size
        image = getPrivateImageField();
        assertEquals(new Rectangle(0, 0, 268, 268), image.getBounds());
        
        // Check correct default size of image
        assertEquals(new Dimension(268, 268), figure.getDefaultSize());
        assertEquals(new Dimension(268, 268), figure.getPreferredSize(-1, -1));
    }
    
    @Test
    public void testRescaleImage() throws Exception {
        File file = new File(ModelTestUtils.convertNameToResourcePath("img3.png"));
        addImage(file);
        Image image = getPrivateImageField();
        assertEquals(new Rectangle(0, 0, 268, 268), image.getBounds());
        
        figure.setBounds(new org.eclipse.draw2d.geometry.Rectangle(0, 0, 10, 10));
        
        figure.rescaleImage();
        
        image = getPrivateImageField();
        assertEquals(new Rectangle(0, 0, 10, 10), image.getBounds());
    }
    
    @Test
    public void testGetOriginalImage() throws Exception {
        Image image = figure.getOriginalImage();
        assertNull(image);
        
        File file = new File(ModelTestUtils.convertNameToResourcePath("img3.png"));
        addImage(file);
        
        image = figure.getOriginalImage();
        assertEquals(new Rectangle(0, 0, 268, 268), image.getBounds());
    }
   
    private void addImage(@NonNull File file) throws IOException {
        IArchiveManager archiveManager = (IArchiveManager)Util.verifyNonNull(dmImage.getAdapter(IArchiveManager.class));
        String path = archiveManager.addImageFromFile(file);
        dmImage.setImagePath(path);
    }

    private Image getPrivateImageField() throws Exception {
        return (Image)ModelTestUtils.getPrivateField(Util.verifyNonNull(figure), "fImage");
    }
}