/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.templates.wizard;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.ZipOutputStream;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;
import org.jdom.Document;
import org.jdom.Element;
import org.rulez.magwas.zenta.canvas.model.ICanvasModel;
import org.rulez.magwas.zenta.canvas.templates.model.CanvasModelTemplate;
import org.rulez.magwas.zenta.canvas.templates.model.CanvasTemplateManager;
import org.rulez.magwas.zenta.editor.model.IArchiveManager;
import org.rulez.magwas.zenta.editor.utils.ZipUtils;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.ModelVersion;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.util.LogUtil;
import org.rulez.magwas.zenta.templates.model.ITemplateGroup;
import org.rulez.magwas.zenta.templates.model.ITemplateXMLTags;
import org.rulez.magwas.zenta.templates.model.TemplateManager;
import org.rulez.magwas.zenta.templates.wizard.TemplateUtils;

import uk.ac.bolton.jdom.JDOMUtils;


/**
 * Save Canvas As Template Wizard
 * 
 * @author Phillip Beauvoir
 */
public class SaveCanvasAsTemplateWizard extends Wizard {
    
    private ICanvasModel fCanvasModel;
    
    private SaveCanvasAsTemplateWizardPage fPage1;
    private SaveCanvasAsTemplateToCollectionWizardPage fPage2;
    
    private File fZipFile;
    private String fTemplateName;
    private String fTemplateDescription;
    private boolean fIncludeThumbnail;
    private ITemplateGroup fSelectedTemplateGroup;
    private boolean fDoStoreInCollection;
    
    private TemplateManager fTemplateManager;
    
    public SaveCanvasAsTemplateWizard(ICanvasModel canvasModel) {
        setWindowTitle(Messages.SaveCanvasAsTemplateWizard_0);
        setfCanvasModel(canvasModel);
        setfTemplateManager(new CanvasTemplateManager());
    }
    
    @Override
    public void addPages() {
        fPage1 = new SaveCanvasAsTemplateWizardPage(getfCanvasModel(), getfTemplateManager());
        addPage(fPage1);
        fPage2 = new SaveCanvasAsTemplateToCollectionWizardPage(getfTemplateManager());
        addPage(fPage2);
    }

    @Override
    public boolean performFinish() {
        // This before the thread starts
        setfZipFile(new File(fPage1.getFileName()));
        
        // Make sure the file does not already exist
        if(getfZipFile().exists()) {
            boolean result = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(),
                    Messages.SaveCanvasAsTemplateWizard_1,
                    NLS.bind(Messages.SaveCanvasAsTemplateWizard_2, getfZipFile()));
            if(!result) {
                return false;
            }
        }
        
        fTemplateName = fPage1.getTemplateName();
        fTemplateDescription = fPage1.getTemplateDescription();
        fIncludeThumbnail = fPage1.includeThumbnail();
        fDoStoreInCollection = fPage2.doStoreInCollection();
        setfSelectedTemplateGroup(Util.verifyNonNull(fPage2.getTemplateGroup()));

        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
            @Override
            public void run() {
                try {
                    createZipFile(getfZipFile());
                    
                    if(fDoStoreInCollection) {
                        getfTemplateManager().addTemplateEntry(getfZipFile(), getfSelectedTemplateGroup());
                    }
                }
                catch(final IOException ex) {
        			LogUtil.logException(ex);
                    Display.getCurrent().asyncExec(new Runnable() { // Display after wizard closes
                        public void run() {
                            MessageDialog.openError(getShell(), Messages.SaveCanvasAsTemplateWizard_3, ex.getMessage());
                        }
                    });
                }
            }
        });
        
        return true;
    }
    
    private void createZipFile(File zipFile) throws IOException {
        ZipOutputStream zOut = null;
        
        try {
            // Delete any existing zip first
            zipFile.delete();
            
            // Start a zip stream
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(zipFile));
            zOut = new ZipOutputStream(out);

            // Model File
            File modelFile = saveModelToTempFile();
            ZipUtils.addFileToZip(modelFile, TemplateManager.getZipEntryModel(), zOut);
            modelFile.delete();
            
            // Manifest
            String manifest = createManifest();
            ZipUtils.addStringToZip(manifest, TemplateManager.getZipEntryManifest(), zOut);
            
            // Thumbnail
            if(fIncludeThumbnail) {
                Image image = TemplateUtils.createThumbnailImage(getfCanvasModel());
                ZipUtils.addImageToZip(image, TemplateManager.ZIP_ENTRY_THUMBNAILS + "1.png", zOut, SWT.IMAGE_PNG, null); //$NON-NLS-1$
                image.dispose();
            }
        }
        finally {
            if(zOut != null) {
                try {
                    zOut.flush();
                    zOut.close();
                }
                catch(IOException ex) {
                }
            }
        }
    }
    
    private String createManifest() throws IOException {
        Document doc = new Document();
        Element root = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_MANIFEST);
        doc.setRootElement(root);
        
        // Type
        root.setAttribute(ITemplateXMLTags.XML_TEMPLATE_ATTRIBUTE_TYPE, CanvasModelTemplate.XML_CANVAS_TEMPLATE_ATTRIBUTE_TYPE_MODEL);

        // Timestamp
        root.setAttribute(ITemplateXMLTags.XML_TEMPLATE_ATTRIBUTE_TIMESTAMP, Long.toString(System.currentTimeMillis()));
        
        // Name
        Element elementName = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_NAME);
        elementName.setText(fTemplateName);
        root.addContent(elementName);
        
        // Description
        Element elementDescription = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_DESCRIPTION);
        elementDescription.setText(fTemplateDescription);
        root.addContent(elementDescription);
        
        // Thumbnail
        if(fIncludeThumbnail) {
            String keyThumb = TemplateManager.ZIP_ENTRY_THUMBNAILS + "1.png"; //$NON-NLS-1$
            Element elementKeyThumb = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_KEY_THUMBNAIL);
            elementKeyThumb.setText(keyThumb);
            root.addContent(elementKeyThumb);
        }
        
        return JDOMUtils.write2XMLString(doc);
    }

    private File saveModelToTempFile() throws IOException {
        File tmpFile = File.createTempFile("architemplate", null); //$NON-NLS-1$
        tmpFile.deleteOnExit();
        
        // Create a new container Zenta model
        IZentaModel tempModel = IZentaFactory.eINSTANCE.createZentaModel();
        tempModel.eAdapters().clear(); // Remove this after default folders have been added, as we'll generate our own IDs
        tempModel.setId(EcoreUtil.generateUUID());
        tempModel.setFile(tmpFile);
        tempModel.setVersion(ModelVersion.VERSION);
        tempModel.setName(Messages.SaveCanvasAsTemplateWizard_4);

        // Get the Canvas copy
        ICanvasModel copyCanvas = EcoreUtil.copy(getfCanvasModel());
        
        // Remove any unsupported elements
        for(Iterator<EObject> iter = copyCanvas.eAllContents(); iter.hasNext();) {
            EObject eObject = iter.next();
            if(eObject instanceof IDiagramModelReference) {
                EcoreUtil.delete(eObject);
            }
        }
        
        // Generate new IDs
        TemplateUtils.generateNewUUIDs(copyCanvas);
        
        // Add the canvas copy to a new Views folder
        IFolder folder = tempModel.getFolders().get(0);
        folder.getElements().add(copyCanvas);
        
        // Use an Archive Manager to save it
        IArchiveManager archiveManager = IArchiveManager.FACTORY.createArchiveManager(tempModel);
        archiveManager.saveModel();
        archiveManager.dispose();
        
        return tmpFile;
    }
    
    @Override
    public void dispose() {
        super.dispose();
        getfTemplateManager().dispose();
    }

	private File getfZipFile() {
		return Util.verifyNonNull(fZipFile);
	}

	private void setfZipFile(File fZipFile) {
		this.fZipFile = fZipFile;
	}

	private TemplateManager getfTemplateManager() {
		return Util.verifyNonNull(fTemplateManager);
	}

	private void setfTemplateManager(TemplateManager fTemplateManager) {
		this.fTemplateManager = fTemplateManager;
	}

	private ICanvasModel getfCanvasModel() {
		return Util.verifyNonNull(fCanvasModel);
	}

	private void setfCanvasModel(ICanvasModel fCanvasModel) {
		this.fCanvasModel = fCanvasModel;
	}

	private ITemplateGroup getfSelectedTemplateGroup() {
		return Util.verifyNonNull(fSelectedTemplateGroup);
	}

	private void setfSelectedTemplateGroup(ITemplateGroup fSelectedTemplateGroup) {
		this.fSelectedTemplateGroup = fSelectedTemplateGroup;
	}
}
