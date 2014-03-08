/**
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNull;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.handmade.BuiltinTemplate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MetamodelBase Base</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IMetamodel#getTemplates <em>Templates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getMetamodel()
 * @model
 * @generated
 */
public interface IMetamodel extends EObject {
	/**
	 * Returns the value of the '<em><b>Templates</b></em>' containment reference list.
	 * The list contents are of type {@link org.rulez.magwas.zenta.model.ITemplate}.
	 * It is bidirectional and its opposite is '{@link org.rulez.magwas.zenta.model.ITemplate#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Templates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Templates</em>' containment reference list.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getMetamodel_Templates()
	 * @see org.rulez.magwas.zenta.model.ITemplate#getMetamodel
	 * @model opposite="metamodel" containment="true"
	 * @generated
	 */
	EList<ITemplate> getTemplates();

    @NonNull IZentaModel getModel();
    
    @NonNull IBasicObject getClassById(@NonNull String classId);
    @NonNull IBasicObject getBuiltinObjectClass();
    @NonNull IBasicRelationship getBuiltinRelationClass();
	
    @NonNull BuiltinTemplate getBuiltinTemplate();
    ITemplate getTemplateFor(@NonNull IDiagramModel dm);
    ITemplate findTemplateFor(@NonNull IDiagramModelComponent element);
    
    @NonNull NonNullList<IBasicObject> getObjectClasses();
    @NonNull NonNullList<IBasicRelationship> getRelationClasses();
    @NonNull NonNullList<IBasicObject> getConnectorClasses();
	
    @NonNull NonNullList<IBasicRelationship> getRelationships(@NonNull IBasicObject object);
    @NonNull NonNullList<IBasicRelationship> getWeaklist();
    boolean isValidRelationship(@NonNull IBasicObject element1, @NonNull IBasicObject element2,
			@NonNull IBasicRelationship relationshipClass);

} // MetamodelBase
