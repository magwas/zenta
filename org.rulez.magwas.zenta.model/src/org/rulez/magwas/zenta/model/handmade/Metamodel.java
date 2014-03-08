package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.jdt.annotation.Nullable;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.handmade.util.Util;
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
			for(IDiagramModel diagramo : diagrams) {
				IDiagramModel diagram = Util.verifyNonNull(diagramo);
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
		        public void notifyChanged(@Nullable Notification notificationo) {
		          Notification notification = Util.verifyNonNull(notificationo);
		          super.notifyChanged(notification);
		          NotificationProcessor.processNotification(self,notification);
		        }
		    };
		    model.eAdapters().add(adapter);
		}

	@Override
	public @Nullable ITemplate getTemplateFor(@Nullable IDiagramModel diagramModelo) {
		IDiagramModel diagramModel = Util.verifyNonNull(diagramModelo);
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
	public @Nullable ITemplate findTemplateFor(@Nullable IDiagramModelComponent elemento) {
		IDiagramModelComponent element = Util.verifyNonNull(elemento);
		IDiagramModel dm = element.findDiagramModel();
		if (null == dm)
			return null;
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
		return Util.verifyNonNull(builtinTemplate);
	}


	@Override
	public NonNullList<IBasicObject> getObjectClasses() {
		NonNullList<IBasicObject> ret = new NonNullArrayList<IBasicObject>();
		assert(getTemplates().contains(getBuiltinTemplate()));
		assert(getBuiltinTemplate().getObjectClasses().contains(getBuiltinObjectClass()));
		for(ITemplate template : getTemplates()) {
			ret.addAll((List<? extends IBasicObject>) template.getObjectClasses());
		}
		return ret;
	}

	@Override
	public NonNullList<IBasicRelationship> getRelationClasses() {
		NonNullList<IBasicRelationship> ret = new NonNullArrayList<IBasicRelationship>();
		for(ITemplate template : getTemplates()) {
			ret.addAll((Collection<? extends IBasicRelationship>) template.getRelationClasses());
		}
		return ret;
	}

	@Override
	public NonNullList<IBasicRelationship> getRelationships(IBasicObject object) {
		return getRelationClasses();
	}

	@Override
	public IBasicObject getClassById(String id) {
		ArrayList<IBasicObject> classlist = new ArrayList<IBasicObject>();
		classlist.addAll(getObjectClasses());
		classlist.addAll(getRelationClasses());
		for(IBasicObject klass : classlist) {
			if(id.equals(((IBasicObject)klass).getId()))
				return (IBasicObject) klass;
		}
		throw new NoSuchElementException();
	}

	@Override
	public NonNullList<IBasicRelationship> getWeaklist() {
		return new NonNullArrayList<IBasicRelationship>();//TODO getWeaklist
	}

	@Override
	public boolean isValidRelationship(IBasicObject element1,
			IBasicObject element2, IBasicRelationship relationshipClass) {
		return getRelationClasses().contains(relationshipClass);//TODO isValidRelationship
	}

	@Override
	public NonNullList<IBasicObject> getConnectorClasses() {
		return new NonNullArrayList<IBasicObject>();
	}

	void handleNewTemplateElement(IDiagramModelComponent dmzc) {
		IDiagramModel dm = dmzc.getDiagramModel();
		ITemplate template = getTemplateFor(dm);
		if(null == template)
			return;
		IBasicObject elemento = (IBasicObject) ((IDiagramModelZentaObject) dmzc).getZentaElement();
		IBasicObject element = Util.verifyNonNull(elemento);
		createOCforElement(element);
	}

	void processChildAddedToDiagram(IDiagramModelComponent dmzc) {
		handleNewTemplateElement(dmzc);
	}

	public void processConnectionAddedToDiagramElement(
			IDiagramModelComponent dmzc) {
		IDiagramModel dm = dmzc.getDiagramModel();
		ITemplate template = getTemplateFor(dm);
		if(null == template)
			return;
		IBasicRelationship element =((IDiagramModelZentaConnection) dmzc).getRelationship();
		if(!"".equals(element.getDefiningName()))
			element.setAsTemplate(template);
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
		dmo = findDefiningModelObjectFor(element);
		if(dmo == null)
			return;
		template = findTemplateFor(dmo);
		if(null == template)
			return;
		element.setAsTemplate(template);
		element.setPropsFromDiagramObject(dmo);
	}

	private @Nullable IDiagramModelComponent findDefiningModelObjectFor(IBasicObject element) {
		EList<? extends IDiagramModelComponent> dmos;
		dmos = element.getDiagComponents();
		for(IDiagramModelComponent dmo : dmos) {
			IDiagramModel dia = dmo.findDiagramModel();
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
		for(IDiagramModelObject dmoo : dm.getChildren()) {
			IDiagramModelObject dmo = Util.verifyNonNull(dmoo);
			handleNewTemplateElement(dmo);
		}
	}

	public void processPropertyChange(IProperty prop, String value) {
		if(prop.eContainer() instanceof IZentaDiagramModel && "Template".equals(value)) {
			IZentaDiagramModel container = (IZentaDiagramModel) prop.eContainer();
			processDiagramHasNewProperty(Util.verifyNonNull(container), prop);
		}
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
		return Util.verifyNonNull(model);
	}

	public void processChildRemovedFromDiagram(IDiagramModelComponent dmzc) {
		if(dmzc instanceof IDiagramModelZentaObject) {
			IDiagramModelZentaObject dmo = (IDiagramModelZentaObject) dmzc;
			IBasicObject element = (IBasicObject) dmo.getZentaElement();
			removeClassForObject(Util.verifyNonNull(element));
		}
	}
	private void removeClassForObject(IBasicObject element) {
		if(!element.isTemplate())
			return;
		IMetamodel metamodel = element.getTemplate().getMetamodel();
		element.getTemplate().removeClass(element);
		reinstantiateObjectClassIfStillHaveTemplate(element, Util.verifyNonNull(metamodel));
	}
		private void reinstantiateObjectClassIfStillHaveTemplate(IBasicObject element,
				IMetamodel metamodel) {
			@SuppressWarnings("unchecked")
			EList<IDiagramModelZentaObject> diagObjects = (EList<IDiagramModelZentaObject>) element.getDiagComponents();
			for(IDiagramModelZentaObject dmoleft : diagObjects) {
				IDiagramModel dm = dmoleft.findDiagramModel();
				if(dm != null && dm.isTemplate()) {
					ITemplate template = metamodel.getTemplateFor(dm);
					template.getClasses().add(element);
					return;
				}
			}
		}

	public void processConnectionRemovedFromDiagramElement(
			IDiagramModelComponent dmzc) {
		if(dmzc instanceof IDiagramModelZentaConnection) {
			IDiagramModelZentaConnection dmo = (IDiagramModelZentaConnection) dmzc;
			IBasicRelationship element = dmo.getRelationship();
			removeClassForConnection(Util.verifyNonNull(element));
		}
	}
		private void removeClassForConnection(IBasicRelationship element) {
			if(!element.isTemplate())
				return;
			IMetamodel metamodel = element.getTemplate().getMetamodel();
			element.getTemplate().removeClass(element);
			reinstantiateRelationClassIfStillHaveTemplate(element, Util.verifyNonNull(metamodel));
		}
			private void reinstantiateRelationClassIfStillHaveTemplate(IBasicRelationship element,
					IMetamodel metamodel) {
				@SuppressWarnings("unchecked")
				EList<IDiagramModelZentaConnection> diagObjects = (EList<IDiagramModelZentaConnection>) element.getDiagComponents();
				for(IDiagramModelZentaConnection dmoleft : diagObjects) {
					IDiagramModel dm = dmoleft.findDiagramModel();
					if(dm != null && dm.isTemplate()) {
						ITemplate template = metamodel.getTemplateFor(dm);
						template.getClasses().add(element);
						return;
					}
				}
			}

	public void updateFiguresFor(IBasicObject element) {
		for(IBasicObject kid : element.getChildren())
			updateFiguresFor(Util.verifyNonNull(kid));
	}
}
