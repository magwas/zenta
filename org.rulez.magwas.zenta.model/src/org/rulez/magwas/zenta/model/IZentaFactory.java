/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.model.IZentaPackage
 * @generated
 */
public interface IZentaFactory extends EFactory {
	public class BuiltinClassShouldNotHaveAncestor extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IZentaFactory eINSTANCE = org.rulez.magwas.zenta.model.impl.ZentaFactoryBase.init();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	IProperty createProperty();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	IZentaModel createZentaModel();

	/**
	 * Returns a new object of class '<em>Folder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Folder</em>'.
	 * @generated
	 */
	IFolder createFolder();

	/**
	 * Returns a new object of class '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Junction</em>'.
	 * @generated
	 */
	IJunction createJunction();

	/**
	 * Returns a new object of class '<em>And Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>And Junction</em>'.
	 * @generated
	 */
	IAndJunction createAndJunction();

	/**
	 * Returns a new object of class '<em>Or Junction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Or Junction</em>'.
	 * @generated
	 */
	IOrJunction createOrJunction();

	/**
	 * Returns a new object of class '<em>Basic Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Relationship</em>'.
	 * @generated
	 */
	IBasicRelationship createBasicRelationship();

	IDiagramModelReference createDiagramModelReference();

	/**
	 * Returns a new object of class '<em>Diagram Model Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Group</em>'.
	 * @generated
	 */
	IDiagramModelGroup createDiagramModelGroup();

	/**
	 * Returns a new object of class '<em>Diagram Model Note</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Note</em>'.
	 * @generated
	 */
	IDiagramModelNote createDiagramModelNote();

	/**
	 * Returns a new object of class '<em>Diagram Model Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Image</em>'.
	 * @generated
	 */
	IDiagramModelImage createDiagramModelImage();

	/**
	 * Returns a new object of class '<em>Diagram Model Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Connection</em>'.
	 * @generated
	 */
	IDiagramModelConnection createDiagramModelConnection();

	/**
	 * Returns a new object of class '<em>Diagram Model Bendpoint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Bendpoint</em>'.
	 * @generated
	 */
	IDiagramModelBendpoint createDiagramModelBendpoint();

	/**
	 * Returns a new object of class '<em>Bounds</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bounds</em>'.
	 * @generated
	 */
	IBounds createBounds();
	
	/**
	 * Create a new Bounds object
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @return
	 */
	IBounds createBounds(int x, int y, int width, int height);

	/**
	 * Returns a new object of class '<em>Diagram Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model</em>'.
	 * @generated NOT
	 */
	@NonNull IZentaDiagramModel createZentaDiagramModel();

	/**
	 * Returns a new object of class '<em>Diagram Model Zenta Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Zenta Object</em>'.
	 * @generated
	 */
	IDiagramModelZentaObject createDiagramModelZentaObject();

	/**
	 * Returns a new object of class '<em>Diagram Model Zenta Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Zenta Connection</em>'.
	 * @generated
	 */
	IDiagramModelZentaConnection createDiagramModelZentaConnection();

	/**
	 * Returns a new object of class '<em>Basic Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Object</em>'.
	 * @generated
	 */
	IBasicObject createBasicObject();

	/**
	 * Returns a new object of class '<em>Sketch Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch Model</em>'.
	 * @generated
	 */
	ISketchModel createSketchModel();

	/**
	 * Returns a new object of class '<em>Sketch Model Sticky</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch Model Sticky</em>'.
	 * @generated
	 */
	ISketchModelSticky createSketchModelSticky();

	/**
	 * Returns a new object of class '<em>Sketch Model Actor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sketch Model Actor</em>'.
	 * @generated
	 */
	ISketchModelActor createSketchModelActor();

	/**
	 * Returns a new object of class '<em>Metamodel</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metamodel</em>'.
	 * @generated
	 */
	IMetamodel createMetamodel();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	ITemplate createTemplate();

	/**
	 * Returns a new object of class '<em>Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Attribute</em>'.
	 * @generated
	 */
	IAttribute createAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IZentaPackage getZentaPackage();

	@NonNull IMetamodel createMetamodel(@NonNull IZentaModel zentaModel);

	@NonNull String getDefiningName(@NonNull IIdentifier ref);

	@Nullable IMetamodel getMetamodelFor(@NonNull IZentaModelElement modelElement);

	@NonNull ITemplate createTemplate(@NonNull IZentaDiagramModel diagram, @NonNull IMetamodel metamodel);

	@Nullable IMetamodel findMetamodelFor(@NonNull IZentaModel model2);

} //IZentaFactory
