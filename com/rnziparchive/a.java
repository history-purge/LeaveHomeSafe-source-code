package com.rnziparchive;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class a implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<RNZipArchiveModule> arrayList = new ArrayList();
    arrayList.add(new RNZipArchiveModule(paramReactApplicationContext));
    return (List)arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new ViewManager[0]);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/rnziparchive/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */