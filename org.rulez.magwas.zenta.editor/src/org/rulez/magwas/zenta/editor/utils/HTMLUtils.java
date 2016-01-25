/**
 * This program and the accompanying materials
 * are made available under the terms of the License
 * which accompanies this distribution in the file LICENSE.txt
 */
package org.rulez.magwas.zenta.editor.utils;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Pattern;

import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.browser.IWebBrowser;
import org.eclipse.ui.browser.IWorkbenchBrowserSupport;
import org.rulez.magwas.zenta.model.util.LogUtil;


/**
 * HTML Utils
 * 
 * @author Phillip Beauvoir
 */
public class HTMLUtils {
    
    // Previous versions
    // "(http|https|ftp)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%&=]*)?"             // Original
    // "(http|https|ftp)://([\\w-]+\\.)+[\\w-]+(/[\\w- ./?%~&=]*)?"            // Added ~
    // "(http|https|ftp)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%~&=]*)?"             // Removed space
    // "(http|https|ftp)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%~&=\\(\\)]*)?"       // Added \\( and \\)
    // "(http|https|ftp)://([\\w-]+\\.)+[\\w-]+(/[\\w-./?%~#!&=\\(\\)]*)?";    // Added # and !
    
    /**
     * The reg expression for HTML links
     */
    public static final String HTML_LINK_REGEX = "(http|https|ftp)://([\\w-]+\\.)+[\\w-]+([\\w-./?%~#!:&=\\(\\)]*)?";  // Removed leading / and added : //$NON-NLS-1$
    
    /**
     * The compiled pattern to match HTML links
     */
    public static final Pattern HTML_LINK_PATTERN = Pattern.compile(HTML_LINK_REGEX);
    
    /**
     * The reg expression for HTML tags
     */
    public static final String HTML_TAG_REGEX = "<[^>]+>"; //$NON-NLS-1$

    /** 
     * The compiled pattern to match HTML tags
     */
    public static final Pattern HTML_TAG_REGEX_PATTERN = Pattern.compile(HTML_TAG_REGEX);
    
    /**
     * Strip tags out of a String
     * @param str
     * @return
     */
    
	public static String stripTags(String str) {
        if (str.indexOf('<') == -1 || str.indexOf('>') == -1) {
            return str;
        }
        str = HTML_TAG_REGEX_PATTERN.matcher(str).replaceAll(""); //$NON-NLS-1$
        return str;
    }

    /**
     * Open a link in a Browser
     * @param href
     */
    public static void openLinkInBrowser(String href) {
        // format the href for an html file (file:///<filename.html>
        // required for Mac only.
        href = canoniCaliseFileHref(href);
        
        IWorkbenchBrowserSupport support = PlatformUI.getWorkbench().getBrowserSupport();
        try {
            IWebBrowser browser = support.getExternalBrowser();
            browser.openURL(new URL(urlEncodeForSpaces(href)));
        }
        catch(MalformedURLException ex) {
            LogUtil.logException(ex);
        }
        catch(PartInitException ex) {
            LogUtil.logException(ex);
        }
    }

	
	private static String urlEncodeForSpaces(String href) {
		return urlEncodeForSpaces(href.toCharArray());
	}

	
	private static String canoniCaliseFileHref(String href) {
		if(href.startsWith("file:")) { //$NON-NLS-1$
            href = href.substring(5);
            while(href.startsWith("/")) { //$NON-NLS-1$
                href = href.substring(1);
            }
            href = "file:///" + href; //$NON-NLS-1$
        }
		return href;
	}

    
	private static String urlEncodeForSpaces(char[] input) {
        StringBuffer retu = new StringBuffer(input.length);
        for(int i = 0; i < input.length; i++) {
            if(input[i] == ' ') {
                retu.append("%20"); //$NON-NLS-1$
            }
            else {
                retu.append(input[i]);
            }
        }
        return retu.toString();
    }
    
}
