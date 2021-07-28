package net.time4j.calendar.t;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.c;
import net.time4j.e1.l;
import net.time4j.e1.m;
import net.time4j.e1.t;
import net.time4j.e1.u;
import net.time4j.e1.w;

public class e<V extends Enum<V>, T extends q<T>> extends d<V, T> implements l<V>, u<V> {
  private static final long serialVersionUID = -2452569351302286113L;
  
  private final transient Class<V> d;
  
  private final transient String e;
  
  public e(String paramString, Class<T> paramClass, Class<V> paramClass1, char paramChar) {
    super(paramString, paramClass, paramChar, a(paramChar));
    this.d = paramClass1;
    this.e = a(paramClass);
  }
  
  private static String a(Class<?> paramClass) {
    c c = paramClass.<c>getAnnotation(c.class);
    return (c == null) ? "iso8601" : c.value();
  }
  
  private t a(d paramd, m paramm, boolean paramBoolean) {
    Locale locale = (Locale)paramd.a(a.c, Locale.ROOT);
    w w = (w)paramd.a(a.g, w.c);
    b b = b.a(a(paramd), locale);
    return j() ? (paramBoolean ? b.a(w, paramm) : b.d(w, paramm)) : (k() ? b.e(w, paramm) : (i() ? b.a(w) : b.a(name(), this.d, new String[0])));
  }
  
  private static boolean a(char paramChar) {
    return (paramChar == 'E');
  }
  
  public int a(V paramV) {
    return paramV.ordinal() + 1;
  }
  
  public int a(V paramV, o paramo, d paramd) {
    return a(paramV);
  }
  
  public V a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    int i = paramParsePosition.getIndex();
    m m = (m)paramd.a(a.h, m.c);
    Enum enum_2 = a(paramd, m, false).a(paramCharSequence, paramParsePosition, getType(), paramd);
    Enum enum_1 = enum_2;
    if (enum_2 == null) {
      enum_1 = enum_2;
      if (j()) {
        paramParsePosition.setErrorIndex(-1);
        paramParsePosition.setIndex(i);
        enum_1 = a(paramd, m, true).a(paramCharSequence, paramParsePosition, getType(), paramd);
      } 
    } 
    enum_2 = enum_1;
    if (enum_1 == null) {
      enum_2 = enum_1;
      if (((Boolean)paramd.a(a.k, Boolean.TRUE)).booleanValue()) {
        paramParsePosition.setErrorIndex(-1);
        paramParsePosition.setIndex(i);
        m m2 = m.c;
        m m1 = m2;
        if (m == m2)
          m1 = m.d; 
        enum_2 = a(paramd, m1, false).a(paramCharSequence, paramParsePosition, getType(), paramd);
        if (enum_2 == null && j()) {
          paramParsePosition.setErrorIndex(-1);
          paramParsePosition.setIndex(i);
          return (V)a(paramd, m1, true).a(paramCharSequence, paramParsePosition, getType(), paramd);
        } 
      } 
    } 
    return (V)enum_2;
  }
  
  protected String a(d paramd) {
    return (j() || i()) ? (String)paramd.a(a.b, this.e) : (k() ? "iso8601" : this.e);
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    Enum enum_ = (Enum)paramo.e((p)this);
    paramAppendable.append(a(paramd, (m)paramd.a(a.h, m.c), a(paramo)).a(enum_));
  }
  
  protected boolean a(o paramo) {
    return false;
  }
  
  public boolean a(q<?> paramq, int paramInt) {
    for (Enum enum_ : (Enum[])getType().getEnumConstants()) {
      if (a((V)enum_) == paramInt) {
        paramq.b((p)this, enum_);
        return true;
      } 
    } 
    return false;
  }
  
  public V b() {
    Enum[] arrayOfEnum = (Enum[])this.d.getEnumConstants();
    return (V)arrayOfEnum[arrayOfEnum.length - 1];
  }
  
  public Class<V> getType() {
    return this.d;
  }
  
  protected boolean i() {
    return (a() == 'G');
  }
  
  protected boolean j() {
    return (a() == 'M');
  }
  
  protected boolean k() {
    return a(a());
  }
  
  public V q() {
    return (V)((Enum[])this.d.getEnumConstants())[0];
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/t/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */