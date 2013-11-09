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
public class SaveZentamateModelAsTemplateToCollectionWizardPage extends SaveModelAsTemplateToCollectionWizardPage {

    private static String HELP_ID = "org.rulez.magwas.zenta.help.SaveZentamateModelAsTemplateToCollectionWizardPage"; //$NON-NLS-1$

    public SaveZentamateModelAsTemplateToCollectionWizardPage(TemplateManager templateManager) {
        super("SaveModelAsTemplateToCollectionWizardPage", templateManager); //$NON-NLS-1$
    }
    
    @Override
    protected void init() {
        setTitle(Messages.SaveZentamateModelAsTemplateToCollectionWizardPage_1);
        setDescription(Messages.SaveZentamateModelAsTemplateToCollectionWizardPage_2);
    }

    @Override
    protected String getHelpID() {
        return HELP_ID;
    }
}
