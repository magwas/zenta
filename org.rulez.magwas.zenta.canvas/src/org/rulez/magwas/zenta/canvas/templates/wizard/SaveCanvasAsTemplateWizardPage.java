/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.templates.wizard;

import java.io.File;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.canvas.model.ICanvasModel;
import org.rulez.magwas.zenta.canvas.templates.model.CanvasTemplateManager;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.editor.ui.UIUtils;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.info.IZentaImages;
import org.rulez.magwas.zenta.templates.model.TemplateManager;
import org.rulez.magwas.zenta.templates.wizard.TemplateUtils;



/**
 * Save Canvas As Template Wizard Page 1
 * 
 * @author Phillip Beauvoir
 */
public class SaveCanvasAsTemplateWizardPage extends WizardPage {

    private static String HELP_ID = "org.rulez.magwas.zenta.help.SaveCanvasAsTemplateWizardPage"; //$NON-NLS-1$

    private ICanvasModel fCanvasModel;

    private Text fFileTextField;
    private Text fNameTextField;
    private Text fDescriptionTextField;
    private Label fPreviewLabel;
    private Button fButtonIncludeThumbnail;

    private TemplateManager fTemplateManager;
    
    static File CURRENT_FOLDER = new File(System.getProperty("user.home")); //$NON-NLS-1$
    
    public SaveCanvasAsTemplateWizardPage(ICanvasModel canvasModel, TemplateManager templateManager) {
        super("SaveCanvasAsTemplateWizardPage"); //$NON-NLS-1$
        setTitle(Messages.SaveCanvasAsTemplateWizardPage_0);
        setDescription(Messages.SaveCanvasAsTemplateWizardPage_1);
        setImageDescriptor(IZentaUIImages.ImageFactory.getImageDescriptor(IZentaImages.ECLIPSE_IMAGE_NEW_WIZARD));
        fCanvasModel = canvasModel;
        fTemplateManager = templateManager;
    }

    @Override
    public void createControl( Composite parent) {
        GridData gd;
        Label label;
        
        Composite container = new Composite(parent, SWT.NULL);
        container.setLayout(new GridLayout());
        setControl(container);
        
        PlatformUI.getWorkbench().getHelpSystem().setHelp(container, HELP_ID);
        
        Group fileComposite = new Group(container, SWT.NULL);
        fileComposite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        GridLayout layout = new GridLayout(3, false);
        fileComposite.setLayout(layout);
        
        label = new Label(fileComposite, SWT.NULL);
        label.setText(Messages.SaveCanvasAsTemplateWizardPage_2);
        
        fFileTextField = new Text(fileComposite, SWT.BORDER | SWT.SINGLE);
        fFileTextField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        File newFile = new File(CURRENT_FOLDER, Messages.SaveCanvasAsTemplateWizardPage_3 + CanvasTemplateManager.CANVAS_TEMPLATE_FILE_EXTENSION);
        fFileTextField.setText(newFile.getPath());
        // Single text control so strip CRLFs
        UIUtils.conformSingleTextControl(fFileTextField);
        fFileTextField.addModifyListener(new ModifyListener() {
            public void modifyText( ModifyEvent e) {
                validateFields();
            }
        });
        
        Button fileButton = new Button(fileComposite, SWT.PUSH);
        fileButton.setText(Messages.SaveCanvasAsTemplateWizardPage_4);
        fileButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected( SelectionEvent e) {
                File file = chooseFile();
                if(file != null) {
                    fFileTextField.setText(file.getPath());
                    CURRENT_FOLDER = file.getParentFile();
                }
            }
        });
        
        Group fieldGroup = new Group(container, SWT.NULL);
        fieldGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        layout = new GridLayout(2, false);
        fieldGroup.setLayout(layout);
        
        label = new Label(fieldGroup, SWT.NULL);
        label.setText(Messages.SaveCanvasAsTemplateWizardPage_5);

        fNameTextField = new Text(fieldGroup, SWT.BORDER | SWT.SINGLE);
        fNameTextField.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        if(StringUtils.isSet(fCanvasModel.getName())) {
            fNameTextField.setText(fCanvasModel.getName());
        }
        // Single text control so strip CRLFs
        UIUtils.conformSingleTextControl(fNameTextField);
        fNameTextField.addModifyListener(new ModifyListener() {
            public void modifyText( ModifyEvent e) {
                validateFields();
            }
        });
        
        label = new Label(fieldGroup, SWT.NULL);
        label.setText(Messages.SaveCanvasAsTemplateWizardPage_6);
        gd = new GridData(SWT.NULL, SWT.TOP, false, false);
        label.setLayoutData(gd);
        
        fDescriptionTextField = new Text(fieldGroup, SWT.BORDER | SWT.MULTI | SWT.WRAP | SWT.V_SCROLL);
        gd = new GridData(GridData.FILL_BOTH);
        gd.heightHint = 120;
        fDescriptionTextField.setLayoutData(gd);
        if(StringUtils.isSet(fCanvasModel.getDocumentation())) {
            fDescriptionTextField.setText(fCanvasModel.getDocumentation());
        }
        
        // Thumbnail
        
        Group thumbsGroup = new Group(container, SWT.NULL);
        thumbsGroup.setLayoutData(new GridData(GridData.FILL_BOTH));
        layout = new GridLayout(2, false);
        thumbsGroup.setLayout(layout);
        
        fButtonIncludeThumbnail = new Button(thumbsGroup, SWT.CHECK);
        fButtonIncludeThumbnail.setText(Messages.SaveCanvasAsTemplateWizardPage_7);
        fButtonIncludeThumbnail.setSelection(true);
        fButtonIncludeThumbnail.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected( SelectionEvent e) {
                fPreviewLabel.setEnabled(fButtonIncludeThumbnail.getSelection());
            }
        });
        
        gd = new GridData(GridData.FILL_HORIZONTAL);
        gd.horizontalSpan = 2;
        fButtonIncludeThumbnail.setLayoutData(gd);
        
        label = new Label(thumbsGroup, SWT.NULL);
        label.setText(Messages.SaveCanvasAsTemplateWizardPage_8 + "  "); //$NON-NLS-1$
        gd = new GridData(SWT.NULL, SWT.TOP, false, false);
        label.setLayoutData(gd);

        fPreviewLabel = new Label(thumbsGroup, SWT.BORDER);
        gd = new GridData(GridData.FILL_BOTH);
        gd.heightHint = 120;
        gd.widthHint = 150;
        fPreviewLabel.setLayoutData(gd);
        
        // Dispose of the image here not in the main dispose() method because if the help system is showing then 
        // the TrayDialog is resized and this label is asked to relayout.
        fPreviewLabel.addDisposeListener(new DisposeListener() {
            @Override
            public void widgetDisposed( DisposeEvent e) {
                disposePreviewImage();
            }
        });
        
        Display.getCurrent().asyncExec(new Runnable() {
            @Override
            public void run() {
                TemplateUtils.createThumbnailPreviewImage(fCanvasModel, fPreviewLabel);
            }
        });
        
        fPreviewLabel.addControlListener(new ControlAdapter() {
            int oldTime;
            
            @Override
            public void controlResized( ControlEvent eo) {
            	ControlEvent e = Util.verifyNonNull(eo);
                if(e.time - oldTime > 10) {
                    disposePreviewImage();
                    TemplateUtils.createThumbnailPreviewImage(fCanvasModel, fPreviewLabel);
                }
                oldTime = e.time;
            }
        });
        
        validateFields();
    }
    
    /**
     * @return The File for the template
     */
    public String getFileName() {
        return Util.verifyNonNull(fFileTextField.getText());
    }

    /**
     * @return The Name for the template
     */
    public String getTemplateName() {
        return Util.verifyNonNull(fNameTextField.getText());
    }
    
    /**
     * @return The Name for the template
     */
    public String getTemplateDescription() {
        return Util.verifyNonNull(fDescriptionTextField.getText());
    }
    
    public boolean includeThumbnail() {
        return fButtonIncludeThumbnail.getSelection();
    }
    
    private  File chooseFile() {
        FileDialog dialog = new FileDialog(getShell(), SWT.SAVE);
        dialog.setText(Messages.SaveCanvasAsTemplateWizardPage_9);
        dialog.setFilterExtensions(new String[] { "*" + fTemplateManager.getTemplateFileExtension(), "*.*" } ); //$NON-NLS-1$ //$NON-NLS-2$
        String path = dialog.open();
        if(path != null) {
            // Only Windows adds the extension by default
            if(dialog.getFilterIndex() == 0 && !path.endsWith(CanvasTemplateManager.CANVAS_TEMPLATE_FILE_EXTENSION)) {
                path += CanvasTemplateManager.CANVAS_TEMPLATE_FILE_EXTENSION;
            }
            return new File(path);
        }
        return null;
    }
    
    private void validateFields() {
        String fileName = getFileName();
        if(!StringUtils.isSetAfterTrim(fileName)) {
            updateStatus(Messages.SaveCanvasAsTemplateWizardPage_10);
            return;
        }
        
        String name = getTemplateName();
        if(!StringUtils.isSetAfterTrim(name)) {
            updateStatus(Messages.SaveCanvasAsTemplateWizardPage_11);
            return;
        }
        
        updateStatus(null);
    }

    /**
     * Update the page status
     */
    private void updateStatus( String message) {
        setErrorMessage(message);
        setPageComplete(message == null);
    }
    
    private void disposePreviewImage() {
        if(fPreviewLabel != null && fPreviewLabel.getImage() != null && !fPreviewLabel.getImage().isDisposed()) {
            fPreviewLabel.getImage().dispose();
        }
    }
}
