package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

@DoNotStrip
public class NativeRunnable implements Runnable {
  private final HybridData mHybridData;
  
  private NativeRunnable(HybridData paramHybridData) {
    this.mHybridData = paramHybridData;
  }
  
  public native void run();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/NativeRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */