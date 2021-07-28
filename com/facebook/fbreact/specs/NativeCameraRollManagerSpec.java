package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeCameraRollManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeCameraRollManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void deletePhotos(ReadableArray paramReadableArray, Promise paramPromise);
  
  @ReactMethod
  public abstract void getPhotos(ReadableMap paramReadableMap, Promise paramPromise);
  
  @ReactMethod
  public abstract void saveToCameraRoll(String paramString1, String paramString2, Promise paramPromise);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeCameraRollManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */