/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.handmade.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;



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
    public static @Nullable EObject getObjectByID(IZentaModel model, String id) {
    	Util.verifyNonNull(id);
    	Util.verifyNonNull(model);
        
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
    public static List<IBasicRelationship> getRelationships(IZentaElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS | TARGET_RELATIONSHIPS);
    }
    
    /**
     * @param element The Zenta element to check
     * @return A list of all source relationships that an element has
     */
    public static NonNullList<IBasicRelationship> getSourceRelationships(IZentaElement element) {
        return __getRelationships(element, SOURCE_RELATIONSHIPS);
    }
    
    /**
     * @param element The Zenta element to check
     * @return A list of all target relationships that an element has
     */
    public static NonNullList<IBasicRelationship> getTargetRelationships(IZentaElement element) {
        return __getRelationships(element, TARGET_RELATIONSHIPS);
    }

	private static NonNullList<IBasicRelationship> __getRelationships(IZentaElement element, int type) {
        NonNullList<IBasicRelationship> relationships = new NonNullArrayList<IBasicRelationship>();
        
    	IZentaModel zentaModel = element.getZentaModel();
		EList<IFolder> folders = zentaModel.getFolders();
		childFolders(element, type, relationships, folders);
        
        return relationships;
    }

		@SuppressWarnings("null")
		private static void childFolders(IZentaElement element, int type,
				List<IBasicRelationship> relationships, EList<IFolder> folders) {
			for (@NonNull IFolder  folder : folders) {
				__getRelationshipsForElement(folder, element, type, relationships);
			}
		}

	private static void __getRelationshipsForElement(IFolder folder, IZentaElement element, int type, List<IBasicRelationship> relationships) {
        
        for(EObject object : folder.getElements()) {
            if(object instanceof IBasicRelationship) {
                IBasicRelationship relationship = (IBasicRelationship)object;
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
        EList<IFolder> folders = folder.getFolders();
		childFolders(element, type, relationships, folders);
    }

	/**
	 * Save the model to XML File format
	 */
	public static void saveModelToXMLFile(IZentaModel fModel, File file) {
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(URI.createFileURI(file.getAbsolutePath()));
	    resource.getContents().add(fModel);
	    try {
			resource.save(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
