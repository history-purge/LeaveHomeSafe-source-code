package com.rnfs;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<RNFSManager> arrayList = new ArrayList();
    arrayList.add(new RNFSManager(paramReactApplicationContext));
    return (List)arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new ViewManager[0]);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnfs/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */