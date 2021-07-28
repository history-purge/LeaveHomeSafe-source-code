package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeBugReportingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeBugReportingSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void setCategoryID(String paramString);
  
  @ReactMethod
  public abstract void setExtraData(ReadableMap paramReadableMap1, ReadableMap paramReadableMap2);
  
  @ReactMethod
  public abstract void startReportAProblemFlow();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeBugReportingSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */