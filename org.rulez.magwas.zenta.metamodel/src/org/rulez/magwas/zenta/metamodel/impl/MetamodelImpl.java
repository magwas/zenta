package org.rulez.magwas.zenta.metamodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.MetamodelPackage;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.referencesModelObject;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;

public class MetamodelImpl extends EObjectImpl implements Metamodel {
		
	protected EList<Template> templates;
	private BuiltinTemplate builtinTemplate;
	private IZentaModel model;

	protected MetamodelImpl() {
		super();
		addBuiltinTemplate();
	}

	public MetamodelImpl(IZentaModel zentaModel) {
		model = zentaModel;
		addBuiltinTemplate();
		initializeMetaModel();
	    setAdapter();			
	}
		private void addBuiltinTemplate() {
			builtinTemplate = new BuiltinTemplate();
			this.getTemplates().add(builtinTemplate);
		}	
		private void initializeMetaModel() {
			EList<IDiagramModel> diagrams = model.getDiagramModels();
			for(IDiagramModel diagram : diagrams) {
				extractTemplate((IZentaDiagramModel)diagram);
			}
		}
			private void extractTemplate(IZentaDiagramModel diagram) {
				if (!isTemplate(diagram))
					return;
				Template template = MetamodelFactory.eINSTANCE.
						createTemplate(diagram, this);
				getTemplates().add(template);
			}
				private boolean isTemplate(IZentaDiagramModel diagram) {
					EList<IProperty> properties = diagram.getProperties();
					for (IProperty property : properties)
						if(property.getKey().equals("Template"))
							return true;
					return false;
				}
				
		private void setAdapter() {
			final MetamodelImpl self = this;
			EContentAdapter adapter = new EContentAdapter() {
		        public void notifyChanged(Notification notification) {
		          super.notifyChanged(notification);
		          NotificationProcessor.processNotification(self,notification);
		        }
		    };
		    model.eAdapters().add(adapter);
		}
		public void setAppearanceIfNeeded(IDiagramModelComponent dmzc) {
			IZentaElement me = getModelElementFor(dmzc);
			String ocId = null;
			if(null != me)
				ocId = me.getObjectClass();
			if(null != ocId) {
				setAppearanceByObjectClassId(ocId, dmzc);
			}
		}
			private IZentaElement getModelElementFor(
					IDiagramModelComponent dmzc) {
				IZentaElement me = null;
				if(dmzc instanceof IDiagramModelZentaObject)
					me = ((IDiagramModelZentaObject)dmzc).getZentaElement();
				if(dmzc instanceof IDiagramModelZentaConnection)
					me = ((IDiagramModelZentaConnection)dmzc).getRelationship();
				return me;
			}
			private void setAppearanceByObjectClassId(String ocId,
					IDiagramModelComponent dmzc) {
				referencesModelObject oc = getClassById(ocId);
				IIdentifier reference = oc.getReference();
				dmzc.setAppearanceBy((IZentaElement) reference);
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
	public Template getTemplateFor(IDiagramModelObject element) {
		IDiagramModel dm = element.getDiagramModel();
		return getTemplateFor(dm);
	}

	@Override
	public ObjectClass getBuiltinObjectClass() {
		return builtinTemplate.getObjectClasses().get(0);
	}

	@Override
	public RelationClass getBuiltinRelationClass() {
		return builtinTemplate.getRelationClasses().get(0);
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

	@Override
	public boolean hasRelationClassReferencing(IRelationship relation) {
		return null != getRelatioClassReferencing(relation);
	}

	@Override
	public boolean hasObjectClassReferencing(IZentaElement elementToAdd) {
		return null != getObjectClassReferencing(elementToAdd);
	}

	@Override
	public Template getTemplateForDiagram(IDiagramModel diagramModel) {
		Template template = getTemplateFor(diagramModel);
		return template;
	}

	@Override
	public List<ObjectClass> getObjectClasses() {
		List<ObjectClass> ret = new ArrayList<ObjectClass>();
		for(Template template : templates) {
			ret.addAll(template.getObjectClasses());
		}
		return ret;
	}

	@Override
	public List<RelationClass> getRelationClasses() {
		List<RelationClass> ret = new ArrayList<RelationClass>();
		for(Template template : templates) {
			ret.addAll(template.getRelationClasses());
		}
		return ret;
	}

	@Override
	public Collection<RelationClass> getRelationships(IZentaElement object) {
		return getRelationClasses();
	}

	@Override
	public referencesModelObject getClassById(String id) {
		if(id == null)
			return null;
		ArrayList<referencesModelObject> classlist = new ArrayList<referencesModelObject>();
		classlist.addAll(getObjectClasses());
		classlist.addAll(getRelationClasses());
		for(referencesModelObject klass : classlist) {
			if(id.equals(klass.getId()))
				return klass;
		}
		return null;
	}

	@Override
	public List<RelationClass> getWeaklist() {
		return new ArrayList<RelationClass>();//TODO
	}

	@Override
	public referencesModelObject getClassFor(IIdentifier rel) {
		IZentaElement ob = (IZentaElement) rel;
		return getClassById(ob.getObjectClass());
	}

	@Override
	public boolean isValidRelationship(IZentaElement element1,
			IZentaElement element2, RelationClass relationshipClass) {
		return getRelationClasses().contains(relationshipClass);//TODO
	}

	@Override
	public List<ObjectClass> getConnectorClasses() {
		return new ArrayList<ObjectClass>();
	}

	void handleNewTemplateElement(IDiagramModelComponent dmzc) {
		IDiagramModel dm = dmzc.getDiagramModel();
		Template template = getTemplateFor(dm);
		if(null == template)
			return;
		IZentaElement element = ((IDiagramModelZentaObject) dmzc).getZentaElement();
		createOCforElement(element);
	}

	void processChildrenAddedToDiagram(IDiagramModelComponent dmzc) {
		setAppearanceIfNeeded(dmzc);
		handleNewTemplateElement(dmzc);
	}

	public void processConnectionAddedToDiagramElement(
			IDiagramModelComponent dmzc) {
		if (null == dmzc)
			return;
		IDiagramModel dm = dmzc.getDiagramModel();
		Template template = getTemplateFor(dm);
		if(null == template)
			return;
		IRelationship element =((IDiagramModelZentaConnection) dmzc).getRelationship();
		MetamodelFactory.eINSTANCE.createRelationClass(element, template);
	}

	public void processElementNameChange(IZentaElement element, String oldName, String newName) {
		createOcIfBecameDefining(element, oldName, newName);
		element.setAppearanceForDefinedElements();
	}

	public void createOcIfBecameDefining(IZentaElement element, String oldName,
			String newName) {
		boolean defining = elementBecameDefiningByNameChange(element, oldName, newName);
		if(defining) {
			createOCforElement(element);
		}
	}

	public void createOCforElement(IZentaElement element) {
		Template template;
		IDiagramModelObject dmo;
		dmo = getDefiningModelObjectFor(element);
		if(dmo == null)
			return;
		template = getTemplateFor(dmo);
		if(null == template)
			return;
		template.createClassBy(element);
		element.setPropsFromDiagramObject(dmo);
	}

	private IDiagramModelObject getDefiningModelObjectFor(IZentaElement element) {
		List<IDiagramModel> containingDMs = element.getZentaModel().getDiagramModels();
		for(IDiagramModel dm : containingDMs)
			if(dm instanceof IZentaDiagramModel)
				if(((IZentaDiagramModel) dm).getPropertyNamed("Template").size() > 0 ) {
					IDiagramModelZentaObject diagelement = element.getElementFromDiagramModel(dm);
					if(null != diagelement)
						return diagelement;
				}
		return null;
	}

	private boolean elementBecameDefiningByNameChange(IZentaElement element,
			String oldName, String newName) {
		return oldName.equals("") && (!newName.equals("")) && element.getPropertyNamed("name").size() == 0;
	}

	public void processDiagramHasNewProperty(IZentaDiagramModel dm, IProperty prop) {
		Template template;
		if(prop.getKey().equals("Template")) {
			template = getTemplateFor(dm);
			if(null == template)
				extractTemplate(dm);
		}
		for(IDiagramModelObject dmo : dm.getChildren())
			handleNewTemplateElement(dmo);
	}
}
