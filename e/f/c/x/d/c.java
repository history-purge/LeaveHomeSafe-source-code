package e.f.c.x.d;

import e.f.c.j;
import e.f.c.p;
import e.f.c.s.b;

final class c {
  private final b a;
  
  private final p b;
  
  private final p c;
  
  private final p d;
  
  private final p e;
  
  private final int f;
  
  private final int g;
  
  private final int h;
  
  private final int i;
  
  c(b paramb, p paramp1, p paramp2, p paramp3, p paramp4) {
    boolean bool1;
    boolean bool2 = false;
    if (paramp1 == null || paramp2 == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramp3 == null || paramp4 == null)
      bool2 = true; 
    if (!bool1 || !bool2) {
      p p1;
      p p2;
      if (bool1) {
        p1 = new p(0.0F, paramp3.b());
        p2 = new p(0.0F, paramp4.b());
      } else {
        p1 = paramp1;
        p2 = paramp2;
        if (bool2) {
          paramp3 = new p((paramb.f() - 1), paramp1.b());
          paramp4 = new p((paramb.f() - 1), paramp2.b());
          p2 = paramp2;
          p1 = paramp1;
        } 
      } 
      this.a = paramb;
      this.b = p1;
      this.c = p2;
      this.d = paramp3;
      this.e = paramp4;
      this.f = (int)Math.min(p1.a(), p2.a());
      this.g = (int)Math.max(paramp3.a(), paramp4.a());
      this.h = (int)Math.min(p1.b(), paramp3.b());
      this.i = (int)Math.max(p2.b(), paramp4.b());
      return;
    } 
    throw j.a();
  }
  
  c(c paramc) {
    this.a = paramc.a;
    this.b = paramc.g();
    this.c = paramc.a();
    this.d = paramc.h();
    this.e = paramc.b();
    this.f = paramc.e();
    this.g = paramc.c();
    this.h = paramc.f();
    this.i = paramc.d();
  }
  
  static c a(c paramc1, c paramc2) {
    return (paramc1 == null) ? paramc2 : ((paramc2 == null) ? paramc1 : new c(paramc1.a, paramc1.b, paramc1.c, paramc2.d, paramc2.e));
  }
  
  p a() {
    return this.c;
  }
  
  c a(int paramInt1, int paramInt2, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Le/f/c/p;
    //   4: astore #5
    //   6: aload_0
    //   7: getfield c : Le/f/c/p;
    //   10: astore #6
    //   12: aload_0
    //   13: getfield d : Le/f/c/p;
    //   16: astore #7
    //   18: aload_0
    //   19: getfield e : Le/f/c/p;
    //   22: astore #9
    //   24: iload_1
    //   25: ifle -> 97
    //   28: iload_3
    //   29: ifeq -> 39
    //   32: aload #5
    //   34: astore #8
    //   36: goto -> 43
    //   39: aload #7
    //   41: astore #8
    //   43: aload #8
    //   45: invokevirtual b : ()F
    //   48: f2i
    //   49: iload_1
    //   50: isub
    //   51: istore #4
    //   53: iload #4
    //   55: istore_1
    //   56: iload #4
    //   58: ifge -> 63
    //   61: iconst_0
    //   62: istore_1
    //   63: new e/f/c/p
    //   66: dup
    //   67: aload #8
    //   69: invokevirtual a : ()F
    //   72: iload_1
    //   73: i2f
    //   74: invokespecial <init> : (FF)V
    //   77: astore #8
    //   79: iload_3
    //   80: ifeq -> 90
    //   83: aload #8
    //   85: astore #5
    //   87: goto -> 97
    //   90: aload #5
    //   92: astore #7
    //   94: goto -> 105
    //   97: aload #7
    //   99: astore #8
    //   101: aload #5
    //   103: astore #7
    //   105: iload_2
    //   106: ifle -> 190
    //   109: iload_3
    //   110: ifeq -> 122
    //   113: aload_0
    //   114: getfield c : Le/f/c/p;
    //   117: astore #5
    //   119: goto -> 128
    //   122: aload_0
    //   123: getfield e : Le/f/c/p;
    //   126: astore #5
    //   128: aload #5
    //   130: invokevirtual b : ()F
    //   133: f2i
    //   134: iload_2
    //   135: iadd
    //   136: istore_2
    //   137: iload_2
    //   138: istore_1
    //   139: iload_2
    //   140: aload_0
    //   141: getfield a : Le/f/c/s/b;
    //   144: invokevirtual c : ()I
    //   147: if_icmplt -> 160
    //   150: aload_0
    //   151: getfield a : Le/f/c/s/b;
    //   154: invokevirtual c : ()I
    //   157: iconst_1
    //   158: isub
    //   159: istore_1
    //   160: new e/f/c/p
    //   163: dup
    //   164: aload #5
    //   166: invokevirtual a : ()F
    //   169: iload_1
    //   170: i2f
    //   171: invokespecial <init> : (FF)V
    //   174: astore #5
    //   176: iload_3
    //   177: ifeq -> 183
    //   180: goto -> 194
    //   183: aload #5
    //   185: astore #9
    //   187: goto -> 198
    //   190: aload #6
    //   192: astore #5
    //   194: aload #5
    //   196: astore #6
    //   198: new e/f/c/x/d/c
    //   201: dup
    //   202: aload_0
    //   203: getfield a : Le/f/c/s/b;
    //   206: aload #7
    //   208: aload #6
    //   210: aload #8
    //   212: aload #9
    //   214: invokespecial <init> : (Le/f/c/s/b;Le/f/c/p;Le/f/c/p;Le/f/c/p;Le/f/c/p;)V
    //   217: areturn
  }
  
  p b() {
    return this.e;
  }
  
  int c() {
    return this.g;
  }
  
  int d() {
    return this.i;
  }
  
  int e() {
    return this.f;
  }
  
  int f() {
    return this.h;
  }
  
  p g() {
    return this.b;
  }
  
  p h() {
    return this.d;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */