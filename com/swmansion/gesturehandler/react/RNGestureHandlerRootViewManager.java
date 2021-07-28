package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.View;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;
import java.util.Map;

@a(name = "GestureHandlerRootView")
public class RNGestureHandlerRootViewManager extends ViewGroupManager<h> {
  public static final String REACT_CLASS = "GestureHandlerRootView";
  
  protected h createViewInstance(k0 paramk0) {
    return new h((Context)paramk0);
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    return f.a("onGestureHandlerEvent", f.a("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", f.a("registrationName", "onGestureHandlerStateChange"));
  }
  
  public String getName() {
    return "GestureHandlerRootView";
  }
  
  public void onDropViewInstance(h paramh) {
    paramh.e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/RNGestureHandlerRootViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */