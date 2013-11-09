/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.model;

import java.io.IOException;

import org.rulez.magwas.zenta.model.IZentamateModel;


/**
 * Exporter interface
 * 
 * @author Phillip Beauvoir
 */
public interface IModelExporter {

    void export(IZentamateModel model) throws IOException;

}