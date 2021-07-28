package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.turbomodule.core.interfaces.a;
import java.util.Map;

public abstract class NativeUIManagerSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeUIManagerSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void blur(Double paramDouble);
  
  @ReactMethod
  public abstract void clearJSResponder();
  
  @ReactMethod
  public abstract void configureNextLayoutAnimation(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void createView(Double paramDouble, String paramString, double paramDouble1, ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void dismissPopupMenu();
  
  @ReactMethod
  public abstract void dispatchViewManagerCommand(Double paramDouble, double paramDouble1, ReadableArray paramReadableArray);
  
  @ReactMethod
  public abstract void findSubviewIn(Double paramDouble, ReadableArray paramReadableArray, Callback paramCallback);
  
  @ReactMethod
  public abstract void focus(Double paramDouble);
  
  public final Map<String, Object> getConstants() {
    return getTypedExportedConstants();
  }
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public abstract WritableMap getConstantsForViewManager(String paramString);
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public abstract WritableArray getDefaultEventTypes();
  
  protected abstract Map<String, Object> getTypedExportedConstants();
  
  @ReactMethod(isBlockingSynchronousMethod = true)
  public abstract WritableMap lazilyLoadView(String paramString);
  
  @ReactMethod
  public abstract void manageChildren(Double paramDouble, ReadableArray paramReadableArray1, ReadableArray paramReadableArray2, ReadableArray paramReadableArray3, ReadableArray paramReadableArray4, ReadableArray paramReadableArray5);
  
  @ReactMethod
  public abstract void measure(Double paramDouble, Callback paramCallback);
  
  @ReactMethod
  public abstract void measureInWindow(Double paramDouble, Callback paramCallback);
  
  @ReactMethod
  public abstract void measureLayout(Double paramDouble1, Double paramDouble2, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void measureLayoutRelativeToParent(Double paramDouble, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void playTouchSound();
  
  @ReactMethod
  public abstract void removeSubviewsFromContainerWithID(double paramDouble);
  
  @ReactMethod
  public abstract void replaceExistingNonRootView(Double paramDouble1, Double paramDouble2);
  
  @ReactMethod
  public abstract void sendAccessibilityEvent(Double paramDouble, double paramDouble1);
  
  @ReactMethod
  public abstract void setChildren(Double paramDouble, ReadableArray paramReadableArray);
  
  @ReactMethod
  public abstract void setJSResponder(Double paramDouble, boolean paramBoolean);
  
  @ReactMethod
  public abstract void setLayoutAnimationEnabledExperimental(boolean paramBoolean);
  
  @ReactMethod
  public abstract void showPopupMenu(Double paramDouble, ReadableArray paramReadableArray, Callback paramCallback1, Callback paramCallback2);
  
  @ReactMethod
  public abstract void updateView(double paramDouble, String paramString, ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void viewIsDescendantOf(Double paramDouble1, Double paramDouble2, Callback paramCallback);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeUIManagerSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */