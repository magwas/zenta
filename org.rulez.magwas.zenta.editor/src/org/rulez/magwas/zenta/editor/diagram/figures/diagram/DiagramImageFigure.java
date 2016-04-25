/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.diagram;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.diagram.figures.AbstractDiagramModelObjectFigure;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.editor.ui.ImageFactory;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.manager.IArchiveManager;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.model.util.LogUtil;


/**
 * Diagram Image Figure
 * 
 * @author Phillip Beauvoir
 */
public class DiagramImageFigure extends AbstractDiagramModelObjectFigure {
    
    public static Dimension DEFAULT_SIZE = new Dimension(200, 150);
    
    private Image fImage;
    private Dimension fOriginalImageSize, fCurrentImageSize;
    
    private Color fBorderColor;
    
    // This is way faster than Draw2D re-drawing the original image at scale
    private boolean useScaledImage = true;
    
    public DiagramImageFigure(IDiagramModelImage diagramModelImage) {
        super(diagramModelImage);
    }
    
    @Override
    public IDiagramModelImage getDiagramModelObject() {
        return (IDiagramModelImage)super.getDiagramModelObject();
    }
    
    @Override
    protected void setUI() {
        setLayoutManager(new GridLayout());
        setOpaque(true);
        setImage();
    }
    
    /**
     * Update the image with new path
     */
    public void updateImage() {
        setImage();
        revalidate();
        repaint();
    }
    
    public void refreshVisuals() {
        setBorderColor();
    }

    protected void setBorderColor() {
        String val = getDiagramModelObject().getBorderColor();
        Color c = ColorFactory.get(val);
        if(c != fBorderColor) {
            fBorderColor = c;
            repaint();
        }
    }
    
    /**
     * @return The Border Color to use. If null, do not draw a border.
     */
    public Color getBorderColor() {
        return fBorderColor;
    }

    public Dimension getDefaultSize() {
        return fOriginalImageSize == null ? DEFAULT_SIZE : fOriginalImageSize;
    }
    
    @Override
    public Dimension getPreferredSize(int wHint, int hHint) {
        return getDefaultSize();
    }

    @Override
    protected void paintFigure(Graphics graphics) {
        graphics.setAntialias(SWT.ON);
        graphics.setInterpolation(SWT.HIGH);
        
        if(fImage != null) {
            if(useScaledImage) {
                rescaleImage();
                graphics.drawImage(fImage, bounds.x, bounds.y);
            }
            // This is way too slow
            else {
                graphics.drawImage(fImage, 0, 0, fImage.getBounds().width, fImage.getBounds().height,
                        bounds.x, bounds.y, bounds.width, bounds.height);
            }
        }
        else {
            super.paintFigure(graphics);
            Image image = IZentaUIImages.ImageFactory.getImage(IZentaImages.ICON_LANDSCAPE_16);
            graphics.drawImage(image, bounds.x + (bounds.width / 2) - 7, bounds.y + (bounds.height / 2) - 7);
        }
        
        // Border
        if(getBorderColor() != null) {
            graphics.setForegroundColor(getBorderColor());
            graphics.drawRectangle(new Rectangle(bounds.x, bounds.y, bounds.width - 1, bounds.height - 1));
        }
    }
    
    /**
     * Set the image and store it
     */
    protected void setImage() {
        disposeImage();
        
        fImage = getOriginalImage();
        
        if(fImage != null) {
            fOriginalImageSize = new Dimension(fImage);
            fCurrentImageSize = new Dimension(fOriginalImageSize);
        }
        else {
            fOriginalImageSize = null;
        }
    }
    
    public Image getOriginalImage() {
        Image image = null;
        
        String imagePath = getDiagramModelObject().getImagePath();
        
        if(imagePath != null) {
            Object ob = getDiagramModelObject().getAdapter(IArchiveManager.class);
			IArchiveManager archiveManager = (IArchiveManager)Util.verifyNonNull(ob);
            try {
                image = archiveManager.createImage(imagePath).adapt(Image.class);
            }
            catch(Exception ex) {
                LogUtil.logException(ex);
            }
        }
        
        return image;
    }
    
    /**
     * Use a re-usable rescaled image because drawing an image to scale in paintFigure(Graphics) is too slow
     */
    public void rescaleImage() {
        int width = bounds.width;
        int height = bounds.height;
        
        if(width <= 0 && height <= 0) { // safety check
            return;
        }
        
        // If the image bounds are different to those in the current image, rescale the image
        if(width != fCurrentImageSize.width || height != fCurrentImageSize.height) {
            disposeImage();
            
            Image originalImage = getOriginalImage();
            
            // Use original image
            if(width == originalImage.getBounds().width && height == originalImage.getBounds().height) {
                fImage = originalImage;
            }
            // Scaled image
            else {
                fImage = ImageFactory.getScaledImage(originalImage, width, height);
                originalImage.dispose();
            }

            fCurrentImageSize = new Dimension(fImage);
        }
    }
    
    protected void disposeImage() {
        if(fImage != null && !fImage.isDisposed()) {
            fImage.dispose();
            fImage = null;
        }
    }
    
    @Override
    public IFigure getTextControl() {
        return null;
    }
    
    @Override
    public void dispose() {
        disposeImage();
        fBorderColor = null;
    }
}
