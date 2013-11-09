package org.rulez.magwas.zenta.export;


public interface IEventLog {
    public void show();
    
    public void issueInfo(String text, String detail);
    
    public void issueWarning(String text, String detail);
    
    public void issueError(String text, String detail);
    
    public void issueInfo(String modelid, Object node, String text,
            String detail);
    
    public void issueWarning(String modelid, Object node, String text,
            String detail);
    
    public void issueError(String modelid, Object node, String text,
            String detail);
    
    public void printStackTrace(Exception e);
    
}