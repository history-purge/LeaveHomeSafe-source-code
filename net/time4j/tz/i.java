package net.time4j.tz;

import net.time4j.c1.f;

class i implements f {
  private final long c;
  
  private final int d;
  
  private i(long paramLong, int paramInt) {
    this.c = paramLong;
    this.d = paramInt;
  }
  
  static f a(long paramLong, int paramInt) {
    long l = paramLong;
    if (paramInt == 0)
      l = paramLong - 1L; 
    if (paramInt == 0) {
      paramInt = 999999999;
    } else {
      paramInt--;
    } 
    return new i(l, paramInt);
  }
  
  public int a() {
    return this.d;
  }
  
  public long b() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */