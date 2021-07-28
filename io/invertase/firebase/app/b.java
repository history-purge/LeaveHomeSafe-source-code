package io.invertase.firebase.app;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import io.invertase.firebase.utils.ReactNativeFirebaseUtilsModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class b implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    if (a.a() == null)
      a.a(paramReactApplicationContext.getApplicationContext()); 
    ArrayList<ReactNativeFirebaseAppModule> arrayList = new ArrayList();
    arrayList.add(new ReactNativeFirebaseAppModule(paramReactApplicationContext));
    arrayList.add(new ReactNativeFirebaseUtilsModule(paramReactApplicationContext));
    return (List)arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/app/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */