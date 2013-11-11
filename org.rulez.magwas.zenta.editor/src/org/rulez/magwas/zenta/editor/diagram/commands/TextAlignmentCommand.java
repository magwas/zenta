/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IFontAttribute;



/**
 * Text Alignment Command
 *
 * @author Phillip Beauvoir
 */
public class TextAlignmentCommand extends EObjectFeatureCommand {
    
    public TextAlignmentCommand(IFontAttribute object, int value) {
        super(Messages.TextAlignmentCommand_0, object, IZentaPackage.Literals.FONT_ATTRIBUTE__TEXT_ALIGNMENT, value);
    }
}