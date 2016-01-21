/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.impl.wizard;

import org.rulez.magwas.zenta.templates.model.TemplateManager;
import org.rulez.magwas.zenta.templates.wizard.SaveModelAsTemplateToCollectionWizardPage;


/**
 * Save Model As Template Wizard Page 2
 * 
 * @author Phillip Beauvoir
 */
public class SaveZentaModelAsTemplateToCollectionWizardPage extends SaveModelAsTemplateToCollectionWizardPage {

    private static String HELP_ID = "org.rulez.magwas.zenta.help.SaveZentaModelAsTemplateToCollectionWizardPage"; //$NON-NLS-1$

    public SaveZentaModelAsTemplateToCollectionWizardPage(TemplateManager templateManager) {
        super("SaveModelAsTemplateToCollectionWizardPage", templateManager); //$NON-NLS-1$
    }
    
    @Override
    protected void init() {
        setTitle(Messages.SaveZentaModelAsTemplateToCollectionWizardPage_1);
        setDescription(Messages.SaveZentaModelAsTemplateToCollectionWizardPage_2);
    }

	
	@Override
    protected String getHelpID() {
        return HELP_ID;
    }
}
