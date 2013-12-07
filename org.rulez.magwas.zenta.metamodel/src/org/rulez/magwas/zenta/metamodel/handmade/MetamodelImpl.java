package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.TemplateBase;
import org.rulez.magwas.zenta.metamodel.impl.MetamodelBaseImpl;
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
import org.rulez.magwas.zenta.model.UnTestedException;

public class MetamodelImpl extends MetamodelBaseImpl implements Metamodel {
		
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
			builtinTemplate = new BuiltinTemplate(this);
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

	@Override
	public Template getTemplateFor(IDiagramModel diagramModel) {
		for(TemplateBase template : getTemplates())
			if(diagramModel.equals(template.getReference()))
				return (Template) template;
		return null;
	}

	@Override
	public Template getTemplateFor(IDiagramModelComponent element) {
		IDiagramModel dm = element.getDiagramModel();
		return getTemplateFor(dm);
	}

	@Override
	public ObjectClass getBuiltinObjectClass() {
		return (ObjectClass) builtinTemplate.getObjectClasses().get(0);
	}

	@Override
	public RelationClass getBuiltinRelationClass() {
		return (RelationClass) builtinTemplate.getRelationClasses().get(0);
	}

	@Override
	public BuiltinTemplate getBuiltinTemplate() {
		return builtinTemplate;
	}

	@Override
	public ObjectClass getObjectClassReferencing(
			IZentaElement element) {
		return (ObjectClass) getClassById(element.getId());
	}

	@Override
	public RelationClass getRelationClassReferencing(IRelationship relation) {
		return (RelationClass) getClassById(relation.getId());
	}

	@Override
	public boolean hasRelationClassReferencing(IRelationship relation) {
		return null != getRelationClassReferencing(relation);
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

	@SuppressWarnings("unchecked")
	@Override
	public List<ObjectClass> getObjectClasses() {
		List<ObjectClass> ret = new ArrayList<ObjectClass>();
		for(TemplateBase template : getTemplates()) {
			ret.addAll((EList<? extends ObjectClass>) template.getObjectClasses());
		}
		return ret;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<RelationClass> getRelationClasses() {
		List<RelationClass> ret = new ArrayList<RelationClass>();
		for(TemplateBase template : getTemplates()) {
			ret.addAll((Collection<? extends RelationClass>) template.getRelationClasses());
		}
		return ret;
	}

	@Override
	public Collection<RelationClass> getRelationships(IZentaElement object) {
		return getRelationClasses();
	}

	@Override
	public ReferencesModelObject getClassById(String id) {
		if(id == null)
			return null;
		ArrayList<ReferencesModelObjectBase> classlist = new ArrayList<ReferencesModelObjectBase>();
		classlist.addAll(getObjectClasses());
		classlist.addAll(getRelationClasses());
		for(ReferencesModelObjectBase klass : classlist) {
			if(id.equals(((ReferencesModelObject)klass).getId()))
				return (ReferencesModelObject) klass;
		}
		return null;
	}

	@Override
	public List<RelationClass> getWeaklist() {
		return new ArrayList<RelationClass>();//TODO getWeaklist
	}

	@Override
	public ReferencesModelObjectBase getClassFor(IIdentifier rel) {
		return getClassById(rel.getObjectClass());
	}

	@Override
	public boolean isValidRelationship(IZentaElement element1,
			IZentaElement element2, RelationClass relationshipClass) {
		return getRelationClasses().contains(relationshipClass);//TODO isValidRelationship
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

	void processChildAddedToDiagram(IDiagramModelComponent dmzc) {
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
		handleNameChange(element);
	}

	public void createOcIfBecameDefining(IZentaElement element, String oldName,
			String newName) {
		boolean defining = elementBecameDefiningByNameChange(element, oldName, newName);
		if(defining) {
			createOCforElement(element);
		}
	}
		private boolean elementBecameDefiningByNameChange(IZentaElement element,
				String oldName, String newName) {
			return oldName.equals("") && (!newName.equals("")) && element.getPropertyNamed("name").size() == 0;
		}

	public void createOCforElement(IZentaElement element) {
		Template template;
		IDiagramModelComponent dmo;
		dmo = getDefiningModelObjectFor(element);
		if(dmo == null)
			return;
		template = getTemplateFor(dmo);
		if(null == template)
			return;
		template.createClassBy(element);
		element.setPropsFromDiagramObject(dmo);
	}

	private IDiagramModelComponent getDefiningModelObjectFor(IZentaElement element) {
		EList<? extends IDiagramModelComponent> dmos;
		if(element instanceof IRelationship)
			dmos = ((IRelationship)element).getDiagConnections();
		else
			dmos = element.getDiagObjects();
		for(IDiagramModelComponent dmo : dmos) {
			IDiagramModel dia = dmo.getDiagramModel();
			if(null == dia)
				return null;
			if(isTemplateDiagram(dia))
				return dmo;
		}
		return null;
	}
		private boolean isTemplateDiagram(IDiagramModel dm) {
			return ((IZentaDiagramModel) dm).getPropertyNamed("Template").size() > 0;
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

	public void processPropertyChange(IProperty prop, String value) {
		if(prop.eContainer() instanceof IZentaDiagramModel && "Template".equals(value))
			processDiagramHasNewProperty((IZentaDiagramModel) prop.eContainer(), prop);
	}

	public void processElementObjectClassChange(IZentaElement element) {
		handleNameChange(element);
	}
	
	private void handleNameChange(IZentaElement element) {
		ReferencesModelObject oc;
		if(element instanceof IRelationship)
			oc = getRelationClassReferencing((IRelationship) element);
		else
			oc = getObjectClassReferencing(element);
		if(null == oc)
			return;
		String definingName = MetamodelFactory.eINSTANCE.getDefiningName(element);
		oc.setName(definingName);
	}

	public void processDiagramElementAppearanceChanged(
			IDiagramModelZentaObject dmzc, String key, String value) {
		IZentaElement element = dmzc.getZentaElement();
		if(element.isDefining())
			element.addOrUpdateProperty(key, value);
	}

	public void processDiagramConnectionAppearanceChanged(
			IDiagramModelZentaConnection dmzc, String key, String value) {
		IZentaElement element = dmzc.getRelationship();
		if(element.isDefining())
			element.addOrUpdateProperty(key, value);
		
	}

	@Override
	public IZentaModel getModel() {
		return model;
	}

	public void processChildRemovedFromDiagram(IDiagramModelComponent dmzc) {
		if(dmzc instanceof IDiagramModelZentaObject) {
			IDiagramModelZentaObject dmo = (IDiagramModelZentaObject) dmzc;
			IZentaElement element = dmo.getZentaElement();
			removeClassFor(element);
		}
	}

	public void processChildRemovedFromFolder(Object oldVal) {
		if(oldVal instanceof IZentaElement) {
			IZentaElement element = (IZentaElement) oldVal;
			ReferencesModelObjectBase oc = this.getClassFor(element);
			if(null != oc)
				oc.getTemplate().removeClass(oc);
		}
	}

	public void processConnectionRemovedFromDiagramElement(
			IDiagramModelComponent dmzc) {
		if(dmzc instanceof IDiagramModelZentaConnection) {
			IDiagramModelZentaConnection dmo = (IDiagramModelZentaConnection) dmzc;
			IZentaElement element = dmo.getRelationship();
			removeClassFor(element);
		}
	}

	private void removeClassFor(IZentaElement element) {
		IDiagramModelComponent otherDMO = getDefiningModelObjectFor(element);
		if (null == otherDMO) {
			ReferencesModelObjectBase oc = this.getClassFor(element);
			oc.getTemplate().removeClass(oc);
		}
	}
}
