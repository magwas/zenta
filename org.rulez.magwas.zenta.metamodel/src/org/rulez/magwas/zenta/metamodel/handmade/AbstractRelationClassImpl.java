package org.rulez.magwas.zenta.metamodel.handmade;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.Attribute.Direction;
import org.rulez.magwas.zenta.metamodel.Metamodel;
import org.rulez.magwas.zenta.metamodel.MetamodelFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.RelationClass;
import org.rulez.magwas.zenta.metamodel.Template;
import org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

public abstract class AbstractRelationClassImpl extends RelationClassBaseImpl implements RelationClass{

	protected RelationClass ancestor;
	protected EList<RelationClass> children;
	protected Template template;

	public AbstractRelationClassImpl() {
		super();
	}

	public AbstractRelationClassImpl(IRelationship referenced,
			Template template) {
		setReference(referenced);
		template.getRelationClasses().add(this);
		setName(MetamodelFactory.eINSTANCE.getDefiningName(reference));
		this.template = template;
	}

	@Override
	public Metamodel getMetamodel() {
		return (Metamodel) template.getMetamodel();
	}

	protected void addAttributesToRelatedObjectClasses(Template template,
			Direction dir, IZentaElement se) {
				ObjectClass sc = template.getObjectClassFrom(se);
				AttributeImpl sa = new AttributeImpl(this,sc,dir);
				sc.getAttributes().add(sa);
			}

	@Override
	public Template getTemplate() {
		return template;
	}

	@Override
	public void postCreate(IIdentifier createdObj, IFolder folder) {
		folder.getElements().add(createdObj);
	}

	@Override
	public String getId() {
		return ((IIdentifier)reference).getId();
	}

	@Override
	public boolean isInstance(IIdentifier relation) {
		return getId().equals(relation.getObjectClass());
	}

}