package com.facebook.imagepipeline.memory;

import e.e.e.g.c;
import e.e.e.g.d;

public class e0 {
  private final g0 a;
  
  private final h0 b;
  
  private final g0 c;
  
  private final c d;
  
  private final g0 e;
  
  private final h0 f;
  
  private final g0 g;
  
  private final h0 h;
  
  private final String i;
  
  private final int j;
  
  private final int k;
  
  private final boolean l;
  
  private e0(b paramb) {
    int i;
    g0 g04;
    h0 h03;
    g0 g03;
    c c1;
    g0 g02;
    h0 h02;
    g0 g01;
    h0 h01;
    String str;
    if (e.e.l.p.b.c())
      e.e.l.p.b.a("PoolConfig()"); 
    if (b.a(paramb) == null) {
      g04 = k.a();
    } else {
      g04 = b.a(paramb);
    } 
    this.a = g04;
    if (b.b(paramb) == null) {
      h03 = b0.c();
    } else {
      h03 = b.b(paramb);
    } 
    this.b = h03;
    if (b.e(paramb) == null) {
      g03 = m.a();
    } else {
      g03 = b.e(paramb);
    } 
    this.c = g03;
    if (b.f(paramb) == null) {
      d d = d.a();
    } else {
      c1 = b.f(paramb);
    } 
    this.d = c1;
    if (b.g(paramb) == null) {
      g02 = n.a();
    } else {
      g02 = b.g(paramb);
    } 
    this.e = g02;
    if (b.h(paramb) == null) {
      h02 = b0.c();
    } else {
      h02 = b.h(paramb);
    } 
    this.f = h02;
    if (b.i(paramb) == null) {
      g01 = l.a();
    } else {
      g01 = b.i(paramb);
    } 
    this.g = g01;
    if (b.j(paramb) == null) {
      h01 = b0.c();
    } else {
      h01 = b.j(paramb);
    } 
    this.h = h01;
    if (b.k(paramb) == null) {
      str = "legacy";
    } else {
      str = b.k(paramb);
    } 
    this.i = str;
    this.j = b.l(paramb);
    if (b.c(paramb) > 0) {
      i = b.c(paramb);
    } else {
      i = 4194304;
    } 
    this.k = i;
    this.l = b.d(paramb);
    if (e.e.l.p.b.c())
      e.e.l.p.b.a(); 
  }
  
  public static b m() {
    return new b(null);
  }
  
  public int a() {
    return this.k;
  }
  
  public int b() {
    return this.j;
  }
  
  public g0 c() {
    return this.a;
  }
  
  public h0 d() {
    return this.b;
  }
  
  public String e() {
    return this.i;
  }
  
  public g0 f() {
    return this.c;
  }
  
  public g0 g() {
    return this.e;
  }
  
  public h0 h() {
    return this.f;
  }
  
  public c i() {
    return this.d;
  }
  
  public g0 j() {
    return this.g;
  }
  
  public h0 k() {
    return this.h;
  }
  
  public boolean l() {
    return this.l;
  }
  
  public static class b {
    private g0 a;
    
    private h0 b;
    
    private g0 c;
    
    private c d;
    
    private g0 e;
    
    private h0 f;
    
    private g0 g;
    
    private h0 h;
    
    private String i;
    
    private int j;
    
    private int k;
    
    private boolean l;
    
    private b() {}
    
    public e0 a() {
      return new e0(this, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/e0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */