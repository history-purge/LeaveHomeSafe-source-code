package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeLogBoxSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeLogBoxSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void hide();
  
  @ReactMethod
  public abstract void show();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeLogBoxSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */