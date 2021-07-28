package net.time4j.e1.a0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.c1.d;
import net.time4j.d1.c;
import net.time4j.d1.d;
import net.time4j.d1.n;
import net.time4j.d1.o;
import net.time4j.d1.x;
import net.time4j.e1.g;
import net.time4j.e1.i;
import net.time4j.e1.j;
import net.time4j.e1.m;
import net.time4j.e1.w;
import net.time4j.f1.d;
import net.time4j.f1.f;

final class b implements d {
  static final c<String> g = net.time4j.e1.a.a("PLUS_SIGN", String.class);
  
  static final c<String> h = net.time4j.e1.a.a("MINUS_SIGN", String.class);
  
  private static final i i;
  
  private static final char j;
  
  private static final ConcurrentMap<String, a> k = new ConcurrentHashMap<String, a>();
  
  private static final a l = new a(j.c, '0', j, "+", "-");
  
  private final Map<String, Object> a;
  
  private final net.time4j.e1.a b;
  
  private final Locale c;
  
  private final int d;
  
  private final int e;
  
  private final n<o> f;
  
  b(net.time4j.e1.a parama, Locale paramLocale) {
    this(parama, paramLocale, 0, 0, null);
  }
  
  b(net.time4j.e1.a parama, Locale paramLocale, int paramInt1, int paramInt2, n<o> paramn) {
    if (parama != null) {
      this.b = parama;
      Locale locale = paramLocale;
      if (paramLocale == null)
        locale = Locale.ROOT; 
      this.c = locale;
      this.d = paramInt1;
      this.e = paramInt2;
      this.f = paramn;
      this.a = Collections.emptyMap();
      return;
    } 
    throw new NullPointerException("Missing format attributes.");
  }
  
  private b(net.time4j.e1.a parama, Locale paramLocale, int paramInt1, int paramInt2, n<o> paramn, Map<String, Object> paramMap) {
    if (parama != null) {
      this.b = parama;
      Locale locale = paramLocale;
      if (paramLocale == null)
        locale = Locale.ROOT; 
      this.c = locale;
      this.d = paramInt1;
      this.e = paramInt2;
      this.f = paramn;
      this.a = Collections.unmodifiableMap(paramMap);
      return;
    } 
    throw new NullPointerException("Missing format attributes.");
  }
  
  static b a(x<?> paramx, net.time4j.e1.a parama, Locale paramLocale) {
    net.time4j.e1.a.b b1 = new net.time4j.e1.a.b(paramx);
    b1.a(net.time4j.e1.a.f, (Enum)g.d);
    b1.a(net.time4j.e1.a.g, (Enum)w.c);
    b1.a(net.time4j.e1.a.h, (Enum)m.c);
    b1.a(net.time4j.e1.a.p, ' ');
    b1.a(parama);
    return (new b(b1.a(), paramLocale)).a(paramLocale);
  }
  
  static b a(b paramb1, b paramb2) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.putAll(paramb2.a);
    hashMap.putAll(paramb1.a);
    net.time4j.e1.a.b b1 = new net.time4j.e1.a.b();
    b1.a(paramb2.b);
    b1.a(paramb1.b);
    return (new b(b1.a(), Locale.ROOT, 0, 0, null, (Map)hashMap)).a(paramb1.c);
  }
  
  private static boolean a(Object paramObject1, Object paramObject2) {
    return (paramObject1 == null) ? ((paramObject2 == null)) : paramObject1.equals(paramObject2);
  }
  
  public <A> A a(c<A> paramc) {
    return (A)(this.a.containsKey(paramc.name()) ? (Object)paramc.a().cast(this.a.get(paramc.name())) : this.b.a(paramc));
  }
  
  public <A> A a(c<A> paramc, A paramA) {
    return (A)(this.a.containsKey(paramc.name()) ? (Object)paramc.a().cast(this.a.get(paramc.name())) : this.b.a(paramc, paramA));
  }
  
  b a(Locale paramLocale) {
    String str2;
    net.time4j.e1.a.b b1 = new net.time4j.e1.a.b();
    b1.a(this.b);
    String str1 = d.a(paramLocale);
    String str3 = paramLocale.getCountry();
    if (str1.isEmpty() && str3.isEmpty()) {
      paramLocale = Locale.ROOT;
      b1.a(net.time4j.e1.a.l, (Enum)j.c);
      b1.a(net.time4j.e1.a.o, j);
      str1 = "+";
      str2 = "-";
    } else {
      str2 = str1;
      if (!str3.isEmpty()) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        stringBuilder.append("_");
        stringBuilder.append(str3);
        str2 = stringBuilder.toString();
      } 
      a a2 = k.get(str2);
      a a1 = a2;
      if (a2 == null) {
        try {
          a1 = new a(i.c(paramLocale), i.e(paramLocale), i.a(paramLocale), i.b(paramLocale), i.d(paramLocale));
        } catch (RuntimeException runtimeException) {
          a1 = l;
        } 
        a a3 = k.putIfAbsent(str2, a1);
        if (a3 != null)
          a1 = a3; 
      } 
      b1.a(net.time4j.e1.a.l, (Enum)a.a(a1));
      b1.a(net.time4j.e1.a.m, a.b(a1));
      b1.a(net.time4j.e1.a.o, a.c(a1));
      str2 = a.d(a1);
      String str = a.e(a1);
      str1 = str2;
      str2 = str;
    } 
    b1.a(paramLocale);
    HashMap<String, Object> hashMap = new HashMap<String, Object>(this.a);
    hashMap.put(g.name(), str1);
    hashMap.put(h.name(), str2);
    return new b(b1.a(), paramLocale, this.d, this.e, this.f, hashMap);
  }
  
  b a(net.time4j.e1.a parama) {
    return new b(parama, this.c, this.d, this.e, this.f, this.a);
  }
  
  net.time4j.e1.a a() {
    return this.b;
  }
  
  n<o> b() {
    return this.f;
  }
  
  <A> b b(c<A> paramc, A paramA) {
    HashMap<String, Object> hashMap = new HashMap<String, Object>(this.a);
    String str = paramc.name();
    if (paramA == null) {
      hashMap.remove(str);
    } else {
      hashMap.put(str, paramA);
    } 
    return new b(this.b, this.c, this.d, this.e, this.f, hashMap);
  }
  
  public boolean b(c<?> paramc) {
    return this.a.containsKey(paramc.name()) ? true : this.b.b(paramc);
  }
  
  int c() {
    return this.d;
  }
  
  Locale d() {
    return this.c;
  }
  
  int e() {
    return this.e;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof b) {
      paramObject = paramObject;
      return (this.b.equals(((b)paramObject).b) && this.c.equals(((b)paramObject).c) && this.d == ((b)paramObject).d && this.e == ((b)paramObject).e && a(this.f, ((b)paramObject).f) && this.a.equals(((b)paramObject).a));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.b.hashCode() * 7 + this.a.hashCode() * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(b.class.getName());
    stringBuilder.append("[attributes=");
    stringBuilder.append(this.b);
    stringBuilder.append(",locale=");
    stringBuilder.append(this.c);
    stringBuilder.append(",level=");
    stringBuilder.append(this.d);
    stringBuilder.append(",section=");
    stringBuilder.append(this.e);
    stringBuilder.append(",print-condition=");
    stringBuilder.append(this.f);
    stringBuilder.append(",other=");
    stringBuilder.append(this.a);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  static {
    byte b1;
    f f;
  }
  
  static {
    Iterator<i> iterator = d.c().a(i.class).iterator();
    i i1 = null;
    int j = 0;
    while (iterator.hasNext()) {
      i i3 = iterator.next();
      int k = (i3.a()).length;
      if (k > j) {
        i1 = i3;
        j = k;
      } 
    } 
    i i2 = i1;
    if (i1 == null)
      f = f.d; 
    i = (i)f;
    if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
      b1 = 46;
    } else {
      b1 = 44;
    } 
    j = b1;
  }
  
  private static class a {
    private final j a;
    
    private final char b;
    
    private final char c;
    
    private final String d;
    
    private final String e;
    
    a(j param1j, char param1Char1, char param1Char2, String param1String1, String param1String2) {
      this.a = param1j;
      this.b = param1Char1;
      this.c = param1Char2;
      this.d = param1String1;
      this.e = param1String2;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */