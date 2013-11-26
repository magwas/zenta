/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import org.rulez.magwas.zenta.editor.ZentaEditorPlugin;
import org.rulez.magwas.zenta.model.IZentaElement;



/**
 * IDiagramEditor
 * 
 * @author Phillip Beauvoir
 */
public interface IZentaDiagramEditor extends IDiagramModelEditor {
    String ID = ZentaEditorPlugin.PLUGIN_ID + ".diagramEditor"; //$NON-NLS-1$
    String HELP_ID = "org.rulez.magwas.zenta.help.diagramEditorHelp"; //$NON-NLS-1$
    String PALETTE_HELP_ID = "org.rulez.magwas.zenta.help.diagramEditorPaletteHelp"; //$NON-NLS-1$
    
    String PROPERTY_SHOW_STRUCTURAL_CHAIN = "_prop_showStructuralChain"; //$NON-NLS-1$
    
    /**
     * Select the graphical objects wrapping the Zenta elements
     * @param elements
     */
    void selectElements(IZentaElement[] elements);
    public ZentaDiagramEditorPalette getPaletteRoot();
}
