package e.f.c.r.d;

import e.f.c.j;
import e.f.c.p;
import e.f.c.s.b;
import e.f.c.s.i;
import e.f.c.s.m.b;
import e.f.c.s.n.c;
import e.f.c.s.n.d;

public final class a {
  private static final int[] g = new int[] { 3808, 476, 2107, 1799 };
  
  private final b a;
  
  private boolean b;
  
  private int c;
  
  private int d;
  
  private int e;
  
  private int f;
  
  public a(b paramb) {
    this.a = paramb;
  }
  
  private static float a(p paramp1, p paramp2) {
    return e.f.c.s.m.a.a(paramp1.a(), paramp1.b(), paramp2.a(), paramp2.b());
  }
  
  private static float a(a parama1, a parama2) {
    return e.f.c.s.m.a.a(parama1.a(), parama1.b(), parama2.a(), parama2.b());
  }
  
  private int a() {
    if (this.b)
      return this.c * 4 + 11; 
    int i = this.c;
    return (i <= 4) ? (i * 4 + 15) : (i * 4 + ((i - 4) / 8 + 1) * 2 + 15);
  }
  
  private static int a(long paramLong, boolean paramBoolean) {
    byte b1;
    int i;
    if (paramBoolean) {
      i = 7;
      b1 = 2;
    } else {
      i = 10;
      b1 = 4;
    } 
    int[] arrayOfInt = new int[i];
    int j;
    for (j = i - 1; j >= 0; j--) {
      arrayOfInt[j] = (int)paramLong & 0xF;
      paramLong >>= 4L;
    } 
    try {
      (new c(e.f.c.s.n.a.k)).a(arrayOfInt, i - b1);
      i = 0;
      j = 0;
      while (i < b1) {
        j = (j << 4) + arrayOfInt[i];
        i++;
      } 
      return j;
    } catch (d d) {
      j j1 = j.a();
      throw j1;
    } 
  }
  
  private int a(p paramp1, p paramp2, int paramInt) {
    float f4 = a(paramp1, paramp2);
    float f5 = f4 / paramInt;
    float f1 = paramp1.a();
    float f2 = paramp1.b();
    float f3 = (paramp2.a() - paramp1.a()) * f5 / f4;
    f4 = f5 * (paramp2.b() - paramp1.b()) / f4;
    int i = 0;
    int j;
    for (j = 0; i < paramInt; j = k) {
      b b1 = this.a;
      f5 = i;
      int k = j;
      if (b1.b(e.f.c.s.m.a.a(f5 * f3 + f1), e.f.c.s.m.a.a(f5 * f4 + f2)))
        k = j | 1 << paramInt - i - 1; 
      i++;
    } 
    return j;
  }
  
  private static int a(int[] paramArrayOfint, int paramInt) {
    int m = paramArrayOfint.length;
    boolean bool = false;
    int k = 0;
    int i = 0;
    while (k < m) {
      int n = paramArrayOfint[k];
      i = (i << 3) + (n >> paramInt - 2 << 1) + (n & 0x1);
      k++;
    } 
    for (paramInt = bool; paramInt < 4; paramInt++) {
      if (Integer.bitCount(g[paramInt] ^ ((i & 0x1) << 11) + (i >> 1)) <= 2)
        return paramInt; 
    } 
    j j = j.a();
    throw j;
  }
  
  private a a(a parama, boolean paramBoolean, int paramInt1, int paramInt2) {
    int i = parama.a() + paramInt1;
    int j = parama.b();
    while (true) {
      j += paramInt2;
      if (a(i, j) && this.a.b(i, j) == paramBoolean) {
        i += paramInt1;
        continue;
      } 
      break;
    } 
    i -= paramInt1;
    j -= paramInt2;
    while (a(i, j) && this.a.b(i, j) == paramBoolean)
      i += paramInt1; 
    i -= paramInt1;
    for (paramInt1 = j; a(i, paramInt1) && this.a.b(i, paramInt1) == paramBoolean; paramInt1 += paramInt2);
    return new a(i, paramInt1 - paramInt2);
  }
  
  private b a(b paramb, p paramp1, p paramp2, p paramp3, p paramp4) {
    i i1 = i.a();
    int i = a();
    float f2 = i / 2.0F;
    int j = this.e;
    float f1 = f2 - j;
    f2 += j;
    return i1.a(paramb, i, i, f1, f1, f2, f1, f2, f2, f1, f2, paramp1.a(), paramp1.b(), paramp2.a(), paramp2.b(), paramp3.a(), paramp3.b(), paramp4.a(), paramp4.b());
  }
  
  private void a(p[] paramArrayOfp) {
    int i = 0;
    if (a(paramArrayOfp[0]) && a(paramArrayOfp[1]) && a(paramArrayOfp[2]) && a(paramArrayOfp[3])) {
      int k = this.e * 2;
      int[] arrayOfInt = new int[4];
      arrayOfInt[0] = a(paramArrayOfp[0], paramArrayOfp[1], k);
      arrayOfInt[1] = a(paramArrayOfp[1], paramArrayOfp[2], k);
      arrayOfInt[2] = a(paramArrayOfp[2], paramArrayOfp[3], k);
      arrayOfInt[3] = a(paramArrayOfp[3], paramArrayOfp[0], k);
      this.f = a(arrayOfInt, k);
      long l = 0L;
      while (i < 4) {
        long l1;
        k = arrayOfInt[(this.f + i) % 4];
        if (this.b) {
          l <<= 7L;
          l1 = (k >> 1 & 0x7F);
        } else {
          l <<= 10L;
          l1 = ((k >> 2 & 0x3E0) + (k >> 1 & 0x1F));
        } 
        l += l1;
        i++;
      } 
      i = a(l, this.b);
      if (this.b) {
        this.c = (i >> 6) + 1;
        i &= 0x3F;
      } else {
        this.c = (i >> 11) + 1;
        i &= 0x7FF;
      } 
      this.d = i + 1;
      return;
    } 
    j j = j.a();
    throw j;
  }
  
  private boolean a(int paramInt1, int paramInt2) {
    return (paramInt1 >= 0 && paramInt1 < this.a.f() && paramInt2 > 0 && paramInt2 < this.a.c());
  }
  
  private boolean a(p paramp) {
    return a(e.f.c.s.m.a.a(paramp.a()), e.f.c.s.m.a.a(paramp.b()));
  }
  
  private boolean a(a parama1, a parama2, a parama3, a parama4) {
    parama1 = new a(parama1.a() - 3, parama1.b() + 3);
    parama2 = new a(parama2.a() - 3, parama2.b() - 3);
    parama3 = new a(parama3.a() + 3, parama3.b() - 3);
    parama4 = new a(parama4.a() + 3, parama4.b() + 3);
    int i = b(parama4, parama1);
    return (i == 0) ? false : ((b(parama1, parama2) != i) ? false : ((b(parama2, parama3) != i) ? false : ((b(parama3, parama4) == i))));
  }
  
  private p[] a(a parama) {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield e : I
    //   5: aload_1
    //   6: astore #6
    //   8: aload #6
    //   10: astore #7
    //   12: aload #7
    //   14: astore #8
    //   16: iconst_1
    //   17: istore #5
    //   19: aload_0
    //   20: getfield e : I
    //   23: bipush #9
    //   25: if_icmpge -> 178
    //   28: aload_0
    //   29: aload_1
    //   30: iload #5
    //   32: iconst_1
    //   33: iconst_m1
    //   34: invokespecial a : (Le/f/c/r/d/a$a;ZII)Le/f/c/r/d/a$a;
    //   37: astore #11
    //   39: aload_0
    //   40: aload #6
    //   42: iload #5
    //   44: iconst_1
    //   45: iconst_1
    //   46: invokespecial a : (Le/f/c/r/d/a$a;ZII)Le/f/c/r/d/a$a;
    //   49: astore #10
    //   51: aload_0
    //   52: aload #7
    //   54: iload #5
    //   56: iconst_m1
    //   57: iconst_1
    //   58: invokespecial a : (Le/f/c/r/d/a$a;ZII)Le/f/c/r/d/a$a;
    //   61: astore #9
    //   63: aload_0
    //   64: aload #8
    //   66: iload #5
    //   68: iconst_m1
    //   69: iconst_m1
    //   70: invokespecial a : (Le/f/c/r/d/a$a;ZII)Le/f/c/r/d/a$a;
    //   73: astore #12
    //   75: aload_0
    //   76: getfield e : I
    //   79: iconst_2
    //   80: if_icmple -> 144
    //   83: aload #12
    //   85: aload #11
    //   87: invokestatic a : (Le/f/c/r/d/a$a;Le/f/c/r/d/a$a;)F
    //   90: aload_0
    //   91: getfield e : I
    //   94: i2f
    //   95: fmul
    //   96: aload #8
    //   98: aload_1
    //   99: invokestatic a : (Le/f/c/r/d/a$a;Le/f/c/r/d/a$a;)F
    //   102: aload_0
    //   103: getfield e : I
    //   106: iconst_2
    //   107: iadd
    //   108: i2f
    //   109: fmul
    //   110: fdiv
    //   111: f2d
    //   112: dstore_2
    //   113: dload_2
    //   114: ldc2_w 0.75
    //   117: dcmpg
    //   118: iflt -> 178
    //   121: dload_2
    //   122: ldc2_w 1.25
    //   125: dcmpl
    //   126: ifgt -> 178
    //   129: aload_0
    //   130: aload #11
    //   132: aload #10
    //   134: aload #9
    //   136: aload #12
    //   138: invokespecial a : (Le/f/c/r/d/a$a;Le/f/c/r/d/a$a;Le/f/c/r/d/a$a;Le/f/c/r/d/a$a;)Z
    //   141: ifeq -> 178
    //   144: iload #5
    //   146: iconst_1
    //   147: ixor
    //   148: istore #5
    //   150: aload_0
    //   151: aload_0
    //   152: getfield e : I
    //   155: iconst_1
    //   156: iadd
    //   157: putfield e : I
    //   160: aload #12
    //   162: astore #8
    //   164: aload #11
    //   166: astore_1
    //   167: aload #10
    //   169: astore #6
    //   171: aload #9
    //   173: astore #7
    //   175: goto -> 19
    //   178: aload_0
    //   179: getfield e : I
    //   182: istore #4
    //   184: iload #4
    //   186: iconst_5
    //   187: if_icmpeq -> 204
    //   190: iload #4
    //   192: bipush #7
    //   194: if_icmpne -> 200
    //   197: goto -> 204
    //   200: invokestatic a : ()Le/f/c/j;
    //   203: athrow
    //   204: aload_0
    //   205: getfield e : I
    //   208: iconst_5
    //   209: if_icmpne -> 218
    //   212: iconst_1
    //   213: istore #5
    //   215: goto -> 221
    //   218: iconst_0
    //   219: istore #5
    //   221: aload_0
    //   222: iload #5
    //   224: putfield b : Z
    //   227: new e/f/c/p
    //   230: dup
    //   231: aload_1
    //   232: invokevirtual a : ()I
    //   235: i2f
    //   236: ldc 0.5
    //   238: fadd
    //   239: aload_1
    //   240: invokevirtual b : ()I
    //   243: i2f
    //   244: ldc 0.5
    //   246: fsub
    //   247: invokespecial <init> : (FF)V
    //   250: astore_1
    //   251: new e/f/c/p
    //   254: dup
    //   255: aload #6
    //   257: invokevirtual a : ()I
    //   260: i2f
    //   261: ldc 0.5
    //   263: fadd
    //   264: aload #6
    //   266: invokevirtual b : ()I
    //   269: i2f
    //   270: ldc 0.5
    //   272: fadd
    //   273: invokespecial <init> : (FF)V
    //   276: astore #6
    //   278: new e/f/c/p
    //   281: dup
    //   282: aload #7
    //   284: invokevirtual a : ()I
    //   287: i2f
    //   288: ldc 0.5
    //   290: fsub
    //   291: aload #7
    //   293: invokevirtual b : ()I
    //   296: i2f
    //   297: ldc 0.5
    //   299: fadd
    //   300: invokespecial <init> : (FF)V
    //   303: astore #7
    //   305: new e/f/c/p
    //   308: dup
    //   309: aload #8
    //   311: invokevirtual a : ()I
    //   314: i2f
    //   315: ldc 0.5
    //   317: fsub
    //   318: aload #8
    //   320: invokevirtual b : ()I
    //   323: i2f
    //   324: ldc 0.5
    //   326: fsub
    //   327: invokespecial <init> : (FF)V
    //   330: astore #8
    //   332: aload_0
    //   333: getfield e : I
    //   336: istore #4
    //   338: iconst_4
    //   339: anewarray e/f/c/p
    //   342: dup
    //   343: iconst_0
    //   344: aload_1
    //   345: aastore
    //   346: dup
    //   347: iconst_1
    //   348: aload #6
    //   350: aastore
    //   351: dup
    //   352: iconst_2
    //   353: aload #7
    //   355: aastore
    //   356: dup
    //   357: iconst_3
    //   358: aload #8
    //   360: aastore
    //   361: iload #4
    //   363: iconst_2
    //   364: imul
    //   365: iconst_3
    //   366: isub
    //   367: iload #4
    //   369: iconst_2
    //   370: imul
    //   371: invokestatic a : ([Le/f/c/p;II)[Le/f/c/p;
    //   374: areturn
  }
  
  private static p[] a(p[] paramArrayOfp, int paramInt1, int paramInt2) {
    float f1 = paramInt2 / paramInt1 * 2.0F;
    float f6 = paramArrayOfp[0].a();
    float f7 = paramArrayOfp[2].a();
    float f4 = paramArrayOfp[0].b();
    float f5 = paramArrayOfp[2].b();
    float f2 = (paramArrayOfp[0].a() + paramArrayOfp[2].a()) / 2.0F;
    float f3 = (paramArrayOfp[0].b() + paramArrayOfp[2].b()) / 2.0F;
    f6 = (f6 - f7) * f1;
    f4 = (f4 - f5) * f1;
    p p1 = new p(f2 + f6, f3 + f4);
    p p2 = new p(f2 - f6, f3 - f4);
    f6 = paramArrayOfp[1].a();
    f7 = paramArrayOfp[3].a();
    f4 = paramArrayOfp[1].b();
    f5 = paramArrayOfp[3].b();
    f2 = (paramArrayOfp[1].a() + paramArrayOfp[3].a()) / 2.0F;
    f3 = (paramArrayOfp[1].b() + paramArrayOfp[3].b()) / 2.0F;
    f6 = (f6 - f7) * f1;
    f1 *= f4 - f5;
    return new p[] { p1, new p(f2 + f6, f3 + f1), p2, new p(f2 - f6, f3 - f1) };
  }
  
  private int b(a parama1, a parama2) {
    float f3 = a(parama1, parama2);
    float f4 = (parama2.a() - parama1.a()) / f3;
    float f5 = (parama2.b() - parama1.b()) / f3;
    float f1 = parama1.a();
    float f2 = parama1.b();
    boolean bool2 = this.a.b(parama1.a(), parama1.b());
    int k = (int)Math.ceil(f3);
    boolean bool1 = false;
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      f1 += f4;
      f2 += f5;
      int m = j;
      if (this.a.b(e.f.c.s.m.a.a(f1), e.f.c.s.m.a.a(f2)) != bool2)
        m = j + 1; 
      i++;
    } 
    f1 = j / f3;
    if (f1 > 0.1F && f1 < 0.9F)
      return 0; 
    if (f1 <= 0.1F)
      bool1 = true; 
    return (bool1 == bool2) ? 1 : -1;
  }
  
  private a b() {
    p p1;
    p p2;
    p p3;
    p p4;
    try {
      p[] arrayOfP = (new b(this.a)).a();
      p2 = arrayOfP[0];
      p3 = arrayOfP[1];
      p4 = arrayOfP[2];
      p1 = arrayOfP[3];
    } catch (j j1) {
      int m = this.a.f() / 2;
      int i1 = this.a.c() / 2;
      int n = m + 7;
      int k = i1 - 7;
      p1 = a(new a(n, k), false, 1, -1).c();
      i1 += 7;
      p3 = a(new a(n, i1), false, 1, 1).c();
      m -= 7;
      p4 = a(new a(m, i1), false, -1, 1).c();
      p p = a(new a(m, k), false, -1, -1).c();
      p2 = p1;
      p1 = p;
    } 
    int i = e.f.c.s.m.a.a((p2.a() + p1.a() + p3.a() + p4.a()) / 4.0F);
    int j = e.f.c.s.m.a.a((p2.b() + p1.b() + p3.b() + p4.b()) / 4.0F);
    try {
      p[] arrayOfP = (new b(this.a, 15, i, j)).a();
      p3 = arrayOfP[0];
      p4 = arrayOfP[1];
      p2 = arrayOfP[2];
      p p = arrayOfP[3];
    } catch (j j1) {
      int m = i + 7;
      int k = j - 7;
      p3 = a(new a(m, k), false, 1, -1).c();
      j += 7;
      p4 = a(new a(m, j), false, 1, 1).c();
      i -= 7;
      p2 = a(new a(i, j), false, -1, 1).c();
      p p = a(new a(i, k), false, -1, -1).c();
    } 
  }
  
  private p[] b(p[] paramArrayOfp) {
    return a(paramArrayOfp, this.e * 2, a());
  }
  
  public e.f.c.r.a a(boolean paramBoolean) {
    p[] arrayOfP = a(b());
    if (paramBoolean) {
      p p = arrayOfP[0];
      arrayOfP[0] = arrayOfP[2];
      arrayOfP[2] = p;
    } 
    a(arrayOfP);
    b b1 = this.a;
    int i = this.f;
    return new e.f.c.r.a(a(b1, arrayOfP[i % 4], arrayOfP[(i + 1) % 4], arrayOfP[(i + 2) % 4], arrayOfP[(i + 3) % 4]), b(arrayOfP), this.b, this.d, this.c);
  }
  
  static final class a {
    private final int a;
    
    private final int b;
    
    a(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
    
    int a() {
      return this.a;
    }
    
    int b() {
      return this.b;
    }
    
    p c() {
      return new p(a(), b());
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder("<");
      stringBuilder.append(this.a);
      stringBuilder.append(' ');
      stringBuilder.append(this.b);
      stringBuilder.append('>');
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/r/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */