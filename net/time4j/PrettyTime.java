package net.time4j;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.c1.d;
import net.time4j.c1.e;
import net.time4j.e1.i;
import net.time4j.e1.k;
import net.time4j.e1.p;

public final class PrettyTime {
  private static final i b;
  
  private static final ConcurrentMap<Locale, PrettyTime> c = new ConcurrentHashMap<Locale, PrettyTime>();
  
  private final Locale a;
  
  static {
    f f1 = f.f;
    f f2 = f.h;
    f f3 = f.i;
    f f4 = f.j;
    g g1 = g.c;
    g g2 = g.d;
    g g3 = g.e;
    f f5 = f.f;
    f5 = f.h;
    f5 = f.j;
    g g4 = g.c;
    g4 = g.d;
    g4 = g.e;
    HashSet<? super w> hashSet = new HashSet();
    Collections.addAll(hashSet, new w[] { f1, f2, f3, f4, g1, g2, g3 });
    hashSet.add(g.h);
    Collections.unmodifiableSet((Set)hashSet);
  }
  
  private PrettyTime(Locale paramLocale, e<?> parame, char paramChar, String paramString1, w paramw, boolean paramBoolean1, boolean paramBoolean2, String paramString2, String paramString3) {
    if (paramw != null) {
      if (parame != null) {
        p.a(paramLocale, k.c);
        this.a = paramLocale;
        return;
      } 
      throw new NullPointerException("Missing reference clock.");
    } 
    throw new NullPointerException("Missing zero time unit.");
  }
  
  public static PrettyTime a(Locale paramLocale) {
    PrettyTime prettyTime2 = c.get(paramLocale);
    PrettyTime prettyTime1 = prettyTime2;
    if (prettyTime2 == null) {
      prettyTime1 = new PrettyTime(paramLocale, o0.e, b.e(paramLocale), b.d(paramLocale), g.e, false, false, null, null);
      PrettyTime prettyTime = c.putIfAbsent(paramLocale, prettyTime1);
      if (prettyTime != null)
        prettyTime1 = prettyTime; 
    } 
    return prettyTime1;
  }
  
  public Locale a() {
    return this.a;
  }
  
  public String b() {
    return r0.a(a()).a();
  }
  
  static {
    i i1 = null;
    Iterator<i> iterator = d.c().a(i.class).iterator();
    int j = 0;
    while (iterator.hasNext()) {
      i i3 = iterator.next();
      int k = (i3.a()).length;
      if (k >= j) {
        i1 = i3;
        j = k;
      } 
    } 
    i i2 = i1;
    if (i1 == null)
      i2 = i.a; 
    b = i2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/PrettyTime.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */