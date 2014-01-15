package org.rulez.magwas.zenta.metamodel.handmade;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.metamodel.AttributeBase.Direction;
import org.rulez.magwas.zenta.metamodel.MetamodelBase;
import org.rulez.magwas.zenta.metamodel.MetamodelBaseFactory;
import org.rulez.magwas.zenta.metamodel.ObjectClass;
import org.rulez.magwas.zenta.metamodel.IRelationClass;
import org.rulez.magwas.zenta.metamodel.ITemplate;
import org.rulez.magwas.zenta.metamodel.impl.RelationClassBaseImpl;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.IZentaElement;

public abstract class AbstractRelationClassImpl extends RelationClassBaseImpl implements IRelationClass{

	protected IRelationClass ancestor;
	protected EList<IRelationClass> children;
	protected ITemplate template;

	public AbstractRelationClassImpl() {
		super();
	}

	public AbstractRelationClassImpl(IRelationship referenced,
			ITemplate template) {
		setReference(referenced);
		template.getRelationClasses().add(this);
		setName(MetamodelBaseFactory.eINSTANCE.getDefiningName(reference));
		this.template = template;
	}

	@Override
	public MetamodelBase getMetamodel() {
		return (MetamodelBase) template.getMetamodel();
	}

	protected void addAttributesToRelatedObjectClasses(ITemplate template,
			Direction dir, IZentaElement se) {
				ObjectClass sc = template.getObjectClassFrom(se);
				AttributeImpl sa = new AttributeImpl(this,sc,dir);
				sc.getAttributes().add(sa);
			}

	@Override
	public ITemplate getTemplate() {
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

	@Override
	public String getHelpHintTitle() {
		return this.getName();
	}

}