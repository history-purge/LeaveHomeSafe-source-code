package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
public class NativeRunnable implements Runnable {
  private final HybridData mHybridData;
  
  @a
  private NativeRunnable(HybridData paramHybridData) {
    this.mHybridData = paramHybridData;
  }
  
  public native void run();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/queue/NativeRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */