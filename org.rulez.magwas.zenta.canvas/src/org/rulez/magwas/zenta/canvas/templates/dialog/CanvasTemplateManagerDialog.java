/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.templates.dialog;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.rulez.magwas.zenta.templates.dialog.TemplateManagerDialog;
import org.rulez.magwas.zenta.templates.model.TemplateManager;



/**
 * Canvas Template Manager Dialog
 * 
 * @author Phillip Beauvoir
 */
public class CanvasTemplateManagerDialog extends TemplateManagerDialog {
    
    private static String HELP_ID = "org.rulez.magwas.zenta.help.CanvasTemplateManagerDialog"; //$NON-NLS-1$
    
    public CanvasTemplateManagerDialog(Shell parentShell, TemplateManager templateManager) {
        super(parentShell, templateManager);
    }

    @Override
    protected void configureShell(Shell shell) {
        super.configureShell(shell);
        shell.setText(Messages.CanvasTemplateManagerDialog_0);
    }

    @Override
    protected Control createDialogArea(Composite parent) {
        Control control = super.createDialogArea(parent);
        setTitle(Messages.CanvasTemplateManagerDialog_1);
        setMessage(Messages.CanvasTemplateManagerDialog_2);
        return control;
    }
    
    @Override
    protected String getHelpID() {
        return HELP_ID;
    }
}
