package org.rulez.magwas.zenta.model.handmade;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.resource.Resource.Internal;
import org.rulez.magwas.zenta.model.IZentaPackage;
import org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase;


public class ZentaDiagramModel extends ZentaDiagramModelBase {
	
	@Override
	public void setId(String value) {
		if (isChecked())
			checkId(value);
		super.setId(value);
	}

	@Override
	public void setDocumentation(String value) {
		if (isChecked())
			checkDocumentation(value);
		super.setDocumentation(value);
	}
	
	@Override
	public void eDynamicUnset(int featureID) {
		checkFeatureId(featureID);
		super.eDynamicUnset(featureID);
	}

	private void checkFeatureId(int featureID) {
		if(featureID > IZentaPackage.DIAGRAM_MODEL_FEATURE_COUNT ||
				featureID <0)
			throw new IllegalArgumentException("invalid feature id "+featureID+" for "+this.getClass());
	}

	@Override
	public boolean eDynamicIsSet(int featureID) {
		checkFeatureId(featureID);
		return super.eDynamicIsSet(featureID);
	}
	
	@Override
	public void eDynamicUnset(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		super.eDynamicUnset(eFeature);
	}
	
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		checkMsgs(msgs);
		return super.eBasicRemoveFromContainerFeature(msgs);
	}
	@Override
	public boolean eDynamicIsSet(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		return super.eDynamicIsSet(eFeature);
	}

	private void checkStructuralFeature(EStructuralFeature eFeature) {
		if(null == eFeature)
			throw new IllegalArgumentException("feature is null");
	}
	
	@Override
	public Object eDynamicGet(EStructuralFeature eFeature, boolean resolve) {
		checkStructuralFeature(eFeature);
		return super.eDynamicGet(eFeature, resolve);
	}
	
	
	
	@Override
	public Object eDynamicInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		try {
		return super.eDynamicInvoke(operationID, arguments);
		} catch(NullPointerException e) {
			throw new IllegalArgumentException("invalid operation or arguments");
		}
	}
	
	@Override
	public void eDynamicSet(EStructuralFeature eFeature, Object newValue) {
		if(null == eFeature)
			throw new IllegalArgumentException("null feature");
		super.eDynamicSet(eFeature, newValue);
	}
	@Override
	public void eDynamicSet(int featureID, Object newValue) {
		checkFeatureId(featureID);
		super.eDynamicSet(featureID, newValue);
	}

	@Override
	public void eSet(EStructuralFeature eFeature, Object newValue) {
		checkStructuralFeature(eFeature);
		super.eSet(eFeature, newValue);
	}
	
	@Override
	public void eSet(int featureID, Object newValue) {
		checkFeatureId(featureID);
		super.eSet(featureID, newValue);
	}
	@Override
	public Object eInvoke(EOperation eOperation, EList<?> arguments) throws InvocationTargetException {
		try {
		return super.eInvoke(eOperation, arguments);
		} catch(NullPointerException e) {
			throw new IllegalArgumentException("invalid operation or arguments");
		}
	}
	
	@Override
	public void eOpenUnset(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		super.eOpenUnset(eFeature);
	}
	
	@Override
	public Setting eSetting(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		return super.eSetting(eFeature);
	}
	
	@Override
	public Object eGet(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		return super.eGet(eFeature);
	}
	
	@Override
	public Object eGet(EStructuralFeature eFeature, boolean resolve, boolean coreType) {
		checkStructuralFeature(eFeature);
		return super.eGet(eFeature, resolve, coreType);
	}
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		checkMsgs(msgs);
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}
	
	@Override
	public int eDerivedOperationID(EOperation eOperation) {
		try {
			return super.eDerivedOperationID(eOperation);
		} catch (NullPointerException e) {
			throw new IllegalArgumentException("invalid derived operation");
		}
	}
	
	@Override
	public NotificationChain eDynamicBasicRemoveFromContainer(NotificationChain msgs) {
		checkMsgs(msgs);
		return super.eDynamicBasicRemoveFromContainer(msgs);
	}

	private void checkMsgs(NotificationChain msgs) {
		if (null == msgs)
			throw new IllegalArgumentException("msgs is null");
	}
	
	@Override
	public boolean eOpenIsSet(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		return super.eOpenIsSet(eFeature);
	}
	
	@Override
	public Object eOpenGet(EStructuralFeature eFeature, boolean resolve) {
		checkStructuralFeature(eFeature);
		return super.eOpenGet(eFeature, resolve);
	}
	
	@Override
	public void eUnset(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		super.eUnset(eFeature);
	}
	
	@Override
	public boolean eIsSet(EStructuralFeature eFeature) {
		checkStructuralFeature(eFeature);
		return super.eIsSet(eFeature);
	}
	
	@Override
	public int eDerivedStructuralFeatureID(EStructuralFeature eStructuralFeature) {
		checkStructuralFeature(eStructuralFeature);
		return super.eDerivedStructuralFeatureID(eStructuralFeature);
	}
	
	@Override
	public void eOpenSet(EStructuralFeature eFeature, Object newValue) {
		checkStructuralFeature(eFeature);
		super.eOpenSet(eFeature, newValue);
	}
	
	@Override
	public EObject eResolveProxy(InternalEObject proxy) {
		if(null == proxy)
			throw new IllegalArgumentException("proxy is null");
		return super.eResolveProxy(proxy);
	}
	
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		try {
			return super.eInvoke(operationID, arguments);
		} catch (NullPointerException e) {
			throw new IllegalArgumentException("operation id or arguments invalid");
		}
	}
}
