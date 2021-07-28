package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeHeapCaptureSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeHeapCaptureSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void captureComplete(String paramString1, String paramString2);
  
  @ReactMethod
  public abstract void captureHeap(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeHeapCaptureSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */