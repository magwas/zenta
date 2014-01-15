package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IReferencesModelObject;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.util.StringUtils;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ObjectClass extends AbstractObjectClass implements IObjectClass {

	protected ObjectClass() {
	}

	public ObjectClass(IZentaElement reference, ITemplate template) {
		super(reference,template);
		IObjectClass ancie = getAncestorClass(reference);
		setAncestor(ancie);
		reference.setObjectClass(ancie.getId());
	}
        private IObjectClass getAncestorClass(IZentaElement reference) {
            String refClassId = reference.getObjectClass();
    		String referenceId = reference.getId();
    		IMetamodel metamodel = getMetamodel();
    		IObjectClass ancie = null;
    		if(haveAncestor(refClassId, referenceId))
    			ancie = getAncestorClass(refClassId, metamodel);
    		if(ancie == null)
    			ancie=metamodel.getBuiltinObjectClass();
            return ancie;
        }
    		private boolean haveAncestor(String refClassId, String referenceId) {
    			return	refClassId != null &&
    					!"basicobject".equals(refClassId) &&
    					!referenceId.equals(refClassId);
    		}
    		private IObjectClass getAncestorClass(String refClassId, IMetamodel metamodel) {
    			IZentaElement ancestorElement = (IZentaElement) ZentaModelUtils.getObjectByID(metamodel.getModel(), refClassId);
    			return metamodel.getObjectClassReferencing(ancestorElement);
    		}

	@Override
	public IIdentifier create(IFolder folder) {
		IBasicObject obj = IZentaFactory.eINSTANCE.createBasicObject();
		obj.setObjectClass(this.getId());
		postCreate(obj,folder);
		return obj;
	}

	@Override
	public String getHelpHintTitle() {
		return getName();
	}

	@Override
	public String getHelpHintContent() {
		IZentaElement ref = (IZentaElement) this.reference;
		if(null == ref)
			return "";
		String doc = ref.getDocumentation();
		List<IReferencesModelObject> ancestry = this.getAncestry();
		List<String> ancestorNames = new ArrayList<String>();
		for( IReferencesModelObject a : ancestry) {
			ancestorNames.add(a.getName());
		}
		String ancestryNames = StringUtils.join(ancestorNames, " => ");
		return String.format("%s\nAncestry: %s\n", doc, ancestryNames);
	}

	@Override
	public List<IReferencesModelObject> getAncestry() {
		ArrayList<IReferencesModelObject> ancestry = new ArrayList<IReferencesModelObject>();
		return getAncestry(ancestry);
	}

	@Override
	public List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry) {
		ancestry.add(this);
		return ((IReferencesModelObject)ancestor).getAncestry(ancestry);
	}
}
