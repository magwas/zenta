/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IZentaElement;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Relationship</b></em>'.
 * @extends IrelationClass
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BasicRelationshipBase#getSource <em>Source</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BasicRelationshipBase#getTarget <em>Target</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.BasicRelationshipBase#getDiagConnections <em>Diag Connections</em>}</li>
 * </ul>
 * </p>
 *
 */
abstract public class BasicRelationshipBase extends BasicObjectBase implements IBasicRelationship, IRelationClass {
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
	/**
	 * The cached value of the '{@link #getDiagConnections() <em>Diag Connections</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<IDiagramModelZentaConnection> diagConnections;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BasicRelationshipBase() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return IZentaPackage.Literals.BASIC_RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
    @NonNull
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.BASIC_RELATIONSHIP__SOURCE, oldSource, source));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@NonNull
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
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.BASIC_RELATIONSHIP__TARGET, oldTarget, target));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	@NonNull
	public EList<IDiagramModelZentaConnection> getDiagConnections() {
		if (diagConnections == null) {
			diagConnections = new EObjectWithInverseResolvingEList<IDiagramModelZentaConnection>(IDiagramModelZentaConnection.class, this, IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS, IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP);
		}
		return diagConnections;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDiagConnections()).basicAdd(otherEnd, msgs);
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
			case IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS:
				return ((InternalEList<?>)getDiagConnections()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.BASIC_RELATIONSHIP__SOURCE:
				return getSource();
			case IZentaPackage.BASIC_RELATIONSHIP__TARGET:
				return getTarget();
			case IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS:
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
			case IZentaPackage.BASIC_RELATIONSHIP__SOURCE:
				setSource((IZentaElement)newValue);
				return;
			case IZentaPackage.BASIC_RELATIONSHIP__TARGET:
				setTarget((IZentaElement)newValue);
				return;
			case IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS:
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
			case IZentaPackage.BASIC_RELATIONSHIP__SOURCE:
				setSource((IZentaElement)null);
				return;
			case IZentaPackage.BASIC_RELATIONSHIP__TARGET:
				setTarget((IZentaElement)null);
				return;
			case IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS:
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
			case IZentaPackage.BASIC_RELATIONSHIP__SOURCE:
				return source != null;
			case IZentaPackage.BASIC_RELATIONSHIP__TARGET:
				return target != null;
			case IZentaPackage.BASIC_RELATIONSHIP__DIAG_CONNECTIONS:
				return diagConnections != null && !diagConnections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BasicRelationship
