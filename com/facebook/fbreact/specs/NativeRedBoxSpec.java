package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeRedBoxSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeRedBoxSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void dismiss();
  
  @ReactMethod
  public abstract void setExtraData(ReadableMap paramReadableMap, String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeRedBoxSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */