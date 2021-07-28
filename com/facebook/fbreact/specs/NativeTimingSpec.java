package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeTimingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeTimingSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void createTimer(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean);
  
  @ReactMethod
  public abstract void deleteTimer(double paramDouble);
  
  @ReactMethod
  public abstract void setSendIdleEvents(boolean paramBoolean);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeTimingSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */