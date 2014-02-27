/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.UndoState;
import org.rulez.magwas.zenta.model.handmade.util.Util;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagram Model Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase#getId <em>Id</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase#getDiagramModel <em>Diagram Model</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase#getLineWidth <em>Line Width</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase#getLineColor <em>Line Color</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DiagramModelComponentBase extends EObjectImpl implements IDiagramModelComponent {

	protected static Object getValueFromStringForFeature(EAttribute feature,
			String valuestring) {
				Class<?> type = feature.getEType().getInstanceClass();
				Object value;
				if(type.equals(int.class)) {
					value = Integer.parseInt(valuestring);
				} else if (type.equals(String.class)) {
					value = valuestring;
				} else {
					throw new UnknownEAttributeType();
				}
				return value;
			}
		    public static class UnknownEAttributeType extends RuntimeException {
				private static final long serialVersionUID = 1L;
			}


	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected static final String NAME_EDEFAULT = ""; //$NON-NLS-1$

    /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
    protected String name = NAME_EDEFAULT;

    /**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
				    * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
				   protected static final String ID_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
				    * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
				   protected String id = ID_EDEFAULT;

				/**
	 * The default value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_WIDTH_EDEFAULT = 1;

				/**
	 * The cached value of the '{@link #getLineWidth() <em>Line Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineWidth()
	 * @generated
	 * @ordered
	 */
	protected int lineWidth = LINE_WIDTH_EDEFAULT;

				/**
	 * The default value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_COLOR_EDEFAULT = null;

				/**
	 * The cached value of the '{@link #getLineColor() <em>Line Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineColor()
	 * @generated
	 * @ordered
	 */
	protected String lineColor = LINE_COLOR_EDEFAULT;

				/**
     * Adapter Map for arbitrary objects
     */
    private Map<Object, Object> fAdapterMap = new HashMap<Object, Object>();

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected DiagramModelComponentBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.DIAGRAM_MODEL_COMPONENT;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getId() {
		return id;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID, oldId, id));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated NOT
	 */
    @NonNull
    public String getName() {
		return Util.verifyNonNull(name);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME, oldName, name));
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IDiagramModel getDiagramModel() {
        if(eContainer() == null) {
            return null;
        }
        return ((IDiagramModelComponent)eContainer()).getDiagramModel();
    }

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineWidth() {
		return lineWidth;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineWidth(int newLineWidth) {
		int oldLineWidth = lineWidth;
		lineWidth = newLineWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH, oldLineWidth, lineWidth));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineColor() {
		return lineColor;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineColor(String newLineColor) {
		String oldLineColor = lineColor;
		lineColor = newLineColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_COLOR, oldLineColor, lineColor));
	}

				/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public Object getAdapter(Object adapter) {
        if(!fAdapterMap.containsKey(adapter) && eContainer() instanceof IAdapter) {
            return ((IAdapter)eContainer()).getAdapter(adapter);
        }
        
        return fAdapterMap.get(adapter);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public void setAdapter(Object adapter, Object object) {
        fAdapterMap.put(adapter, object);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public EObject getCopy() {
        IDiagramModelComponent newObject = EcoreUtil.copy(this);
        newObject.setId(null); // need a new ID
        return newObject;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				return getName();
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				return getId();
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL:
				return getDiagramModel();
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH:
				return getLineWidth();
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_COLOR:
				return getLineColor();
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
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				setName((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				setId((String)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH:
				setLineWidth((Integer)newValue);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_COLOR:
				setLineColor((String)newValue);
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
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				setId(ID_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH:
				setLineWidth(LINE_WIDTH_EDEFAULT);
				return;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_COLOR:
				setLineColor(LINE_COLOR_EDEFAULT);
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
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL:
				return getDiagramModel() != null;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_WIDTH:
				return lineWidth != LINE_WIDTH_EDEFAULT;
			case IZentaPackage.DIAGRAM_MODEL_COMPONENT__LINE_COLOR:
				return LINE_COLOR_EDEFAULT == null ? lineColor != null : !LINE_COLOR_EDEFAULT.equals(lineColor);
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", lineWidth: ");
		result.append(lineWidth);
		result.append(", lineColor: ");
		result.append(lineColor);
		result.append(')');
		return result.toString();
	}

	@Override
	public UndoState delete() {
		DiagramModelObjectState save = new DiagramModelObjectState();
		save.parent = (IDiagramModelContainer) eContainer();
		save.object = (IDiagramModelObject) this;
		delete(save);
		return save;
	}

	@Override
	public UndoState delete(UndoState s) {
		DiagramModelObjectState save = (DiagramModelObjectState) s;
		return deleteObjectFromContainer(save);
	}
		private DiagramModelObjectState deleteObjectFromContainer(
				DiagramModelObjectState save) {
			save.sourceConnections = new ArrayList<IDiagramModelConnection>();
			save.targetConnections = new ArrayList<IDiagramModelConnection>();
			deleteObjectClassIfItIsZentaObjectInTemplate(save);
	 		storeCopyOfConnections(save);
	 		executeAndEnsureIndexIsStoredJustBeforeExecuting(save);
	        removeConnectionsOnTheCopy(save);
	        return save;
		}
			private void deleteObjectClassIfItIsZentaObjectInTemplate(DiagramModelObjectState save) {
				IDiagramModelObject obj = (IDiagramModelObject) save.object;
				if (obj instanceof IDiagramModelZentaObject)
					deleteObjectClassIfItIsTemplate((IDiagramModelZentaObject)obj, save);
			}
			private void deleteObjectClassIfItIsTemplate(IDiagramModelZentaObject obj, DiagramModelObjectState save) {
				IDiagramModel dm = save.parent.getDiagramModel();
				if(dm.isTemplate()) {
					String ocid = obj.getZentaElement().getId();
					@SuppressWarnings("null")
					IBasicObject oc = dm.getZentaModel().getMetamodel().getClassById(ocid);
					oc.getTemplate().getClasses().remove(oc);
				}
			}
	
			private void removeConnectionsOnTheCopy(DiagramModelObjectState save) {
				removeConnections(save.sourceConnections);
		        removeConnections(save.targetConnections);
			}
			    private void removeConnections(List<IDiagramModelConnection> connections) {
			        for(IDiagramModelConnection conn : connections) {
			            conn.disconnect();
			        }
			    }
			private void executeAndEnsureIndexIsStoredJustBeforeExecuting(
					DiagramModelObjectState save) {
				IDiagramModelContainer parent = (IDiagramModelContainer) save.parent;
				save.index = parent.getChildren().indexOf(save.object); 
		        if(save.index != -1) {
		        	parent.getChildren().remove(save.object);
		        }
			}
			private void storeCopyOfConnections(DiagramModelObjectState save) {
				IDiagramModelObject object = (IDiagramModelObject) save.object;
				save.sourceConnections.addAll(object.getSourceConnections());
				save.targetConnections.addAll(object.getTargetConnections());
			}



}