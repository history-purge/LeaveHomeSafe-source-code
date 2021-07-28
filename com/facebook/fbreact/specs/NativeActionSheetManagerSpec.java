package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeActionSheetManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeActionSheetManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void showActionSheetWithOptions(ReadableMap paramReadableMap, Callback paramCallback);
  
  @ReactMethod
  public abstract void showShareActionSheetWithOptions(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeActionSheetManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */