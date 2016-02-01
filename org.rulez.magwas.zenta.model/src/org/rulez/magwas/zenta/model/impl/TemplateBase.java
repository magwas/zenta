/**
 */
package org.rulez.magwas.zenta.model.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ITemplate Base</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getName <em>Name</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getObjectClasses <em>Object Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getRelationClasses <em>Relation Classes</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getPath <em>Path</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.impl.TemplateBase#getMetamodel <em>MetamodelBase</em>}</li>
 * </ul>
 * </p>
 *
 */
abstract public class TemplateBase extends EObjectImpl implements ITemplate {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<IBasicObject> classes;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDiagram() <em>Diagram</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagram()
	 * @generated
	 * @ordered
	 */
	protected IDiagramModel diagram;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TemplateBase() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IZentaPackage.Literals.TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IBasicObject> getClasses() {
		if (classes == null) {
			classes = new EObjectWithInverseEList<IBasicObject>(IBasicObject.class, this, IZentaPackage.TEMPLATE__CLASSES, IZentaPackage.BASIC_OBJECT__TEMPLATE);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.TEMPLATE__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMetamodel getMetamodel() {
		if (eContainerFeatureID() != IZentaPackage.TEMPLATE__METAMODEL) return null;
		return (IMetamodel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetamodel(IMetamodel newMetamodel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newMetamodel, IZentaPackage.TEMPLATE__METAMODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetamodel(IMetamodel newMetamodel) {
		if (newMetamodel != eInternalContainer() || (eContainerFeatureID() != IZentaPackage.TEMPLATE__METAMODEL && newMetamodel != null)) {
			if (EcoreUtil.isAncestor(this, newMetamodel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newMetamodel != null)
				msgs = ((InternalEObject)newMetamodel).eInverseAdd(this, IZentaPackage.METAMODEL__TEMPLATES, IMetamodel.class, msgs);
			msgs = basicSetMetamodel(newMetamodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.TEMPLATE__METAMODEL, newMetamodel, newMetamodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiagramModel getDiagram() {
		if (diagram != null && diagram.eIsProxy()) {
			InternalEObject oldDiagram = (InternalEObject)diagram;
			diagram = (IDiagramModel)eResolveProxy(oldDiagram);
			if (diagram != oldDiagram) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IZentaPackage.TEMPLATE__DIAGRAM, oldDiagram, diagram));
			}
		}
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDiagramModel basicGetDiagram() {
		return diagram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagram(IDiagramModel newDiagram) {
		IDiagramModel oldDiagram = diagram;
		diagram = newDiagram;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IZentaPackage.TEMPLATE__DIAGRAM, oldDiagram, diagram));
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
			case IZentaPackage.TEMPLATE__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
			case IZentaPackage.TEMPLATE__METAMODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetMetamodel((IMetamodel)otherEnd, msgs);
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
			case IZentaPackage.TEMPLATE__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
			case IZentaPackage.TEMPLATE__METAMODEL:
				return basicSetMetamodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case IZentaPackage.TEMPLATE__METAMODEL:
				return eInternalContainer().eInverseRemove(this, IZentaPackage.METAMODEL__TEMPLATES, IMetamodel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IZentaPackage.TEMPLATE__CLASSES:
				return getClasses();
			case IZentaPackage.TEMPLATE__PATH:
				return getPath();
			case IZentaPackage.TEMPLATE__METAMODEL:
				return getMetamodel();
			case IZentaPackage.TEMPLATE__DIAGRAM:
				if (resolve) return getDiagram();
				return basicGetDiagram();
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
			case IZentaPackage.TEMPLATE__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends IBasicObject>)newValue);
				return;
			case IZentaPackage.TEMPLATE__PATH:
				setPath((String)newValue);
				return;
			case IZentaPackage.TEMPLATE__METAMODEL:
				setMetamodel((IMetamodel)newValue);
				return;
			case IZentaPackage.TEMPLATE__DIAGRAM:
				setDiagram((IDiagramModel)newValue);
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
			case IZentaPackage.TEMPLATE__CLASSES:
				getClasses().clear();
				return;
			case IZentaPackage.TEMPLATE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case IZentaPackage.TEMPLATE__METAMODEL:
				setMetamodel((IMetamodel)null);
				return;
			case IZentaPackage.TEMPLATE__DIAGRAM:
				setDiagram((IDiagramModel)null);
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
			case IZentaPackage.TEMPLATE__CLASSES:
				return classes != null && !classes.isEmpty();
			case IZentaPackage.TEMPLATE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case IZentaPackage.TEMPLATE__METAMODEL:
				return getMetamodel() != null;
			case IZentaPackage.TEMPLATE__DIAGRAM:
				return diagram != null;
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
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

	@Override
	public void removeClass( IBasicObject oc) {
		getClasses().remove(oc);
	}

} //TemplateBaseImpl
