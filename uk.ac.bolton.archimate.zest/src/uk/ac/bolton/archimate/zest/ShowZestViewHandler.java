/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package uk.ac.bolton.archimate.zest;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import uk.ac.bolton.archimate.editor.ui.services.ViewManager;


/**
 * Command Action Handler to show Zest View
 * 
 * @author Phillip Beauvoir
 */
public class ShowZestViewHandler extends AbstractHandler {

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        ViewManager.toggleViewPart(IZestView.ID, false);
        return null;
    }

}
