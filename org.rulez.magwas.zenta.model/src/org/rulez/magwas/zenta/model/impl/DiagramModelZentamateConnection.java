/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IZentamateElement;
import org.rulez.magwas.zenta.model.IZentamatePackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentamateObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentamateConnection#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelZentamateConnection extends DiagramModelConnection implements IDiagramModelZentamateConnection {
    /**
     * Wrapped Zentamate relationship
     */
    private IRelationship fRelationship;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelZentamateConnection() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentamatePackage.Literals.DIAGRAM_MODEL_ARCHIMATE_CONNECTION;
	}

    @Override
    public String getName() {
        if(getRelationship() != null) {
            return getRelationship().getName();
        }
        else {
            return super.getName();
        }
    }

    @Override
    public void setName(String name) {
        if(getRelationship() != null) {
            getRelationship().setName(name);
        }
    }
    
    @Override
    public void connect(IDiagramModelObject source, IDiagramModelObject target) {
        if(!(source instanceof IDiagramModelZentamateObject) && !(target instanceof IDiagramModelZentamateObject)) {
            throw new IllegalArgumentException("Should be Zentamate objects for source and target!"); //$NON-NLS-1$
        }
        super.connect(source, target);
    }

    @Override
    public void reconnect() {
        if(source != null && target != null) {
            super.reconnect();

            // Set the source/target in the Zentamate model if need be
            IRelationship relationship = getRelationship();
            IZentamateElement src = ((IDiagramModelZentamateObject)source).getZentamateElement();
            IZentamateElement tgt = ((IDiagramModelZentamateObject)target).getZentamateElement();
            if(relationship.getSource() != src) { //optimised
                relationship.setSource(src); 
            }
            if(relationship.getTarget() != tgt) { //optimised
                relationship.setTarget(tgt);
            }
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IRelationship getRelationship() {
        return fRelationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setRelationship(IRelationship relationship) {
        fRelationship = relationship;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addRelationshipToModel(IFolder parent) {
        IRelationship relationship = getRelationship();
        if(relationship != null && relationship.eContainer() == null) {
            // If parent is null use default folder
            if(parent == null) {
                parent = getDiagramModel().getZentamateModel().getDefaultFolderForElement(relationship);
            }
            parent.getElements().add(relationship);
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void removeRelationshipFromModel() {
        IRelationship relationship = getRelationship();
        if(relationship != null) {
            IFolder folder = (IFolder)relationship.eContainer();
            if(folder != null) {
                folder.getElements().remove(relationship);
            }
        }
    }

    @Override
    public EObject getCopy() {
        IDiagramModelZentamateConnection newConnection = (IDiagramModelZentamateConnection)super.getCopy();
        IRelationship relationship = (IRelationship)getRelationship().getCopy();
        newConnection.setRelationship(relationship);
        return newConnection;
    }
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				return getRelationship();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				setRelationship((IRelationship)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				setRelationship((IRelationship)null);
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IZentamatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP:
				return getRelationship() != null;
		}
		return super.eIsSet(featureID);
	}

} //DiagramModelConnection
