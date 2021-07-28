package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeSettingsManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeSettingsManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void deleteValues(ReadableArray paramReadableArray);
  
  public final Map<String, Object> getConstants() {
    return getTypedExportedConstants();
  }
  
  protected abstract Map<String, Object> getTypedExportedConstants();
  
  @ReactMethod
  public abstract void setValues(ReadableMap paramReadableMap);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeSettingsManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */