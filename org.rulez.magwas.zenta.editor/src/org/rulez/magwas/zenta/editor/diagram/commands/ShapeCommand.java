/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelObject;



/**
 * Shape Command
 *
 * @author Árpád Magosányi
 */
public class ShapeCommand extends EObjectFeatureCommand {
    
    public ShapeCommand(IDiagramModelObject object, String shape) {
        super(Messages.ShapeCommand_0, object, IZentaPackage.Literals.DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE, shape);
    }
}