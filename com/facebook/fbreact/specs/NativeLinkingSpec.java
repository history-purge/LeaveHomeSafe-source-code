package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeLinkingSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeLinkingSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void addListener(String paramString);
  
  @ReactMethod
  public abstract void canOpenURL(String paramString, Promise paramPromise);
  
  @ReactMethod
  public abstract void getInitialURL(Promise paramPromise);
  
  @ReactMethod
  public abstract void openSettings(Promise paramPromise);
  
  @ReactMethod
  public abstract void openURL(String paramString, Promise paramPromise);
  
  @ReactMethod
  public abstract void removeListeners(double paramDouble);
  
  @ReactMethod
  public abstract void sendIntent(String paramString, ReadableArray paramReadableArray, Promise paramPromise);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeLinkingSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */