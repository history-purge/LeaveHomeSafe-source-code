package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.m.a.a;
import e.e.n.a.a;

@a
public class WritableNativeMap extends ReadableNativeMap implements WritableMap {
  static {
    ReactBridge.staticInit();
  }
  
  public WritableNativeMap() {
    super(initHybrid());
  }
  
  private static native HybridData initHybrid();
  
  private native void mergeNativeMap(ReadableNativeMap paramReadableNativeMap);
  
  private native void putNativeArray(String paramString, WritableNativeArray paramWritableNativeArray);
  
  private native void putNativeMap(String paramString, WritableNativeMap paramWritableNativeMap);
  
  public WritableMap copy() {
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.merge(this);
    return writableNativeMap;
  }
  
  public void merge(ReadableMap paramReadableMap) {
    a.a(paramReadableMap instanceof ReadableNativeMap, "Illegal type provided");
    mergeNativeMap((ReadableNativeMap)paramReadableMap);
  }
  
  public void putArray(String paramString, ReadableArray paramReadableArray) {
    boolean bool;
    if (paramReadableArray == null || paramReadableArray instanceof WritableNativeArray) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool, "Illegal type provided");
    putNativeArray(paramString, (WritableNativeArray)paramReadableArray);
  }
  
  public native void putBoolean(String paramString, boolean paramBoolean);
  
  public native void putDouble(String paramString, double paramDouble);
  
  public native void putInt(String paramString, int paramInt);
  
  public void putMap(String paramString, ReadableMap paramReadableMap) {
    boolean bool;
    if (paramReadableMap == null || paramReadableMap instanceof WritableNativeMap) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool, "Illegal type provided");
    putNativeMap(paramString, (WritableNativeMap)paramReadableMap);
  }
  
  public native void putNull(String paramString);
  
  public native void putString(String paramString1, String paramString2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/WritableNativeMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */