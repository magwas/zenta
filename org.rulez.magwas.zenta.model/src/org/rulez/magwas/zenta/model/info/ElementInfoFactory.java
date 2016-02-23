package org.rulez.magwas.zenta.model.info;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.IElementInfoProvider;

public class ElementInfoFactory {

    public static final ElementInfoFactory INSTANCE = new ElementInfoFactory();
    
    private ElementInfoFactory() {
        
        
        registerProvider(new BasicObjectInfoProvider());
    	
        registerProvider(new JunctionInfoProvider());
        registerProvider(new AndJunctionInfoProvider());
        registerProvider(new OrJunctionInfoProvider());
        
        registerProvider(new BasicConnectionInfoProvider());
        
        registerProvider(new NoteInfoProvider());
        registerProvider(new GroupInfoProvider());
        registerProvider(new DiagramModelReferenceInfoProvider());
        registerProvider(new LineConnectionInfoProvider());
        
        registerProvider(new SketchActorInfoProvider());
        registerProvider(new SketchStickyInfoProvider());
        registerProvider(new DiagramImageInfoProvider());
    }
    
    private Map<EClass, IElementInfoProvider> map = new HashMap<EClass, IElementInfoProvider>();
    
    public void registerProvider(IElementInfoProvider provider) {
        map.put(provider.providerFor(), provider);
    }
    
    public IElementInfoProvider getProvider(EClass type) {
        return map.get(type);
    }
}
