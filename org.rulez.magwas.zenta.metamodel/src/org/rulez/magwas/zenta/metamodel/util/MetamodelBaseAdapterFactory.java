/**
 */
package org.rulez.magwas.zenta.metamodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.rulez.magwas.zenta.metamodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.metamodel.MetamodelBasePackage
 * @generated
 */
public class MetamodelBaseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MetamodelBasePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetamodelBaseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MetamodelBasePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetamodelBaseSwitch<Adapter> modelSwitch =
		new MetamodelBaseSwitch<Adapter>() {
			@Override
			public Adapter caseMetamodelBase(MetamodelBase object) {
				return createMetamodelBaseAdapter();
			}
			@Override
			public Adapter caseTemplateBase(ITemplate object) {
				return createTemplateBaseAdapter();
			}
			@Override
			public Adapter caseReferencesModelObjectBase(ReferencesModelObjectBase object) {
				return createReferencesModelObjectBaseAdapter();
			}
			@Override
			public Adapter caseObjectClassBase(ObjectClass object) {
				return createObjectClassBaseAdapter();
			}
			@Override
			public Adapter caseAttributeBase(AttributeBase object) {
				return createAttributeBaseAdapter();
			}
			@Override
			public Adapter caseRelationClassBase(IRelationClass object) {
				return createRelationClassBaseAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.metamodel.MetamodelBase <em>MetamodelBase Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.metamodel.MetamodelBase
	 * @generated
	 */
	public Adapter createMetamodelBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.metamodel.ITemplate <em>ITemplate Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.metamodel.ITemplate
	 * @generated
	 */
	public Adapter createTemplateBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase <em>References Model Object Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.metamodel.ReferencesModelObjectBase
	 * @generated
	 */
	public Adapter createReferencesModelObjectBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.metamodel.ObjectClass <em>Object Class Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.metamodel.ObjectClass
	 * @generated
	 */
	public Adapter createObjectClassBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.metamodel.AttributeBase <em>AttributeBase Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.metamodel.AttributeBase
	 * @generated
	 */
	public Adapter createAttributeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.rulez.magwas.zenta.metamodel.IRelationClass <em>Relation Class Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.rulez.magwas.zenta.metamodel.IRelationClass
	 * @generated
	 */
	public Adapter createRelationClassBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MetamodelBaseAdapterFactory
