package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeSegmentFetcherSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeSegmentFetcherSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void fetchSegment(double paramDouble, ReadableMap paramReadableMap, Callback paramCallback);
  
  @ReactMethod
  public void getSegment(double paramDouble, ReadableMap paramReadableMap, Callback paramCallback) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeSegmentFetcherSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */