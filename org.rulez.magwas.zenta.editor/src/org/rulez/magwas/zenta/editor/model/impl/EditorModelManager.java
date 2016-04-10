/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.impl;

import java.io.File;
import java.io.IOException;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.eclipse.ui.PlatformUI;
import org.eclipse.gef.commands.CommandStack;
import org.rulez.magwas.nonnul.NonNullListIterator;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.manager.AbstractEditorModelManager;
import org.rulez.magwas.zenta.model.manager.IncompatibleModelException;
import org.rulez.magwas.zenta.model.manager.LaterModelVersionException;
import org.rulez.magwas.zenta.model.manager.Messages;
import org.rulez.magwas.zenta.model.util.LogUtil;



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
public class EditorModelManager extends AbstractEditorModelManager implements IEditorModelManager{
    
	protected IWorkbenchListener workBenchListener = new IWorkbenchListener() {
        public void postShutdown(IWorkbench workbench) {
        }

        public boolean preShutdown(IWorkbench  workbench, boolean forced) {
            for (NonNullListIterator<IZentaModel> iterator = getModels().iterator(); iterator
					.hasNext();) {
				IZentaModel model = iterator.next();
				if(isModelDirty(model)) {
                    try {
                        boolean result = askSaveModel(model);
                        if(!result) {
                            return false;
                        }
                    }
                    catch(IOException ex) {
                        LogUtil.logException(ex);
                    }
                }
			}
            
            return true;
        }

    };

	public EditorModelManager() {
        PlatformUI.getWorkbench().addWorkbenchListener(workBenchListener);
    }

    @Override
    public boolean laterModelDialog(File file, LaterModelVersionException ex) {
		boolean answer = MessageDialog.openQuestion(Display.getCurrent().getActiveShell(),
		        Messages.EditorModelManager_4,
		        NLS.bind(Messages.EditorModelManager_5,
		                file, ex.getVersion()));
		return answer;
	}

    @Override
	public void incompatibleDialog(File file, IncompatibleModelException ex1) {
		MessageDialog.openError(Display.getCurrent().getActiveShell(),
		        Messages.EditorModelManager_2,
		        NLS.bind(Messages.EditorModelManager_3, file)
		        + "\n" + ex1.getMessage()); //$NON-NLS-1$
	}
    
    @Override
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

    @Override
    public boolean sureToOverwriteDialog(File file) {
	    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		boolean result = MessageDialog.openQuestion(shell,
		        Messages.EditorModelManager_10,
		        NLS.bind(Messages.EditorModelManager_11, file));
		return result;
	}
     
    @Override
	public void alreadyOpenDialog(File file) {
	    Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
		MessageDialog.openWarning(shell,
		        Messages.EditorModelManager_8,
		        NLS.bind(Messages.EditorModelManager_9, file));
	}

    @Override
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

	@Override
	public boolean isModelDirty(IZentaModel model) {
		IZentaModel m = Util.verifyNonNull(model);
	    CommandStack stack = obtainCommandStack(m);
	    return stack.isDirty();
	}

	@Override
	public CommandStack obtainCommandStack(IAdapter obj) {
		IAdapter ob = Util.verifyNonNull(obj);
		CommandStack adapter = (CommandStack) ob.getAdapter(CommandStack.class);
		return Util.verifyNonNull(adapter);
	}

	private void deleteCommandStack(IZentaModel model) {
	    CommandStack stack = (CommandStack)model.getAdapter(CommandStack.class);
	    if(stack != null) {
	        stack.dispose();
	    }
	}

	@Override
	public boolean removeModelWithoutDirtyCheck(IZentaModel model) {
		// Close the corresponding GEF editor(s) for this model *FIRST* before removing from model
	    EditorManager.closeDiagramEditors(model);
	    
	    getModels().remove(model);
	    model.eAdapters().clear();
	    firePropertyChange(this, PROPERTY_MODEL_REMOVED, null, model);
	    
	    // Delete the CommandStack *LAST* because GEF Editor(s) will still reference it!
	    deleteCommandStack(model);
	    
	    // Delete Archive Manager
	    deleteArchiveManager(model);
	
	    return true;
	}

}
