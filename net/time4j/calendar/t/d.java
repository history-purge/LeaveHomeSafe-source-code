package net.time4j.calendar.t;

import java.io.InvalidObjectException;
import net.time4j.calendar.p;
import net.time4j.d1.e;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.x;
import net.time4j.e1.d;

public abstract class d<V extends Comparable<V>, T extends q<T>> extends d<V> implements p<V, T> {
  private final transient char c;
  
  private final Class<T> chrono;
  
  public d(String paramString, Class<T> paramClass, char paramChar, boolean paramBoolean) {
    super(paramString);
    this.chrono = paramClass;
    this.c = paramChar;
  }
  
  public char a() {
    return this.c;
  }
  
  protected boolean a(e<?> parame) {
    d d1 = (d)parame;
    return (this.chrono == d1.chrono);
  }
  
  public boolean d() {
    return true;
  }
  
  protected Class<T> h() {
    return this.chrono;
  }
  
  protected Object readResolve() {
    String str = name();
    for (p p1 : x.a(this.chrono).g()) {
      if (p1.name().equals(str))
        return p1; 
    } 
    InvalidObjectException invalidObjectException = new InvalidObjectException(str);
    throw invalidObjectException;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/t/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */