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
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.ModelVersion;
import org.rulez.magwas.zenta.templates.impl.model.ZentamateTemplateManager;
import org.rulez.magwas.zenta.templates.model.ITemplate;
import org.rulez.magwas.zenta.templates.model.TemplateManager;



/**
 * New Zentamate Model From Template Wizard
 * 
 * @author Phillip Beauvoir
 */
public class NewZentamateModelFromTemplateWizard extends Wizard {
    
    private NewZentamateModelFromTemplateWizardPage fMainPage;
    
    private String fErrorMessage;

    private TemplateManager fTemplateManager;
    
    public NewZentamateModelFromTemplateWizard() {
        setWindowTitle(Messages.NewZentamateModelFromTemplateWizard_0);
        fTemplateManager = new ZentamateTemplateManager();
    }
    
    @Override
    public void addPages() {
        fMainPage = new NewZentamateModelFromTemplateWizardPage(fTemplateManager);
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
        if(zipFile != null && zipFile.exists()) {
            BusyIndicator.showWhile(Display.getCurrent(), new Runnable() {
                @Override
                public void run() {
                    try {
                        File tmp = File.createTempFile("~architemplate", null); //$NON-NLS-1$
                        tmp.deleteOnExit();
                        File file = ZipUtils.extractZipEntry(zipFile, TemplateManager.ZIP_ENTRY_MODEL, tmp);
                        if(file != null && file.exists()) {
                            IZentamateModel model = IEditorModelManager.INSTANCE.openModel(file);
                            if(model != null) {
                                // New name
                                model.setName(Messages.NewZentamateModelFromTemplateWizard_1 + " " + model.getName()); //$NON-NLS-1$
                                
                                // Set latest model version (need to do this in case we immediately save as Template)
                                model.setVersion(ModelVersion.VERSION);
                                
                                // Set file to null
                                model.setFile(null);
                                
                                // Edit in-place in Tree
                                UIRequestManager.INSTANCE.fireRequest(new TreeEditElementRequest(this, model));
                            }
                            else {
                                fErrorMessage = Messages.NewZentamateModelFromTemplateWizard_2;
                            }
                        }
                        else {
                            fErrorMessage = Messages.NewZentamateModelFromTemplateWizard_2;
                        }
                        tmp.delete();
                    }
                    catch(IOException ex) {
                        ex.printStackTrace();
                        fErrorMessage = ex.getMessage();
                    }
                }
            });
        }
        
        if(fErrorMessage != null) {
            MessageDialog.openError(getShell(), Messages.NewZentamateModelFromTemplateWizard_3, fErrorMessage);
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
