package org.rulez.magwas.zenta.model.manager;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;

import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.zenta.model.IAdapter;
import org.rulez.magwas.zenta.model.IZentaModel;

public interface IEditorModelManagerNoGUI {
		
    String ZENTA_FILE_EXTENSION = ".zenta"; //$NON-NLS-1$
    String ZENTA_FILE_WILDCARD = "*.zenta"; //$NON-NLS-1$
    
    String PROPERTY_MODEL_CREATED = "IEditorModelManager.model.created"; //$NON-NLS-1$
    String PROPERTY_MODEL_OPENED = "IEditorModelManager.model.opened"; //$NON-NLS-1$
    String PROPERTY_MODEL_LOADED = "IEditorModelManager.model.loaded"; //$NON-NLS-1$
    String PROPERTY_MODEL_REMOVED = "IEditorModelManager.model.removed"; //$NON-NLS-1$
    String PROPERTY_MODEL_SAVED = "IEditorModelManager.model.saved"; //$NON-NLS-1$
    
    String COMMAND_STACK_CHANGED = "IEditorModelManager.model.dirty"; //$NON-NLS-1$

    String PROPERTY_ECORE_EVENT = "IEditorModelManager.ecore.event"; //$NON-NLS-1$
    
    /*
     *  Notification that many ECore events will be fired in succession.
     *  Listeners can choose to then ignore the events and then update when notified of end.
     */
    String PROPERTY_ECORE_EVENTS_START = "IEditorModelManager.ecore.events.start"; //$NON-NLS-1$
    String PROPERTY_ECORE_EVENTS_END = "IEditorModelManager.ecore.events.end"; //$NON-NLS-1$
    
    /*
     * If the user creates a new view and it's open and then the user closes the application without first
     * saving the model, then Eclipse tries to restore it again next time. So we don't persist the state
     * of the diagram if the diagram view is not saved.
     */
    String ADAPTER_PROPERTY_MODEL_SAVED = "saved"; //$NON-NLS-1$
    
    NonNullList<IZentaModel> getModels();

    IZentaModel createNewModel();
    
    void registerModel(IZentaModel model);
    
    /**
     * Open a model by loading it and opening its Views
     * @return The newly opened model or null
     */
    IZentaModel openModel(File file);
    
    /**
     * Open an existing model
     * @param model
     */
    void openModel(IZentaModel model);
    
    /**
     * Load a model
     * @param file
     * @return The newly loaded model or null
     */
    IZentaModel loadModel(File file);
    
    /**
     * Close a model
     * @param model
     * @return false if user cancels
     * @throws IOException
     */
    boolean closeModel(IZentaModel model) throws IOException;
    
    /**
     * Save model asking user for file name if needed
     * @param model
     * @return false if user cancels
     * @throws IOException
     */
    boolean saveModel(IZentaModel model) throws IOException;
    
    /**
     * Save model as asking user for file name
     * @param model
     * @return false if user cancels
     * @throws IOException
     */
    boolean saveModelAs(IZentaModel model) throws IOException;
    
    /**
     * Save the state of loaded models
     * @throws IOException
     */
    void saveState() throws IOException;
    
    /**
     * @param file
     * @return True if the model backed by file is already loaded
     */
    boolean isModelLoaded(File file);
    
    /**
     * Add a Property Change Listener
     * @param listener
     */
    void addPropertyChangeListener(PropertyChangeListener listener);

    /**
     * Remove a Property Change Listener
     * @param listener
     */
    void removePropertyChangeListener(PropertyChangeListener listener);
    
    /**
     * Fire a Property Change event
     * @param source The object affected
     * @param prop The property that changed
     * @param oldValue Old Value 
     * @param newValue New Value
     */
    void firePropertyChange(Object source, String prop, Object oldValue, Object newValue);

	boolean laterModelDialog(File file, LaterModelVersionException ex);

	void incompatibleDialog(File file, IncompatibleModelException ex1);

	int saveModelDialog(IZentaModel model);

	boolean sureToOverwriteDialog(File file);

	void alreadyOpenDialog(File file);

	String askSavePath();

	boolean removeModelWithoutDirtyCheck(IZentaModel model);

	IArchiveManager obtainArchiveManager(IAdapter obj);

    boolean isModelDirty( IZentaModel model);

	void signalStart(Object self);

	void signalEnd(Object self);
    
}
