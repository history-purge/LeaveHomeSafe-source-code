package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeFrameRateLoggerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeFrameRateLoggerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void beginScroll();
  
  @ReactMethod
  public abstract void endScroll();
  
  @ReactMethod
  public abstract void setContext(String paramString);
  
  @ReactMethod
  public abstract void setGlobalOptions(ReadableMap paramReadableMap);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeFrameRateLoggerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */