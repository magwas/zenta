/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see org.rulez.magwas.zenta.model.IZentaFactory
 * @model kind="package"
 * @generated
 */
public interface IZentaPackage extends EPackage {
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
	String eNS_URI = "http://magwas.rulez.org/zenta"; //$NON-NLS-1$

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "zenta"; //$NON-NLS-1$

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IZentaPackage eINSTANCE = org.rulez.magwas.zenta.model.impl.ZentaPackageBase.init();

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IAdapter <em>Adapter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IAdapter
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getAdapter()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.PropertyBase <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.PropertyBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getProperty()
	 * @generated
	 */
	int PROPERTY = 2;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IProperties <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IProperties
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getProperties()
	 * @generated
	 */
	int PROPERTIES = 3;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.INameable <em>Nameable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.INameable
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getNameable()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IIdentifier <em>Identifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IIdentifier
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getIdentifier()
	 * @generated
	 */
	int IDENTIFIER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__NAME = NAMEABLE__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER__ID = NAMEABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIER_FEATURE_COUNT = NAMEABLE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.ITextContent <em>Text Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.ITextContent
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getTextContent()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IDocumentable <em>Documentable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IDocumentable
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDocumentable()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.ICloneable <em>Cloneable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.ICloneable
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getCloneable()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IFolderContainer <em>Folder Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IFolderContainer
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFolderContainer()
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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.ZentaModelBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaModel()
	 * @generated
	 */
	int ZENTA_MODEL = 37;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IZentaModelElement <em>Model Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IZentaModelElement
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaModelElement()
	 * @generated
	 */
	int ZENTA_MODEL_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL_ELEMENT__ZENTA_MODEL = ADAPTER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL_ELEMENT_FEATURE_COUNT = ADAPTER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.FolderBase <em>Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.FolderBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFolder()
	 * @generated
	 */
	int FOLDER = 10;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ZENTA_MODEL = ZENTA_MODEL_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__FOLDERS = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__NAME = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ID = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__DOCUMENTATION = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__PROPERTIES = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER__ELEMENTS = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOLDER_FEATURE_COUNT = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.ZentaElementBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaElement()
	 * @generated
	 */
	int ZENTA_ELEMENT = 40;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_ELEMENT__ZENTA_MODEL = ZENTA_MODEL_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_ELEMENT__NAME = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_ELEMENT__ID = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_ELEMENT__DOCUMENTATION = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_ELEMENT__PROPERTIES = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_ELEMENT__DIAG_OBJECTS = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_ELEMENT_FEATURE_COUNT = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IJunctionElement <em>Junction Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IJunctionElement
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getJunctionElement()
	 * @generated
	 */
	int JUNCTION_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__ZENTA_MODEL = ZENTA_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__NAME = ZENTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__ID = ZENTA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__DOCUMENTATION = ZENTA_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__PROPERTIES = ZENTA_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT__DIAG_OBJECTS = ZENTA_ELEMENT__DIAG_OBJECTS;

	/**
	 * The number of structural features of the '<em>Junction Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_ELEMENT_FEATURE_COUNT = ZENTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IInterfaceElement <em>Interface Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IInterfaceElement
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getInterfaceElement()
	 * @generated
	 */
	int INTERFACE_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__ZENTA_MODEL = ZENTA_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__NAME = ZENTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__ID = ZENTA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__DOCUMENTATION = ZENTA_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__PROPERTIES = ZENTA_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__DIAG_OBJECTS = ZENTA_ELEMENT__DIAG_OBJECTS;

	/**
	 * The feature id for the '<em><b>Interface Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT__INTERFACE_TYPE = ZENTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interface Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_ELEMENT_FEATURE_COUNT = ZENTA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.JunctionBase <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.JunctionBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getJunction()
	 * @generated
	 */
	int JUNCTION = 13;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ZENTA_MODEL = JUNCTION_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ID = JUNCTION_ELEMENT__ID;

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
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__DIAG_OBJECTS = JUNCTION_ELEMENT__DIAG_OBJECTS;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.AndJunctionBase <em>And Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.AndJunctionBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getAndJunction()
	 * @generated
	 */
	int AND_JUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__ZENTA_MODEL = JUNCTION_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__ID = JUNCTION_ELEMENT__ID;

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
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION__DIAG_OBJECTS = JUNCTION_ELEMENT__DIAG_OBJECTS;

	/**
	 * The number of structural features of the '<em>And Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.OrJunctionBase <em>Or Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.OrJunctionBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getOrJunction()
	 * @generated
	 */
	int OR_JUNCTION = 15;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__ZENTA_MODEL = JUNCTION_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__NAME = JUNCTION_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__ID = JUNCTION_ELEMENT__ID;

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
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION__DIAG_OBJECTS = JUNCTION_ELEMENT__DIAG_OBJECTS;

	/**
	 * The number of structural features of the '<em>Or Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_JUNCTION_FEATURE_COUNT = JUNCTION_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.BasicRelationshipBase <em>Basic Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.BasicRelationshipBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBasicRelationship()
	 * @generated
	 */
	int BASIC_RELATIONSHIP = 42;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase <em>Diagram Model Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelComponent()
	 * @generated
	 */
	int DIAGRAM_MODEL_COMPONENT = 16;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__NAME = IDENTIFIER__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__ID = IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL = IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__LINE_WIDTH = IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT__LINE_COLOR = IDENTIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Model Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT = IDENTIFIER_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IDiagramModelContainer <em>Diagram Model Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IDiagramModelContainer
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelContainer()
	 * @generated
	 */
	int DIAGRAM_MODEL_CONTAINER = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__LINE_WIDTH = DIAGRAM_MODEL_COMPONENT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONTAINER__LINE_COLOR = DIAGRAM_MODEL_COMPONENT__LINE_COLOR;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase <em>Diagram Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModel()
	 * @generated
	 */
	int DIAGRAM_MODEL = 36;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase <em>Diagram Model Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelObject()
	 * @generated
	 */
	int DIAGRAM_MODEL_OBJECT = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__LINE_WIDTH = DIAGRAM_MODEL_COMPONENT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__LINE_COLOR = DIAGRAM_MODEL_COMPONENT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Diagram Model Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_OBJECT_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelReferenceBase <em>Diagram Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelReferenceBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelReference()
	 * @generated
	 */
	int DIAGRAM_MODEL_REFERENCE = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_REFERENCE__ELEMENT_SHAPE = DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelGroupBase <em>Diagram Model Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelGroupBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelGroup()
	 * @generated
	 */
	int DIAGRAM_MODEL_GROUP = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_GROUP__ELEMENT_SHAPE = DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelNoteBase <em>Diagram Model Note</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelNoteBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelNote()
	 * @generated
	 */
	int DIAGRAM_MODEL_NOTE = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_NOTE__ELEMENT_SHAPE = DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelImageBase <em>Diagram Model Image</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelImageBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelImage()
	 * @generated
	 */
	int DIAGRAM_MODEL_IMAGE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_IMAGE__ELEMENT_SHAPE = DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnectionBase <em>Diagram Model Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelConnectionBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelConnection()
	 * @generated
	 */
	int DIAGRAM_MODEL_CONNECTION = 23;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__NAME = DIAGRAM_MODEL_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__ID = DIAGRAM_MODEL_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__DIAGRAM_MODEL = DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__LINE_WIDTH = DIAGRAM_MODEL_COMPONENT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__LINE_COLOR = DIAGRAM_MODEL_COMPONENT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Line Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__LINE_DECORATION = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION__TYPE = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Diagram Model Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT = DIAGRAM_MODEL_COMPONENT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelBendpointBase <em>Diagram Model Bendpoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelBendpointBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelBendpoint()
	 * @generated
	 */
	int DIAGRAM_MODEL_BENDPOINT = 24;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IFontAttribute <em>Font Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IFontAttribute
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFontAttribute()
	 * @generated
	 */
	int FONT_ATTRIBUTE = 25;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.BorderObjectBase <em>Border Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.BorderObjectBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBorderObject()
	 * @generated
	 */
	int BORDER_OBJECT = 26;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.IDiagramModelImageProvider
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelImageProvider()
	 * @generated
	 */
	int DIAGRAM_MODEL_IMAGE_PROVIDER = 27;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.BoundsBase <em>Bounds</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.BoundsBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBounds()
	 * @generated
	 */
	int BOUNDS = 28;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.ILockable <em>Lockable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.ILockable
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getLockable()
	 * @generated
	 */
	int LOCKABLE = 29;

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
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__ZENTA_MODEL = ZENTA_MODEL_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__NAME = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__ID = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__DIAGRAM_MODEL = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__LINE_WIDTH = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__LINE_COLOR = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__CHILDREN = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__DOCUMENTATION = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__PROPERTIES = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_FEATURE_COUNT = ZENTA_MODEL_ELEMENT_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase <em>Diagram Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaDiagramModel()
	 * @generated
	 */
	int ZENTA_DIAGRAM_MODEL = 30;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__ZENTA_MODEL = DIAGRAM_MODEL__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__NAME = DIAGRAM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__ID = DIAGRAM_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__DIAGRAM_MODEL = DIAGRAM_MODEL__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__LINE_WIDTH = DIAGRAM_MODEL__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__LINE_COLOR = DIAGRAM_MODEL__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__CHILDREN = DIAGRAM_MODEL__CHILDREN;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__DOCUMENTATION = DIAGRAM_MODEL__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__PROPERTIES = DIAGRAM_MODEL__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Connection Router Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE = DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE;

	/**
	 * The feature id for the '<em><b>Viewpoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL__VIEWPOINT = DIAGRAM_MODEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_DIAGRAM_MODEL_FEATURE_COUNT = DIAGRAM_MODEL_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase <em>Diagram Model Zenta Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelZentaObject()
	 * @generated
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__FONT = DIAGRAM_MODEL_OBJECT__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__FONT_COLOR = DIAGRAM_MODEL_OBJECT__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__TEXT_ALIGNMENT = DIAGRAM_MODEL_OBJECT__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__TEXT_POSITION = DIAGRAM_MODEL_OBJECT__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__BOUNDS = DIAGRAM_MODEL_OBJECT__BOUNDS;

	/**
	 * The feature id for the '<em><b>Source Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__SOURCE_CONNECTIONS = DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Target Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__TARGET_CONNECTIONS = DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__FILL_COLOR = DIAGRAM_MODEL_OBJECT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__ELEMENT_SHAPE = DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__CHILDREN = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Zenta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT__TYPE = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Diagram Model Zenta Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_OBJECT_FEATURE_COUNT = DIAGRAM_MODEL_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase <em>Diagram Model Zenta Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelZentaConnection()
	 * @generated
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__NAME = DIAGRAM_MODEL_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__ID = DIAGRAM_MODEL_CONNECTION__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__DIAGRAM_MODEL = DIAGRAM_MODEL_CONNECTION__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__LINE_WIDTH = DIAGRAM_MODEL_CONNECTION__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__LINE_COLOR = DIAGRAM_MODEL_CONNECTION__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Font</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__FONT = DIAGRAM_MODEL_CONNECTION__FONT;

	/**
	 * The feature id for the '<em><b>Font Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__FONT_COLOR = DIAGRAM_MODEL_CONNECTION__FONT_COLOR;

	/**
	 * The feature id for the '<em><b>Text Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__TEXT_ALIGNMENT = DIAGRAM_MODEL_CONNECTION__TEXT_ALIGNMENT;

	/**
	 * The feature id for the '<em><b>Text Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__TEXT_POSITION = DIAGRAM_MODEL_CONNECTION__TEXT_POSITION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__PROPERTIES = DIAGRAM_MODEL_CONNECTION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__DOCUMENTATION = DIAGRAM_MODEL_CONNECTION__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__TEXT = DIAGRAM_MODEL_CONNECTION__TEXT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__SOURCE = DIAGRAM_MODEL_CONNECTION__SOURCE;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__TARGET = DIAGRAM_MODEL_CONNECTION__TARGET;

	/**
	 * The feature id for the '<em><b>Bendpoints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__BENDPOINTS = DIAGRAM_MODEL_CONNECTION__BENDPOINTS;

	/**
	 * The feature id for the '<em><b>Line Decoration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__LINE_DECORATION = DIAGRAM_MODEL_CONNECTION__LINE_DECORATION;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__TYPE = DIAGRAM_MODEL_CONNECTION__TYPE;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP = DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Diagram Model Zenta Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIAGRAM_MODEL_ZENTA_CONNECTION_FEATURE_COUNT = DIAGRAM_MODEL_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.BasicObjectBase <em>Basic Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.BasicObjectBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBasicObject()
	 * @generated
	 */
	int BASIC_OBJECT = 41;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.SketchModelBase <em>Sketch Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.SketchModelBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getSketchModel()
	 * @generated
	 */
	int SKETCH_MODEL = 33;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__ZENTA_MODEL = DIAGRAM_MODEL__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__NAME = DIAGRAM_MODEL__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__ID = DIAGRAM_MODEL__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__DIAGRAM_MODEL = DIAGRAM_MODEL__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__LINE_WIDTH = DIAGRAM_MODEL__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL__LINE_COLOR = DIAGRAM_MODEL__LINE_COLOR;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.SketchModelStickyBase <em>Sketch Model Sticky</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.SketchModelStickyBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getSketchModelSticky()
	 * @generated
	 */
	int SKETCH_MODEL_STICKY = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_STICKY__ELEMENT_SHAPE = DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE;

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
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.SketchModelActorBase <em>Sketch Model Actor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.SketchModelActorBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getSketchModelActor()
	 * @generated
	 */
	int SKETCH_MODEL_ACTOR = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__NAME = DIAGRAM_MODEL_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__ID = DIAGRAM_MODEL_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__DIAGRAM_MODEL = DIAGRAM_MODEL_OBJECT__DIAGRAM_MODEL;

	/**
	 * The feature id for the '<em><b>Line Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__LINE_WIDTH = DIAGRAM_MODEL_OBJECT__LINE_WIDTH;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__LINE_COLOR = DIAGRAM_MODEL_OBJECT__LINE_COLOR;

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
	 * The feature id for the '<em><b>Element Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SKETCH_MODEL_ACTOR__ELEMENT_SHAPE = DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE;

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
	 * The feature id for the '<em><b>Folders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__FOLDERS = FOLDER_CONTAINER__FOLDERS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__NAME = FOLDER_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__ID = FOLDER_CONTAINER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__ZENTA_MODEL = FOLDER_CONTAINER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__PROPERTIES = FOLDER_CONTAINER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__DOCUMENTATION = FOLDER_CONTAINER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__ELEMENTS = FOLDER_CONTAINER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__FILE = FOLDER_CONTAINER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL__VERSION = FOLDER_CONTAINER_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ZENTA_MODEL_FEATURE_COUNT = FOLDER_CONTAINER_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.MetamodelBase <em>Metamodel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.MetamodelBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getMetamodel()
	 * @generated
	 */
	int METAMODEL = 38;

	/**
	 * The feature id for the '<em><b>Templates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL__TEMPLATES = 0;

	/**
	 * The number of structural features of the '<em>Metamodel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METAMODEL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.TemplateBase <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.TemplateBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getTemplate()
	 * @generated
	 */
	int TEMPLATE = 39;

	/**
	 * The feature id for the '<em><b>Classes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__CLASSES = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__PATH = 1;

	/**
	 * The feature id for the '<em><b>Metamodel</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__METAMODEL = 2;

	/**
	 * The feature id for the '<em><b>Diagram</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE__DIAGRAM = 3;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__ZENTA_MODEL = ZENTA_ELEMENT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__NAME = ZENTA_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__ID = ZENTA_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__DOCUMENTATION = ZENTA_ELEMENT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__PROPERTIES = ZENTA_ELEMENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__DIAG_OBJECTS = ZENTA_ELEMENT__DIAG_OBJECTS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__ATTRIBUTES = ZENTA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__ANCESTOR = ZENTA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__CHILDREN = ZENTA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT__TEMPLATE = ZENTA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Basic Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_OBJECT_FEATURE_COUNT = ZENTA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Zenta Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__ZENTA_MODEL = BASIC_OBJECT__ZENTA_MODEL;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__NAME = BASIC_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__ID = BASIC_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Documentation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__DOCUMENTATION = BASIC_OBJECT__DOCUMENTATION;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__PROPERTIES = BASIC_OBJECT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Diag Objects</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__DIAG_OBJECTS = BASIC_OBJECT__DIAG_OBJECTS;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__ATTRIBUTES = BASIC_OBJECT__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Ancestor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__ANCESTOR = BASIC_OBJECT__ANCESTOR;

	/**
	 * The feature id for the '<em><b>Children</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__CHILDREN = BASIC_OBJECT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__TEMPLATE = BASIC_OBJECT__TEMPLATE;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__SOURCE = BASIC_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__TARGET = BASIC_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Diag Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP__DIAG_CONNECTIONS = BASIC_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Basic Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_RELATIONSHIP_FEATURE_COUNT = BASIC_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.rulez.magwas.zenta.model.impl.AttributeBase <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.rulez.magwas.zenta.model.impl.AttributeBase
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 43;

	/**
	 * The feature id for the '<em><b>Min Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MIN_OCCURS = 0;

	/**
	 * The feature id for the '<em><b>Max Occurs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__MAX_OCCURS = 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__RELATION = 2;

	/**
	 * The feature id for the '<em><b>Connected Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__CONNECTED_OBJECT = 3;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>File</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.io.File
	 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFile()
	 * @generated
	 */
	int FILE = 44;


	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adapter</em>'.
	 * @see org.rulez.magwas.zenta.model.IAdapter
	 * @generated
	 */
	EClass getAdapter();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IIdentifier <em>Identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifier</em>'.
	 * @see org.rulez.magwas.zenta.model.IIdentifier
	 * @generated
	 */
	EClass getIdentifier();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IIdentifier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.rulez.magwas.zenta.model.IIdentifier#getId()
	 * @see #getIdentifier()
	 * @generated
	 */
	EAttribute getIdentifier_Id();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.rulez.magwas.zenta.model.IProperty
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.rulez.magwas.zenta.model.IProperty#getKey()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.rulez.magwas.zenta.model.IProperty#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IProperty#isGenerated <em>Generated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generated</em>'.
	 * @see org.rulez.magwas.zenta.model.IProperty#isGenerated()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Generated();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see org.rulez.magwas.zenta.model.IProperties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IProperties#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.rulez.magwas.zenta.model.IProperties#getProperties()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Properties();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.INameable <em>Nameable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable</em>'.
	 * @see org.rulez.magwas.zenta.model.INameable
	 * @generated
	 */
	EClass getNameable();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.INameable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.rulez.magwas.zenta.model.INameable#getName()
	 * @see #getNameable()
	 * @generated
	 */
	EAttribute getNameable_Name();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.ITextContent <em>Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Content</em>'.
	 * @see org.rulez.magwas.zenta.model.ITextContent
	 * @generated
	 */
	EClass getTextContent();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.ITextContent#getContent <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Content</em>'.
	 * @see org.rulez.magwas.zenta.model.ITextContent#getContent()
	 * @see #getTextContent()
	 * @generated
	 */
	EAttribute getTextContent_Content();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDocumentable <em>Documentable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Documentable</em>'.
	 * @see org.rulez.magwas.zenta.model.IDocumentable
	 * @generated
	 */
	EClass getDocumentable();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDocumentable#getDocumentation <em>Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Documentation</em>'.
	 * @see org.rulez.magwas.zenta.model.IDocumentable#getDocumentation()
	 * @see #getDocumentable()
	 * @generated
	 */
	EAttribute getDocumentable_Documentation();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.ICloneable <em>Cloneable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloneable</em>'.
	 * @see org.rulez.magwas.zenta.model.ICloneable
	 * @generated
	 */
	EClass getCloneable();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IFolderContainer <em>Folder Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder Container</em>'.
	 * @see org.rulez.magwas.zenta.model.IFolderContainer
	 * @generated
	 */
	EClass getFolderContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IFolderContainer#getFolders <em>Folders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Folders</em>'.
	 * @see org.rulez.magwas.zenta.model.IFolderContainer#getFolders()
	 * @see #getFolderContainer()
	 * @generated
	 */
	EReference getFolderContainer_Folders();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IZentaModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaModel
	 * @generated
	 */
	EClass getZentaModel();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IZentaModel#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaModel#getFile()
	 * @see #getZentaModel()
	 * @generated
	 */
	EAttribute getZentaModel_File();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IZentaModel#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaModel#getVersion()
	 * @see #getZentaModel()
	 * @generated
	 */
	EAttribute getZentaModel_Version();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IZentaModelElement <em>Model Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Element</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaModelElement
	 * @generated
	 */
	EClass getZentaModelElement();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IZentaModelElement#getZentaModel <em>Zenta Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zenta Model</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaModelElement#getZentaModel()
	 * @see #getZentaModelElement()
	 * @generated
	 */
	EReference getZentaModelElement_ZentaModel();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IFolder <em>Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Folder</em>'.
	 * @see org.rulez.magwas.zenta.model.IFolder
	 * @generated
	 */
	EClass getFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IFolder#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see org.rulez.magwas.zenta.model.IFolder#getElements()
	 * @see #getFolder()
	 * @generated
	 */
	EReference getFolder_Elements();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IZentaElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaElement
	 * @generated
	 */
	EClass getZentaElement();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.model.IZentaElement#getDiagObjects <em>Diag Objects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diag Objects</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaElement#getDiagObjects()
	 * @see #getZentaElement()
	 * @generated
	 */
	EReference getZentaElement_DiagObjects();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IJunctionElement <em>Junction Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction Element</em>'.
	 * @see org.rulez.magwas.zenta.model.IJunctionElement
	 * @generated
	 */
	EClass getJunctionElement();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IInterfaceElement <em>Interface Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Element</em>'.
	 * @see org.rulez.magwas.zenta.model.IInterfaceElement
	 * @generated
	 */
	EClass getInterfaceElement();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IInterfaceElement#getInterfaceType <em>Interface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Interface Type</em>'.
	 * @see org.rulez.magwas.zenta.model.IInterfaceElement#getInterfaceType()
	 * @see #getInterfaceElement()
	 * @generated
	 */
	EAttribute getInterfaceElement_InterfaceType();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IJunction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see org.rulez.magwas.zenta.model.IJunction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IAndJunction <em>And Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And Junction</em>'.
	 * @see org.rulez.magwas.zenta.model.IAndJunction
	 * @generated
	 */
	EClass getAndJunction();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IOrJunction <em>Or Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or Junction</em>'.
	 * @see org.rulez.magwas.zenta.model.IOrJunction
	 * @generated
	 */
	EClass getOrJunction();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IBasicRelationship <em>Basic Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Relationship</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicRelationship
	 * @generated
	 */
	EClass getBasicRelationship();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IBasicRelationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicRelationship#getSource()
	 * @see #getBasicRelationship()
	 * @generated
	 */
	EReference getBasicRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IBasicRelationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicRelationship#getTarget()
	 * @see #getBasicRelationship()
	 * @generated
	 */
	EReference getBasicRelationship_Target();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.model.IBasicRelationship#getDiagConnections <em>Diag Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Diag Connections</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicRelationship#getDiagConnections()
	 * @see #getBasicRelationship()
	 * @generated
	 */
	EReference getBasicRelationship_DiagConnections();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelComponent <em>Diagram Model Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Component</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelComponent
	 * @generated
	 */
	EClass getDiagramModelComponent();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IDiagramModelComponent#getDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Model</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelComponent#getDiagramModel()
	 * @see #getDiagramModelComponent()
	 * @generated
	 */
	EReference getDiagramModelComponent_DiagramModel();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelComponent#getLineWidth <em>Line Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Width</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelComponent#getLineWidth()
	 * @see #getDiagramModelComponent()
	 * @generated
	 */
	EAttribute getDiagramModelComponent_LineWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelComponent#getLineColor <em>Line Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Color</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelComponent#getLineColor()
	 * @see #getDiagramModelComponent()
	 * @generated
	 */
	EAttribute getDiagramModelComponent_LineColor();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelContainer <em>Diagram Model Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Container</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelContainer
	 * @generated
	 */
	EClass getDiagramModelContainer();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IDiagramModelContainer#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelContainer#getChildren()
	 * @see #getDiagramModelContainer()
	 * @generated
	 */
	EReference getDiagramModelContainer_Children();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModel
	 * @generated
	 */
	EClass getDiagramModel();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModel#getConnectionRouterType <em>Connection Router Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection Router Type</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModel#getConnectionRouterType()
	 * @see #getDiagramModel()
	 * @generated
	 */
	EAttribute getDiagramModel_ConnectionRouterType();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelReference <em>Diagram Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Reference</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelReference
	 * @generated
	 */
	EClass getDiagramModelReference();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IDiagramModelReference#getReferencedModel <em>Referenced Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referenced Model</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelReference#getReferencedModel()
	 * @see #getDiagramModelReference()
	 * @generated
	 */
	EReference getDiagramModelReference_ReferencedModel();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelObject <em>Diagram Model Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Object</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelObject
	 * @generated
	 */
	EClass getDiagramModelObject();

	/**
	 * Returns the meta object for the containment reference '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bounds</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelObject#getBounds()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_Bounds();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getSourceConnections <em>Source Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Connections</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelObject#getSourceConnections()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_SourceConnections();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getTargetConnections <em>Target Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Target Connections</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelObject#getTargetConnections()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EReference getDiagramModelObject_TargetConnections();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getFillColor <em>Fill Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill Color</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelObject#getFillColor()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EAttribute getDiagramModelObject_FillColor();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelObject#getElementShape <em>Element Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Shape</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelObject#getElementShape()
	 * @see #getDiagramModelObject()
	 * @generated
	 */
	EAttribute getDiagramModelObject_ElementShape();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelGroup <em>Diagram Model Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Group</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelGroup
	 * @generated
	 */
	EClass getDiagramModelGroup();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelNote <em>Diagram Model Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Note</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelNote
	 * @generated
	 */
	EClass getDiagramModelNote();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelImage <em>Diagram Model Image</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Image</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelImage
	 * @generated
	 */
	EClass getDiagramModelImage();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection <em>Diagram Model Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Connection</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection
	 * @generated
	 */
	EClass getDiagramModelConnection();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection#getText()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_Text();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection#getSource()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection#getTarget()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection#getBendpoints <em>Bendpoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bendpoints</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection#getBendpoints()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EReference getDiagramModelConnection_Bendpoints();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection#getLineDecoration <em>Line Decoration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Decoration</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection#getLineDecoration()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_LineDecoration();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelConnection#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelConnection#getType()
	 * @see #getDiagramModelConnection()
	 * @generated
	 */
	EAttribute getDiagramModelConnection_Type();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelBendpoint <em>Diagram Model Bendpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Bendpoint</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelBendpoint
	 * @generated
	 */
	EClass getDiagramModelBendpoint();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getStartX <em>Start X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start X</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getStartX()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_StartX();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getStartY <em>Start Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Y</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getStartY()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_StartY();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getEndX <em>End X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End X</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getEndX()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_EndX();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getEndY <em>End Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Y</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelBendpoint#getEndY()
	 * @see #getDiagramModelBendpoint()
	 * @generated
	 */
	EAttribute getDiagramModelBendpoint_EndY();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IFontAttribute <em>Font Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Font Attribute</em>'.
	 * @see org.rulez.magwas.zenta.model.IFontAttribute
	 * @generated
	 */
	EClass getFontAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IFontAttribute#getFont <em>Font</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font</em>'.
	 * @see org.rulez.magwas.zenta.model.IFontAttribute#getFont()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_Font();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IFontAttribute#getFontColor <em>Font Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Color</em>'.
	 * @see org.rulez.magwas.zenta.model.IFontAttribute#getFontColor()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_FontColor();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IFontAttribute#getTextAlignment <em>Text Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Alignment</em>'.
	 * @see org.rulez.magwas.zenta.model.IFontAttribute#getTextAlignment()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_TextAlignment();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IFontAttribute#getTextPosition <em>Text Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Position</em>'.
	 * @see org.rulez.magwas.zenta.model.IFontAttribute#getTextPosition()
	 * @see #getFontAttribute()
	 * @generated
	 */
	EAttribute getFontAttribute_TextPosition();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IBorderObject <em>Border Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Border Object</em>'.
	 * @see org.rulez.magwas.zenta.model.IBorderObject
	 * @generated
	 */
	EClass getBorderObject();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IBorderObject#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.rulez.magwas.zenta.model.IBorderObject#getBorderColor()
	 * @see #getBorderObject()
	 * @generated
	 */
	EAttribute getBorderObject_BorderColor();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Image Provider</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelImageProvider
	 * @generated
	 */
	EClass getDiagramModelImageProvider();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelImageProvider#getImagePath <em>Image Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Path</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelImageProvider#getImagePathOrNull()
	 * @see #getDiagramModelImageProvider()
	 * @generated
	 */
	EAttribute getDiagramModelImageProvider_ImagePath();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IBounds <em>Bounds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounds</em>'.
	 * @see org.rulez.magwas.zenta.model.IBounds
	 * @generated
	 */
	EClass getBounds();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IBounds#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.rulez.magwas.zenta.model.IBounds#getX()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_X();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IBounds#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.rulez.magwas.zenta.model.IBounds#getY()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Y();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IBounds#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.rulez.magwas.zenta.model.IBounds#getWidth()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IBounds#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.rulez.magwas.zenta.model.IBounds#getHeight()
	 * @see #getBounds()
	 * @generated
	 */
	EAttribute getBounds_Height();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.ILockable <em>Lockable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lockable</em>'.
	 * @see org.rulez.magwas.zenta.model.ILockable
	 * @generated
	 */
	EClass getLockable();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.ILockable#isLocked <em>Locked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Locked</em>'.
	 * @see org.rulez.magwas.zenta.model.ILockable#isLocked()
	 * @see #getLockable()
	 * @generated
	 */
	EAttribute getLockable_Locked();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IZentaDiagramModel <em>Diagram Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaDiagramModel
	 * @generated
	 */
	EClass getZentaDiagramModel();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IZentaDiagramModel#getViewpoint <em>Viewpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Viewpoint</em>'.
	 * @see org.rulez.magwas.zenta.model.IZentaDiagramModel#getViewpoint()
	 * @see #getZentaDiagramModel()
	 * @generated
	 */
	EAttribute getZentaDiagramModel_Viewpoint();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject <em>Diagram Model Zenta Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Zenta Object</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaObject
	 * @generated
	 */
	EClass getDiagramModelZentaObject();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getZentaElement <em>Zenta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Zenta Element</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getZentaElement()
	 * @see #getDiagramModelZentaObject()
	 * @generated
	 */
	EReference getDiagramModelZentaObject_ZentaElement();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaObject#getType()
	 * @see #getDiagramModelZentaObject()
	 * @generated
	 */
	EAttribute getDiagramModelZentaObject_Type();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaConnection <em>Diagram Model Zenta Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Diagram Model Zenta Connection</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaConnection
	 * @generated
	 */
	EClass getDiagramModelZentaConnection();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IDiagramModelZentaConnection#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relationship</em>'.
	 * @see org.rulez.magwas.zenta.model.IDiagramModelZentaConnection#getRelationship()
	 * @see #getDiagramModelZentaConnection()
	 * @generated
	 */
	EReference getDiagramModelZentaConnection_Relationship();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IBasicObject <em>Basic Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Object</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicObject
	 * @generated
	 */
	EClass getBasicObject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IBasicObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicObject#getAttributes()
	 * @see #getBasicObject()
	 * @generated
	 */
	EReference getBasicObject_Attributes();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IBasicObject#getAncestor <em>Ancestor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ancestor</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicObject#getAncestor()
	 * @see #getBasicObject()
	 * @generated
	 */
	EReference getBasicObject_Ancestor();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.model.IBasicObject#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Children</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicObject#getChildren()
	 * @see #getBasicObject()
	 * @generated
	 */
	EReference getBasicObject_Children();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IBasicObject#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.model.IBasicObject#getTemplate()
	 * @see #getBasicObject()
	 * @generated
	 */
	EReference getBasicObject_Template();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.ISketchModel <em>Sketch Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model</em>'.
	 * @see org.rulez.magwas.zenta.model.ISketchModel
	 * @generated
	 */
	EClass getSketchModel();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.ISketchModel#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see org.rulez.magwas.zenta.model.ISketchModel#getBackground()
	 * @see #getSketchModel()
	 * @generated
	 */
	EAttribute getSketchModel_Background();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.ISketchModelSticky <em>Sketch Model Sticky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model Sticky</em>'.
	 * @see org.rulez.magwas.zenta.model.ISketchModelSticky
	 * @generated
	 */
	EClass getSketchModelSticky();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.ISketchModelActor <em>Sketch Model Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sketch Model Actor</em>'.
	 * @see org.rulez.magwas.zenta.model.ISketchModelActor
	 * @generated
	 */
	EClass getSketchModelActor();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Metamodel</em>'.
	 * @see org.rulez.magwas.zenta.model.IMetamodel
	 * @generated
	 */
	EClass getMetamodel();

	/**
	 * Returns the meta object for the containment reference list '{@link org.rulez.magwas.zenta.model.IMetamodel#getTemplates <em>Templates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Templates</em>'.
	 * @see org.rulez.magwas.zenta.model.IMetamodel#getTemplates()
	 * @see #getMetamodel()
	 * @generated
	 */
	EReference getMetamodel_Templates();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.ITemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.rulez.magwas.zenta.model.ITemplate
	 * @generated
	 */
	EClass getTemplate();

	/**
	 * Returns the meta object for the reference list '{@link org.rulez.magwas.zenta.model.ITemplate#getClasses <em>Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Classes</em>'.
	 * @see org.rulez.magwas.zenta.model.ITemplate#getClasses()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Classes();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.ITemplate#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see org.rulez.magwas.zenta.model.ITemplate#getPath()
	 * @see #getTemplate()
	 * @generated
	 */
	EAttribute getTemplate_Path();

	/**
	 * Returns the meta object for the container reference '{@link org.rulez.magwas.zenta.model.ITemplate#getMetamodel <em>Metamodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Metamodel</em>'.
	 * @see org.rulez.magwas.zenta.model.ITemplate#getMetamodel()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Metamodel();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.ITemplate#getDiagram <em>Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram</em>'.
	 * @see org.rulez.magwas.zenta.model.ITemplate#getDiagram()
	 * @see #getTemplate()
	 * @generated
	 */
	EReference getTemplate_Diagram();

	/**
	 * Returns the meta object for class '{@link org.rulez.magwas.zenta.model.IAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see org.rulez.magwas.zenta.model.IAttribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IAttribute#getMinOccurs <em>Min Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Occurs</em>'.
	 * @see org.rulez.magwas.zenta.model.IAttribute#getMinOccurs()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MinOccurs();

	/**
	 * Returns the meta object for the attribute '{@link org.rulez.magwas.zenta.model.IAttribute#getMaxOccurs <em>Max Occurs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Occurs</em>'.
	 * @see org.rulez.magwas.zenta.model.IAttribute#getMaxOccurs()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_MaxOccurs();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IAttribute#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see org.rulez.magwas.zenta.model.IAttribute#getRelation()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Relation();

	/**
	 * Returns the meta object for the reference '{@link org.rulez.magwas.zenta.model.IAttribute#getConnectedObject <em>Connected Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected Object</em>'.
	 * @see org.rulez.magwas.zenta.model.IAttribute#getConnectedObject()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_ConnectedObject();

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
	IZentaFactory getZentaFactory();

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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IAdapter <em>Adapter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IAdapter
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getAdapter()
		 * @generated
		 */
		EClass ADAPTER = eINSTANCE.getAdapter();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IIdentifier <em>Identifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IIdentifier
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getIdentifier()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.PropertyBase <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.PropertyBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getProperty()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IProperties <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IProperties
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getProperties()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.INameable <em>Nameable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.INameable
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getNameable()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.ITextContent <em>Text Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.ITextContent
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getTextContent()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IDocumentable <em>Documentable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IDocumentable
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDocumentable()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.ICloneable <em>Cloneable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.ICloneable
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getCloneable()
		 * @generated
		 */
		EClass CLONEABLE = eINSTANCE.getCloneable();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IFolderContainer <em>Folder Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IFolderContainer
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFolderContainer()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.ZentaModelBase <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.ZentaModelBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaModel()
		 * @generated
		 */
		EClass ZENTA_MODEL = eINSTANCE.getZentaModel();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZENTA_MODEL__FILE = eINSTANCE.getZentaModel_File();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZENTA_MODEL__VERSION = eINSTANCE.getZentaModel_Version();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IZentaModelElement <em>Model Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IZentaModelElement
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaModelElement()
		 * @generated
		 */
		EClass ZENTA_MODEL_ELEMENT = eINSTANCE.getZentaModelElement();

		/**
		 * The meta object literal for the '<em><b>Zenta Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZENTA_MODEL_ELEMENT__ZENTA_MODEL = eINSTANCE.getZentaModelElement_ZentaModel();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.FolderBase <em>Folder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.FolderBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFolder()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.ZentaElementBase <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.ZentaElementBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaElement()
		 * @generated
		 */
		EClass ZENTA_ELEMENT = eINSTANCE.getZentaElement();

		/**
		 * The meta object literal for the '<em><b>Diag Objects</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ZENTA_ELEMENT__DIAG_OBJECTS = eINSTANCE.getZentaElement_DiagObjects();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IJunctionElement <em>Junction Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IJunctionElement
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getJunctionElement()
		 * @generated
		 */
		EClass JUNCTION_ELEMENT = eINSTANCE.getJunctionElement();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IInterfaceElement <em>Interface Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IInterfaceElement
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getInterfaceElement()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.JunctionBase <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.JunctionBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.AndJunctionBase <em>And Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.AndJunctionBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getAndJunction()
		 * @generated
		 */
		EClass AND_JUNCTION = eINSTANCE.getAndJunction();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.OrJunctionBase <em>Or Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.OrJunctionBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getOrJunction()
		 * @generated
		 */
		EClass OR_JUNCTION = eINSTANCE.getOrJunction();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.BasicRelationshipBase <em>Basic Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.BasicRelationshipBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBasicRelationship()
		 * @generated
		 */
		EClass BASIC_RELATIONSHIP = eINSTANCE.getBasicRelationship();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_RELATIONSHIP__SOURCE = eINSTANCE.getBasicRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_RELATIONSHIP__TARGET = eINSTANCE.getBasicRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Diag Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_RELATIONSHIP__DIAG_CONNECTIONS = eINSTANCE.getBasicRelationship_DiagConnections();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase <em>Diagram Model Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelComponentBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelComponent()
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
		 * The meta object literal for the '<em><b>Line Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_COMPONENT__LINE_WIDTH = eINSTANCE.getDiagramModelComponent_LineWidth();

		/**
		 * The meta object literal for the '<em><b>Line Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_COMPONENT__LINE_COLOR = eINSTANCE.getDiagramModelComponent_LineColor();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IDiagramModelContainer <em>Diagram Model Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IDiagramModelContainer
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelContainer()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelBase <em>Diagram Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModel()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelReferenceBase <em>Diagram Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelReferenceBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelReference()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase <em>Diagram Model Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelObjectBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelObject()
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
		 * The meta object literal for the '<em><b>Element Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_OBJECT__ELEMENT_SHAPE = eINSTANCE.getDiagramModelObject_ElementShape();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelGroupBase <em>Diagram Model Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelGroupBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelGroup()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_GROUP = eINSTANCE.getDiagramModelGroup();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelNoteBase <em>Diagram Model Note</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelNoteBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelNote()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_NOTE = eINSTANCE.getDiagramModelNote();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelImageBase <em>Diagram Model Image</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelImageBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelImage()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_IMAGE = eINSTANCE.getDiagramModelImage();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelConnectionBase <em>Diagram Model Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelConnectionBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelConnection()
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
		 * The meta object literal for the '<em><b>Line Decoration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__LINE_DECORATION = eINSTANCE.getDiagramModelConnection_LineDecoration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_CONNECTION__TYPE = eINSTANCE.getDiagramModelConnection_Type();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelBendpointBase <em>Diagram Model Bendpoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelBendpointBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelBendpoint()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IFontAttribute <em>Font Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IFontAttribute
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFontAttribute()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.BorderObjectBase <em>Border Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.BorderObjectBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBorderObject()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.IDiagramModelImageProvider <em>Diagram Model Image Provider</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.IDiagramModelImageProvider
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelImageProvider()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.BoundsBase <em>Bounds</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.BoundsBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBounds()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.ILockable <em>Lockable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.ILockable
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getLockable()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase <em>Diagram Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.ZentaDiagramModelBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getZentaDiagramModel()
		 * @generated
		 */
		EClass ZENTA_DIAGRAM_MODEL = eINSTANCE.getZentaDiagramModel();

		/**
		 * The meta object literal for the '<em><b>Viewpoint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ZENTA_DIAGRAM_MODEL__VIEWPOINT = eINSTANCE.getZentaDiagramModel_Viewpoint();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase <em>Diagram Model Zenta Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelZentaObjectBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelZentaObject()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_ZENTA_OBJECT = eINSTANCE.getDiagramModelZentaObject();

		/**
		 * The meta object literal for the '<em><b>Zenta Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_ZENTA_OBJECT__ZENTA_ELEMENT = eINSTANCE.getDiagramModelZentaObject_ZentaElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIAGRAM_MODEL_ZENTA_OBJECT__TYPE = eINSTANCE.getDiagramModelZentaObject_Type();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase <em>Diagram Model Zenta Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.DiagramModelZentaConnectionBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getDiagramModelZentaConnection()
		 * @generated
		 */
		EClass DIAGRAM_MODEL_ZENTA_CONNECTION = eINSTANCE.getDiagramModelZentaConnection();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DIAGRAM_MODEL_ZENTA_CONNECTION__RELATIONSHIP = eINSTANCE.getDiagramModelZentaConnection_Relationship();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.BasicObjectBase <em>Basic Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.BasicObjectBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getBasicObject()
		 * @generated
		 */
		EClass BASIC_OBJECT = eINSTANCE.getBasicObject();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_OBJECT__ATTRIBUTES = eINSTANCE.getBasicObject_Attributes();

		/**
		 * The meta object literal for the '<em><b>Ancestor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_OBJECT__ANCESTOR = eINSTANCE.getBasicObject_Ancestor();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_OBJECT__CHILDREN = eINSTANCE.getBasicObject_Children();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_OBJECT__TEMPLATE = eINSTANCE.getBasicObject_Template();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.SketchModelBase <em>Sketch Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.SketchModelBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getSketchModel()
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
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.SketchModelStickyBase <em>Sketch Model Sticky</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.SketchModelStickyBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getSketchModelSticky()
		 * @generated
		 */
		EClass SKETCH_MODEL_STICKY = eINSTANCE.getSketchModelSticky();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.SketchModelActorBase <em>Sketch Model Actor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.SketchModelActorBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getSketchModelActor()
		 * @generated
		 */
		EClass SKETCH_MODEL_ACTOR = eINSTANCE.getSketchModelActor();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.MetamodelBase <em>Metamodel</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.MetamodelBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getMetamodel()
		 * @generated
		 */
		EClass METAMODEL = eINSTANCE.getMetamodel();

		/**
		 * The meta object literal for the '<em><b>Templates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METAMODEL__TEMPLATES = eINSTANCE.getMetamodel_Templates();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.TemplateBase <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.TemplateBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getTemplate()
		 * @generated
		 */
		EClass TEMPLATE = eINSTANCE.getTemplate();

		/**
		 * The meta object literal for the '<em><b>Classes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__CLASSES = eINSTANCE.getTemplate_Classes();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE__PATH = eINSTANCE.getTemplate_Path();

		/**
		 * The meta object literal for the '<em><b>Metamodel</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__METAMODEL = eINSTANCE.getTemplate_Metamodel();

		/**
		 * The meta object literal for the '<em><b>Diagram</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE__DIAGRAM = eINSTANCE.getTemplate_Diagram();

		/**
		 * The meta object literal for the '{@link org.rulez.magwas.zenta.model.impl.AttributeBase <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.rulez.magwas.zenta.model.impl.AttributeBase
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Min Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MIN_OCCURS = eINSTANCE.getAttribute_MinOccurs();

		/**
		 * The meta object literal for the '<em><b>Max Occurs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__MAX_OCCURS = eINSTANCE.getAttribute_MaxOccurs();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__RELATION = eINSTANCE.getAttribute_Relation();

		/**
		 * The meta object literal for the '<em><b>Connected Object</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__CONNECTED_OBJECT = eINSTANCE.getAttribute_ConnectedObject();

		/**
		 * The meta object literal for the '<em>File</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.io.File
		 * @see org.rulez.magwas.zenta.model.impl.ZentaPackageBase#getFile()
		 * @generated
		 */
		EDataType FILE = eINSTANCE.getFile();

	}

} //IZentaPackage
