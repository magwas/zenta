package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IMetamodelFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.impl.MetamodelBase;

public class Metamodel extends MetamodelBase implements IMetamodel {
		
	private BuiltinTemplate builtinTemplate;
	private IZentaModel model;

	protected Metamodel() {
		super();
		addBuiltinTemplate();
	}

	public Metamodel(IZentaModel zentaModel) {
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
				ITemplate template = MetamodelFactory.eINSTANCE.
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
			final Metamodel self = this;
			EContentAdapter adapter = new EContentAdapter() {
		        public void notifyChanged(Notification notification) {
		          super.notifyChanged(notification);
		          NotificationProcessor.processNotification(self,notification);
		        }
		    };
		    model.eAdapters().add(adapter);
		}

	@Override
	public ITemplate getTemplateFor(IDiagramModel diagramModel) {
		for(ITemplate template : getTemplates())
			if(diagramModel.equals(template.getReference()))
				return (ITemplate) template;
		return null;
	}

	@Override
	public ITemplate getTemplateFor(IDiagramModelComponent element) {
		IDiagramModel dm = element.getDiagramModel();
		return getTemplateFor(dm);
	}

	@Override
	public IObjectClass getBuiltinObjectClass() {
		return (IObjectClass) builtinTemplate.getObjectClasses().get(0);
	}

	@Override
	public IRelationClass getBuiltinRelationClass() {
		return (IRelationClass) builtinTemplate.getRelationClasses().get(0);
	}

	@Override
	public BuiltinTemplate getBuiltinTemplate() {
		return builtinTemplate;
	}

	@Override
	public IObjectClass getObjectClassReferencing(
			IZentaElement element) {
		return (IObjectClass) getClassById(element.getId());
	}

	@Override
	public IRelationClass getRelationClassReferencing(IRelationship relation) {
		return (IRelationClass) getClassById(relation.getId());
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
	public List<IObjectClass> getObjectClasses() {
		List<IObjectClass> ret = new ArrayList<IObjectClass>();
		for(ITemplate template : getTemplates()) {
			ret.addAll((EList<? extends IObjectClass>) template.getObjectClasses());
		}
		return ret;
	}

	@Override
	public List<IRelationClass> getRelationClasses() {
		List<IRelationClass> ret = new ArrayList<IRelationClass>();
		for(ITemplate template : getTemplates()) {
			ret.addAll((Collection<? extends IRelationClass>) template.getRelationClasses());
		}
		return ret;
	}

	@Override
	public Collection<IRelationClass> getRelationships(IZentaElement object) {
		return getRelationClasses();
	}

	@Override
	public IReferencesModelObject getClassById(String id) {
		if(id == null)
			return null;
		ArrayList<IReferencesModelObject> classlist = new ArrayList<IReferencesModelObject>();
		classlist.addAll(getObjectClasses());
		classlist.addAll(getRelationClasses());
		for(IReferencesModelObject klass : classlist) {
			if(id.equals(((IReferencesModelObject)klass).getId()))
				return (IReferencesModelObject) klass;
		}
		return null;
	}

	@Override
	public List<IRelationClass> getWeaklist() {
		return new ArrayList<IRelationClass>();//TODO getWeaklist
	}

	@Override
	public IReferencesModelObject getClassReferencing(IIdentifier rel) {
		return getClassById(rel.getId());
	}
    @Override
    public IReferencesModelObject getClassOf(IIdentifier rel) {
    	if(this.isDefining(rel))
    		return getClassById(rel.getId());
        return getClassById(rel.getObjectClass());
    }

	@Override
	public boolean isValidRelationship(IZentaElement element1,
			IZentaElement element2, IRelationClass relationshipClass) {
		return getRelationClasses().contains(relationshipClass);//TODO isValidRelationship
	}

	@Override
	public List<IObjectClass> getConnectorClasses() {
		return new ArrayList<IObjectClass>();
	}

	void handleNewTemplateElement(IDiagramModelComponent dmzc) {
		IDiagramModel dm = dmzc.getDiagramModel();
		ITemplate template = getTemplateFor(dm);
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
		ITemplate template = getTemplateFor(dm);
		if(null == template)
			return;
		IRelationship element =((IDiagramModelZentaConnection) dmzc).getRelationship();
		IMetamodelFactory.eINSTANCE.createRelationClass(element, template);
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
		ITemplate template;
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
			if(dia.isTemplate())
				return dmo;
		}
		return null;
	}

	public void processDiagramHasNewProperty(IZentaDiagramModel dm, IProperty prop) {
		ITemplate template;
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
		IReferencesModelObject oc;
		if(element instanceof IRelationship)
			oc = getRelationClassReferencing((IRelationship) element);
		else
			oc = getObjectClassReferencing(element);
		if(null == oc)
			return;
		String definingName = IMetamodelFactory.eINSTANCE.getDefiningName(element);
		oc.setName(definingName);
	}

	public void processDiagramElementAppearanceChanged(
			IDiagramModelZentaObject dmzc, String key, String value) {
		IZentaElement element = dmzc.getZentaElement();
		if(isDefining(element))
			element.addOrUpdateProperty(key, value);
	}

	private boolean isDefining(IIdentifier element) {
	    return null != getClassReferencing(element);
    }

    public void processDiagramConnectionAppearanceChanged(
			IDiagramModelZentaConnection dmzc, String key, String value) {
		IZentaElement element = dmzc.getRelationship();
		if(isDefining(element))
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
			removeFromDiagrams(element);
			removeObjectClassDefinedBy(element);
		}
	}
        private void removeObjectClassDefinedBy(IZentaElement element) {
            IReferencesModelObject oc = this.getClassReferencing(element);
            if(null != oc)
            	oc.getTemplate().removeClass(oc);
        }
        private void removeFromDiagrams(IZentaElement element) {
            if(element instanceof IRelationship)
                removeConnectionFromDiagrams(element);
            else
                removeObjectFromDiagrams(element);
        }
            private void removeObjectFromDiagrams(IZentaElement element) {
                for(IDiagramModelZentaObject dmo: element.getDiagObjects())
                    ((IDiagramModelContainer)dmo.eContainer()).getChildren().remove(dmo);
            }
            private void removeConnectionFromDiagrams(IZentaElement element) {
                for(IDiagramModelZentaConnection dmzc: ((IRelationship)element).getDiagConnections())
                    ((IDiagramModelZentaObject)dmzc.eContainer()).getSourceConnections().remove(dmzc);
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
			IReferencesModelObject oc = this.getClassReferencing(element);
			if(null == oc || null == oc.getTemplate())
				return;
			oc.getTemplate().removeClass(oc);
		}
	}
}
