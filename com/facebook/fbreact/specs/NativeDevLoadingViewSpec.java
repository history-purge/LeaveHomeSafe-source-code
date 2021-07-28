package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeDevLoadingViewSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeDevLoadingViewSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void hide();
  
  @ReactMethod
  public abstract void showMessage(String paramString, Double paramDouble1, Double paramDouble2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeDevLoadingViewSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */