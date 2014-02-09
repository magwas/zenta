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
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.TemplateBase;

public class Template extends TemplateBase implements ITemplate {

	protected Template() {
		super();
	}

	public Template(IDiagramModel diagram, IMetamodel metamodel) {
		super();
		metamodel.getTemplates().add(this);
		setDiagram(diagram);
		extractObjectClasses(diagram);
		extractRelationClasses(diagram);
		setPath(diagram.getId());
	}

		private void extractObjectClasses(IDiagramModel diagram) {
			EList<IDiagramModelObject> kids = diagram.getChildren();
			for (IDiagramModelObject kid : kids)
				if(kid instanceof IDiagramModelZentaObject)
					extractDiagramElement((IDiagramModelZentaObject) kid);			
		}
			private void extractDiagramElement(IDiagramModelZentaObject kid) {
				IBasicObject zentaElement = (IBasicObject) kid.getZentaElement();
				setObjectAncestorIfEmpty(Util.assertNonNull(zentaElement));
				if(! "".equals(zentaElement.getDefiningName()))
					zentaElement.setAsTemplate(this);
				EList<IDiagramModelObject> myKids = kid.getChildren();
				for (IDiagramModelObject aKid : myKids) {
					IDiagramModelZentaObject k = (IDiagramModelZentaObject) aKid;
					extractDiagramElement(Util.assertNonNull(k));
				}
			}
			private void setObjectAncestorIfEmpty(IBasicObject zentaElement) {
				if(null == zentaElement.getAncestor())
					zentaElement.setAncestor(this.getMetamodel().getBuiltinObjectClass());
			}

		private void extractRelationClasses(IDiagramModel diagram) {
			EList<IDiagramModelObject> kids = diagram.getChildren();
			for (IDiagramModelObject kid : kids)
				if(kid instanceof IDiagramModelZentaObject)
					extractConnsFromDiagramElement((IDiagramModelZentaObject) kid);
		}
			private void extractConnsFromDiagramElement(IDiagramModelZentaObject kid) {
				EList<IDiagramModelObject> myKids = kid.getChildren();
				for (IDiagramModelObject aKid : myKids) {
					IDiagramModelZentaObject k = (IDiagramModelZentaObject) aKid;
					extractConnsFromDiagramElement(Util.assertNonNull(k));
				}
				extractConnectionsForDiagramElement(kid);
			}
				private void extractConnectionsForDiagramElement(
						IDiagramModelZentaObject kid) {
					for (IDiagramModelConnection conn : kid.getSourceConnections())
						extractRelationClassFor(Util.assertNonNull(conn));
				}
					private void extractRelationClassFor(
							IDiagramModelConnection conn) {
						if(!(conn instanceof IDiagramModelZentaConnection))
							return;
						IDiagramModelZentaConnection dmc = (IDiagramModelZentaConnection)conn;
						IBasicRelationship relationship = (IBasicRelationship) dmc.getRelationship();
						setRelationAncestorIfEmpty(Util.assertNonNull(relationship));
						if("".equals(relationship.getDefiningName()))
							return;
						relationship.setAsTemplate(this);
					}
						private void setRelationAncestorIfEmpty(IBasicRelationship zentaElement) {
							if(null == zentaElement.getAncestor())
								zentaElement.setAncestor(this.getMetamodel().getBuiltinRelationClass());
						}
	
	@Override
	public IIdentifier create(IFolder folder) {
		return IZentaFactory.eINSTANCE.createZentaDiagramModel();
	}

	@Override
	public List<IBasicObject> getObjectClasses() {
		ArrayList<IBasicObject> ret = new ArrayList<IBasicObject>();
		for(IBasicObject c : this.getClasses())
			if(!(c instanceof RelationClass))
				ret.add(c);
		List<IBasicObject> l = Collections.unmodifiableList(ret);
		return Util.assertNonNull(l);
	}

	@Override
	public List<IBasicRelationship> getRelationClasses() {
		ArrayList<IBasicRelationship> ret = new ArrayList<IBasicRelationship>();
		for(IBasicObject c : this.getClasses())
			if((c instanceof RelationClass))
				ret.add((IBasicRelationship) c);
		List<IBasicRelationship> l = Collections.unmodifiableList(ret);
		return Util.assertNonNull(l);
	}

	@Override
	public String getName() {
		String name = getDiagram().getName();
		return Util.assertNonNull(name);
	}

}