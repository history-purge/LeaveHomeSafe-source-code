package org.devio.rn.splashscreen;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class d implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<SplashScreenModule> arrayList = new ArrayList();
    arrayList.add(new SplashScreenModule(paramReactApplicationContext));
    return (List)arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/devio/rn/splashscreen/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */