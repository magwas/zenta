/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.impl;

import java.io.File;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.rulez.magwas.zenta.model.FolderType;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IAggregationRelationship;
import org.rulez.magwas.zenta.model.IAndJunction;
import org.rulez.magwas.zenta.model.IArchimateDiagramModel;
import org.rulez.magwas.zenta.model.IArchimateElement;
import org.rulez.magwas.zenta.model.IArchimateFactory;
import org.rulez.magwas.zenta.model.IArchimateModel;
import org.rulez.magwas.zenta.model.IArchimateModelElement;
import org.rulez.magwas.zenta.model.IArchimatePackage;
import org.rulez.magwas.zenta.model.IAssociationRelationship;
import org.rulez.magwas.zenta.model.IBorderObject;
import org.rulez.magwas.zenta.model.IBounds;
import org.rulez.magwas.zenta.model.IBusinessLayerElement;
import org.rulez.magwas.zenta.model.IBusinessObject;
import org.rulez.magwas.zenta.model.ICloneable;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IDiagramModelArchimateConnection;
import org.rulez.magwas.zenta.model.IDiagramModelArchimateObject;
import org.rulez.magwas.zenta.model.IDiagramModelBendpoint;
import org.rulez.magwas.zenta.model.IDiagramModelComponent;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IDiagramModelGroup;
import org.rulez.magwas.zenta.model.IDiagramModelImage;
import org.rulez.magwas.zenta.model.IDiagramModelImageProvider;
import org.rulez.magwas.zenta.model.IDiagramModelNote;
import org.rulez.magwas.zenta.model.IDiagramModelObject;
import org.rulez.magwas.zenta.model.IDiagramModelReference;
import org.rulez.magwas.zenta.model.IDocumentable;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IFolderContainer;
import org.rulez.magwas.zenta.model.IFontAttribute;
import org.rulez.magwas.zenta.model.IIdentifier;
import org.rulez.magwas.zenta.model.IInterfaceElement;
import org.rulez.magwas.zenta.model.IJunction;
import org.rulez.magwas.zenta.model.IJunctionElement;
import org.rulez.magwas.zenta.model.ILockable;
import org.rulez.magwas.zenta.model.INameable;
import org.rulez.magwas.zenta.model.IOrJunction;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.IProperty;
import org.rulez.magwas.zenta.model.IRelationship;
import org.rulez.magwas.zenta.model.ISketchModel;
import org.rulez.magwas.zenta.model.ISketchModelActor;
import org.rulez.magwas.zenta.model.ISketchModelSticky;
import org.rulez.magwas.zenta.model.ISpecialisationRelationship;
import org.rulez.magwas.zenta.model.ITextContent;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchimatePackage extends EPackageImpl implements IArchimatePackage {
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass adapterEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass identifierEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass propertiesEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass nameableEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass textContentEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass documentableEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass cloneableEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass folderContainerEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass archimateModelElementEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass propertyEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass archimateModelEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass folderEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass archimateElementEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass businessLayerElementEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass archimateDiagramModelEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelReferenceEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelComponentEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelObjectEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelArchimateObjectEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelContainerEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelGroupEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelNoteEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelImageEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelConnectionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelArchimateConnectionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelBendpointEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass fontAttributeEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass borderObjectEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass diagramModelImageProviderEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass boundsEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass lockableEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sketchModelEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sketchModelStickyEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass sketchModelActorEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EEnum folderTypeEEnum = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EDataType fileEDataType = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass businessObjectEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass relationshipEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass associationRelationshipEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass specialisationRelationshipEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass junctionElementEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass interfaceElementEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass junctionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass andJunctionEClass = null;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private EClass orJunctionEClass = null;

    /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.rulez.magwas.zenta.model.IArchimatePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
    private ArchimatePackage() {
		super(eNS_URI, IArchimateFactory.eINSTANCE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static boolean isInited = false;

    /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IArchimatePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
    public static IArchimatePackage init() {
		if (isInited) return (IArchimatePackage)EPackage.Registry.INSTANCE.getEPackage(IArchimatePackage.eNS_URI);

		// Obtain or create and register package
		ArchimatePackage theArchimatePackage = (ArchimatePackage)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ArchimatePackage ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ArchimatePackage());

		isInited = true;

		// Create package meta-data objects
		theArchimatePackage.createPackageContents();

		// Initialize created meta-data
		theArchimatePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theArchimatePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IArchimatePackage.eNS_URI, theArchimatePackage);
		return theArchimatePackage;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAdapter() {
		return adapterEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getIdentifier() {
		return identifierEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getIdentifier_Id() {
		return (EAttribute)identifierEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getProperties() {
		return propertiesEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getProperties_Properties() {
		return (EReference)propertiesEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getNameable() {
		return nameableEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getNameable_Name() {
		return (EAttribute)nameableEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getTextContent() {
		return textContentEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getTextContent_Content() {
		return (EAttribute)textContentEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDocumentable() {
		return documentableEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDocumentable_Documentation() {
		return (EAttribute)documentableEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getCloneable() {
		return cloneableEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFolderContainer() {
		return folderContainerEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFolderContainer_Folders() {
		return (EReference)folderContainerEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getArchimateModelElement() {
		return archimateModelElementEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getArchimateModelElement_ArchimateModel() {
		return (EReference)archimateModelElementEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getProperty() {
		return propertyEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getProperty_Key() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Generated() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getArchimateModel() {
		return archimateModelEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getArchimateModel_Purpose() {
		return (EAttribute)archimateModelEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getArchimateModel_File() {
		return (EAttribute)archimateModelEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getArchimateModel_Version() {
		return (EAttribute)archimateModelEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFolder() {
		return folderEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getFolder_Elements() {
		return (EReference)folderEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFolder_Type() {
		return (EAttribute)folderEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getArchimateElement() {
		return archimateElementEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBusinessLayerElement() {
		return businessLayerElementEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModel() {
		return diagramModelEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModel_ConnectionRouterType() {
		return (EAttribute)diagramModelEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getArchimateDiagramModel() {
		return archimateDiagramModelEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getArchimateDiagramModel_Viewpoint() {
		return (EAttribute)archimateDiagramModelEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelReference() {
		return diagramModelReferenceEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelReference_ReferencedModel() {
		return (EReference)diagramModelReferenceEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelComponent() {
		return diagramModelComponentEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelComponent_DiagramModel() {
		return (EReference)diagramModelComponentEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelObject() {
		return diagramModelObjectEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelObject_Bounds() {
		return (EReference)diagramModelObjectEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelObject_SourceConnections() {
		return (EReference)diagramModelObjectEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelObject_TargetConnections() {
		return (EReference)diagramModelObjectEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelObject_FillColor() {
		return (EAttribute)diagramModelObjectEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelArchimateObject() {
		return diagramModelArchimateObjectEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelArchimateObject_ArchimateElement() {
		return (EReference)diagramModelArchimateObjectEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelArchimateObject_Type() {
		return (EAttribute)diagramModelArchimateObjectEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelContainer() {
		return diagramModelContainerEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelContainer_Children() {
		return (EReference)diagramModelContainerEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelGroup() {
		return diagramModelGroupEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelNote() {
		return diagramModelNoteEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelImage() {
		return diagramModelImageEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelConnection() {
		return diagramModelConnectionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelConnection_Text() {
		return (EAttribute)diagramModelConnectionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelConnection_Source() {
		return (EReference)diagramModelConnectionEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelConnection_Target() {
		return (EReference)diagramModelConnectionEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelConnection_Bendpoints() {
		return (EReference)diagramModelConnectionEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelConnection_LineWidth() {
		return (EAttribute)diagramModelConnectionEClass.getEStructuralFeatures().get(4);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelConnection_LineColor() {
		return (EAttribute)diagramModelConnectionEClass.getEStructuralFeatures().get(5);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelConnection_Type() {
		return (EAttribute)diagramModelConnectionEClass.getEStructuralFeatures().get(6);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelArchimateConnection() {
		return diagramModelArchimateConnectionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getDiagramModelArchimateConnection_Relationship() {
		return (EReference)diagramModelArchimateConnectionEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelBendpoint() {
		return diagramModelBendpointEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelBendpoint_StartX() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelBendpoint_StartY() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelBendpoint_EndX() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelBendpoint_EndY() {
		return (EAttribute)diagramModelBendpointEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getFontAttribute() {
		return fontAttributeEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFontAttribute_Font() {
		return (EAttribute)fontAttributeEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFontAttribute_FontColor() {
		return (EAttribute)fontAttributeEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFontAttribute_TextAlignment() {
		return (EAttribute)fontAttributeEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getFontAttribute_TextPosition() {
		return (EAttribute)fontAttributeEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBorderObject() {
		return borderObjectEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getBorderObject_BorderColor() {
		return (EAttribute)borderObjectEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getDiagramModelImageProvider() {
		return diagramModelImageProviderEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getDiagramModelImageProvider_ImagePath() {
		return (EAttribute)diagramModelImageProviderEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBounds() {
		return boundsEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getBounds_X() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getBounds_Y() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getBounds_Width() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(2);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getBounds_Height() {
		return (EAttribute)boundsEClass.getEStructuralFeatures().get(3);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getLockable() {
		return lockableEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getLockable_Locked() {
		return (EAttribute)lockableEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSketchModel() {
		return sketchModelEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getSketchModel_Background() {
		return (EAttribute)sketchModelEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSketchModelSticky() {
		return sketchModelStickyEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSketchModelActor() {
		return sketchModelActorEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EEnum getFolderType() {
		return folderTypeEEnum;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EDataType getFile() {
		return fileEDataType;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getBusinessObject() {
		return businessObjectEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getRelationship() {
		return relationshipEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationship_Source() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EReference getRelationship_Target() {
		return (EReference)relationshipEClass.getEStructuralFeatures().get(1);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAssociationRelationship() {
		return associationRelationshipEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getSpecialisationRelationship() {
		return specialisationRelationshipEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getJunctionElement() {
		return junctionElementEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getInterfaceElement() {
		return interfaceElementEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EAttribute getInterfaceElement_InterfaceType() {
		return (EAttribute)interfaceElementEClass.getEStructuralFeatures().get(0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getJunction() {
		return junctionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getAndJunction() {
		return andJunctionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EClass getOrJunction() {
		return orJunctionEClass;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IArchimateFactory getArchimateFactory() {
		return (IArchimateFactory)getEFactoryInstance();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isCreated = false;

    /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		adapterEClass = createEClass(ADAPTER);

		identifierEClass = createEClass(IDENTIFIER);
		createEAttribute(identifierEClass, IDENTIFIER__ID);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__KEY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);
		createEAttribute(propertyEClass, PROPERTY__GENERATED);

		propertiesEClass = createEClass(PROPERTIES);
		createEReference(propertiesEClass, PROPERTIES__PROPERTIES);

		nameableEClass = createEClass(NAMEABLE);
		createEAttribute(nameableEClass, NAMEABLE__NAME);

		textContentEClass = createEClass(TEXT_CONTENT);
		createEAttribute(textContentEClass, TEXT_CONTENT__CONTENT);

		documentableEClass = createEClass(DOCUMENTABLE);
		createEAttribute(documentableEClass, DOCUMENTABLE__DOCUMENTATION);

		cloneableEClass = createEClass(CLONEABLE);

		folderContainerEClass = createEClass(FOLDER_CONTAINER);
		createEReference(folderContainerEClass, FOLDER_CONTAINER__FOLDERS);

		archimateModelEClass = createEClass(ARCHIMATE_MODEL);
		createEAttribute(archimateModelEClass, ARCHIMATE_MODEL__PURPOSE);
		createEAttribute(archimateModelEClass, ARCHIMATE_MODEL__FILE);
		createEAttribute(archimateModelEClass, ARCHIMATE_MODEL__VERSION);

		archimateModelElementEClass = createEClass(ARCHIMATE_MODEL_ELEMENT);
		createEReference(archimateModelElementEClass, ARCHIMATE_MODEL_ELEMENT__ARCHIMATE_MODEL);

		folderEClass = createEClass(FOLDER);
		createEReference(folderEClass, FOLDER__ELEMENTS);
		createEAttribute(folderEClass, FOLDER__TYPE);

		archimateElementEClass = createEClass(ARCHIMATE_ELEMENT);

		junctionElementEClass = createEClass(JUNCTION_ELEMENT);

		interfaceElementEClass = createEClass(INTERFACE_ELEMENT);
		createEAttribute(interfaceElementEClass, INTERFACE_ELEMENT__INTERFACE_TYPE);

		junctionEClass = createEClass(JUNCTION);

		andJunctionEClass = createEClass(AND_JUNCTION);

		orJunctionEClass = createEClass(OR_JUNCTION);

		relationshipEClass = createEClass(RELATIONSHIP);
		createEReference(relationshipEClass, RELATIONSHIP__SOURCE);
		createEReference(relationshipEClass, RELATIONSHIP__TARGET);

		associationRelationshipEClass = createEClass(ASSOCIATION_RELATIONSHIP);

		specialisationRelationshipEClass = createEClass(SPECIALISATION_RELATIONSHIP);

		businessLayerElementEClass = createEClass(BUSINESS_LAYER_ELEMENT);

		diagramModelComponentEClass = createEClass(DIAGRAM_MODEL_COMPONENT);
		createEReference(diagramModelComponentEClass, DIAGRAM_MODEL_COMPONENT__DIAGRAM_MODEL);

		diagramModelContainerEClass = createEClass(DIAGRAM_MODEL_CONTAINER);
		createEReference(diagramModelContainerEClass, DIAGRAM_MODEL_CONTAINER__CHILDREN);

		diagramModelEClass = createEClass(DIAGRAM_MODEL);
		createEAttribute(diagramModelEClass, DIAGRAM_MODEL__CONNECTION_ROUTER_TYPE);

		diagramModelReferenceEClass = createEClass(DIAGRAM_MODEL_REFERENCE);
		createEReference(diagramModelReferenceEClass, DIAGRAM_MODEL_REFERENCE__REFERENCED_MODEL);

		diagramModelObjectEClass = createEClass(DIAGRAM_MODEL_OBJECT);
		createEReference(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__BOUNDS);
		createEReference(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__SOURCE_CONNECTIONS);
		createEReference(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__TARGET_CONNECTIONS);
		createEAttribute(diagramModelObjectEClass, DIAGRAM_MODEL_OBJECT__FILL_COLOR);

		diagramModelGroupEClass = createEClass(DIAGRAM_MODEL_GROUP);

		diagramModelNoteEClass = createEClass(DIAGRAM_MODEL_NOTE);

		diagramModelImageEClass = createEClass(DIAGRAM_MODEL_IMAGE);

		diagramModelConnectionEClass = createEClass(DIAGRAM_MODEL_CONNECTION);
		createEAttribute(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__TEXT);
		createEReference(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__SOURCE);
		createEReference(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__TARGET);
		createEReference(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__BENDPOINTS);
		createEAttribute(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__LINE_WIDTH);
		createEAttribute(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__LINE_COLOR);
		createEAttribute(diagramModelConnectionEClass, DIAGRAM_MODEL_CONNECTION__TYPE);

		diagramModelBendpointEClass = createEClass(DIAGRAM_MODEL_BENDPOINT);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__START_X);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__START_Y);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__END_X);
		createEAttribute(diagramModelBendpointEClass, DIAGRAM_MODEL_BENDPOINT__END_Y);

		fontAttributeEClass = createEClass(FONT_ATTRIBUTE);
		createEAttribute(fontAttributeEClass, FONT_ATTRIBUTE__FONT);
		createEAttribute(fontAttributeEClass, FONT_ATTRIBUTE__FONT_COLOR);
		createEAttribute(fontAttributeEClass, FONT_ATTRIBUTE__TEXT_ALIGNMENT);
		createEAttribute(fontAttributeEClass, FONT_ATTRIBUTE__TEXT_POSITION);

		borderObjectEClass = createEClass(BORDER_OBJECT);
		createEAttribute(borderObjectEClass, BORDER_OBJECT__BORDER_COLOR);

		diagramModelImageProviderEClass = createEClass(DIAGRAM_MODEL_IMAGE_PROVIDER);
		createEAttribute(diagramModelImageProviderEClass, DIAGRAM_MODEL_IMAGE_PROVIDER__IMAGE_PATH);

		boundsEClass = createEClass(BOUNDS);
		createEAttribute(boundsEClass, BOUNDS__X);
		createEAttribute(boundsEClass, BOUNDS__Y);
		createEAttribute(boundsEClass, BOUNDS__WIDTH);
		createEAttribute(boundsEClass, BOUNDS__HEIGHT);

		lockableEClass = createEClass(LOCKABLE);
		createEAttribute(lockableEClass, LOCKABLE__LOCKED);

		archimateDiagramModelEClass = createEClass(ARCHIMATE_DIAGRAM_MODEL);
		createEAttribute(archimateDiagramModelEClass, ARCHIMATE_DIAGRAM_MODEL__VIEWPOINT);

		diagramModelArchimateObjectEClass = createEClass(DIAGRAM_MODEL_ARCHIMATE_OBJECT);
		createEReference(diagramModelArchimateObjectEClass, DIAGRAM_MODEL_ARCHIMATE_OBJECT__ARCHIMATE_ELEMENT);
		createEAttribute(diagramModelArchimateObjectEClass, DIAGRAM_MODEL_ARCHIMATE_OBJECT__TYPE);

		diagramModelArchimateConnectionEClass = createEClass(DIAGRAM_MODEL_ARCHIMATE_CONNECTION);
		createEReference(diagramModelArchimateConnectionEClass, DIAGRAM_MODEL_ARCHIMATE_CONNECTION__RELATIONSHIP);

		businessObjectEClass = createEClass(BUSINESS_OBJECT);

		sketchModelEClass = createEClass(SKETCH_MODEL);
		createEAttribute(sketchModelEClass, SKETCH_MODEL__BACKGROUND);

		sketchModelStickyEClass = createEClass(SKETCH_MODEL_STICKY);

		sketchModelActorEClass = createEClass(SKETCH_MODEL_ACTOR);

		// Create enums
		folderTypeEEnum = createEEnum(FOLDER_TYPE);

		// Create data types
		fileEDataType = createEDataType(FILE);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private boolean isInitialized = false;

    /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		archimateModelEClass.getESuperTypes().add(this.getFolderContainer());
		archimateModelEClass.getESuperTypes().add(this.getNameable());
		archimateModelEClass.getESuperTypes().add(this.getIdentifier());
		archimateModelEClass.getESuperTypes().add(this.getArchimateModelElement());
		archimateModelEClass.getESuperTypes().add(this.getProperties());
		archimateModelElementEClass.getESuperTypes().add(this.getAdapter());
		folderEClass.getESuperTypes().add(this.getArchimateModelElement());
		folderEClass.getESuperTypes().add(this.getFolderContainer());
		folderEClass.getESuperTypes().add(this.getNameable());
		folderEClass.getESuperTypes().add(this.getIdentifier());
		folderEClass.getESuperTypes().add(this.getDocumentable());
		folderEClass.getESuperTypes().add(this.getProperties());
		archimateElementEClass.getESuperTypes().add(this.getArchimateModelElement());
		archimateElementEClass.getESuperTypes().add(this.getIdentifier());
		archimateElementEClass.getESuperTypes().add(this.getCloneable());
		archimateElementEClass.getESuperTypes().add(this.getNameable());
		archimateElementEClass.getESuperTypes().add(this.getDocumentable());
		archimateElementEClass.getESuperTypes().add(this.getProperties());
		junctionElementEClass.getESuperTypes().add(this.getArchimateElement());
		interfaceElementEClass.getESuperTypes().add(this.getArchimateElement());
		junctionEClass.getESuperTypes().add(this.getJunctionElement());
		andJunctionEClass.getESuperTypes().add(this.getJunctionElement());
		orJunctionEClass.getESuperTypes().add(this.getJunctionElement());
		relationshipEClass.getESuperTypes().add(this.getArchimateElement());
		associationRelationshipEClass.getESuperTypes().add(this.getRelationship());
		specialisationRelationshipEClass.getESuperTypes().add(this.getRelationship());
		businessLayerElementEClass.getESuperTypes().add(this.getArchimateElement());
		diagramModelComponentEClass.getESuperTypes().add(this.getIdentifier());
		diagramModelComponentEClass.getESuperTypes().add(this.getCloneable());
		diagramModelComponentEClass.getESuperTypes().add(this.getAdapter());
		diagramModelComponentEClass.getESuperTypes().add(this.getNameable());
		diagramModelContainerEClass.getESuperTypes().add(this.getDiagramModelComponent());
		diagramModelEClass.getESuperTypes().add(this.getArchimateModelElement());
		diagramModelEClass.getESuperTypes().add(this.getDiagramModelContainer());
		diagramModelEClass.getESuperTypes().add(this.getDocumentable());
		diagramModelEClass.getESuperTypes().add(this.getProperties());
		diagramModelReferenceEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelObjectEClass.getESuperTypes().add(this.getDiagramModelComponent());
		diagramModelObjectEClass.getESuperTypes().add(this.getFontAttribute());
		diagramModelGroupEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelGroupEClass.getESuperTypes().add(this.getDiagramModelContainer());
		diagramModelGroupEClass.getESuperTypes().add(this.getDocumentable());
		diagramModelGroupEClass.getESuperTypes().add(this.getProperties());
		diagramModelNoteEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelNoteEClass.getESuperTypes().add(this.getTextContent());
		diagramModelImageEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelImageEClass.getESuperTypes().add(this.getBorderObject());
		diagramModelImageEClass.getESuperTypes().add(this.getDiagramModelImageProvider());
		diagramModelConnectionEClass.getESuperTypes().add(this.getDiagramModelComponent());
		diagramModelConnectionEClass.getESuperTypes().add(this.getFontAttribute());
		diagramModelConnectionEClass.getESuperTypes().add(this.getProperties());
		diagramModelConnectionEClass.getESuperTypes().add(this.getDocumentable());
		diagramModelBendpointEClass.getESuperTypes().add(this.getCloneable());
		archimateDiagramModelEClass.getESuperTypes().add(this.getDiagramModel());
		diagramModelArchimateObjectEClass.getESuperTypes().add(this.getDiagramModelObject());
		diagramModelArchimateObjectEClass.getESuperTypes().add(this.getDiagramModelContainer());
		diagramModelArchimateConnectionEClass.getESuperTypes().add(this.getDiagramModelConnection());
		businessObjectEClass.getESuperTypes().add(this.getBusinessLayerElement());
		sketchModelEClass.getESuperTypes().add(this.getDiagramModel());
		sketchModelStickyEClass.getESuperTypes().add(this.getDiagramModelObject());
		sketchModelStickyEClass.getESuperTypes().add(this.getDiagramModelContainer());
		sketchModelStickyEClass.getESuperTypes().add(this.getTextContent());
		sketchModelStickyEClass.getESuperTypes().add(this.getProperties());
		sketchModelActorEClass.getESuperTypes().add(this.getDiagramModelObject());
		sketchModelActorEClass.getESuperTypes().add(this.getDocumentable());
		sketchModelActorEClass.getESuperTypes().add(this.getProperties());

		// Initialize classes and features; add operations and parameters
		initEClass(adapterEClass, IAdapter.class, "Adapter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		EOperation op = addEOperation(adapterEClass, ecorePackage.getEJavaObject(), "getAdapter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "adapter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(adapterEClass, null, "setAdapter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "adapter", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEJavaObject(), "object", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(identifierEClass, IIdentifier.class, "Identifier", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getIdentifier_Id(), ecorePackage.getEString(), "id", null, 0, 1, IIdentifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(propertyEClass, IProperty.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getProperty_Key(), ecorePackage.getEString(), "key", "", 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", "", 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getProperty_Generated(), ecorePackage.getEBoolean(), "generated", "false", 0, 1, IProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(propertiesEClass, IProperties.class, "Properties", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getProperties_Properties(), this.getProperty(), null, "properties", null, 0, -1, IProperties.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(nameableEClass, INameable.class, "Nameable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getNameable_Name(), ecorePackage.getEString(), "name", "", 0, 1, INameable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(textContentEClass, ITextContent.class, "TextContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getTextContent_Content(), ecorePackage.getEString(), "content", "", 0, 1, ITextContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(documentableEClass, IDocumentable.class, "Documentable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDocumentable_Documentation(), ecorePackage.getEString(), "documentation", "", 0, 1, IDocumentable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(cloneableEClass, ICloneable.class, "Cloneable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		addEOperation(cloneableEClass, ecorePackage.getEObject(), "getCopy", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(folderContainerEClass, IFolderContainer.class, "FolderContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFolderContainer_Folders(), this.getFolder(), null, "folders", null, 0, -1, IFolderContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(archimateModelEClass, IArchimateModel.class, "ArchimateModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArchimateModel_Purpose(), ecorePackage.getEString(), "purpose", null, 0, 1, IArchimateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArchimateModel_File(), this.getFile(), "file", null, 0, 1, IArchimateModel.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getArchimateModel_Version(), ecorePackage.getEString(), "version", "", 0, 1, IArchimateModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(archimateModelEClass, null, "setDefaults", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(archimateModelEClass, this.getFolder(), "addDerivedRelationsFolder", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(archimateModelEClass, null, "removeDerivedRelationsFolder", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(archimateModelEClass, this.getFolder(), "getDefaultFolderForElement", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEObject(), "element", 1, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(archimateModelEClass, this.getDiagramModel(), "getDefaultDiagramModel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(archimateModelEClass, this.getDiagramModel(), "getDiagramModels", 0, -1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(archimateModelEClass, this.getFolder(), "getFolder", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getFolderType(), "type", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(archimateModelElementEClass, IArchimateModelElement.class, "ArchimateModelElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getArchimateModelElement_ArchimateModel(), this.getArchimateModel(), null, "archimateModel", null, 0, 1, IArchimateModelElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(folderEClass, IFolder.class, "Folder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getFolder_Elements(), ecorePackage.getEObject(), null, "elements", null, 0, -1, IFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFolder_Type(), this.getFolderType(), "type", null, 0, 1, IFolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(archimateElementEClass, IArchimateElement.class, "ArchimateElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(junctionElementEClass, IJunctionElement.class, "JunctionElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(interfaceElementEClass, IInterfaceElement.class, "InterfaceElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getInterfaceElement_InterfaceType(), ecorePackage.getEInt(), "interfaceType", "0", 0, 1, IInterfaceElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(junctionEClass, IJunction.class, "Junction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(andJunctionEClass, IAndJunction.class, "AndJunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(orJunctionEClass, IOrJunction.class, "OrJunction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(relationshipEClass, IRelationship.class, "Relationship", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getRelationship_Source(), this.getArchimateElement(), null, "source", null, 0, 1, IRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getRelationship_Target(), this.getArchimateElement(), null, "target", null, 0, 1, IRelationship.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(associationRelationshipEClass, IAssociationRelationship.class, "AssociationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(specialisationRelationshipEClass, ISpecialisationRelationship.class, "SpecialisationRelationship", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(businessLayerElementEClass, IBusinessLayerElement.class, "BusinessLayerElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(diagramModelComponentEClass, IDiagramModelComponent.class, "DiagramModelComponent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDiagramModelComponent_DiagramModel(), this.getDiagramModel(), null, "diagramModel", null, 0, 1, IDiagramModelComponent.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelContainerEClass, IDiagramModelContainer.class, "DiagramModelContainer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDiagramModelContainer_Children(), this.getDiagramModelObject(), null, "children", null, 0, -1, IDiagramModelContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelEClass, IDiagramModel.class, "DiagramModel", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiagramModel_ConnectionRouterType(), ecorePackage.getEInt(), "connectionRouterType", null, 0, 1, IDiagramModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelReferenceEClass, IDiagramModelReference.class, "DiagramModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDiagramModelReference_ReferencedModel(), this.getDiagramModel(), null, "referencedModel", null, 0, 1, IDiagramModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelObjectEClass, IDiagramModelObject.class, "DiagramModelObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDiagramModelObject_Bounds(), this.getBounds(), null, "bounds", null, 0, 1, IDiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDiagramModelObject_SourceConnections(), this.getDiagramModelConnection(), null, "sourceConnections", null, 0, -1, IDiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDiagramModelObject_TargetConnections(), this.getDiagramModelConnection(), null, "targetConnections", null, 0, -1, IDiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiagramModelObject_FillColor(), ecorePackage.getEString(), "fillColor", null, 0, 1, IDiagramModelObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diagramModelObjectEClass, null, "addConnection", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getDiagramModelConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diagramModelObjectEClass, null, "removeConnection", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getDiagramModelConnection(), "connection", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diagramModelObjectEClass, null, "setBounds", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEInt(), "x", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEInt(), "y", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEInt(), "width", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, ecorePackage.getEInt(), "height", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelGroupEClass, IDiagramModelGroup.class, "DiagramModelGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(diagramModelNoteEClass, IDiagramModelNote.class, "DiagramModelNote", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(diagramModelImageEClass, IDiagramModelImage.class, "DiagramModelImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(diagramModelConnectionEClass, IDiagramModelConnection.class, "DiagramModelConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiagramModelConnection_Text(), ecorePackage.getEString(), "text", "", 0, 1, IDiagramModelConnection.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEReference(getDiagramModelConnection_Source(), this.getDiagramModelObject(), null, "source", null, 0, 1, IDiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDiagramModelConnection_Target(), this.getDiagramModelObject(), null, "target", null, 0, 1, IDiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEReference(getDiagramModelConnection_Bendpoints(), this.getDiagramModelBendpoint(), null, "bendpoints", null, 0, -1, IDiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiagramModelConnection_LineWidth(), ecorePackage.getEInt(), "lineWidth", "1", 0, 1, IDiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getDiagramModelConnection_LineColor(), ecorePackage.getEString(), "lineColor", null, 0, 1, IDiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiagramModelConnection_Type(), ecorePackage.getEInt(), "type", null, 0, 1, IDiagramModelConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diagramModelConnectionEClass, null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getDiagramModelObject(), "source", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getDiagramModelObject(), "target", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(diagramModelConnectionEClass, null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(diagramModelConnectionEClass, null, "reconnect", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelBendpointEClass, IDiagramModelBendpoint.class, "DiagramModelBendpoint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiagramModelBendpoint_StartX(), ecorePackage.getEInt(), "startX", null, 0, 1, IDiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiagramModelBendpoint_StartY(), ecorePackage.getEInt(), "startY", null, 0, 1, IDiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiagramModelBendpoint_EndX(), ecorePackage.getEInt(), "endX", null, 0, 1, IDiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiagramModelBendpoint_EndY(), ecorePackage.getEInt(), "endY", null, 0, 1, IDiagramModelBendpoint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(fontAttributeEClass, IFontAttribute.class, "FontAttribute", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getFontAttribute_Font(), ecorePackage.getEString(), "font", null, 0, 1, IFontAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFontAttribute_FontColor(), ecorePackage.getEString(), "fontColor", null, 0, 1, IFontAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFontAttribute_TextAlignment(), ecorePackage.getEInt(), "textAlignment", null, 0, 1, IFontAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getFontAttribute_TextPosition(), ecorePackage.getEInt(), "textPosition", null, 0, 1, IFontAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		addEOperation(fontAttributeEClass, ecorePackage.getEInt(), "getDefaultTextAlignment", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(borderObjectEClass, IBorderObject.class, "BorderObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBorderObject_BorderColor(), ecorePackage.getEString(), "borderColor", null, 0, 1, IBorderObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelImageProviderEClass, IDiagramModelImageProvider.class, "DiagramModelImageProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getDiagramModelImageProvider_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, IDiagramModelImageProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(boundsEClass, IBounds.class, "Bounds", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getBounds_X(), ecorePackage.getEInt(), "x", null, 0, 1, IBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBounds_Y(), ecorePackage.getEInt(), "y", null, 0, 1, IBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getBounds_Width(), ecorePackage.getEInt(), "width", "-1", 0, 1, IBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$
		initEAttribute(getBounds_Height(), ecorePackage.getEInt(), "height", "-1", 0, 1, IBounds.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		addEOperation(boundsEClass, this.getBounds(), "getCopy", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(lockableEClass, ILockable.class, "Lockable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getLockable_Locked(), ecorePackage.getEBoolean(), "locked", null, 0, 1, ILockable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(archimateDiagramModelEClass, IArchimateDiagramModel.class, "ArchimateDiagramModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getArchimateDiagramModel_Viewpoint(), ecorePackage.getEInt(), "viewpoint", null, 0, 1, IArchimateDiagramModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelArchimateObjectEClass, IDiagramModelArchimateObject.class, "DiagramModelArchimateObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDiagramModelArchimateObject_ArchimateElement(), this.getArchimateElement(), null, "archimateElement", null, 0, 1, IDiagramModelArchimateObject.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$
		initEAttribute(getDiagramModelArchimateObject_Type(), ecorePackage.getEInt(), "type", "0", 0, 1, IDiagramModelArchimateObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		op = addEOperation(diagramModelArchimateObjectEClass, null, "addArchimateElementToModel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getFolder(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(diagramModelArchimateObjectEClass, null, "removeArchimateElementFromModel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(diagramModelArchimateConnectionEClass, IDiagramModelArchimateConnection.class, "DiagramModelArchimateConnection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEReference(getDiagramModelArchimateConnection_Relationship(), this.getRelationship(), null, "relationship", null, 0, 1, IDiagramModelArchimateConnection.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$

		op = addEOperation(diagramModelArchimateConnectionEClass, null, "addRelationshipToModel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$
		addEParameter(op, this.getFolder(), "parent", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		addEOperation(diagramModelArchimateConnectionEClass, null, "removeRelationshipFromModel", 0, 1, IS_UNIQUE, IS_ORDERED); //$NON-NLS-1$

		initEClass(businessObjectEClass, IBusinessObject.class, "BusinessObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sketchModelEClass, ISketchModel.class, "SketchModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$
		initEAttribute(getSketchModel_Background(), ecorePackage.getEInt(), "background", "1", 0, 1, ISketchModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED); //$NON-NLS-1$ //$NON-NLS-2$

		initEClass(sketchModelStickyEClass, ISketchModelSticky.class, "SketchModelSticky", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		initEClass(sketchModelActorEClass, ISketchModelActor.class, "SketchModelActor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Initialize enums and add enum literals
		initEEnum(folderTypeEEnum, FolderType.class, "FolderType"); //$NON-NLS-1$
		addEEnumLiteral(folderTypeEEnum, FolderType.USER);
		addEEnumLiteral(folderTypeEEnum, FolderType.BUSINESS);
		addEEnumLiteral(folderTypeEEnum, FolderType.APPLICATION);
		addEEnumLiteral(folderTypeEEnum, FolderType.TECHNOLOGY);
		addEEnumLiteral(folderTypeEEnum, FolderType.CONNECTORS);
		addEEnumLiteral(folderTypeEEnum, FolderType.RELATIONS);
		addEEnumLiteral(folderTypeEEnum, FolderType.DIAGRAMS);
		addEEnumLiteral(folderTypeEEnum, FolderType.DERIVED);
		addEEnumLiteral(folderTypeEEnum, FolderType.MOTIVATION);
		addEEnumLiteral(folderTypeEEnum, FolderType.IMPLEMENTATION_MIGRATION);

		// Initialize data types
		initEDataType(fileEDataType, File.class, "File", !IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS); //$NON-NLS-1$

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

    /**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData"; //$NON-NLS-1$		
		addAnnotation
		  (getProperties_Properties(), 
		   source, 
		   new String[] {
			 "name", "property", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getTextContent_Content(), 
		   source, 
		   new String[] {
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDocumentable_Documentation(), 
		   source, 
		   new String[] {
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFolderContainer_Folders(), 
		   source, 
		   new String[] {
			 "name", "folder", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (archimateModelEClass, 
		   source, 
		   new String[] {
			 "name", "model" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getArchimateModel_Purpose(), 
		   source, 
		   new String[] {
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getFolder_Elements(), 
		   source, 
		   new String[] {
			 "name", "element", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDiagramModelContainer_Children(), 
		   source, 
		   new String[] {
			 "name", "child", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDiagramModelReference_ReferencedModel(), 
		   source, 
		   new String[] {
			 "name", "model", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "attribute" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDiagramModelObject_SourceConnections(), 
		   source, 
		   new String[] {
			 "name", "sourceConnection", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (diagramModelGroupEClass, 
		   source, 
		   new String[] {
			 "name", "Group" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (diagramModelNoteEClass, 
		   source, 
		   new String[] {
			 "name", "Note" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (getDiagramModelConnection_Bendpoints(), 
		   source, 
		   new String[] {
			 "name", "bendpoint", //$NON-NLS-1$ //$NON-NLS-2$
			 "kind", "element" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (diagramModelArchimateObjectEClass, 
		   source, 
		   new String[] {
			 "name", "DiagramObject" //$NON-NLS-1$ //$NON-NLS-2$
		   });		
		addAnnotation
		  (diagramModelArchimateConnectionEClass, 
		   source, 
		   new String[] {
			 "name", "Connection" //$NON-NLS-1$ //$NON-NLS-2$
		   });
	}

} //ArchimatePackage
