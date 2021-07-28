package com.facebook.imagepipeline.memory;

import e.e.e.d.i;
import e.e.e.e.a;
import java.util.LinkedList;
import java.util.Queue;

class f<V> {
  public final int a;
  
  public final int b;
  
  final Queue c;
  
  private final boolean d;
  
  private int e;
  
  public f(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    boolean bool1;
    boolean bool2 = true;
    if (paramInt1 > 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.b(bool1);
    if (paramInt2 >= 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.b(bool1);
    if (paramInt3 >= 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.b(bool1);
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = new LinkedList();
    this.e = paramInt3;
    this.d = paramBoolean;
  }
  
  public void a() {
    boolean bool;
    if (this.e > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i.b(bool);
    this.e--;
  }
  
  void a(V paramV) {
    this.c.add(paramV);
  }
  
  @Deprecated
  public V b() {
    V v = f();
    if (v != null)
      this.e++; 
    return v;
  }
  
  public void b(V paramV) {
    int i;
    i.a(paramV);
    boolean bool1 = this.d;
    boolean bool = false;
    if (bool1) {
      if (this.e > 0)
        bool = true; 
      i.b(bool);
      i = this.e;
    } else {
      i = this.e;
      if (i <= 0) {
        a.a("BUCKET", "Tried to release value %s from an empty bucket!", new Object[] { paramV });
        return;
      } 
    } 
    this.e = i - 1;
    a(paramV);
  }
  
  int c() {
    return this.c.size();
  }
  
  public void d() {
    this.e++;
  }
  
  public boolean e() {
    return (this.e + c() > this.b);
  }
  
  public V f() {
    return this.c.poll();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */