package com.facebook.react.bridge;

public interface JavaScriptExecutorFactory {
  JavaScriptExecutor create();
  
  void startSamplingProfiler();
  
  void stopSamplingProfiler(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JavaScriptExecutorFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */