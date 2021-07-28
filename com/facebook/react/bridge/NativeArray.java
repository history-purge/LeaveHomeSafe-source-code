package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
public abstract class NativeArray implements NativeArrayInterface {
  @a
  private HybridData mHybridData;
  
  static {
    ReactBridge.staticInit();
  }
  
  protected NativeArray(HybridData paramHybridData) {
    this.mHybridData = paramHybridData;
  }
  
  public native String toString();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/NativeArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */