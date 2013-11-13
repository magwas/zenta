/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.figures.connections;


import java.util.ArrayList;
import java.util.List;

import org.rulez.magwas.zenta.model.IDiagramModelZentaConnection;


/**
 * Association Connection Figure
 * 
 * @author Phillip Beauvoir
 */
public class AssociationConnectionFigure extends AbstractZentaConnectionFigure {
	
	private List<AbstractConnectionDecoration> decorations;
	
    public AssociationConnectionFigure(IDiagramModelZentaConnection connection) {
        super(connection);
        initDecorations();
    }

    public void addDecoration(String decorName) {
    	decorations.add(ConnectionDecorationFactory.getByName(decorName, this));
    }
    
    public void initDecorations() {
        decorations = new ArrayList<AbstractConnectionDecoration>();    	
    }
    
    @Override
    protected void setFigureProperties() {
    	System.out.println("decorations:"+decorations);
    	if(null!=decorations) {
        	for(AbstractConnectionDecoration decor : decorations) {
        		decor.setFigureProperties();
        	}    		
    	}
    }
}
