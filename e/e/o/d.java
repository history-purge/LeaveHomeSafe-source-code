package e.e.o;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.systrace.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class d implements v {
  public abstract com.facebook.react.module.model.a a();
  
  public Iterable<ModuleHolder> a(ReactApplicationContext paramReactApplicationContext) {
    Map map = a().a();
    return new a(this, b(paramReactApplicationContext), map);
  }
  
  protected abstract List<ModuleSpec> b(ReactApplicationContext paramReactApplicationContext);
  
  public List<ModuleSpec> c(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
  
  public final List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    ArrayList<NativeModule> arrayList = new ArrayList();
    for (ModuleSpec moduleSpec : b(paramReactApplicationContext)) {
      b.b b = b.a(0L, "createNativeModule");
      b.a("module", moduleSpec.getType());
      b.a();
      ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, moduleSpec.getName());
      try {
        NativeModule nativeModule = (NativeModule)moduleSpec.getProvider().get();
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
      } finally {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
        b.a(0L).a();
      } 
    } 
    return arrayList;
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    List<ModuleSpec> list = c(paramReactApplicationContext);
    if (list == null || list.isEmpty())
      return Collections.emptyList(); 
    ArrayList<ViewManager> arrayList = new ArrayList();
    Iterator<ModuleSpec> iterator = list.iterator();
    while (iterator.hasNext())
      arrayList.add((ViewManager)((ModuleSpec)iterator.next()).getProvider().get()); 
    return arrayList;
  }
  
  class a implements Iterable<ModuleHolder> {
    a(d this$0, List param1List, Map param1Map) {}
    
    public Iterator<ModuleHolder> iterator() {
      return new a(this);
    }
    
    class a implements Iterator<ModuleHolder> {
      int c = 0;
      
      a(d.a this$0) {}
      
      public boolean hasNext() {
        return (this.c < this.d.c.size());
      }
      
      public ModuleHolder next() {
        List<ModuleSpec> list = this.d.c;
        int i = this.c;
        this.c = i + 1;
        ModuleSpec moduleSpec = list.get(i);
        String str = moduleSpec.getName();
        ReactModuleInfo reactModuleInfo = (ReactModuleInfo)this.d.d.get(str);
        if (reactModuleInfo == null) {
          ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, str);
          try {
            NativeModule nativeModule = (NativeModule)moduleSpec.getProvider().get();
            return new ModuleHolder(nativeModule);
          } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
          } 
        } 
        return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
      }
      
      public void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
      }
    }
  }
  
  class a implements Iterator<ModuleHolder> {
    int c = 0;
    
    a(d this$0) {}
    
    public boolean hasNext() {
      return (this.c < this.d.c.size());
    }
    
    public ModuleHolder next() {
      List<ModuleSpec> list = this.d.c;
      int i = this.c;
      this.c = i + 1;
      ModuleSpec moduleSpec = list.get(i);
      String str = moduleSpec.getName();
      ReactModuleInfo reactModuleInfo = (ReactModuleInfo)this.d.d.get(str);
      if (reactModuleInfo == null) {
        ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_START, str);
        try {
          NativeModule nativeModule = (NativeModule)moduleSpec.getProvider().get();
          return new ModuleHolder(nativeModule);
        } finally {
          ReactMarker.logMarker(ReactMarkerConstants.CREATE_MODULE_END);
        } 
      } 
      return new ModuleHolder(reactModuleInfo, moduleSpec.getProvider());
    }
    
    public void remove() {
      throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */