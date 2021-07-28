package net.time4j.e1;

import net.time4j.d1.y;

public enum e implements y {
  d(0),
  e(1),
  f(2),
  g(3);
  
  private static e[] h;
  
  private final transient int c;
  
  static {
    h = values();
  }
  
  e(int paramInt1) {
    this.c = paramInt1;
  }
  
  public static e f(int paramInt) {
    for (e e1 : h) {
      if (e1.a() == paramInt)
        return e1; 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown format style: ");
    stringBuilder.append(paramInt);
    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(stringBuilder.toString());
    throw unsupportedOperationException;
  }
  
  public int a() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */