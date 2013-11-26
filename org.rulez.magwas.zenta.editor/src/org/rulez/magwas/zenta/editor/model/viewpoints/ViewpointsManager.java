/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;



/**
 * Viewpoints Manager
 * 
 * @author Phillip Beauvoir
 */
public class ViewpointsManager {
    
    public static ViewpointsManager INSTANCE = new ViewpointsManager();
    private static Map<IZentaDiagramModel,IViewpoint> registry = new HashMap<IZentaDiagramModel,IViewpoint>();
    
    /**
     * @param viewPoint
     * @return an ImageDesciptor for a Viewpoint
     */
    public ImageDescriptor getImageDescriptor(IViewpoint viewPoint) {
        
        return IZentaImages.ImageFactory.getImageDescriptor(IZentaImages.ICON_VIEWPOINTS_16);
    }
    
    private ViewpointsManager() {
    }
    
    /**
     * @return A list of all Viewpoints
     */
    public Collection<IViewpoint> getAllViewpoints() {
        return registry.values();
    }
    
    /**
     * @param index
     * @return A Viewpoint by its index
     */
    public IViewpoint getViewpoint(IZentaDiagramModel dm) {
    	if(registry.containsKey(dm)) {
    		return registry.get(dm);
    	}
    	TotalViewpoint vp = new TotalViewpoint(dm);
    	registry.put(dm, vp);
    	return vp;
    }
    
    /**
     * @param dmo
     * @return True if dmo is an allowed component for this Viewpoint
     */
    public boolean isAllowedType(IDiagramModelComponent dmo) {
        if(dmo instanceof IDiagramModelZentaObject && dmo.getDiagramModel() instanceof IZentaDiagramModel) {
        	IDiagramModelZentaObject dmzo = (IDiagramModelZentaObject)dmo;
			if (null == dmzo.getZentaElement()) {
        		return false;
        	}
            EClass eClass = dmzo.getZentaElement().eClass();
            return isAllowedType((IZentaDiagramModel) dmo.getDiagramModel(), eClass);
        }
        if(dmo instanceof IDiagramModelConnection) {
            IDiagramModelConnection dmc = (IDiagramModelConnection)dmo;
			return isAllowedType(dmc.getSource()) && 
                        isAllowedType(dmc.getTarget());
        }
        return true;
    }
    
    /**
     * @param dm
     * @param eClass
     * @return True if eClass is an allowed component for this Viewpoint
     */
    public boolean isAllowedType(IZentaDiagramModel dm, EClass eClass) {
        if(dm != null) {
            IViewpoint viewPoint = getViewpoint(dm);
            return viewPoint.isAllowedType(eClass);
        }
        return true;
    }
}
