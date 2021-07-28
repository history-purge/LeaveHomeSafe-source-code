package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeStatusBarManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeStatusBarManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void addListener(String paramString);
  
  public final Map<String, Object> getConstants() {
    return getTypedExportedConstants();
  }
  
  @ReactMethod
  public abstract void getHeight(Callback paramCallback);
  
  protected abstract Map<String, Object> getTypedExportedConstants();
  
  @ReactMethod
  public abstract void removeListeners(double paramDouble);
  
  @ReactMethod
  public abstract void setColor(double paramDouble, boolean paramBoolean);
  
  @ReactMethod
  public abstract void setHidden(boolean paramBoolean, String paramString);
  
  @ReactMethod
  public abstract void setNetworkActivityIndicatorVisible(boolean paramBoolean);
  
  @ReactMethod
  public abstract void setStyle(String paramString, Boolean paramBoolean);
  
  @ReactMethod
  public abstract void setTranslucent(boolean paramBoolean);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeStatusBarManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */