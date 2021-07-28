package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeAnimatedModuleSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeAnimatedModuleSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void addAnimatedEventToView(double paramDouble, String paramString, ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void addListener(String paramString);
  
  @ReactMethod
  public abstract void connectAnimatedNodeToView(double paramDouble1, double paramDouble2);
  
  @ReactMethod
  public abstract void connectAnimatedNodes(double paramDouble1, double paramDouble2);
  
  @ReactMethod
  public abstract void createAnimatedNode(double paramDouble, ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void disconnectAnimatedNodeFromView(double paramDouble1, double paramDouble2);
  
  @ReactMethod
  public abstract void disconnectAnimatedNodes(double paramDouble1, double paramDouble2);
  
  @ReactMethod
  public abstract void dropAnimatedNode(double paramDouble);
  
  @ReactMethod
  public abstract void extractAnimatedNodeOffset(double paramDouble);
  
  @ReactMethod
  public abstract void flattenAnimatedNodeOffset(double paramDouble);
  
  @ReactMethod
  public abstract void removeAnimatedEventFromView(double paramDouble1, String paramString, double paramDouble2);
  
  @ReactMethod
  public abstract void removeListeners(double paramDouble);
  
  @ReactMethod
  public abstract void restoreDefaultValues(double paramDouble);
  
  @ReactMethod
  public abstract void setAnimatedNodeOffset(double paramDouble1, double paramDouble2);
  
  @ReactMethod
  public abstract void setAnimatedNodeValue(double paramDouble1, double paramDouble2);
  
  @ReactMethod
  public abstract void startAnimatingNode(double paramDouble1, double paramDouble2, ReadableMap paramReadableMap, Callback paramCallback);
  
  @ReactMethod
  public abstract void startListeningToAnimatedNodeValue(double paramDouble);
  
  @ReactMethod
  public abstract void stopAnimation(double paramDouble);
  
  @ReactMethod
  public abstract void stopListeningToAnimatedNodeValue(double paramDouble);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeAnimatedModuleSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */