package org.rulez.magwas.zenta.editor.diagram.dialog;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;
import org.rulez.magwas.zenta.editor.ui.ZentaLabelProvider;
import org.rulez.magwas.zenta.model.IBasicRelationship;

public class RelationsTableViewerLabelCellProvider extends LabelProvider {
    @Override
    public String getText(Object element) {
    	return ((IBasicRelationship)element).getDefiningName();
    }
    
    @Override
    public Image getImage(Object element) {
        return ZentaLabelProvider.INSTANCE.getImage(element);
    }
 }