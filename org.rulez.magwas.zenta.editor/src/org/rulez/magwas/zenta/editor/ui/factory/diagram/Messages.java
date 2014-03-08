/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.ui.factory.diagram;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

    private static final String BUNDLE_NAME = "org.rulez.magwas.zenta.editor.ui.factory.diagram.messages"; //$NON-NLS-1$

	public static final String DiagramImageUIProvider_0 = "Image";

    public static String DiagramModelReferenceUIProvider_0;

    public static String GroupUIProvider_0;

    public static String NoteUIProvider_0;
    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, Messages.class);
    }

    private Messages() {
    }
}
