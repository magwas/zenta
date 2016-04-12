/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.impl.wizard;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipOutputStream;

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
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.editor.model.impl.EditorModelImage;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.manager.IArchiveManager;
import org.rulez.magwas.zenta.model.util.LogUtil;
import org.rulez.magwas.zenta.model.util.ZipUtils;
import org.rulez.magwas.zenta.templates.impl.model.ZentaModelTemplate;
import org.rulez.magwas.zenta.templates.impl.model.ZentaTemplateManager;
import org.rulez.magwas.zenta.templates.model.ITemplateGroup;
import org.rulez.magwas.zenta.templates.model.ITemplateXMLTags;
import org.rulez.magwas.zenta.templates.model.TemplateManager;
import org.rulez.magwas.zenta.templates.wizard.SaveModelAsTemplateToCollectionWizardPage;
import org.rulez.magwas.zenta.templates.wizard.TemplateUtils;

import uk.ac.bolton.jdom.JDOMUtils;


/**
 * Save Archmate Model As Template Wizard
 * 
 * @author Phillip Beauvoir
 */
public class SaveZentaModelAsTemplateWizard extends Wizard {
    
    private IZentaModel fModel;
    
    private SaveZentaModelAsTemplateWizardPage fPage1;
    private SaveModelAsTemplateToCollectionWizardPage fPage2;
    
    private File fZipFile;
    private String fTemplateName;
    private String fTemplateDescription;
    private boolean fIncludeThumbnails;
    private IDiagramModel fSelectedDiagramModel;
    private ITemplateGroup fSelectedTemplateGroup;
    private boolean fDoStoreInCollection;
    
    private TemplateManager fTemplateManager;
    
    public SaveZentaModelAsTemplateWizard(IZentaModel model) {
        setWindowTitle(Messages.SaveZentaModelAsTemplateWizard_0);
        setfModel(model);
        setfTemplateManager(new ZentaTemplateManager());
    }
    
    @Override
    public void addPages() {
        fPage1 = new SaveZentaModelAsTemplateWizardPage(getfModel(), getfTemplateManager());
        addPage(fPage1);
        fPage2 = new SaveZentaModelAsTemplateToCollectionWizardPage(getfTemplateManager());
        addPage(fPage2);
    }

    @Override
    public boolean performFinish() {
        // This before the thread starts
        setfZipFile(new File(fPage1.getFileName()));
        
        // Make sure the file does not already exist
        if(getfZipFile().exists()) {
            boolean result = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(),
                    Messages.SaveZentaModelAsTemplateWizard_1,
                    NLS.bind(Messages.SaveZentaModelAsTemplateWizard_2, getfZipFile().getPath()));
            if(!result) {
                return false;
            }
        }

        fTemplateName = fPage1.getTemplateName();
        fTemplateDescription = fPage1.getTemplateDescription();
        fIncludeThumbnails = fPage1.includeThumbnails();
        fSelectedDiagramModel = fPage1.getSelectedDiagramModel();
        fDoStoreInCollection = fPage2.doStoreInCollection();
        setfSelectedTemplateGroup(fPage2.getTemplateGroup());
        
        BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
            @Override
            public void run() {
                try {
                    createZipFile(getfZipFile());
                    
                    if(fDoStoreInCollection) {
                        getfTemplateManager().addTemplateEntry(getfZipFile(), getfSelectedTemplateGroup());
                    }
                }
                catch(final Exception ex) {
                    LogUtil.logException(ex);
                    Display.getCurrent().asyncExec(new Runnable() { // Display after wizard closes
                        public void run() {
                            MessageDialog.openError(getShell(), Messages.SaveZentaModelAsTemplateWizard_3, ex.getMessage());
                        }
                    });
                }
            }
        });
        
        return true;
    }
    
    private void createZipFile(File zipFile) throws Exception {
        ZipOutputStream zOut = null;
        
        try {
            // Delete any existing zip first
            zipFile.delete();
            
            // Start a zip stream
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(zipFile));
            zOut = new ZipOutputStream(out);

            // Add Manifest
            String manifest = createManifest();
            ZipUtils.addStringToZip(manifest, TemplateManager.getZipEntryManifest(), zOut);
            
            // Add any thumbnails
            if(fIncludeThumbnails) {
                int i = 1;
                for(IDiagramModel dm : getfModel().getDiagramModels()) {
                    Image image = TemplateUtils.createThumbnailImage(dm);
                    ZipUtils.addImageToZip(new EditorModelImage(image), TemplateManager.ZIP_ENTRY_THUMBNAILS + i++ + ".png", zOut, SWT.IMAGE_PNG, null); //$NON-NLS-1$
                    image.dispose();
                }
            }

            /*
             * Save model to xml temp file and add to Zip.
             * Do this last because we need to dispose the Archive Manager last because its images are re-used
             * several times to create thumbnails.
             */
            File tempFile = saveModelToTempFile();
            ZipUtils.addFileToZip(tempFile, TemplateManager.getZipEntryModel(), zOut);
            tempFile.delete();
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
        root.setAttribute(ITemplateXMLTags.XML_TEMPLATE_ATTRIBUTE_TYPE, ZentaModelTemplate.XML_TEMPLATE_ATTRIBUTE_TYPE_MODEL);

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
        
        // Thumbnails
        if(fIncludeThumbnails) {
            if(fSelectedDiagramModel != null) {
                int i = 1;
                for(IDiagramModel dm : getfModel().getDiagramModels()) {
                    if(dm == fSelectedDiagramModel) {
                        String keyThumb = TemplateManager.ZIP_ENTRY_THUMBNAILS + i + ".png"; //$NON-NLS-1$
                        Element elementKeyThumb = new Element(ITemplateXMLTags.XML_TEMPLATE_ELEMENT_KEY_THUMBNAIL);
                        elementKeyThumb.setText(keyThumb);
                        root.addContent(elementKeyThumb);
                        break;
                    }
                    i++;
                }
            }
        }
        
        return JDOMUtils.write2XMLString(doc);
    }

    private File saveModelToTempFile() throws IOException {
        File tmpFile = File.createTempFile("architemplate", null); //$NON-NLS-1$
        tmpFile.deleteOnExit();
        
        // Copy the model
        IZentaModel tempModel = EcoreUtil.copy(getfModel());
        tempModel.eAdapters().clear();
        tempModel.setFile(tmpFile);
        
        // Create a temp Archive Manager to save the temp model
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

	public File getfZipFile() {
		return Util.verifyNonNull(fZipFile);
	}

	public void setfZipFile(File fZipFile) {
		this.fZipFile = fZipFile;
	}

	public TemplateManager getfTemplateManager() {
		return Util.verifyNonNull(fTemplateManager);
	}

	public void setfTemplateManager(TemplateManager fTemplateManager) {
		this.fTemplateManager = fTemplateManager;
	}

	public IZentaModel getfModel() {
		return Util.verifyNonNull(fModel);
	}

	public void setfModel(IZentaModel fModel) {
		this.fModel = fModel;
	}

	public ITemplateGroup getfSelectedTemplateGroup() {
		return Util.verifyNonNull(fSelectedTemplateGroup);
	}

	public void setfSelectedTemplateGroup(ITemplateGroup fSelectedTemplateGroup) {
		this.fSelectedTemplateGroup = fSelectedTemplateGroup;
	}
}
