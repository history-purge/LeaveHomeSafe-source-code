package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeI18nManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeI18nManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void allowRTL(boolean paramBoolean);
  
  @ReactMethod
  public abstract void forceRTL(boolean paramBoolean);
  
  public final Map<String, Object> getConstants() {
    return getTypedExportedConstants();
  }
  
  protected abstract Map<String, Object> getTypedExportedConstants();
  
  @ReactMethod
  public abstract void swapLeftAndRightInRTL(boolean paramBoolean);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeI18nManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */