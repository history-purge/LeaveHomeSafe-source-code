package com.facebook.fbreact.specs;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeWebSocketModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeWebSocketModuleSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void addListener(String paramString);
  
  @ReactMethod
  public abstract void close(double paramDouble1, String paramString, double paramDouble2);
  
  @ReactMethod
  public abstract void connect(String paramString, ReadableArray paramReadableArray, ReadableMap paramReadableMap, double paramDouble);
  
  @ReactMethod
  public abstract void ping(double paramDouble);
  
  @ReactMethod
  public abstract void removeListeners(double paramDouble);
  
  @ReactMethod
  public abstract void send(String paramString, double paramDouble);
  
  @ReactMethod
  public abstract void sendBinary(String paramString, double paramDouble);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeWebSocketModuleSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */