package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeClipboardSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeClipboardSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void getString(Promise paramPromise);
  
  @ReactMethod
  public abstract void setString(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeClipboardSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */