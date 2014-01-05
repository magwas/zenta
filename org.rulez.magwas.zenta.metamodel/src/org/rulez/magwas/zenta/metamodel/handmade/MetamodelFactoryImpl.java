package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.HashMap;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
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

public class MetamodelFactoryImpl extends MetamodelBaseFactoryImpl implements MetamodelFactory {

	private static HashMap<IZentaModel,Metamodel> registry = new HashMap<IZentaModel,Metamodel>();
	
	public static MetamodelFactory init() {
		try {
			Registry packageRegistry = EPackage.Registry.INSTANCE;
			MetamodelFactory theMetamodelFactory = (MetamodelFactory)packageRegistry.getEFactory("http://magwas.rulez.org/zenta/metamodel"); 
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
	public Metamodel createMetamodel(IZentaModel zentaModel) {
		Metamodel mm = getMetamodelFor(zentaModel);
		if(null == mm)
			mm = new MetamodelImpl(zentaModel);
		registry.put(zentaModel, mm);
		return mm;
	}
	
	public Metamodel getMetamodelFor(IZentaModel model2) {
		return registry.get(model2);
	}


	public Template createTemplate(IZentaDiagramModel reference, Metamodel metamodel) {
		TemplateImpl template = new TemplateImpl(reference, metamodel);
		return template;
	}

	public ObjectClass createObjectClass(IZentaElement reference, Template template) {
		ObjectClass candidate = template.getObjectClassReferencingElement(reference);
		if(null != candidate)
			return candidate;
		if("".equals(getDefiningName(reference)))
			return null;
		ObjectClassImpl objectClass = new ObjectClassImpl(reference, template);
		template.getObjectClasses().add(objectClass);
		return objectClass;
	}

	public Attribute createAttribute() {
		AttributeImpl attribute = new AttributeImpl();
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationClass createRelationClass() {
		AbstractRelationClassImpl relationClass = new RelationClassImpl();
		return relationClass;
	}

	public RelationClass createRelationClass(IRelationship referenced, Template template) {
		RelationClass candidate = template.getRelationClassReferencingElement(referenced);
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
	public Metamodel createMetamodel() {
		return null;
	}

	@Override
	public Metamodel getMetamodelFor(IZentaModelElement modelElement) {
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
	public RelationClass createNoteConnectionClass() {
		return new NoteConnectionClass();
	}
}
