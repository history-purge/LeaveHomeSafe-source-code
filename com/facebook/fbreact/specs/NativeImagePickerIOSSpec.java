package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeImagePickerIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeImagePickerIOSSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void canRecordVideos(Callback paramCallback);
  
  @ReactMethod
  public abstract void canUseCamera(Callback paramCallback);
  
  @ReactMethod
  public abstract void clearAllPendingVideos();
  
  @ReactMethod
  public abstract void openCameraDialog(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void openSelectDialog(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void removePendingVideo(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeImagePickerIOSSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */