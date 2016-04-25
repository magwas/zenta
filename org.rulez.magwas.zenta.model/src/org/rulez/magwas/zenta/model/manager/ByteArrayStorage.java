package org.rulez.magwas.zenta.model.manager;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.rulez.magwas.nonnul.NonNullEntry;
import org.rulez.magwas.nonnul.NonNullHashMap;
import org.rulez.magwas.nonnul.NonNullList;
import org.rulez.magwas.nonnul.NonNullMap;
import org.rulez.magwas.zenta.model.handmade.util.Util;

/**
 * Byte Array Storage Unit
 * 
 * @author Phillip Beauvoir
 */
public class ByteArrayStorage {
    
    private NonNullMap<String, byte[]> fdataTable = new NonNullHashMap<String, byte[]>();
    
    public InputStream getInputStream(String entryName) {
        byte[] bytes = fdataTable.get(entryName);
        return new ByteArrayInputStream(bytes);
    }

    public String getKey(byte[] bytes) {
        for(NonNullEntry<String, byte[]> entry : fdataTable.getEntrySet()) {
            byte[] entryBytes = entry.getValue();
            byte[] b = Util.verifyNonNull(entryBytes);
			if(isEqual(bytes, b)) {
                return entry.getKey();
            }
        }
        
        return null;
    }
    
    public long getEntrySize(String entryName) {
            byte[] bytes = fdataTable.get(entryName);
            byte[] b = Util.verifyNonNull(bytes);
			return b.length;
    }
    
    public NonNullList<NonNullEntry<String, byte[]>> getEntrySet() {
        return fdataTable.getEntrySet();
    }

    public boolean hasEntries() {
        return !fdataTable.isEmpty();
    }
    
    public boolean hasEntry(String entryName) {
        return fdataTable.containsKey(entryName);
    }
    
    public void removeEntry(String entryName) {
        fdataTable.remove(entryName);
    }
    
    public byte[] getEntry(String entryName) {
        return fdataTable.get(entryName);
    }
    
    public void addFileContentEntry(String entryName, File file) throws IOException {
        addStreamEntry(entryName, new FileInputStream(file));
    }
    
    public void addStreamEntry(String entryName, InputStream in) throws IOException {
        byte[] bytes = getBytesFromStream(in);
        addByteContentEntry(entryName, bytes);
    }

    public void addByteContentEntry(String entryName, byte[] bytes) {
        // If we have these bytes already, let's re-reference them
        String key = getKey(bytes);
        if(key != null) {
            fdataTable.put(entryName, getEntry(key));
        }
        else {
            fdataTable.put(entryName, bytes);
        }
    }
    
    public byte[] getBytesFromFile(File file) throws IOException {
    	if(!file.exists())
    		throw new NoSuchFileError();
        InputStream in = new FileInputStream(file);
        return getBytesFromStream(in);
    }
    
    private boolean isEqual(byte[] b1, byte[] b2) {
        
        if(b1.length == b2.length) {
            int i = 0;
            int j = 0;
            int n = b1.length;
            while(n-- != 0) {
                if(b1[i++] != b2[j++]) {
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }
    
    /**
     * Read in a stream and return its contents as a byte array
     */
    private byte[] getBytesFromStream(InputStream in) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        byte[] buf = new byte[8192];
        try {
            int size;
            while((size = in.read(buf)) != -1) {
                out.write(buf, 0, size);
            }
        }
        finally {
            out.close();
            in.close();
        }
        
        byte[] r = out.toByteArray();
		return Util.verifyNonNull(r);
    }
}
