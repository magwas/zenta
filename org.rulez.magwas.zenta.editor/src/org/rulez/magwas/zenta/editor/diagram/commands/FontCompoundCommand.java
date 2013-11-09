/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.swt.graphics.RGB;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.FontFactory;
import org.rulez.magwas.zenta.model.IFontAttribute;



/**
 * Font Command to set both font style and colour
 *
 * @author Phillip Beauvoir
 */
public class FontCompoundCommand extends CompoundCommand {
    
    public FontCompoundCommand(IFontAttribute object, String fontString, RGB rgb) {
        super(Messages.FontCompoundCommand_0);
        
        // Default font = null
        if(FontFactory.getDefaultUserViewFontData().toString().equals(fontString)) {
            fontString = null; 
        }
        
        Command cmd = new FontStyleCommand(object, fontString);
        if(cmd.canExecute()) {
            add(cmd);
        }
        
        String fontColorString = null;
        
        if(rgb != null) {
            fontColorString = ColorFactory.convertRGBToString(rgb);
            if("#000000".equals(fontColorString)) { //$NON-NLS-1$
                fontColorString = null; // Default colour black = null
            }
        }
        
        cmd = new FontColorCommand(object, fontColorString);
        if(cmd.canExecute()) {
            add(cmd);
        }
    }
}