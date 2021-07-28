package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeImageStoreSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeImageStoreSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void addImageFromBase64(String paramString, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void getBase64ForTag(String paramString, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void hasImageForTag(String paramString, Callback paramCallback);
  
  @ReactMethod
  public abstract void removeImageForTag(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeImageStoreSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */