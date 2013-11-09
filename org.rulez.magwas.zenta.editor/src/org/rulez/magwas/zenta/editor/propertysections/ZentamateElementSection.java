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
import org.rulez.magwas.zenta.editor.diagram.editparts.IZentamateEditPart;
import org.rulez.magwas.zenta.editor.diagram.editparts.connections.IZentamateConnectionEditPart;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamatePackage;



/**
 * Property Section for an Zentamate Element
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateElementSection extends AbstractZentamatePropertySection {
    
    private static final String HELP_ID = "org.rulez.magwas.zenta.help.elementPropertySection"; //$NON-NLS-1$
    
    /**
     * Filter to show or reject this section depending on input value
     */
    public static class Filter implements IFilter {
        @Override
        public boolean select(Object object) {
            return object instanceof IZentamateElement || object instanceof IZentamateEditPart 
                    || object instanceof IZentamateConnectionEditPart;
        }
    }

    /*
     * Adapter to listen to changes made elsewhere (including Undo/Redo commands)
     */
    private Adapter eAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(Notification msg) {
            Object feature = msg.getFeature();
            // Element Name event (Undo/Redo and here)
            if(feature == IZentamatePackage.Literals.NAMEABLE__NAME) {
                refreshNameField();
                fPage.labelProviderChanged(null); // Update Main label
            }
            // Element Documentation event (Undo/Redo and here)
            else if(feature == IZentamatePackage.Literals.DOCUMENTABLE__DOCUMENTATION) {
                refreshDocumentationField();
            }
        }
    };
    
    private IZentamateElement fZentamateElement;

    private PropertySectionTextControl fTextName;
    private PropertySectionTextControl fTextDocumentation;
    
    @Override
    protected void createControls(Composite parent) {
        fTextName = createNameControl(parent, Messages.ZentamateElementSection_0);
        fTextDocumentation = createDocumentationControl(parent, Messages.ZentamateElementSection_1);

        // Help ID
        PlatformUI.getWorkbench().getHelpSystem().setHelp(parent, HELP_ID);
    }

    @Override
    protected void setElement(Object element) {
        // IZentamateElement
        if(element instanceof IZentamateElement) {
            fZentamateElement = (IZentamateElement)element;
        }
        // IZentamateElement in a GEF Edit Part
        else if(element instanceof IAdaptable) {
            fZentamateElement = (IZentamateElement)((IAdaptable)element).getAdapter(IZentamateElement.class);
        }
        else {
            System.err.println("ZentamateElementSection wants to display for " + element); //$NON-NLS-1$
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
        fTextName.refresh(fZentamateElement);
    }
    
    protected void refreshDocumentationField() {
        if(fIsExecutingCommand) {
            return; 
        }
        fTextDocumentation.refresh(fZentamateElement);
    }

    @Override
    protected Adapter getECoreAdapter() {
        return eAdapter;
    }
    
    @Override
    protected EObject getEObject() {
        return fZentamateElement;
    }

    @Override
    public boolean shouldUseExtraSpace() {
        return true;
    }
}
