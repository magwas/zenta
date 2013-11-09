/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.rulez.magwas.zenta.model.IZentamatePackage
 * @generated
 */
public interface IZentamateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IZentamateFactory eINSTANCE = org.rulez.magwas.zenta.model.impl.ZentamateFactory.init();

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
	IZentamateModel createZentamateModel();

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
	 * Returns a new object of class '<em>Association Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Association Relationship</em>'.
	 * @generated
	 */
	IAssociationRelationship createAssociationRelationship();

	/**
	 * Returns a new object of class '<em>Specialisation Relationship</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specialisation Relationship</em>'.
	 * @generated
	 */
	ISpecialisationRelationship createSpecialisationRelationship();

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
	 * @generated
	 */
	IZentamateDiagramModel createZentamateDiagramModel();

	/**
	 * Returns a new object of class '<em>Diagram Model Zentamate Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Zentamate Object</em>'.
	 * @generated
	 */
	IDiagramModelZentamateObject createDiagramModelZentamateObject();

	/**
	 * Returns a new object of class '<em>Diagram Model Zentamate Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diagram Model Zentamate Connection</em>'.
	 * @generated
	 */
	IDiagramModelZentamateConnection createDiagramModelZentamateConnection();

	/**
	 * Returns a new object of class '<em>Business Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Business Object</em>'.
	 * @generated
	 */
	IBusinessObject createBusinessObject();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	IZentamatePackage getZentamatePackage();

} //IZentamateFactory
