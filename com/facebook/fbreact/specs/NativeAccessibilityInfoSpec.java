package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeAccessibilityInfoSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeAccessibilityInfoSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void announceForAccessibility(String paramString);
  
  @ReactMethod
  public abstract void isReduceMotionEnabled(Callback paramCallback);
  
  @ReactMethod
  public abstract void isTouchExplorationEnabled(Callback paramCallback);
  
  @ReactMethod
  public abstract void setAccessibilityFocus(double paramDouble);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeAccessibilityInfoSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */