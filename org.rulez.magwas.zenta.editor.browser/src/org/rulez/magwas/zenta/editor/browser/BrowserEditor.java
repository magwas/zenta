/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.browser;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.swt.SWT;
import org.eclipse.swt.SWTError;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.part.EditorPart;
import org.rulez.magwas.zenta.model.util.LogUtil;

/**
 * An Eclipse Editor containing a Browser component
 * 
 * @author Phillip Beauvoir
 */
public class BrowserEditor extends EditorPart implements IBrowserEditor {
    
    /**
     * The Input
     */
    private BrowserEditorInput fInput;
    
    /**
     * The Browser component
     */
    private Browser fBrowser;
    

    @Override
    public void init(IEditorSite site, IEditorInput input) throws PartInitException {
        if(!(input instanceof BrowserEditorInput)) {
            throw new IllegalArgumentException("Editor Input has to be type BrowserEditorInput"); //$NON-NLS-1$
        }

        setSite(site);
        setInput(input);
        
        fInput = (BrowserEditorInput)input;
        
        setPartName(input.getName());
    }

    @Override
    public void createPartControl(Composite parent) {
        GridLayout layout = new GridLayout();
        layout.marginHeight = 0;
        layout.marginWidth = 0;
        layout.verticalSpacing = 0;
        parent.setLayout(layout);
        
        fBrowser = createBrowser(parent);
        if(fBrowser == null) {
            Label label = new Label(parent, SWT.NONE);
            label.setText(Messages.BrowserEditor_0);
            label.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
            return;
        }
        
        fInput.browser = fBrowser;
        
        // Set URL
        if(fInput.getURL() != null) {
            fBrowser.setUrl(fInput.getURL());
        }
    }
    
    /**
     * Create the Browser if possible
     */
    protected Browser createBrowser(Composite parent) {
        Browser browser = null;
        try {
            // On Eclipse 3.6 set this
            if(isGTK()) {
                System.setProperty("org.eclipse.swt.browser.UseWebKitGTK", "true"); //$NON-NLS-1$ //$NON-NLS-2$
            }
            browser = new Browser(parent, SWT.NONE);
            browser.setLayoutData(new GridData(GridData.FILL, GridData.FILL, true, true));
        }
        catch(SWTError error) {
        	LogUtil.logException(error);
        }
        
        return browser;
    }
    
    /**
     * @return The Browser component
     */
    public Browser getBrowser() {
        return fBrowser;
    }
    
    @Override
    public void setFocus() {
        if(fBrowser != null) {
            fBrowser.setFocus();
        }
    }

    @Override
    public void doSave(IProgressMonitor monitor) {
    }

    @Override
    public void doSaveAs() {
    }

    @Override
    public boolean isDirty() {
        return false;
    }

    @Override
    public boolean isSaveAsAllowed() {
        return false;
    }
    
    private boolean isGTK() {
        return Platform.WS_GTK.equals(Platform.getWS());
    }
    
    @Override
    public void dispose() {
        super.dispose();
    }
}
