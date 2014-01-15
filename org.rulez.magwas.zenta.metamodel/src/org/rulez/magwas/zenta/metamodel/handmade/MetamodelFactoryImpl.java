package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.HashMap;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rulez.magwas.zenta.metamodel.AttributeBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBaseFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.metamodel.handmade.AttributeImpl;
import org.rulez.magwas.zenta.metamodel.impl.MetamodelBaseFactoryImpl;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;

public class MetamodelFactoryImpl extends MetamodelBaseFactoryImpl implements MetamodelBaseFactory {

	private static HashMap<IZentaModel,MetamodelBase> registry = new HashMap<IZentaModel,MetamodelBase>();
	
	public static MetamodelBaseFactory init() {
		try {
			Registry packageRegistry = EPackage.Registry.INSTANCE;
			MetamodelBaseFactory theMetamodelFactory = (MetamodelBaseFactory)packageRegistry.getEFactory("http://magwas.rulez.org/zenta/metamodel"); 
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetamodelFactoryImpl();
	}

	public MetamodelFactoryImpl() {
		super();
	}

	@Override
	public MetamodelBase createMetamodel(IZentaModel zentaModel) {
		MetamodelBase mm = getMetamodelFor(zentaModel);
		if(null == mm)
			mm = new MetamodelImpl(zentaModel);
		registry.put(zentaModel, mm);
		return mm;
	}
	
	public MetamodelBase getMetamodelFor(IZentaModel model2) {
		return registry.get(model2);
	}


	public ITemplate createTemplate(IZentaDiagramModel reference, MetamodelBase metamodel) {
		TemplateImpl template = new TemplateImpl(reference, metamodel);
		return template;
	}

	public ObjectClass createObjectClass(IZentaElement reference, ITemplate template) {
		ObjectClass candidate = template.getObjectClassReferencingElement(reference);
		if(null != candidate)
			return candidate;
		if("".equals(getDefiningName(reference)))
			return null;
		ObjectClassImpl objectClass = new ObjectClassImpl(reference, template);
		template.getObjectClasses().add(objectClass);
		return objectClass;
	}

	public AttributeBase createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRelationClass createRelationClass() {
		AbstractRelationClassImpl relationClass = new RelationClassImpl();
		return relationClass;
	}

	public IRelationClass createRelationClass(IRelationship referenced, ITemplate template) {
		IRelationClass candidate = template.getRelationClassReferencingElement(referenced);
		if(null != candidate)
			return candidate;
		if("".equals(getDefiningName(referenced)))
			return null;
		AbstractRelationClassImpl relationClass = new RelationClassImpl(referenced, template);
		template.getRelationClasses().add(relationClass);
		return relationClass;
	}
	
	@Override
	public String getDefiningName(IIdentifier ref) {
		IProperty prop = getObjectClassProperty((IProperties) ref);
		if(null != prop)
			return prop.getValue();
		return ref.getName();
	}
		private IProperty getObjectClassProperty(IProperties ref) {
			for(IProperty prop: ref.getProperties())
				if("className".equals(prop.getKey()))
						return prop;
			return null;
		}

	@Override
	public MetamodelBase createMetamodel() {
		return null;
	}

	@Override
	public MetamodelBase getMetamodelFor(IZentaModelElement modelElement) {
		IZentaModel model = modelElement.getZentaModel();
		return getMetamodelFor(model);
	}

	@Override
	public ObjectClass createNoteClass() {
		return new NoteClass();
	}

	@Override
	public ObjectClass createGroupClass() {
		return new GroupClass();
	}

	@Override
	public IRelationClass createNoteConnectionClass() {
		return new NoteConnectionClass();
	}
}
