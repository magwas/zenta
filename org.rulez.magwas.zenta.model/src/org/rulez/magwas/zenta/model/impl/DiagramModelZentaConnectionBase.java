/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.handmade.util.Util;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase#getRelationship <em>Relationship</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DiagramModelZentaConnectionBase extends DiagramModelConnectionBase implements IDiagramModelZentaConnection {
    /**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected IBasicRelationship relationship;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelZentaConnectionBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_ZENTA_CONNECTION;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
    @NonNull
	public IBasicRelationship getRelationship() {
		return Util.verifyNonNull(relationship);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRelationship(IBasicRelationship newRelationship, NotificationChain msgs) {
		IBasicRelationship oldRelationship = relationship;
		relationship = newRelationship;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP, oldRelationship, newRelationship);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationship(IBasicRelationship newRelationship) {
		if (newRelationship != relationship) {
			NotificationChain msgs = null;
			if (relationship != null)
				msgs = ((InternalEObject)relationship).eInverseRemove(this, IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS, IBasicRelationship.class, msgs);
			if (newRelationship != null)
				msgs = ((InternalEObject)newRelationship).eInverseAdd(this, IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS, IBasicRelationship.class, msgs);
			msgs = basicSetRelationship(newRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP, newRelationship, newRelationship));
	}

	@Override
	@NonNull
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
        if(!(source instanceof IDiagramModelZentaObject) && !(target instanceof IDiagramModelZentaObject)) {
            throw new IllegalArgumentException("Should be Zenta objects for source and target!"); //$NON-NLS-1$
        }
        super.connect(source, target);
    }

    @Override
    public void reconnect() {
        if(source != null && target != null) {
            super.reconnect();

            // Set the source/target in the Zenta model if need be
            IBasicRelationship relationship = getRelationship();
            IZentaElement src = ((IDiagramModelZentaObject)source).getZentaElement();
            IZentaElement tgt = ((IDiagramModelZentaObject)target).getZentaElement();
            relationship.setSource(src); 
            relationship.setTarget(tgt);
        }
    }


    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void addRelationshipToModel(IFolder parent) {
        IBasicRelationship relationship = getRelationship();
        if(relationship.eContainer() == null) {
            if(parent == null) {
            	throw new UnTestedException();
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
        IBasicRelationship relationship = getRelationship();
        IFolder folder = (IFolder)relationship.eContainer();
        if(folder != null) {
            folder.getElements().remove(relationship);
        }
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP:
				if (relationship != null)
					msgs = ((InternalEObject)relationship).eInverseRemove(this, IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS, IBasicRelationship.class, msgs);
				return basicSetRelationship((IBasicRelationship)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP:
				return basicSetRelationship(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

				@Override
    public EObject getCopy() {
        IDiagramModelZentaConnection newConnection = (IDiagramModelZentaConnection)super.getCopy();
        IBasicRelationship relationship = (IBasicRelationship)getRelationship().getCopy();
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP:
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP:
				setRelationship((IBasicRelationship)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP:
				setRelationship((IBasicRelationship)null);
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
			case IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP:
				return relationship != null;
		}
		return super.eIsSet(featureID);
	}

    @Override
    public String getFinalFont() {
    	if(null != font)
    		return font;
    	IBasicRelationship definingElement = getDefiningElement();
		if(null == definingElement)
			return null;
    	List<String> props = definingElement.getPropertyNamed("font");
		if(props.size() >0 )
			return props.get(0);
		return null;
    }

    @Override
    public String getFinalFontColor() {
    	if(null != fontColor)
    		return fontColor;
    	IBasicRelationship definingElement = getDefiningElement();
		if(null == definingElement)
			return null;
    	List<String> props = definingElement.getPropertyNamed("fontColor");
		if(props.size() >0 )
			return props.get(0);
		return null;
    }
    
    @Override
    public String getFinalLineColor() {
    	if(null != lineColor)
    		return lineColor;
    	IBasicRelationship definingElement = getDefiningElement();
		if(null == definingElement)
			return null;
    	List<String> props = definingElement.getPropertyNamed("lineColor");
		if(props.size() >0 )
			return props.get(0);
		return null;
    }
    
    @Override
    public String getFinalLineDecoration() {
    	if(null != lineDecoration)
    		return lineDecoration;
    	IBasicRelationship definingElement = getDefiningElement();
		if(null == definingElement)
			return null;
    	List<String> props = definingElement.getPropertyNamed("lineDecoration");
		if(props.size() >0 )
			return props.get(0);
		return null;
    }
    
    @Override
    public int getFinalTextPosition() {
    	if(-1 != textPosition)
    		return textPosition;
    	IBasicRelationship definingElement = getDefiningElement();
		if(null == definingElement)
			return CONNECTION_TEXT_POSITION_MIDDLE;
    	List<String> props = definingElement.getPropertyNamed("textPosition");
		if(props.size() >0 )
			return new Integer(props.get(0));
		return CONNECTION_TEXT_POSITION_MIDDLE;
    }

    @Override
    public int getFinalLineWidth() {
    	if(LINE_WIDTH_EDEFAULT != lineWidth)
    		return lineWidth;
    	IBasicRelationship definingElement = getDefiningElement();
		if(null == definingElement)
			return 1;
    	List<String> props = definingElement.getPropertyNamed("lineWidth");
		if(props.size() >0 )
			return new Integer(props.get(0));
		return 1;
    }
    
    @Override
	public IBasicRelationship getDefiningElement() {
		IBasicRelationship relation = getRelationship();
        return (IBasicRelationship) relation.getDefiningElement();
	}
} //DiagramModelConnection
