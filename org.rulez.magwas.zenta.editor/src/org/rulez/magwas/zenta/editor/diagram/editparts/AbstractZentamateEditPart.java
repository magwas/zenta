/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.rulez.magwas.zenta.editor.diagram.policies.ZentamateDiagramConnectionPolicy;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IProperties;


/**
 * Abstract Zentamate Edit Part with connections
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractZentamateEditPart
extends AbstractConnectedEditPart
implements IZentamateEditPart {
    
    @Override
    public IDiagramModelZentamateObject getModel() {
        return (IDiagramModelZentamateObject)super.getModel();
    }
    
    @Override
    protected void addECoreAdapter() {
        super.addECoreAdapter();
        // Listen to changes in Zentamate Model
        getModel().getZentamateElement().eAdapters().add(getECoreAdapter());
    }
    
    @Override
    protected void removeECoreAdapter() {
        super.removeECoreAdapter();
        // Unlisten to changes in Zentamate Model
        getModel().getZentamateElement().eAdapters().remove(getECoreAdapter());
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
        installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new ZentamateDiagramConnectionPolicy());
    }
    
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Class adapter) {
        if(adapter == IZentamateElement.class || adapter == IProperties.class) {
            return getModel().getZentamateElement();
        }
        return super.getAdapter(adapter);
    }
}