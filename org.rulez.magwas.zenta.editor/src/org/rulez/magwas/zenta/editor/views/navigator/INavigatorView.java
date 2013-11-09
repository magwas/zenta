/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.navigator;

import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ArchimateEditorPlugin;
import org.rulez.magwas.zenta.editor.ui.IArchimateImages;
import org.rulez.magwas.zenta.editor.views.IModelView;


/**
 * Interface for Navigator View
 * 
 * @author Phillip Beauvoir
 */
public interface INavigatorView extends IModelView {

    String ID = ArchimateEditorPlugin.PLUGIN_ID + ".navigatorView"; //$NON-NLS-1$
    String HELP_ID = "uk.ac.bolton.archimate.help.navigatorViewHelp"; //$NON-NLS-1$
    String NAME = Messages.INavigatorView_0;
    ImageDescriptor IMAGE_DESCRIPTOR = IArchimateImages.ImageFactory.getImageDescriptor(IArchimateImages.ICON_NAVIGATOR_16);
    
}