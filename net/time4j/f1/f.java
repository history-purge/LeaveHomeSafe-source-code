package net.time4j.f1;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.e1.i;
import net.time4j.e1.j;

public final class f implements i {
  private static final Locale[] b = new Locale[0];
  
  public static final Set<String> c;
  
  public static final f d = new f();
  
  private static final Map<String, j> e;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("latn", j.c);
    hashMap.put("arab", j.d);
    hashMap.put("arabext", j.e);
    hashMap.put("deva", j.g);
    hashMap.put("mymr", j.m);
    e = Collections.unmodifiableMap(hashMap);
  }
  
  private static char a(Locale paramLocale, String paramString, char paramChar) {
    e e = f(paramLocale);
    return (e != null && e.a(paramString)) ? e.b(paramString).charAt(0) : paramChar;
  }
  
  private static String a(Locale paramLocale, String paramString1, String paramString2) {
    e e = f(paramLocale);
    return (e != null && e.a(paramString1)) ? e.b(paramString1) : paramString2;
  }
  
  private static e f(Locale paramLocale) {
    return c.contains(d.a(paramLocale)) ? e.a("i18n/numbers/symbol", paramLocale) : null;
  }
  
  public char a(Locale paramLocale) {
    return a(paramLocale, "separator", i.a.a(paramLocale));
  }
  
  public Locale[] a() {
    return b;
  }
  
  public String b(Locale paramLocale) {
    return a(paramLocale, "plus", i.a.b(paramLocale));
  }
  
  public j c(Locale paramLocale) {
    String str = a(paramLocale, "numsys", "latn");
    return e.get(str);
  }
  
  public String d(Locale paramLocale) {
    return a(paramLocale, "minus", i.a.d(paramLocale));
  }
  
  public char e(Locale paramLocale) {
    return a(paramLocale, "zero", i.a.e(paramLocale));
  }
  
  public String toString() {
    return "SymbolProviderSPI";
  }
  
  static {
    String[] arrayOfString = e.a("i18n/numbers/symbol", Locale.ROOT).b("locales").split(" ");
    HashSet<? super String> hashSet = new HashSet();
    Collections.addAll(hashSet, arrayOfString);
    c = Collections.unmodifiableSet((Set)hashSet);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */