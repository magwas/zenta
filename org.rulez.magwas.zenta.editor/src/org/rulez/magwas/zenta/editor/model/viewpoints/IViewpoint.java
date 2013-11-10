/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * IViewpoint
 * 
 * @author Phillip Beauvoir
 */
public interface IViewpoint {
    
    /*
     * Index numbers of Viewpoints
     */
    int TOTAL_VIEWPOINT = 0;
    int LAYERED_VIEWPOINT = 14;

    /**
     * @return The index number used when persisting the Viewpoint
     */
    int getIndex();

    /**
     * @param object
     * @return Whether the object is visible
     */
    boolean isElementVisible(EObject object);

    /**
     * @return Allowed types
     */
    EClass[] getAllowedTypes();
    
    /**
     * @return Allowed class type
     */
    boolean isAllowedType(EClass type);
    
    /**
     * @return The name of the Viewpoint
     */
    String getName();
}
