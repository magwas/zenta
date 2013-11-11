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
import org.rulez.magwas.zenta.editor.diagram.IZentaDiagramEditor;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.util.DerivedRelationsUtils;


/**
 * Abstract class for all implementations of Zenta Connection parts
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractZentaConnectionEditPart extends AbstractDiagramConnectionEditPart 
implements IZentaConnectionEditPart {
    
    private IZentaModel fZentaModel;
    
    /**
     * Listen to all model changes to refresh Structural color.
     */
    private Adapter fModelAdapter = new EContentAdapter() {
        @Override
        public void notifyChanged(Notification msg) {
            super.notifyChanged(msg);

            Object feature = msg.getFeature();
            if(feature == IZentaPackage.Literals.RELATIONSHIP__SOURCE
                                                    || feature == IZentaPackage.Literals.RELATIONSHIP__TARGET
                                                    || feature == IZentaPackage.Literals.FOLDER__ELEMENTS) {
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
            if(evt.getPropertyName() == IZentaDiagramEditor.PROPERTY_SHOW_STRUCTURAL_CHAIN) {
                registerStructural();
            }
        }
    };
    
    ///----------------------------------------------------------------------------------------
    ///----------------------------------------------------------------------------------------
    ///----------------------------------------------------------------------------------------
    
    @Override
    public IDiagramModelZentaConnection getModel() {
        return (IDiagramModelZentaConnection)super.getModel();
    }

    @Override
    public void activate() {
		if(!isActive()) {
			super.activate();
			// Store this
            fZentaModel = getModel().getDiagramModel().getZentaModel();
			// Listen to Zenta Relationship changes
			getModel().getRelationship().eAdapters().add(getECoreAdapter());
			// Register to listen to overall model changes that affect the structural relationship chains
			if(isShowStructural()) {
	            fZentaModel.eAdapters().add(fModelAdapter);
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
            fZentaModel.eAdapters().remove(fModelAdapter);
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
            fZentaModel.eAdapters().add(fModelAdapter);
            showStructural();
        }
        else {
            fZentaModel.eAdapters().remove(fModelAdapter);
            clearStructural();
        }
    }
    
    protected boolean isShowStructural() {
        return Boolean.TRUE.equals(getViewer().getProperty(IZentaDiagramEditor.PROPERTY_SHOW_STRUCTURAL_CHAIN));
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
        if(adapter == IDiagramModelZentaConnection.class) {
            return getModel();
        }
        if(adapter == IZentaElement.class || adapter == IProperties.class) {
            return getModel().getRelationship();
        }
        return super.getAdapter(adapter);
    }
}
