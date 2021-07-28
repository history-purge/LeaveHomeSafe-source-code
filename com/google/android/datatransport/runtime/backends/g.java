package com.google.android.datatransport.runtime.backends;

public abstract class g {
  public static g a(long paramLong) {
    return new b(a.c, paramLong);
  }
  
  public static g c() {
    return new b(a.e, -1L);
  }
  
  public static g d() {
    return new b(a.d, -1L);
  }
  
  public abstract long a();
  
  public abstract a b();
  
  public enum a {
    c, d, e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/backends/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */