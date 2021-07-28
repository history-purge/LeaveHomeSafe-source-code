package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeAccessibilityManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeAccessibilityManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void announceForAccessibility(String paramString);
  
  @ReactMethod
  public abstract void getCurrentBoldTextState(Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void getCurrentGrayscaleState(Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void getCurrentInvertColorsState(Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void getCurrentReduceMotionState(Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void getCurrentReduceTransparencyState(Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void getCurrentVoiceOverState(Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void setAccessibilityContentSizeMultipliers(ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void setAccessibilityFocus(double paramDouble);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeAccessibilityManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */