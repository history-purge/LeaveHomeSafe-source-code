package io.liteglue;

import android.app.Activity;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SQLitePluginPackage implements v {
  public SQLitePluginPackage() {}
  
  public SQLitePluginPackage(Activity paramActivity) {
    this();
  }
  
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }
  
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<SQLitePlugin> arrayList = new ArrayList();
    arrayList.add(new SQLitePlugin(paramReactApplicationContext));
    return (List)arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/liteglue/SQLitePluginPackage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */