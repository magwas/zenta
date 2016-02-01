package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public abstract class ObjectClassMixin {


	public static void setAsTemplate(IBasicObject self, ITemplate template) {
		template.getClasses().add(self);
		self.setTemplate(template);
	}

	public static IMetamodel getMetamodel(IBasicObject self) {
		IMetamodel mm = IZentaFactory.eINSTANCE.getMetamodelFor(self);
		return (IMetamodel) Util.verifyNonNull(mm);
	}

	public static String getHelpHintTitle(IBasicObject self) {
		String name = self.getName();
		return Util.verifyNonNull(name);
	}

	public static String getHelpHintContent(IBasicObject self) {
		String doc = self.getDocumentation();
		List<IBasicObject> ancestry = self.getAncestry();
		List<String> ancestorNames = new ArrayList<String>();
		for( IBasicObject a : ancestry) {
			ancestorNames.add(a.getName());
		}
		String ancestryNames = StringUtils.join(ancestorNames, " => ");
		return createHelpString(Util.verifyNonNull(doc), ancestryNames);
	}

	
	private static String createHelpString(String doc, String ancestryNames) {
		return String.format("%s\nAncestry: %s\n", doc, ancestryNames);
	}

	public static List<IBasicObject> getAncestry(IBasicObject self) {
		ArrayList<IBasicObject> ancestry = new ArrayList<IBasicObject>();
		return self.getAncestry(ancestry);
	}

	public static List<IBasicObject> getAncestry(IBasicObject self, List<IBasicObject> ancestry) {
		ancestry.add(self);
		return self.getAncestor().getAncestry(ancestry);
	}

	public static IBasicObject getDefiningElement(IBasicObject self) {
		if(self.isTemplate())
			return self;
		IBasicObject ancestor = self.getAncestor();
		if(null == ancestor)
			if(self instanceof IBasicRelationship)
				return self.getMetamodel().getBuiltinRelationClass();
			else
				return self.getMetamodel().getBuiltinObjectClass();				
		return ancestor;
	}

	public static boolean isTemplate(IBasicObject self) {
		return null != self.getTemplate();
	}
	
    public static String getDefiningName(IBasicObject self) {
    	IProperty prop = getObjectClassProperty(self);
            if(null != prop)
                    return Util.verifyNonNull(prop.getValue());
            return Util.verifyNonNull(self.getName());
    }
            private static  IProperty getObjectClassProperty(IProperties self) {
                    for(IProperty prop: self.getProperties())
                            if("className".equals(prop.getKey()))
                                            return prop;
                    return null;
            }

	public static List<IAttribute> getAttributesRecursively(IBasicObject self) {
		NonNullList<IAttribute> atts = new NonNullArrayList<IAttribute>(self.getAttributes());
		IBasicObject ancie = self.getAncestor();
		if(ancie != null)
			atts.addAll(ancie.getAttributesRecursively());
		return atts;
	}

}