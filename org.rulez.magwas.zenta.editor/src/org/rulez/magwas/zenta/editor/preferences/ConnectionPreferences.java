/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.preferences;

import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.rulez.magwas.zenta.model.IZentaPackage;




/**
 * Connection Preferences Manager
 * Convenience class
 * 
 * 1. Create a Relation when Adding a New Element to a Parent Element
 * A new relation is created when creating a new element from the palette into a parent element
 * 
 * 2. Create Relation(s) when dragging ModelTree Element(s) to a Parent Element
 * A new relation is created when dragging an element from the model tree into a parent element if one does not already exist
 *  
 * 3. Create Relation(s) when dragging Element(s) to Parent Element
 * A new relation is created when dragging an element in a View into a parent element if one does not already exist
 * 
 * 4. Create View Connection(s) when Moving Element(s) from Parent Element
 * A new diagram connection is created when moving an element in a View out of a parent element. (Substitute a connection for nested)
 * 
 * 5. Delete existing View Connection(s) When Moving Element(s) to Parent Element
 * An existing diagram connection is deleted when moving an element in a View into the parent element at the source of the connection. (Substitute nested for a connection) 
 * 
 * @author Phillip Beauvoir
 */
public class ConnectionPreferences extends Preferences {
    
    static Map<EClass, Integer> RELATION_KEYMAP = new LinkedHashMap<EClass, Integer>();
    static {
        RELATION_KEYMAP.put(IZentaPackage.eINSTANCE.getBasicRelationship(), 1 << 0);
    }
    
    /**
     * @return true if we should use nested connection logic
     */
    public static boolean useNestedConnections() {
        return STORE.getBoolean(USE_NESTED_CONNECTIONS);
    }
    
    /**
     * @return true if we should offer to create a new relation when adding a new child element into a parent element
     *         from the palette
     */
    public static boolean createRelationWhenAddingNewElement() {
        return useNestedConnections() && STORE.getBoolean(CREATE_RELATION_WHEN_ADDING_NEW_ELEMENT_TO_CONTAINER);
    }
    
    /**
     * @return true if we should offer to create a new relation when adding a child element from the model tree into a parent element
     */
    public static boolean createRelationWhenAddingModelTreeElement() {
        return useNestedConnections() && STORE.getBoolean(CREATE_RELATION_WHEN_ADDING_MODEL_TREE_ELEMENT_TO_CONTAINER);
    }
    
    /**
     * @return true if we should offer to create a new relation when moving a child element into a parent element
     */
    public static boolean createRelationWhenMovingElement() {
        return useNestedConnections() && STORE.getBoolean(CREATE_RELATION_WHEN_MOVING_ELEMENT_TO_CONTAINER);
    }
}
