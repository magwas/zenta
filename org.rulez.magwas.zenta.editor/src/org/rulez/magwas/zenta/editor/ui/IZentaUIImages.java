package org.rulez.magwas.zenta.editor.ui;

import org.rulez.magwas.zenta.editor.ZentaEditorPlugin;
import org.rulez.magwas.zenta.model.info.IZentaImages;

public interface IZentaUIImages extends IZentaImages {

    ImageFactory ImageFactory = new ImageFactory(ZentaEditorPlugin.INSTANCE);


}