package e.e.o;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.b0.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;

public abstract class z implements v {
  public abstract NativeModule a(String paramString, ReactApplicationContext paramReactApplicationContext);
  
  public Iterable<ModuleHolder> a(ReactApplicationContext paramReactApplicationContext) {
    return new a(this, c().a().entrySet().iterator(), paramReactApplicationContext);
  }
  
  protected List<ModuleSpec> b(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
  
  public abstract com.facebook.react.module.model.a c();
  
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    throw new UnsupportedOperationException("In case of TurboModules, createNativeModules is not supported. NativeModuleRegistry should instead use getModuleList or getModule method");
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    List<ModuleSpec> list = b(paramReactApplicationContext);
    if (list == null || list.isEmpty())
      return Collections.emptyList(); 
    ArrayList<ViewManager> arrayList = new ArrayList();
    Iterator<ModuleSpec> iterator = list.iterator();
    while (iterator.hasNext())
      arrayList.add((ViewManager)((ModuleSpec)iterator.next()).getProvider().get()); 
    return arrayList;
  }
  
  class a implements Iterable<ModuleHolder> {
    a(z this$0, Iterator param1Iterator, ReactApplicationContext param1ReactApplicationContext) {}
    
    public Iterator<ModuleHolder> iterator() {
      return new a(this);
    }
    
    class a implements Iterator<ModuleHolder> {
      Map.Entry<String, ReactModuleInfo> c = null;
      
      a(z.a this$0) {}
      
      private void a() {
        while (this.d.c.hasNext()) {
          Map.Entry<String, ReactModuleInfo> entry = this.d.c.next();
          ReactModuleInfo reactModuleInfo = (ReactModuleInfo)entry.getValue();
          if (a.a && reactModuleInfo.e())
            continue; 
          this.c = entry;
          return;
        } 
        this.c = null;
      }
      
      public boolean hasNext() {
        if (this.c == null)
          a(); 
        return (this.c != null);
      }
      
      public ModuleHolder next() {
        if (this.c == null)
          a(); 
        Map.Entry<String, ReactModuleInfo> entry = this.c;
        if (entry != null) {
          a();
          String str = entry.getKey();
          ReactModuleInfo reactModuleInfo = entry.getValue();
          z.a a1 = this.d;
          return new ModuleHolder(reactModuleInfo, new z.b(a1.e, str, a1.d));
        } 
        throw new NoSuchElementException("ModuleHolder not found");
      }
      
      public void remove() {
        throw new UnsupportedOperationException("Cannot remove native modules from the list");
      }
    }
  }
  
  class a implements Iterator<ModuleHolder> {
    Map.Entry<String, ReactModuleInfo> c = null;
    
    a(z this$0) {}
    
    private void a() {
      while (this.d.c.hasNext()) {
        Map.Entry<String, ReactModuleInfo> entry = this.d.c.next();
        ReactModuleInfo reactModuleInfo = (ReactModuleInfo)entry.getValue();
        if (a.a && reactModuleInfo.e())
          continue; 
        this.c = entry;
        return;
      } 
      this.c = null;
    }
    
    public boolean hasNext() {
      if (this.c == null)
        a(); 
      return (this.c != null);
    }
    
    public ModuleHolder next() {
      if (this.c == null)
        a(); 
      Map.Entry<String, ReactModuleInfo> entry = this.c;
      if (entry != null) {
        a();
        String str = entry.getKey();
        ReactModuleInfo reactModuleInfo = entry.getValue();
        z.a a1 = this.d;
        return new ModuleHolder(reactModuleInfo, new z.b(a1.e, str, a1.d));
      } 
      throw new NoSuchElementException("ModuleHolder not found");
    }
    
    public void remove() {
      throw new UnsupportedOperationException("Cannot remove native modules from the list");
    }
  }
  
  private class b implements Provider<NativeModule> {
    private final String a;
    
    private final ReactApplicationContext b;
    
    public b(z this$0, String param1String, ReactApplicationContext param1ReactApplicationContext) {
      this.a = param1String;
      this.b = param1ReactApplicationContext;
    }
    
    public NativeModule get() {
      return this.c.a(this.a, this.b);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */