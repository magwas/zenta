package org.rulez.magwas.zenta.model.handmade;

import java.util.HashMap;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.handmade.Attribute;
import org.rulez.magwas.zenta.model.impl.ZentaFactoryBase;

public class ZentaFactory extends ZentaFactoryBase implements IZentaFactory {

	private static HashMap<IZentaModel,IMetamodel> registry = new HashMap<IZentaModel,IMetamodel>();
	
	public static IZentaFactory init() {
		try {
			Registry packageRegistry = EPackage.Registry.INSTANCE;
			IZentaFactory theMetamodelFactory = (IZentaFactory)packageRegistry.getEFactory("http://magwas.rulez.org/zenta/metamodel"); 
			if (theMetamodelFactory != null) {
				return theMetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZentaFactory();
	}

	public ZentaFactory() {
		super();
	}

	@Override
	public IMetamodel createMetamodel(IZentaModel zentaModel) {
		IMetamodel mm = getMetamodelFor(zentaModel);
		if(null == mm)
			mm = new Metamodel(zentaModel);
		registry.put(zentaModel, mm);
		return mm;
	}
	
	@Override
	public IMetamodel getMetamodelFor(IZentaModel model2) {
		return registry.get(model2);
	}


	@Override
	public ITemplate createTemplate(IZentaDiagramModel reference, IMetamodel metamodel) {
		Template template = new Template(reference, metamodel);
		return template;
	}

	@Override
	public IObjectClass createObjectClass(IZentaElement reference, ITemplate template) {
		IObjectClass candidate = template.getObjectClassReferencingElement(reference);
		if(null != candidate)
			return candidate;
		if("".equals(getDefiningName(reference)))
			return null;
		ObjectClass objectClass = new ObjectClass(reference, template);
		template.getClasses().add(objectClass);
		return objectClass;
	}

	@Override
	public IAttribute createAttribute() {
		Attribute attribute = new Attribute();
		return attribute;
	}

	@Override
	public IRelationClass createRelationClass(IRelationship referenced, ITemplate template) {
		IRelationClass candidate = template.getRelationClassReferencingElement(referenced);
		if(null != candidate)
			return candidate;
		if("".equals(getDefiningName(referenced)))
			return null;
		IRelationClass relationClass = new RelationClass(referenced, template);
		template.getClasses().add(relationClass);
		System.out.printf("rc=%s\nt=%s\n", relationClass, relationClass.getTemplate());
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
	public IMetamodel createMetamodel() {
		return null;
	}

	@Override
	public IMetamodel getMetamodelFor(IZentaModelElement modelElement) {
		IZentaModel model = modelElement.getZentaModel();
		return getMetamodelFor(model);
	}

	@Override
	public IObjectClass createNoteClass() {
		return new NoteClass();
	}

	@Override
	public IObjectClass createGroupClass() {
		return new GroupClass();
	}

	@Override
	public IRelationClass createNoteConnectionClass() {
		return new NoteConnectionClass();
	}
}
