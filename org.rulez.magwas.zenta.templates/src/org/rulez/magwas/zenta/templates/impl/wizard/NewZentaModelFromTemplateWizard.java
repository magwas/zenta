/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.impl.wizard;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.widgets.Display;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.UIRequestManager;
import org.rulez.magwas.zenta.editor.utils.ZipUtils;
import org.rulez.magwas.zenta.editor.views.tree.TreeEditElementRequest;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.ModelVersion;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.util.LogUtil;
import org.rulez.magwas.zenta.templates.impl.model.ZentaTemplateManager;
import org.rulez.magwas.zenta.templates.model.ITemplate;
import org.rulez.magwas.zenta.templates.model.TemplateManager;



/**
 * New Zenta Model From Template Wizard
 * 
 * @author Phillip Beauvoir
 */
public class NewZentaModelFromTemplateWizard extends Wizard {
    
    private NewZentaModelFromTemplateWizardPage fMainPage;
    
    private String fErrorMessage;

    private TemplateManager fTemplateManager;
    
    public NewZentaModelFromTemplateWizard() {
        setWindowTitle(Messages.NewZentaModelFromTemplateWizard_0);
        fTemplateManager = new ZentaTemplateManager();
    }
    
    @Override
    public void addPages() {
        fMainPage = new NewZentaModelFromTemplateWizardPage(Util.verifyNonNull(fTemplateManager));
        addPage(fMainPage);
    }

    @Override
    public boolean performFinish() {
        // Get template
        ITemplate template = fMainPage.getSelectedTemplate();
        if(template == null) {
            return false;
        }

        getContainer().getShell().setVisible(false);
        
        fErrorMessage = null;
        final File zipFile = template.getFile();
        if(zipFile.exists()) {
            BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
                @Override
                public void run() {
                    try {
                        File tmp = File.createTempFile("~architemplate", null); //$NON-NLS-1$
                        tmp.deleteOnExit();
                        File file = ZipUtils.extractZipEntry(zipFile, TemplateManager.getZipEntryModel(), tmp);
                        if(file != null && file.exists()) {
                            IZentaModel model = IEditorModelManager.INSTANCE.openModel(file);
                            // New name
                            model.setName(Messages.NewZentaModelFromTemplateWizard_1 + " " + model.getName()); //$NON-NLS-1$
                            
                            // Set latest model version (need to do this in case we immediately save as Template)
                            model.setVersion(ModelVersion.VERSION);
                            
                            // Set file to null
                            model.setFile(null);
                            
                            // Edit in-place in Tree
                            UIRequestManager.INSTANCE.fireRequest(new TreeEditElementRequest(this, model));
                        }
                        else {
                            fErrorMessage = Messages.NewZentaModelFromTemplateWizard_2;
                        }
                        tmp.delete();
                    }
                    catch(IOException ex) {
                        LogUtil.logException(ex);
                        fErrorMessage = ex.getMessage();
                    }
                }
            });
        }
        
        if(fErrorMessage != null) {
            MessageDialog.openError(getShell(), Messages.NewZentaModelFromTemplateWizard_3, fErrorMessage);
            getContainer().getShell().setVisible(true);
        }
        
        return fErrorMessage == null;
    }

    @Override
    public void dispose() {
        super.dispose();
        fTemplateManager.dispose();
    }
}
