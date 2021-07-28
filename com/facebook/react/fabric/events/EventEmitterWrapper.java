package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.fabric.b;
import e.e.n.a.a;

@SuppressLint({"MissingNativeLoadLibrary"})
public class EventEmitterWrapper {
  @a
  private final HybridData mHybridData = initHybrid();
  
  static {
    b.a();
  }
  
  private static native HybridData initHybrid();
  
  private native void invokeEvent(String paramString, NativeMap paramNativeMap);
  
  public void a(String paramString, WritableMap paramWritableMap) {
    WritableNativeMap writableNativeMap;
    NativeMap nativeMap;
    if (paramWritableMap == null) {
      writableNativeMap = new WritableNativeMap();
    } else {
      nativeMap = (NativeMap)writableNativeMap;
    } 
    invokeEvent(paramString, nativeMap);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/events/EventEmitterWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */