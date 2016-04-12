/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model;

import java.io.File;

import org.eclipse.gef.commands.CommandStack;
import org.eclipse.swt.widgets.Shell;
import org.rulez.magwas.zenta.editor.model.impl.EditorModelManager;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.manager.IEditorModelManagerNoGUI;

/**
 * IEditorModelHandler
 * 
 * @author Phillip Beauvoir
 */
public interface IEditorModelManager extends IEditorModelManagerNoGUI {
    
    IEditorModelManager INSTANCE = new EditorModelManager();

	CommandStack obtainCommandStack(IAdapter obj);

	IZentaModel openModelOrSaySorry(Shell activeShell, File file);

}
