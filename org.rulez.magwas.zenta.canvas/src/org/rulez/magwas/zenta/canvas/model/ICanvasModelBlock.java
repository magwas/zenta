/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.canvas.model;

import org.rulez.magwas.zenta.model.IBorderObject;
import org.rulez.magwas.zenta.model.IDiagramModelContainer;
import org.rulez.magwas.zenta.model.IHelpHintProvider;
import org.rulez.magwas.zenta.model.ILockable;
import org.rulez.magwas.zenta.model.IProperties;
import org.rulez.magwas.zenta.model.ITextContent;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Block</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.rulez.magwas.zenta.canvas.model.ICanvasPackage#getCanvasModelBlock()
 * @model superTypes="org.rulez.magwas.zenta.canvas.model.Iconic org.rulez.magwas.zenta.model.DiagramModelContainer org.rulez.magwas.zenta.model.Properties org.rulez.magwas.zenta.model.Lockable org.rulez.magwas.zenta.model.BorderObject org.rulez.magwas.zenta.canvas.model.HelpHintProvider org.rulez.magwas.zenta.canvas.model.HintProvider org.rulez.magwas.zenta.model.TextContent"
 * @generated
 */
public interface ICanvasModelBlock extends IIconic, IDiagramModelContainer, IProperties, ILockable, IBorderObject, IHelpHintProvider, IHintProvider, ITextContent {
	default void check() {
		// TODO unimplemented check
	}
} // ICanvasModelBlock
