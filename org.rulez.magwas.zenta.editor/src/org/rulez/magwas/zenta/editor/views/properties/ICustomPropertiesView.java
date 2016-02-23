/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.properties;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IViewPart;
import org.rulez.magwas.zenta.editor.ZentaEditorPlugin;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.controller.IZentaImages;


/**
 * Interface for Properties View
 * 
 * @author Phillip Beauvoir
 */
public interface ICustomPropertiesView extends IViewPart {
    String ID = ZentaEditorPlugin.PLUGIN_ID + ".propertiesView"; //$NON-NLS-1$
    String HELP_ID = "org.rulez.magwas.zenta.help.propertiesViewHelp"; //$NON-NLS-1$
    String NAME = Messages.ICustomPropertiesView_0;
    ImageDescriptor IMAGE_DESCRIPTOR = IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ECLIPSE_IMAGE_PROPERTIES_VIEW_ICON);
}
