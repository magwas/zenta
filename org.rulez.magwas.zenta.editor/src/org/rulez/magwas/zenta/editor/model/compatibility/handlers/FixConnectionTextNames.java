/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.compatibility.handlers;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.rulez.magwas.zenta.editor.model.compatibility.CompatibilityHandlerException;
import org.rulez.magwas.zenta.editor.model.compatibility.ICompatibilityHandler;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 *  In versions >= 2.1.0 IDiagramModelConnection.getText() and IDiagramModelConnection.setText(String) are deprecated.
 *  Diagram Connection text is now taken from the Connection's name if set.
 *  New Connections and Relations are now *not* given a default name.
 *  However, in earlier versions a new connection/relationship was given a default name and this
 *  now means that this will show up on the diagram. So we need to change these to empty names.
 *  Also check for an old text value and if set, set the element's name to it.
 * 
 * @author Phillip Beauvoir
 */
public class FixConnectionTextNames implements ICompatibilityHandler {
    
    @Override
    public void fixCompatibility(Resource resource) throws CompatibilityHandlerException {
        IZentaModel model = (IZentaModel)resource.getContents().get(0);
        String version = model.getVersion();
        
        if(version != null && version.compareTo("2.1.0") < 0) { //$NON-NLS-1$
            for(Iterator<EObject> iter = model.eAllContents(); iter.hasNext();) {
                EObject element = iter.next();
                
                // Set all Relationship names to empty if they have the default name
                if(element instanceof IRelationship) {
                    IRelationship relationship = (IRelationship)element;
                    String name = relationship.getName();
                    if(name != null && name.equalsIgnoreCase(getRelationshipDefaultName(relationship))) {
                        relationship.setName(""); //$NON-NLS-1$
                    }
                }
                // If an Zenta connection has a (deprecated) text value then set the Relationship's name to that
                if(element instanceof IDiagramModelZentaConnection) {
                    IDiagramModelZentaConnection connection = (IDiagramModelZentaConnection)element;
                    String text = connection.getText();
                    if(text != null && text.length() > 0) {
                        IRelationship relationship = connection.getRelationship();
                        relationship.setName(text);
                    }
                }
                // If a diagram connection has a text value set the connection's name to that
                else if(element instanceof IDiagramModelConnection) {
                    IDiagramModelConnection connection = (IDiagramModelConnection)element;
                    // Eliminate old name
                    String name = connection.getName();
                    if(name != null && name.equalsIgnoreCase("Connection")) { //$NON-NLS-1$
                        connection.setName(""); //$NON-NLS-1$
                    }
                    
                    String text = connection.getText();
                    if(text != null && text.length() > 0) {
                        connection.setName(text);
                    }
                }
            }
        }
    }
    
    /**
     * Get the default names as added to relationships in models up until 2.1.0
     * Don't externalise or change these!
     */
    private String getRelationshipDefaultName(IRelationship relationship) {
        switch(relationship.eClass().getClassifierID()) {
        //FIXME from object class
            case IZentaPackage.ASSOCIATION_RELATIONSHIP:
                return "Association relation"; //$NON-NLS-1$
            case IZentaPackage.SPECIALISATION_RELATIONSHIP:
                return "Specialisation relation"; //$NON-NLS-1$
        }
        return ""; //$NON-NLS-1$
    }

}
