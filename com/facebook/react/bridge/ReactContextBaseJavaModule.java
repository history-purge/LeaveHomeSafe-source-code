package com.facebook.react.bridge;

import android.app.Activity;
import e.e.m.a.a;

public abstract class ReactContextBaseJavaModule extends BaseJavaModule {
  private final ReactApplicationContext mReactApplicationContext = null;
  
  public ReactContextBaseJavaModule() {}
  
  public ReactContextBaseJavaModule(ReactApplicationContext paramReactApplicationContext) {}
  
  protected final Activity getCurrentActivity() {
    return this.mReactApplicationContext.getCurrentActivity();
  }
  
  protected final ReactApplicationContext getReactApplicationContext() {
    ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
    a.a(reactApplicationContext, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
    return reactApplicationContext;
  }
  
  protected final ReactApplicationContext getReactApplicationContextIfActiveOrWarn() {
    if (this.mReactApplicationContext.hasActiveCatalystInstance() || this.mReactApplicationContext.isBridgeless())
      return this.mReactApplicationContext; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Catalyst Instance has already disappeared: requested by ");
    stringBuilder.append(getName());
    ReactSoftException.logSoftException("ReactContextBaseJavaModule", new RuntimeException(stringBuilder.toString()));
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReactContextBaseJavaModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */