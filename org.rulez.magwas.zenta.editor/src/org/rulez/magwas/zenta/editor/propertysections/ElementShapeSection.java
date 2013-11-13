/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.propertysections;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.diagram.commands.ShapeCommand;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.ILockable;
import org.rulez.magwas.zenta.editor.diagram.dialog.ShapeSelector;



/**
 * Property Section for an Element shape
 * 
 * @author Árpád Magosányi
 */
public class ElementShapeSection extends AbstractZentaPropertySection {
    
    private static final String HELP_ID = "org.rulez.magwas.zenta.help.elementPropertySection"; //$NON-NLS-1$

    private IDiagramModelObject fShapeObject;

    private ShapeSelector fShapeSelector;
    private Button fDefaultShapeButton;
	private EditPart editPart;
    
    

    /*
     * Adapter to listen to changes made elsewhere (including Undo/Redo commands)
     */
    private Adapter eAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(Notification msg) {
            Object feature = msg.getFeature();
            if(feature == IZentaPackage.Literals.DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE ||
                    feature == IZentaPackage.Literals.LOCKABLE__LOCKED) {
                refreshControls();
            }
        }
    };
    
    private IPropertyChangeListener shapeListener = new IPropertyChangeListener() {
        public void propertyChange(PropertyChangeEvent event) {
            if(isAlive()) {
                String newShape = fShapeSelector.getShapeValue();
                if(!newShape.equals(fShapeObject.getElementShape())) {
                    getCommandStack().execute(new ShapeCommand(fShapeObject, newShape));
                }
            }
        }
    };

    @Override
    protected void createControls(Composite parent) {
        createShapeControl(parent);
        
        // Help ID
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
    }
    
    private void createShapeControl(Composite parent) {
        createLabel(parent, Messages.ShapeSection_0, ITabbedLayoutConstants.STANDARD_LABEL_WIDTH, SWT.CENTER);
        
        Composite client = createComposite(parent, 2);
        
        fShapeSelector = new ShapeSelector(client);
        if(null != fShapeObject ) {
        	//FIXME: do we go here?
            fShapeSelector.setElement(fShapeObject, editPart);
        }

        GridData gd = new GridData(SWT.NONE, SWT.NONE, false, false);
        gd.widthHint = ITabbedLayoutConstants.BUTTON_WIDTH;
        fShapeSelector.getButton().setLayoutData(gd);
        getWidgetFactory().adapt(fShapeSelector.getButton(), true, true);
        fShapeSelector.addListener(shapeListener);

        fDefaultShapeButton = new Button(client, SWT.PUSH);
        fDefaultShapeButton.setText(Messages.ShapeSection_1);
        gd = new GridData(SWT.NONE, SWT.NONE, true, false);
        gd.minimumWidth = ITabbedLayoutConstants.BUTTON_WIDTH;
        fDefaultShapeButton.setLayoutData(gd);
        getWidgetFactory().adapt(fDefaultShapeButton, true, true); // Need to do it this way for Mac
        fDefaultShapeButton.addSelectionListener(new SelectionAdapter() {
            @Override
            public void widgetSelected(SelectionEvent e) {
                if(isAlive()) {
                    getCommandStack().execute(new ShapeCommand(fShapeObject, null));
                }
            }
        });
    }
    
    @Override
    protected void setElement(Object element) {
        if(element instanceof EditPart) {
            editPart = (EditPart)element;
			fShapeObject = (IDiagramModelObject) editPart.getModel();
            if(fShapeObject == null) {
                throw new RuntimeException("Diagram Model Object was null"); //$NON-NLS-1$
            }
            fShapeSelector.setElement(fShapeObject,editPart);
        }
        else {
            throw new RuntimeException("Should have been an EditPart"); //$NON-NLS-1$
        }
        
        refreshControls();
    }
    
    protected void refreshControls() {
        String shapeValue = fShapeObject.getElementShape();
        fShapeSelector.setShapeValue(shapeValue); 
        boolean enabled = fShapeObject instanceof ILockable ? !((ILockable)fShapeObject).isLocked() : true;
        fShapeSelector.setEnabled(enabled);
        fDefaultShapeButton.setEnabled(shapeValue != null && enabled);
    }
    
    @Override
    public void dispose() {
        super.dispose();
        
        if(fShapeSelector != null) {
            fShapeSelector.addListener(shapeListener);
        }
    }

    @Override
    protected Adapter getECoreAdapter() {
        return eAdapter;
    }

    @Override
    protected EObject getEObject() {
        return fShapeObject;
    }
}
