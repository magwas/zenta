package org.rulez.magwas.zenta.model.handmade;

import java.util.HashMap;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.IZentaModelElement;
import org.rulez.magwas.zenta.model.handmade.Attribute;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.ZentaFactoryBase;
import org.rulez.magwas.zenta.model.util.LogUtil;

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
			LogUtil.logException(exception);
		}
		return new ZentaFactory();
	}

	public ZentaFactory() {
		super();
	}

	@Override
	public IMetamodel getMetamodelFor(IZentaModel zentaModel) {
		IMetamodel mm = findMetamodelFor(zentaModel);
		if(null == mm)
			mm = new Metamodel(zentaModel);
		registry.put(zentaModel, mm);
		return mm;
	}
	
	@Override
	public IMetamodel getMetamodelFor(IZentaModelElement modelElement) {
		IZentaModel model = modelElement.getZentaModel();
		IZentaModel m = Util.verifyNonNull(model);
		return getMetamodelFor(m);
	}

	@Override
	
	public IMetamodel findMetamodelFor(IZentaModel model2) {
		return registry.get(model2);
	}

	@Override
	public ITemplate createTemplate(IZentaDiagramModel reference, IMetamodel metamodel) {
		Template template = new Template(reference, metamodel);
		return template;
	}


	@Override
	public IAttribute createAttribute() {
		Attribute attribute = new Attribute();
		return attribute;
	}

	@Override
	public String getDefiningName(IIdentifier ref) {
		IProperty prop = getObjectClassProperty((IProperties) ref);
		if(null != prop)
			return Util.verifyNonNull(prop.getValue());
		return Util.verifyNonNull(ref.getName());
	}
		private  IProperty getObjectClassProperty(IProperties ref) {
			for(IProperty prop: ref.getProperties())
				if("className".equals(prop.getKey()))
						return prop;
			return null;
		}

	@Override
	public IMetamodel createMetamodel() {
		throw new AssertionError();
	}

}
