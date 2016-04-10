/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.compatibility;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * Interface to fix backward compatibility issues
 * 
 * @author Phillip Beauvoir
 */
public interface ICompatibilityHandler {
    
    /**
     * Extension ID
     */
    String EXTENSION_ID = "org.rulez.magwas.zenta.editor.compatibilityHandler"; //$NON-NLS-1$

    /**
     * Fix the issue
     * @param resource
     * @throws CompatibilityHandlerException
     */
    void fixCompatibility(Resource resource) throws CompatibilityHandlerException;
}