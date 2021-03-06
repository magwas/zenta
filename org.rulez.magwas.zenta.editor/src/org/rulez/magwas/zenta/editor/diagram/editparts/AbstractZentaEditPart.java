/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentaDiagramConnectionPolicy;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IProperties;


/**
 * Abstract Zenta Edit Part with connections
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractZentaEditPart
extends AbstractConnectedEditPart
implements IZentaEditPart {
    
    @Override
    public IDiagramModelZentaObject getModel() {
        return (IDiagramModelZentaObject)super.getModel();
    }
    
    @Override
    protected void addECoreAdapter() {
        super.addECoreAdapter();
        // Listen to changes in Zenta Model
        getModel().getZentaElement().eAdapters().add(getECoreAdapter());
    }
    
    @Override
    protected void removeECoreAdapter() {
        super.removeECoreAdapter();
        // Unlisten to changes in Zenta Model
        getModel().getZentaElement().eAdapters().remove(getECoreAdapter());
    }
    
    @Override
    protected void eCoreChanged(Notification msg) {
        switch(msg.getEventType()) {
            // Children added or removed or moved - need to refresh connections
            case Notification.ADD:
            case Notification.ADD_MANY:
            case Notification.REMOVE:
            case Notification.REMOVE_MANY:
            case Notification.MOVE:
                refreshSourceConnections();
                refreshTargetConnections();
                refreshChildren();
                break;

            default:
                super.eCoreChanged(msg);
        }
    }
    
    @Override
    protected void applicationPreferencesChanged(PropertyChangeEvent event) {
        // Hidden connections
        if(IPreferenceConstants.HIDDEN_RELATIONS_TYPES.equals(event.getProperty()) ||
                IPreferenceConstants.USE_NESTED_CONNECTIONS.equals(event.getProperty())) {
            refreshSourceConnections();
            refreshTargetConnections();
        }
        // Default fill colour preference changed
        else if(event.getProperty().startsWith(IPreferenceConstants.DEFAULT_FILL_COLOR_PREFIX)) {
            getFigure().repaint();
        }
        else {
            super.applicationPreferencesChanged(event);
        }
    }
    
    @Override
    protected void createEditPolicies() {
        // Allow parts to be joined together
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ZentaDiagramConnectionPolicy());
    }
    
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Class adapter) {
        if(adapter == IZentaElement.class || adapter == IProperties.class) {
            return getModel().getZentaElement();
        }
        return super.getAdapter(adapter);
    }
}