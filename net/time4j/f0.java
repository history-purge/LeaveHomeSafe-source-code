package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.time4j.c1.a;
import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.c1.d;
import net.time4j.d1.a0;
import net.time4j.d1.c0;
import net.time4j.d1.d;
import net.time4j.d1.d0;
import net.time4j.d1.f0;
import net.time4j.d1.g;
import net.time4j.d1.i0;
import net.time4j.d1.k;
import net.time4j.d1.l0;
import net.time4j.d1.m;
import net.time4j.d1.o;
import net.time4j.d1.o0;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.r;
import net.time4j.d1.s;
import net.time4j.d1.u;
import net.time4j.d1.x;
import net.time4j.d1.y;
import net.time4j.d1.z;
import net.time4j.e1.b;
import net.time4j.e1.c;
import net.time4j.e1.e;
import net.time4j.e1.h;

@c("iso8601")
public final class f0 extends m<u, f0> implements a, d0<f>, h {
  public static final d0 A;
  
  private static final Map<String, Object> B;
  
  private static final k<f0> C;
  
  private static final i0<u, f0> D;
  
  static final f0 f = new f0(-999999999, 1, 1);
  
  static final f0 g = new f0(999999999, 12, 31);
  
  static final Integer h = Integer.valueOf(-999999999);
  
  static final Integer i = Integer.valueOf(999999999);
  
  private static final Integer j = Integer.valueOf(1);
  
  private static final Integer k = Integer.valueOf(12);
  
  private static final Integer l = Integer.valueOf(365);
  
  private static final Integer m = Integer.valueOf(366);
  
  private static final int[] n = new int[12];
  
  private static final int[] o = new int[12];
  
  static final p<f0> p;
  
  public static final e q;
  
  public static final c<Integer, f0> r = s.a("YEAR", 14, -999999999, 999999999, 'u');
  
  public static final c<Integer, f0> s = z0.d;
  
  private static final long serialVersionUID = -6698431452072325688L;
  
  public static final c0<l0> t = new p<l0>("QUARTER_OF_YEAR", l0.class, l0.c, l0.f, 103, 'Q');
  
  public static final c0<b0> u = new p<b0>("MONTH_OF_YEAR", b0.class, b0.c, b0.n, 101, 'M');
  
  public static final j0<Integer, f0> v = s.a("MONTH_AS_NUMBER", 15, 1, 12, 'M');
  
  public static final j0<Integer, f0> w = s.a("DAY_OF_MONTH", 16, 1, 31, 'd');
  
  public static final c0<w0> x = new p<w0>("DAY_OF_WEEK", w0.class, w0.c, w0.i, 102, 'E');
  
  public static final j0<Integer, f0> y = s.a("DAY_OF_YEAR", 17, 1, 365, 'D');
  
  public static final j0<Integer, f0> z = s.a("DAY_OF_QUARTER", 18, 1, 92, false);
  
  private final transient int c;
  
  private final transient byte d;
  
  private final transient byte e;
  
  static {
    A = x0.c;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a((Map)hashMap, p);
    a((Map)hashMap, r);
    a((Map)hashMap, s);
    a((Map)hashMap, t);
    a((Map)hashMap, u);
    a((Map)hashMap, v);
    a((Map)hashMap, w);
    a((Map)hashMap, x);
    a((Map)hashMap, y);
    a((Map)hashMap, z);
    a((Map)hashMap, A);
    B = Collections.unmodifiableMap(hashMap);
    C = new f(null);
    i0.b<u, f0> b = i0.b.a(u.class, f0.class, new e(null), C);
    b.a(p, new b(null), f.j);
    c<Integer, f0> c1 = r;
    b.a(c1, (z)new d(c1), f.f);
    b.a(s, z0.a(f0.class), v0.c);
    c0<l0> c03 = t;
    b.a(c03, c.a(c03), f.g);
    c0<b0> c02 = u;
    b.a(c02, c.a(c02), f.h);
    j0<Integer, f0> j02 = v;
    b.a(j02, (z)new d(j02), f.h);
    j02 = w;
    b.a(j02, (z)new d(j02), f.j);
    c0<w0> c01 = x;
    b.a(c01, c.a(c01), f.j);
    j0<Integer, f0> j01 = y;
    b.a(j01, (z)new d(j01), f.j);
    j01 = z;
    b.a(j01, (z)new d(j01), f.j);
    d0 d01 = A;
    b.a(d01, (z)new d(19, d01), f.i);
    b(b);
    a(b);
    D = b.a();
  }
  
  private f0(int paramInt1, int paramInt2, int paramInt3) {
    this.c = paramInt1;
    this.d = (byte)paramInt2;
    this.e = (byte)paramInt3;
  }
  
  public static i0<u, f0> I() {
    return D;
  }
  
  private int J() {
    byte b;
    StringBuilder stringBuilder;
    switch (this.d) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown month: ");
        stringBuilder.append(this.d);
        throw new AssertionError(stringBuilder.toString());
      case 9:
        return this.e + 62;
      case 6:
      case 12:
        return this.e + 61;
      case 5:
        return this.e + 30;
      case 3:
        if (b.b(this.c)) {
          b = 60;
        } else {
          b = 59;
        } 
        return b + this.e;
      case 2:
      case 8:
      case 11:
        return this.e + 31;
      case 1:
      case 4:
      case 7:
      case 10:
        break;
    } 
    return this.e;
  }
  
  static Object a(String paramString) {
    return B.get(paramString);
  }
  
  public static f0 a(int paramInt1, int paramInt2) {
    if (paramInt2 >= 1) {
      int i;
      int[] arrayOfInt;
      if (paramInt2 <= 31)
        return b(paramInt1, 1, paramInt2); 
      if (b.b(paramInt1)) {
        arrayOfInt = o;
      } else {
        arrayOfInt = n;
      } 
      if (paramInt2 > arrayOfInt[6]) {
        i = 7;
      } else {
        i = 1;
      } 
      while (i < 12) {
        if (paramInt2 <= arrayOfInt[i])
          return b(paramInt1, i + 1, paramInt2 - arrayOfInt[i - 1], false); 
        i++;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Day of year out of range: ");
      stringBuilder1.append(paramInt2);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Day of year out of range: ");
    stringBuilder.append(paramInt2);
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
    throw illegalArgumentException;
  }
  
  public static f0 a(int paramInt1, int paramInt2, w0 paramw0) {
    return b(paramInt1, paramInt2, paramw0, true);
  }
  
  public static f0 a(int paramInt1, b0 paramb0, int paramInt2) {
    return b(paramInt1, paramb0.a(), paramInt2, true);
  }
  
  public static f0 a(long paramLong, a0 parama0) {
    return (f0)C.a(a0.c.a(paramLong, parama0));
  }
  
  public static f0 a(a parama) {
    return (parama instanceof f0) ? (f0)parama : b(parama.getYear(), parama.getMonth(), parama.r());
  }
  
  private static f0 a(f0 paramf0, long paramLong) {
    long l = c.a(paramf0.e, paramLong);
    if (l >= 1L && l <= 28L)
      return b(paramf0.c, paramf0.d, (int)l); 
    l = c.a(paramf0.x(), paramLong);
    if (l >= 1L && l <= 365L)
      return a(paramf0.c, (int)l); 
    paramLong = c.a(paramf0.y(), paramLong);
    return (f0)C.a(paramLong);
  }
  
  private static f0 a(f0 paramf0, long paramLong, int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (paramInt2 == 5) {
      i = paramInt2;
      if (paramf0.e == paramf0.B())
        i = 2; 
    } 
    int n = c.a(c.a(c.a(paramLong, 12), 1970L));
    int i1 = c.b(paramLong, 12) + 1;
    int j = b.a(n, i1);
    if (paramInt1 > j) {
      StringBuilder stringBuilder;
      switch (i) {
        default:
          stringBuilder = new StringBuilder();
          stringBuilder.append("Overflow policy not implemented: ");
          stringBuilder.append(i);
          throw new UnsupportedOperationException(stringBuilder.toString());
        case 4:
          stringBuilder = new StringBuilder(32);
          stringBuilder.append("Day of month out of range: ");
          b(stringBuilder, n);
          a(stringBuilder, i1);
          a(stringBuilder, paramInt1);
          throw new r(stringBuilder.toString());
        case 3:
          return a((f0)stringBuilder, c.a(paramLong, 1L), paramInt1 - j, i);
        case 1:
          return a((f0)stringBuilder, c.a(paramLong, 1L), 1, i);
        case 0:
        case 2:
        case 5:
        case 6:
          break;
      } 
    } else {
      paramInt2 = paramInt1;
      if (paramInt1 < j) {
        paramInt2 = paramInt1;
        if (i == 2) {
          paramInt2 = j;
          return b(n, i1, paramInt2);
        } 
      } 
      return b(n, i1, paramInt2);
    } 
    paramInt2 = j;
    return b(n, i1, paramInt2);
  }
  
  static f0 a(f paramf, f0 paramf0, long paramLong, int paramInt) {
    switch (a.a[paramf.ordinal()]) {
      default:
        throw new UnsupportedOperationException(paramf.name());
      case 8:
        return a(paramf0, paramLong);
      case 7:
        return a(f.j, paramf0, c.b(paramLong, 7L), paramInt);
      case 6:
        return a(paramf0, c.a(paramf0.z(), paramLong), paramf0.e, paramInt);
      case 5:
        return a(f.h, paramf0, c.b(paramLong, 3L), paramInt);
      case 4:
        return a(f.h, paramf0, c.b(paramLong, 12L), paramInt);
      case 3:
        return a(f.h, paramf0, c.b(paramLong, 120L), paramInt);
      case 2:
        return a(f.h, paramf0, c.b(paramLong, 1200L), paramInt);
      case 1:
        break;
    } 
    paramf = f.h;
    paramLong = c.b(paramLong, 12000L);
    try {
      return a(paramf, paramf0, paramLong, paramInt);
    } finally {}
  }
  
  private f0 a(w0 paramw0) {
    w0 w01 = w();
    return (w01 == paramw0) ? this : (f0)C.a(c.a(y(), (paramw0.a() - w01.a())));
  }
  
  private static void a(StringBuilder paramStringBuilder, int paramInt) {
    paramStringBuilder.append('-');
    if (paramInt < 10)
      paramStringBuilder.append('0'); 
    paramStringBuilder.append(paramInt);
  }
  
  private static void a(Map<String, Object> paramMap, p<?> paramp) {
    paramMap.put(paramp.name(), paramp);
  }
  
  private static void a(i0.b<u, f0> paramb) {
    for (s s : d.c().a(s.class)) {
      if (s.a(f0.class))
        paramb.a(s); 
    } 
    paramb.a(new u0());
  }
  
  public static f0 b(int paramInt1, int paramInt2, int paramInt3) {
    return b(paramInt1, paramInt2, paramInt3, true);
  }
  
  private static f0 b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    if (paramBoolean)
      b.a(paramInt1, paramInt2, paramInt3); 
    return new f0(paramInt1, paramInt2, paramInt3);
  }
  
  private static f0 b(int paramInt1, int paramInt2, w0 paramw0, boolean paramBoolean) {
    if (paramInt2 < 1 || paramInt2 > 53) {
      if (!paramBoolean)
        return null; 
      throw new IllegalArgumentException(l(paramInt2));
    } 
    if (!paramBoolean || (paramInt1 >= h.intValue() && paramInt1 <= i.intValue())) {
      int j;
      int i = w0.g(b.b(paramInt1, 1, 1)).a();
      if (i <= 4) {
        i = 2 - i;
      } else {
        i = 9 - i;
      } 
      int n = i + (paramInt2 - 1) * 7 + paramw0.a() - 1;
      char c1 = 'Ů';
      if (n <= 0) {
        j = paramInt1 - 1;
        if (!b.b(j))
          c1 = 'ŭ'; 
        i = n + c1;
      } else {
        if (!b.b(paramInt1))
          c1 = 'ŭ'; 
        i = n;
        j = paramInt1;
        if (n > c1) {
          i = n - c1;
          j = paramInt1 + 1;
        } 
      } 
      f0 f01 = a(j, i);
      if (paramInt2 == 53 && f01.A() != 53) {
        if (!paramBoolean)
          return null; 
        throw new IllegalArgumentException(l(paramInt2));
      } 
      return f01;
    } 
    throw new IllegalArgumentException(m(paramInt1));
  }
  
  private static void b(StringBuilder paramStringBuilder, int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: ifge -> 19
    //   4: aload_0
    //   5: bipush #45
    //   7: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   10: pop
    //   11: iload_1
    //   12: invokestatic a : (I)I
    //   15: istore_3
    //   16: goto -> 21
    //   19: iload_1
    //   20: istore_3
    //   21: iload_3
    //   22: sipush #10000
    //   25: if_icmplt -> 44
    //   28: iload_1
    //   29: ifle -> 83
    //   32: bipush #43
    //   34: istore_2
    //   35: aload_0
    //   36: iload_2
    //   37: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: goto -> 83
    //   44: iload_3
    //   45: sipush #1000
    //   48: if_icmpge -> 83
    //   51: bipush #48
    //   53: istore_2
    //   54: aload_0
    //   55: bipush #48
    //   57: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   60: pop
    //   61: iload_3
    //   62: bipush #100
    //   64: if_icmpge -> 83
    //   67: aload_0
    //   68: bipush #48
    //   70: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   73: pop
    //   74: iload_3
    //   75: bipush #10
    //   77: if_icmpge -> 83
    //   80: goto -> 35
    //   83: aload_0
    //   84: iload_3
    //   85: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: return
  }
  
  private static void b(i0.b<u, f0> paramb) {
    EnumSet<f> enumSet1 = EnumSet.range(f.c, f.h);
    EnumSet<f> enumSet2 = EnumSet.range(f.i, f.j);
    for (f f : f.values()) {
      EnumSet<f> enumSet;
      f.j<q> j = new f.j<q>(f);
      double d = f.b();
      if (f.compareTo(f.i) < 0) {
        enumSet = enumSet1;
      } else {
        enumSet = enumSet2;
      } 
      paramb.a(f, j, d, enumSet);
    } 
  }
  
  private f0 h(int paramInt) {
    return (this.e == paramInt) ? this : b(this.c, this.d, paramInt);
  }
  
  private f0 i(int paramInt) {
    return (x() == paramInt) ? this : a(this.c, paramInt);
  }
  
  private f0 j(int paramInt) {
    if (this.d == paramInt)
      return this; 
    int i = b.a(this.c, paramInt);
    return b(this.c, paramInt, Math.min(i, this.e));
  }
  
  private f0 k(int paramInt) {
    if (this.c == paramInt)
      return this; 
    int i = b.a(paramInt, this.d);
    return b(paramInt, this.d, Math.min(i, this.e));
  }
  
  private static String l(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("WEEK_OF_YEAR (ISO) out of range: ");
    stringBuilder.append(paramInt);
    return stringBuilder.toString();
  }
  
  private static String m(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("YEAR_OF_WEEKDATE (ISO) out of range: ");
    stringBuilder.append(paramInt);
    return stringBuilder.toString();
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 1);
  }
  
  int A() {
    return ((Integer)e(y0.n.j())).intValue();
  }
  
  public int B() {
    return b.a(this.c, this.d);
  }
  
  protected int a(g paramg) {
    f0 f01;
    if (paramg instanceof f0) {
      f01 = (f0)paramg;
      int j = this.c - f01.c;
      int i = j;
      if (j == 0) {
        j = this.d - f01.d;
        i = j;
        if (j == 0)
          i = this.e - f01.e; 
      } 
      return i;
    } 
    return super.a((g)f01);
  }
  
  f0 a(long paramLong) {
    return (f0)C.a(paramLong);
  }
  
  public h0 a(int paramInt1, int paramInt2, int paramInt3) {
    return a(g0.a(paramInt1, paramInt2, paramInt3));
  }
  
  public h0 a(g0 paramg0) {
    return h0.a(this, paramg0);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof f0) {
      paramObject = paramObject;
      return (this.e == ((f0)paramObject).e && this.d == ((f0)paramObject).d && this.c == ((f0)paramObject).c);
    } 
    return false;
  }
  
  public int getMonth() {
    return this.d;
  }
  
  public int getYear() {
    return this.c;
  }
  
  public int hashCode() {
    int i = this.c;
    return (i << 11) + (this.d << 6) + this.e ^ i & 0xFFFFF800;
  }
  
  public int r() {
    return this.e;
  }
  
  protected i0<u, f0> s() {
    return D;
  }
  
  protected f0 t() {
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    b(stringBuilder, this.c);
    a(stringBuilder, this.d);
    a(stringBuilder, this.e);
    return stringBuilder.toString();
  }
  
  public h0 v() {
    return a(g0.o);
  }
  
  public w0 w() {
    return w0.g(b.b(this.c, this.d, this.e));
  }
  
  public int x() {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:632)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  long y() {
    return C.a(this);
  }
  
  long z() {
    return (this.c - 1970) * 12L + this.d - 1L;
  }
  
  static {
    int[] arrayOfInt = n;
    arrayOfInt[0] = 31;
    arrayOfInt[1] = 59;
    arrayOfInt[2] = 90;
    arrayOfInt[3] = 120;
    arrayOfInt[4] = 151;
    arrayOfInt[5] = 181;
    arrayOfInt[6] = 212;
    arrayOfInt[7] = 243;
    arrayOfInt[8] = 273;
    arrayOfInt[9] = 304;
    arrayOfInt[10] = 334;
    arrayOfInt[11] = 365;
    arrayOfInt = o;
    arrayOfInt[0] = 31;
    arrayOfInt[1] = 60;
    arrayOfInt[2] = 91;
    arrayOfInt[3] = 121;
    arrayOfInt[4] = 152;
    arrayOfInt[5] = 182;
    arrayOfInt[6] = 213;
    arrayOfInt[7] = 244;
    arrayOfInt[8] = 274;
    arrayOfInt[9] = 305;
    arrayOfInt[10] = 335;
    arrayOfInt[11] = 366;
    h h1 = h.c;
    p = h1;
    q = h1;
  }
  
  private static class b implements z<f0, f0> {
    private b() {}
    
    public p<?> a(f0 param1f0) {
      return null;
    }
    
    public f0 a(f0 param1f01, f0 param1f02, boolean param1Boolean) {
      if (param1f02 != null)
        return param1f02; 
      throw new IllegalArgumentException("Missing date value.");
    }
    
    public boolean a(f0 param1f01, f0 param1f02) {
      return (param1f02 != null);
    }
    
    public p<?> b(f0 param1f0) {
      return null;
    }
    
    public f0 c(f0 param1f0) {
      return f0.g;
    }
    
    public f0 d(f0 param1f0) {
      return f0.f;
    }
    
    public f0 e(f0 param1f0) {
      return param1f0;
    }
  }
  
  private static class c<V extends Enum<V>> implements z<f0, V> {
    private final String c;
    
    private final Class<V> d;
    
    private final V e;
    
    private final V f;
    
    private final int g;
    
    c(String param1String, Class<V> param1Class, V param1V1, V param1V2, int param1Int) {
      this.c = param1String;
      this.d = param1Class;
      this.e = param1V1;
      this.f = param1V2;
      this.g = param1Int;
    }
    
    private p<?> a() {
      switch (this.g) {
        default:
          throw new UnsupportedOperationException(this.c);
        case 103:
          return f0.z;
        case 102:
          return null;
        case 101:
          break;
      } 
      return f0.w;
    }
    
    static <V extends Enum<V>> c<V> a(p<V> param1p) {
      return new c<V>(param1p.name(), param1p.getType(), (V)param1p.q(), (V)param1p.b(), ((p)param1p).h());
    }
    
    public p<?> a(f0 param1f0) {
      return a();
    }
    
    public f0 a(f0 param1f0, V param1V, boolean param1Boolean) {
      if (param1V != null) {
        int i;
        switch (this.g) {
          default:
            throw new UnsupportedOperationException(this.c);
          case 103:
            i = (f0.d(param1f0) - 1) / 3;
            return (f0)param1f0.b((((l0)l0.class.cast(param1V)).a() - i + 1), f.g);
          case 102:
            return f0.a(param1f0, w0.class.cast(param1V));
          case 101:
            break;
        } 
        return f0.b(param1f0, ((b0)b0.class.cast(param1V)).a());
      } 
      throw new IllegalArgumentException("Missing element value.");
    }
    
    public boolean a(f0 param1f0, V param1V) {
      if (param1V == null)
        return false; 
      if (this.g == 102 && f0.c(param1f0) == 999999999)
        try {
          a(param1f0, param1V, false);
          return true;
        } catch (IllegalArgumentException illegalArgumentException) {
          return false;
        }  
      return true;
    }
    
    public p<?> b(f0 param1f0) {
      return a();
    }
    
    public V c(f0 param1f0) {
      return (V)((this.g == 102 && f0.c(param1f0) == 999999999 && f0.d(param1f0) == 12 && f0.a(param1f0) >= 27) ? (Enum)this.d.cast(w0.g) : (Object)this.f);
    }
    
    public V d(f0 param1f0) {
      return this.e;
    }
    
    public V e(f0 param1f0) {
      l0 l0;
      w0 w0;
      switch (this.g) {
        default:
          throw new UnsupportedOperationException(this.c);
        case 103:
          l0 = l0.f((f0.d(param1f0) - 1) / 3 + 1);
          return this.d.cast(l0);
        case 102:
          w0 = l0.w();
          return this.d.cast(w0);
        case 101:
          break;
      } 
      b0 b0 = b0.f(f0.d((f0)w0));
      return this.d.cast(b0);
    }
  }
  
  private static class d implements c0<f0> {
    private final p<?> c;
    
    private final String d;
    
    private final int e;
    
    d(int param1Int, p<?> param1p) {
      this.c = param1p;
      this.d = param1p.name();
      this.e = param1Int;
    }
    
    d(p<Integer> param1p) {
      this(((s)param1p).h(), param1p);
    }
    
    private p<?> a() {
      switch (this.e) {
        default:
          throw new UnsupportedOperationException(this.d);
        case 16:
        case 17:
        case 18:
        case 19:
          return null;
        case 15:
          return f0.w;
        case 14:
          break;
      } 
      return f0.v;
    }
    
    private static int g(f0 param1f0) {
      int i = (f0.d(param1f0) - 1) / 3 + 1;
      return (i == 1) ? (b.b(f0.c(param1f0)) ? 91 : 90) : ((i == 2) ? 91 : 92);
    }
    
    private int h(f0 param1f0) {
      int j = b.a(f0.c(param1f0), f0.d(param1f0));
      byte b = f0.a(param1f0);
      int i = 0;
      while (true) {
        int k = i + 1;
        if (k * 7 + b <= j) {
          i = k;
          continue;
        } 
        return (b + i * 7 - 1) / 7 + 1;
      } 
    }
    
    public p<?> a(f0 param1f0) {
      return a();
    }
    
    public f0 a(f0 param1f0, int param1Int, boolean param1Boolean) {
      l0 l03;
      StringBuilder stringBuilder2;
      l0 l02;
      StringBuilder stringBuilder1;
      l0 l01;
      long l;
      u u;
      if (param1Boolean) {
        u = (u)f0.C().e(this.c);
        l03 = param1f0.b(c.e(param1Int, c(param1f0)), u);
        return (f0)l03;
      } 
      switch (this.e) {
        default:
          throw new UnsupportedOperationException(this.d);
        case 19:
          if (param1Boolean || (param1Int >= 1 && param1Int <= h((f0)l03))) {
            l = (param1Int - (f0.a((f0)l03) - 1) / 7 + 1);
            u = f.i;
          } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Out of range: ");
            stringBuilder2.append(param1Int);
            throw new IllegalArgumentException(stringBuilder2.toString());
          } 
          l02 = stringBuilder2.b(l, u);
          return (f0)l02;
        case 18:
          if (param1Int >= 1 && param1Int <= g((f0)l02)) {
            l = (param1Int - f0.b((f0)l02));
            u = f.j;
          } else {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Out of range: ");
            stringBuilder1.append(param1Int);
            throw new IllegalArgumentException(stringBuilder1.toString());
          } 
          l01 = stringBuilder1.b(l, u);
          return (f0)l01;
        case 17:
          return f0.d((f0)l01, param1Int);
        case 16:
          return f0.c((f0)l01, param1Int);
        case 15:
          return f0.b((f0)l01, param1Int);
        case 14:
          break;
      } 
      return f0.a((f0)l01, param1Int);
    }
    
    public f0 a(f0 param1f0, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null)
        return a(param1f0, param1Integer.intValue(), param1Boolean); 
      throw new IllegalArgumentException("Missing element value.");
    }
    
    public boolean a(f0 param1f0, int param1Int) {
      int i = this.e;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool5 = false;
      boolean bool6 = false;
      boolean bool7 = false;
      boolean bool2 = false;
      switch (i) {
        default:
          throw new UnsupportedOperationException(this.d);
        case 19:
          bool1 = bool2;
          if (param1Int >= 1) {
            bool1 = bool2;
            if (param1Int <= h(param1f0))
              bool1 = true; 
          } 
          return bool1;
        case 18:
          bool1 = bool3;
          if (param1Int >= 1) {
            bool1 = bool3;
            if (param1Int <= g(param1f0))
              bool1 = true; 
          } 
          return bool1;
        case 17:
          bool1 = bool4;
          if (param1Int >= 1) {
            if (b.b(f0.c(param1f0))) {
              i = 366;
            } else {
              i = 365;
            } 
            bool1 = bool4;
            if (param1Int <= i)
              bool1 = true; 
          } 
          return bool1;
        case 16:
          bool1 = bool5;
          if (param1Int >= 1) {
            bool1 = bool5;
            if (param1Int <= b.a(f0.c(param1f0), f0.d(param1f0)))
              bool1 = true; 
          } 
          return bool1;
        case 15:
          bool1 = bool6;
          if (param1Int >= 1) {
            bool1 = bool6;
            if (param1Int <= 12)
              bool1 = true; 
          } 
          return bool1;
        case 14:
          break;
      } 
      boolean bool1 = bool7;
      if (param1Int >= -999999999) {
        bool1 = bool7;
        if (param1Int <= 999999999)
          bool1 = true; 
      } 
      return bool1;
    }
    
    public boolean a(f0 param1f0, Integer param1Integer) {
      return (param1Integer != null && a(param1f0, param1Integer.intValue()));
    }
    
    public p<?> b(f0 param1f0) {
      return a();
    }
    
    public int c(f0 param1f0) {
      switch (this.e) {
        default:
          throw new UnsupportedOperationException(this.d);
        case 19:
          return (f0.a(param1f0) - 1) / 7 + 1;
        case 18:
          return f0.b(param1f0);
        case 17:
          return param1f0.x();
        case 16:
          return f0.a(param1f0);
        case 15:
          return f0.d(param1f0);
        case 14:
          break;
      } 
      return f0.c(param1f0);
    }
    
    public Integer d(f0 param1f0) {
      int i;
      switch (this.e) {
        default:
          throw new UnsupportedOperationException(this.d);
        case 19:
          i = h(param1f0);
          return Integer.valueOf(i);
        case 18:
          i = g(param1f0);
          return Integer.valueOf(i);
        case 17:
          return b.b(f0.c(param1f0)) ? f0.F() : f0.G();
        case 16:
          i = b.a(f0.c(param1f0), f0.d(param1f0));
          return Integer.valueOf(i);
        case 15:
          return f0.E();
        case 14:
          break;
      } 
      return f0.i;
    }
    
    public Integer e(f0 param1f0) {
      switch (this.e) {
        default:
          throw new UnsupportedOperationException(this.d);
        case 15:
        case 16:
        case 17:
        case 18:
        case 19:
          return f0.D();
        case 14:
          break;
      } 
      return f0.h;
    }
    
    public Integer f(f0 param1f0) {
      return Integer.valueOf(c(param1f0));
    }
  }
  
  private static class e implements u<f0> {
    private static final int c = b.c(b.d(a0.e.a(c.a(System.currentTimeMillis(), 86400000), a0.d))) + 20;
    
    private e() {}
    
    private static void a(q<?> param1q, String param1String) {
      if (param1q.a((p)o0.c, param1String))
        param1q.b((p)o0.c, param1String); 
    }
    
    private static boolean a(q<?> param1q, int param1Int) {
      if (param1Int < 1 || param1Int > 12) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MONTH_OF_YEAR out of range: ");
        stringBuilder.append(param1Int);
        a(param1q, stringBuilder.toString());
        return false;
      } 
      return true;
    }
    
    private static boolean a(q<?> param1q, int param1Int1, int param1Int2) {
      if (param1Int2 >= 1) {
        char c = 'ŭ';
        if (param1Int2 > 365) {
          if (b.b(param1Int1))
            c = 'Ů'; 
          if (param1Int2 > c) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("DAY_OF_YEAR out of range: ");
            stringBuilder1.append(param1Int2);
            a(param1q, stringBuilder1.toString());
            return false;
          } 
        } 
        return true;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("DAY_OF_YEAR out of range: ");
      stringBuilder.append(param1Int2);
      a(param1q, stringBuilder.toString());
      return false;
    }
    
    private static boolean a(q<?> param1q, int param1Int1, int param1Int2, int param1Int3) {
      if (param1Int3 < 1 || (param1Int3 > 28 && param1Int3 > b.a(param1Int1, param1Int2))) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DAY_OF_MONTH out of range: ");
        stringBuilder.append(param1Int3);
        a(param1q, stringBuilder.toString());
        return false;
      } 
      return true;
    }
    
    private static boolean a(q<?> param1q, boolean param1Boolean, l0 param1l0, int param1Int) {
      int i = f0.a.b[param1l0.ordinal()];
      byte b = 91;
      if (i != 1) {
        if (i != 2)
          b = 92; 
      } else if (!param1Boolean) {
        b = 90;
      } 
      if (param1Int < 1 || param1Int > b) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DAY_OF_QUARTER out of range: ");
        stringBuilder.append(param1Int);
        a(param1q, stringBuilder.toString());
        return false;
      } 
      return true;
    }
    
    private static boolean b(q<?> param1q, int param1Int) {
      if (param1Int < -999999999 || param1Int > 999999999) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("YEAR out of range: ");
        stringBuilder.append(param1Int);
        a(param1q, stringBuilder.toString());
        return false;
      } 
      return true;
    }
    
    public String a(y param1y, Locale param1Locale) {
      return b.a(e.f(param1y.a()), param1Locale);
    }
    
    public f0 a() {
      return f0.a;
    }
    
    public o a(f0 param1f0, d param1d) {
      return (o)param1f0;
    }
    
    public f0 a(q<?> param1q, d param1d, boolean param1Boolean1, boolean param1Boolean2) {
      Long long_;
      f0 f0;
      if (param1q.c(f0.p))
        return (f0)param1q.e(f0.p); 
      int j = param1q.a(f0.r);
      if (j != Integer.MIN_VALUE) {
        int m = param1q.a(f0.v);
        int k = m;
        if (m == Integer.MIN_VALUE) {
          k = m;
          if (param1q.c(f0.u))
            k = ((b0)param1q.e(f0.u)).a(); 
        } 
        if (k != Integer.MIN_VALUE) {
          m = param1q.a(f0.w);
          if (m != Integer.MIN_VALUE)
            return param1Boolean1 ? (f0)((f0)f0.b(j, 1, 1).a(f0.v.a(Integer.valueOf(k)))).a(f0.w.a(Integer.valueOf(m))) : ((b(param1q, j) && a(param1q, k) && a(param1q, j, k, m)) ? f0.a(j, k, m, false) : null); 
        } 
        k = param1q.a(f0.y);
        if (k != Integer.MIN_VALUE)
          return param1Boolean1 ? (f0)f0.a(j, 1).a(f0.y.a(Integer.valueOf(k))) : ((b(param1q, j) && a(param1q, j, k)) ? f0.a(j, k) : null); 
        m = param1q.a(f0.z);
        if (m != Integer.MIN_VALUE && param1q.c(f0.t)) {
          l0 l0 = (l0)param1q.e(f0.t);
          param1Boolean2 = b.b(j);
          if (param1Boolean2) {
            k = 91;
          } else {
            k = 90;
          } 
          int n = k + m;
          if (l0 == l0.c) {
            k = m;
          } else if (l0 == l0.e) {
            k = n + 91;
          } else {
            k = n;
            if (l0 == l0.f)
              k = n + 183; 
          } 
          return param1Boolean1 ? (f0)f0.a(j, 1).a(f0.y.a(Integer.valueOf(k))) : ((b(param1q, j) && a(param1q, param1Boolean2, l0, m)) ? f0.a(j, k) : null);
        } 
      } 
      int i = param1q.a(f0.s);
      if (i != Integer.MIN_VALUE && param1q.c(y0.n.j())) {
        c0<w0> c0;
        int k = ((Integer)param1q.e(y0.n.j())).intValue();
        if (param1q.c(f0.x)) {
          c0 = f0.x;
        } else if (param1q.c(y0.n.h())) {
          c0 = y0.n.h();
        } else {
          return null;
        } 
        w0 w0 = (w0)param1q.e(c0);
        if (i < -999999999 || i > 999999999) {
          a(param1q, f0.f(i));
          return null;
        } 
        f0 = f0.a(i, k, w0, false);
        if (f0 == null)
          a(param1q, f0.g(k)); 
        return f0;
      } 
      if (param1q.c((p)a0.e)) {
        long_ = (Long)param1q.e((p)a0.e);
        long l = a0.c.a(long_.longValue(), a0.e);
        return (f0)f0.H().a(l);
      } 
      return (long_ instanceof net.time4j.c1.f) ? ((h0)h0.B().a((q)long_, (d)f0, param1Boolean1, param1Boolean2)).w() : null;
    }
    
    public x<?> b() {
      return null;
    }
    
    public int c() {
      return c;
    }
  }
  
  private static class f implements k<f0> {
    private f() {}
    
    public long a() {
      return 365241779741L;
    }
    
    public long a(f0 param1f0) {
      return a0.c.a(b.a(param1f0), a0.e);
    }
    
    public f0 a(long param1Long) {
      if (param1Long == -365243219892L)
        return f0.f; 
      if (param1Long == 365241779741L)
        return f0.g; 
      param1Long = b.d(a0.e.a(param1Long, a0.c));
      return f0.b(b.c(param1Long), b.b(param1Long), b.a(param1Long));
    }
    
    public long b() {
      return -365243219892L;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */