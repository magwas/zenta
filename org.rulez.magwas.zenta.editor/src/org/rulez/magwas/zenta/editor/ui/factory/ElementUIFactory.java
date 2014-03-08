/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.editor.ui.factory.business.BasicObjectUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.connections.BasicConnectionUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.connections.LineConnectionUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.diagram.DiagramImageUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.diagram.DiagramModelReferenceUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.diagram.GroupUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.diagram.NoteUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.junctions.AndJunctionUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.junctions.JunctionUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.junctions.OrJunctionUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.sketch.SketchActorUIProvider;
import org.rulez.magwas.zenta.editor.ui.factory.sketch.SketchStickyUIProvider;




/**
 * Factory for Element UI Provider
 * 
 * @author Phillip Beauvoir
 */
public class ElementUIFactory {

    public static final ElementUIFactory INSTANCE = new ElementUIFactory();
    
    private ElementUIFactory() {
        
        
    	
        registerProvider(new JunctionUIProvider());
        registerProvider(new AndJunctionUIProvider());
        registerProvider(new OrJunctionUIProvider());
        
        registerProvider(new BasicConnectionUIProvider());
        
        registerProvider(new BasicObjectUIProvider());
        registerProvider(new NoteUIProvider());
        registerProvider(new GroupUIProvider());
        registerProvider(new DiagramModelReferenceUIProvider());
        registerProvider(new LineConnectionUIProvider());
        
        registerProvider(new SketchActorUIProvider());
        registerProvider(new SketchStickyUIProvider());
        registerProvider(new DiagramImageUIProvider());
    }
    
    private Map<EClass, IElementUIProvider> map = new HashMap<EClass, IElementUIProvider>();
    
    public void registerProvider(IElementUIProvider provider) {
        map.put(provider.providerFor(), provider);
    }
    
    public IElementUIProvider getProvider(EClass type) {
        return map.get(type);
    }
}
