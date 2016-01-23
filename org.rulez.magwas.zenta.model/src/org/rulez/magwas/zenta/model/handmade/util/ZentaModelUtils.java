/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.handmade.util;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.util.ZentaResourceBase;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;



/**
 * Zenta Model Utils
 * 
 * @author Phillip Beauvoir
 */
public class ZentaModelUtils {
    
	private static ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();

	/**
     * Get an EObject type in an Zenta Model given its String ID
     * @param model The owning Zenta Model
     * @param id The ID of the object to search for
     * @return The matching EObject in the model given its ID or null if not found
     */
    public static  EObject getObjectByID(IZentaModel model, String id) {
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
	 * Save the model to XML File format
	 */
	public static void saveModelToXMLFile(IZentaModel fModel, File file) {
		URI uri = URI.createFileURI(file.getAbsolutePath());
		ZentaResourceBase  resource = (ZentaResourceBase) fModel.eResource();
		if(null == resource) {
			resource = (ZentaResourceBase) resourceSet.createResource(uri);
	    	resource.getContents().add(fModel);
		} else {
			resource.setURI(uri);
		}
	    try {
			resource.save(null);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
