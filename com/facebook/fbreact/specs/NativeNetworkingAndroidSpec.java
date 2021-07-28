package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeNetworkingAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeNetworkingAndroidSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void abortRequest(double paramDouble);
  
  @ReactMethod
  public abstract void addListener(String paramString);
  
  @ReactMethod
  public abstract void clearCookies(Callback paramCallback);
  
  @ReactMethod
  public abstract void removeListeners(double paramDouble);
  
  @ReactMethod
  public abstract void sendRequest(String paramString1, String paramString2, double paramDouble1, ReadableArray paramReadableArray, ReadableMap paramReadableMap, String paramString3, boolean paramBoolean1, double paramDouble2, boolean paramBoolean2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeNetworkingAndroidSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */