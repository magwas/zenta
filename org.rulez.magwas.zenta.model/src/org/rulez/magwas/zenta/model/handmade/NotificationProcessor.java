package org.rulez.magwas.zenta.model.handmade;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.zenta.model.IBasicObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.handmade.util.Util;

public class NotificationProcessor {

	static Map<Class<?>,Map<Integer,Map<Boolean,Map<Boolean,DecisionCase>>>> decisionTree =
			new HashMap<Class<?>,Map<Integer,Map<Boolean,Map<Boolean,DecisionCase>>>>();
	
	static {
		addCase(new DecisionCase(){{
			notifierClass = IZentaDiagramModel.class;
			featureId = IZentaPackage.ZENTA_DIAGRAM_MODEL__CHILDREN;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelComponent dmzc = (IDiagramModelComponent) newVal;
				mm.processChildAddedToDiagram(dmzc);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IZentaDiagramModel.class;
			featureId = IZentaPackage.ZENTA_DIAGRAM_MODEL__CHILDREN;
			hasOld = true;
			hasNew = false;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelComponent dmzc = (IDiagramModelComponent) oldVal;
				mm.processChildRemovedFromDiagram(dmzc);
			}});

		addCase(new DecisionCase(){{
			notifierClass = IZentaDiagramModel.class;
			featureId = IZentaPackage.ZENTA_DIAGRAM_MODEL__PROPERTIES;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IProperty prop = (IProperty) newVal;
				IZentaDiagramModel dm = (IZentaDiagramModel) notifier;
				mm.processDiagramHasNewProperty(dm, prop);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IProperty.class;
			featureId = IZentaPackage.PROPERTY__KEY;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IProperty prop = (IProperty) notifier;
				String value = (String) newVal;
				mm.processPropertyChange(prop, value);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__SOURCE_CONNECTIONS;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelComponent dmzc = (IDiagramModelComponent) newVal;
				mm.processConnectionAddedToDiagramElement(dmzc);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__SOURCE_CONNECTIONS;
			hasNew = false;
			hasOld = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelComponent dmzc = (IDiagramModelComponent) oldVal;
				mm.processConnectionRemovedFromDiagramElement(dmzc);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__ELEMENT_SHAPE;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaObject dmzc = (IDiagramModelZentaObject) notifier;
				String elementShape = dmzc.getElementShape();
				mm.processDiagramElementAppearanceChanged(dmzc,"elementShape",Util.verifyNonNull(elementShape));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__FILL_COLOR;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaObject dmzc = (IDiagramModelZentaObject) notifier;
				String fillColor = dmzc.getFillColor();
				mm.processDiagramElementAppearanceChanged(dmzc,"fillColor",Util.verifyNonNull(fillColor));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__FONT;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaObject dmzc = (IDiagramModelZentaObject) notifier;
				String font = dmzc.getFont();
				mm.processDiagramElementAppearanceChanged(dmzc,"font",Util.verifyNonNull(font));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__FONT_COLOR;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaObject dmzc = (IDiagramModelZentaObject) notifier;
				String fontColor = dmzc.getFontColor();
				mm.processDiagramElementAppearanceChanged(dmzc,"fontColor",Util.verifyNonNull(fontColor));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__TEXT_ALIGNMENT;
			hasNew = true;
			}
			@SuppressWarnings("null")
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaObject dmzc = (IDiagramModelZentaObject) notifier;
				mm.processDiagramElementAppearanceChanged(dmzc,"textAlignment",new Integer(dmzc.getTextAlignment()).toString());
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__TEXT_POSITION;
			hasNew = true;
			}
			@SuppressWarnings("null")
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaObject dmzc = (IDiagramModelZentaObject) notifier;
				mm.processDiagramElementAppearanceChanged(dmzc,"textPosition",new Integer(dmzc.getTextPosition()).toString());
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaConnection.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__FONT;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) notifier;
				String font = dmzc.getFont();
				mm.processDiagramConnectionAppearanceChanged(dmzc,"font",Util.verifyNonNull(font));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaConnection.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__FONT_COLOR;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) notifier;
				String fontColor = dmzc.getFontColor();
				mm.processDiagramConnectionAppearanceChanged(dmzc,"fontColor",Util.verifyNonNull(fontColor));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaConnection.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__LINE_COLOR;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) notifier;
				String lineColor = dmzc.getLineColor();
				mm.processDiagramConnectionAppearanceChanged(dmzc,"lineColor",Util.verifyNonNull(lineColor));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaConnection.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__LINE_DECORATION;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) notifier;
				String lineDecoration = dmzc.getLineDecoration();
				mm.processDiagramConnectionAppearanceChanged(dmzc,"lineDecoration",Util.verifyNonNull(lineDecoration));
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaConnection.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__LINE_WIDTH;
			hasNew = true;
			}
			@SuppressWarnings("null")
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) notifier;
				mm.processDiagramConnectionAppearanceChanged(dmzc,"lineWidth",new Integer(dmzc.getLineWidth()).toString());
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaConnection.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__TEXT_ALIGNMENT;
			hasNew = true;
			}
			@SuppressWarnings("null")
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) notifier;
				mm.processDiagramConnectionAppearanceChanged(dmzc,"textAlignment",new Integer(dmzc.getTextAlignment()).toString());
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaConnection.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_CONNECTION__TEXT_POSITION;
			hasNew = true;
			}
			@SuppressWarnings("null")
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelZentaConnection dmzc = (IDiagramModelZentaConnection) notifier;
				mm.processDiagramConnectionAppearanceChanged(dmzc,"textPosition",new Integer(dmzc.getTextPosition()).toString());
			}});
		addCase(new DecisionCase(){{
			notifierClass = IBasicObject.class;
			featureId = IZentaPackage.BASIC_OBJECT__ANCESTOR;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IBasicObject element = (IBasicObject) notifier;
				mm.updateFiguresFor(element);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IBasicObject.class;
			featureId = IZentaPackage.ZENTA_ELEMENT__NAME;
			hasNew = true;
			}
			public void run(Metamodel mm, Object notifier, Object oldVal, Object newVal) {
				IBasicObject element = (IBasicObject) notifier;
				mm.processElementNameChange(element, (String) oldVal, (String)newVal);
			}});
	}

	private static void addCase(DecisionCase aCase) {
		Map<Integer,Map<Boolean,Map<Boolean,DecisionCase>>> branch;
		branch = getBranchForClass(aCase);
		addToDecisiontreeByHasNew(aCase, branch);		
	}
		private static Map<Integer, Map<Boolean, Map<Boolean, DecisionCase>>>
		  getBranchForClass(DecisionCase aCase) {
			Map<Integer, Map<Boolean, Map<Boolean, DecisionCase>>> branch;
			if(decisionTree.containsKey(aCase.notifierClass))
				branch = decisionTree.get(aCase.notifierClass);
			else {
				branch = new HashMap<Integer,Map<Boolean,Map<Boolean,DecisionCase>>>();
				decisionTree.put(aCase.notifierClass, branch);
			}
			return Util.verifyNonNull(branch);
		}
		private static void addToDecisiontreeByHasNew(DecisionCase aCase,
				Map<Integer, Map<Boolean, Map<Boolean, DecisionCase>>> branch) {
			Map<Boolean, Map<Boolean, DecisionCase>> subbranch;
			subbranch = getBranchByFeatureId(aCase, branch);
			if(aCase.hasNew == null || aCase.hasNew == true) {
				addToDecisionTreeByHasOld(aCase,subbranch, true);
			}
			if(aCase.hasNew == null || aCase.hasNew == false) {
				addToDecisionTreeByHasOld(aCase,subbranch, false);
			}
		}
			private static Map<Boolean, Map<Boolean, DecisionCase>>
			  getBranchByFeatureId(
					DecisionCase aCase,
					Map<Integer, Map<Boolean, Map<Boolean, DecisionCase>>> branch) {
				Map<Boolean, Map<Boolean, DecisionCase>> subbranch;
				if(branch.containsKey(aCase.featureId))
					subbranch = branch.get(aCase.featureId);
				else {
					subbranch = new HashMap<Boolean,Map<Boolean,DecisionCase>>();
					branch.put(aCase.featureId,subbranch);
				}
				return Util.verifyNonNull(subbranch);
			}
			private static void addToDecisionTreeByHasOld(DecisionCase aCase,
					Map<Boolean, Map<Boolean, DecisionCase>> subbranch, boolean hasNew) {
				Map<Boolean, DecisionCase> subsubbranch;
				subsubbranch = getBranchByHasNew(subbranch, hasNew);
				if(aCase.hasOld == null || aCase.hasOld == true) {
					subsubbranch.put(true, aCase);
				}
				if(aCase.hasOld == null || aCase.hasOld == false) {
					subsubbranch.put(false, aCase);
				}
			}
				@SuppressWarnings("null")
				private static Map<Boolean, DecisionCase> getBranchByHasNew(
						Map<Boolean, Map<Boolean, DecisionCase>> subbranch,
						boolean hasNew) {
					@NonNull Map<Boolean, DecisionCase> subsubbranch;
					if(subbranch.containsKey(hasNew))
						subsubbranch = subbranch.get(hasNew);
					else {
						subsubbranch = new HashMap<Boolean,DecisionCase>();
						subbranch.put(hasNew, subsubbranch);
					}
					return subsubbranch;
				}
	
	@SuppressWarnings("null")
	public static void processNotification(Metamodel mm,Notification notification) {
		EObject lastObject = (EObject) notification.getNotifier();

		/*
		System.out.printf("notifier = %s\nEventtype=%s\nfeature=%s\nold=%s\nnew=%s\n\n", 
				lastObject,
				notification.getEventType(),
				notification.getFeature(),
				notification.getOldValue(),
				notification.getNewValue());
		*/
		for(Class<?> klass : decisionTree.keySet())
			if(klass.isInstance(lastObject))
				processClassMatch(mm,notification,klass,decisionTree.get(klass));
	}
		private static void processClassMatch(Metamodel mm,
				Notification notification, Class<?> klass, Map<Integer, Map<Boolean, Map<Boolean, DecisionCase>>> map) {
			int featureId = notification.getFeatureID(klass);
			Map<Boolean, Map<Boolean, DecisionCase>> match = map.get(featureId);
			if(null != match)
				processFeatureMatch(mm,notification,match);
		}
			private static void processFeatureMatch(Metamodel mm,
					Notification notification,
					Map<Boolean, Map<Boolean, DecisionCase>> map) {
				Map<Boolean, DecisionCase> match = map.get(notification.getNewValue() != null);
				if(null != match)
					processNewMatch(mm,notification,match);
			}
				@SuppressWarnings("null")
				private static void processNewMatch(Metamodel mm,
						Notification notification, Map<Boolean, DecisionCase> map) {
					DecisionCase match = map.get(notification.getOldValue() != null);
					//System.out.printf("match=%s\n\n", match);
					if(null != match)
						match.run(mm, notification.getNotifier(),notification.getOldValue(),notification.getNewValue());
				}
	
}