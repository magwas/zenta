/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor;

import java.io.File;
import java.io.IOException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.IPlatformLauncher;
import org.rulez.magwas.zenta.editor.model.IEditorModelManager;
import org.rulez.magwas.zenta.model.util.LogUtil;


/**
 * PlatformLauncher for Mac
 * 
 * @author Phillip Beauvoir
 */
public class PlatformLauncher implements IPlatformLauncher {

    @Override
    public void startup() {
    }
    
    @Override
    public void displayCreated(final Display display) {
        /*
         * Add a listener to the main Display to monitor *.zenta files opened from the desktop.
         * This will work on first application launch and thereafter.
         */
        display.addListener(SWT.OpenDocument, new Listener() {
            public void handleEvent(Event paramEvent) {
                if(!PlatformUI.isWorkbenchRunning()) {
                    return;
                }
                
                String str = paramEvent.text;

                File localFile = new File(str);
                try {
                    str = localFile.getCanonicalPath();
                }
                catch(Exception ex) {
                    str = localFile.getAbsolutePath();
                }

                final File file = new File(str);
                if(file.exists() && file.isFile()) {
                    IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();

                    // If the WorkbenchWindow has been created
                    if(window != null) {
                        // Restore the Shell even if we have the file open in case it is minimised
                        window.getShell().setMinimized(false);
                        // Open the file *not* on a thread
                        openModelFile(file);
                    }
                    // Workbench not created, App is being launched from *.zenta file on desktop
                    else {
                        // Open the file *on* a thread so the Workbench can have time to open and then open any diagrams if set in Prefs
                        display.asyncExec(new Runnable() {
                            public void run() {
                                openModelFile(file);
                            };
                        });
                    }                    
                }
            }

			private void openModelFile(final File file) {
				if(!IEditorModelManager.INSTANCE.isModelLoaded(file)) {
				    try {
						IEditorModelManager.INSTANCE.openModel(file);
					} catch (IOException e) {
						LogUtil.logException(e);
					}
				}
			}
        });
    }

    @Override
    public void postWindowOpen(IWorkbenchWindow window) {
    }

    @Override
    public boolean shouldApplicationExitEarly() {
        // Not needed on Mac as Mac launches the app only once
        return false;
    }
}
