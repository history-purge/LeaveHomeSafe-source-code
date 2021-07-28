package io.invertase.firebase.messaging;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class n implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<ReactNativeFirebaseMessagingModule> arrayList = new ArrayList();
    arrayList.add(new ReactNativeFirebaseMessagingModule(paramReactApplicationContext));
    return (List)arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/messaging/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */