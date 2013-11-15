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
 * Font Color Command
 *
 * @author Phillip Beauvoir
 */
public class LineDecorationCommand extends EObjectFeatureCommand {
    
    public LineDecorationCommand(IFontAttribute object, String rgb) {
        super(Messages.LineDecorationCommand_0, object, IZentaPackage.Literals.DIAGRAM_MODEL_CONNECTION__LINE_DECORATION, rgb);
    }
}