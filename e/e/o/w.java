package e.e.o;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.Iterator;
import java.util.List;

public class w {
  public static Iterable<ModuleHolder> a(v paramv, ReactApplicationContext paramReactApplicationContext, r paramr) {
    List<NativeModule> list;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramv.getClass().getSimpleName());
    stringBuilder.append(" is not a LazyReactPackage, falling back to old version.");
    e.e.e.e.a.a("ReactNative", stringBuilder.toString());
    if (paramv instanceof t) {
      list = ((t)paramv).a(paramReactApplicationContext, paramr);
    } else {
      list = list.createNativeModules(paramReactApplicationContext);
    } 
    return new a(list);
  }
  
  static final class a implements Iterable<ModuleHolder> {
    a(List param1List) {}
    
    public Iterator<ModuleHolder> iterator() {
      return new a(this);
    }
    
    class a implements Iterator<ModuleHolder> {
      int c = 0;
      
      a(w.a this$0) {}
      
      public boolean hasNext() {
        return (this.c < this.d.c.size());
      }
      
      public ModuleHolder next() {
        List<NativeModule> list = this.d.c;
        int i = this.c;
        this.c = i + 1;
        return new ModuleHolder(list.get(i));
      }
      
      public void remove() {
        throw new UnsupportedOperationException("Cannot remove methods ");
      }
    }
  }
  
  class a implements Iterator<ModuleHolder> {
    int c = 0;
    
    a(w this$0) {}
    
    public boolean hasNext() {
      return (this.c < this.d.c.size());
    }
    
    public ModuleHolder next() {
      List<NativeModule> list = this.d.c;
      int i = this.c;
      this.c = i + 1;
      return new ModuleHolder(list.get(i));
    }
    
    public void remove() {
      throw new UnsupportedOperationException("Cannot remove methods ");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */