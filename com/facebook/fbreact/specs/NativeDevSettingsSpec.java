package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeDevSettingsSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeDevSettingsSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void addListener(String paramString);
  
  @ReactMethod
  public abstract void addMenuItem(String paramString);
  
  @ReactMethod
  public void onFastRefresh() {}
  
  @ReactMethod
  public abstract void reload();
  
  @ReactMethod
  public void reloadWithReason(String paramString) {}
  
  @ReactMethod
  public abstract void removeListeners(double paramDouble);
  
  @ReactMethod
  public abstract void setHotLoadingEnabled(boolean paramBoolean);
  
  @ReactMethod
  public abstract void setIsDebuggingRemotely(boolean paramBoolean);
  
  @ReactMethod
  public abstract void setIsShakeToShowDevMenuEnabled(boolean paramBoolean);
  
  @ReactMethod
  public abstract void setProfilingEnabled(boolean paramBoolean);
  
  @ReactMethod
  public abstract void toggleElementInspector();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeDevSettingsSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */