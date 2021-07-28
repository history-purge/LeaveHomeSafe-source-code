package net.time4j.tz;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import net.time4j.c1.a;
import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.c1.f;
import net.time4j.c1.g;

final class h extends l {
  private static final long serialVersionUID = -8432968264242113551L;
  
  private final k id = null;
  
  private final boolean strict = false;
  
  private final TimeZone tz = null;
  
  private final transient p v;
  
  h() {
    this.v = null;
  }
  
  h(k paramk) {
    this(paramk, TimeZone.getDefault(), false);
  }
  
  h(k paramk, String paramString) {
    this(paramk, c(paramString), false);
  }
  
  private h(k paramk, TimeZone paramTimeZone, boolean paramBoolean) {
    if (!this.tz.useDaylightTime()) {
      boolean bool;
      String str = this.tz.getID();
      if (str.startsWith("GMT") || str.startsWith("Etc/") || str.equals("Greenwich") || str.equals("UCT") || str.equals("UTC") || str.equals("Universal") || str.equals("Zulu")) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool) {
        this.v = a(this.tz.getOffset(System.currentTimeMillis()));
        return;
      } 
    } 
    this.v = null;
  }
  
  private static p a(int paramInt) {
    return p.f(c.a(paramInt, 1000));
  }
  
  static TimeZone c(String paramString) {
    byte b;
    StringBuilder stringBuilder;
    if (paramString.equals("Z")) {
      paramString = "GMT+00:00";
      return TimeZone.getTimeZone(paramString);
    } 
    if (paramString.startsWith("UTC")) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("GMT");
      b = 3;
    } else if (paramString.startsWith("UT")) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("GMT");
      b = 2;
    } else {
      return TimeZone.getTimeZone(paramString);
    } 
    stringBuilder.append(paramString.substring(b));
    paramString = stringBuilder.toString();
    return TimeZone.getTimeZone(paramString);
  }
  
  private Object readResolve() {
    k k1 = this.id;
    return (k1 == null) ? new h() : new h(k1, this.tz, this.strict);
  }
  
  public String a(d paramd, Locale paramLocale) {
    TimeZone timeZone;
    if (this.id == null) {
      timeZone = TimeZone.getDefault();
    } else {
      timeZone = this.tz;
    } 
    return timeZone.getDisplayName(paramd.b(), paramd.a() ^ true, paramLocale);
  }
  
  public l a(o paramo) {
    if (this.id != null) {
      if (e() == paramo)
        return this; 
      if (paramo == l.e)
        return new h(this.id, this.tz, false); 
      if (paramo == l.f)
        return new h(this.id, this.tz, true); 
      throw new UnsupportedOperationException(paramo.toString());
    } 
    return this;
  }
  
  public p b(f paramf) {
    TimeZone timeZone;
    if (this.id == null) {
      timeZone = TimeZone.getDefault();
    } else {
      p p1 = this.v;
      if (p1 != null)
        return p1; 
      timeZone = this.tz;
    } 
    return a(timeZone.getOffset(paramf.b() * 1000L));
  }
  
  public m c() {
    p p1 = this.v;
    return (p1 == null) ? null : p1.s();
  }
  
  public p c(a parama, g paramg) {
    TimeZone timeZone;
    boolean bool;
    int n;
    int i1;
    p p1 = this.v;
    if (p1 != null)
      return p1; 
    int i = parama.getYear();
    int j = parama.getMonth();
    int m = parama.r();
    if (paramg.getHour() == 24) {
      long l1 = b.d(c.a(b.a(parama), 1L));
      i = b.c(l1);
      j = b.b(l1);
      m = b.a(l1);
    } 
    if (i > 0) {
      n = i;
      bool = true;
    } else {
      n = 1 - i;
      bool = false;
    } 
    i = b.b(i, j, m) + 1;
    if (i == 8)
      i = 1; 
    if (paramg.getHour() == 24) {
      i1 = 0;
    } else {
      i1 = (paramg.getHour() * 3600 + paramg.getMinute() * 60 + paramg.getSecond()) * 1000 + paramg.a() / 1000000;
    } 
    if (this.id == null) {
      timeZone = TimeZone.getDefault();
    } else {
      timeZone = this.tz;
    } 
    return a(timeZone.getOffset(bool, n, j - 1, m, i, i1));
  }
  
  public boolean c(f paramf) {
    TimeZone timeZone;
    if (this.v != null)
      return false; 
    if (this.id == null) {
      timeZone = TimeZone.getDefault();
    } else {
      timeZone = this.tz;
    } 
    return timeZone.inDaylightTime(new Date(paramf.b() * 1000L));
  }
  
  public k d() {
    k k1 = this.id;
    return (k1 == null) ? new e(TimeZone.getDefault().getID()) : k1;
  }
  
  public boolean d(a parama, g paramg) {
    TimeZone timeZone;
    if (this.v != null)
      return false; 
    int i = parama.getYear();
    int j = parama.getMonth();
    int m = parama.r();
    int n = paramg.getHour();
    int i1 = paramg.getMinute();
    int i2 = paramg.getSecond();
    int i3 = paramg.a() / 1000000;
    if (this.id == null) {
      timeZone = TimeZone.getDefault();
    } else {
      timeZone = this.tz;
    } 
    GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
    gregorianCalendar.set(14, i3);
    gregorianCalendar.set(i, j - 1, m, n, i1, i2);
    return (gregorianCalendar.get(1) != i || gregorianCalendar.get(2) + 1 != j || gregorianCalendar.get(5) != m || gregorianCalendar.get(11) != n || gregorianCalendar.get(12) != i1 || gregorianCalendar.get(13) != i2 || gregorianCalendar.get(14) != i3);
  }
  
  public o e() {
    return this.strict ? l.f : l.e;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool = paramObject instanceof h;
    boolean bool2 = false;
    boolean bool1 = false;
    if (bool) {
      h h1 = (h)paramObject;
      if (this.id == null) {
        if (h1.id == null)
          bool1 = true; 
        return bool1;
      } 
      if (this.tz.equals(h1.tz)) {
        if (this.strict != h1.strict)
          return false; 
        paramObject = this.v;
        p p1 = h1.v;
        if (paramObject == null) {
          bool1 = bool2;
          if (p1 == null)
            bool1 = true; 
          return bool1;
        } 
        return paramObject.equals(p1);
      } 
    } 
    return false;
  }
  
  public boolean f() {
    return (this.v != null);
  }
  
  public int hashCode() {
    return (this.id == null) ? 0 : this.tz.hashCode();
  }
  
  boolean q() {
    TimeZone timeZone;
    if (this.id == null) {
      timeZone = TimeZone.getDefault();
    } else {
      timeZone = this.tz;
    } 
    return timeZone.getID().equals("GMT");
  }
  
  public String toString() {
    TimeZone timeZone;
    if (this.id == null) {
      timeZone = TimeZone.getDefault();
    } else {
      timeZone = this.tz;
    } 
    StringBuilder stringBuilder = new StringBuilder(256);
    stringBuilder.append('[');
    stringBuilder.append(h.class.getName());
    stringBuilder.append(':');
    stringBuilder.append(timeZone);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */