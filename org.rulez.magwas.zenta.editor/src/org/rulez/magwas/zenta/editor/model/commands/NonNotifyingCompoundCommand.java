/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.commands;

import org.eclipse.gef.commands.CompoundCommand;
import org.rulez.magwas.zenta.editor.model.EditorModelManagerNoGUI;



/**
 * Compound Command that will set a property to listeners to ignore notifications.
 * Used where many commands might cause excessive amounts of responses in clients listening to model changes. 
 * 
 * @author Phillip Beauvoir
 */
public class NonNotifyingCompoundCommand extends CompoundCommand {

    public NonNotifyingCompoundCommand() {
    }

    public NonNotifyingCompoundCommand(String label) {
        super(label);
    }
    
    @Override
    public void execute() {
        EditorModelManagerNoGUI.signalStart(this);
        super.execute();
        EditorModelManagerNoGUI.signalEnd(this);
    }
    
    @Override
    public void undo() {
        EditorModelManagerNoGUI.signalStart(this);
        super.undo();
        EditorModelManagerNoGUI.signalEnd(this);
    }
    
    @Override
    public void redo() {
        EditorModelManagerNoGUI.signalStart(this);
        super.redo();
        EditorModelManagerNoGUI.signalEnd(this);
    }
}
