package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeAsyncStorageSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeAsyncStorageSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void clear(Callback paramCallback);
  
  @ReactMethod
  public abstract void getAllKeys(Callback paramCallback);
  
  @ReactMethod
  public abstract void multiGet(ReadableArray paramReadableArray, Callback paramCallback);
  
  @ReactMethod
  public abstract void multiMerge(ReadableArray paramReadableArray, Callback paramCallback);
  
  @ReactMethod
  public abstract void multiRemove(ReadableArray paramReadableArray, Callback paramCallback);
  
  @ReactMethod
  public abstract void multiSet(ReadableArray paramReadableArray, Callback paramCallback);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeAsyncStorageSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */