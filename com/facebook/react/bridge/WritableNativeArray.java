package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.m.a.a;
import e.e.n.a.a;

@a
public class WritableNativeArray extends ReadableNativeArray implements WritableArray {
  static {
    ReactBridge.staticInit();
  }
  
  public WritableNativeArray() {
    super(initHybrid());
  }
  
  private static native HybridData initHybrid();
  
  private native void pushNativeArray(WritableNativeArray paramWritableNativeArray);
  
  private native void pushNativeMap(WritableNativeMap paramWritableNativeMap);
  
  public void pushArray(ReadableArray paramReadableArray) {
    boolean bool;
    if (paramReadableArray == null || paramReadableArray instanceof WritableNativeArray) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool, "Illegal type provided");
    pushNativeArray((WritableNativeArray)paramReadableArray);
  }
  
  public native void pushBoolean(boolean paramBoolean);
  
  public native void pushDouble(double paramDouble);
  
  public native void pushInt(int paramInt);
  
  public void pushMap(ReadableMap paramReadableMap) {
    boolean bool;
    if (paramReadableMap == null || paramReadableMap instanceof WritableNativeMap) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool, "Illegal type provided");
    pushNativeMap((WritableNativeMap)paramReadableMap);
  }
  
  public native void pushNull();
  
  public native void pushString(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/WritableNativeArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */