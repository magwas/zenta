package org.rulez.magwas.zenta.metamodel.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

public class MetamodelImpl extends EObjectImpl implements Metamodel {

	protected EList<Template> templates;
	private BuiltinTemplate builtinTemplate;

	protected MetamodelImpl() {
		super();
		builtinTemplate = new BuiltinTemplate();
		this.getTemplates().add(builtinTemplate);
	}

	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.METAMODEL;
	}

	public EList<Template> getTemplates() {
		if (templates == null) {
			templates = new EObjectContainmentEList<Template>(Template.class, this, MetamodelPackage.METAMODEL__TEMPLATES);
		}
		return templates;
	}

	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				return ((InternalEList<?>)getTemplates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				return getTemplates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				getTemplates().clear();
				getTemplates().addAll((Collection<? extends Template>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				getTemplates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetamodelPackage.METAMODEL__TEMPLATES:
				return templates != null && !templates.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public Template getTemplateFor(IDiagramModel diagramModel) {
		for(Template template : getTemplates())
			if(diagramModel.equals(template.getReference()))
				return template;
		return null;
	}

	@Override
	public ObjectClass getBuiltinObjectClass() {
		return this.getTemplates().get(0).getObjectClasses().get(0);
	}

	@Override
	public RelationClass getBuiltinRelationClass() {
		return this.getTemplates().get(0).getRelationClasses().get(0);
	}

	@Override
	public BuiltinTemplate getBuiltinTemplate() {
		return builtinTemplate;
	}

	@Override
	public ObjectClass getObjectClassReferencing(
			IZentaElement element) {
		EList<Template> templates = getTemplates();
		for(Template template : templates) {
			if(template.getReference() != null) {
				ObjectClass foundOC = template.getObjectClassReferencingElement(element);
				if(null != foundOC)
					return foundOC;
			}
		}
		return null;
	}

	@Override
	public RelationClass getRelatioClassReferencing(IRelationship relation) {
		EList<Template> templates = getTemplates();
		for(Template template : templates) {
			if(template.getReference() != null)
				if(null != template.getRelationClassReferencingElement((IRelationship) relation))
					return template.getRelationClassReferencingElement((IRelationship) relation);
		}
		return null;
	}
}
