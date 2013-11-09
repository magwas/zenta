/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.FolderType;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;



/**
 * Zentamate Model Utils
 * 
 * @author Phillip Beauvoir
 */
public class ZentamateModelUtils {
    
    /*
     * Flags for methods
     */
    private static final int SOURCE_RELATIONSHIPS = 1;
    private static final int TARGET_RELATIONSHIPS = 1 << 1;
    
    /**
     * Determine if a given relationship type is allowed as a source for an Zentamate element
     * @param sourceElement The source element
     * @param relationshipType The class of relationship to check
     * @return True if relationshipType is a valid source relationship for sourceElement
     */
    public static final boolean isValidRelationshipStart(IZentamateElement sourceElement, EClass relationshipType) {
    	//FIXME check from policy
        return true;
    }
    
    /**
     * Determine if a given relationship type is allowed between source and target Zentamate elements
     * @param sourceElement The source element
     * @param targetElement The target element
     * @param relationshipType The relationship type to check
     * @return True if relationshipType is an allowed relationship type between sourceElement and targetElement
     */
    public static final boolean isValidRelationship(IZentamateElement sourceElement, IZentamateElement targetElement, EClass relationshipType) {
        return isValidRelationship(sourceElement.eClass(), targetElement.eClass(), relationshipType);
    }

    /**
     * Determine if a given relationship type is allowed between source and target Zentamate class types
     * @param sourceType The source type
     * @param targetType The target type
     * @param relationshipType The relationship type to check
     * @return True if relationshipType is an allowed relationship type between sourceType and targetType
     */
    public static final boolean isValidRelationship(EClass sourceType, EClass targetType, EClass relationshipType) {
    	//FIXME check from policy
        return true;
    }
    
    /**
     * Get an array of all valid relationship class types between source and target Zentamate elements
     * @param sourceElement The source element
     * @param targetElement The target element
     * @return An array of all valid relationship class types between sourceElement and targetElement
     */
    public static EClass[] getValidRelationships(IZentamateElement sourceElement, IZentamateElement targetElement) {
        return getValidRelationships(sourceElement.eClass(), targetElement.eClass());
    }
    
    /**
     * Get an array of all valid relationship class types between source and target Zentamate class types
     * @param sourceType The source type
     * @param targetType The target type
     * @return All valid relationship types between sourceType and targetType
     */
    public static EClass[] getValidRelationships(EClass sourceType, EClass targetType) {
        List<EClass> list = new ArrayList<EClass>();
        
        for(EClass eClass : getRelationsClasses()) {
            if(isValidRelationship(sourceType, targetType, eClass)) {
                list.add(eClass); 
            }
        }
        
        return list.toArray(new EClass[list.size()]);
    }
    
    /**
     * @param element The Zentamate element to check
     * @return A list of all relationships that an element has, both as target and as source
     */
    public static List<IRelationship> getRelationships(IZentamateElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS | TARGET_RELATIONSHIPS);
    }
    
    /**
     * @param element The Zentamate element to check
     * @return A list of all source relationships that an element has
     */
    public static List<IRelationship> getSourceRelationships(IZentamateElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS);
    }
    
    /**
     * @param element The Zentamate element to check
     * @return A list of all target relationships that an element has
     */
    public static List<IRelationship> getTargetRelationships(IZentamateElement element) {
        return __getRelationships(element, TARGET_RELATIONSHIPS);
    }

    private static List<IRelationship> __getRelationships(IZentamateElement element, int type) {
        List<IRelationship> relationships = new ArrayList<IRelationship>();
        
        if(element.getZentamateModel() != null) { // An important guard because the element might have been deleted
        /*    IFolder folder = element.getZentamateModel().getFolder(FolderType.RELATIONS);
            __getRelationshipsForElement(folder, element, type, relationships);
            
            folder = element.getZentamateModel().getFolder(FolderType.DERIVED);
            __getRelationshipsForElement(folder, element, type, relationships);
            */
        	for (IFolder  folder : element.getZentamateModel().getFolders()) {
        		__getRelationshipsForElement(folder, element, type, relationships);
        	}
        			
        }
        
        return relationships;
    }
    
    private static void __getRelationshipsForElement(IFolder folder, IZentamateElement element, int type, List<IRelationship> relationships) {
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
    
    /**
     * Get an EObject type in an Zentamate Model given its String ID
     * @param model The owning Zentamate Model
     * @param id The ID of the object to search for
     * @return The matching EObject in the model given its ID or null if not found
     */
    public static EObject getObjectByID(IZentamateModel model, String id) {
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
     * @return A list of all EClass types in the Business layer in preferred order
     */
    public static EClass[] getBusinessClasses() {
        return new EClass[] {
                IZentamatePackage.eINSTANCE.getBusinessObject(),
        };
    }
    

    /**
     * @return A list of EClass types for Relationships in preferred order
     */
    public static EClass[] getRelationsClasses() {
        return new EClass[] {
                IZentamatePackage.eINSTANCE.getSpecialisationRelationship(),
                IZentamatePackage.eINSTANCE.getAssociationRelationship(),
        };
    }

    /**
     * @return A list of all EClass types for Connectors in preferred order
     */
    public static EClass[] getConnectorClasses() {
        return new EClass[] {
                IZentamatePackage.eINSTANCE.getJunction(),
                IZentamatePackage.eINSTANCE.getAndJunction(),
                IZentamatePackage.eINSTANCE.getOrJunction()
        };
    }
}
