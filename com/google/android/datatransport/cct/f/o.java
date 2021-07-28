package com.google.android.datatransport.cct.f;

import android.util.SparseArray;

public abstract class o {
  public static a c() {
    return new i.b();
  }
  
  public abstract b a();
  
  public abstract c b();
  
  public static abstract class a {
    public abstract a a(o.b param1b);
    
    public abstract a a(o.c param1c);
    
    public abstract o a();
  }
  
  public enum b {
    c(0),
    d(1),
    e(2),
    f(3),
    g(4),
    h(5),
    i(6),
    j(7),
    k(8),
    l(9),
    m(10),
    n(11),
    o(12),
    p(13),
    q(14),
    r(15),
    s(16),
    t(17),
    u(18),
    v(19),
    w(100);
    
    private static final SparseArray<b> x = new SparseArray();
    
    private final int value;
    
    static {
      x.put(0, c);
      x.put(1, d);
      x.put(2, e);
      x.put(3, f);
      x.put(4, g);
      x.put(5, h);
      x.put(6, i);
      x.put(7, j);
      x.put(8, k);
      x.put(9, l);
      x.put(10, m);
      x.put(11, n);
      x.put(12, o);
      x.put(13, p);
      x.put(14, q);
      x.put(15, r);
      x.put(16, s);
      x.put(17, t);
      x.put(18, u);
      x.put(19, v);
    }
    
    b(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static b f(int param1Int) {
      return (b)x.get(param1Int);
    }
    
    public int a() {
      return this.value;
    }
  }
  
  public enum c {
    c(0),
    d(1),
    e(2),
    f(3),
    g(4),
    h(5),
    i(6),
    j(7),
    k(8),
    l(9),
    m(10),
    n(11),
    o(12),
    p(13),
    q(14),
    r(15),
    s(16),
    t(17),
    u(-1);
    
    private static final SparseArray<c> v = new SparseArray();
    
    private final int value;
    
    static {
      v.put(0, c);
      v.put(1, d);
      v.put(2, e);
      v.put(3, f);
      v.put(4, g);
      v.put(5, h);
      v.put(6, i);
      v.put(7, j);
      v.put(8, k);
      v.put(9, l);
      v.put(10, m);
      v.put(11, n);
      v.put(12, o);
      v.put(13, p);
      v.put(14, q);
      v.put(15, r);
      v.put(16, s);
      v.put(17, t);
      v.put(-1, u);
    }
    
    c(int param1Int1) {
      this.value = param1Int1;
    }
    
    public static c f(int param1Int) {
      return (c)v.get(param1Int);
    }
    
    public int a() {
      return this.value;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */