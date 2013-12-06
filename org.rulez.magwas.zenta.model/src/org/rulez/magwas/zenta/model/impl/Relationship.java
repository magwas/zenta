/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IRelationship;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Relationship#getTarget <em>Target</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.Relationship#getDiagConnections <em>Diag Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class Relationship extends ZentaElement implements IRelationship {
    /**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
    protected IZentaElement source;

    /**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
    protected IZentaElement target;

     protected Relationship() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.RELATIONSHIP;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IZentaElement getSource() {
		return source;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setSource(IZentaElement newSource) {
		IZentaElement oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.RELATIONSHIP__SOURCE, oldSource, source));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IZentaElement getTarget() {
		return target;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTarget(IZentaElement newTarget) {
		IZentaElement oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.RELATIONSHIP__TARGET, oldTarget, target));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IDiagramModelZentaConnection> getDiagConnections() {
		// TODO: implement this method to return the 'Diag Connections' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		// The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
		// so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
		throw new UnsupportedOperationException();
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.RELATIONSHIP__SOURCE:
				return getSource();
			case IZentaPackage.RELATIONSHIP__TARGET:
				return getTarget();
			case IZentaPackage.RELATIONSHIP__DIAG_CONNECTIONS:
				return getDiagConnections();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
				@Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IZentaPackage.RELATIONSHIP__SOURCE:
				setSource((IZentaElement)newValue);
				return;
			case IZentaPackage.RELATIONSHIP__TARGET:
				setTarget((IZentaElement)newValue);
				return;
			case IZentaPackage.RELATIONSHIP__DIAG_CONNECTIONS:
				getDiagConnections().clear();
				getDiagConnections().addAll((Collection<? extends IDiagramModelZentaConnection>)newValue);
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
			case IZentaPackage.RELATIONSHIP__SOURCE:
				setSource((IZentaElement)null);
				return;
			case IZentaPackage.RELATIONSHIP__TARGET:
				setTarget((IZentaElement)null);
				return;
			case IZentaPackage.RELATIONSHIP__DIAG_CONNECTIONS:
				getDiagConnections().clear();
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
			case IZentaPackage.RELATIONSHIP__SOURCE:
				return source != null;
			case IZentaPackage.RELATIONSHIP__TARGET:
				return target != null;
			case IZentaPackage.RELATIONSHIP__DIAG_CONNECTIONS:
				return !getDiagConnections().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	public HashMap<String, EAttribute> getObjectAppearanceProperties() {
		HashMap<String, EAttribute> props = new HashMap<String, EAttribute>();
		props.put("font",IZentaPackage.eINSTANCE.getFontAttribute_Font());
		props.put("fontColor",IZentaPackage.eINSTANCE.getFontAttribute_FontColor());
		props.put("textPosition",IZentaPackage.eINSTANCE.getFontAttribute_TextPosition());
		props.put("lineWidth",IZentaPackage.eINSTANCE.getDiagramModelConnection_LineWidth());
		props.put("lineColor",IZentaPackage.eINSTANCE.getDiagramModelConnection_LineColor());
		props.put("lineDecoration",IZentaPackage.eINSTANCE.getDiagramModelConnection_LineDecoration());
		return props;
	}

	@Override
	public IDiagramModelComponent getElementFromDiagramModel(IDiagramModel dm) {
		if(dm instanceof IZentaDiagramModel)
			return scanDiagramLevel(dm);
		return null;
	}

	private IDiagramModelComponent scanDiagramLevel(IDiagramModelContainer dm) {
		for(IDiagramModelObject de : dm.getChildren())
			if(de instanceof IDiagramModelZentaObject) {
				IDiagramModelComponent res = scanOneElement(de);
				if(null != res)
					return res;
			}
		return null;
	}
		private IDiagramModelComponent scanOneElement(IDiagramModelObject de) {
			IDiagramModelComponent res;
			res = scanConnectionsFor(de);
			if(null != res)
				return res;
			return scanDiagramLevel((IDiagramModelContainer) de);
		}
			private IDiagramModelComponent scanConnectionsFor(IDiagramModelObject de) {
				for(IDiagramModelConnection conn : de.getSourceConnections()) {
					if(conn instanceof IDiagramModelZentaConnection) {
						IRelationship foundrel = ((IDiagramModelZentaConnection) conn).getRelationship();
						if(foundrel.equals(this))
							return (IDiagramModelComponent) conn;
					}
				}
				return null;
			}
}
