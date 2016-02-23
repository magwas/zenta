/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.templates.impl.model;

import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.IZentaUIImages;
import org.rulez.magwas.zenta.controller.IZentaImages;
import org.rulez.magwas.zenta.templates.model.AbstractTemplate;



/**
 * Zenta Model Template
 * 
 * @author Phillip Beauvoir
 */
public class ZentaModelTemplate extends AbstractTemplate {
    
    public static final String XML_TEMPLATE_ATTRIBUTE_TYPE_MODEL = "model"; //$NON-NLS-1$
    
    public ZentaModelTemplate() {
    }

    public ZentaModelTemplate(String id) {
        super(id);
    }

    @Override
    public Image getImage() {
        return IZentaUIImages.ImageFactory.getImage(IZentaImages.ICON_MODELS_16);
    }

    @Override
    public String getType() {
        return XML_TEMPLATE_ATTRIBUTE_TYPE_MODEL;
    }
}
