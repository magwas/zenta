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
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IJunctionElement;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.handmade.util.ZentaModelUtils;



/**
 * Diagram Model Utils
 * 
 * @author Phillip Beauvoir
 */
public class DiagramModelUtils {
    
    public static List<IDiagramModel> findReferencedDiagramsForElement(IZentaElement element) {
        List<IDiagramModel> models = new ArrayList<IDiagramModel>();
        
        if(element.getZentaModel() != null) {
            for(IDiagramModel diagramModel : element.getZentaModel().getDiagramModels()) {
            	if(null != diagramModel) {
                    boolean result = !findDiagramModelComponentsForElement(diagramModel, element).isEmpty();
                    
                    // Not found, maybe it's expressed as a nested parent/child
                    if(!result && element instanceof IBasicRelationship && ConnectionPreferences.useNestedConnections()) {
                        result = !findNestedComponentsForRelationship(diagramModel, (IBasicRelationship)element).isEmpty();
                    }
                    
                    if(result && !models.contains(diagramModel)) {
                        models.add(diagramModel);
                    }
            	}
            }
        }
        
        return models;
    }
    
    /**
     * @param element
     * @return true if element is referenced in any diagram model
     */
    public static boolean isElementReferencedInDiagrams(IZentaElement element) {
        if(element.getZentaModel() == null) {
            return false;
        }
        
        for(IDiagramModel diagramModel : element.getZentaModel().getDiagramModels()) {
            IDiagramModel dm = Util.verifyNonNull(diagramModel);
			if(isElementReferencedInDiagram(dm, element)) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * @param element
     * @return true if element is referenced in diagramModel
     */
    public static boolean isElementReferencedInDiagram(IDiagramModel diagramModel, IZentaElement element) {
        if(!findDiagramModelComponentsForElement(diagramModel, element).isEmpty()) {
            return true;
        }
        
        // Expressed as a nested parent/child
        if(element instanceof IBasicRelationship && ConnectionPreferences.useNestedConnections()) {
            if(!findNestedComponentsForRelationship(diagramModel, (IBasicRelationship)element).isEmpty()) {
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
    public static List<IDiagramModelComponent> findDiagramModelComponentsForElement(IDiagramModel diagramModel, IZentaElement element) {
        List<IDiagramModelComponent> list = new ArrayList<IDiagramModelComponent>();
        
        if(element instanceof IBasicRelationship) {
            list.addAll(findDiagramModelConnectionsForRelation(diagramModel, (IBasicRelationship)element));
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
    public static List<IDiagramModelZentaObject> findDiagramModelObjectsForElement(IDiagramModelContainer parent, IZentaElement element) {
        List<IDiagramModelZentaObject> list = new ArrayList<IDiagramModelZentaObject>();
        __findDiagramModelObjectsForElement(list, parent, element);
        return list;
    }
    
    private static void __findDiagramModelObjectsForElement(List<IDiagramModelZentaObject> list, IDiagramModelContainer parent, IZentaElement element) {
        for(IDiagramModelObject object : parent.getChildren()) {
            if(object instanceof IDiagramModelZentaObject) {
                if(((IDiagramModelZentaObject)object).getZentaElement() == element && !list.contains(object)) {
                    list.add((IDiagramModelZentaObject)object);
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
    public static List<IDiagramModelZentaConnection> findDiagramModelConnectionsForRelation(IDiagramModelContainer parent, IBasicRelationship relationship) {
        List<IDiagramModelZentaConnection> list = new ArrayList<IDiagramModelZentaConnection>();
        __findDiagramModelConnectionsForRelation(list, parent, relationship);
        return list;
    }

    private static void __findDiagramModelConnectionsForRelation(List<IDiagramModelZentaConnection> list, IDiagramModelContainer parent, IBasicRelationship relationship) {
        for(IDiagramModelObject object : parent.getChildren()) {
            for(IDiagramModelConnection connection : object.getSourceConnections()) {
                if(connection instanceof IDiagramModelZentaConnection &&
                                        ((IDiagramModelZentaConnection)connection).getRelationship() == relationship
                                        && !list.contains(object)) {
                    list.add((IDiagramModelZentaConnection)connection);
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
     * Find matching pairs of IDiagramModelZentaObject types that are nested in a Diagram Model
     * @param diagramModel
     * @param relation
     * @return
     */
    public static List<IDiagramModelZentaObject[]> findNestedComponentsForRelationship(IDiagramModel diagramModel, IBasicRelationship relation) {
        IZentaElement src = relation.getSource();
        IZentaElement tgt = relation.getTarget();
        
        List<IDiagramModelZentaObject> srcList = findDiagramModelObjectsForElement(diagramModel, src);
        List<IDiagramModelZentaObject> tgtList = findDiagramModelObjectsForElement(diagramModel, tgt);
        
        List<IDiagramModelZentaObject[]> list = new ArrayList<IDiagramModelZentaObject[]>();
        
        for(IDiagramModelZentaObject dmo1 : srcList) {
            for(IDiagramModelZentaObject dmo2 : tgtList) {
                if(isNestedRelationship(dmo1, dmo2)) {
                    list.add(new IDiagramModelZentaObject[] {dmo1, dmo2});
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
    public static boolean isNestedRelationship(IDiagramModelZentaObject parent, IDiagramModelZentaObject child) {
        IZentaElement srcElement = parent.getZentaElement();
        IZentaElement tgtElement = child.getZentaElement();

        // Then see if it's nested
        if(parent.getChildren().contains(child)) {
            return hasNestedConnectionTypeRelationship(srcElement, tgtElement);
        }
        
        return false;
    }
    
    /**
     * Check if there is already a nested type relationship between parent (source) and child (target)
     */
    public static boolean hasNestedConnectionTypeRelationship(IZentaElement parent, IZentaElement child) {
        for(IBasicRelationship relation : ZentaModelUtils.getSourceRelationships(parent)) {
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
    public static boolean isNestedConnectionTypeRelationship(IBasicRelationship relation) {
    	return false;
    }
    
    /**
     * @param element
     * @return true if element can be used to calculate an nested type connection as one end of the relation
     */
    public static boolean isNestedConnectionTypeElement(IZentaElement element) {
        return !(element instanceof IJunctionElement);
    }
    
    /**
     * @param srcObject
     * @param tgtObject
     * @param relation
     * @return True if there is an IDiagramModelConnection containing relation between srcObject and tgtObject
     */
    public static boolean hasDiagramModelZentaConnection(IDiagramModelZentaObject srcObject, IDiagramModelZentaObject tgtObject,
            IBasicRelationship relation) {

        for(IDiagramModelConnection conn : srcObject.getSourceConnections()) {
            if(conn instanceof IDiagramModelZentaConnection) {
                IBasicRelationship r = ((IDiagramModelZentaConnection)conn).getRelationship();
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
    public static boolean shouldBeHiddenConnection(IDiagramModelZentaConnection connection) {
    	return false;//FIXME shouldBeHiddenConnection
/*    	

        if(!ConnectionPreferences.useNestedConnections()) {
            return false;
        }
        
        // Only if source and target elements are Zenta elements
        if(connection.getSource() instanceof IDiagramModelZentaObject && connection.getTarget() instanceof IDiagramModelZentaObject) {
            IDiagramModelZentaObject source = (IDiagramModelZentaObject)connection.getSource();
            IDiagramModelZentaObject target = (IDiagramModelZentaObject)connection.getTarget();
            
            // Junction types are excluded
            if(!DiagramModelUtils.isNestedConnectionTypeElement(source.getZentaElement()) || 
                    !DiagramModelUtils.isNestedConnectionTypeElement(target.getZentaElement())) {
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
*/
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
            if(connection instanceof IDiagramModelZentaConnection && connection.getTarget().equals(target)) {
                EClass type = ((IDiagramModelZentaConnection)connection).getRelationship().eClass();
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
