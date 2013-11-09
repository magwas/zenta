/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.bolton.archimate.model.IArchimateFactory
 * @model kind="package"
 * @generated
 */
public interface IArchimatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model"; //$NON-NLS-1$

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bolton.ac.uk/archimate"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "archimate"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IArchimatePackage eINSTANCE = uk.ac.bolton.archimate.model.impl.ArchimatePackage.init();

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IAdapter <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IAdapter
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getAdapter()
	 * @generated
	 */
	int ADAPTER = 0;

	/**
	 * The number of structural features of the '<em>Adapter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADAPTER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IIdentifier <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IIdentifier
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.Property <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.Property
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Generated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__GENERATED = 2;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IProperties <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IProperties
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getProperties()
	 * @generated
	 */
	int PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.INameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.INameable
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getNameable()
	 * @generated
	 */
	int NAMEABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.ITextContent <em>Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.ITextContent
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getTextContent()
	 * @generated
	 */
	int TEXT_CONTENT = 5;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT__CONTENT = 0;

	/**
	 * The number of structural features of the '<em>Text Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_CONTENT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IDocumentable <em>Documentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IDocumentable
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDocumentable()
	 * @generated
	 */
	int DOCUMENTABLE = 6;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE__DOCUMENTATION = 0;

	/**
	 * The number of structural features of the '<em>Documentable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENTABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.ICloneable <em>Cloneable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.ICloneable
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getCloneable()
	 * @generated
	 */
	int CLONEABLE = 7;

	/**
	 * The number of structural features of the '<em>Cloneable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLONEABLE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IFolderContainer <em>Folder Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IFolderContainer
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFolderContainer()
	 * @generated
	 */
	int FOLDER_CONTAINER = 8;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONTAINER__FOLDERS = 0;

	/**
	 * The number of structural features of the '<em>Folder Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_CONTAINER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.ArchimateModel <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.ArchimateModel
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateModel()
	 * @generated
	 */
	int ARCHIMATE_MODEL = 9;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__FOLDERS = FOLDER_CONTAINER__FOLDERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__NAME = FOLDER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__ID = FOLDER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__ARCHIMATE_MODEL = FOLDER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__PROPERTIES = FOLDER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__PURPOSE = FOLDER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__FILE = FOLDER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL__VERSION = FOLDER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_FEATURE_COUNT = FOLDER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IArchimateModelElement <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IArchimateModelElement
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateModelElement()
	 * @generated
	 */
	int ARCHIMATE_MODEL_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL = ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT = ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.Folder <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.Folder
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFolder()
	 * @generated
	 */
	int FOLDER = 11;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ARCHIMATE_MODEL = ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FOLDERS = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DOCUMENTATION = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PROPERTIES = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ELEMENTS = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__TYPE = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.ArchimateElement <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.ArchimateElement
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateElement()
	 * @generated
	 */
	int ARCHIMATE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__ID = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__NAME = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__DOCUMENTATION = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT__PROPERTIES = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_ELEMENT_FEATURE_COUNT = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IJunctionElement <em>Junction Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IJunctionElement
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getJunctionElement()
	 * @generated
	 */
	int JUNCTION_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Junction Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IInterfaceElement <em>Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IInterfaceElement
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getInterfaceElement()
	 * @generated
	 */
	int INTERFACE_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__INTERFACE_TYPE = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.Junction <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.Junction
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getJunction()
	 * @generated
	 */
	int JUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ARCHIMATE_MODEL = JUNCTION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ID = JUNCTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__DOCUMENTATION = JUNCTION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PROPERTIES = JUNCTION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.AndJunction <em>And Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.AndJunction
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getAndJunction()
	 * @generated
	 */
	int AND_JUNCTION = 16;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__ARCHIMATE_MODEL = JUNCTION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__ID = JUNCTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__DOCUMENTATION = JUNCTION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__PROPERTIES = JUNCTION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>And Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.OrJunction <em>Or Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.OrJunction
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getOrJunction()
	 * @generated
	 */
	int OR_JUNCTION = 17;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__ARCHIMATE_MODEL = JUNCTION_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__ID = JUNCTION_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__DOCUMENTATION = JUNCTION_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__PROPERTIES = JUNCTION_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Or Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.Relationship <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.Relationship
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 18;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = ARCHIMATE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.AssociationRelationship <em>Association Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.AssociationRelationship
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getAssociationRelationship()
	 * @generated
	 */
	int ASSOCIATION_RELATIONSHIP = 19;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Association Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.SpecialisationRelationship <em>Specialisation Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.SpecialisationRelationship
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSpecialisationRelationship()
	 * @generated
	 */
	int SPECIALISATION_RELATIONSHIP = 20;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__ARCHIMATE_MODEL = RELATIONSHIP__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__ID = RELATIONSHIP__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__DOCUMENTATION = RELATIONSHIP__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__PROPERTIES = RELATIONSHIP__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The number of structural features of the '<em>Specialisation Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALISATION_RELATIONSHIP_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IBusinessLayerElement <em>Business Layer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IBusinessLayerElement
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBusinessLayerElement()
	 * @generated
	 */
	int BUSINESS_LAYER_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL = ARCHIMATE_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__ID = ARCHIMATE_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__NAME = ARCHIMATE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__DOCUMENTATION = ARCHIMATE_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT__PROPERTIES = ARCHIMATE_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Layer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_LAYER_ELEMENT_FEATURE_COUNT = ARCHIMATE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelComponent <em>Diagram Model Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelComponent
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelComponent()
	 * @generated
	 */
	int DIAGRAM_MODEL_COMPONENT = 22;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__NAME = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Model Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IDiagramModelContainer <em>Diagram Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IDiagramModelContainer
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelContainer()
	 * @generated
	 */
	int DIAGRAM_MODEL_CONTAINER = 23;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__CHILDREN = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModel <em>Diagram Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModel
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModel()
	 * @generated
	 */
	int DIAGRAM_MODEL = 24;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__ARCHIMATE_MODEL = ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__ID = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__NAME = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__DIAGRAM_MODEL = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__CHILDREN = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__DOCUMENTATION = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__PROPERTIES = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_FEATURE_COUNT = ARCHIMATE_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject <em>Diagram Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelObject
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelObject()
	 * @generated
	 */
	int DIAGRAM_MODEL_OBJECT = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__FONT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__FONT_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__TEXT_POSITION = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__BOUNDS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__FILL_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Diagram Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelReference <em>Diagram Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelReference
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelReference()
	 * @generated
	 */
	int DIAGRAM_MODEL_REFERENCE = 25;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Referenced Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelGroup <em>Diagram Model Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelGroup
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelGroup()
	 * @generated
	 */
	int DIAGRAM_MODEL_GROUP = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__CHILDREN = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__DOCUMENTATION = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__PROPERTIES = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Model Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelNote <em>Diagram Model Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelNote
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelNote()
	 * @generated
	 */
	int DIAGRAM_MODEL_NOTE = 28;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__CONTENT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Note</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelImage <em>Diagram Model Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelImage
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelImage()
	 * @generated
	 */
	int DIAGRAM_MODEL_IMAGE = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__BORDER_COLOR = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__IMAGE_PATH = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Diagram Model Image</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection <em>Diagram Model Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelConnection
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelConnection()
	 * @generated
	 */
	int DIAGRAM_MODEL_CONNECTION = 30;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__FONT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__FONT_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TEXT_POSITION = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__PROPERTIES = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__DOCUMENTATION = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TEXT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__SOURCE = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TARGET = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__BENDPOINTS = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__LINE_WIDTH = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__LINE_COLOR = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TYPE = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Diagram Model Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint <em>Diagram Model Bendpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelBendpoint()
	 * @generated
	 */
	int DIAGRAM_MODEL_BENDPOINT = 31;

	/**
	 * The feature id for the '<em><b>Start X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__START_X = CLONEABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__START_Y = CLONEABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__END_X = CLONEABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT__END_Y = CLONEABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Diagram Model Bendpoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_BENDPOINT_FEATURE_COUNT = CLONEABLE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IFontAttribute <em>Font Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IFontAttribute
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFontAttribute()
	 * @generated
	 */
	int FONT_ATTRIBUTE = 32;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE__FONT = 0;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE__FONT_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE__TEXT_ALIGNMENT = 2;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE__TEXT_POSITION = 3;

	/**
	 * The number of structural features of the '<em>Font Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FONT_ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.BorderObject <em>Border Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.BorderObject
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBorderObject()
	 * @generated
	 */
	int BORDER_OBJECT = 33;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OBJECT__BORDER_COLOR = 0;

	/**
	 * The number of structural features of the '<em>Border Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BORDER_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.IDiagramModelImageProvider
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelImageProvider()
	 * @generated
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER = 34;

	/**
	 * The feature id for the '<em><b>Image Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH = 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Image Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.Bounds <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.Bounds
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBounds()
	 * @generated
	 */
	int BOUNDS = 35;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__Y = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS__HEIGHT = 3;

	/**
	 * The number of structural features of the '<em>Bounds</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.ILockable <em>Lockable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.ILockable
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getLockable()
	 * @generated
	 */
	int LOCKABLE = 36;

	/**
	 * The feature id for the '<em><b>Locked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKABLE__LOCKED = 0;

	/**
	 * The number of structural features of the '<em>Lockable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCKABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.ArchimateDiagramModel <em>Diagram Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.ArchimateDiagramModel
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateDiagramModel()
	 * @generated
	 */
	int ARCHIMATE_DIAGRAM_MODEL = 37;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__ARCHIMATE_MODEL = DIAGRAM_MODEL__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__ID = DIAGRAM_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__NAME = DIAGRAM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__DIAGRAM_MODEL = DIAGRAM_MODEL__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__CHILDREN = DIAGRAM_MODEL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__DOCUMENTATION = DIAGRAM_MODEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__PROPERTIES = DIAGRAM_MODEL__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT = DIAGRAM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHIMATE_DIAGRAM_MODEL_FEATURE_COUNT = DIAGRAM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelArchimateObject <em>Diagram Model Archimate Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelArchimateObject
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelArchimateObject()
	 * @generated
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT = 38;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__CHILDREN = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Archimate Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Model Archimate Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_OBJECT_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelArchimateConnection <em>Diagram Model Archimate Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.DiagramModelArchimateConnection
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelArchimateConnection()
	 * @generated
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION = 39;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__ID = DIAGRAM_MODEL_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__NAME = DIAGRAM_MODEL_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__DIAGRAM_MODEL = DIAGRAM_MODEL_CONNECTION__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__FONT = DIAGRAM_MODEL_CONNECTION__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__FONT_COLOR = DIAGRAM_MODEL_CONNECTION__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TEXT_ALIGNMENT = DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TEXT_POSITION = DIAGRAM_MODEL_CONNECTION__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__PROPERTIES = DIAGRAM_MODEL_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__DOCUMENTATION = DIAGRAM_MODEL_CONNECTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TEXT = DIAGRAM_MODEL_CONNECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__SOURCE = DIAGRAM_MODEL_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TARGET = DIAGRAM_MODEL_CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__BENDPOINTS = DIAGRAM_MODEL_CONNECTION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__LINE_WIDTH = DIAGRAM_MODEL_CONNECTION__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__LINE_COLOR = DIAGRAM_MODEL_CONNECTION__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__TYPE = DIAGRAM_MODEL_CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP = DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Archimate Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ARCHIMATE_CONNECTION_FEATURE_COUNT = DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.BusinessObject <em>Business Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.BusinessObject
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBusinessObject()
	 * @generated
	 */
	int BUSINESS_OBJECT = 40;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ARCHIMATE_MODEL = BUSINESS_LAYER_ELEMENT__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__ID = BUSINESS_LAYER_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__NAME = BUSINESS_LAYER_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__DOCUMENTATION = BUSINESS_LAYER_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT__PROPERTIES = BUSINESS_LAYER_ELEMENT__PROPERTIES;

	/**
	 * The number of structural features of the '<em>Business Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUSINESS_OBJECT_FEATURE_COUNT = BUSINESS_LAYER_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.SketchModel <em>Sketch Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.SketchModel
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSketchModel()
	 * @generated
	 */
	int SKETCH_MODEL = 41;

	/**
	 * The feature id for the '<em><b>Archimate Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__ARCHIMATE_MODEL = DIAGRAM_MODEL__ARCHIMATE_MODEL;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__ID = DIAGRAM_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__NAME = DIAGRAM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__DIAGRAM_MODEL = DIAGRAM_MODEL__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__CHILDREN = DIAGRAM_MODEL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__DOCUMENTATION = DIAGRAM_MODEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__PROPERTIES = DIAGRAM_MODEL__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__CONNECTION_ROUTER_TYPE = DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__BACKGROUND = DIAGRAM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sketch Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_FEATURE_COUNT = DIAGRAM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.SketchModelSticky <em>Sketch Model Sticky</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.SketchModelSticky
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSketchModelSticky()
	 * @generated
	 */
	int SKETCH_MODEL_STICKY = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__CHILDREN = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__CONTENT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__PROPERTIES = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Sketch Model Sticky</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.impl.SketchModelActor <em>Sketch Model Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.impl.SketchModelActor
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSketchModelActor()
	 * @generated
	 */
	int SKETCH_MODEL_ACTOR = 43;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__DOCUMENTATION = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__PROPERTIES = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sketch Model Actor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link uk.ac.bolton.archimate.model.FolderType <em>Folder Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see uk.ac.bolton.archimate.model.FolderType
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFolderType()
	 * @generated
	 */
	int FOLDER_TYPE = 44;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFile()
	 * @generated
	 */
	int FILE = 45;


	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see uk.ac.bolton.archimate.model.IAdapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see uk.ac.bolton.archimate.model.IIdentifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IIdentifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see uk.ac.bolton.archimate.model.IIdentifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see uk.ac.bolton.archimate.model.IProperty
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see uk.ac.bolton.archimate.model.IProperty#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see uk.ac.bolton.archimate.model.IProperty#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IProperty#isGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see uk.ac.bolton.archimate.model.IProperty#isGenerated()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Generated();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see uk.ac.bolton.archimate.model.IProperties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.bolton.archimate.model.IProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see uk.ac.bolton.archimate.model.IProperties#getProperties()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Properties();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.INameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see uk.ac.bolton.archimate.model.INameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.INameable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see uk.ac.bolton.archimate.model.INameable#getName()
	 * @see #getNameable()
	 * @generated
	 */
	EAttribute getNameable_Name();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.ITextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content</em>'.
	 * @see uk.ac.bolton.archimate.model.ITextContent
	 * @generated
	 */
	EClass getTextContent();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.ITextContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see uk.ac.bolton.archimate.model.ITextContent#getContent()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Content();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDocumentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentable</em>'.
	 * @see uk.ac.bolton.archimate.model.IDocumentable
	 * @generated
	 */
	EClass getDocumentable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDocumentable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see uk.ac.bolton.archimate.model.IDocumentable#getDocumentation()
	 * @see #getDocumentable()
	 * @generated
	 */
	EAttribute getDocumentable_Documentation();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.ICloneable <em>Cloneable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloneable</em>'.
	 * @see uk.ac.bolton.archimate.model.ICloneable
	 * @generated
	 */
	EClass getCloneable();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IFolderContainer <em>Folder Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Container</em>'.
	 * @see uk.ac.bolton.archimate.model.IFolderContainer
	 * @generated
	 */
	EClass getFolderContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.bolton.archimate.model.IFolderContainer#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see uk.ac.bolton.archimate.model.IFolderContainer#getFolders()
	 * @see #getFolderContainer()
	 * @generated
	 */
	EReference getFolderContainer_Folders();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IArchimateModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateModel
	 * @generated
	 */
	EClass getArchimateModel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IArchimateModel#getPurpose <em>Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Purpose</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateModel#getPurpose()
	 * @see #getArchimateModel()
	 * @generated
	 */
	EAttribute getArchimateModel_Purpose();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IArchimateModel#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateModel#getFile()
	 * @see #getArchimateModel()
	 * @generated
	 */
	EAttribute getArchimateModel_File();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IArchimateModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateModel#getVersion()
	 * @see #getArchimateModel()
	 * @generated
	 */
	EAttribute getArchimateModel_Version();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IArchimateModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateModelElement
	 * @generated
	 */
	EClass getArchimateModelElement();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IArchimateModelElement#getArchimateModel <em>Archimate Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Archimate Model</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateModelElement#getArchimateModel()
	 * @see #getArchimateModelElement()
	 * @generated
	 */
	EReference getArchimateModelElement_ArchimateModel();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see uk.ac.bolton.archimate.model.IFolder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.bolton.archimate.model.IFolder#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see uk.ac.bolton.archimate.model.IFolder#getElements()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Elements();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IFolder#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.bolton.archimate.model.IFolder#getType()
	 * @see #getFolder()
	 * @generated
	 */
	EAttribute getFolder_Type();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IArchimateElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateElement
	 * @generated
	 */
	EClass getArchimateElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IJunctionElement <em>Junction Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction Element</em>'.
	 * @see uk.ac.bolton.archimate.model.IJunctionElement
	 * @generated
	 */
	EClass getJunctionElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IInterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Element</em>'.
	 * @see uk.ac.bolton.archimate.model.IInterfaceElement
	 * @generated
	 */
	EClass getInterfaceElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IInterfaceElement#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see uk.ac.bolton.archimate.model.IInterfaceElement#getInterfaceType()
	 * @see #getInterfaceElement()
	 * @generated
	 */
	EAttribute getInterfaceElement_InterfaceType();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IJunction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see uk.ac.bolton.archimate.model.IJunction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IAndJunction <em>And Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Junction</em>'.
	 * @see uk.ac.bolton.archimate.model.IAndJunction
	 * @generated
	 */
	EClass getAndJunction();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IOrJunction <em>Or Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Junction</em>'.
	 * @see uk.ac.bolton.archimate.model.IOrJunction
	 * @generated
	 */
	EClass getOrJunction();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see uk.ac.bolton.archimate.model.IRelationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uk.ac.bolton.archimate.model.IRelationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uk.ac.bolton.archimate.model.IRelationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IAssociationRelationship <em>Association Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Relationship</em>'.
	 * @see uk.ac.bolton.archimate.model.IAssociationRelationship
	 * @generated
	 */
	EClass getAssociationRelationship();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.ISpecialisationRelationship <em>Specialisation Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specialisation Relationship</em>'.
	 * @see uk.ac.bolton.archimate.model.ISpecialisationRelationship
	 * @generated
	 */
	EClass getSpecialisationRelationship();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IBusinessLayerElement <em>Business Layer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Layer Element</em>'.
	 * @see uk.ac.bolton.archimate.model.IBusinessLayerElement
	 * @generated
	 */
	EClass getBusinessLayerElement();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelComponent <em>Diagram Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Component</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelComponent
	 * @generated
	 */
	EClass getDiagramModelComponent();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IDiagramModelComponent#getDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Model</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelComponent#getDiagramModel()
	 * @see #getDiagramModelComponent()
	 * @generated
	 */
	EReference getDiagramModelComponent_DiagramModel();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelContainer <em>Diagram Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Container</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelContainer
	 * @generated
	 */
	EClass getDiagramModelContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.bolton.archimate.model.IDiagramModelContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelContainer#getChildren()
	 * @see #getDiagramModelContainer()
	 * @generated
	 */
	EReference getDiagramModelContainer_Children();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModel
	 * @generated
	 */
	EClass getDiagramModel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModel#getConnectionRouterType <em>Connection Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Router Type</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModel#getConnectionRouterType()
	 * @see #getDiagramModel()
	 * @generated
	 */
	EAttribute getDiagramModel_ConnectionRouterType();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelReference <em>Diagram Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Reference</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelReference
	 * @generated
	 */
	EClass getDiagramModelReference();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IDiagramModelReference#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Model</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelReference#getReferencedModel()
	 * @see #getDiagramModelReference()
	 * @generated
	 */
	EReference getDiagramModelReference_ReferencedModel();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelObject <em>Diagram Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Object</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelObject
	 * @generated
	 */
	EClass getDiagramModelObject();

	/**
	 * Returns the meta object for the containment reference '{@link uk.ac.bolton.archimate.model.IDiagramModelObject#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelObject#getBounds()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_Bounds();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.bolton.archimate.model.IDiagramModelObject#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Connections</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelObject#getSourceConnections()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_SourceConnections();

	/**
	 * Returns the meta object for the reference list '{@link uk.ac.bolton.archimate.model.IDiagramModelObject#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Connections</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelObject#getTargetConnections()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_TargetConnections();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelObject#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelObject#getFillColor()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EAttribute getDiagramModelObject_FillColor();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelGroup <em>Diagram Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Group</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelGroup
	 * @generated
	 */
	EClass getDiagramModelGroup();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelNote <em>Diagram Model Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Note</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelNote
	 * @generated
	 */
	EClass getDiagramModelNote();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelImage <em>Diagram Model Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Image</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelImage
	 * @generated
	 */
	EClass getDiagramModelImage();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection <em>Diagram Model Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Connection</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection
	 * @generated
	 */
	EClass getDiagramModelConnection();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection#getText()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_Text();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection#getSource()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection#getTarget()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bendpoints</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection#getBendpoints()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection#getLineWidth()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection#getLineColor()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_LineColor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelConnection#getType()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_Type();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelBendpoint <em>Diagram Model Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Bendpoint</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelBendpoint
	 * @generated
	 */
	EClass getDiagramModelBendpoint();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getStartX <em>Start X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start X</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getStartX()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_StartX();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getStartY <em>Start Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Y</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getStartY()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_StartY();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getEndX()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_EndX();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelBendpoint#getEndY()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_EndY();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IFontAttribute <em>Font Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Attribute</em>'.
	 * @see uk.ac.bolton.archimate.model.IFontAttribute
	 * @generated
	 */
	EClass getFontAttribute();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IFontAttribute#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see uk.ac.bolton.archimate.model.IFontAttribute#getFont()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_Font();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IFontAttribute#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see uk.ac.bolton.archimate.model.IFontAttribute#getFontColor()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IFontAttribute#getTextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Alignment</em>'.
	 * @see uk.ac.bolton.archimate.model.IFontAttribute#getTextAlignment()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_TextAlignment();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IFontAttribute#getTextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Position</em>'.
	 * @see uk.ac.bolton.archimate.model.IFontAttribute#getTextPosition()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_TextPosition();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IBorderObject <em>Border Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Object</em>'.
	 * @see uk.ac.bolton.archimate.model.IBorderObject
	 * @generated
	 */
	EClass getBorderObject();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IBorderObject#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see uk.ac.bolton.archimate.model.IBorderObject#getBorderColor()
	 * @see #getBorderObject()
	 * @generated
	 */
	EAttribute getBorderObject_BorderColor();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Image Provider</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelImageProvider
	 * @generated
	 */
	EClass getDiagramModelImageProvider();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelImageProvider#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelImageProvider#getImagePath()
	 * @see #getDiagramModelImageProvider()
	 * @generated
	 */
	EAttribute getDiagramModelImageProvider_ImagePath();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see uk.ac.bolton.archimate.model.IBounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IBounds#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see uk.ac.bolton.archimate.model.IBounds#getX()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_X();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IBounds#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see uk.ac.bolton.archimate.model.IBounds#getY()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Y();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IBounds#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see uk.ac.bolton.archimate.model.IBounds#getWidth()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Width();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IBounds#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see uk.ac.bolton.archimate.model.IBounds#getHeight()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Height();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.ILockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lockable</em>'.
	 * @see uk.ac.bolton.archimate.model.ILockable
	 * @generated
	 */
	EClass getLockable();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.ILockable#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see uk.ac.bolton.archimate.model.ILockable#isLocked()
	 * @see #getLockable()
	 * @generated
	 */
	EAttribute getLockable_Locked();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IArchimateDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateDiagramModel
	 * @generated
	 */
	EClass getArchimateDiagramModel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IArchimateDiagramModel#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see uk.ac.bolton.archimate.model.IArchimateDiagramModel#getViewpoint()
	 * @see #getArchimateDiagramModel()
	 * @generated
	 */
	EAttribute getArchimateDiagramModel_Viewpoint();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelArchimateObject <em>Diagram Model Archimate Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Archimate Object</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelArchimateObject
	 * @generated
	 */
	EClass getDiagramModelArchimateObject();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IDiagramModelArchimateObject#getArchimateElement <em>Archimate Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Archimate Element</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelArchimateObject#getArchimateElement()
	 * @see #getDiagramModelArchimateObject()
	 * @generated
	 */
	EReference getDiagramModelArchimateObject_ArchimateElement();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.IDiagramModelArchimateObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelArchimateObject#getType()
	 * @see #getDiagramModelArchimateObject()
	 * @generated
	 */
	EAttribute getDiagramModelArchimateObject_Type();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection <em>Diagram Model Archimate Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Archimate Connection</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection
	 * @generated
	 */
	EClass getDiagramModelArchimateConnection();

	/**
	 * Returns the meta object for the reference '{@link uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection#getRelationship()
	 * @see #getDiagramModelArchimateConnection()
	 * @generated
	 */
	EReference getDiagramModelArchimateConnection_Relationship();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.IBusinessObject <em>Business Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Business Object</em>'.
	 * @see uk.ac.bolton.archimate.model.IBusinessObject
	 * @generated
	 */
	EClass getBusinessObject();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.ISketchModel <em>Sketch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model</em>'.
	 * @see uk.ac.bolton.archimate.model.ISketchModel
	 * @generated
	 */
	EClass getSketchModel();

	/**
	 * Returns the meta object for the attribute '{@link uk.ac.bolton.archimate.model.ISketchModel#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see uk.ac.bolton.archimate.model.ISketchModel#getBackground()
	 * @see #getSketchModel()
	 * @generated
	 */
	EAttribute getSketchModel_Background();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.ISketchModelSticky <em>Sketch Model Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model Sticky</em>'.
	 * @see uk.ac.bolton.archimate.model.ISketchModelSticky
	 * @generated
	 */
	EClass getSketchModelSticky();

	/**
	 * Returns the meta object for class '{@link uk.ac.bolton.archimate.model.ISketchModelActor <em>Sketch Model Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model Actor</em>'.
	 * @see uk.ac.bolton.archimate.model.ISketchModelActor
	 * @generated
	 */
	EClass getSketchModelActor();

	/**
	 * Returns the meta object for enum '{@link uk.ac.bolton.archimate.model.FolderType <em>Folder Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Folder Type</em>'.
	 * @see uk.ac.bolton.archimate.model.FolderType
	 * @generated
	 */
	EEnum getFolderType();

	/**
	 * Returns the meta object for data type '{@link java.io.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>File</em>'.
	 * @see java.io.File
	 * @model instanceClass="java.io.File" serializeable="false"
	 * @generated
	 */
	EDataType getFile();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IArchimateFactory getArchimateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IAdapter <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IAdapter
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IIdentifier <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IIdentifier
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getIdentifier()
		 * @generated
		 */
		EClass IDENTIFIER = eINSTANCE.getIdentifier();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIER__ID = eINSTANCE.getIdentifier_Id();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.Property <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.Property
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '<em><b>Generated</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__GENERATED = eINSTANCE.getProperty_Generated();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IProperties <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IProperties
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPERTIES = eINSTANCE.getProperties_Properties();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.INameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.INameable
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getNameable()
		 * @generated
		 */
		EClass NAMEABLE = eINSTANCE.getNameable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE__NAME = eINSTANCE.getNameable_Name();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.ITextContent <em>Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.ITextContent
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getTextContent()
		 * @generated
		 */
		EClass TEXT_CONTENT = eINSTANCE.getTextContent();

		/**
		 * The meta object literal for the '<em><b>Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_CONTENT__CONTENT = eINSTANCE.getTextContent_Content();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IDocumentable <em>Documentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IDocumentable
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDocumentable()
		 * @generated
		 */
		EClass DOCUMENTABLE = eINSTANCE.getDocumentable();

		/**
		 * The meta object literal for the '<em><b>Documentation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENTABLE__DOCUMENTATION = eINSTANCE.getDocumentable_Documentation();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.ICloneable <em>Cloneable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.ICloneable
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getCloneable()
		 * @generated
		 */
		EClass CLONEABLE = eINSTANCE.getCloneable();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IFolderContainer <em>Folder Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IFolderContainer
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFolderContainer()
		 * @generated
		 */
		EClass FOLDER_CONTAINER = eINSTANCE.getFolderContainer();

		/**
		 * The meta object literal for the '<em><b>Folders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER_CONTAINER__FOLDERS = eINSTANCE.getFolderContainer_Folders();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.ArchimateModel <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.ArchimateModel
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateModel()
		 * @generated
		 */
		EClass ARCHIMATE_MODEL = eINSTANCE.getArchimateModel();

		/**
		 * The meta object literal for the '<em><b>Purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_MODEL__PURPOSE = eINSTANCE.getArchimateModel_Purpose();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_MODEL__FILE = eINSTANCE.getArchimateModel_File();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_MODEL__VERSION = eINSTANCE.getArchimateModel_Version();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IArchimateModelElement <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IArchimateModelElement
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateModelElement()
		 * @generated
		 */
		EClass ARCHIMATE_MODEL_ELEMENT = eINSTANCE.getArchimateModelElement();

		/**
		 * The meta object literal for the '<em><b>Archimate Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL = eINSTANCE.getArchimateModelElement_ArchimateModel();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.Folder <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.Folder
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFolder()
		 * @generated
		 */
		EClass FOLDER = eINSTANCE.getFolder();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOLDER__ELEMENTS = eINSTANCE.getFolder_Elements();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOLDER__TYPE = eINSTANCE.getFolder_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.ArchimateElement <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.ArchimateElement
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateElement()
		 * @generated
		 */
		EClass ARCHIMATE_ELEMENT = eINSTANCE.getArchimateElement();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IJunctionElement <em>Junction Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IJunctionElement
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getJunctionElement()
		 * @generated
		 */
		EClass JUNCTION_ELEMENT = eINSTANCE.getJunctionElement();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IInterfaceElement <em>Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IInterfaceElement
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getInterfaceElement()
		 * @generated
		 */
		EClass INTERFACE_ELEMENT = eINSTANCE.getInterfaceElement();

		/**
		 * The meta object literal for the '<em><b>Interface Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE_ELEMENT__INTERFACE_TYPE = eINSTANCE.getInterfaceElement_InterfaceType();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.Junction <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.Junction
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.AndJunction <em>And Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.AndJunction
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getAndJunction()
		 * @generated
		 */
		EClass AND_JUNCTION = eINSTANCE.getAndJunction();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.OrJunction <em>Or Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.OrJunction
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getOrJunction()
		 * @generated
		 */
		EClass OR_JUNCTION = eINSTANCE.getOrJunction();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.Relationship <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.Relationship
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.AssociationRelationship <em>Association Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.AssociationRelationship
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getAssociationRelationship()
		 * @generated
		 */
		EClass ASSOCIATION_RELATIONSHIP = eINSTANCE.getAssociationRelationship();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.SpecialisationRelationship <em>Specialisation Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.SpecialisationRelationship
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSpecialisationRelationship()
		 * @generated
		 */
		EClass SPECIALISATION_RELATIONSHIP = eINSTANCE.getSpecialisationRelationship();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IBusinessLayerElement <em>Business Layer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IBusinessLayerElement
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBusinessLayerElement()
		 * @generated
		 */
		EClass BUSINESS_LAYER_ELEMENT = eINSTANCE.getBusinessLayerElement();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelComponent <em>Diagram Model Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelComponent
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelComponent()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_COMPONENT = eINSTANCE.getDiagramModelComponent();

		/**
		 * The meta object literal for the '<em><b>Diagram Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL = eINSTANCE.getDiagramModelComponent_DiagramModel();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IDiagramModelContainer <em>Diagram Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IDiagramModelContainer
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelContainer()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_CONTAINER = eINSTANCE.getDiagramModelContainer();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONTAINER__CHILDREN = eINSTANCE.getDiagramModelContainer_Children();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModel <em>Diagram Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModel
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModel()
		 * @generated
		 */
		EClass DIAGRAM_MODEL = eINSTANCE.getDiagramModel();

		/**
		 * The meta object literal for the '<em><b>Connection Router Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = eINSTANCE.getDiagramModel_ConnectionRouterType();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelReference <em>Diagram Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelReference
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelReference()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_REFERENCE = eINSTANCE.getDiagramModelReference();

		/**
		 * The meta object literal for the '<em><b>Referenced Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL = eINSTANCE.getDiagramModelReference_ReferencedModel();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelObject <em>Diagram Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelObject
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelObject()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_OBJECT = eINSTANCE.getDiagramModelObject();

		/**
		 * The meta object literal for the '<em><b>Bounds</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_OBJECT__BOUNDS = eINSTANCE.getDiagramModelObject_Bounds();

		/**
		 * The meta object literal for the '<em><b>Source Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS = eINSTANCE.getDiagramModelObject_SourceConnections();

		/**
		 * The meta object literal for the '<em><b>Target Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS = eINSTANCE.getDiagramModelObject_TargetConnections();

		/**
		 * The meta object literal for the '<em><b>Fill Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_OBJECT__FILL_COLOR = eINSTANCE.getDiagramModelObject_FillColor();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelGroup <em>Diagram Model Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelGroup
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelGroup()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_GROUP = eINSTANCE.getDiagramModelGroup();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelNote <em>Diagram Model Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelNote
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelNote()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_NOTE = eINSTANCE.getDiagramModelNote();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelImage <em>Diagram Model Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelImage
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelImage()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_IMAGE = eINSTANCE.getDiagramModelImage();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelConnection <em>Diagram Model Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelConnection
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelConnection()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_CONNECTION = eINSTANCE.getDiagramModelConnection();

		/**
		 * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__TEXT = eINSTANCE.getDiagramModelConnection_Text();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONNECTION__SOURCE = eINSTANCE.getDiagramModelConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONNECTION__TARGET = eINSTANCE.getDiagramModelConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Bendpoints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_CONNECTION__BENDPOINTS = eINSTANCE.getDiagramModelConnection_Bendpoints();

		/**
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__LINE_WIDTH = eINSTANCE.getDiagramModelConnection_LineWidth();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__LINE_COLOR = eINSTANCE.getDiagramModelConnection_LineColor();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__TYPE = eINSTANCE.getDiagramModelConnection_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint <em>Diagram Model Bendpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelBendpoint
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelBendpoint()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_BENDPOINT = eINSTANCE.getDiagramModelBendpoint();

		/**
		 * The meta object literal for the '<em><b>Start X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__START_X = eINSTANCE.getDiagramModelBendpoint_StartX();

		/**
		 * The meta object literal for the '<em><b>Start Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__START_Y = eINSTANCE.getDiagramModelBendpoint_StartY();

		/**
		 * The meta object literal for the '<em><b>End X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__END_X = eINSTANCE.getDiagramModelBendpoint_EndX();

		/**
		 * The meta object literal for the '<em><b>End Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_BENDPOINT__END_Y = eINSTANCE.getDiagramModelBendpoint_EndY();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IFontAttribute <em>Font Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IFontAttribute
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFontAttribute()
		 * @generated
		 */
		EClass FONT_ATTRIBUTE = eINSTANCE.getFontAttribute();

		/**
		 * The meta object literal for the '<em><b>Font</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_ATTRIBUTE__FONT = eINSTANCE.getFontAttribute_Font();

		/**
		 * The meta object literal for the '<em><b>Font Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_ATTRIBUTE__FONT_COLOR = eINSTANCE.getFontAttribute_FontColor();

		/**
		 * The meta object literal for the '<em><b>Text Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_ATTRIBUTE__TEXT_ALIGNMENT = eINSTANCE.getFontAttribute_TextAlignment();

		/**
		 * The meta object literal for the '<em><b>Text Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FONT_ATTRIBUTE__TEXT_POSITION = eINSTANCE.getFontAttribute_TextPosition();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.BorderObject <em>Border Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.BorderObject
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBorderObject()
		 * @generated
		 */
		EClass BORDER_OBJECT = eINSTANCE.getBorderObject();

		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BORDER_OBJECT__BORDER_COLOR = eINSTANCE.getBorderObject_BorderColor();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.IDiagramModelImageProvider
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelImageProvider()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_IMAGE_PROVIDER = eINSTANCE.getDiagramModelImageProvider();

		/**
		 * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH = eINSTANCE.getDiagramModelImageProvider_ImagePath();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.Bounds <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.Bounds
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBounds()
		 * @generated
		 */
		EClass BOUNDS = eINSTANCE.getBounds();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__X = eINSTANCE.getBounds_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__Y = eINSTANCE.getBounds_Y();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__WIDTH = eINSTANCE.getBounds_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDS__HEIGHT = eINSTANCE.getBounds_Height();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.ILockable <em>Lockable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.ILockable
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getLockable()
		 * @generated
		 */
		EClass LOCKABLE = eINSTANCE.getLockable();

		/**
		 * The meta object literal for the '<em><b>Locked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCKABLE__LOCKED = eINSTANCE.getLockable_Locked();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.ArchimateDiagramModel <em>Diagram Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.ArchimateDiagramModel
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getArchimateDiagramModel()
		 * @generated
		 */
		EClass ARCHIMATE_DIAGRAM_MODEL = eINSTANCE.getArchimateDiagramModel();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT = eINSTANCE.getArchimateDiagramModel_Viewpoint();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelArchimateObject <em>Diagram Model Archimate Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelArchimateObject
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelArchimateObject()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_ARCHIMATE_OBJECT = eINSTANCE.getDiagramModelArchimateObject();

		/**
		 * The meta object literal for the '<em><b>Archimate Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT = eINSTANCE.getDiagramModelArchimateObject_ArchimateElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE = eINSTANCE.getDiagramModelArchimateObject_Type();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.DiagramModelArchimateConnection <em>Diagram Model Archimate Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.DiagramModelArchimateConnection
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getDiagramModelArchimateConnection()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_ARCHIMATE_CONNECTION = eINSTANCE.getDiagramModelArchimateConnection();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP = eINSTANCE.getDiagramModelArchimateConnection_Relationship();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.BusinessObject <em>Business Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.BusinessObject
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getBusinessObject()
		 * @generated
		 */
		EClass BUSINESS_OBJECT = eINSTANCE.getBusinessObject();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.SketchModel <em>Sketch Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.SketchModel
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSketchModel()
		 * @generated
		 */
		EClass SKETCH_MODEL = eINSTANCE.getSketchModel();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SKETCH_MODEL__BACKGROUND = eINSTANCE.getSketchModel_Background();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.SketchModelSticky <em>Sketch Model Sticky</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.SketchModelSticky
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSketchModelSticky()
		 * @generated
		 */
		EClass SKETCH_MODEL_STICKY = eINSTANCE.getSketchModelSticky();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.impl.SketchModelActor <em>Sketch Model Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.impl.SketchModelActor
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getSketchModelActor()
		 * @generated
		 */
		EClass SKETCH_MODEL_ACTOR = eINSTANCE.getSketchModelActor();

		/**
		 * The meta object literal for the '{@link uk.ac.bolton.archimate.model.FolderType <em>Folder Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see uk.ac.bolton.archimate.model.FolderType
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFolderType()
		 * @generated
		 */
		EEnum FOLDER_TYPE = eINSTANCE.getFolderType();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see uk.ac.bolton.archimate.model.impl.ArchimatePackage#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} //IArchimatePackage
