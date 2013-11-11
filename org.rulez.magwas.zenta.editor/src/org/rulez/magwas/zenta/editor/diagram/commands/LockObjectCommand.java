/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.commands;

import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.ILockable;



/**
 * Lock Object Command
 *
 * @author Phillip Beauvoir
 */
public class LockObjectCommand extends EObjectFeatureCommand {
    
    public LockObjectCommand(ILockable lockable, boolean lock) {
        super(lock ? Messages.LockObjectCommand_0 : Messages.LockObjectCommand_1, lockable, IZentaPackage.Literals.LOCKABLE__LOCKED, lock);
    }
}