package net.time4j.e1;

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class p {
  private static final p a = new c(k.c, true, null);
  
  private static final p b = new c(k.c, false, null);
  
  private static final p c = new c(k.d, true, null);
  
  private static final p d = new c(k.d, false, null);
  
  private static final Map<String, p> e = new ConcurrentHashMap<String, p>();
  
  private static final Map<String, p> f = new ConcurrentHashMap<String, p>();
  
  private static String a(Locale paramLocale) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramLocale.getLanguage());
    stringBuilder.append('_');
    stringBuilder.append(paramLocale.getCountry());
    return stringBuilder.toString();
  }
  
  private static Map<String, p> a(k paramk) {
    int i = a.a[paramk.ordinal()];
    if (i != 1) {
      if (i == 2)
        return f; 
      throw new UnsupportedOperationException(paramk.name());
    } 
    return e;
  }
  
  public static p a(Locale paramLocale, k paramk) {
    Map<String, p> map = a(paramk);
    boolean bool = map.isEmpty();
    p p1 = null;
    p p2 = null;
    if (!bool) {
      if (!paramLocale.getCountry().equals(""))
        p2 = map.get(a(paramLocale)); 
      p1 = p2;
      if (p2 == null)
        p1 = map.get(paramLocale.getLanguage()); 
    } 
    p2 = p1;
    if (p1 == null)
      p2 = d.a().a(paramLocale, paramk); 
    return p2;
  }
  
  private static class b implements o {
    private b() {}
    
    public p a(Locale param1Locale, k param1k) {
      boolean bool = param1Locale.getLanguage().equals("en");
      int i = p.a.a[param1k.ordinal()];
      if (i != 1) {
        if (i == 2)
          return bool ? p.c() : p.d(); 
        throw new UnsupportedOperationException(param1k.name());
      } 
      return bool ? p.a() : p.b();
    }
  }
  
  private static class c extends p {
    private c(k param1k, boolean param1Boolean) {}
  }
  
  private static class d {
    private static final o a;
    
    static {
      p.b b;
      Iterator<o> iterator1 = net.time4j.c1.d.c().a(o.class).iterator();
      if (iterator1.hasNext()) {
        o o1 = iterator1.next();
      } else {
        iterator1 = null;
      } 
      Iterator<o> iterator2 = iterator1;
      if (iterator1 == null)
        b = new p.b(null); 
      a = b;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */