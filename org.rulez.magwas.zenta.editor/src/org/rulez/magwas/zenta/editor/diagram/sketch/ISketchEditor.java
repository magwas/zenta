/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.sketch;

import org.rulez.magwas.zenta.editor.ZentamateEditorPlugin;
import org.rulez.magwas.zenta.editor.diagram.IDiagramModelEditor;


/**
 * ISketchEditor
 * 
 * @author Phillip Beauvoir
 */
public interface ISketchEditor extends IDiagramModelEditor {
    String ID = ZentamateEditorPlugin.PLUGIN_ID + ".sketchEditor"; //$NON-NLS-1$
    String HELP_ID = "org.rulez.magwas.zenta.help.sketchEditorHelp"; //$NON-NLS-1$
    
    void updateBackgroundImage();
    
    // Backgrounds
    String[] BACKGROUNDS = {
            Messages.ISketchEditor_0,
            Messages.ISketchEditor_1,
            Messages.ISketchEditor_2
    };
}
