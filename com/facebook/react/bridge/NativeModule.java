package com.facebook.react.bridge;

import e.e.n.a.a;

@a
public interface NativeModule {
  boolean canOverrideExistingModule();
  
  String getName();
  
  void initialize();
  
  void onCatalystInstanceDestroy();
  
  public static interface NativeMethod {
    String getType();
    
    void invoke(JSInstance param1JSInstance, ReadableArray param1ReadableArray);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/NativeModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */