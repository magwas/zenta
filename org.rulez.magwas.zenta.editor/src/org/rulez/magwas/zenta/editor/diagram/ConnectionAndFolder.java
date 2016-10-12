package org.rulez.magwas.zenta.editor.diagram;

import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelConnection;
import org.rulez.magwas.zenta.model.IFolder;

public class ConnectionAndFolder {

	private IBasicRelationship object;
	private IFolder folder;
	private IDiagramModelConnection connection;

	public ConnectionAndFolder(IBasicRelationship object, IFolder folder, IDiagramModelConnection connection) {
		this.setObject(object);
		this.setFolder(folder);
		this.setConnection(connection);
	}

	public IBasicRelationship getObject() {
		return object;
	}

	public void setObject(IBasicRelationship object) {
		this.object = object;
	}

	public IFolder getFolder() {
		return folder;
	}

	public void setFolder(IFolder folder) {
		this.folder = folder;
	}

	public IDiagramModelConnection getConnection() {
		return connection;
	}

	public void setConnection(IDiagramModelConnection connection) {
		this.connection = connection;
	}

}
