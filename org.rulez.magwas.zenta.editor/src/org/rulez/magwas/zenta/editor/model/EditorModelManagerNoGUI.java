package org.rulez.magwas.zenta.editor.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.File;
import java.io.IOException;
import java.util.EventObject;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.gef.commands.CommandStack;
import org.eclipse.gef.commands.CommandStackListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchListener;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.rulez.magwas.nonnul.NonNullArrayList;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.nonnul.NonNullListIterator;
import org.rulez.magwas.zenta.editor.Logger;
import org.rulez.magwas.zenta.editor.ZentaEditorPlugin;
import org.rulez.magwas.zenta.editor.diagram.util.AnimationUtil;
import org.rulez.magwas.zenta.editor.model.compatibility.CompatibilityHandlerException;
import org.rulez.magwas.zenta.editor.model.compatibility.IncompatibleModelException;
import org.rulez.magwas.zenta.editor.model.compatibility.LaterModelVersionException;
import org.rulez.magwas.zenta.editor.model.compatibility.ModelCompatibility;
import org.rulez.magwas.zenta.editor.model.impl.Messages;
import org.rulez.magwas.zenta.editor.preferences.IPreferenceConstants;
import org.rulez.magwas.zenta.editor.preferences.Preferences;
import org.rulez.magwas.zenta.editor.ui.services.EditorManager;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IZentaFactory;
import org.rulez.magwas.zenta.model.IZentaModel;
import org.rulez.magwas.zenta.model.ModelVersion;
import org.rulez.magwas.zenta.model.UnTestedException;
import org.rulez.magwas.zenta.model.handmade.util.FileUtils;
import org.rulez.magwas.zenta.model.handmade.util.Util;
import org.rulez.magwas.zenta.model.util.LogUtil;
import org.rulez.magwas.zenta.model.util.ZentaResourceFactoryBase;

import uk.ac.bolton.jdom.JDOMUtils;

public class EditorModelManagerNoGUI implements IEditorModelManager {

	public class NoSuchFileException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	}

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
	private File backingFile = new File(ZentaEditorPlugin.INSTANCE.getUserDataFolder(), "models.xml");
	/**
	 * Listen to the App closing so we can ask to save
	 */
	protected IWorkbenchListener workBenchListener = new IWorkbenchListener() {
	        public void postShutdown(IWorkbench workbench) {
	        }
	
	        public boolean preShutdown(IWorkbench  workbench, boolean forced) {
	            for (NonNullListIterator<IZentaModel> iterator = getModels().iterator(); iterator
						.hasNext();) {
					IZentaModel model = iterator.next();
					if(isModelDirty(model)) {
	                    try {
	                        boolean result = askSaveModel(model);
	                        if(!result) {
	                            return false;
	                        }
	                    }
	                    catch(IOException ex) {
	                        LogUtil.logException(ex);
	                    }
	                }
				}
	            
	            return true;
	        }
	    };

	public EditorModelManagerNoGUI() {
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
	    
	    return model;
	}

	@Override
	public void registerModel(IZentaModel model) {
	    // Add to Models
	    getModels().add(model);
	    
	    // New Command Stack
	    createNewCommandStack(model);
	    
	    // New Archive Manager
	    createNewArchiveManager(model);
	    
	    firePropertyChange(this, PROPERTY_MODEL_CREATED, null, model);
	    model.eAdapters().add(new ECoreAdapter());
	}

	@Override
	public IZentaModel openModel(File file) {
	    if(isModelLoaded(file)) {
	    	throw new NoSuchFileException();
	    }
	    
	    IZentaModel model = loadModel(file);
        // Open Views of newly opened model if set in Preferences
        if(Preferences.doOpenDiagramsOnLoad()) {
            for(IDiagramModel dm : model.getDiagramModels()) {
                EditorManager.openDiagramEditor(dm);
            }
        }
        
        firePropertyChange(this, PROPERTY_MODEL_OPENED, null, model);
	    
	    return model;
	}

	@Override
	public void openModel(IZentaModel model) {
	    // Add to Models
	    getModels().add(model);
	    
	    // New Command Stack
	    createNewCommandStack(model);
	    
	    // New Archive Manager
	    createNewArchiveManager(model);
	    
	    model.eAdapters().add(new ECoreAdapter());
	
	    firePropertyChange(this, PROPERTY_MODEL_OPENED, null, model);
	}

	@Override
	public IZentaModel loadModel(File file) {
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
	    }
	    catch(IOException ex) {
	        // Error occured loading model. Was it a disaster?
	        try {
	            ModelCompatibility.checkErrors(resource);
	        }
	        // Incompatible, don't load it
	        catch(IncompatibleModelException ex1) {
	            incompatibleDialog(file, ex1);
	            throw new RuntimeException(ex1);
	        }
	    }
	    
	    // Once loaded - Check version number compatibility with user
	    try {
	        ModelCompatibility.checkVersion(resource);
	    }
	    catch(LaterModelVersionException ex) {
	        boolean answer = laterModelDialog(file, ex);
	        if(!answer) {
	            throw new RuntimeException(ex);
	        }
	    }
	    
	    // And then fix any backward compatibility issues
	    try {
	        ModelCompatibility.fixCompatibility(resource);
	    }
	    catch(CompatibilityHandlerException ex) {
	    }
	
	
	    IZentaModel model = (IZentaModel)resource.getContents().get(0);
	    IZentaModel m = Util.verifyNonNull(model);
		IZentaFactory.eINSTANCE.getMetamodelFor(m);
	    model.setFile(file);
	    getModels().add(model);
	    model.eAdapters().add(new ECoreAdapter());
	
	    // New Command Stack
	    createNewCommandStack(model);
	    
	    // New Archive Manager
	    createNewArchiveManager(model);
	    
	    // Initiate all diagram models to be marked as "saved" - this is for the editor view persistence
	    markDiagramModelsAsSaved(model);
	
	    // This last
	    firePropertyChange(this, PROPERTY_MODEL_LOADED, null, model);
	
	    return model;
	}

	public boolean laterModelDialog(File file, LaterModelVersionException ex) {
		throw new RuntimeException(ex);
	}

	public void incompatibleDialog(File file, IncompatibleModelException ex1) {
		throw new RuntimeException(ex1);
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
	    EditorManager.closeDiagramEditors(model);
	    
	    getModels().remove(model);
	    model.eAdapters().clear();
	    firePropertyChange(this, PROPERTY_MODEL_REMOVED, null, model);
	    
	    // Delete the CommandStack *LAST* because GEF Editor(s) will still reference it!
	    deleteCommandStack(model);
	    
	    // Delete Archive Manager
	    deleteArchiveManager(model);
	
	    return true;
	}

	/**
	 * Show dialog to save modified model
	 * @param model
	 * @return true if the user chose to save the model or chose not to save the model, false if cancelled
	 * @throws IOException 
	 */
	private boolean askSaveModel(IZentaModel model) throws IOException {
	    int result = saveModelDialog(model);
	    
	    // Yes
	    if(result == 0) {
	        return saveModel(model);
	    }
	    // No
	    if(result == 1) {
	        return true;
	    }
	    // Cancel
	    return false;
	}

	public int saveModelDialog(IZentaModel model) {
		throw new UnTestedException();
	}

	@Override
	public boolean saveModel(IZentaModel model) throws IOException {
	    // First time to save...
	    if(model.getFile() == null) {
	        File file = askSaveModel();
	        if(file == null) { // cancelled
	            return false;
	        }
	        model.setFile(file);
	    }
	    
	    File file = model.getFile();
	    
	    // Save backup (if set in Preferences)
	    if(Preferences.STORE.getBoolean(IPreferenceConstants.BACKUP_ON_SAVE) && file.exists()) {
	        FileUtils.copyFile(file, new File(model.getFile().getAbsolutePath() + ".bak"), false); //$NON-NLS-1$
	    }
	    
	    // Set model version
	    model.setVersion(ModelVersion.VERSION);
	    
	    // Use Archive Manager to save contents
	    IArchiveManager archiveManager = obtainArchiveManager(model);
	    archiveManager.saveModel();
	    
	    // Set CommandStack Save point
	    CommandStack stack = (CommandStack)model.getAdapter(CommandStack.class);
	    Util.verifyNonNull(stack).markSaveLocation();
	    // Send notification to Tree
	    firePropertyChange(model, COMMAND_STACK_CHANGED, true, false);
	    
	    // Set all diagram models to be marked as "saved" - this is for the editor view persistence
	    markDiagramModelsAsSaved(model);
	    
	    firePropertyChange(this, PROPERTY_MODEL_SAVED, null, model);
	    
	    return true;
	}

	@Override
	public boolean saveModelAs(IZentaModel model) throws IOException {
	    File file = askSaveModel();
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

	@Override
	public boolean isModelDirty(IZentaModel model) {
		IZentaModel m = Util.verifyNonNull(model);
	    CommandStack stack = EditorModelManagerNoGUI.obtainCommandStack(m);
	    return stack.isDirty();
	}

	/**
	 * Ask user for file name to save model
	 * @return the file or null
	 */
	private File askSaveModel() {
	    String path = askSavePath();
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



	public String askSavePath() {
		throw new UnTestedException();
	}

	public void alreadyOpenDialog(File file) {
		throw new UnTestedException();
	}

	public boolean sureToOverwriteDialog(File file) {
		throw new UnTestedException();
	}

	/**
	 * Create a new ComandStack for the Model
	 * @param model
	 */
	private void createNewCommandStack(final IZentaModel model) {
	    CommandStack cmdStack = new CommandStack();
	    
	    // Forward on CommandStack Event to Tree
	    cmdStack.addCommandStackListener(new CommandStackListener() {
	        public void commandStackChanged(EventObject event) {
	            // Send notification to Tree
	            firePropertyChange(model, COMMAND_STACK_CHANGED, false, true);
	        }
	    });
	    
	    // Animate Commands
	    AnimationUtil.registerCommandStack(cmdStack);
	    
	    model.setAdapter(CommandStack.class, cmdStack);
	}

	/**
	 * Remove a CommandStack
	 * @param model
	 */
	private void deleteCommandStack(IZentaModel model) {
	    CommandStack stack = (CommandStack)model.getAdapter(CommandStack.class);
	    if(stack != null) {
	        stack.dispose();
	    }
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
	        Logger.logError("Could not load images", ex); //$NON-NLS-1$
	        LogUtil.logException(ex);
	    }
	    
	    return archiveManager;
	}

	/**
	 * Remove the model's ArchiveManager
	 */
	private void deleteArchiveManager(IZentaModel model) {
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

	private void loadState() throws IOException, JDOMException {
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

    
	public static void signalEnd(Object self) {
		IEditorModelManager.INSTANCE.firePropertyChange(self,
	            IEditorModelManager.PROPERTY_ECORE_EVENTS_END, false, true);
	}

	
	public static void signalStart(Object self) {
		IEditorModelManager.INSTANCE.firePropertyChange(self,
	            IEditorModelManager.PROPERTY_ECORE_EVENTS_START, false, true);
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

	public static IArchiveManager obtainArchiveManager(IAdapter obj) {
		IAdapter ob = Util.verifyNonNull(obj);
		IArchiveManager adapter = (IArchiveManager) ob.getAdapter(IArchiveManager.class);
		return Util.verifyNonNull(adapter);
	}
	public static CommandStack obtainCommandStack(IAdapter obj) {
		IAdapter ob = Util.verifyNonNull(obj);
		CommandStack adapter = (CommandStack) ob.getAdapter(CommandStack.class);
		return Util.verifyNonNull(adapter);
	}

}