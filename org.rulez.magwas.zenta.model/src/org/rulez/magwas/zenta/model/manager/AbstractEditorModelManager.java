package org.rulez.magwas.zenta.model.manager;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMIException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IFolder;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.ModelConsistencyException;
import org.rulez.magwas.zenta.model.ModelVersion;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.ZentaObject;
import org.rulez.magwas.zenta.model.handmade.util.FileUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.util.LogUtil;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;
import org.xml.sax.SAXParseException;

import uk.ac.bolton.jdom.JDOMUtils;

public abstract class AbstractEditorModelManager implements IEditorModelManagerNoGUI {

	/**
	 * Listener list
	 */
	private PropertyChangeSupport fListeners = new PropertyChangeSupport(this);
	/**
	 * Models Open
	 */
	private NonNullList<IZentaModel> fModels;
	/**
	 * Backing File
	 */
	IEditorModelInterface editorInterface = IZentaFactory.eINSTANCE.getEditorInterface();
	
	private File backingFile = new File(editorInterface.getUserDataFolder(), "models.xml");

	public AbstractEditorModelManager() {
		super();
	}

	
	@Override
	public NonNullList<IZentaModel> getModels() {
	    if(fModels == null) {
	        fModels = new NonNullArrayList<IZentaModel>();
	        
	        try {
	            loadState();
	        }
	        catch(Exception ex) {
	            LogUtil.logException(ex);
	        }
	    }
	    
	    return fModels;
	}

	@Override
	public IZentaModel createNewModel() {
	    IZentaModel model = IZentaFactory.eINSTANCE.createZentaModel();
	    model.setName(Messages.EditorModelManager_0);
	    
	    // Add one default diagram
	    IDiagramModel diagramModel = IZentaFactory.eINSTANCE.createZentaDiagramModel();
	    diagramModel.setName(Messages.EditorModelManager_1);
	    model.getElements().add(diagramModel);
	    
	    // Register
	    registerModel(model);
	    model.check();
	    return model;
	}

	@Override
	public void registerModel(IZentaModel model) {
	    // Add to Models
	    getModels().add(model);
	    
	    // New Command Stack
	    editorInterface.createNewCommandStack(model, this);
	    
	    // New Archive Manager
	    createNewArchiveManager(model);
	    
	    firePropertyChange(this, PROPERTY_MODEL_CREATED, null, model);
	    model.eAdapters().add(new ECoreAdapter());
	}

	@Override
	public IZentaModel openModel(File file) throws IOException {
	    if(isModelLoaded(file)) {
	    	return findModelByfile(file);
	    }
	    
	    IZentaModel model = loadModel(file);
        // Open Views of newly opened model if set in Preferences
        if(editorInterface.doOpenDiagramsOnLoad()) {
            for(IDiagramModel dm : model.getDiagramModels()) {
                editorInterface.openDiagramEditor(dm);
            }
        }
        
        firePropertyChange(this, PROPERTY_MODEL_OPENED, null, model);
	    
	    return model;
	}

	@Override
	public void openModel(IZentaModel model) {
	    // Add to Models
	    getModels().add(model);
	    
	    editorInterface.createNewCommandStack(model, this);
	    
	    // New Archive Manager
	    createNewArchiveManager(model);
	    
	    model.eAdapters().add(new ECoreAdapter());
	
	    firePropertyChange(this, PROPERTY_MODEL_OPENED, null, model);
	}

	@Override
	public IZentaModel loadModel(File file) throws IOException {
	    if(!file.exists()) {
	    	throw new NoSuchFileException();
	    }
	    
	    // Ascertain if this is an archive file
	    boolean useArchiveFormat = IArchiveManager.FACTORY.isArchiveFile(file);
	    
	    // Create the Resource
	    ResourceSet resourceSet = ZentaResourceFactoryBase.createResourceSet();
	    Resource resource = resourceSet.createResource(useArchiveFormat ?
	                                                   IArchiveManager.FACTORY.createArchiveModelURI(file) :
	                                                   URI.createFileURI(file.getAbsolutePath()));
	
	    // Load the model file
	    try {
	    	resource.load(null);
	    } catch(IOException ex) {
	    	logErrorsAndMaybeThrowException(resource, ex);
        }

	    analyzeModelLoad(resource);
	    
	
	    IZentaModel model = (IZentaModel)resource.getContents().get(0);
	    IZentaModel m = Util.verifyNonNull(model);
		IZentaFactory.eINSTANCE.getMetamodelFor(m);
	    model.setFile(file);
	    checkModel(model);
	    getModels().add(model);
	    model.eAdapters().add(new ECoreAdapter());
	
	    editorInterface.createNewCommandStack(model, this);
	    
	    // New Archive Manager
	    createNewArchiveManager(model);
	    
	    // Initiate all diagram models to be marked as "saved" - this is for the editor view persistence
	    markDiagramModelsAsSaved(model);
	
	    // This last
	    firePropertyChange(this, PROPERTY_MODEL_LOADED, null, model);
	
	    return model;
	}

	private void checkModel(IZentaModel m) {
		boolean okay=false;
		while(!okay) {
			try {
				m.check();
				okay = true;
			} catch(ModelConsistencyException ex) {
				ZentaObject element = ex.getElement();
				((IFolder)element.eContainer()).getElements().remove(element);
			}
		}
	}


	private void logErrorsAndMaybeThrowException(Resource resource, IOException ex) throws IOException {
		boolean catastrophee=false;
		for(Diagnostic diagnostic : resource.getErrors()) {
		    System.err.println(diagnostic);
		    if(isCatastrophicError(diagnostic)) {
		    	catastrophee = true;
		        LogUtil.logError(diagnostic.getMessage());
		    }
		    else {
		        LogUtil.logWarning(diagnostic.getMessage());
		    }
		}

		if(catastrophee) {
		    throw ex;
		}
	}
    private static boolean isCatastrophicError(Diagnostic diagnostic) {
        if(diagnostic instanceof PackageNotFoundException) {
            return true;
        }
        
        if(diagnostic instanceof ClassNotFoundException) {
            return true;
        }
        
        if(diagnostic instanceof XMIException) {
            XMIException ex = (XMIException)diagnostic;
            if(ex.getCause() instanceof SAXParseException) {
                return true;
            }
        }
        
        return false;
    }


	private void analyzeModelLoad(Resource resource) {
		EList<Diagnostic> errors = resource.getErrors();
		for (Diagnostic d : errors) {
			System.out.println("Error: "+ d);
		}
		EList<Diagnostic> warnings = resource.getWarnings();
		for (Diagnostic d : warnings) {
			System.out.println("Error: "+ d);
		}
		System.out.println("loaded:"+resource.isLoaded());
	}

	@Override
	public boolean closeModel(IZentaModel model) throws IOException {
	    // Check if model needs saving
	    if(isModelDirty(model)) {
	        boolean result = askSaveModel(model);
	        if(!result) {
	            return false;
	        }
	    }
	    
	    return removeModelWithoutDirtyCheck(model);
	}

	@Override
	public boolean removeModelWithoutDirtyCheck(IZentaModel model) {
		// Close the corresponding GEF editor(s) for this model *FIRST* before removing from model
	    editorInterface.closeDiagramEditors(model);
	    
	    getModels().remove(model);
	    model.eAdapters().clear();
	    firePropertyChange(this, PROPERTY_MODEL_REMOVED, null, model);
	    
	    // Delete Archive Manager
	    deleteArchiveManager(model);
	
	    return true;
	}


	public int saveModelDialog(IZentaModel model) {
		throw new UnTestedException();
	}

	@Override
	public boolean saveModel(IZentaModel model) throws IOException {
	    // First time to save...
	    if(model.getFile() == null) {
	        File file = askFilenameForModelSave(model);
	        if(file == null) { // cancelled
	            return false;
	        }
	        model.setFile(file);
	    }
	    
	    File file = model.getFile();
	    
	    // Save backup (if set in Preferences)
	    if(editorInterface.shouldBackupOnSave() && file.exists()) {
	        FileUtils.copyFile(file, new File(model.getFile().getAbsolutePath() + ".bak"), false); //$NON-NLS-1$
	    }
	    
	    // Set model version
	    model.setVersion(ModelVersion.VERSION);
	    
	    // Use Archive Manager to save contents
	    IArchiveManager archiveManager = obtainArchiveManager(model);
	    archiveManager.saveModel();
	    
	    editorInterface.setCommandStackSavePoint(model);
	    // Send notification to Tree
	    firePropertyChange(model, COMMAND_STACK_CHANGED, true, false);
	    
	    // Set all diagram models to be marked as "saved" - this is for the editor view persistence
	    markDiagramModelsAsSaved(model);
	    
	    firePropertyChange(this, PROPERTY_MODEL_SAVED, null, model);
	    
	    return true;
	}

	@Override
	public boolean saveModelAs(IZentaModel model) throws IOException {
	    File file = askFilenameForModelSave(model);
	    if(file == null) {
	        return false;
	    }
	    
	    // Set new file
	    model.setFile(file);
	    
	    // And save it to new file
	    return saveModel(model);
	}

	@Override
	public boolean isModelLoaded(File file) {
        IZentaModel modellke = findModelByfile(file);
	    return modellke != null;
	}

	private IZentaModel findModelByfile(File file) {
		for(IZentaModel model : getModels()) {
            if(file.equals(model.getFile())) {
                return model;
            }
	    }
		return null;
	}

	/**
	 * Ask user for file name to save model
	 * @param model 
	 * @return the file or null
	 */
	private File askFilenameForModelSave(IZentaModel model) {
	    String path = askSavePath(model);
	    if(path == null)
	    	return null;
	    File file = new File(path);
	    
	    // Make sure we don't already have it open
	    for(IZentaModel m : getModels()) {
	        if(file.equals(m.getFile())) {
	            alreadyOpenDialog(file);
	            return null;
	        }
	    }
	    
	    // Make sure the file does not already exist
	    if(file.exists()) {
	        boolean result = sureToOverwriteDialog(file);
	        if(!result) {
	            return null;
	        }
	    }
	    
	    return file;
	}



	public String askSavePath(IZentaModel model) {
		return editorInterface.askSavePath(model);
	}

	public void alreadyOpenDialog(File file) {
		throw new UnTestedException();
	}

	public boolean sureToOverwriteDialog(File file) {
		return editorInterface.sureToOverwriteDialog(file);
	}


	/**
	 * Set all diagram models in a model to be marked as "saved" - this for the editor view persistence
	 */
	private void markDiagramModelsAsSaved(IZentaModel model) {
	    for(IDiagramModel dm : model.getDiagramModels()) {
	        dm.setAdapter(ADAPTER_PROPERTY_MODEL_SAVED, true);
	    }
	}

	/**
	 * Create a new ArchiveManager for the model
	 */
	private IArchiveManager createNewArchiveManager(IZentaModel model) {
	    IArchiveManager archiveManager = IArchiveManager.FACTORY.createArchiveManager(model);
	    model.setAdapter(IArchiveManager.class, archiveManager);
	    
	    // Load images now
	    try {
	        archiveManager.loadImages();
	    }
	    catch(IOException ex) {
	        LogUtil.logError("Could not load images", ex); //$NON-NLS-1$
	        LogUtil.logException(ex);
	    }
	    
	    return archiveManager;
	}

	/**
	 * Remove the model's ArchiveManager
	 */
	public void deleteArchiveManager(IZentaModel model) {
	    IArchiveManager archiveManager = (IArchiveManager)model.getAdapter(IArchiveManager.class);
	    if(archiveManager != null) {
	        archiveManager.dispose();
	    }
	}

	public void saveState() throws IOException {
	    Document doc = new Document();
	    Element rootElement = new Element("models"); //$NON-NLS-1$
	    doc.setRootElement(rootElement);
	    for(IZentaModel model : getModels()) {
	        File file = model.getFile(); // has been saved
	        if(file != null) {
	            Element modelElement = new Element("model"); //$NON-NLS-1$
	            modelElement.setAttribute("file", file.getAbsolutePath()); //$NON-NLS-1$
	            rootElement.addContent(modelElement);
	        }
	    }
	    JDOMUtils.write2XMLFile(doc, backingFile);
	}

	public void loadState() throws IOException, JDOMException {
	    if(backingFile.exists()) {
	        Document doc = JDOMUtils.readXMLFile(backingFile);
	        if(doc.hasRootElement()) {
	            Element rootElement = doc.getRootElement();
	            for(Object e : rootElement.getChildren("model")) { //$NON-NLS-1$
	                Element modelElement = (Element)e;
	                String filePath = modelElement.getAttributeValue("file"); //$NON-NLS-1$
	                if(filePath != null) {
	                    File file = new File(filePath);
	                    if(file.exists())
	                    	loadModel(file);
	                }
	            }
	        }
	    }
	}

	public void addPropertyChangeListener(PropertyChangeListener listener) {
	    fListeners.addPropertyChangeListener(listener);
	}

	public void removePropertyChangeListener(PropertyChangeListener listener) {
	    fListeners.removePropertyChangeListener(listener);
	}

	public void firePropertyChange(Object source, String prop, Object oldValue,
			Object newValue) {
			    fListeners.firePropertyChange(new PropertyChangeEvent(source, prop, oldValue, newValue));
			}

    @Override
	public void signalEnd(Object self) {
		editorInterface.getModelManager().firePropertyChange(self,
	            IEditorModelManagerNoGUI.PROPERTY_ECORE_EVENTS_END, false, true);
	}

	@Override
	public void signalStart(Object self) {
		editorInterface.getModelManager().firePropertyChange(self,
				IEditorModelManagerNoGUI.PROPERTY_ECORE_EVENTS_START, false, true);
	}

	/**
     * Adapter listener class.
     * Forwards on messages so that listeners don't have to adapt to ECore objects
     */
    class ECoreAdapter extends EContentAdapter {
        @Override
        public void notifyChanged(Notification msgo) {
        	Notification msg = Util.verifyNonNull(msgo);
            super.notifyChanged(msg);
            firePropertyChange(this, PROPERTY_ECORE_EVENT, null, msg);
        }
    }

    @Override
	public IArchiveManager obtainArchiveManager(IAdapter obj) {
		IAdapter ob = Util.verifyNonNull(obj);
		IArchiveManager adapter = (IArchiveManager) ob.getAdapter(IArchiveManager.class);
		return Util.verifyNonNull(adapter);
	}

	public boolean askSaveModel(IZentaModel model) throws IOException {
		return editorInterface.askSaveModel(model, this);
	}

}