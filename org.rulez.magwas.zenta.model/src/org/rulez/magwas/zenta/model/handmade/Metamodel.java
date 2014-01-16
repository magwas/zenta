package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
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
				ITemplate template = ZentaFactory.eINSTANCE.
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
		for(ITemplate template : getTemplates()) {
			IDiagramModel dm = template.getDiagram();
			if(dm == null && template != this.builtinTemplate)
				throw new RuntimeException("template with no diagram ref");
			if(diagramModel.equals(dm))
				return (ITemplate) template;
		}
		return null;
	}

	@Override
	public ITemplate getTemplateFor(IDiagramModelComponent element) {
		IDiagramModel dm = element.getDiagramModel();
		return getTemplateFor(dm);
	}

	@Override
	public IBasicObject getBuiltinObjectClass() {
		return (IBasicObject) builtinTemplate.getRootObjectClass();
	}

	@Override
	public IBasicRelationship getBuiltinRelationClass() {
		return (IBasicRelationship) builtinTemplate.getRootRelationClass();
	}

	@Override
	public BuiltinTemplate getBuiltinTemplate() {
		return builtinTemplate;
	}


	@Override
	public List<IBasicObject> getObjectClasses() {
		List<IBasicObject> ret = new ArrayList<IBasicObject>();
		for(ITemplate template : getTemplates()) {
			ret.addAll((List<? extends IBasicObject>) template.getObjectClasses());
		}
		return ret;
	}

	@Override
	public List<IBasicRelationship> getRelationClasses() {
		List<IBasicRelationship> ret = new ArrayList<IBasicRelationship>();
		for(ITemplate template : getTemplates()) {
			ret.addAll((Collection<? extends IBasicRelationship>) template.getRelationClasses());
		}
		return ret;
	}

	@Override
	public Collection<IBasicRelationship> getRelationships(IBasicObject object) {
		return getRelationClasses();
	}

	@Override
	public IBasicObject getClassById(String id) {
		if(id == null)
			return null;
		ArrayList<IBasicObject> classlist = new ArrayList<IBasicObject>();
		classlist.addAll(getObjectClasses());
		classlist.addAll(getRelationClasses());
		for(IBasicObject klass : classlist) {
			if(id.equals(((IBasicObject)klass).getId()))
				return (IBasicObject) klass;
		}
		return null;
	}

	@Override
	public List<IBasicRelationship> getWeaklist() {
		return new ArrayList<IBasicRelationship>();//TODO getWeaklist
	}

	@Override
	public boolean isValidRelationship(IBasicObject element1,
			IBasicObject element2, IBasicRelationship relationshipClass) {
		return getRelationClasses().contains(relationshipClass);//TODO isValidRelationship
	}

	@Override
	public List<IBasicObject> getConnectorClasses() {
		return new ArrayList<IBasicObject>();
	}

	void handleNewTemplateElement(IDiagramModelComponent dmzc) {
		IDiagramModel dm = dmzc.getDiagramModel();
		ITemplate template = getTemplateFor(dm);
		if(null == template)
			return;
		IBasicObject element = (IBasicObject) ((IDiagramModelZentaObject) dmzc).getZentaElement();
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
		IBasicRelationship element =((IDiagramModelZentaConnection) dmzc).getRelationship();
		element.setTemplate(template);
	}

	public void processElementNameChange(IBasicObject element, String oldName, String newName) {
		createOcIfBecameDefining(element, oldName, newName);
	}

	public void createOcIfBecameDefining(IBasicObject element, String oldName,
			String newName) {
		boolean defining = elementBecameDefiningByNameChange(element, oldName, newName);
		if(defining) {
			createOCforElement(element);
		}
	}
		private boolean elementBecameDefiningByNameChange(IBasicObject element,
				String oldName, String newName) {
			return oldName.equals("") && (!newName.equals("")) && element.getPropertyNamed("name").size() == 0;
		}

	public void createOCforElement(IBasicObject element) {
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
		if(element.isRelation())
			setupEndAttributesForrelation((IBasicRelationship) element);
	}

	private void setupEndAttributesForrelation(IBasicRelationship element) {
		IBasicObject source = (IBasicObject) element.getSource();
		IBasicObject dest = (IBasicObject) element.getTarget();
		setupAttribute(element, source, dest);
		setupAttribute(element, dest, source);
	}

	public void setupAttribute(IBasicRelationship relation, IBasicObject obj1,
			IBasicObject obj2) {
		IAttribute att = IZentaFactory.eINSTANCE.createAttribute();
		att.setConnectedObject(obj2);
		att.setRelation(relation);
		obj1.getAttributes().add(att);
	}

	private IDiagramModelComponent getDefiningModelObjectFor(IBasicObject element) {
		EList<? extends IDiagramModelComponent> dmos;
		if(element instanceof IBasicRelationship)
			dmos = ((IBasicRelationship)element).getDiagConnections();
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
	
	public void processDiagramElementAppearanceChanged(
			IDiagramModelZentaObject dmzc, String key, String value) {
		IBasicObject element = (IBasicObject) dmzc.getZentaElement();
		if(element.isTemplate())
			element.addOrUpdateProperty(key, value);
	}

    public void processDiagramConnectionAppearanceChanged(
			IDiagramModelZentaConnection dmzc, String key, String value) {
		IBasicObject element = dmzc.getRelationship();
		if(element.isTemplate())
			element.addOrUpdateProperty(key, value);
		
	}

	@Override
	public IZentaModel getModel() {
		return model;
	}

	public void processChildRemovedFromDiagram(IDiagramModelComponent dmzc) {
		if(dmzc instanceof IDiagramModelZentaObject) {
			IDiagramModelZentaObject dmo = (IDiagramModelZentaObject) dmzc;
			IBasicObject element = (IBasicObject) dmo.getZentaElement();
			removeClassForObject(element);
		}
	}
	private void removeClassForObject(IBasicObject element) {
		if(!element.isTemplate())
			return;
		IMetamodel metamodel = element.getTemplate().getMetamodel();
		element.getTemplate().removeClass(element);
		reinstantiateObjectClassIfStillHaveTemplate(element, metamodel);
	}
		private void reinstantiateObjectClassIfStillHaveTemplate(IBasicObject element,
				IMetamodel metamodel) {
			EList<IDiagramModelZentaObject> diagObjects = element.getDiagObjects();
			for(IDiagramModelZentaObject dmoleft : diagObjects) {
				IDiagramModel dm = dmoleft.getDiagramModel();
				if(dm != null && dm.isTemplate()) {
					ITemplate template = metamodel.getTemplateFor(dm);
					template.getClasses().add(element);
					return;
				}
			}
		}

	public void processChildRemovedFromFolder(Object oldVal) {
		if(oldVal instanceof IBasicObject) {
			IBasicObject element = (IBasicObject) oldVal;
			removeFromDiagrams(element);
		}
	}
        private void removeFromDiagrams(IBasicObject element) {
            if(element instanceof IBasicRelationship)
                removeConnectionFromDiagrams(element);
            else
                removeObjectFromDiagrams(element);
        }
            private void removeObjectFromDiagrams(IBasicObject element) {
                for(IDiagramModelZentaObject dmo: element.getDiagObjects())
                    ((IDiagramModelContainer)dmo.eContainer()).getChildren().remove(dmo);
            }
            private void removeConnectionFromDiagrams(IBasicObject element) {
                for(IDiagramModelZentaConnection dmzc: ((IBasicRelationship)element).getDiagConnections())
                    ((IDiagramModelZentaObject)dmzc.eContainer()).getSourceConnections().remove(dmzc);
            }

	public void processConnectionRemovedFromDiagramElement(
			IDiagramModelComponent dmzc) {
		if(dmzc instanceof IDiagramModelZentaConnection) {
			IDiagramModelZentaConnection dmo = (IDiagramModelZentaConnection) dmzc;
			IBasicRelationship element = dmo.getRelationship();
			removeClassForConnection(element);
		}
	}
		private void removeClassForConnection(IBasicRelationship element) {
			if(!element.isTemplate())
				return;
			IMetamodel metamodel = element.getTemplate().getMetamodel();
			element.getTemplate().removeClass(element);
			reinstantiateRelationClassIfStillHaveTemplate(element, metamodel);
		}
			private void reinstantiateRelationClassIfStillHaveTemplate(IBasicRelationship element,
					IMetamodel metamodel) {
				EList<IDiagramModelZentaConnection> diagObjects = element.getDiagConnections();
				for(IDiagramModelZentaConnection dmoleft : diagObjects) {
					IDiagramModel dm = dmoleft.getDiagramModel();
					if(dm != null && dm.isTemplate()) {
						ITemplate template = metamodel.getTemplateFor(dm);
						template.getClasses().add(element);
						return;
					}
				}
			}

	public void updateFiguresFor(IBasicObject element) {
		for(IDiagramModelZentaObject dmo : element.getDiagObjects())
			dmo.refreshVisuals();
		for(IBasicObject kid : element.getChildren())
			updateFiguresFor(kid);
	}
}
