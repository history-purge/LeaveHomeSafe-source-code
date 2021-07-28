package e.f.c.w.r;

import e.f.c.a;
import e.f.c.j;
import e.f.c.n;
import e.f.c.p;
import e.f.c.q;
import e.f.c.s.a;
import e.f.c.s.m.a;
import e.f.c.w.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e extends a {
  private static final int[] i = new int[] { 1, 10, 34, 70, 126 };
  
  private static final int[] j = new int[] { 4, 20, 48, 81 };
  
  private static final int[] k = new int[] { 0, 161, 961, 2015, 2715 };
  
  private static final int[] l = new int[] { 0, 336, 1036, 1516 };
  
  private static final int[] m = new int[] { 8, 6, 4, 3, 1 };
  
  private static final int[] n = new int[] { 2, 4, 6, 8 };
  
  private static final int[][] o;
  
  private final List<d> g = new ArrayList<d>();
  
  private final List<d> h = new ArrayList<d>();
  
  static {
    int[] arrayOfInt1 = { 3, 5, 5, 1 };
    int[] arrayOfInt2 = { 2, 7, 4, 1 };
    o = new int[][] { { 3, 8, 2, 1 }, arrayOfInt1, { 3, 3, 7, 1 }, { 3, 1, 9, 1 }, arrayOfInt2, { 2, 5, 6, 1 }, { 2, 3, 8, 1 }, { 1, 5, 7, 1 }, { 1, 3, 9, 1 } };
  }
  
  private b a(a parama, c paramc, boolean paramBoolean) {
    int[] arrayOfInt3 = b();
    int i;
    for (i = 0; i < arrayOfInt3.length; i++)
      arrayOfInt3[i] = 0; 
    int[] arrayOfInt2 = paramc.b();
    if (paramBoolean) {
      k.b(parama, arrayOfInt2[0], arrayOfInt3);
    } else {
      k.a(parama, arrayOfInt2[1] + 1, arrayOfInt3);
      i = arrayOfInt3.length - 1;
      k = 0;
      while (k < i) {
        int i2 = arrayOfInt3[k];
        arrayOfInt3[k] = arrayOfInt3[i];
        arrayOfInt3[i] = i2;
        k++;
        i--;
      } 
    } 
    if (paramBoolean) {
      k = 16;
    } else {
      k = 15;
    } 
    float f = a.a(arrayOfInt3) / k;
    int[] arrayOfInt1 = f();
    arrayOfInt2 = d();
    float[] arrayOfFloat1 = g();
    float[] arrayOfFloat2 = e();
    int m;
    for (m = 0; m < arrayOfInt3.length; m++) {
      float f1 = arrayOfInt3[m] / f;
      int i2 = (int)(0.5F + f1);
      if (i2 <= 0) {
        i = 1;
      } else {
        i = i2;
        if (i2 > 8)
          i = 8; 
      } 
      i2 = m / 2;
      if ((m & 0x1) == 0) {
        arrayOfInt1[i2] = i;
        arrayOfFloat1[i2] = f1 - i;
      } else {
        arrayOfInt2[i2] = i;
        arrayOfFloat2[i2] = f1 - i;
      } 
    } 
    a(paramBoolean, k);
    m = arrayOfInt1.length - 1;
    int k = 0;
    i = 0;
    while (m >= 0) {
      k = k * 9 + arrayOfInt1[m];
      i += arrayOfInt1[m];
      m--;
    } 
    int n = arrayOfInt2.length - 1;
    int i1 = 0;
    m = 0;
    while (n >= 0) {
      i1 = i1 * 9 + arrayOfInt2[n];
      m += arrayOfInt2[n];
      n--;
    } 
    k += i1 * 3;
    if (paramBoolean) {
      if ((i & 0x1) == 0 && i <= 12 && i >= 4) {
        i = (12 - i) / 2;
        n = m[i];
        m = f.a(arrayOfInt1, n, false);
        n = f.a(arrayOfInt2, 9 - n, true);
        return new b(m * i[i] + n + k[i], k);
      } 
      throw j.a();
    } 
    if ((m & 0x1) == 0 && m <= 10 && m >= 4) {
      i = (10 - m) / 2;
      m = n[i];
      n = f.a(arrayOfInt1, m, true);
      return new b(f.a(arrayOfInt2, 9 - m, false) * j[i] + n + l[i], k);
    } 
    j j = j.a();
    throw j;
  }
  
  private c a(a parama, int paramInt, boolean paramBoolean, int[] paramArrayOfint) {
    boolean bool = parama.a(paramArrayOfint[0]);
    int i;
    for (i = paramArrayOfint[0] - 1; i >= 0 && bool != parama.a(i); i--);
    int k = i + 1;
    i = paramArrayOfint[0];
    int[] arrayOfInt = c();
    System.arraycopy(arrayOfInt, 0, arrayOfInt, 1, arrayOfInt.length - 1);
    arrayOfInt[0] = i - k;
    int m = a.a(arrayOfInt, o);
    int j = paramArrayOfint[1];
    if (paramBoolean) {
      i = parama.c();
      j = parama.c() - 1 - j;
      i = i - 1 - k;
    } else {
      i = k;
    } 
    return new c(m, new int[] { k, paramArrayOfint[1] }, i, j, paramInt);
  }
  
  private d a(a parama, boolean paramBoolean, int paramInt, Map<e.f.c.e, ?> paramMap) {
    try {
      q q;
      int[] arrayOfInt = a(parama, paramBoolean);
      c c = a(parama, paramInt, paramBoolean, arrayOfInt);
      if (paramMap == null) {
        paramMap = null;
      } else {
        q = (q)paramMap.get(e.f.c.e.l);
      } 
      if (q != null) {
        float f2 = (arrayOfInt[0] + arrayOfInt[1]) / 2.0F;
        float f1 = f2;
        if (paramBoolean)
          f1 = (parama.c() - 1) - f2; 
        q.a(new p(f1, paramInt));
      } 
      b b = a(parama, c, true);
      null = a(parama, c, false);
      return new d(b.b() * 1597 + null.b(), b.a() + null.a() * 4, c);
    } catch (j j) {
      return null;
    } 
  }
  
  private static void a(Collection<d> paramCollection, d paramd) {
    boolean bool1;
    if (paramd == null)
      return; 
    boolean bool2 = false;
    Iterator<d> iterator = paramCollection.iterator();
    while (true) {
      bool1 = bool2;
      if (iterator.hasNext()) {
        d d1 = iterator.next();
        if (d1.b() == paramd.b()) {
          d1.e();
          bool1 = true;
          break;
        } 
        continue;
      } 
      break;
    } 
    if (!bool1)
      paramCollection.add(paramd); 
  }
  
  private void a(boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual f : ()[I
    //   4: invokestatic a : ([I)I
    //   7: istore #9
    //   9: aload_0
    //   10: invokevirtual d : ()[I
    //   13: invokestatic a : ([I)I
    //   16: istore #10
    //   18: iconst_0
    //   19: istore #8
    //   21: iload_1
    //   22: ifeq -> 89
    //   25: iload #9
    //   27: bipush #12
    //   29: if_icmple -> 40
    //   32: iconst_0
    //   33: istore #4
    //   35: iconst_1
    //   36: istore_3
    //   37: goto -> 57
    //   40: iload #9
    //   42: iconst_4
    //   43: if_icmpge -> 52
    //   46: iconst_1
    //   47: istore #4
    //   49: goto -> 55
    //   52: iconst_0
    //   53: istore #4
    //   55: iconst_0
    //   56: istore_3
    //   57: iload #10
    //   59: bipush #12
    //   61: if_icmple -> 70
    //   64: iload_3
    //   65: istore #5
    //   67: goto -> 134
    //   70: iload #4
    //   72: istore #5
    //   74: iload_3
    //   75: istore #6
    //   77: iload #10
    //   79: iconst_4
    //   80: if_icmpge -> 167
    //   83: iload_3
    //   84: istore #7
    //   86: goto -> 162
    //   89: iload #9
    //   91: bipush #11
    //   93: if_icmple -> 104
    //   96: iconst_0
    //   97: istore_3
    //   98: iconst_1
    //   99: istore #4
    //   101: goto -> 120
    //   104: iload #9
    //   106: iconst_5
    //   107: if_icmpge -> 115
    //   110: iconst_1
    //   111: istore_3
    //   112: goto -> 117
    //   115: iconst_0
    //   116: istore_3
    //   117: iconst_0
    //   118: istore #4
    //   120: iload #10
    //   122: bipush #10
    //   124: if_icmple -> 142
    //   127: iload #4
    //   129: istore #5
    //   131: iload_3
    //   132: istore #4
    //   134: iconst_0
    //   135: istore_3
    //   136: iconst_1
    //   137: istore #6
    //   139: goto -> 184
    //   142: iload_3
    //   143: istore #5
    //   145: iload #4
    //   147: istore #6
    //   149: iload #10
    //   151: iconst_4
    //   152: if_icmpge -> 167
    //   155: iload #4
    //   157: istore #7
    //   159: iload_3
    //   160: istore #4
    //   162: iconst_1
    //   163: istore_3
    //   164: goto -> 177
    //   167: iconst_0
    //   168: istore_3
    //   169: iload #6
    //   171: istore #7
    //   173: iload #5
    //   175: istore #4
    //   177: iconst_0
    //   178: istore #6
    //   180: iload #7
    //   182: istore #5
    //   184: iload #9
    //   186: iload #10
    //   188: iadd
    //   189: iload_2
    //   190: isub
    //   191: istore #11
    //   193: iload #9
    //   195: iconst_1
    //   196: iand
    //   197: iload_1
    //   198: if_icmpne -> 206
    //   201: iconst_1
    //   202: istore_2
    //   203: goto -> 208
    //   206: iconst_0
    //   207: istore_2
    //   208: iload #8
    //   210: istore #7
    //   212: iload #10
    //   214: iconst_1
    //   215: iand
    //   216: iconst_1
    //   217: if_icmpne -> 223
    //   220: iconst_1
    //   221: istore #7
    //   223: iload #11
    //   225: iconst_1
    //   226: if_icmpne -> 263
    //   229: iload_2
    //   230: ifeq -> 248
    //   233: iload #7
    //   235: ifne -> 244
    //   238: iconst_1
    //   239: istore #5
    //   241: goto -> 343
    //   244: invokestatic a : ()Le/f/c/j;
    //   247: athrow
    //   248: iload #7
    //   250: ifeq -> 259
    //   253: iconst_1
    //   254: istore #6
    //   256: goto -> 343
    //   259: invokestatic a : ()Le/f/c/j;
    //   262: athrow
    //   263: iload #11
    //   265: iconst_m1
    //   266: if_icmpne -> 302
    //   269: iload_2
    //   270: ifeq -> 288
    //   273: iload #7
    //   275: ifne -> 284
    //   278: iconst_1
    //   279: istore #4
    //   281: goto -> 343
    //   284: invokestatic a : ()Le/f/c/j;
    //   287: athrow
    //   288: iload #7
    //   290: ifeq -> 298
    //   293: iconst_1
    //   294: istore_3
    //   295: goto -> 343
    //   298: invokestatic a : ()Le/f/c/j;
    //   301: athrow
    //   302: iload #11
    //   304: ifne -> 435
    //   307: iload_2
    //   308: ifeq -> 338
    //   311: iload #7
    //   313: ifeq -> 334
    //   316: iload #9
    //   318: iload #10
    //   320: if_icmpge -> 329
    //   323: iconst_1
    //   324: istore #4
    //   326: goto -> 253
    //   329: iconst_1
    //   330: istore_3
    //   331: goto -> 238
    //   334: invokestatic a : ()Le/f/c/j;
    //   337: athrow
    //   338: iload #7
    //   340: ifne -> 431
    //   343: iload #4
    //   345: ifeq -> 371
    //   348: iload #5
    //   350: ifne -> 367
    //   353: aload_0
    //   354: invokevirtual f : ()[I
    //   357: aload_0
    //   358: invokevirtual g : ()[F
    //   361: invokestatic b : ([I[F)V
    //   364: goto -> 371
    //   367: invokestatic a : ()Le/f/c/j;
    //   370: athrow
    //   371: iload #5
    //   373: ifeq -> 387
    //   376: aload_0
    //   377: invokevirtual f : ()[I
    //   380: aload_0
    //   381: invokevirtual g : ()[F
    //   384: invokestatic a : ([I[F)V
    //   387: iload_3
    //   388: ifeq -> 414
    //   391: iload #6
    //   393: ifne -> 410
    //   396: aload_0
    //   397: invokevirtual d : ()[I
    //   400: aload_0
    //   401: invokevirtual g : ()[F
    //   404: invokestatic b : ([I[F)V
    //   407: goto -> 414
    //   410: invokestatic a : ()Le/f/c/j;
    //   413: athrow
    //   414: iload #6
    //   416: ifeq -> 430
    //   419: aload_0
    //   420: invokevirtual d : ()[I
    //   423: aload_0
    //   424: invokevirtual e : ()[F
    //   427: invokestatic a : ([I[F)V
    //   430: return
    //   431: invokestatic a : ()Le/f/c/j;
    //   434: athrow
    //   435: invokestatic a : ()Le/f/c/j;
    //   438: astore #12
    //   440: goto -> 446
    //   443: aload #12
    //   445: athrow
    //   446: goto -> 443
  }
  
  private static boolean a(d paramd1, d paramd2) {
    int k = paramd1.a();
    int m = paramd2.a();
    int j = paramd1.d().c() * 9 + paramd2.d().c();
    int i = j;
    if (j > 72)
      i = j - 1; 
    j = i;
    if (i > 8)
      j = i - 1; 
    return ((k + m * 16) % 79 == j);
  }
  
  private int[] a(a parama, int paramBoolean) {
    int i2;
    int[] arrayOfInt = c();
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i1 = parama.c();
    int i = 0;
    int i3 = 0;
    while (i < i1) {
      int i4 = parama.a(i) ^ true;
      i3 = i4;
      if (paramBoolean != i4) {
        i++;
        i2 = i4;
      } 
    } 
    int k = i;
    int n = 0;
    int m = i;
    while (m < i1) {
      if (parama.a(m) != i2) {
        arrayOfInt[n] = arrayOfInt[n] + 1;
        i = n;
      } else {
        if (n == 3) {
          if (a.a(arrayOfInt))
            return new int[] { k, m }; 
          k += arrayOfInt[0] + arrayOfInt[1];
          arrayOfInt[0] = arrayOfInt[2];
          arrayOfInt[1] = arrayOfInt[3];
          arrayOfInt[2] = 0;
          arrayOfInt[3] = 0;
          i = n - 1;
        } else {
          i = n + 1;
        } 
        arrayOfInt[i] = 1;
        int i4 = i2 ^ 0x1;
      } 
      m++;
      n = i;
    } 
    j j = j.a();
    throw j;
  }
  
  private static n b(d paramd1, d paramd2) {
    String str2 = String.valueOf(paramd1.b() * 4537077L + paramd2.b());
    StringBuilder stringBuilder = new StringBuilder(14);
    int i;
    for (i = 13 - str2.length(); i > 0; i--)
      stringBuilder.append('0'); 
    stringBuilder.append(str2);
    i = 0;
    int j = 0;
    while (i < 13) {
      int m = stringBuilder.charAt(i) - 48;
      int k = m;
      if ((i & 0x1) == 0)
        k = m * 3; 
      j += k;
      i++;
    } 
    j = 10 - j % 10;
    i = j;
    if (j == 10)
      i = 0; 
    stringBuilder.append(i);
    p[] arrayOfP2 = paramd1.d().a();
    p[] arrayOfP1 = paramd2.d().a();
    String str1 = stringBuilder.toString();
    p p1 = arrayOfP2[0];
    p p3 = arrayOfP2[1];
    p p4 = arrayOfP1[0];
    p p2 = arrayOfP1[1];
    a a1 = a.o;
    return new n(str1, null, new p[] { p1, p3, p4, p2 }, a1);
  }
  
  public n a(int paramInt, a parama, Map<e.f.c.e, ?> paramMap) {
    d d2 = a(parama, false, paramInt, paramMap);
    a(this.g, d2);
    parama.d();
    d1 = a(parama, true, paramInt, paramMap);
    a(this.h, d1);
    parama.d();
    for (d d1 : this.g) {
      if (d1.c() > 1)
        for (d d : this.h) {
          if (d.c() > 1 && a(d1, d))
            return b(d1, d); 
        }  
    } 
    j j = j.a();
    throw j;
  }
  
  public void a() {
    this.g.clear();
    this.h.clear();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */