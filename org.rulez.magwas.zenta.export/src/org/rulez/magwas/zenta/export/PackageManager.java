package org.rulez.magwas.zenta.export;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import org.eclipse.core.runtime.Platform;

public class PackageManager {

	private static int BUFSIZE = 4096; //I love arbitrary constants
	
    public static void bringPackagedStyles(File targetdir) {
		Enumeration<URL> e = Platform.getBundle("org.rulez.magwas.zenta.export").findEntries("/styles/", "*", true);
    	for (; e.hasMoreElements() ;) {
    		Boolean isdir = false;
    		URL p = e.nextElement();
            String[] ss = p.getFile().split("/",-1);
            File now = targetdir;
            for(int i=2;i<ss.length;i++) {
            	if(!now.isDirectory()) {
            		now.mkdir();
            	}
                isdir = (0 == ss[i].compareTo(""));
            	now = new File(now,ss[i]);
            }
    		try {
    			if (!isdir) {
    				copy(p,now);
    			}
			} catch (IOException ex) {
				Widgets.tellProblem("Could not extract contents",ex.toString());
				ex.printStackTrace();
			}
        }

    }
    
    private static void copy(URL from, File to) throws IOException {
        BufferedInputStream urlin = new BufferedInputStream(from.openConnection().getInputStream());
        BufferedOutputStream fout = new BufferedOutputStream(new FileOutputStream(to));
        int read = -1;
        byte[] buf = new byte[BUFSIZE];
        while ((read = urlin.read(buf, 0, BUFSIZE)) >= 0) {
            fout.write(buf, 0, read);
        }
        fout.flush();
        fout.close();
    }

}
