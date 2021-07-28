package com.facebook.imagepipeline.memory;

import e.e.e.d.i;
import e.e.e.g.a;
import e.e.e.g.c;
import e.e.e.g.h;
import e.e.e.g.k;

public class f0 {
  private final e0 a;
  
  private d b;
  
  private j c;
  
  private q d;
  
  private a0 e;
  
  private h f;
  
  private k g;
  
  private a h;
  
  public f0(e0 parame0) {
    i.a(parame0);
    this.a = parame0;
  }
  
  private v b(int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return b(); 
      throw new IllegalArgumentException("Invalid MemoryChunkType");
    } 
    return e();
  }
  
  public d a() {
    if (this.b == null) {
      o o;
      String str = this.a.e();
      int i = -1;
      switch (str.hashCode()) {
        case 95945896:
          if (str.equals("dummy"))
            i = 0; 
          break;
        case -402149703:
          if (str.equals("dummy_with_tracking"))
            i = 1; 
          break;
        case -404562712:
          if (str.equals("experimental"))
            i = 2; 
          break;
        case -1106578487:
          if (str.equals("legacy"))
            i = 4; 
          break;
        case -1868884870:
          if (str.equals("legacy_default_params"))
            i = 3; 
          break;
      } 
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              h h1 = new h(this.a.i(), this.a.c(), this.a.d());
            } else {
              h h1 = new h(this.a.i(), k.a(), this.a.d());
            } 
          } else {
            i = this.a.b();
            int m = this.a.a();
            b0 b0 = b0.c();
            if (this.a.l()) {
              c c = this.a.i();
            } else {
              str = null;
            } 
            s s = new s(i, m, b0, (c)str);
          } 
        } else {
          p p = new p();
        } 
      } else {
        o = new o();
      } 
      this.b = o;
    } 
    return this.b;
  }
  
  public h a(int paramInt) {
    if (this.f == null)
      this.f = new y(b(paramInt), g()); 
    return this.f;
  }
  
  public j b() {
    if (this.c == null)
      this.c = new j(this.a.i(), this.a.g(), this.a.h()); 
    return this.c;
  }
  
  public q c() {
    if (this.d == null)
      this.d = new q(this.a.i(), this.a.f()); 
    return this.d;
  }
  
  public int d() {
    return (this.a.f()).e;
  }
  
  public a0 e() {
    if (this.e == null)
      this.e = new a0(this.a.i(), this.a.g(), this.a.h()); 
    return this.e;
  }
  
  public h f() {
    return a(0);
  }
  
  public k g() {
    if (this.g == null)
      this.g = new k(h()); 
    return this.g;
  }
  
  public a h() {
    if (this.h == null)
      this.h = new r(this.a.i(), this.a.j(), this.a.k()); 
    return this.h;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */