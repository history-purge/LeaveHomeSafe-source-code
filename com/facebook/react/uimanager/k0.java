package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;

public class k0 extends ReactContext {
  private final ReactApplicationContext a;
  
  public k0(ReactApplicationContext paramReactApplicationContext, Context paramContext, String paramString) {
    super(paramContext);
    if (paramReactApplicationContext.hasCatalystInstance())
      initializeWithInstance(paramReactApplicationContext.getCatalystInstance()); 
    this.a = paramReactApplicationContext;
  }
  
  public void addLifecycleEventListener(LifecycleEventListener paramLifecycleEventListener) {
    this.a.addLifecycleEventListener(paramLifecycleEventListener);
  }
  
  public Activity getCurrentActivity() {
    return this.a.getCurrentActivity();
  }
  
  public JSIModule getJSIModule(JSIModuleType paramJSIModuleType) {
    return isBridgeless() ? this.a.getJSIModule(paramJSIModuleType) : super.getJSIModule(paramJSIModuleType);
  }
  
  public boolean hasCurrentActivity() {
    return this.a.hasCurrentActivity();
  }
  
  public boolean isBridgeless() {
    return this.a.isBridgeless();
  }
  
  public void removeLifecycleEventListener(LifecycleEventListener paramLifecycleEventListener) {
    this.a.removeLifecycleEventListener(paramLifecycleEventListener);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */