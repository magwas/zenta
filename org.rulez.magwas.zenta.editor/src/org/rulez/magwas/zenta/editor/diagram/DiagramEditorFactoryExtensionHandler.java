/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.util.LogUtil;



/**
 * Manages Diagram Extensions
 * 
 * @author Phillip Beauvoir
 */
public class DiagramEditorFactoryExtensionHandler {
    
    public static String EXTENSIONPOINT = "org.rulez.magwas.zenta.editor.diagramEditorFactory"; //$NON-NLS-1$
    
    public static DiagramEditorFactoryExtensionHandler INSTANCE = new DiagramEditorFactoryExtensionHandler();
    
    private List<IDiagramEditorFactory> factories = new ArrayList<IDiagramEditorFactory>();
    
    private DiagramEditorFactoryExtensionHandler() {
        registerFactories();
    }
    
    public List<IDiagramEditorFactory> getRegisteredFactories() {
        return factories;
    }
    
    public IDiagramEditorFactory getFactory(IDiagramModel model) {
        for(IDiagramEditorFactory factory : factories) {
            if(factory.isFactoryFor(model)) {
                return factory;
            }
        }
        
        return null;
    }

    private void registerFactories() {
        IExtensionRegistry registry = Platform.getExtensionRegistry();
        for(IConfigurationElement configurationElement : registry.getConfigurationElementsFor(EXTENSIONPOINT)) {
            try {
                String id = configurationElement.getAttribute("id"); //$NON-NLS-1$
                IDiagramEditorFactory factory = (IDiagramEditorFactory)configurationElement.createExecutableExtension("class"); //$NON-NLS-1$
                if(id != null && factory != null) {
                    factories.add(factory);
                }
            } 
            catch(CoreException ex) {
                LogUtil.logException(ex);
            } 
        }
    }
}
