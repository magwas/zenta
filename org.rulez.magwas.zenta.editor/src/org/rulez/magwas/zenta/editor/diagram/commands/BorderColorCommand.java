/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IBorderObject;



/**
 * Border Color Command
 *
 * @author Phillip Beauvoir
 */
public class BorderColorCommand extends EObjectFeatureCommand {
    
    public BorderColorCommand(IBorderObject borderObject, String rgb) {
        super(Messages.BorderColorCommand_0, borderObject, IZentamatePackage.Literals.BORDER_OBJECT__BORDER_COLOR, rgb);
    }
}