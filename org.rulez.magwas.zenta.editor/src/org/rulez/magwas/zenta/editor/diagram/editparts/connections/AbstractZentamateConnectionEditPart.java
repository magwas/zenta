/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.editparts.connections;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.rulez.magwas.zenta.editor.diagram.IZentamateDiagramEditor;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamateModel;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.DerivedRelationsUtils;


/**
 * Abstract class for all implementations of Zentamate Connection parts
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractZentamateConnectionEditPart extends AbstractDiagramConnectionEditPart 
implements IZentamateConnectionEditPart {
    
    private IZentamateModel fZentamateModel;
    
    /**
     * Listen to all model changes to refresh Structural color.
     */
    private Adapter fModelAdapter = new EContentAdapter() {
        @Override
        public void notifyChanged(Notification msg) {
            super.notifyChanged(msg);

            Object feature = msg.getFeature();
            if(feature == IZentamatePackage.Literals.RELATIONSHIP__SOURCE
                                                    || feature == IZentamatePackage.Literals.RELATIONSHIP__TARGET
                                                    || feature == IZentamatePackage.Literals.FOLDER__ELEMENTS) {
                showStructural();
            }
        }
    };
    
    /**
     * Listen to user toggling on/off show structural chains
     */
    private PropertyChangeListener propertyListener = new PropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent evt) {
            if(evt.getPropertyName() == IZentamateDiagramEditor.PROPERTY_SHOW_STRUCTURAL_CHAIN) {
                registerStructural();
            }
        }
    };
    
    ///----------------------------------------------------------------------------------------
    ///----------------------------------------------------------------------------------------
    ///----------------------------------------------------------------------------------------
    
    @Override
    public IDiagramModelZentamateConnection getModel() {
        return (IDiagramModelZentamateConnection)super.getModel();
    }

    @Override
    public void activate() {
		if(!isActive()) {
			super.activate();
			// Store this
            fZentamateModel = getModel().getDiagramModel().getZentamateModel();
			// Listen to Zentamate Relationship changes
			getModel().getRelationship().eAdapters().add(getECoreAdapter());
			// Register to listen to overall model changes that affect the structural relationship chains
			if(isShowStructural()) {
	            fZentamateModel.eAdapters().add(fModelAdapter);
	        }
			// Listen to Viewer Property changes for "Show Structural Chains"
			getViewer().addPropertyChangeListener(propertyListener);
		}
	}
	
    @Override
    public void deactivate() {
        if(isActive()) {
            super.deactivate();
            getModel().getRelationship().eAdapters().remove(getECoreAdapter());
            fZentamateModel.eAdapters().remove(fModelAdapter);
            getViewer().removePropertyChangeListener(propertyListener);
        }
    }
    
    @Override
    protected void refreshVisuals() {
        super.refreshVisuals();
        if(isShowStructural()) {
            showStructural();
        }
    }
    
    /**
     * Register Model Listener to update Structural Chains
     */
    protected void registerStructural() {
        if(isShowStructural()) {
            fZentamateModel.eAdapters().add(fModelAdapter);
            showStructural();
        }
        else {
            fZentamateModel.eAdapters().remove(fModelAdapter);
            clearStructural();
        }
    }
    
    protected boolean isShowStructural() {
        return Boolean.TRUE.equals(getViewer().getProperty(IZentamateDiagramEditor.PROPERTY_SHOW_STRUCTURAL_CHAIN));
    }
    
    protected void showStructural() {
        IRelationship relation = getModel().getRelationship();
        boolean doHighlight = DerivedRelationsUtils.isInDerivedChain(relation);
        getFigure().highlight(doHighlight);
    }
    
    protected void clearStructural() {
        getFigure().highlight(false);
    }
    
    @SuppressWarnings("rawtypes")
    @Override
    public Object getAdapter(Class adapter) {
        if(adapter == IDiagramModelZentamateConnection.class) {
            return getModel();
        }
        if(adapter == IZentamateElement.class || adapter == IProperties.class) {
            return getModel().getRelationship();
        }
        return super.getAdapter(adapter);
    }
}
