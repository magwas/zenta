package org.rulez.magwas.zenta.metamodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.impl.AssociationRelationship;
import org.rulez.magwas.zenta.model.impl.BusinessObject;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.impl.DiagramModelZentaObject;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModel;

public class TemplateImpl extends ReferencesModelObject implements Template {
	protected EObject reference;

	protected EList<ObjectClass> objectClasses;

	protected EList<RelationClass> relationClasses;

	protected static final String PATH_EDEFAULT = null;

	protected String path = PATH_EDEFAULT;

	private Metamodel metamodel;

	protected TemplateImpl() {
		super();
	}

	public TemplateImpl(ZentaDiagramModel reference, Metamodel metamodel) {
		super();
		this.metamodel = metamodel;
		setReference(reference);
		extractObjectClasses(reference);
	}

	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.TEMPLATE;
	}

	public EObject getReference() {
		return reference;
	}

	public void setReference(EObject newReference) {
		EObject oldReference = reference;
		reference = newReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TEMPLATE__REFERENCE, oldReference, reference));
	}

	public EList<ObjectClass> getObjectClasses() {
		if (objectClasses == null) {
			objectClasses = new EObjectContainmentEList<ObjectClass>(ObjectClass.class, this, MetamodelPackage.TEMPLATE__OBJECT_CLASSES);
		}
		return objectClasses;
	}

	public EList<RelationClass> getRelationClasses() {
		if (relationClasses == null) {
			relationClasses = new EObjectContainmentEList<RelationClass>(RelationClass.class, this, MetamodelPackage.TEMPLATE__RELATION_CLASSES);
		}
		return relationClasses;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.TEMPLATE__PATH, oldPath, path));
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				return ((InternalEList<?>)getObjectClasses()).basicRemove(otherEnd, msgs);
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				return ((InternalEList<?>)getRelationClasses()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.TEMPLATE__REFERENCE:
				return getReference();
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				return getObjectClasses();
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				return getRelationClasses();
			case MetamodelPackage.TEMPLATE__PATH:
				return getPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.TEMPLATE__REFERENCE:
				setReference((EObject)newValue);
				return;
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				getObjectClasses().clear();
				getObjectClasses().addAll((Collection<? extends ObjectClass>)newValue);
				return;
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				getRelationClasses().clear();
				getRelationClasses().addAll((Collection<? extends RelationClass>)newValue);
				return;
			case MetamodelPackage.TEMPLATE__PATH:
				setPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelPackage.TEMPLATE__REFERENCE:
				setReference((EObject)null);
				return;
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				getObjectClasses().clear();
				return;
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				getRelationClasses().clear();
				return;
			case MetamodelPackage.TEMPLATE__PATH:
				setPath(PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.TEMPLATE__REFERENCE:
				return reference != null;
			case MetamodelPackage.TEMPLATE__OBJECT_CLASSES:
				return objectClasses != null && !objectClasses.isEmpty();
			case MetamodelPackage.TEMPLATE__RELATION_CLASSES:
				return relationClasses != null && !relationClasses.isEmpty();
			case MetamodelPackage.TEMPLATE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

		private void extractObjectClasses(IDiagramModel diagram) {
			EList<IDiagramModelObject> kids = diagram.getChildren();
			for (IDiagramModelObject kid : kids)
				extractDiagramElement((DiagramModelZentaObject) kid);
			
		}
	
			private void extractDiagramElement(DiagramModelZentaObject kid) {
				ObjectClass oc = MetamodelFactory.eINSTANCE
						.createObjectClass((BusinessObject) kid.getZentaElement(), this);
				getObjectClasses().add(oc);
				extractConnectionsForDiagramElement(kid);
				EList<IDiagramModelObject> myKids = kid.getChildren();
				for (IDiagramModelObject aKid : myKids)
					extractDiagramElement((DiagramModelZentaObject) aKid);
			}

				private void extractConnectionsForDiagramElement(
						DiagramModelZentaObject kid) {
					EList<IDiagramModelConnection> conns = kid.getSourceConnections();
					for (IDiagramModelConnection conn : conns)
						extractDiagramConnection(((DiagramModelZentaConnection)conn).getRelationship());
				}
			
					private void extractDiagramConnection(IRelationship iRelationship) {
						RelationClass rc = MetamodelFactory.eINSTANCE
								.createRelationClass((AssociationRelationship) iRelationship, this);
						this.getRelationClasses().add(rc);
					}

	public Metamodel getMetamodel() {
		return metamodel;
	}

	public ObjectClass getObjectClassReferencingElement(IZentaElement classTemplate) {
		for(ObjectClass oc : getObjectClasses())
			if(oc.getReference().equals(classTemplate))
				return oc;
		return null;
	}

	public RelationClass getRelationClassReferencingElement(IRelationship classTemplate) {
		for(RelationClass oc : getRelationClasses())
			if(oc.getReference() == classTemplate)
				return oc;
		return null;
	}

}