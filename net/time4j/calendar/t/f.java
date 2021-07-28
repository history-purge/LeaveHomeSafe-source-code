package net.time4j.calendar.t;

import net.time4j.d1.q;
import net.time4j.d1.v;

public class f<T extends q<T>> extends d<Integer, T> {
  private static final long serialVersionUID = -4975173343610190782L;
  
  private final transient int d;
  
  private final transient int e;
  
  public f(String paramString, Class<T> paramClass, int paramInt1, int paramInt2, char paramChar) {
    super(paramString, paramClass, paramChar, true);
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public f(String paramString, Class<T> paramClass, int paramInt1, int paramInt2, char paramChar, v<T> paramv1, v<T> paramv2) {
    super(paramString, paramClass, paramChar, false);
    this.d = paramInt1;
    this.e = paramInt2;
  }
  
  public Integer b() {
    return Integer.valueOf(this.e);
  }
  
  public Class<Integer> getType() {
    return Integer.class;
  }
  
  public Integer q() {
    return Integer.valueOf(this.d);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/t/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */