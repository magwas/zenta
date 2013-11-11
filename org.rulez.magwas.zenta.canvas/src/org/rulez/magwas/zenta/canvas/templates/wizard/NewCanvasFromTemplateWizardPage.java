/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.templates.wizard;

import org.rulez.magwas.zenta.canvas.templates.dialog.CanvasTemplateManagerDialog;
import org.rulez.magwas.zenta.canvas.templates.model.CanvasTemplateManager;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.templates.dialog.TemplateManagerDialog;
import org.rulez.magwas.zenta.templates.model.TemplateManager;
import org.rulez.magwas.zenta.templates.wizard.NewModelFromTemplateWizardPage;



/**
 * New Canvas Model From Template Wizard Page
 * 
 * @author Phillip Beauvoir
 */
public class NewCanvasFromTemplateWizardPage extends NewModelFromTemplateWizardPage {
    
    private static String HELP_ID = "org.rulez.magwas.zenta.help.NewCanvasFromTemplateWizardPage"; //$NON-NLS-1$

    public NewCanvasFromTemplateWizardPage(TemplateManager templateManager) {
        super("NewCanvasFromTemplateWizardPage", templateManager); //$NON-NLS-1$
    }
    
    @Override
    protected void init() {
        setTitle(Messages.NewCanvasFromTemplateWizardPage_0);
        setDescription(Messages.NewCanvasFromTemplateWizardPage_1);
        setImageDescriptor(IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ECLIPSE_IMAGE_NEW_WIZARD));
    }

    @Override
    protected TemplateManagerDialog createTemplateManagerDialog() {
        // Use a new instance of a Template Manager as a clone in case user cancels
        return new CanvasTemplateManagerDialog(getShell(), new CanvasTemplateManager());
    }
    
    @Override
    protected String getHelpID() {
        return HELP_ID;
    }
 }
