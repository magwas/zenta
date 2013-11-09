/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.business;

import org.eclipse.swt.graphics.Color;
import org.rulez.magwas.zenta.editor.ui.ColorFactory;
import org.rulez.magwas.zenta.editor.ui.factory.AbstractElementUIProvider;



/**
 * Abstract Business UI Provider
 * 
 * @author Phillip Beauvoir
 */
public abstract class AbstractBusinessUIProvider extends AbstractElementUIProvider {
    
    @Override
    public Color getDefaultColor() {
        return ColorFactory.COLOR_BUSINESS;
    }
}
