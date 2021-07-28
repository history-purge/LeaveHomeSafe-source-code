package com.facebook.react.uimanager;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.JSIModule;
import com.facebook.react.bridge.JSIModuleType;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.f1.a;

public class q0 {
  public static ReactContext a(View paramView) {
    Context context2 = paramView.getContext();
    Context context1 = context2;
    if (!(context2 instanceof ReactContext)) {
      context1 = context2;
      if (context2 instanceof ContextWrapper)
        context1 = ((ContextWrapper)context2).getBaseContext(); 
    } 
    return (ReactContext)context1;
  }
  
  private static UIManager a(ReactContext paramReactContext, int paramInt, boolean paramBoolean) {
    JSIModule jSIModule;
    NativeModule nativeModule;
    if (paramReactContext.isBridgeless())
      return (UIManager)paramReactContext.getJSIModule(JSIModuleType.UIManager); 
    if (!paramReactContext.hasCatalystInstance()) {
      ReactSoftException.logSoftException("UIManagerHelper", (Throwable)new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain a CatalystInstance."));
      return null;
    } 
    if (!paramReactContext.hasActiveCatalystInstance()) {
      ReactSoftException.logSoftException("UIManagerHelper", (Throwable)new ReactNoCrashSoftException("Cannot get UIManager because the context doesn't contain an active CatalystInstance."));
      if (paramBoolean)
        return null; 
    } 
    CatalystInstance catalystInstance = paramReactContext.getCatalystInstance();
    if (paramInt == 2) {
      jSIModule = catalystInstance.getJSIModule(JSIModuleType.UIManager);
    } else {
      nativeModule = jSIModule.getNativeModule(UIManagerModule.class);
    } 
    return (UIManager)nativeModule;
  }
  
  public static d a(ReactContext paramReactContext, int paramInt) {
    UIManager uIManager = a(paramReactContext, paramInt, false);
    return (uIManager == null) ? null : (d)uIManager.getEventDispatcher();
  }
  
  public static d b(ReactContext paramReactContext, int paramInt) {
    return a(paramReactContext, a.a(paramInt));
  }
  
  public static UIManager c(ReactContext paramReactContext, int paramInt) {
    return a(paramReactContext, paramInt, true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */