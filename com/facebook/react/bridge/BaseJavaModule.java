package com.facebook.react.bridge;

import java.util.Map;

public abstract class BaseJavaModule implements NativeModule {
  public static final String METHOD_TYPE_ASYNC = "async";
  
  public static final String METHOD_TYPE_PROMISE = "promise";
  
  public static final String METHOD_TYPE_SYNC = "sync";
  
  public boolean canOverrideExistingModule() {
    return false;
  }
  
  public Map<String, Object> getConstants() {
    return null;
  }
  
  public boolean hasConstants() {
    return false;
  }
  
  public void initialize() {}
  
  public void invalidate() {}
  
  public void onCatalystInstanceDestroy() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/BaseJavaModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */