package net.time4j.calendar;

import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.e1.a;
import net.time4j.e1.g;
import net.time4j.e1.u;

class e implements u<c>, Serializable {
  static final e c = new e();
  
  private static final long serialVersionUID = -4211396220263977858L;
  
  public char a() {
    return 'U';
  }
  
  public int a(o paramo1, o paramo2) {
    return ((c)paramo1.e((p)this)).a((c)paramo2.e((p)this));
  }
  
  public c a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    return c.a(paramCharSequence, paramParsePosition, (Locale)paramd.a(a.c, Locale.ROOT), ((g)paramd.a(a.f, g.d)).c() ^ true);
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    Locale locale = (Locale)paramd.a(a.c, Locale.ROOT);
    paramAppendable.append(((c)paramo.e((p)this)).a(locale));
  }
  
  public c b() {
    return c.g(60);
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    return true;
  }
  
  public Class<c> getType() {
    return c.class;
  }
  
  public String name() {
    return "CYCLIC_YEAR";
  }
  
  public c q() {
    return c.g(1);
  }
  
  protected Object readResolve() {
    return c;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */