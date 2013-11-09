/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model.viewpoints;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.resource.ImageDescriptor;
import org.rulez.magwas.zenta.editor.ui.IZentamateImages;
import org.rulez.magwas.zenta.model.IZentamateDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;



/**
 * Viewpoints Manager
 * 
 * @author Phillip Beauvoir
 */
public class ViewpointsManager {
    
    /*
     * All Viewpoints
     */
    private static List<IViewpoint> VIEWPOINTS = new ArrayList<IViewpoint>();
    
    static {
    	//FIXME: viewpoints based on objectClass groups (based on templates)
        VIEWPOINTS.add(new LayeredViewpoint());
        VIEWPOINTS.add(new TotalViewpoint());
        

        // Sort the Viewpoints by name
        Collections.sort(VIEWPOINTS, new Comparator<IViewpoint>() {
            @Override
            public int compare(IViewpoint vp1, IViewpoint vp2) {
                return vp1.getName().compareTo(vp2.getName());
            }
        });
    }
    
    public static ViewpointsManager INSTANCE = new ViewpointsManager();
    
    /**
     * @param viewPoint
     * @return an ImageDesciptor for a Viewpoint
     */
    public ImageDescriptor getImageDescriptor(IViewpoint viewPoint) {
        String[] bus_appNames = { IZentamateImages.ICON_VIEWPOINT_BUSINESS_16,
                IZentamateImages.ICON_VIEWPOINT_APPLICATION_16 };
        
        String[] app_techNames = { IZentamateImages.ICON_VIEWPOINT_APPLICATION_16,
                IZentamateImages.ICON_VIEWPOINT_TECHNOLOGY_16 };
        
        switch(viewPoint.getIndex()) {
            case IViewpoint.BUSINESS_FUNCTION_VIEWPOINT:
            case IViewpoint.BUSINESS_PROCESS_VIEWPOINT:
            case IViewpoint.ORGANISATION_VIEWPOINT:
                return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_VIEWPOINT_BUSINESS_16);

            case IViewpoint.APPLICATION_BEHAVIOUR_VIEWPOINT:
            case IViewpoint.APPLICATION_COOPERATION_VIEWPOINT:
            case IViewpoint.APPLICATION_STRUCTURE_VIEWPOINT:
                return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_VIEWPOINT_APPLICATION_16);
                
            case IViewpoint.INFRASTRUCTURE_VIEWPOINT:
                return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_VIEWPOINT_TECHNOLOGY_16);

            case IViewpoint.ACTOR_COOPERATION_VIEWPOINT:
            case IViewpoint.APPLICATION_USAGE_VIEWPOINT:
            case IViewpoint.BUSINESS_PROCESS_COOPERATION_VIEWPOINT:
            case IViewpoint.BUSINESS_PRODUCT_VIEWPOINT:
            case IViewpoint.SERVICE_REALISATION_VIEWPOINT:
                return IZentamateImages.ImageFactory.getCompositeImageDescriptor(bus_appNames);
                
            case IViewpoint.IMPLEMENTATION_DEPLOYMENT_VIEWPOINT:
            case IViewpoint.INFRASTRUCTURE_USAGE_VIEWPOINT:
                return IZentamateImages.ImageFactory.getCompositeImageDescriptor(app_techNames);
                
            default:
                return IZentamateImages.ImageFactory.getImageDescriptor(IZentamateImages.ICON_VIEWPOINTS_16);
        }
    }
    
    private ViewpointsManager() {
    }
    
    /**
     * @return A list of all Viewpoints
     */
    public List<IViewpoint> getAllViewpoints() {
        return VIEWPOINTS;
    }
    
    /**
     * @param index
     * @return A Viewpoint by its index
     */
    public IViewpoint getViewpoint(int index) {
        if(index < 0 || index >= VIEWPOINTS.size()) {
            return VIEWPOINTS.get(0);
        }
        
        for(IViewpoint vp : VIEWPOINTS) {
            if(vp.getIndex() == index) {
                return vp;
            }
        }
        
        return VIEWPOINTS.get(0);
    }
    
    /**
     * @param dmo
     * @return True if dmo is an allowed component for this Viewpoint
     */
    public boolean isAllowedType(IDiagramModelComponent dmo) {
        if(dmo instanceof IDiagramModelZentamateObject && dmo.getDiagramModel() instanceof IZentamateDiagramModel) {
        	if (null == ((IDiagramModelZentamateObject)dmo).getZentamateElement()) {
        		return false;
        	}
            EClass eClass = ((IDiagramModelZentamateObject)dmo).getZentamateElement().eClass();
            return isAllowedType((IZentamateDiagramModel)dmo.getDiagramModel(), eClass);
        }
        if(dmo instanceof IDiagramModelConnection) {
            return isAllowedType(((IDiagramModelConnection)dmo).getSource()) && 
                        isAllowedType(((IDiagramModelConnection)dmo).getTarget());
        }
        return true;
    }
    
    /**
     * @param dm
     * @param eClass
     * @return True if eClass is an allowed component for this Viewpoint
     */
    public boolean isAllowedType(IZentamateDiagramModel dm, EClass eClass) {
        if(dm != null) {
            IViewpoint viewPoint = getViewpoint(dm.getViewpoint());
            return viewPoint.isAllowedType(eClass);
        }
        return true;
    }
}