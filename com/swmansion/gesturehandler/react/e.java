package com.swmansion.gesturehandler.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.Arrays;
import java.util.List;

public class e implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new NativeModule[] { (NativeModule)new RNGestureHandlerModule(paramReactApplicationContext) });
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new ViewManager[] { (ViewManager)new RNGestureHandlerRootViewManager(), (ViewManager)new RNGestureHandlerButtonViewManager() });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */