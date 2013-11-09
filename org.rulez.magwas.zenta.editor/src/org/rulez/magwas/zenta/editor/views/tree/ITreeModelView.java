/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree;

import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ZentamateEditorPlugin;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.editor.views.IModelSelectionView;
import org.rulez.magwas.zenta.editor.views.IModelView;


/**
 * Interface for Tree Model View
 * 
 * @author Phillip Beauvoir
 */
public interface ITreeModelView extends IModelSelectionView, IModelView {

    String ID = ZentamateEditorPlugin.PLUGIN_ID + ".treeModelView"; //$NON-NLS-1$
    String HELP_ID = "org.rulez.magwas.zenta.help.treeModelViewHelp"; //$NON-NLS-1$
    String NAME = Messages.ITreeModelView_0;
    ImageDescriptor IMAGE_DESCRIPTOR = IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_MODELS_16);
}
