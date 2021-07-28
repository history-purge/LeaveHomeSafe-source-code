package e.e.o;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModuleRegistry;
import com.facebook.react.bridge.ReactApplicationContext;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class f {
  private final ReactApplicationContext a;
  
  private final r b;
  
  private final Map<String, ModuleHolder> c = new HashMap<String, ModuleHolder>();
  
  public f(ReactApplicationContext paramReactApplicationContext, r paramr) {
    this.a = paramReactApplicationContext;
    this.b = paramr;
  }
  
  public NativeModuleRegistry a() {
    return new NativeModuleRegistry(this.a, this.c);
  }
  
  public void a(v paramv) {
    Iterable<ModuleHolder> iterable;
    if (paramv instanceof d) {
      iterable = ((d)paramv).a(this.a);
    } else if (iterable instanceof z) {
      iterable = ((z)iterable).a(this.a);
    } else {
      iterable = w.a((v)iterable, this.a, this.b);
    } 
    Iterator<ModuleHolder> iterator = iterable.iterator();
    while (iterator.hasNext()) {
      ModuleHolder moduleHolder = iterator.next();
      String str = moduleHolder.getName();
      if (this.c.containsKey(str)) {
        ModuleHolder moduleHolder1 = this.c.get(str);
        if (moduleHolder.getCanOverrideExistingModule()) {
          this.c.remove(moduleHolder1);
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Native module ");
          stringBuilder.append(str);
          stringBuilder.append(" tried to override ");
          stringBuilder.append(moduleHolder1.getClassName());
          stringBuilder.append(". Check the getPackages() method in MainApplication.java, it might be that module is being created twice. If this was your intention, set canOverrideExistingModule=true. This error may also be present if the package is present only once in getPackages() but is also automatically added later during build time by autolinking. Try removing the existing entry and rebuild.");
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } 
      this.c.put(str, moduleHolder);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */