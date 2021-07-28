package com.swmansion.reanimated;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.Arrays;
import java.util.List;

public class c implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new NativeModule[] { (NativeModule)new ReanimatedModule(paramReactApplicationContext) });
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new ViewManager[0]);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */