/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.model.handmade.util;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.jdt.annotation.Nullable;

/**
 * Some useful String Utilities
 *
 * @author Phillip Beauvoir
 */
public final class StringUtils {
    
    /**
     * Empty String
     */
    final static String ZERO_LENGTH_STRING = ""; //$NON-NLS-1$

    /**
     * Ensures that a string is not null. Converts null strings into empty
     * strings, and leaves any other string unmodified. Use this to help
     * wrap calls to methods that return null instead of the empty string.
     * Can also help protect against implementation errors in methods that
     * are not supposed to return null. 
     * 
     * @param input input string (may be null)
     * @return input if not null, or the empty string if input is null
     */
    public static String safeString(@Nullable String input) {
        if(input != null) {
            return input;
        }

        return ZERO_LENGTH_STRING;
    }
    
    /**
     * Checks that a String contains some content
     * 
     * @param input
     * @return
     */
    public static boolean isSet(@Nullable String input) {
        return input != null && !ZERO_LENGTH_STRING.equals(input);
    }
    
    /**
     * Checks that a String contains some content after calling trim()
     * 
     * @param input
     * @return
     */
    public static boolean isSetAfterTrim(String input) {
        return isSet(input) && input.trim().length() > 0;
    }
    
    /**
     * @param s
     * @return A String consisting of x amount of the same character s
     *         If amount is zero or less, the empty String is returned.
     */
    public static String getStringCharacters(String s, int amount) {
        if(amount < 1) {
            return ""; //$NON-NLS-1$
        }
        
        String ret = s;
        
        for(int i = 1; i < amount; i++) {
            ret += s;
        }
        
        return ret;
    }
    
    /**
     * @param id
     * @return If ID is a valid XML ID or IDREF
     */
    public static boolean isValidID(String id) {
        if(!isSet(id)) {
            return false;
        }
        
        return id.matches("[a-zA-Z_][\\w-_.]*"); //$NON-NLS-1$
    }
    
    /**
     * Convert all illegal characters to "_"
     * @param id
     * @return
     */
    public static String getValidID(String id) {
        if(!StringUtils.isSet(id)) {
            return id;
        }
        String newId = id.replaceAll("[^a-zA-Z0-9-]", "_"); //$NON-NLS-1$ //$NON-NLS-2$
		return Util.verifyNonNull(newId); 
    }
    
    /**
     * In some controls (Label and CLabel) single ampersands don't show up
     * @param text
     * @return
     */
    public static String escapeAmpersandsInText(String text) {
        if(isSet(text)) {
            return Util.verifyNonNull(text.replaceAll("&", "&&"));  //$NON-NLS-1$//$NON-NLS-2$
        }
        return text;
    }

    // http://stackoverflow.com/a/15837355/1664273
    public static String join(Collection<?> col, String delim) {
        StringBuilder sb = new StringBuilder();
        Iterator<?> iter = col.iterator();
        if (iter.hasNext()) {
			Object theNext = iter.next();
			sb.append(theNext.toString());
		}
        while (iter.hasNext()) {
            sb.append(delim);
            sb.append(iter.next().toString());
        }
        String joined = sb.toString();
		return Util.verifyNonNull(joined);
    }
}