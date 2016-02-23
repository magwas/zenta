/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.actions;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.editor.views.tree.TreeSelectionSynchroniser;
import org.rulez.magwas.zenta.controller.IZentaImages;



/**
 * Link To Editor Action
 * 
 * @author Phillip Beauvoir
 */
public class LinkToEditorAction extends Action {
    
    public LinkToEditorAction() {
        super(Messages.LinkToEditorAction_0, IAction.AS_CHECK_BOX);
        setImageDescriptor(IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_LINKED_16));
        setChecked(Preferences.doLinkView());
    }
    
    @Override
    public void run() {
        Preferences.setLinkView(isChecked());
        if(isChecked()) {
            TreeSelectionSynchroniser.INSTANCE.refresh();
        }
    }

}
