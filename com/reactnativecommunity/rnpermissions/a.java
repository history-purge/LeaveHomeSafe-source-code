package com.reactnativecommunity.rnpermissions;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.Collections;
import java.util.List;

public class a implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    return (List)Collections.singletonList(new RNPermissionsModule(paramReactApplicationContext));
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/rnpermissions/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */