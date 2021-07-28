package com.facebook.react.bridge;

public interface JSIModuleSpec<T extends JSIModule> {
  JSIModuleProvider<T> getJSIModuleProvider();
  
  JSIModuleType getJSIModuleType();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JSIModuleSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */