/**
 * Copyright (c) 2010 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.model.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.bolton.archimate.model.FolderType;
import uk.ac.bolton.archimate.model.IAccessRelationship;
import uk.ac.bolton.archimate.model.IAggregationRelationship;
import uk.ac.bolton.archimate.model.IAndJunction;
import uk.ac.bolton.archimate.model.IApplicationCollaboration;
import uk.ac.bolton.archimate.model.IApplicationComponent;
import uk.ac.bolton.archimate.model.IApplicationFunction;
import uk.ac.bolton.archimate.model.IApplicationInteraction;
import uk.ac.bolton.archimate.model.IApplicationInterface;
import uk.ac.bolton.archimate.model.IApplicationService;
import uk.ac.bolton.archimate.model.IArchimateDiagramModel;
import uk.ac.bolton.archimate.model.IArchimateFactory;
import uk.ac.bolton.archimate.model.IArchimateModel;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IArtifact;
import uk.ac.bolton.archimate.model.IAssignmentRelationship;
import uk.ac.bolton.archimate.model.IAssociationRelationship;
import uk.ac.bolton.archimate.model.IBounds;
import uk.ac.bolton.archimate.model.IBusinessActivity;
import uk.ac.bolton.archimate.model.IBusinessActor;
import uk.ac.bolton.archimate.model.IBusinessCollaboration;
import uk.ac.bolton.archimate.model.IBusinessEvent;
import uk.ac.bolton.archimate.model.IBusinessFunction;
import uk.ac.bolton.archimate.model.IBusinessInteraction;
import uk.ac.bolton.archimate.model.IBusinessInterface;
import uk.ac.bolton.archimate.model.IBusinessObject;
import uk.ac.bolton.archimate.model.IBusinessProcess;
import uk.ac.bolton.archimate.model.IBusinessRole;
import uk.ac.bolton.archimate.model.IBusinessService;
import uk.ac.bolton.archimate.model.ICommunicationPath;
import uk.ac.bolton.archimate.model.ICompositionRelationship;
import uk.ac.bolton.archimate.model.IContract;
import uk.ac.bolton.archimate.model.IDataObject;
import uk.ac.bolton.archimate.model.IDevice;
import uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection;
import uk.ac.bolton.archimate.model.IDiagramModelArchimateObject;
import uk.ac.bolton.archimate.model.IDiagramModelBendpoint;
import uk.ac.bolton.archimate.model.IDiagramModelConnection;
import uk.ac.bolton.archimate.model.IDiagramModelGroup;
import uk.ac.bolton.archimate.model.IDiagramModelNote;
import uk.ac.bolton.archimate.model.IDiagramModelReference;
import uk.ac.bolton.archimate.model.IFlowRelationship;
import uk.ac.bolton.archimate.model.IFolder;
import uk.ac.bolton.archimate.model.IInfrastructureInterface;
import uk.ac.bolton.archimate.model.IInfrastructureService;
import uk.ac.bolton.archimate.model.IJunction;
import uk.ac.bolton.archimate.model.IMeaning;
import uk.ac.bolton.archimate.model.INetwork;
import uk.ac.bolton.archimate.model.INode;
import uk.ac.bolton.archimate.model.IOrJunction;
import uk.ac.bolton.archimate.model.IProduct;
import uk.ac.bolton.archimate.model.IProperty;
import uk.ac.bolton.archimate.model.IRealisationRelationship;
import uk.ac.bolton.archimate.model.IRepresentation;
import uk.ac.bolton.archimate.model.ISketchModel;
import uk.ac.bolton.archimate.model.ISketchModelActor;
import uk.ac.bolton.archimate.model.ISketchModelSticky;
import uk.ac.bolton.archimate.model.ISpecialisationRelationship;
import uk.ac.bolton.archimate.model.ISystemSoftware;
import uk.ac.bolton.archimate.model.ITriggeringRelationship;
import uk.ac.bolton.archimate.model.IUsedByRelationship;
import uk.ac.bolton.archimate.model.IValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ArchimateFactory extends EFactoryImpl implements IArchimateFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static IArchimateFactory init() {
		try {
			IArchimateFactory theArchimateFactory = (IArchimateFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.bolton.ac.uk/archimate"); //$NON-NLS-1$ 
			if (theArchimateFactory != null) {
				return theArchimateFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ArchimateFactory();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ArchimateFactory() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IArchimatePackage.PROPERTY: return (EObject)createProperty();
			case IArchimatePackage.ARCHIMATE_MODEL: return (EObject)createArchimateModel();
			case IArchimatePackage.FOLDER: return (EObject)createFolder();
			case IArchimatePackage.JUNCTION: return (EObject)createJunction();
			case IArchimatePackage.AND_JUNCTION: return (EObject)createAndJunction();
			case IArchimatePackage.OR_JUNCTION: return (EObject)createOrJunction();
			case IArchimatePackage.ACCESS_RELATIONSHIP: return (EObject)createAccessRelationship();
			case IArchimatePackage.AGGREGATION_RELATIONSHIP: return (EObject)createAggregationRelationship();
			case IArchimatePackage.ASSIGNMENT_RELATIONSHIP: return (EObject)createAssignmentRelationship();
			case IArchimatePackage.ASSOCIATION_RELATIONSHIP: return (EObject)createAssociationRelationship();
			case IArchimatePackage.COMPOSITION_RELATIONSHIP: return (EObject)createCompositionRelationship();
			case IArchimatePackage.FLOW_RELATIONSHIP: return (EObject)createFlowRelationship();
			case IArchimatePackage.REALISATION_RELATIONSHIP: return (EObject)createRealisationRelationship();
			case IArchimatePackage.SPECIALISATION_RELATIONSHIP: return (EObject)createSpecialisationRelationship();
			case IArchimatePackage.TRIGGERING_RELATIONSHIP: return (EObject)createTriggeringRelationship();
			case IArchimatePackage.USED_BY_RELATIONSHIP: return (EObject)createUsedByRelationship();
			case IArchimatePackage.BUSINESS_ACTIVITY: return (EObject)createBusinessActivity();
			case IArchimatePackage.BUSINESS_ACTOR: return (EObject)createBusinessActor();
			case IArchimatePackage.BUSINESS_COLLABORATION: return (EObject)createBusinessCollaboration();
			case IArchimatePackage.CONTRACT: return (EObject)createContract();
			case IArchimatePackage.BUSINESS_EVENT: return (EObject)createBusinessEvent();
			case IArchimatePackage.BUSINESS_FUNCTION: return (EObject)createBusinessFunction();
			case IArchimatePackage.BUSINESS_INTERACTION: return (EObject)createBusinessInteraction();
			case IArchimatePackage.BUSINESS_INTERFACE: return (EObject)createBusinessInterface();
			case IArchimatePackage.MEANING: return (EObject)createMeaning();
			case IArchimatePackage.BUSINESS_OBJECT: return (EObject)createBusinessObject();
			case IArchimatePackage.BUSINESS_PROCESS: return (EObject)createBusinessProcess();
			case IArchimatePackage.PRODUCT: return (EObject)createProduct();
			case IArchimatePackage.REPRESENTATION: return (EObject)createRepresentation();
			case IArchimatePackage.BUSINESS_ROLE: return (EObject)createBusinessRole();
			case IArchimatePackage.BUSINESS_SERVICE: return (EObject)createBusinessService();
			case IArchimatePackage.VALUE: return (EObject)createValue();
			case IArchimatePackage.APPLICATION_COLLABORATION: return (EObject)createApplicationCollaboration();
			case IArchimatePackage.APPLICATION_COMPONENT: return (EObject)createApplicationComponent();
			case IArchimatePackage.APPLICATION_FUNCTION: return (EObject)createApplicationFunction();
			case IArchimatePackage.APPLICATION_INTERACTION: return (EObject)createApplicationInteraction();
			case IArchimatePackage.APPLICATION_INTERFACE: return (EObject)createApplicationInterface();
			case IArchimatePackage.DATA_OBJECT: return (EObject)createDataObject();
			case IArchimatePackage.APPLICATION_SERVICE: return (EObject)createApplicationService();
			case IArchimatePackage.ARTIFACT: return (EObject)createArtifact();
			case IArchimatePackage.COMMUNICATION_PATH: return (EObject)createCommunicationPath();
			case IArchimatePackage.NETWORK: return (EObject)createNetwork();
			case IArchimatePackage.INFRASTRUCTURE_INTERFACE: return (EObject)createInfrastructureInterface();
			case IArchimatePackage.INFRASTRUCTURE_SERVICE: return (EObject)createInfrastructureService();
			case IArchimatePackage.NODE: return (EObject)createNode();
			case IArchimatePackage.SYSTEM_SOFTWARE: return (EObject)createSystemSoftware();
			case IArchimatePackage.DEVICE: return (EObject)createDevice();
			case IArchimatePackage.DIAGRAM_MODEL_REFERENCE: return (EObject)createDiagramModelReference();
			case IArchimatePackage.DIAGRAM_MODEL_GROUP: return (EObject)createDiagramModelGroup();
			case IArchimatePackage.DIAGRAM_MODEL_NOTE: return (EObject)createDiagramModelNote();
			case IArchimatePackage.DIAGRAM_MODEL_CONNECTION: return (EObject)createDiagramModelConnection();
			case IArchimatePackage.DIAGRAM_MODEL_BENDPOINT: return (EObject)createDiagramModelBendpoint();
			case IArchimatePackage.BOUNDS: return (EObject)createBounds();
			case IArchimatePackage.ARCHIMATE_DIAGRAM_MODEL: return (EObject)createArchimateDiagramModel();
			case IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT: return (EObject)createDiagramModelArchimateObject();
			case IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION: return (EObject)createDiagramModelArchimateConnection();
			case IArchimatePackage.SKETCH_MODEL: return (EObject)createSketchModel();
			case IArchimatePackage.SKETCH_MODEL_STICKY: return (EObject)createSketchModelSticky();
			case IArchimatePackage.SKETCH_MODEL_ACTOR: return (EObject)createSketchModelActor();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case IArchimatePackage.FOLDER_TYPE:
				return createFolderTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case IArchimatePackage.FOLDER_TYPE:
				return convertFolderTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IProperty createProperty() {
		Property property = new Property();
		return property;
	}

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated NOT
     */
    public IArchimateModel createArchimateModel() {
        ArchimateModel archimateModel = new ArchimateModel();
        return archimateModel;
    }

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IFolder createFolder() {
		Folder folder = new Folder();
		return folder;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessActivity createBusinessActivity() {
		BusinessActivity businessActivity = new BusinessActivity();
		return businessActivity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessActor createBusinessActor() {
		BusinessActor businessActor = new BusinessActor();
		return businessActor;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessCollaboration createBusinessCollaboration() {
		BusinessCollaboration businessCollaboration = new BusinessCollaboration();
		return businessCollaboration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IContract createContract() {
		Contract contract = new Contract();
		return contract;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessEvent createBusinessEvent() {
		BusinessEvent businessEvent = new BusinessEvent();
		return businessEvent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessFunction createBusinessFunction() {
		BusinessFunction businessFunction = new BusinessFunction();
		return businessFunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessInteraction createBusinessInteraction() {
		BusinessInteraction businessInteraction = new BusinessInteraction();
		return businessInteraction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessInterface createBusinessInterface() {
		BusinessInterface businessInterface = new BusinessInterface();
		return businessInterface;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IMeaning createMeaning() {
		Meaning meaning = new Meaning();
		return meaning;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessObject createBusinessObject() {
		BusinessObject businessObject = new BusinessObject();
		return businessObject;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessProcess createBusinessProcess() {
		BusinessProcess businessProcess = new BusinessProcess();
		return businessProcess;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IProduct createProduct() {
		Product product = new Product();
		return product;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IRepresentation createRepresentation() {
		Representation representation = new Representation();
		return representation;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessRole createBusinessRole() {
		BusinessRole businessRole = new BusinessRole();
		return businessRole;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBusinessService createBusinessService() {
		BusinessService businessService = new BusinessService();
		return businessService;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IValue createValue() {
		Value value = new Value();
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IApplicationComponent createApplicationComponent() {
		ApplicationComponent applicationComponent = new ApplicationComponent();
		return applicationComponent;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IApplicationFunction createApplicationFunction() {
		ApplicationFunction applicationFunction = new ApplicationFunction();
		return applicationFunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IApplicationInteraction createApplicationInteraction() {
		ApplicationInteraction applicationInteraction = new ApplicationInteraction();
		return applicationInteraction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IApplicationInterface createApplicationInterface() {
		ApplicationInterface applicationInterface = new ApplicationInterface();
		return applicationInterface;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDataObject createDataObject() {
		DataObject dataObject = new DataObject();
		return dataObject;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IApplicationService createApplicationService() {
		ApplicationService applicationService = new ApplicationService();
		return applicationService;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IArtifact createArtifact() {
		Artifact artifact = new Artifact();
		return artifact;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ICommunicationPath createCommunicationPath() {
		CommunicationPath communicationPath = new CommunicationPath();
		return communicationPath;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public INetwork createNetwork() {
		Network network = new Network();
		return network;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IInfrastructureInterface createInfrastructureInterface() {
		InfrastructureInterface infrastructureInterface = new InfrastructureInterface();
		return infrastructureInterface;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IInfrastructureService createInfrastructureService() {
		InfrastructureService infrastructureService = new InfrastructureService();
		return infrastructureService;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public INode createNode() {
		Node node = new Node();
		return node;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISystemSoftware createSystemSoftware() {
		SystemSoftware systemSoftware = new SystemSoftware();
		return systemSoftware;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDevice createDevice() {
		Device device = new Device();
		return device;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IArchimateDiagramModel createArchimateDiagramModel() {
		ArchimateDiagramModel archimateDiagramModel = new ArchimateDiagramModel();
		return archimateDiagramModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelReference createDiagramModelReference() {
		DiagramModelReference diagramModelReference = new DiagramModelReference();
		return diagramModelReference;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelArchimateObject createDiagramModelArchimateObject() {
		DiagramModelArchimateObject diagramModelArchimateObject = new DiagramModelArchimateObject();
		return diagramModelArchimateObject;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelGroup createDiagramModelGroup() {
		DiagramModelGroup diagramModelGroup = new DiagramModelGroup();
		return diagramModelGroup;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelNote createDiagramModelNote() {
		DiagramModelNote diagramModelNote = new DiagramModelNote();
		return diagramModelNote;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelConnection createDiagramModelConnection() {
		DiagramModelConnection diagramModelConnection = new DiagramModelConnection();
		return diagramModelConnection;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelArchimateConnection createDiagramModelArchimateConnection() {
		DiagramModelArchimateConnection diagramModelArchimateConnection = new DiagramModelArchimateConnection();
		return diagramModelArchimateConnection;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IDiagramModelBendpoint createDiagramModelBendpoint() {
		DiagramModelBendpoint diagramModelBendpoint = new DiagramModelBendpoint();
		return diagramModelBendpoint;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IBounds createBounds() {
		Bounds bounds = new Bounds();
		return bounds;
	}
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModel createSketchModel() {
		SketchModel sketchModel = new SketchModel();
		return sketchModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModelSticky createSketchModelSticky() {
		SketchModelSticky sketchModelSticky = new SketchModelSticky();
		return sketchModelSticky;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISketchModelActor createSketchModelActor() {
		SketchModelActor sketchModelActor = new SketchModelActor();
		return sketchModelActor;
	}

    public IBounds createBounds(int x, int y, int width, int height) {
        Bounds bounds = new Bounds();
        bounds.setX(x);
        bounds.setY(y);
        bounds.setWidth(width);
        bounds.setHeight(height);
        return bounds;
    }
    
    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public FolderType createFolderTypeFromString(EDataType eDataType, String initialValue) {
		FolderType result = FolderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String convertFolderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IApplicationCollaboration createApplicationCollaboration() {
		ApplicationCollaboration applicationCollaboration = new ApplicationCollaboration();
		return applicationCollaboration;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IJunction createJunction() {
		Junction junction = new Junction();
		return junction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAndJunction createAndJunction() {
		AndJunction andJunction = new AndJunction();
		return andJunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IOrJunction createOrJunction() {
		OrJunction orJunction = new OrJunction();
		return orJunction;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAccessRelationship createAccessRelationship() {
		AccessRelationship accessRelationship = new AccessRelationship();
		return accessRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAggregationRelationship createAggregationRelationship() {
		AggregationRelationship aggregationRelationship = new AggregationRelationship();
		return aggregationRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAssignmentRelationship createAssignmentRelationship() {
		AssignmentRelationship assignmentRelationship = new AssignmentRelationship();
		return assignmentRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IAssociationRelationship createAssociationRelationship() {
		AssociationRelationship associationRelationship = new AssociationRelationship();
		return associationRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ICompositionRelationship createCompositionRelationship() {
		CompositionRelationship compositionRelationship = new CompositionRelationship();
		return compositionRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IFlowRelationship createFlowRelationship() {
		FlowRelationship flowRelationship = new FlowRelationship();
		return flowRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IRealisationRelationship createRealisationRelationship() {
		RealisationRelationship realisationRelationship = new RealisationRelationship();
		return realisationRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ISpecialisationRelationship createSpecialisationRelationship() {
		SpecialisationRelationship specialisationRelationship = new SpecialisationRelationship();
		return specialisationRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ITriggeringRelationship createTriggeringRelationship() {
		TriggeringRelationship triggeringRelationship = new TriggeringRelationship();
		return triggeringRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IUsedByRelationship createUsedByRelationship() {
		UsedByRelationship usedByRelationship = new UsedByRelationship();
		return usedByRelationship;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public IArchimatePackage getArchimatePackage() {
		return (IArchimatePackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static IArchimatePackage getPackage() {
		return IArchimatePackage.eINSTANCE;
	}

} //ArchimateFactory
