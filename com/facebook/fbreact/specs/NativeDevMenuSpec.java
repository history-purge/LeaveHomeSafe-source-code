package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeDevMenuSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeDevMenuSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void debugRemotely(boolean paramBoolean);
  
  @ReactMethod
  public abstract void reload();
  
  @ReactMethod
  public abstract void setHotLoadingEnabled(boolean paramBoolean);
  
  @ReactMethod
  public abstract void setProfilingEnabled(boolean paramBoolean);
  
  @ReactMethod
  public abstract void show();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeDevMenuSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */