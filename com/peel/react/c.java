package com.peel.react;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class c implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<TcpSockets> arrayList = new ArrayList();
    arrayList.add(new TcpSockets(paramReactApplicationContext));
    return (List)arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/peel/react/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */