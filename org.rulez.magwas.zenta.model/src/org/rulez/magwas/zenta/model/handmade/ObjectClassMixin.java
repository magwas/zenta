package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.util.StringUtils;

public abstract class ObjectClassMixin {


	public static void setAsTemplate(IBasicObject self, ITemplate template) {
		template.getClasses().add(self);
		self.setTemplate(template);
	}

	public static IMetamodel getMetamodel(IBasicObject self) {
		return (IMetamodel) self.getTemplate().getMetamodel();
	}

	public static String getHelpHintTitle(IBasicObject self) {
		return self.getName();
	}

	public static String getHelpHintContent(IBasicObject self) {
		String doc = self.getDocumentation();
		List<IBasicObject> ancestry = self.getAncestry();
		List<String> ancestorNames = new ArrayList<String>();
		for( IBasicObject a : ancestry) {
			ancestorNames.add(a.getName());
		}
		String ancestryNames = StringUtils.join(ancestorNames, " => ");
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
		return self.getAncestor();
	}

	public static boolean isTemplate(IBasicObject self) {
		return null != self.getTemplate();
	}
	
    public static String getDefiningName(IBasicObject self) {
    	IProperty prop = getObjectClassProperty(self);
            if(null != prop)
                    return prop.getValue();
            return self.getName();
    }
            private static IProperty getObjectClassProperty(IProperties self) {
                    for(IProperty prop: self.getProperties())
                            if("className".equals(prop.getKey()))
                                            return prop;
                    return null;
            }

	public static List<IAttribute> getAttributesRecursively(IBasicObject self) {
		EList<IAttribute> atts = self.getAttributes();
		 IBasicObject ancie = self.getAncestor();
		atts.addAll(ancie.getAttributesRecursively());
		return atts;
	}

}