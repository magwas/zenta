package org.rulez.magwas.zenta.model.manager;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

import org.rulez.magwas.zenta.model.IDiagramModel;
import org.rulez.magwas.zenta.model.IZentaModel;

public interface IEditorModelInterface {
	//to be implemented by an editor
	
	public void bailOut();
	
	public void removeModel(IZentaModel model);
	
	public boolean askSaveModel(IZentaModel model, IEditorModelManagerNoGUI manager) throws IOException;

	public File getUserDataFolder();

	public void createNewCommandStack(final IZentaModel model, IEditorModelManagerNoGUI manager);
	
	public void setCommandStackSavePoint(IZentaModel model);
	
	public void saveImageToStream(ModelImage image, OutputStream zOut, int format) throws Exception;
	
	public IModelImageManager getImageManagerForArchiveManager(IArchiveManager archiveManager);

	public IEditorModelManagerNoGUI getModelManager();

	public void openDiagramEditor(IDiagramModel dm);

	public boolean shouldBackupOnSave();

	public boolean doOpenDiagramsOnLoad();

	public void closeDiagramEditors(IZentaModel model);

	public String askSavePath(IZentaModel model);

	public boolean sureToOverwriteDialog(File file);
}
