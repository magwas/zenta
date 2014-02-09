package org.rulez.magwas.zenta.model.handmade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.rulez.magwas.zenta.model.IAttribute;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IMetamodel;
import org.rulez.magwas.zenta.model.IRelationClass;
import org.rulez.magwas.zenta.model.ITemplate;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.IAttribute.Direction;
import org.rulez.magwas.zenta.model.handmade.util.StringUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.impl.BasicRelationshipBase;

public class RelationClass extends BasicRelationshipBase implements IBasicRelationship, IRelationClass {

	public RelationClass(IBasicRelationship ancestor) {
		setAncestor(ancestor);
	}
	
	@SuppressWarnings("null")
	protected RelationClass(ITemplate template) {
		template.getClasses().add(this);
		setTemplate(template);
		addAttributesToRelatedObjectClasses(template, IAttribute.Direction.SOURCE, (IBasicRelationship) getSource());
		addAttributesToRelatedObjectClasses(template, IAttribute.Direction.TARGET, (IBasicRelationship) getTarget());
	}

	public RelationClass() {
	}

	@Override
	public IBasicRelationship create(IFolder folder) {
		IBasicRelationship obj = IZentaFactory.eINSTANCE.createBasicRelationship();
		obj.setAncestor(this);
		folder.getElements().add(obj);
		return obj;
	}

	@Override
	public String getHelpHintContent() {
		String doc = Util.assertNonNull(getDocumentation());
		List<IBasicObject> ancestry = this.getAncestry();
		List<String> ancestorNames = new ArrayList<String>();
		for( IBasicObject a : ancestry) {
			ancestorNames.add(a.getName());
		}
		String ancestryNames = StringUtils.join(ancestorNames, " => ");
		return formatHelpString(doc, ancestryNames);
	}

	@SuppressWarnings("null")
	public String formatHelpString(String doc, String ancestryNames) {
		return String.format("%s\nAncestry: %s\n", doc, ancestryNames);
	}

	@Override
	public List<IBasicObject> getAncestry() {
		ArrayList<IBasicObject> ancestry = new ArrayList<IBasicObject>();
		return getAncestry(ancestry);
	}

	@Override
	public List<IBasicObject> getAncestry(List<IBasicObject> ancestry) {
		ancestry.add(this);
		if(null == ancestor)
			return ancestry;
		return ((IBasicObject)ancestor).getAncestry(ancestry);
	}


	private void addAttributesToRelatedObjectClasses(ITemplate template,
			Direction dir, IBasicRelationship se) {
				Attribute sa = new Attribute((IBasicRelationship) this,se,dir);
				se.getAttributes().add(sa);
			}

	@Override
	public HashMap<String, EAttribute> getObjectAppearanceProperties() {
		HashMap<String, EAttribute> props = new HashMap<String, EAttribute>();
		props.put("font",IZentaPackage.eINSTANCE.getFontAttribute_Font());
		props.put("fontColor",IZentaPackage.eINSTANCE.getFontAttribute_FontColor());
		props.put("textPosition",IZentaPackage.eINSTANCE.getFontAttribute_TextPosition());
		props.put("lineWidth",IZentaPackage.eINSTANCE.getDiagramModelConnection_LineWidth());
		props.put("lineColor",IZentaPackage.eINSTANCE.getDiagramModelConnection_LineColor());
		props.put("lineDecoration",IZentaPackage.eINSTANCE.getDiagramModelConnection_LineDecoration());
		return props;
	}

	@Override
	public boolean isObject() {
		return false;
	}

	@Override
	public boolean isRelation() {
		return true;
	}

	@Override
	public IMetamodel getMetamodel() {
		return ObjectClassMixin.getMetamodel(this);
	}


	@Override
	public void setAsTemplate(ITemplate template) {
		ObjectClassMixin.setAsTemplate(this, template);
		setupEndAttributesForrelation();

	}
		@SuppressWarnings("null")
		private void setupEndAttributesForrelation() {
			IBasicObject source = (IBasicObject) getSource();
			IBasicObject dest = (IBasicObject) getTarget();
			assert(source != null);
			assert(dest != null);
			setupAttribute(source, dest, Direction.SOURCE);
			setupAttribute(dest, source, Direction.TARGET);
		}
			private void setupAttribute(IBasicObject obj1,
					IBasicObject obj2, Direction dir) {
				IAttribute att = IZentaFactory.eINSTANCE.createAttribute();
				att.setDirection(dir);
				att.setConnectedObject(obj2);
				att.setRelation(this);
				obj1.getAttributes().add(att);
			}

	@Override
	public String getHelpHintTitle() {
		return ObjectClassMixin.getHelpHintTitle(this);
	}

	@Override
	public IBasicObject getDefiningElement() {
		return ObjectClassMixin.getDefiningElement(this);
	}

	@Override
	public boolean isTemplate() {
		return ObjectClassMixin.isTemplate(this);
	}

	@Override
	public String getDefiningName() {
		return ObjectClassMixin.getDefiningName(this);
	}
	
	@Override
	public List<IAttribute> getAttributesRecursively() {
		return ObjectClassMixin.getAttributesRecursively(this);
	}

	@Override
	public boolean isAllowedRelation(IBasicRelationship relclass,
			Direction direction) {
		throw new RuntimeException("We are not that abstract yet");
	}

	@Override
	public Map<Direction, List<IBasicRelationship>> getAllowedRelations() {
		throw new RuntimeException("We are not that abstract yet");
	}

	@Override
	public List<IBasicObject> getAllowedTargets() {
		List<IBasicObject> ret = new ArrayList<IBasicObject>();
		ret.add((IBasicObject) getTarget());
		for(IBasicObject kid : this.getChildren())
			for(IBasicObject target: ((IBasicRelationship)kid).getAllowedTargets())
				if(!ret.contains(target))
					ret.add(target);
		return ret;
	}
}
