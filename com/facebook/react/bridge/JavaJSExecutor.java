package com.facebook.react.bridge;

import e.e.n.a.a;

@a
public interface JavaJSExecutor {
  void close();
  
  @a
  String executeJSCall(String paramString1, String paramString2);
  
  @a
  void loadBundle(String paramString);
  
  @a
  void setGlobalVariable(String paramString1, String paramString2);
  
  public static interface Factory {
    JavaJSExecutor create();
  }
  
  public static class ProxyExecutorException extends Exception {
    public ProxyExecutorException(Throwable param1Throwable) {
      super(param1Throwable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JavaJSExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */