/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelObject;



/**
 * Fill Color Command
 *
 * @author Phillip Beauvoir
 */
public class FillColorCommand extends EObjectFeatureCommand {
    
    public FillColorCommand(IDiagramModelObject object, String rgb) {
        super(Messages.FillColorCommand_0, object, IZentamatePackage.Literals.DIAGRAM_MODEL_OBJECT__FILL_COLOR, rgb);
    }
}