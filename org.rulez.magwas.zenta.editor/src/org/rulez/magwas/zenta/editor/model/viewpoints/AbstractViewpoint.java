/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;


/**
 * Abstract Viewpoint
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractViewpoint implements IViewpoint {
    
    private List<EClass> fClassList;
    
    @Override
    public boolean isElementVisible(EObject object) {
        if(getAllowedList() == null) {
            return true;
        }
        
        EClass eClass = null;
        
        if(object instanceof IDiagramModelZentaObject) {
            eClass = ((IDiagramModelZentaObject)object).getZentaElement().eClass();
        }
        else if(object instanceof IZentaElement) {
            eClass = object.eClass();
        }
        
        // eClass is IZentaElement type
        if(eClass != null && !getAllowedList().contains(eClass)) {
            return false;
        }
        
        // Check diagram object container parent in all cases
        if(object.eContainer() instanceof IDiagramModelObject) {
            return isElementVisible(object.eContainer());
        }
        
        return true;
    }
    
    @Override
    public boolean isAllowedType(EClass type) {
        return getAllowedList() == null ? true : getAllowedList().contains(type);
    };
    
    /**
     * @return A list of allowed types or null
     */
    protected List<EClass> getAllowedList() {
        if(getAllowedTypes() != null && fClassList == null) {
            fClassList = Arrays.asList(getAllowedTypes());
        }
        return fClassList;
    }
}