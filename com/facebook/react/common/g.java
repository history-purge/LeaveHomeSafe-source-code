package com.facebook.react.common;

import e.e.m.a.a;

public class g {
  private Thread a = null;
  
  public void a() {
    boolean bool;
    Thread thread = Thread.currentThread();
    if (this.a == null)
      this.a = thread; 
    if (this.a == thread) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/common/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */