package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.d1.d;
import net.time4j.d1.h;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.z;
import net.time4j.e1.a;
import net.time4j.e1.u;

class i<D extends f<?, D>> implements u<o>, z<D, o>, Serializable {
  private static final i c = new i();
  
  private static final long serialVersionUID = 4572549754637955194L;
  
  static <D extends f<?, D>> i<D> e() {
    return c;
  }
  
  public char a() {
    return Character.MIN_VALUE;
  }
  
  public int a(o paramo1, o paramo2) {
    return ((o<Enum>)paramo1.e((p)this)).compareTo((Enum)paramo2.e((p)this));
  }
  
  public D a(D paramD, o paramo, boolean paramBoolean) {
    if (paramo != null) {
      long l = paramD.v().b(paramD.w(), paramD.getYear().b());
      return paramo.a((D)paramD.a(h.a(paramD.q() - l)));
    } 
    throw new IllegalArgumentException("Missing solar term.");
  }
  
  public o a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    Locale locale = (Locale)paramd.a(a.c, Locale.ROOT);
    int j = paramCharSequence.length();
    if (paramParsePosition.getIndex() >= j) {
      paramParsePosition.setErrorIndex(j);
      return null;
    } 
    return o.a(paramCharSequence, locale, paramParsePosition);
  }
  
  public p<?> a(D paramD) {
    throw new AbstractMethodError();
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    Locale locale = (Locale)paramd.a(a.c, Locale.ROOT);
    paramAppendable.append(((o)paramo.e((p)this)).a(locale));
  }
  
  public boolean a(D paramD, o paramo) {
    return (paramo != null);
  }
  
  public o b() {
    return o.z;
  }
  
  public p<?> b(D paramD) {
    throw new AbstractMethodError();
  }
  
  public o c(D paramD) {
    d d = paramD.v();
    return o.b(d.d(d.b(paramD.w(), paramD.getYear().b()) + paramD.B()));
  }
  
  public boolean c() {
    return false;
  }
  
  public o d(D paramD) {
    d d = paramD.v();
    return o.b(d.d(d.b(paramD.w(), paramD.getYear().b()) + 1L));
  }
  
  public boolean d() {
    return true;
  }
  
  public o e(D paramD) {
    return o.b(paramD.v().d(paramD.q() + 1L));
  }
  
  public Class<o> getType() {
    return o.class;
  }
  
  public String name() {
    return "SOLAR_TERM";
  }
  
  public o q() {
    return o.c;
  }
  
  protected Object readResolve() {
    return c;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */