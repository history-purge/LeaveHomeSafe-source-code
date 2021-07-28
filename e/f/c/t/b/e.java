package e.f.c.t.b;

import e.f.c.f;

public final class e {
  private static final e[] h = h();
  
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final c f;
  
  private final int g;
  
  private e(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, c paramc) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = paramc;
    paramInt3 = paramc.b();
    b[] arrayOfB = paramc.a();
    paramInt4 = arrayOfB.length;
    paramInt1 = 0;
    paramInt2 = 0;
    while (paramInt1 < paramInt4) {
      b b = arrayOfB[paramInt1];
      paramInt2 += b.a() * (b.b() + paramInt3);
      paramInt1++;
    } 
    this.g = paramInt2;
  }
  
  public static e a(int paramInt1, int paramInt2) {
    if ((paramInt1 & 0x1) == 0 && (paramInt2 & 0x1) == 0) {
      for (e e1 : h) {
        if (e1.b == paramInt1 && e1.c == paramInt2)
          return e1; 
      } 
      throw f.a();
    } 
    f f = f.a();
    throw f;
  }
  
  private static e[] h() {
    return new e[] { 
        new e(1, 10, 10, 8, 8, new c(5, new b(1, 3, null), null)), new e(2, 12, 12, 10, 10, new c(7, new b(1, 5, null), null)), new e(3, 14, 14, 12, 12, new c(10, new b(1, 8, null), null)), new e(4, 16, 16, 14, 14, new c(12, new b(1, 12, null), null)), new e(5, 18, 18, 16, 16, new c(14, new b(1, 18, null), null)), new e(6, 20, 20, 18, 18, new c(18, new b(1, 22, null), null)), new e(7, 22, 22, 20, 20, new c(20, new b(1, 30, null), null)), new e(8, 24, 24, 22, 22, new c(24, new b(1, 36, null), null)), new e(9, 26, 26, 24, 24, new c(28, new b(1, 44, null), null)), new e(10, 32, 32, 14, 14, new c(36, new b(1, 62, null), null)), 
        new e(11, 36, 36, 16, 16, new c(42, new b(1, 86, null), null)), new e(12, 40, 40, 18, 18, new c(48, new b(1, 114, null), null)), new e(13, 44, 44, 20, 20, new c(56, new b(1, 144, null), null)), new e(14, 48, 48, 22, 22, new c(68, new b(1, 174, null), null)), new e(15, 52, 52, 24, 24, new c(42, new b(2, 102, null), null)), new e(16, 64, 64, 14, 14, new c(56, new b(2, 140, null), null)), new e(17, 72, 72, 16, 16, new c(36, new b(4, 92, null), null)), new e(18, 80, 80, 18, 18, new c(48, new b(4, 114, null), null)), new e(19, 88, 88, 20, 20, new c(56, new b(4, 144, null), null)), new e(20, 96, 96, 22, 22, new c(68, new b(4, 174, null), null)), 
        new e(21, 104, 104, 24, 24, new c(56, new b(6, 136, null), null)), new e(22, 120, 120, 18, 18, new c(68, new b(6, 175, null), null)), new e(23, 132, 132, 20, 20, new c(62, new b(8, 163, null), null)), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156, null), new b(2, 155, null), null)), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5, null), null)), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10, null), null)), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16, null), null)), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22, null), null)), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32, null), null)), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49, null), null)) };
  }
  
  public int a() {
    return this.e;
  }
  
  public int b() {
    return this.d;
  }
  
  c c() {
    return this.f;
  }
  
  public int d() {
    return this.c;
  }
  
  public int e() {
    return this.b;
  }
  
  public int f() {
    return this.g;
  }
  
  public int g() {
    return this.a;
  }
  
  public String toString() {
    return String.valueOf(this.a);
  }
  
  static final class b {
    private final int a;
    
    private final int b;
    
    private b(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
    
    int a() {
      return this.a;
    }
    
    int b() {
      return this.b;
    }
  }
  
  static final class c {
    private final int a;
    
    private final e.b[] b;
    
    private c(int param1Int, e.b param1b) {
      this.a = param1Int;
      this.b = new e.b[] { param1b };
    }
    
    private c(int param1Int, e.b param1b1, e.b param1b2) {
      this.a = param1Int;
      this.b = new e.b[] { param1b1, param1b2 };
    }
    
    e.b[] a() {
      return this.b;
    }
    
    int b() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/t/b/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */