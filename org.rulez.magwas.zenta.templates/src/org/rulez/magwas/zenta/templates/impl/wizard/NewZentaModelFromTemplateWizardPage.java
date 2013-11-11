/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.impl.wizard;

import org.rulez.magwas.zenta.templates.model.TemplateManager;
import org.rulez.magwas.zenta.templates.wizard.NewModelFromTemplateWizardPage;


/**
 * New Zenta Model From Template Wizard Page
 * 
 * @author Phillip Beauvoir
 */
public class NewZentaModelFromTemplateWizardPage extends NewModelFromTemplateWizardPage {
    
    private static String HELP_ID = "org.rulez.magwas.zenta.help.NewZentaModelFromTemplateWizardPage"; //$NON-NLS-1$

    public NewZentaModelFromTemplateWizardPage(TemplateManager templateManager) {
        super("NewZentaModelFromTemplateWizardPage", templateManager); //$NON-NLS-1$
    }

    @Override
    protected void init() {
        setTitle(Messages.NewZentaModelFromTemplateWizardPage_1);
        setDescription(Messages.NewZentaModelFromTemplateWizardPage_2);
    }
    
    @Override
    protected String getHelpID() {
        return HELP_ID;
    }

}
