package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativePermissionsAndroidSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativePermissionsAndroidSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void checkPermission(String paramString, Promise paramPromise);
  
  @ReactMethod
  public abstract void requestMultiplePermissions(ReadableArray paramReadableArray, Promise paramPromise);
  
  @ReactMethod
  public abstract void requestPermission(String paramString, Promise paramPromise);
  
  @ReactMethod
  public abstract void shouldShowRequestPermissionRationale(String paramString, Promise paramPromise);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativePermissionsAndroidSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */