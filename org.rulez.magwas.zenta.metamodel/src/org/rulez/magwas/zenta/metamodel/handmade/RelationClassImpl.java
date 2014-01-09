package org.rulez.magwas.zenta.metamodel.handmade;

import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.zenta.metamodel.Attribute;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.ReferencesModelObject;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.util.StringUtils;
import org.rulez.magwas.zenta.model.util.ZentaModelUtils;

public class RelationClassImpl extends AbstractRelationClassImpl implements RelationClass {

	protected RelationClassImpl(IRelationship referenced, Template template) {
		super(referenced,template);
		RelationClass ancie = getAncestorClass(referenced);
		setAncestor(ancie);
		referenced.setObjectClass(ancie.getId());
		addAttributesToRelatedObjectClasses(template, Attribute.Direction.SOURCE, referenced.getSource());
		addAttributesToRelatedObjectClasses(template, Attribute.Direction.TARGET, referenced.getTarget());
	}
		private RelationClass getAncestorClass(IRelationship referenced) {
			String refClassId = referenced.getObjectClass();
			String referenceId = referenced.getId();
			Metamodel metamodel = getMetamodel();
			RelationClass ancie = null;
			if(haveAncestor(refClassId, referenceId)) {
				ancie = getAncestorClass(refClassId, metamodel);
			}
			if(ancie == null)
				ancie=metamodel.getBuiltinRelationClass();
			return ancie;
		}
			private boolean haveAncestor(String refClassId, String referenceId) {
				return null != refClassId && !"basicrelation".equals(refClassId)&&!referenceId.equals(refClassId);
			}
			private RelationClass getAncestorClass(String refClassId,
					Metamodel metamodel) {
				RelationClass ancie;
				IRelationship ancestorDefining = (IRelationship) ZentaModelUtils.getObjectByID(metamodel.getModel(), refClassId);
				ancie=metamodel.getRelationClassReferencing(ancestorDefining);
				return ancie;
			}

	protected RelationClassImpl() {
		super();
	}

	@Override
	public IRelationship create(IFolder folder) {
		IBasicRelationship obj = IZentaFactory.eINSTANCE.createBasicRelationship();
		postCreate(obj, folder);
		obj.setObjectClass(getId());
		return obj;
	}
	public String getHelpHintContent() {
		IRelationship ref = (IRelationship) this.reference;
		if(null == ref)
			return "";
		String doc = ref.getDocumentation();
		List<ReferencesModelObject> ancestry = this.getAncestry();
		List<String> ancestorNames = new ArrayList<String>();
		for( ReferencesModelObject a : ancestry) {
			ancestorNames.add(a.getName());
		}
		String ancestryNames = StringUtils.join(ancestorNames, " => ");
		return String.format("%s\nAncestry: %s\n", doc, ancestryNames);
	}

	@Override
	public List<ReferencesModelObject> getAncestry() {
		ArrayList<ReferencesModelObject> ancestry = new ArrayList<ReferencesModelObject>();
		return getAncestry(ancestry);
	}

	@Override
	public List<ReferencesModelObject> getAncestry(List<ReferencesModelObject> ancestry) {
		ancestry.add(this);
		if(null == ancestor)
			return ancestry;
		return ((ReferencesModelObject)ancestor).getAncestry(ancestry);
	}

}
