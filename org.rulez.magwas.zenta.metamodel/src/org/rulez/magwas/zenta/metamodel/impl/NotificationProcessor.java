package org.rulez.magwas.zenta.metamodel.impl;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelZentaObject;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IZentaDiagramModel;
import org.rulez.magwas.zenta.model.IZentaElement;
import org.rulez.magwas.zenta.model.IZentaPackage;

public class NotificationProcessor {

	static Map<Class<?>,Map<Integer,Map<Boolean,Map<Boolean,DecisionCase>>>> decisionTree =
			new HashMap<Class<?>,Map<Integer,Map<Boolean,Map<Boolean,DecisionCase>>>>();
	
	static {
		addCase(new DecisionCase(){{
			notifierClass = IZentaDiagramModel.class;
			featureId = IZentaPackage.ZENTA_DIAGRAM_MODEL__CHILDREN;
			hasNew = true;
			}
			public void run(MetamodelImpl mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelComponent dmzc = (IDiagramModelComponent) newVal;
				mm.processChildrenAddedToDiagram(dmzc);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IZentaDiagramModel.class;
			featureId = IZentaPackage.ZENTA_DIAGRAM_MODEL__PROPERTIES;
			hasNew = true;
			}
			public void run(MetamodelImpl mm, Object notifier, Object oldVal, Object newVal) {
				IProperty prop = (IProperty) newVal;
				IZentaDiagramModel dm = (IZentaDiagramModel) notifier;
				mm.processDiagramHasNewProperty(dm, prop);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IProperty.class;
			featureId = IZentaPackage.PROPERTY__KEY;
			hasNew = true;
			}
			public void run(MetamodelImpl mm, Object notifier, Object oldVal, Object newVal) {
				IProperty prop = (IProperty) notifier;
				String value = (String) newVal;
				mm.processPropertyChange(prop, value);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IDiagramModelZentaObject.class;
			featureId = IZentaPackage.DIAGRAM_MODEL_ZENTA_OBJECT__SOURCE_CONNECTIONS;
			hasNew = true;
			}
			public void run(MetamodelImpl mm, Object notifier, Object oldVal, Object newVal) {
				IDiagramModelComponent dmzc = (IDiagramModelComponent) newVal;
				mm.processConnectionAddedToDiagramElement(dmzc);
			}});
		addCase(new DecisionCase(){{
			notifierClass = IZentaElement.class;
			featureId = IZentaPackage.NAMEABLE__OBJECT_CLASS;
			hasNew = true;
			}
			public void run(MetamodelImpl mm, Object notifier, Object oldVal, Object newVal) {
				IZentaElement element = (IZentaElement) notifier;
				element.setAppearanceForDefinedElements();
			}});
		addCase(new DecisionCase(){{
			notifierClass = IZentaElement.class;
			featureId = IZentaPackage.ZENTA_ELEMENT__NAME;
			hasNew = true;
			}
			public void run(MetamodelImpl mm, Object notifier, Object oldVal, Object newVal) {
				IZentaElement element = (IZentaElement) notifier;
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
			return branch;
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
				return subbranch;
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
				private static Map<Boolean, DecisionCase> getBranchByHasNew(
						Map<Boolean, Map<Boolean, DecisionCase>> subbranch,
						boolean hasNew) {
					Map<Boolean, DecisionCase> subsubbranch;
					if(subbranch.containsKey(hasNew))
						subsubbranch = subbranch.get(hasNew);
					else {
						subsubbranch = new HashMap<Boolean,DecisionCase>();
						subbranch.put(hasNew, subsubbranch);
					}
					return subsubbranch;
				}
	
	public static void processNotification(MetamodelImpl mm,Notification notification) {
		System.out.printf("notification for \n\t%s\n\t%s\n\t%s\n\t%s\n",
				notification.getNotifier(),
				notification.getFeature(),
				notification.getOldValue(),
				notification.getNewValue());
		EObject lastObject;
		lastObject = (EObject) notification.getNotifier();
		for(Class<?> klass : decisionTree.keySet()) {
			if(klass.isInstance(lastObject))
				processClassMatch(mm,notification,klass,decisionTree.get(klass));
		}
	}
		private static void processClassMatch(MetamodelImpl mm,
				Notification notification, Class<?> klass, Map<Integer, Map<Boolean, Map<Boolean, DecisionCase>>> map) {
			int featureId = notification.getFeatureID(klass);
			Map<Boolean, Map<Boolean, DecisionCase>> match = map.get(featureId);
			if(null != match)
				processFeatureMatch(mm,notification,match);
		}
			private static void processFeatureMatch(MetamodelImpl mm,
					Notification notification,
					Map<Boolean, Map<Boolean, DecisionCase>> map) {
				Map<Boolean, DecisionCase> match = map.get(notification.getNewValue() != null);
				if(null != match)
					processNewMatch(mm,notification,match);
			}
				private static void processNewMatch(MetamodelImpl mm,
						Notification notification, Map<Boolean, DecisionCase> map) {
					DecisionCase match = map.get(notification.getOldValue() == null);
					if(null != match) {
						System.out.printf("running %s %s\n",
								match.hasNew,
								match.hasOld);
						match.run(mm, notification.getNotifier(),notification.getOldValue(),notification.getNewValue());
					}
				}
	
}