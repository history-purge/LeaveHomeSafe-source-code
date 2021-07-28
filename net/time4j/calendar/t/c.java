package net.time4j.calendar.t;

import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import net.time4j.calendar.KoreanCalendar;
import net.time4j.d1.d;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.s;
import net.time4j.f0;

public class c implements s {
  public Set<p<?>> a(Locale paramLocale, d paramd) {
    return Collections.emptySet();
  }
  
  public q<?> a(q<?> paramq, Locale paramLocale, d paramd) {
    q<?> q1 = paramq;
    if (paramq.c(KoreanCalendar.l)) {
      int i = paramq.a(KoreanCalendar.l);
      q1 = paramq.a((p)f0.r, i - 2333);
    } 
    return q1;
  }
  
  public boolean a(Class<?> paramClass) {
    return (paramClass == f0.class);
  }
  
  public boolean a(p<?> paramp) {
    return (paramp == KoreanCalendar.l);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/t/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */