/**
 */
package org.rulez.magwas.zenta.model;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>References Model Object Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IReferencesModelObject#getReference <em>Reference</em>}</li>
 *   <li>{@link org.rulez.magwas.zenta.model.IReferencesModelObject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getReferencesModelObject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IReferencesModelObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(IIdentifier)
	 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getReferencesModelObject_Reference()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	IIdentifier getReference();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IReferencesModelObject#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(IIdentifier value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.rulez.magwas.zenta.model.IMetamodelPackage#getReferencesModelObject_Name()
	 * @model required="true" derived="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.rulez.magwas.zenta.model.IReferencesModelObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	ITemplate getTemplate();

	IIdentifier create(IFolder folder);

	void postCreate(IIdentifier createdObj, IFolder folder);
	
	IMetamodel getMetamodel();

	boolean isInstance(IIdentifier relation);
	
	String getId();
	
	public abstract List<IReferencesModelObject> getAncestry(List<IReferencesModelObject> ancestry);

	public abstract List<IReferencesModelObject> getAncestry();

} // ReferencesModelObjectBase
