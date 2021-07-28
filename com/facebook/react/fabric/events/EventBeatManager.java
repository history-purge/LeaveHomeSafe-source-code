package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.fabric.b;
import com.facebook.react.uimanager.events.a;
import e.e.n.a.a;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventBeatManager implements a {
  @a
  private final HybridData mHybridData;
  
  static {
    b.a();
  }
  
  private static native HybridData initHybrid();
  
  private native void tick();
  
  public void a() {
    tick();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/events/EventBeatManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */