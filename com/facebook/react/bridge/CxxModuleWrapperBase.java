package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
public class CxxModuleWrapperBase implements NativeModule {
  @a
  private HybridData mHybridData;
  
  static {
    ReactBridge.staticInit();
  }
  
  protected CxxModuleWrapperBase(HybridData paramHybridData) {
    this.mHybridData = paramHybridData;
  }
  
  public boolean canOverrideExistingModule() {
    return false;
  }
  
  public native String getName();
  
  public void initialize() {}
  
  public void onCatalystInstanceDestroy() {
    this.mHybridData.resetNative();
  }
  
  protected void resetModule(HybridData paramHybridData) {
    HybridData hybridData = this.mHybridData;
    if (paramHybridData != hybridData) {
      hybridData.resetNative();
      this.mHybridData = paramHybridData;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/CxxModuleWrapperBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */