package net.time4j.history.q;

import net.time4j.d1.p;
import net.time4j.e1.d;

public class c extends d<Integer> {
  public static final p<Integer> f = (p<Integer>)new c("YEAR_OF_DISPLAY", false, 1, 9999);
  
  private static final long serialVersionUID = 1L;
  
  private final transient char c;
  
  private final transient Integer d;
  
  private final transient Integer e;
  
  protected c(String paramString, char paramChar, int paramInt1, int paramInt2) {
    super(paramString);
    this.c = paramChar;
    this.d = Integer.valueOf(paramInt1);
    this.e = Integer.valueOf(paramInt2);
  }
  
  private Object readResolve() {
    return f;
  }
  
  public char a() {
    return this.c;
  }
  
  public Integer b() {
    return this.e;
  }
  
  public boolean d() {
    return true;
  }
  
  protected boolean g() {
    return true;
  }
  
  public final Class<Integer> getType() {
    return Integer.class;
  }
  
  public Integer q() {
    return this.d;
  }
  
  public boolean s() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/history/q/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */