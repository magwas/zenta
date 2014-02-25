/**
 * Copyright (c) 2010-2012 Bolton University, UK.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model;

import java.util.List;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diagram Model Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.rulez.magwas.zenta.model.IDiagramModelComponent#getDiagramModel <em>Diagram Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelComponent()
 * @model abstract="true"
 * @generated
 */
public interface IDiagramModelComponent extends IIdentifier, ICloneable, IAdapter, INameable {
	public class DiagramModelObjectState implements UndoState {

		public List<IDiagramModelConnection> sourceConnections;
		public List<IDiagramModelConnection> targetConnections;
		public int index;
		public IDiagramModelContainer parent;
		public IDiagramModelObject object;

		public void undelete() {
			undeleteObjectFromContainer();
		}

			private void undeleteObjectFromContainer() {
				if(index != -1) { 
					parent.getChildren().add(index,object);
		        }
		        
		        addConnections(sourceConnections);
		        addConnections(targetConnections);
		        
		        sourceConnections.clear();
		        targetConnections.clear();
			}
		
			    private void addConnections(List<IDiagramModelConnection> connections) {
			        for(IDiagramModelConnection conn : connections) {
			            conn.reconnect();
			        }
			    }


	}
	UndoState delete();
	UndoState delete(UndoState save);

	/**
	 * Returns the value of the '<em><b>Diagram Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Model</em>' reference.
	 * @see org.rulez.magwas.zenta.model.IZentaPackage#getDiagramModelComponent_DiagramModel()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	IDiagramModel getDiagramModel();

} // IDiagramModelComponent
