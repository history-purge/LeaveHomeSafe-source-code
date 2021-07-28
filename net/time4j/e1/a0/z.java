package net.time4j.e1.a0;

import java.util.Locale;
import java.util.Set;
import net.time4j.a0;
import net.time4j.d1.c;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.x;
import net.time4j.d1.y;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.e;
import net.time4j.e1.h;
import net.time4j.f0;
import net.time4j.g0;
import net.time4j.h0;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.o;

final class z<T> implements h<T> {
  private final c<T> c;
  
  private final y d;
  
  private final y e;
  
  z(y paramy1, y paramy2) {
    this(null, paramy1, paramy2);
  }
  
  private z(c<T> paramc, y paramy1, y paramy2) {
    if (paramy1 != null && paramy2 != null) {
      this.d = paramy1;
      this.e = paramy2;
      this.c = paramc;
      return;
    } 
    throw new NullPointerException("Missing display style.");
  }
  
  private static <T> c<T> a(x<?> paramx, y paramy1, y paramy2, Locale paramLocale, boolean paramBoolean, l paraml) {
    StringBuilder stringBuilder1;
    String str;
    if (paramx.equals(f0.I())) {
      String str1 = b.a((e)paramy1, paramLocale);
    } else {
      String str1;
      if (paramx.equals(g0.C())) {
        str1 = b.b((e)paramy2, paramLocale);
      } else if (paramx.equals(h0.B())) {
        str1 = b.b((e)str1, (e)paramy2, paramLocale);
      } else if (paramx.equals(a0.y())) {
        str1 = b.a((e)str1, (e)paramy2, paramLocale);
      } else if (h.class.isAssignableFrom(paramx.e())) {
        str1 = paramx.a((y)str1, paramLocale);
      } else {
        stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Localized format patterns not available: ");
        stringBuilder1.append(paramx);
        throw new UnsupportedOperationException(stringBuilder1.toString());
      } 
    } 
    StringBuilder stringBuilder2 = stringBuilder1;
    if (paramBoolean) {
      stringBuilder2 = stringBuilder1;
      if (stringBuilder1.contains("yy")) {
        stringBuilder2 = stringBuilder1;
        if (!stringBuilder1.contains("yyy"))
          str = stringBuilder1.replace("yy", "yyyy"); 
      } 
    } 
    c<?> c2 = c.a(str, w.c, paramLocale, paramx);
    c<?> c1 = c2;
    if (paraml != null)
      c1 = c2.a(paraml); 
    return (c)c1;
  }
  
  public int a(o paramo, Appendable paramAppendable, d paramd, Set<g> paramSet, boolean paramBoolean) {
    c<T> c1 = this.c;
    if (paramSet != null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    Set<g> set = c1.a(paramo, paramAppendable, paramd, paramBoolean);
    if (paramSet != null)
      paramSet.addAll(set); 
    return Integer.MAX_VALUE;
  }
  
  public h<T> a(p<T> paramp) {
    return this;
  }
  
  public h<T> a(c<?> paramc, d paramd, int paramInt) {
    l l;
    o o = (o)paramd.a(a.e, l.e);
    c c2 = a.d;
    c c1 = null;
    k k = (k)paramd.a(c2, null);
    Locale locale = (Locale)paramd.a(a.c, Locale.ROOT);
    x<?> x = paramc.c();
    y y1 = this.d;
    y y2 = this.e;
    boolean bool = ((Boolean)paramd.a(a.v, Boolean.FALSE)).booleanValue();
    if (k == null) {
      paramc = c1;
    } else {
      l = l.a(k).a(o);
    } 
    return new z(a(x, y1, y2, locale, bool, l), this.d, this.e);
  }
  
  public void a(CharSequence paramCharSequence, s params, d paramd, t<?> paramt, boolean paramBoolean) {
    c<?> c1;
    if (paramBoolean) {
      c1 = this.c;
    } else {
      l l;
      d d1 = this.c.a();
      c c2 = a.e;
      o o = (o)paramd.a(c2, d1.a(c2, l.e));
      c c3 = a.d;
      c2 = null;
      k k = (k)paramd.a(c3, d1.a(c3, null));
      if (k != null)
        l = l.a(k).a(o); 
      c1 = a(this.c.c(), this.d, this.e, (Locale)paramd.a(a.c, this.c.e()), ((Boolean)paramd.a(a.v, Boolean.FALSE)).booleanValue(), l);
    } 
    paramCharSequence = (CharSequence)c1.a(paramCharSequence, params, paramd);
    if (!params.i() && paramCharSequence != null)
      paramt.a(paramCharSequence); 
  }
  
  public boolean a() {
    return false;
  }
  
  public p<T> b() {
    return null;
  }
  
  public boolean equals(Object<T> paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof z) {
      z z1 = (z)paramObject;
      if (this.d.equals(z1.d) && this.e.equals(z1.e)) {
        paramObject = (Object<T>)this.c;
        c<T> c1 = z1.c;
        return (paramObject == null) ? ((c1 == null)) : paramObject.equals(c1);
      } 
    } 
    return false;
  }
  
  public int hashCode() {
    c<T> c1 = this.c;
    return (c1 == null) ? 0 : c1.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(z.class.getName());
    stringBuilder.append("[date-style=");
    stringBuilder.append(this.d);
    stringBuilder.append(",time-style=");
    stringBuilder.append(this.e);
    stringBuilder.append(",delegate=");
    stringBuilder.append(this.c);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */