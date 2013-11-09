/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.propertysections;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.IFilter;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.PlatformUI;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IZentamateConnectionEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IDiagramConnectionEditPart;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.ILockable;



/**
 * Property Section for the name & documentation of a non-Zentamate diagram connection
 * 
 * @author Phillip Beauvoir
 */
public class DiagramConnectionNameDocumentationSection extends AbstractZentamatePropertySection {
    
    private static final String HELP_ID = "org.rulez.magwas.zenta.help.elementPropertySection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter implements IFilter {
        @Override
        public boolean select(Object object) {
            return (object instanceof IDiagramConnectionEditPart)
                        && !(object instanceof IZentamateConnectionEditPart); // Not Zentamate connections
        }
    }

    /*
     * Adapter to listen to changes made elsewhere (including Undo/Redo commands)
     */
    private Adapter eAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(Notification msg) {
            Object feature = msg.getFeature();
            // Name event (Undo/Redo and here)
            if(feature == IZentamatePackage.Literals.NAMEABLE__NAME) {
                refreshNameField();
                fPage.labelProviderChanged(null); // Update Main label
            }
            // Documentation event (Undo/Redo and here)
            else if(feature == IZentamatePackage.Literals.DOCUMENTABLE__DOCUMENTATION) {
                refreshDocumentationField();
            }
            else if(feature == IZentamatePackage.Literals.LOCKABLE__LOCKED) {
                refreshControls();
            }
        }
    };
    
    private IDiagramModelConnection fConnection;

    private PropertySectionTextControl fTextName;
    private PropertySectionTextControl fTextDocumentation;
    
    @Override
    protected void createControls(Composite parent) {
        fTextName = createNameControl(parent, Messages.DiagramConnectionNameDocumentationSection_0);
        fTextDocumentation = createDocumentationControl(parent, Messages.DiagramConnectionNameDocumentationSection_1);

        // Help ID
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
    }

    @Override
    protected void setElement(Object element) {
        if(element instanceof IAdaptable) {
            fConnection = (IDiagramModelConnection)((IAdaptable)element).getAdapter(IDiagramModelConnection.class);
        }
        else {
            throw new RuntimeException("Should have been an Edit Part"); //$NON-NLS-1$
        }
        
        refreshControls();
    }
    
    protected void refreshControls() {
        refreshNameField();
        refreshDocumentationField();
    }
    
    protected void refreshNameField() {
        if(fIsExecutingCommand) {
            return; 
        }
        fTextName.refresh(fConnection);
        
        boolean enabled = fConnection instanceof ILockable ? !((ILockable)fConnection).isLocked() : true;
        fTextName.setEditable(enabled);
    }
    
    protected void refreshDocumentationField() {
        if(fIsExecutingCommand) {
            return; 
        }
        fTextDocumentation.refresh(fConnection);

        boolean enabled = fConnection instanceof ILockable ? !((ILockable)fConnection).isLocked() : true;
        fTextDocumentation.setEditable(enabled);
    }
    
    @Override
    protected Adapter getECoreAdapter() {
        return eAdapter;
    }
    
    @Override
    protected EObject getEObject() {
        return fConnection;
    }
    
    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }
}
