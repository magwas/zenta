/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.editor.preferences.ConnectionPreferences;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IJunctionElement;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.ZentamateModelUtils;



/**
 * Diagram Model Utils
 * 
 * @author Phillip Beauvoir
 */
public class DiagramModelUtils {
    
    /**
     * Find all diagram models that element is referenced in (appears as graphical entity).
     * @param element The element to check on.
     * @return A List of diagram models (may be empty, but never null)
     */
    public static List<IDiagramModel> findReferencedDiagramsForElement(IZentamateElement element) {
        List<IDiagramModel> models = new ArrayList<IDiagramModel>();
        
        if(element != null && element.getZentamateModel() != null) {
            for(IDiagramModel diagramModel : element.getZentamateModel().getDiagramModels()) {
                // Find it
                boolean result = !findDiagramModelComponentsForElement(diagramModel, element).isEmpty();
                
                // Not found, maybe it's expressed as a nested parent/child
                if(!result && element instanceof IRelationship && ConnectionPreferences.useNestedConnections()) {
                    result = !findNestedComponentsForRelationship(diagramModel, (IRelationship)element).isEmpty();
                }
                
                if(result && !models.contains(diagramModel)) {
                    models.add(diagramModel);
                }
            }
        }
        
        return models;
    }
    
    /**
     * @param element
     * @return true if element is referenced in any diagram model
     */
    public static boolean isElementReferencedInDiagrams(IZentamateElement element) {
        if(element == null || element.getZentamateModel() == null) {
            return false;
        }
        
        for(IDiagramModel diagramModel : element.getZentamateModel().getDiagramModels()) {
            if(isElementReferencedInDiagram(diagramModel, element)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * @param element
     * @return true if element is referenced in diagramModel
     */
    public static boolean isElementReferencedInDiagram(IDiagramModel diagramModel, IZentamateElement element) {
        if(!findDiagramModelComponentsForElement(diagramModel, element).isEmpty()) {
            return true;
        }
        
        // Expressed as a nested parent/child
        if(element instanceof IRelationship && ConnectionPreferences.useNestedConnections()) {
            if(!findNestedComponentsForRelationship(diagramModel, (IRelationship)element).isEmpty()) {
                return true;
            }
        }
        
        return false;
    }
    
    // ========================================================================================================
    
    /**
     * Find all Diagram Model Components for a given element or relationship in a Diagram Model
     * @param diagramModel
     * @param element
     * @return The list
     */
    public static List<IDiagramModelComponent> findDiagramModelComponentsForElement(IDiagramModel diagramModel, IZentamateElement element) {
        List<IDiagramModelComponent> list = new ArrayList<IDiagramModelComponent>();
        
        if(element instanceof IRelationship) {
            list.addAll(findDiagramModelConnectionsForRelation(diagramModel, (IRelationship)element));
        }
        else {
            list.addAll(findDiagramModelObjectsForElement(diagramModel, element));
        }
        
        return list;
    }

    /**
     * Find all Diagram Model Objects in a Container for a given element
     * @param parent
     * @param element
     * @return The list
     */
    public static List<IDiagramModelZentamateObject> findDiagramModelObjectsForElement(IDiagramModelContainer parent, IZentamateElement element) {
        List<IDiagramModelZentamateObject> list = new ArrayList<IDiagramModelZentamateObject>();
        __findDiagramModelObjectsForElement(list, parent, element);
        return list;
    }
    
    private static void __findDiagramModelObjectsForElement(List<IDiagramModelZentamateObject> list, IDiagramModelContainer parent, IZentamateElement element) {
        for(IDiagramModelObject object : parent.getChildren()) {
            if(object instanceof IDiagramModelZentamateObject) {
                if(((IDiagramModelZentamateObject)object).getZentamateElement() == element && !list.contains(object)) {
                    list.add((IDiagramModelZentamateObject)object);
                }
            }
            if(object instanceof IDiagramModelContainer) {
                __findDiagramModelObjectsForElement(list, (IDiagramModelContainer)object, element);
            }
        }
    }

    /**
     * Find all Diagram Model Connections in a Container for a given relation
     * @param parent
     * @param relationship
     * @return
     */
    public static List<IDiagramModelZentamateConnection> findDiagramModelConnectionsForRelation(IDiagramModelContainer parent, IRelationship relationship) {
        List<IDiagramModelZentamateConnection> list = new ArrayList<IDiagramModelZentamateConnection>();
        __findDiagramModelConnectionsForRelation(list, parent, relationship);
        return list;
    }

    private static void __findDiagramModelConnectionsForRelation(List<IDiagramModelZentamateConnection> list, IDiagramModelContainer parent, IRelationship relationship) {
        for(IDiagramModelObject object : parent.getChildren()) {
            for(IDiagramModelConnection connection : object.getSourceConnections()) {
                if(connection instanceof IDiagramModelZentamateConnection &&
                                        ((IDiagramModelZentamateConnection)connection).getRelationship() == relationship
                                        && !list.contains(object)) {
                    list.add((IDiagramModelZentamateConnection)connection);
                }
            }
            if(object instanceof IDiagramModelContainer) {
                __findDiagramModelConnectionsForRelation(list, (IDiagramModelContainer)object, relationship);
            }
        }
    }

    /**
     * Find any references to other Diagram Models
     * @param parent The Diagram Model to search
     * @param diagramModel The Diagram Model to look for references
     * @return
     */
    public static List<IDiagramModelReference> findDiagramModelReferences(IDiagramModel parent, IDiagramModel diagramModel) {
        List<IDiagramModelReference> list = new ArrayList<IDiagramModelReference>();
        __findDiagramModelReferences(list, parent, diagramModel);
        return list;
    }
    
    private static void __findDiagramModelReferences(List<IDiagramModelReference> list, IDiagramModelContainer parent, IDiagramModel diagramModel) {
        for(IDiagramModelObject object : parent.getChildren()) {
            if(object instanceof IDiagramModelReference) {
                if(((IDiagramModelReference)object).getReferencedModel() == diagramModel) {
                    list.add((IDiagramModelReference)object);
                }
            }
            if(object instanceof IDiagramModelContainer) {
                __findDiagramModelReferences(list, (IDiagramModelContainer)object, diagramModel);
            }
        }
    }
    
    /*
     * ========================================= NESTED CONNECTIONS ==========================================
     * 
     * 
     */
    

    /**
     * Find matching pairs of IDiagramModelZentamateObject types that are nested in a Diagram Model
     * @param diagramModel
     * @param relation
     * @return
     */
    public static List<IDiagramModelZentamateObject[]> findNestedComponentsForRelationship(IDiagramModel diagramModel, IRelationship relation) {
        IZentamateElement src = relation.getSource();
        IZentamateElement tgt = relation.getTarget();
        
        List<IDiagramModelZentamateObject> srcList = findDiagramModelObjectsForElement(diagramModel, src);
        List<IDiagramModelZentamateObject> tgtList = findDiagramModelObjectsForElement(diagramModel, tgt);
        
        List<IDiagramModelZentamateObject[]> list = new ArrayList<IDiagramModelZentamateObject[]>();
        
        for(IDiagramModelZentamateObject dmo1 : srcList) {
            for(IDiagramModelZentamateObject dmo2 : tgtList) {
                if(isNestedRelationship(dmo1, dmo2)) {
                    list.add(new IDiagramModelZentamateObject[] {dmo1, dmo2});
                }
            }
        }
        
        return list;
    }
    
    /**
     * @param parent
     * @param child
     * @return True if there is a nested relationship type between parent and child
     */
    public static boolean isNestedRelationship(IDiagramModelZentamateObject parent, IDiagramModelZentamateObject child) {
        IZentamateElement srcElement = parent.getZentamateElement();
        IZentamateElement tgtElement = child.getZentamateElement();

        // Then see if it's nested
        if(parent.getChildren().contains(child)) {
            return hasNestedConnectionTypeRelationship(srcElement, tgtElement);
        }
        
        return false;
    }
    
    /**
     * Check if there is already a nested type relationship between parent (source) and child (target)
     */
    public static boolean hasNestedConnectionTypeRelationship(IZentamateElement parent, IZentamateElement child) {
        for(IRelationship relation : ZentamateModelUtils.getSourceRelationships(parent)) {
            if(relation.getTarget() == child && isNestedConnectionTypeRelationship(relation)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param relation
     * @return true if relation is of a type that can be represented by a nested container 
     */
    public static boolean isNestedConnectionTypeRelationship(IRelationship relation) {
        // Some element types are not allowed
        if(!isNestedConnectionTypeElement(relation.getSource()) || !isNestedConnectionTypeElement(relation.getTarget())) {
            return false;
        }
        
        for(EClass eClass : ConnectionPreferences.getRelationsClassesForHiding()) {
            if(relation.eClass() == eClass) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * @param element
     * @return true if element can be used to calculate an nested type connection as one end of the relation
     */
    public static boolean isNestedConnectionTypeElement(IZentamateElement element) {
        return !(element instanceof IJunctionElement);
    }
    
    /**
     * @param srcObject
     * @param tgtObject
     * @param relation
     * @return True if there is an IDiagramModelConnection containing relation between srcObject and tgtObject
     */
    public static boolean hasDiagramModelZentamateConnection(IDiagramModelZentamateObject srcObject, IDiagramModelZentamateObject tgtObject,
            IRelationship relation) {

        for(IDiagramModelConnection conn : srcObject.getSourceConnections()) {
            if(conn instanceof IDiagramModelZentamateConnection) {
                IRelationship r = ((IDiagramModelZentamateConnection)conn).getRelationship();
                if(r == relation && conn.getSource() == srcObject && conn.getTarget() == tgtObject) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    /**
     * @param connection
     * @return true if a connection should be hidden when its source (parent) element contains its target (child) element
     */
    public static boolean shouldBeHiddenConnection(IDiagramModelZentamateConnection connection) {
        if(!ConnectionPreferences.useNestedConnections()) {
            return false;
        }
        
        // Only if source and target elements are ZentaMate elements
        if(connection.getSource() instanceof IDiagramModelZentamateObject && connection.getTarget() instanceof IDiagramModelZentamateObject) {
            IDiagramModelZentamateObject source = (IDiagramModelZentamateObject)connection.getSource();
            IDiagramModelZentamateObject target = (IDiagramModelZentamateObject)connection.getTarget();
            
            // Junction types are excluded
            if(!DiagramModelUtils.isNestedConnectionTypeElement(source.getZentamateElement()) || 
                    !DiagramModelUtils.isNestedConnectionTypeElement(target.getZentamateElement())) {
                return false;
            }
            
            // If The Source Element contains the Target Element
            if(source.getChildren().contains(target)) {
                // And it's a relationship type we have chosen to hide
                for(EClass eClass : ConnectionPreferences.getRelationsClassesForHiding()) {
                    if(connection.getRelationship().eClass() == eClass) {
                        return true;
                    }
                }
            }
        }
        
        return false;
    }
    
    // ========================================================================================================
    
    /**
     * @param object
     * @return The topmost ancestor container for a diagram object that is *not* the diagram model, or null.
     */
    public static IDiagramModelContainer getAncestorContainer(IDiagramModelObject object) {
        EObject container = object.eContainer();
        while(!(container instanceof IDiagramModel) && !(container.eContainer() instanceof IDiagramModel)) {
            container = container.eContainer();
        }
        return (IDiagramModelContainer)container;
    }

    
    /**
     * @return True if connection type exists between source and target
     */
    public static boolean hasExistingConnectionType(IDiagramModelObject source, IDiagramModelObject target, EClass relationshipType) {
        for(IDiagramModelConnection connection : source.getSourceConnections()) {
            if(connection instanceof IDiagramModelZentamateConnection && connection.getTarget().equals(target)) {
                EClass type = ((IDiagramModelZentamateConnection)connection).getRelationship().eClass();
                return type.equals(relationshipType);
            }
        }
        return false;
    }
    
    /**
     * Check for cycles.  Return true if there is a cycle.
     */
    public static boolean hasCycle(IDiagramModelObject source, IDiagramModelObject target) {
        for(IDiagramModelConnection connection : source.getTargetConnections()) {
            if(connection.getSource().equals(target)) {
                return true;
            }
            if(hasCycle(connection.getSource(), target)) {
                return true;
            }
        }
        return false;
    }

}
