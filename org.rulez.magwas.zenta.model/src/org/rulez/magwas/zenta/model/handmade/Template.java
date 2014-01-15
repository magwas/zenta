package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IObjectClass;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.impl.TemplateBase;

public class Template extends TemplateBase implements ITemplate {

	protected Template() {
		super();
	}

	public Template(IDiagramModel reference2, IMetamodel metamodel) {
		super();
		metamodel.getTemplates().add(this);
		setDiagram(reference2);
		extractObjectClasses(reference2);
		extractRelationClasses(reference2);
	}

		private void extractObjectClasses(IDiagramModel diagram) {
			EList<IDiagramModelObject> kids = diagram.getChildren();
			for (IDiagramModelObject kid : kids)
				if(kid instanceof IDiagramModelZentaObject)
					extractDiagramElement((IDiagramModelZentaObject) kid);			
		}
			private void extractDiagramElement(IDiagramModelZentaObject kid) {
				IBasicObject zentaElement = (IBasicObject) kid.getZentaElement();
				IZentaFactory.eINSTANCE
						.createObjectClass(zentaElement, this);
				EList<IDiagramModelObject> myKids = kid.getChildren();
				for (IDiagramModelObject aKid : myKids)
					extractDiagramElement((IDiagramModelZentaObject) aKid);
			}
		private void extractRelationClasses(IDiagramModel diagram) {
			EList<IDiagramModelObject> kids = diagram.getChildren();
			for (IDiagramModelObject kid : kids)
				if(kid instanceof IDiagramModelZentaObject)
					extractConnsFromDiagramElement((IDiagramModelZentaObject) kid);
		}
			private void extractConnsFromDiagramElement(IDiagramModelZentaObject kid) {
				EList<IDiagramModelObject> myKids = kid.getChildren();
				for (IDiagramModelObject aKid : myKids)
					extractConnsFromDiagramElement((IDiagramModelZentaObject) aKid);
				extractConnectionsForDiagramElement(kid);
			}
				private void extractConnectionsForDiagramElement(
						IDiagramModelZentaObject kid) {
					for (IDiagramModelConnection conn : kid.getSourceConnections())
						extractRelationClassFor(conn);
				}
					private void extractRelationClassFor(
							IDiagramModelConnection conn) {
						if(!(conn instanceof IDiagramModelZentaConnection))
							return;
						IDiagramModelZentaConnection dmc = (IDiagramModelZentaConnection)conn;
						IBasicRelationship relationship = (IBasicRelationship) dmc.getRelationship();
						IZentaFactory.eINSTANCE.createRelationClass(
								relationship,
								this);
					}


	@Override
	public IObjectClass getObjectClassReferencingElement(IBasicObject classTemplate) {
		for(IObjectClass oc : ((Metamodel)getMetamodel()).getObjectClasses()) {
			IIdentifier reference = oc.getReference();
			if(null == reference)
				continue;
			if(reference.equals(classTemplate))
				return (IObjectClass)oc;
		}
		return null;
	}
	@Override
	public IObjectClass getObjectClassFrom(IBasicObject referenced) {
		IObjectClass oc = getObjectClassReferencingElement(referenced);
		if (null == oc)
			oc = new ObjectClass(referenced, this);
		return oc;
	}

	@Override
	public IRelationClass getRelationClassReferencingElement(IBasicRelationship classTemplate) {
		for(IRelationClass oc : ((Metamodel)getMetamodel()).getRelationClasses()) {
			IIdentifier reference = oc.getReference();
			if(null == reference)
				continue;
			if(reference.equals(classTemplate))
				return (IRelationClass)oc;
		}
		return null;
	}

	@Override
	public IRelationClass getRelationClassFrom(IBasicRelationship referenced) {
		IRelationClass oc = getRelationClassReferencingElement(referenced);
		if (null == oc)
			oc = new RelationClass(referenced, this);
		return oc;
	}
	
	@Override
	public IIdentifier create(IFolder folder) {
		return IZentaFactory.eINSTANCE.createZentaDiagramModel();
	}

	@Override
	public void createClassBy(IBasicObject element) {
		if(element instanceof IBasicRelationship)
			classes.add(getRelationClassFrom((IBasicRelationship) element));
		else
			classes.add(getObjectClassFrom(element));
	}

	@Override
	public List<IObjectClass> getObjectClasses() {
		ArrayList<IObjectClass> ret = new ArrayList<IObjectClass>();
		for(IObjectClass c : this.getClasses())
			if(!(c instanceof RelationClass))
				ret.add(c);
		return Collections.unmodifiableList(ret);
	}

	@Override
	public List<IRelationClass> getRelationClasses() {
		ArrayList<IRelationClass> ret = new ArrayList<IRelationClass>();
		for(IObjectClass c : this.getClasses())
			if((c instanceof RelationClass))
				ret.add((IRelationClass) c);
		return Collections.unmodifiableList(ret);
	}

	@Override
	public String getName() {
		return getDiagram().getName();
	}

}