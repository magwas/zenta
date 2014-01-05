package org.rulez.magwas.zenta.metamodel.handmade;

import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class ObjectClassImpl extends AbstractObjectClassImpl implements ObjectClass {

	protected ObjectClassImpl() {
	}

	public ObjectClassImpl(IZentaElement reference, Template template) {
		super(reference,template);
		ObjectClass ancie = getAncestorClass(reference);
		setAncestor(ancie);
		reference.setObjectClass(ancie.getId());
	}
        private ObjectClass getAncestorClass(IZentaElement reference) {
            String refClassId = reference.getObjectClass();
    		String referenceId = reference.getId();
    		Metamodel metamodel = getMetamodel();
    		ObjectClass ancie = null;
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
    		private ObjectClass getAncestorClass(String refClassId, Metamodel metamodel) {
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
		return ref.getDocumentation();
	}
}
