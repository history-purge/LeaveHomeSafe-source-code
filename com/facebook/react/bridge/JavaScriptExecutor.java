package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
public abstract class JavaScriptExecutor {
  private final HybridData mHybridData;
  
  protected JavaScriptExecutor(HybridData paramHybridData) {
    this.mHybridData = paramHybridData;
  }
  
  public void close() {
    this.mHybridData.resetNative();
  }
  
  public abstract String getName();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JavaScriptExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */