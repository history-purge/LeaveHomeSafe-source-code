package com.facebook.react.uimanager.events;

import com.facebook.react.common.i;

public abstract class c<T extends c> {
  private static int e;
  
  private boolean a;
  
  private int b;
  
  private long c;
  
  private int d;
  
  protected c() {
    int i = e;
    e = i + 1;
    this.d = i;
  }
  
  protected c(int paramInt) {
    int i = e;
    e = i + 1;
    this.d = i;
    a(paramInt);
  }
  
  public T a(T paramT) {
    c c1;
    T t = paramT;
    if (e() >= paramT.e())
      c1 = this; 
    return (T)c1;
  }
  
  protected void a(int paramInt) {
    this.b = paramInt;
    this.c = i.c();
    this.a = true;
  }
  
  public abstract void a(RCTEventEmitter paramRCTEventEmitter);
  
  public boolean a() {
    return true;
  }
  
  final void b() {
    this.a = false;
    i();
  }
  
  public short c() {
    return 0;
  }
  
  public abstract String d();
  
  public final long e() {
    return this.c;
  }
  
  public int f() {
    return this.d;
  }
  
  public final int g() {
    return this.b;
  }
  
  boolean h() {
    return this.a;
  }
  
  public void i() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */