package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativeHeadlessJsTaskSupportSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativeHeadlessJsTaskSupportSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void notifyTaskFinished(double paramDouble);
  
  @ReactMethod
  public abstract void notifyTaskRetry(double paramDouble, Promise paramPromise);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativeHeadlessJsTaskSupportSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */