package com.facebook.react.views.scroll;

import android.os.SystemClock;

public class b {
  private int a = Integer.MIN_VALUE;
  
  private int b = Integer.MIN_VALUE;
  
  private float c = 0.0F;
  
  private float d = 0.0F;
  
  private long e = -11L;
  
  public float a() {
    return this.c;
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    boolean bool;
    long l1 = SystemClock.uptimeMillis();
    if (l1 - this.e > 10L || this.a != paramInt1 || this.b != paramInt2) {
      bool = true;
    } else {
      bool = false;
    } 
    long l2 = this.e;
    if (l1 - l2 != 0L) {
      this.c = (paramInt1 - this.a) / (float)(l1 - l2);
      this.d = (paramInt2 - this.b) / (float)(l1 - l2);
    } 
    this.e = l1;
    this.a = paramInt1;
    this.b = paramInt2;
    return bool;
  }
  
  public float b() {
    return this.d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */