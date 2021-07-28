package net.time4j.calendar;

import net.time4j.c1.c;

public abstract class j {
  public static j a(int paramInt) {
    if (paramInt >= 1)
      return b(c.c(paramInt, -2333)); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Dangi year must not be smaller than 1: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static j b(int paramInt) {
    return new a(paramInt);
  }
  
  public final int a() {
    return c.a(b() + 1 - 1, 60) + 1;
  }
  
  public abstract int b();
  
  public final c c() {
    int k = c.b(b() + 1, 60);
    int i = k;
    if (k == 0)
      i = 60; 
    return c.g(i);
  }
  
  static final class a extends j {
    a(int param1Int) {}
    
    public int b() {
      return c.c(this.a, 2636);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */