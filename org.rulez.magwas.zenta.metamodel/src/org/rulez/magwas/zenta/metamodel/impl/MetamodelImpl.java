package org.rulez.magwas.zenta.metamodel.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
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
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class MetamodelImpl extends EObjectImpl implements Metamodel {

	protected EList<Template> templates;
	private BuiltinTemplate builtinTemplate;
	private IZentaModel model;

	protected MetamodelImpl() {
		super();
		addBuiltinTemplate();
	}

	private void addBuiltinTemplate() {
		builtinTemplate = new BuiltinTemplate();
		this.getTemplates().add(builtinTemplate);
	}
	
	public MetamodelImpl(IZentaModel zentaModel) {
		model = zentaModel;
		addBuiltinTemplate();
		initializeMetaModel();
	    setAdapter();			
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
			EContentAdapter adapter = new EContentAdapter() {
		        public void notifyChanged(Notification notification) {
		          super.notifyChanged(notification);
		          processNotification(notification);
		        }
		    };
		    model.eAdapters().add(adapter);
		}
			private void processNotification(Notification notification) {
				EObject lastObject;
				lastObject = (EObject) notification.getNotifier();
				System.out.printf("notification for \n\t%s\n\t%s\n", notification.getNotifier(),notification.getFeature() );
				if(lastObject instanceof IZentaDiagramModel) {
					processDiagramModelChange(notification);
				} else if (lastObject instanceof IDiagramModelZentaObject) {
					processDiagramModelObjectChange(notification);
				} else if (lastObject instanceof IZentaElement) {
					processElementChange(notification);
				}
			}
				private void processDiagramModelObjectChange(Notification notification) {
					int feature = notification.getFeatureID(IDiagramModelZentaObject.class);
					if(feature == IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__SOURCE_CONNECTIONS) {
						IDiagramModelComponent dmzc = (IDiagramModelComponent) notification.getNewValue();
						if (null == dmzc)
							return;
						IDiagramModel dm = dmzc.getDiagramModel();
						Template template = getTemplateFor(dm);
						if(null == template)
							return;
						IRelationship element =((IDiagramModelZentaConnection) dmzc).getRelationship();
						MetamodelFactory.eINSTANCE.createRelationClass(element, template);
					}
				}
				private void processDiagramModelChange(Notification notification) {
					int feature = notification.getFeatureID(IZentaDiagramModel.class);
					if(feature == IZentaPackage.ZENTA_DIAGRAM_MODEL__CHILDREN) {
						IDiagramModelComponent dmzc = (IDiagramModelComponent) notification.getNewValue();
						if(null == dmzc)
							return;
						IDiagramModel dm = dmzc.getDiagramModel();
						Template template = getTemplateFor(dm);
						if(null == template)
							return;
						IZentaElement element = ((IDiagramModelZentaObject) dmzc).getZentaElement();
						MetamodelFactory.eINSTANCE.createObjectClass(element, template);
					}
				}
				private void processElementChange(Notification notification) {
					int feature = notification.getFeatureID(IZentaElement.class);
					if(feature == IZentaPackage.NAMEABLE__OBJECT_CLASS) {
						IZentaElement element = (IZentaElement) notification.getFeature();
						element.setAppearanceForDefinedElements();

					}
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
}
