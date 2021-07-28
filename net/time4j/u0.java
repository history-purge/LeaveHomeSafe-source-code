package net.time4j;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.d1.d;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.s;

class u0 implements s {
  public Set<p<?>> a(Locale paramLocale, d paramd) {
    return paramLocale.getCountry().isEmpty() ? Collections.emptySet() : y0.a(paramLocale).c();
  }
  
  public q<?> a(q<?> paramq, Locale paramLocale, d paramd) {
    return paramq;
  }
  
  public boolean a(Class<?> paramClass) {
    return false;
  }
  
  public boolean a(p<?> paramp) {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */