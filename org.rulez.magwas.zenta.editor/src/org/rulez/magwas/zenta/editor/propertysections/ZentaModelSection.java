/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.propertysections;

import java.io.File;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.model.commands.EObjectFeatureCommand;
import org.rulez.magwas.zenta.editor.ui.components.StyledTextControl;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;



/**
 * Property Section for an Zenta Model
 * 
 * @author Phillip Beauvoir
 */
public class ZentaModelSection extends AbstractZentaPropertySection {
    
    private static final String HELP_ID = "org.rulez.magwas.zenta.help.zentaModelSection"; //$NON-NLS-1$

    /*
     * Adapter to listen to changes made elsewhere (including Undo/Redo commands)
     */
    private Adapter eAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(Notification msg) {
            Object feature = msg.getFeature();
            // Model Name event (Undo/Redo and here!)
            if(feature == IZentaPackage.Literals.NAMEABLE__NAME) {
                refreshNameField();
                fPage.labelProviderChanged(null); // Update Main label
            }
            // Model File
            else if(feature == IZentaPackage.Literals.ZENTA_MODEL__FILE) {
                refreshFileField();
            }
            // Model Purpose event (Undo/Redo and here!)
            else if(feature == IZentaPackage.Literals.DOCUMENTABLE__DOCUMENTATION) {
                refreshPurposeField();
            }
        }
    };
    
    private IZentaModel fModel;
    
    private PropertySectionTextControl fTextName;
    private Text fTextFile;
    private PropertySectionTextControl fTextPurpose;
    
    @Override
    protected void createControls(Composite parent) {
        fTextName = createNameControl(parent, Messages.ZentaModelSection_0);
        createFileControl(parent);
        createPurposeControl(parent);
        
        // Help ID
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
    }
    
    private void createFileControl(Composite parent) {
        // Label
        createLabel(parent, Messages.ZentaModelSection_1, STANDARD_LABEL_WIDTH, SWT.CENTER);

        // Text
        fTextFile = createSingleTextControl(parent, SWT.READ_ONLY);
    }
    
    private void createPurposeControl(Composite parent) {
        // Label
        createLabel(parent, Messages.ZentaModelSection_2, STANDARD_LABEL_WIDTH, SWT.NONE);

        // Text
        StyledTextControl styledTextControl = createStyledTextControl(parent, SWT.NONE);
        
        fTextPurpose = new PropertySectionTextControl(styledTextControl.getControl(), IZentaPackage.Literals.DOCUMENTABLE__DOCUMENTATION) {
            @Override
            protected void textChanged(String oldText, String newText) {
                if(isAlive()) {
                    fIsExecutingCommand = true;
                    getCommandStack().execute(new EObjectFeatureCommand(Messages.ZentaModelSection_3, fModel,
                                                    IZentaPackage.Literals.DOCUMENTABLE__DOCUMENTATION, newText));
                    fIsExecutingCommand = false;
                }
            }
        };
        fTextPurpose.setHint(Messages.ZentaModelSection_4);
    }

    @Override
    protected void setElement(Object element) {
        if(element instanceof IZentaModel) {
            fModel = (IZentaModel)element;
        }
        else {
            System.err.println("Section wants to display for " + element); //$NON-NLS-1$
        }
        
        refreshControls();
    }
    
    protected void refreshControls() {
        refreshNameField();
        refreshFileField();
        refreshPurposeField();
    }
    
    protected void refreshNameField() {
        if(fIsExecutingCommand) {
            return; 
        }
        fTextName.refresh(fModel);
    }
    
    protected void refreshFileField() {
        File file = fModel.getFile();
        if(file != null) {
            fTextFile.setText(file.getAbsolutePath());
        }
        else{
            fTextFile.setText(Messages.ZentaModelSection_5);
        }
    }
    
    protected void refreshPurposeField() {
        if(fIsExecutingCommand) {
            return; 
        }
        fTextPurpose.refresh(fModel);
    }

    @Override
    protected Adapter getECoreAdapter() {
        return eAdapter;
    }

    @Override
    protected EObject getEObject() {
        return fModel;
    }
    
    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }
}
