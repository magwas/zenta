/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.compatibility;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.xmi.ClassNotFoundException;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.ModelVersion;
import org.rulez.magwas.zenta.model.manager.IncompatibleModelException;
import org.rulez.magwas.zenta.model.manager.LaterModelVersionException;
import org.rulez.magwas.zenta.model.util.LogUtil;
import org.xml.sax.SAXParseException;



/**
 * Utility to check whether models are compatible
 * 
 * @author Phillip Beauvoir
 */
public class ModelCompatibility {
    
    public static void checkErrors(Resource resource) throws IncompatibleModelException {
        // Log errors first
        for(Diagnostic diagnostic : resource.getErrors()) {
            System.err.println(diagnostic);
            if(isCatastrophicError(diagnostic)) {
                LogUtil.logError(diagnostic.getMessage());
            }
            else {
                LogUtil.logWarning(diagnostic.getMessage());
            }
        }

        // Is it catastrophic? If it is, throw an exception
        for(Diagnostic diagnostic : resource.getErrors()) {
            if(isCatastrophicError(diagnostic)) {
                IncompatibleModelException ex = new IncompatibleModelException(diagnostic.getMessage());
                LogUtil.logError("Error opening model", ex); //$NON-NLS-1$
                LogUtil.logException(ex);
                throw ex;
            }
        }
    }
    
    public static void checkVersion(Resource resource) throws LaterModelVersionException {
        IZentaModel model = (IZentaModel)resource.getContents().get(0);
        String version = model.getVersion();
        
        // Loading a newer version model into older version of Zenta might be OK
        if(version != null && version.compareTo(ModelVersion.VERSION) > 0) {
            throw new LaterModelVersionException(version);
        }
    }

    private static boolean isCatastrophicError(Diagnostic diagnostic) {
        // Package not found - total disaster
        if(diagnostic instanceof PackageNotFoundException) {
            return true;
        }
        
        // Class not found that matches xml declaration - not good
        if(diagnostic instanceof ClassNotFoundException) {
            return true;
        }
        
        // Allow an IllegalValueException because an illegal value will default to a default value

        // Allow a FeatureNotFoundException because a feature might get deprecated
        
        // Last case is a Sax parse error
        if(diagnostic instanceof XMIException) {
            XMIException ex = (XMIException)diagnostic;
            if(ex.getCause() instanceof SAXParseException) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * Fix any compatibility issues in registered handlers
     * @param resource The Resource to check
     * @throws CompatibilityHandlerException 
     */
    public static void fixCompatibility(Resource resource) throws CompatibilityHandlerException {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        for(IConfigurationElement configurationElement : registry.getConfigurationElementsFor(ICompatibilityHandler.EXTENSION_ID)) {
            try {
                ICompatibilityHandler handler = (ICompatibilityHandler)configurationElement.createExecutableExtension("class"); //$NON-NLS-1$
                if(handler != null) {
                    handler.fixCompatibility(resource);
                }
            } 
            catch(CoreException ex) {
                LogUtil.logException(ex);
            } 
        }
    }
}
