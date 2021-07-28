package com.google.android.gms.vision.clearcut;

public final class b {
  private final long a = Math.round(30000.0D);
  
  private final Object b = new Object();
  
  private long c = Long.MIN_VALUE;
  
  public b(double paramDouble) {}
  
  public final boolean a() {
    synchronized (this.b) {
      long l = System.currentTimeMillis();
      if (this.c + this.a > l)
        return false; 
      this.c = l;
      return true;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/clearcut/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */