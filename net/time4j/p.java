package net.time4j;

import java.io.InvalidObjectException;
import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.d1.q;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.b0.d;
import net.time4j.e1.g;
import net.time4j.e1.l;
import net.time4j.e1.m;
import net.time4j.e1.t;
import net.time4j.e1.w;

final class p<V extends Enum<V>> extends a<V> implements c0<V>, l<V>, d<V> {
  private static final long serialVersionUID = 2055272540517425102L;
  
  private final transient Class<V> c;
  
  private final transient V d;
  
  private final transient V e;
  
  private final transient int f;
  
  private final transient char g;
  
  p(String paramString, Class<V> paramClass, V paramV1, V paramV2, int paramInt, char paramChar) {
    super(paramString);
    this.c = paramClass;
    this.d = paramV1;
    this.e = paramV2;
    this.f = paramInt;
    this.g = paramChar;
  }
  
  private t a(Locale paramLocale, w paramw, m paramm) {
    switch (this.f) {
      default:
        throw new UnsupportedOperationException(name());
      case 103:
        return b.a(paramLocale).c(paramw, paramm);
      case 102:
        return b.a(paramLocale).e(paramw, paramm);
      case 101:
        break;
    } 
    return b.a(paramLocale).d(paramw, paramm);
  }
  
  private Object readResolve() {
    Object object = f0.a(name());
    if (object != null)
      return object; 
    throw new InvalidObjectException(name());
  }
  
  public char a() {
    return this.g;
  }
  
  public int a(V paramV) {
    return paramV.ordinal() + 1;
  }
  
  public int a(V paramV, o paramo, d paramd) {
    return paramV.ordinal() + 1;
  }
  
  public V a(CharSequence paramCharSequence, ParsePosition paramParsePosition, Locale paramLocale, w paramw, m paramm, g paramg) {
    int i = paramParsePosition.getIndex();
    Enum enum_2 = a(paramLocale, paramw, paramm).a(paramCharSequence, paramParsePosition, getType(), paramg);
    Enum enum_1 = enum_2;
    if (enum_2 == null) {
      enum_1 = enum_2;
      if (!paramg.c()) {
        paramParsePosition.setErrorIndex(-1);
        paramParsePosition.setIndex(i);
        m m2 = m.c;
        m m1 = m2;
        if (paramm == m2)
          m1 = m.d; 
        enum_1 = a(paramLocale, paramw, m1).a(paramCharSequence, paramParsePosition, getType(), paramg);
      } 
    } 
    return (V)enum_1;
  }
  
  public V a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    int i = paramParsePosition.getIndex();
    Locale locale = (Locale)paramd.a(a.c, Locale.ROOT);
    w w = (w)paramd.a(a.g, w.c);
    m m = (m)paramd.a(a.h, m.c);
    Enum enum_2 = a(locale, w, m).a(paramCharSequence, paramParsePosition, getType(), paramd);
    Enum enum_1 = enum_2;
    if (enum_2 == null) {
      enum_1 = enum_2;
      if (((Boolean)paramd.a(a.k, Boolean.TRUE)).booleanValue()) {
        paramParsePosition.setErrorIndex(-1);
        paramParsePosition.setIndex(i);
        m m2 = m.c;
        m m1 = m2;
        if (m == m2)
          m1 = m.d; 
        enum_1 = a(locale, w, m1).a(paramCharSequence, paramParsePosition, getType(), paramd);
      } 
    } 
    return (V)enum_1;
  }
  
  public void a(o paramo, Appendable paramAppendable, Locale paramLocale, w paramw, m paramm) {
    paramAppendable.append(a(paramLocale, paramw, paramm).a((Enum)paramo.e(this)));
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    paramAppendable.append(a((Locale)paramd.a(a.c, Locale.ROOT), (w)paramd.a(a.g, w.c), (m)paramd.a(a.h, m.c)).a((Enum)paramo.e(this)));
  }
  
  public boolean a(q<?> paramq, int paramInt) {
    for (Enum enum_ : (Enum[])getType().getEnumConstants()) {
      if (a((V)enum_) == paramInt) {
        paramq.b(this, enum_);
        return true;
      } 
    } 
    return false;
  }
  
  public V b() {
    return this.e;
  }
  
  public boolean d() {
    return true;
  }
  
  protected boolean g() {
    return true;
  }
  
  public Class<V> getType() {
    return this.c;
  }
  
  int h() {
    return this.f;
  }
  
  public V q() {
    return this.d;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */