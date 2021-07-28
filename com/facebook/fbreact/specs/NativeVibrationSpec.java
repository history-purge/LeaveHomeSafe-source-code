package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeVibrationSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeVibrationSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void cancel();
  
  @ReactMethod
  public abstract void vibrate(double paramDouble);
  
  @ReactMethod
  public abstract void vibrateByPattern(ReadableArray paramReadableArray, double paramDouble);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeVibrationSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */