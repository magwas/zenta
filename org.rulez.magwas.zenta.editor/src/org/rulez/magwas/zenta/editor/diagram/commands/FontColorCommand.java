/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IFontAttribute;



/**
 * Font Color Command
 *
 * @author Phillip Beauvoir
 */
public class FontColorCommand extends EObjectFeatureCommand {
    
    public FontColorCommand(IFontAttribute object, String rgb) {
        super(Messages.FontColorCommand_0, object, IZentamatePackage.Literals.FONT_ATTRIBUTE__FONT_COLOR, rgb);
    }
}