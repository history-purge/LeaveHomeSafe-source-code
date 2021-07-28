package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeToastAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeToastAndroidSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public final Map<String, Object> getConstants() {
    return getTypedExportedConstants();
  }
  
  protected abstract Map<String, Object> getTypedExportedConstants();
  
  @ReactMethod
  public abstract void show(String paramString, double paramDouble);
  
  @ReactMethod
  public abstract void showWithGravity(String paramString, double paramDouble1, double paramDouble2);
  
  @ReactMethod
  public abstract void showWithGravityAndOffset(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeToastAndroidSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */