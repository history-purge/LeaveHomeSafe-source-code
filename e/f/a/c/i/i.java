package e.f.a.c.i;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class i {
  public static a i() {
    b.b b = new b.b();
    b.a(new HashMap<String, String>());
    return b;
  }
  
  public final String a(String paramString) {
    String str = a().get(paramString);
    paramString = str;
    if (str == null)
      paramString = ""; 
    return paramString;
  }
  
  protected abstract Map<String, String> a();
  
  public final int b(String paramString) {
    paramString = a().get(paramString);
    return (paramString == null) ? 0 : Integer.valueOf(paramString).intValue();
  }
  
  public abstract Integer b();
  
  public final long c(String paramString) {
    paramString = a().get(paramString);
    return (paramString == null) ? 0L : Long.valueOf(paramString).longValue();
  }
  
  public abstract h c();
  
  public abstract long d();
  
  public final Map<String, String> e() {
    return Collections.unmodifiableMap(a());
  }
  
  public abstract String f();
  
  public abstract long g();
  
  public a h() {
    b.b b = new b.b();
    b.a(f());
    b.a(b());
    b.a(c());
    b.a(d());
    b.b(g());
    b.a(new HashMap<String, String>(a()));
    return b;
  }
  
  public static abstract class a {
    public abstract a a(long param1Long);
    
    public abstract a a(h param1h);
    
    public abstract a a(Integer param1Integer);
    
    public abstract a a(String param1String);
    
    public final a a(String param1String, int param1Int) {
      b().put(param1String, String.valueOf(param1Int));
      return this;
    }
    
    public final a a(String param1String, long param1Long) {
      b().put(param1String, String.valueOf(param1Long));
      return this;
    }
    
    public final a a(String param1String1, String param1String2) {
      b().put(param1String1, param1String2);
      return this;
    }
    
    protected abstract a a(Map<String, String> param1Map);
    
    public abstract i a();
    
    public abstract a b(long param1Long);
    
    protected abstract Map<String, String> b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */