/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ui.IZentaImages;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
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
    private static Map<IDiagramModel,IViewpoint> registry = new HashMap<IDiagramModel,IViewpoint>();
    
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
    
    public IViewpoint getViewpoint(IDiagramModelComponent relationshipType) {
    	IDiagramModel dm = relationshipType.getDiagramModel();
    	if(registry.containsKey(dm)) {
    		return registry.get(dm);
    	}
    	AbstractViewpoint vp = new TotalViewpoint(dm);
    	registry.put(dm, vp);
    	return vp;
    }
    
     public boolean isAllowedType(IDiagramModelComponent dmo) {
        if(dmo instanceof IDiagramModelZentaObject && dmo.getDiagramModel() instanceof IZentaDiagramModel) {
        	IDiagramModelZentaObject dmzo = (IDiagramModelZentaObject)dmo;
			if (null == dmzo.getZentaElement()) {
        		return false;
        	}
            return isAllowedType((IZentaDiagramModel) dmo.getDiagramModel(), dmzo);
        }
        if(dmo instanceof IDiagramModelConnection) {
            IDiagramModelConnection dmc = (IDiagramModelConnection)dmo;
			return isAllowedType(dmc.getSource()) && 
                        isAllowedType(dmc.getTarget());
        }
        return true;
    }
    
    private boolean isAllowedType(IZentaDiagramModel diagramModel,
			IDiagramModelZentaObject dmzo) {
        IViewpoint viewPoint = getViewpoint(diagramModel);
        return viewPoint.isAllowedType(dmzo.getZentaElement());
	}

	public IViewpoint getViewpoint(IDiagramModelObject fParentElement) {
		IDiagramModel dm = fParentElement.getDiagramModel();
		return getViewpoint(dm);
	}
}
