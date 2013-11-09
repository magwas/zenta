/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.help.hints;

import org.eclipse.ui.IViewPart;
import org.rulez.magwas.zenta.help.ZentamateEditorHelpPlugin;


/**
 * Interface for Hints View
 * 
 * @author Phillip Beauvoir
 */
public interface IHintsView extends IViewPart {

    String ID = ZentamateEditorHelpPlugin.PLUGIN_ID + ".hintsView"; //$NON-NLS-1$
    String HELP_ID = ZentamateEditorHelpPlugin.PLUGIN_ID + ".hintsViewHelp"; //$NON-NLS-1$
    String NAME = Messages.IHintsView_0;
    
    String EXTENSION_POINT_ID = "org.rulez.magwas.zenta.help.hints"; //$NON-NLS-1$
}