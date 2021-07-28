package net.time4j;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.d1.d;
import net.time4j.d1.o;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.b0.d;
import net.time4j.e1.g;
import net.time4j.e1.m;
import net.time4j.e1.t;
import net.time4j.e1.w;

enum d implements b1<z>, d<z> {
  c;
  
  private t a(Locale paramLocale, w paramw, m paramm) {
    return b.a(paramLocale).b(paramw, paramm);
  }
  
  private t a(d paramd) {
    return b.a((Locale)paramd.a(a.c, Locale.ROOT)).b((w)paramd.a(a.g, w.c), (m)paramd.a(a.h, m.c));
  }
  
  static z a(CharSequence paramCharSequence, ParsePosition paramParsePosition) {
    int j = paramParsePosition.getIndex();
    int k = paramCharSequence.length();
    int i = j + 2;
    if (k >= i) {
      k = paramCharSequence.charAt(j + 1);
      if (k == 77 || k == 109) {
        j = paramCharSequence.charAt(j);
        if (j == 65 || j == 97) {
          paramParsePosition.setIndex(i);
          return z.c;
        } 
        if (j == 80 || j == 112) {
          paramParsePosition.setIndex(i);
          return z.d;
        } 
      } 
    } 
    return null;
  }
  
  public char a() {
    return 'a';
  }
  
  public int a(o paramo1, o paramo2) {
    return ((z<Enum>)paramo1.e(this)).compareTo((Enum)paramo2.e(this));
  }
  
  public z a(CharSequence paramCharSequence, ParsePosition paramParsePosition, Locale paramLocale, w paramw, m paramm, g paramg) {
    z z2 = a(paramCharSequence, paramParsePosition);
    z z1 = z2;
    if (z2 == null)
      z1 = (z)a(paramLocale, paramw, paramm).a(paramCharSequence, paramParsePosition, getType(), paramg); 
    return z1;
  }
  
  public z a(CharSequence paramCharSequence, ParsePosition paramParsePosition, d paramd) {
    z z2 = a(paramCharSequence, paramParsePosition);
    z z1 = z2;
    if (z2 == null)
      z1 = (z)a(paramd).a(paramCharSequence, paramParsePosition, getType(), paramd); 
    return z1;
  }
  
  public void a(o paramo, Appendable paramAppendable, Locale paramLocale, w paramw, m paramm) {
    paramAppendable.append(a(paramLocale, paramw, paramm).a((Enum)paramo.e(this)));
  }
  
  public void a(o paramo, Appendable paramAppendable, d paramd) {
    paramAppendable.append(a(paramd).a((Enum)paramo.e(this)));
  }
  
  public z b() {
    return z.d;
  }
  
  public boolean c() {
    return false;
  }
  
  public boolean d() {
    return false;
  }
  
  public Class<z> getType() {
    return z.class;
  }
  
  public z q() {
    return z.c;
  }
  
  public boolean s() {
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */