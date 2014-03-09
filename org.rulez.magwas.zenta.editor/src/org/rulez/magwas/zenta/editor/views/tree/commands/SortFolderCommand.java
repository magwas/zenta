/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.views.tree.commands;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.commands.Command;
import org.rulez.magwas.zenta.editor.model.EditorModelManagerNoGUI;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IFolder;



/**
 * Sort Folder Command.
 * 
 * @author Phillip Beauvoir
 */
public class SortFolderCommand extends Command implements Comparator<EObject>  {
    
    private IFolder fFolder;
    private List<INameable> fList;

    public SortFolderCommand(IFolder folder) {
        setLabel(Messages.SortFolderCommand_0);
        fFolder = folder;
        
        // Keep a copy of the orginal order
        fList = new ArrayList<INameable>();
        for(INameable o : fFolder.getElements()) {
            fList.add(o);
        }
    }
    
	@Override
    public void execute() {
        EditorModelManagerNoGUI.signalStart(this);
        ECollections.sort(fFolder.getElements(), this);
        EditorModelManagerNoGUI.signalEnd(this);
    }

	@Override
    public void undo() {
        EditorModelManagerNoGUI.signalStart(this);
        fFolder.getElements().clear();
        fFolder.getElements().addAll(fList);
        EditorModelManagerNoGUI.signalEnd(this);
    }
    
    @Override
    public void dispose() {
        fFolder = null;
        fList = null;
    }

    @Override
    public int compare(EObject o1, EObject o2) {
        String name1 = null, name2 = null;
        
        if(o1 instanceof IDiagramModelComponent && o2 instanceof IDiagramModelComponent) {
            name1 = ((IDiagramModelComponent)o1).getName();
            name2 = ((IDiagramModelComponent)o2).getName();
        }
        else if(o1 instanceof IZentaElement && o2 instanceof IZentaElement) {
            name1 = ((IZentaElement)o1).getName();
            name2 = ((IZentaElement)o2).getName();
        }
        
        if(name1 == null) {
            name1 = ""; //$NON-NLS-1$
        }
        if(name2 == null) {
            name2 = ""; //$NON-NLS-1$
        }
        
        return name1.compareTo(name2);
    }
}
