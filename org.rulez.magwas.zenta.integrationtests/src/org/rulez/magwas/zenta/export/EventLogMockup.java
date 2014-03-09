package org.rulez.magwas.zenta.export;

import org.rulez.magwas.zenta.export.IEventLog;

public class EventLogMockup implements IEventLog {
    public int called = 0;
    
    @Override
    public void issueError(String arg0, String arg1) {
        called++;
        System.out.println("error:" + arg0 + "," + arg1);
        
    }
    
    @Override
    public void issueError(String arg0, Object arg1, String arg2, String arg3) {
        called++;
        System.out.println("error:" + arg0 + "," + arg1 + "," + arg2 + ","
                + arg3);
        
    }
    
    @Override
    public void issueInfo(String arg0, String arg1) {
        called++;
        System.out.println("info:" + arg0 + "," + arg1);
    }
    
    @Override
    public void issueInfo(String arg0, Object arg1, String arg2, String arg3) {
        called++;
        System.out.println("info:" + arg0 + "," + arg1 + "," + arg2 + ","
                + arg3);
        
    }
    
    @Override
    public void issueWarning(String arg0, String arg1) {
        called++;
        System.out.println("warning:" + arg0 + "," + arg1);
    }
    
    @Override
    public void issueWarning(String arg0, Object arg1, String arg2, String arg3) {
        called++;
        System.out.println("warning:" + arg0 + "," + arg1 + "," + arg2 + ","
                + arg3);
    }
    
    @Override
    public void printStackTrace(Exception arg0) {
        called++;
        arg0.printStackTrace();
    }
    
    @Override
    public void show() {
        called++;
        // do nothing
    }
    
}
