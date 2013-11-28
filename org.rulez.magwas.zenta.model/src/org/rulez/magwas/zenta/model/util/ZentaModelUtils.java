/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IIdentifier;



/**
 * Zenta Model Utils
 * 
 * @author Phillip Beauvoir
 */
public class ZentaModelUtils {
    
    private static final int SOURCE_RELATIONSHIPS = 1;
	private static final int TARGET_RELATIONSHIPS = 2;

	/**
     * Get an EObject type in an Zenta Model given its String ID
     * @param model The owning Zenta Model
     * @param id The ID of the object to search for
     * @return The matching EObject in the model given its ID or null if not found
     */
    public static EObject getObjectByID(IZentaModel model, String id) {
        if(id == null || model == null) {
            return null;
        }
        
        if(id.equals(model.getId())) {
            return model;
        }
        
        // This is an expensive iteration!
        for(Iterator<EObject> iter = model.eAllContents(); iter.hasNext();) {
            EObject element = iter.next();
            if(element instanceof IIdentifier && id.equals(((IIdentifier)element).getId())) {
                return element;
            }
        }

        return null;
    }

    /**
     * @param element The Zenta element to check
     * @return A list of all relationships that an element has, both as target and as source
     */
    public static List<IRelationship> getRelationships(IZentaElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS | TARGET_RELATIONSHIPS);
    }
    
    /**
     * @param element The Zenta element to check
     * @return A list of all source relationships that an element has
     */
    public static List<IRelationship> getSourceRelationships(IZentaElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS);
    }
    
    /**
     * @param element The Zenta element to check
     * @return A list of all target relationships that an element has
     */
    public static List<IRelationship> getTargetRelationships(IZentaElement element) {
        return __getRelationships(element, TARGET_RELATIONSHIPS);
    }

    private static List<IRelationship> __getRelationships(IZentaElement element, int type) {
        List<IRelationship> relationships = new ArrayList<IRelationship>();
        
        if(element.getZentaModel() != null) { // An important guard because the element might have been deleted
        	for (IFolder  folder : element.getZentaModel().getFolders()) {
        		__getRelationshipsForElement(folder, element, type, relationships);
        	}
        			
        }
        
        return relationships;
    }
    
    private static void __getRelationshipsForElement(IFolder folder, IZentaElement element, int type, List<IRelationship> relationships) {
        if(folder == null || element == null) {
            return;
        }
        
        for(EObject object : folder.getElements()) {
            if(object instanceof IRelationship) {
                IRelationship relationship = (IRelationship)object;
                if((type & SOURCE_RELATIONSHIPS) != 0) {
                    if(relationship.getSource() == element && !relationships.contains(relationship)) {
                        relationships.add(relationship);
                    }
                }
                if((type & TARGET_RELATIONSHIPS) != 0) {
                    if(relationship.getTarget() == element && !relationships.contains(relationship)) {
                        relationships.add(relationship);
                    }
                }
            }
        }
        
        // Child folders
        for(IFolder f : folder.getFolders()) {
            __getRelationshipsForElement(f, element, type, relationships);
        }
    }
}
