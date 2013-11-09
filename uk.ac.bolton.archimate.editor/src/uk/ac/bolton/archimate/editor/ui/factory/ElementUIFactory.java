/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.editor.ui.factory;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

import uk.ac.bolton.archimate.editor.ui.factory.business.BusinessObjectUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.connections.AssociationConnectionUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.connections.LineConnectionUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.connections.SpecialisationConnectionUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.diagram.DiagramModelReferenceUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.diagram.GroupUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.diagram.NoteUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.junctions.AndJunctionUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.junctions.JunctionUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.junctions.OrJunctionUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.sketch.SketchActorUIProvider;
import uk.ac.bolton.archimate.editor.ui.factory.sketch.SketchStickyUIProvider;



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
        
        registerProvider(new AssociationConnectionUIProvider());
        registerProvider(new SpecialisationConnectionUIProvider());
        
        
        registerProvider(new BusinessObjectUIProvider());
        registerProvider(new NoteUIProvider());
        registerProvider(new GroupUIProvider());
        registerProvider(new DiagramModelReferenceUIProvider());
        registerProvider(new LineConnectionUIProvider());
        
        registerProvider(new SketchActorUIProvider());
        registerProvider(new SketchStickyUIProvider());
    }
    
    private Map<EClass, IElementUIProvider> map = new HashMap<EClass, IElementUIProvider>();
    
    public void registerProvider(IElementUIProvider provider) {
        map.put(provider.providerFor(), provider);
    }
    
    public IElementUIProvider getProvider(EClass type) {
        return map.get(type);
    }
}
