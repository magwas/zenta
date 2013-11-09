/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import uk.ac.bolton.archimate.model.FolderType;
import uk.ac.bolton.archimate.model.IArchimateElement;
import uk.ac.bolton.archimate.model.IArchimateModel;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IFolder;
import uk.ac.bolton.archimate.model.IIdentifier;
import uk.ac.bolton.archimate.model.IRelationship;


/**
 * Archimate Model Utils
 * 
 * @author Phillip Beauvoir
 */
public class ArchimateModelUtils {
    
    /*
     * Flags for methods
     */
    private static final int SOURCE_RELATIONSHIPS = 1;
    private static final int TARGET_RELATIONSHIPS = 1 << 1;
    
    /**
     * Determine if a given relationship type is allowed as a source for an Archimate element
     * @param sourceElement The source element
     * @param relationshipType The class of relationship to check
     * @return True if relationshipType is a valid source relationship for sourceElement
     */
    public static final boolean isValidRelationshipStart(IArchimateElement sourceElement, EClass relationshipType) {
    	//FIXME check from policy
        return true;
    }
    
    /**
     * Determine if a given relationship type is allowed between source and target Archimate elements
     * @param sourceElement The source element
     * @param targetElement The target element
     * @param relationshipType The relationship type to check
     * @return True if relationshipType is an allowed relationship type between sourceElement and targetElement
     */
    public static final boolean isValidRelationship(IArchimateElement sourceElement, IArchimateElement targetElement, EClass relationshipType) {
        return isValidRelationship(sourceElement.eClass(), targetElement.eClass(), relationshipType);
    }

    /**
     * Determine if a given relationship type is allowed between source and target Archimate class types
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
     * Get an array of all valid relationship class types between source and target Archimate elements
     * @param sourceElement The source element
     * @param targetElement The target element
     * @return An array of all valid relationship class types between sourceElement and targetElement
     */
    public static EClass[] getValidRelationships(IArchimateElement sourceElement, IArchimateElement targetElement) {
        return getValidRelationships(sourceElement.eClass(), targetElement.eClass());
    }
    
    /**
     * Get an array of all valid relationship class types between source and target Archimate class types
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
     * @param element The Archimate element to check
     * @return A list of all relationships that an element has, both as target and as source
     */
    public static List<IRelationship> getRelationships(IArchimateElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS | TARGET_RELATIONSHIPS);
    }
    
    /**
     * @param element The Archimate element to check
     * @return A list of all source relationships that an element has
     */
    public static List<IRelationship> getSourceRelationships(IArchimateElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS);
    }
    
    /**
     * @param element The Archimate element to check
     * @return A list of all target relationships that an element has
     */
    public static List<IRelationship> getTargetRelationships(IArchimateElement element) {
        return __getRelationships(element, TARGET_RELATIONSHIPS);
    }

    private static List<IRelationship> __getRelationships(IArchimateElement element, int type) {
        List<IRelationship> relationships = new ArrayList<IRelationship>();
        
        if(element.getArchimateModel() != null) { // An important guard because the element might have been deleted
        /*    IFolder folder = element.getArchimateModel().getFolder(FolderType.RELATIONS);
            __getRelationshipsForElement(folder, element, type, relationships);
            
            folder = element.getArchimateModel().getFolder(FolderType.DERIVED);
            __getRelationshipsForElement(folder, element, type, relationships);
            */
        	for (IFolder  folder : element.getArchimateModel().getFolders()) {
        		__getRelationshipsForElement(folder, element, type, relationships);
        	}
        			
        }
        
        return relationships;
    }
    
    private static void __getRelationshipsForElement(IFolder folder, IArchimateElement element, int type, List<IRelationship> relationships) {
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
     * Get an EObject type in an Archimate Model given its String ID
     * @param model The owning Archimate Model
     * @param id The ID of the object to search for
     * @return The matching EObject in the model given its ID or null if not found
     */
    public static EObject getObjectByID(IArchimateModel model, String id) {
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
                IArchimatePackage.eINSTANCE.getBusinessObject(),
        };
    }
    

    /**
     * @return A list of EClass types for Relationships in preferred order
     */
    public static EClass[] getRelationsClasses() {
        return new EClass[] {
                IArchimatePackage.eINSTANCE.getSpecialisationRelationship(),
                IArchimatePackage.eINSTANCE.getAssociationRelationship(),
        };
    }

    /**
     * @return A list of all EClass types for Connectors in preferred order
     */
    public static EClass[] getConnectorClasses() {
        return new EClass[] {
                IArchimatePackage.eINSTANCE.getJunction(),
                IArchimatePackage.eINSTANCE.getAndJunction(),
                IArchimatePackage.eINSTANCE.getOrJunction()
        };
    }
}
