package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeJSDevSupportSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeJSDevSupportSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public final Map<String, Object> getConstants() {
    return getTypedExportedConstants();
  }
  
  protected abstract Map<String, Object> getTypedExportedConstants();
  
  @ReactMethod
  public abstract void onFailure(double paramDouble, String paramString);
  
  @ReactMethod
  public abstract void onSuccess(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeJSDevSupportSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */