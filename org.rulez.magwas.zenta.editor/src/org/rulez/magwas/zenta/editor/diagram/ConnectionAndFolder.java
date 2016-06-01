package org.rulez.magwas.zenta.editor.diagram;

import org.rulez.magwas.zenta.model.IBasicRelationship;
import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;
import org.rulez.magwas.zenta.model.IFolder;

public class ConnectionAndFolder {

	private IBasicRelationship object;
	private IFolder folder;
	private IDiagramModelZentaConnection connection;

	public ConnectionAndFolder(IBasicRelationship object, IFolder folder, IDiagramModelZentaConnection connection) {
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

	public IDiagramModelZentaConnection getConnection() {
		return connection;
	}

	public void setConnection(IDiagramModelZentaConnection connection) {
		this.connection = connection;
	}

}
