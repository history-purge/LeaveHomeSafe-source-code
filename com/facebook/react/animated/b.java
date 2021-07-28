package com.facebook.react.animated;

import e.e.m.a.a;
import java.util.ArrayList;
import java.util.List;

abstract class b {
  List<b> a;
  
  int b = 0;
  
  int c = 0;
  
  int d = -1;
  
  public void a() {}
  
  public final void a(b paramb) {
    if (this.a == null)
      this.a = new ArrayList<b>(1); 
    List<b> list = this.a;
    a.a(list);
    list.add(paramb);
    paramb.b(this);
  }
  
  public void b(b paramb) {}
  
  public void c(b paramb) {}
  
  public final void d(b paramb) {
    if (this.a == null)
      return; 
    paramb.c(this);
    this.a.remove(paramb);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */