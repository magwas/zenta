/**
 * This program and the accompanying materials
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
import uk.ac.bolton.archimate.model.IAggregationRelationship;
import uk.ac.bolton.archimate.model.IAndJunction;
import uk.ac.bolton.archimate.model.IArchimateDiagramModel;
import uk.ac.bolton.archimate.model.IArchimateFactory;
import uk.ac.bolton.archimate.model.IArchimateModel;
import uk.ac.bolton.archimate.model.IArchimatePackage;
import uk.ac.bolton.archimate.model.IAssociationRelationship;
import uk.ac.bolton.archimate.model.IBounds;
import uk.ac.bolton.archimate.model.IBusinessObject;
import uk.ac.bolton.archimate.model.IDiagramModelArchimateConnection;
import uk.ac.bolton.archimate.model.IDiagramModelArchimateObject;
import uk.ac.bolton.archimate.model.IDiagramModelBendpoint;
import uk.ac.bolton.archimate.model.IDiagramModelConnection;
import uk.ac.bolton.archimate.model.IDiagramModelGroup;
import uk.ac.bolton.archimate.model.IDiagramModelImage;
import uk.ac.bolton.archimate.model.IDiagramModelNote;
import uk.ac.bolton.archimate.model.IDiagramModelReference;
import uk.ac.bolton.archimate.model.IFolder;
import uk.ac.bolton.archimate.model.IJunction;
import uk.ac.bolton.archimate.model.IOrJunction;
import uk.ac.bolton.archimate.model.IProperty;
import uk.ac.bolton.archimate.model.ISketchModel;
import uk.ac.bolton.archimate.model.ISketchModelActor;
import uk.ac.bolton.archimate.model.ISketchModelSticky;
import uk.ac.bolton.archimate.model.ISpecialisationRelationship;

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
			case IArchimatePackage.PROPERTY: return createProperty();
			case IArchimatePackage.ARCHIMATE_MODEL: return createArchimateModel();
			case IArchimatePackage.FOLDER: return createFolder();
			case IArchimatePackage.JUNCTION: return createJunction();
			case IArchimatePackage.AND_JUNCTION: return createAndJunction();
			case IArchimatePackage.OR_JUNCTION: return createOrJunction();
			case IArchimatePackage.ASSOCIATION_RELATIONSHIP: return createAssociationRelationship();
			case IArchimatePackage.SPECIALISATION_RELATIONSHIP: return createSpecialisationRelationship();
			case IArchimatePackage.DIAGRAM_MODEL_REFERENCE: return createDiagramModelReference();
			case IArchimatePackage.DIAGRAM_MODEL_GROUP: return createDiagramModelGroup();
			case IArchimatePackage.DIAGRAM_MODEL_NOTE: return createDiagramModelNote();
			case IArchimatePackage.DIAGRAM_MODEL_IMAGE: return createDiagramModelImage();
			case IArchimatePackage.DIAGRAM_MODEL_CONNECTION: return createDiagramModelConnection();
			case IArchimatePackage.DIAGRAM_MODEL_BENDPOINT: return createDiagramModelBendpoint();
			case IArchimatePackage.BOUNDS: return createBounds();
			case IArchimatePackage.ARCHIMATE_DIAGRAM_MODEL: return createArchimateDiagramModel();
			case IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_OBJECT: return createDiagramModelArchimateObject();
			case IArchimatePackage.DIAGRAM_MODEL_ARCHIMATE_CONNECTION: return createDiagramModelArchimateConnection();
			case IArchimatePackage.BUSINESS_OBJECT: return createBusinessObject();
			case IArchimatePackage.SKETCH_MODEL: return createSketchModel();
			case IArchimatePackage.SKETCH_MODEL_STICKY: return createSketchModelSticky();
			case IArchimatePackage.SKETCH_MODEL_ACTOR: return createSketchModelActor();
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
	 * @generated
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
    public IBusinessObject createBusinessObject() {
		BusinessObject businessObject = new BusinessObject();
		return businessObject;
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
    public IDiagramModelImage createDiagramModelImage() {
		DiagramModelImage diagramModelImage = new DiagramModelImage();
		return diagramModelImage;
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
    public IAssociationRelationship createAssociationRelationship() {
		AssociationRelationship associationRelationship = new AssociationRelationship();
		return associationRelationship;
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
