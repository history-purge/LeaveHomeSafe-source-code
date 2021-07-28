package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeExceptionsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeExceptionsManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public void dismissRedbox() {}
  
  @ReactMethod
  public void reportException(ReadableMap paramReadableMap) {}
  
  @ReactMethod
  public abstract void reportFatalException(String paramString, ReadableArray paramReadableArray, double paramDouble);
  
  @ReactMethod
  public abstract void reportSoftException(String paramString, ReadableArray paramReadableArray, double paramDouble);
  
  @ReactMethod
  public abstract void updateExceptionMessage(String paramString, ReadableArray paramReadableArray, double paramDouble);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeExceptionsManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */