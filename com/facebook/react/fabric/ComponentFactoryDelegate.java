package com.facebook.react.fabric;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
public class ComponentFactoryDelegate {
  @a
  private final HybridData mHybridData = initHybrid();
  
  static {
    b.a();
  }
  
  @a
  private static native HybridData initHybrid();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/ComponentFactoryDelegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */