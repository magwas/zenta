/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.impl;

import java.io.File;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.model.EditorModelManagerNoGUI;
import org.rulez.magwas.zenta.editor.model.compatibility.IncompatibleModelException;
import org.rulez.magwas.zenta.editor.model.compatibility.LaterModelVersionException;
import org.rulez.magwas.zenta.model.IZentaModel;



/**
 * Editor Model Manager.<p>
 * <p>
 * Acts as an adapter to the Zenta Models passing on notifications to listeners
 * so that clients only have to register here once rather than for each model.<p>
 * Also can pass on arbitrary PropertyChangeEvents to registered listeners.<br>
 * Also manages CommandStacks for models.<br>
 * Also handles persistence of models.
 * 
 * @author Phillip Beauvoir
 */
public class EditorModelManager extends EditorModelManagerNoGUI {
    
    public EditorModelManager() {
        PlatformUI.getWorkbench().addWorkbenchListener(workBenchListener);
    }
    
    public boolean laterModelDialog(File file, LaterModelVersionException ex) {
		boolean answer = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(),
		        Messages.EditorModelManager_4,
		        NLS.bind(Messages.EditorModelManager_5,
		                file, ex.getVersion()));
		return answer;
	}

	public void incompatibleDialog(File file, IncompatibleModelException ex1) {
		MessageDialog.openError(Display.getCurrent().getActiveShell(),
		        Messages.EditorModelManager_2,
		        NLS.bind(Messages.EditorModelManager_3, file)
		        + "\n" + ex1.getMessage()); //$NON-NLS-1$
	}
    
    public int saveModelDialog(IZentaModel model) {
		MessageDialog dialog = new MessageDialog(Display.getCurrent().getActiveShell(),
                Messages.EditorModelManager_6,
                null,
                NLS.bind(Messages.EditorModelManager_7, model.getName()),
                MessageDialog.QUESTION,
                new String[] {
                    IDialogConstants.YES_LABEL,
                    IDialogConstants.NO_LABEL,
                    IDialogConstants.CANCEL_LABEL },
                0);
		return dialog.open();
	}

    public boolean sureToOverwriteDialog(File file) {
	    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		boolean result = MessageDialog.openQuestion(shell,
		        Messages.EditorModelManager_10,
		        NLS.bind(Messages.EditorModelManager_11, file));
		return result;
	}
     
	public void alreadyOpenDialog(File file) {
	    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog.openWarning(shell,
		        Messages.EditorModelManager_8,
		        NLS.bind(Messages.EditorModelManager_9, file));
	}

	public String askSavePath() {
		// On Mac if the app is minimised in the dock Display.getCurrent().getActiveShell() will return null
	    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
	    shell.setActive(); // Get focus on Mac
	    
	    FileDialog dialog = new FileDialog(shell, SWT.SAVE);
	    dialog.setFilterExtensions(new String[] { ZENTA_FILE_WILDCARD, "*.*" } ); //$NON-NLS-1$
	    String path = dialog.open();
	    if(path == null) {
	        return null;
	    }
	    
	    // Only Windows adds the extension by default
	    if(dialog.getFilterIndex() == 0 && !path.endsWith(ZENTA_FILE_EXTENSION)) {
	        path += ZENTA_FILE_EXTENSION;
	    }
		return path;
	}

}
