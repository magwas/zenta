/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.rulez.magwas.zenta.editor.diagram.editparts.diagram.EmptyEditPart;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.IElementUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.ElementUIFactory;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaElement;


/**
 * Factory for creating Edit Parts based on graphical domain model objects
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramEditPartFactory
implements EditPartFactory {

    public EditPart createEditPart(EditPart context, Object model) {
        if(model == null) {
            return null;
        }

        EditPart child = null;
        IElementUIProvider provider = null;
        
        // Zenta Model Element Parts
        ElementUIFactory instance = ElementUIFactory.INSTANCE;
		if(model instanceof IDiagramModelZentaObject) {
            IZentaElement zentaElement = ((IDiagramModelZentaObject)model).getZentaElement();
            if(null != zentaElement)
            	provider = instance.getProvider(zentaElement.eClass());
        }
        
        // Zenta Connection Model Element Parts
        else if(model instanceof IDiagramModelZentaConnection) {
            IDiagramModelZentaConnection iDiagramModelZentaConnection = (IDiagramModelZentaConnection)model;
            System.err.println("connection: " + iDiagramModelZentaConnection);
			IBasicRelationship relationship = iDiagramModelZentaConnection.getRelationship();
			System.err.println("relationship:"+relationship);
			EClass eClass = relationship.eClass();
			provider = instance.getProvider(eClass);
        }
        
        // Other
        else if(model instanceof EObject) {
            provider = instance.getProvider(((EObject)model).eClass());
        }
        
        // We have a provider
        if(provider != null) {
            child = provider.createEditPart();
            child.setModel(model);
            return child;
        }

        // Main Zenta Diagram Edit Part
        if(model instanceof IZentaDiagramModel) {
            child = new ZentaDiagramPart();

            // Add a Nested Connection Filter to this
            ((ZentaDiagramPart)child).addEditPartFilter(new NestedConnectionEditPartFilter());
            
            // Add a Viewpoint Child EditPart Filter to this if set in Preferences (hides rather than ghosts)
            if(Preferences.STORE.getBoolean(IPreferenceConstants.VIEWPOINTS_HIDE_DIAGRAM_ELEMENTS)) {
                ((ZentaDiagramPart)child).addEditPartFilter(new ViewpointEditPartFilter());
            }
        }
        
        /*
         * It's better to return an Empty Edit Part in case of a corrupt model.
         * Returning null is disastrous and means the Diagram View won't open.
         */
        else {
            child = new EmptyEditPart();
        }
        
        // Set the Model in the Edit part
        child.setModel(model);
        
        return child;
    }

}
