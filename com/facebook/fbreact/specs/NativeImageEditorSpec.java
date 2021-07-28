package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeImageEditorSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeImageEditorSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void cropImage(String paramString, ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeImageEditorSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */