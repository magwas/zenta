package org.rulez.magwas.zenta.metamodel.impl;

import org.eclipse.emf.ecore.EObject;

abstract class DecisionCase {
	public Class<? extends EObject> notifierClass;
	public int featureId;
	public Boolean hasNew = null;
	public Boolean hasOld= null;
	public abstract void run(MetamodelImpl metamodel, Object notifier, Object oldVal, Object newVal);
}