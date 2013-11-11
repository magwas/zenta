/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.diagram.policies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.requests.CreateRequest;
import org.rulez.magwas.zenta.editor.diagram.commands.CreateDiagramZentaObjectCommand;
import org.rulez.magwas.zenta.model.IZentaPackage;



/**
 * Policy for General Diagram
 * 
 * @author Phillip Beauvoir
 */
public class ZentaDiagramLayoutPolicy
extends DiagramLayoutPolicy {
    
    @Override
    protected Command getCreateCommand(CreateRequest request) {
        Rectangle bounds = getConstraintFor(request);
        
        if(request.getNewObjectType() instanceof EClass) {
            EClass eClass = (EClass)request.getNewObjectType();
            
            // Zenta type object
            if(IZentaPackage.eINSTANCE.getZentaElement().isSuperTypeOf(eClass)) {
                return new CreateDiagramZentaObjectCommand(getHost(), request, bounds);
            }
        }
        
        return super.getCreateCommand(request);
    }
    
    @Override
    protected Dimension getMaximumSizeFor(Object object) {
        // Junctions should not be bigger than their default size
        if(object instanceof EClass && IZentaPackage.eINSTANCE.getJunctionElement().isSuperTypeOf((EClass)object)) {
            return new Dimension(-1, -1);
        }
        
        return super.getMaximumSizeFor(object);
    }
}

