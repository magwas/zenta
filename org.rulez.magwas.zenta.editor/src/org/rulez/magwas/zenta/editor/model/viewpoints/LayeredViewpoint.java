/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.List;

import org.rulez.magwas.zenta.metamodel.referencesModelObject;

/**
 * Layered Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public class LayeredViewpoint extends AbstractViewpoint {
    
    @Override
    public String getName() {
        return Messages.LayeredViewpoint_0;
    }

    @Override
    public int getIndex() {
        return LAYERED_VIEWPOINT;
    }
    
    @Override
    public List<referencesModelObject> getAllowedTypes() {
        return null;
    }
}