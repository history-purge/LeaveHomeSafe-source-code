package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeStatusBarManagerAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeStatusBarManagerAndroidSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public final Map<String, Object> getConstants() {
    return getTypedExportedConstants();
  }
  
  protected abstract Map<String, Object> getTypedExportedConstants();
  
  @ReactMethod
  public abstract void setColor(double paramDouble, boolean paramBoolean);
  
  @ReactMethod
  public abstract void setHidden(boolean paramBoolean);
  
  @ReactMethod
  public abstract void setStyle(String paramString);
  
  @ReactMethod
  public abstract void setTranslucent(boolean paramBoolean);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeStatusBarManagerAndroidSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */