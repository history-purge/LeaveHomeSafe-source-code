package e.f.c.w.r.g;

import e.f.c.a;
import e.f.c.e;
import e.f.c.j;
import e.f.c.n;
import e.f.c.p;
import e.f.c.s.a;
import e.f.c.s.m.a;
import e.f.c.w.k;
import e.f.c.w.r.a;
import e.f.c.w.r.b;
import e.f.c.w.r.c;
import e.f.c.w.r.f;
import e.f.c.w.r.g.e.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d extends a {
  private static final int[] k = new int[] { 7, 5, 4, 3, 1 };
  
  private static final int[] l = new int[] { 4, 20, 52, 104, 204 };
  
  private static final int[] m = new int[] { 0, 348, 1388, 2948, 3988 };
  
  private static final int[][] n;
  
  private static final int[][] o;
  
  private static final int[][] p;
  
  private final List<b> g = new ArrayList<b>(11);
  
  private final List<c> h = new ArrayList<c>();
  
  private final int[] i = new int[2];
  
  private boolean j;
  
  static {
    int[] arrayOfInt1 = { 1, 8, 4, 1 };
    int[] arrayOfInt2 = { 3, 2, 8, 1 };
    int[] arrayOfInt3 = { 2, 6, 5, 1 };
    int[] arrayOfInt4 = { 2, 2, 9, 1 };
    n = new int[][] { arrayOfInt1, { 3, 6, 4, 1 }, { 3, 4, 6, 1 }, arrayOfInt2, arrayOfInt3, arrayOfInt4 };
    arrayOfInt1 = new int[] { 1, 3, 9, 27, 81, 32, 96, 77 };
    arrayOfInt2 = new int[] { 20, 60, 180, 118, 143, 7, 21, 63 };
    arrayOfInt3 = new int[] { 189, 145, 13, 39, 117, 140, 209, 205 };
    arrayOfInt4 = new int[] { 193, 157, 49, 147, 19, 57, 171, 91 };
    int[] arrayOfInt5 = { 62, 186, 136, 197, 169, 85, 44, 132 };
    int[] arrayOfInt6 = { 185, 133, 188, 142, 4, 12, 36, 108 };
    int[] arrayOfInt7 = { 113, 128, 173, 97, 80, 29, 87, 50 };
    int[] arrayOfInt8 = { 150, 28, 84, 41, 123, 158, 52, 156 };
    int[] arrayOfInt9 = { 46, 138, 203, 187, 139, 206, 196, 166 };
    int[] arrayOfInt10 = { 76, 17, 51, 153, 37, 111, 122, 155 };
    int[] arrayOfInt11 = { 43, 129, 176, 106, 107, 110, 119, 146 };
    int[] arrayOfInt12 = { 16, 48, 144, 10, 30, 90, 59, 177 };
    int[] arrayOfInt13 = { 109, 116, 137, 200, 178, 112, 125, 164 };
    int[] arrayOfInt14 = { 70, 210, 208, 202, 184, 130, 179, 115 };
    int[] arrayOfInt15 = { 134, 191, 151, 31, 93, 68, 204, 190 };
    int[] arrayOfInt16 = { 148, 22, 66, 198, 172, 94, 71, 2 };
    int[] arrayOfInt17 = { 6, 18, 54, 162, 64, 192, 154, 40 };
    int[] arrayOfInt18 = { 120, 149, 25, 75, 14, 42, 126, 167 };
    int[] arrayOfInt19 = { 79, 26, 78, 23, 69, 207, 199, 175 };
    int[] arrayOfInt20 = { 103, 98, 83, 38, 114, 131, 182, 124 };
    int[] arrayOfInt21 = { 55, 165, 73, 8, 24, 72, 5, 15 };
    int[] arrayOfInt22 = { 45, 135, 194, 160, 58, 174, 100, 89 };
    o = new int[][] { 
        arrayOfInt1, arrayOfInt2, arrayOfInt3, arrayOfInt4, arrayOfInt5, arrayOfInt6, arrayOfInt7, arrayOfInt8, arrayOfInt9, arrayOfInt10, 
        arrayOfInt11, arrayOfInt12, arrayOfInt13, arrayOfInt14, arrayOfInt15, arrayOfInt16, arrayOfInt17, arrayOfInt18, arrayOfInt19, arrayOfInt20, 
        { 161, 61, 183, 127, 170, 88, 53, 159 }, arrayOfInt21, arrayOfInt22 };
    arrayOfInt1 = new int[] { 0, 1, 1 };
    arrayOfInt2 = new int[] { 0, 4, 1, 3, 2 };
    arrayOfInt3 = new int[] { 0, 4, 1, 3, 3, 5 };
    arrayOfInt4 = new int[] { 0, 4, 1, 3, 4, 5, 5 };
    arrayOfInt5 = new int[] { 0, 0, 1, 1, 2, 2, 3, 3 };
    arrayOfInt6 = new int[] { 0, 0, 1, 1, 2, 2, 3, 4, 4 };
    arrayOfInt7 = new int[] { 
        0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 
        5 };
    p = new int[][] { { 0, 0 }, arrayOfInt1, { 0, 2, 1, 3 }, arrayOfInt2, arrayOfInt3, arrayOfInt4, arrayOfInt5, arrayOfInt6, { 0, 0, 1, 1, 2, 2, 3, 4, 5, 5 }, arrayOfInt7 };
  }
  
  private static int a(a parama, int paramInt) {
    return parama.a(paramInt) ? parama.b(parama.c(paramInt)) : parama.c(parama.b(paramInt));
  }
  
  static n a(List<b> paramList) {
    String str = j.a(a.a(paramList)).c();
    p[] arrayOfP1 = ((b)paramList.get(0)).a().a();
    p[] arrayOfP2 = ((b)paramList.get(paramList.size() - 1)).a().a();
    p p1 = arrayOfP1[0];
    p p2 = arrayOfP1[1];
    p p3 = arrayOfP2[0];
    p p4 = arrayOfP2[1];
    a a1 = a.p;
    return new n(str, null, new p[] { p1, p2, p3, p4 }, a1);
  }
  
  private c a(a parama, int paramInt, boolean paramBoolean) {
    int i;
    int j;
    int k;
    if (paramBoolean) {
      for (i = this.i[0] - 1; i >= 0 && !parama.a(i); i--);
      k = i + 1;
      arrayOfInt = this.i;
      int m = arrayOfInt[0];
      j = arrayOfInt[1];
      i = k;
      k = m - k;
    } else {
      int[] arrayOfInt1 = this.i;
      i = arrayOfInt1[0];
      j = arrayOfInt.c(arrayOfInt1[1] + 1);
      k = j - this.i[1];
    } 
    int[] arrayOfInt = c();
    System.arraycopy(arrayOfInt, 0, arrayOfInt, 1, arrayOfInt.length - 1);
    arrayOfInt[0] = k;
    try {
      k = a.a(arrayOfInt, n);
      return new c(k, new int[] { i, j }, i, j, paramInt);
    } catch (j j1) {
      return null;
    } 
  }
  
  private List<b> a(List<c> paramList, int paramInt) {
    while (true) {
      if (paramInt < this.h.size()) {
        c c = this.h.get(paramInt);
        this.g.clear();
        for (c c1 : paramList)
          this.g.addAll(c1.a()); 
        this.g.addAll(c.a());
        if (b(this.g)) {
          if (h())
            return this.g; 
          ArrayList<c> arrayList = new ArrayList<c>(paramList);
          arrayList.add(c);
          try {
            return a(arrayList, paramInt + 1);
          } catch (j j1) {}
        } 
        paramInt++;
        continue;
      } 
      j j = j.a();
      throw j;
    } 
  }
  
  private List<b> a(boolean paramBoolean) {
    int i = this.h.size();
    List<b> list = null;
    if (i > 25) {
      this.h.clear();
      return null;
    } 
    this.g.clear();
    if (paramBoolean)
      Collections.reverse(this.h); 
    try {
      List<b> list1 = a(new ArrayList<c>(), 0);
      list = list1;
    } catch (j j) {}
    if (paramBoolean)
      Collections.reverse(this.h); 
    return list;
  }
  
  private void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual f : ()[I
    //   4: invokestatic a : ([I)I
    //   7: istore #7
    //   9: aload_0
    //   10: invokevirtual d : ()[I
    //   13: invokestatic a : ([I)I
    //   16: istore #8
    //   18: iconst_0
    //   19: istore #6
    //   21: iload #7
    //   23: bipush #13
    //   25: if_icmple -> 34
    //   28: iconst_1
    //   29: istore #4
    //   31: goto -> 54
    //   34: iconst_0
    //   35: istore_2
    //   36: iconst_0
    //   37: istore #4
    //   39: iload #7
    //   41: iconst_4
    //   42: if_icmpge -> 54
    //   45: iconst_1
    //   46: istore #5
    //   48: iload_2
    //   49: istore #4
    //   51: goto -> 57
    //   54: iconst_0
    //   55: istore #5
    //   57: iload #8
    //   59: bipush #13
    //   61: if_icmple -> 71
    //   64: iconst_0
    //   65: istore_2
    //   66: iconst_1
    //   67: istore_3
    //   68: goto -> 86
    //   71: iload #8
    //   73: iconst_4
    //   74: if_icmpge -> 82
    //   77: iconst_1
    //   78: istore_2
    //   79: goto -> 84
    //   82: iconst_0
    //   83: istore_2
    //   84: iconst_0
    //   85: istore_3
    //   86: iload #7
    //   88: iload #8
    //   90: iadd
    //   91: iload_1
    //   92: isub
    //   93: istore #9
    //   95: iload #7
    //   97: iconst_1
    //   98: iand
    //   99: iconst_1
    //   100: if_icmpne -> 108
    //   103: iconst_1
    //   104: istore_1
    //   105: goto -> 110
    //   108: iconst_0
    //   109: istore_1
    //   110: iload #8
    //   112: iconst_1
    //   113: iand
    //   114: ifne -> 120
    //   117: iconst_1
    //   118: istore #6
    //   120: iload #9
    //   122: iconst_1
    //   123: if_icmpne -> 159
    //   126: iload_1
    //   127: ifeq -> 145
    //   130: iload #6
    //   132: ifne -> 141
    //   135: iconst_1
    //   136: istore #4
    //   138: goto -> 238
    //   141: invokestatic a : ()Le/f/c/j;
    //   144: athrow
    //   145: iload #6
    //   147: ifeq -> 155
    //   150: iconst_1
    //   151: istore_3
    //   152: goto -> 238
    //   155: invokestatic a : ()Le/f/c/j;
    //   158: athrow
    //   159: iload #9
    //   161: iconst_m1
    //   162: if_icmpne -> 198
    //   165: iload_1
    //   166: ifeq -> 184
    //   169: iload #6
    //   171: ifne -> 180
    //   174: iconst_1
    //   175: istore #5
    //   177: goto -> 238
    //   180: invokestatic a : ()Le/f/c/j;
    //   183: athrow
    //   184: iload #6
    //   186: ifeq -> 194
    //   189: iconst_1
    //   190: istore_2
    //   191: goto -> 238
    //   194: invokestatic a : ()Le/f/c/j;
    //   197: athrow
    //   198: iload #9
    //   200: ifne -> 328
    //   203: iload_1
    //   204: ifeq -> 233
    //   207: iload #6
    //   209: ifeq -> 229
    //   212: iload #7
    //   214: iload #8
    //   216: if_icmpge -> 224
    //   219: iconst_1
    //   220: istore_3
    //   221: goto -> 174
    //   224: iconst_1
    //   225: istore_2
    //   226: goto -> 135
    //   229: invokestatic a : ()Le/f/c/j;
    //   232: athrow
    //   233: iload #6
    //   235: ifne -> 324
    //   238: iload #5
    //   240: ifeq -> 266
    //   243: iload #4
    //   245: ifne -> 262
    //   248: aload_0
    //   249: invokevirtual f : ()[I
    //   252: aload_0
    //   253: invokevirtual g : ()[F
    //   256: invokestatic b : ([I[F)V
    //   259: goto -> 266
    //   262: invokestatic a : ()Le/f/c/j;
    //   265: athrow
    //   266: iload #4
    //   268: ifeq -> 282
    //   271: aload_0
    //   272: invokevirtual f : ()[I
    //   275: aload_0
    //   276: invokevirtual g : ()[F
    //   279: invokestatic a : ([I[F)V
    //   282: iload_2
    //   283: ifeq -> 308
    //   286: iload_3
    //   287: ifne -> 304
    //   290: aload_0
    //   291: invokevirtual d : ()[I
    //   294: aload_0
    //   295: invokevirtual g : ()[F
    //   298: invokestatic b : ([I[F)V
    //   301: goto -> 308
    //   304: invokestatic a : ()Le/f/c/j;
    //   307: athrow
    //   308: iload_3
    //   309: ifeq -> 323
    //   312: aload_0
    //   313: invokevirtual d : ()[I
    //   316: aload_0
    //   317: invokevirtual e : ()[F
    //   320: invokestatic a : ([I[F)V
    //   323: return
    //   324: invokestatic a : ()Le/f/c/j;
    //   327: athrow
    //   328: invokestatic a : ()Le/f/c/j;
    //   331: astore #10
    //   333: goto -> 339
    //   336: aload #10
    //   338: athrow
    //   339: goto -> 336
  }
  
  private void a(int paramInt, boolean paramBoolean) {
    boolean bool2;
    boolean bool3 = false;
    int i = 0;
    boolean bool1 = false;
    while (true) {
      bool2 = bool3;
      if (i < this.h.size()) {
        c c = this.h.get(i);
        if (c.b() > paramInt) {
          bool2 = c.a(this.g);
          break;
        } 
        bool1 = c.a(this.g);
        i++;
        continue;
      } 
      break;
    } 
    if (!bool2) {
      if (bool1)
        return; 
      if (a(this.g, this.h))
        return; 
      this.h.add(i, new c(this.g, paramInt, paramBoolean));
      a(this.g, this.h);
    } 
  }
  
  private static void a(List<b> paramList, List<c> paramList1) {
    Iterator<c> iterator = paramList1.iterator();
    while (true) {
      boolean bool;
      if (iterator.hasNext()) {
        c c = iterator.next();
        if (c.a().size() != paramList.size()) {
          Iterator<b> iterator1 = c.a().iterator();
          while (true) {
            boolean bool2 = iterator1.hasNext();
            boolean bool1 = false;
            bool = true;
            if (bool2) {
              b b = iterator1.next();
              Iterator<b> iterator2 = paramList.iterator();
              while (true) {
                if (iterator2.hasNext()) {
                  if (b.equals(iterator2.next()))
                    break; 
                  continue;
                } 
                bool = false;
                break;
              } 
              if (!bool) {
                bool = bool1;
              } else {
                continue;
              } 
            } else {
              bool = true;
              break;
            } 
            if (bool)
              iterator.remove(); 
          } 
        } else {
          continue;
        } 
      } else {
        break;
      } 
      if (bool)
        iterator.remove(); 
    } 
  }
  
  private static boolean a(c paramc, boolean paramBoolean1, boolean paramBoolean2) {
    return (paramc.c() != 0 || !paramBoolean1 || !paramBoolean2);
  }
  
  private static boolean a(Iterable<b> paramIterable, Iterable<c> paramIterable1) {
    Iterator<c> iterator = paramIterable1.iterator();
    while (true) {
      boolean bool1 = iterator.hasNext();
      boolean bool = false;
      if (bool1) {
        boolean bool2;
        c c = iterator.next();
        Iterator<b> iterator1 = paramIterable.iterator();
        while (true) {
          if (iterator1.hasNext()) {
            boolean bool3;
            b b = iterator1.next();
            Iterator<b> iterator2 = c.a().iterator();
            while (true) {
              if (iterator2.hasNext()) {
                if (b.equals(iterator2.next())) {
                  boolean bool4 = true;
                  break;
                } 
                continue;
              } 
              bool3 = false;
              break;
            } 
            if (!bool3) {
              bool3 = bool;
              break;
            } 
            continue;
          } 
          bool2 = true;
          break;
        } 
        if (bool2)
          return true; 
        continue;
      } 
      return false;
    } 
  }
  
  private void b(a parama, List<b> paramList, int paramInt) {
    int[] arrayOfInt = c();
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    arrayOfInt[2] = 0;
    arrayOfInt[3] = 0;
    int i1 = parama.c();
    if (paramInt < 0)
      if (paramList.isEmpty()) {
        paramInt = 0;
      } else {
        paramInt = ((b)paramList.get(paramList.size() - 1)).a().b()[1];
      }  
    if (paramList.size() % 2 != 0) {
      i = 1;
    } else {
      i = 0;
    } 
    int k = i;
    if (this.j)
      k = i ^ 0x1; 
    int i2 = 0;
    while (paramInt < i1) {
      int i3 = parama.a(paramInt) ^ true;
      i2 = i3;
      if (i3 != 0) {
        paramInt++;
        i2 = i3;
      } 
    } 
    int i = paramInt;
    int n = 0;
    int m = paramInt;
    paramInt = i;
    i = n;
    while (m < i1) {
      if (parama.a(m) != i2) {
        arrayOfInt[i] = arrayOfInt[i] + 1;
        n = paramInt;
      } else {
        if (i == 3) {
          if (k != 0)
            b(arrayOfInt); 
          if (a.a(arrayOfInt)) {
            int[] arrayOfInt1 = this.i;
            arrayOfInt1[0] = paramInt;
            arrayOfInt1[1] = m;
            return;
          } 
          if (k != 0)
            b(arrayOfInt); 
          n = paramInt + arrayOfInt[0] + arrayOfInt[1];
          arrayOfInt[0] = arrayOfInt[2];
          arrayOfInt[1] = arrayOfInt[3];
          arrayOfInt[2] = 0;
          arrayOfInt[3] = 0;
          paramInt = i - 1;
          i = n;
        } else {
          n = i + 1;
          i = paramInt;
          paramInt = n;
        } 
        arrayOfInt[paramInt] = 1;
        i2 ^= 0x1;
        n = i;
        i = paramInt;
      } 
      m++;
      paramInt = n;
    } 
    j j = j.a();
    throw j;
  }
  
  private static void b(int[] paramArrayOfint) {
    int j = paramArrayOfint.length;
    for (int i = 0; i < j / 2; i++) {
      int k = paramArrayOfint[i];
      int m = j - i - 1;
      paramArrayOfint[i] = paramArrayOfint[m];
      paramArrayOfint[m] = k;
    } 
  }
  
  private static boolean b(List<b> paramList) {
    for (int[] arrayOfInt : p) {
      if (paramList.size() <= arrayOfInt.length) {
        int i = 0;
        while (true) {
          if (i < paramList.size()) {
            if (((b)paramList.get(i)).a().c() != arrayOfInt[i]) {
              i = 0;
              break;
            } 
            i++;
            continue;
          } 
          i = 1;
          break;
        } 
        if (i != 0)
          return true; 
      } 
    } 
    return false;
  }
  
  private boolean h() {
    b b = this.g.get(0);
    b b1 = b.b();
    b b2 = b.c();
    if (b2 == null)
      return false; 
    int j = b2.a();
    int k = 1;
    int i = 2;
    while (k < this.g.size()) {
      b b4 = this.g.get(k);
      int m = j + b4.b().a();
      int n = i + 1;
      b b3 = b4.c();
      j = m;
      i = n;
      if (b3 != null) {
        j = m + b3.a();
        i = n + 1;
      } 
      k++;
    } 
    return ((i - 4) * 211 + j % 211 == b1.b());
  }
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    this.g.clear();
    this.j = false;
    try {
      return a(a(paramInt, parama));
    } catch (j j) {
      this.g.clear();
      this.j = true;
      return a(a(paramInt, parama));
    } 
  }
  
  b a(a parama, c paramc, boolean paramBoolean1, boolean paramBoolean2) {
    int[] arrayOfInt1 = b();
    int i;
    for (i = 0; i < arrayOfInt1.length; i++)
      arrayOfInt1[i] = 0; 
    int[] arrayOfInt2 = paramc.b();
    if (paramBoolean2) {
      k.b(parama, arrayOfInt2[0], arrayOfInt1);
    } else {
      k.a(parama, arrayOfInt2[1], arrayOfInt1);
      i = arrayOfInt1.length - 1;
      int k = 0;
      while (k < i) {
        int m = arrayOfInt1[k];
        arrayOfInt1[k] = arrayOfInt1[i];
        arrayOfInt1[i] = m;
        k++;
        i--;
      } 
    } 
    float f1 = a.a(arrayOfInt1) / 17.0F;
    float f2 = (paramc.b()[1] - paramc.b()[0]) / 15.0F;
    if (Math.abs(f1 - f2) / f2 <= 0.3F) {
      int[] arrayOfInt = f();
      arrayOfInt2 = d();
      float[] arrayOfFloat1 = g();
      float[] arrayOfFloat2 = e();
      int k;
      for (k = 0; k < arrayOfInt1.length; k++) {
        f2 = arrayOfInt1[k] * 1.0F / f1;
        i = (int)(0.5F + f2);
        int i2 = 8;
        if (i <= 0) {
          if (f2 >= 0.3F) {
            i = 1;
          } else {
            throw j.a();
          } 
        } else if (i > 8) {
          if (f2 <= 8.7F) {
            i = i2;
          } else {
            throw j.a();
          } 
        } 
        i2 = k / 2;
        if ((k & 0x1) == 0) {
          arrayOfInt[i2] = i;
          arrayOfFloat1[i2] = f2 - i;
        } else {
          arrayOfInt2[i2] = i;
          arrayOfFloat2[i2] = f2 - i;
        } 
      } 
      a(17);
      k = paramc.c();
      if (paramBoolean1) {
        i = 0;
      } else {
        i = 2;
      } 
      int i1 = k * 4 + i + (paramBoolean2 ^ true) - 1;
      int m = arrayOfInt.length - 1;
      i = 0;
      k = 0;
      while (m >= 0) {
        int i2 = i;
        if (a(paramc, paramBoolean1, paramBoolean2)) {
          i2 = o[i1][m * 2];
          i2 = i + arrayOfInt[m] * i2;
        } 
        k += arrayOfInt[m];
        m--;
        i = i2;
      } 
      int n = arrayOfInt2.length - 1;
      for (m = 0; n >= 0; m = i2) {
        int i2 = m;
        if (a(paramc, paramBoolean1, paramBoolean2)) {
          i2 = o[i1][n * 2 + 1];
          i2 = m + arrayOfInt2[n] * i2;
        } 
        n--;
      } 
      if ((k & 0x1) == 0 && k <= 13 && k >= 4) {
        k = (13 - k) / 2;
        int i2 = k[k];
        n = f.a(arrayOfInt, i2, true);
        i2 = f.a(arrayOfInt2, 9 - i2, false);
        return new b(n * l[k] + i2 + m[k], i + m);
      } 
      throw j.a();
    } 
    j j = j.a();
    throw j;
  }
  
  b a(a parama, List<b> paramList, int paramInt) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface size : ()I
    //   6: iconst_2
    //   7: irem
    //   8: ifne -> 17
    //   11: iconst_1
    //   12: istore #7
    //   14: goto -> 20
    //   17: iconst_0
    //   18: istore #7
    //   20: iload #7
    //   22: istore #8
    //   24: aload_0
    //   25: getfield j : Z
    //   28: ifeq -> 37
    //   31: iload #7
    //   33: iconst_1
    //   34: ixor
    //   35: istore #8
    //   37: iconst_m1
    //   38: istore #5
    //   40: iconst_1
    //   41: istore #4
    //   43: aload_0
    //   44: aload_1
    //   45: aload_2
    //   46: iload #5
    //   48: invokespecial b : (Le/f/c/s/a;Ljava/util/List;I)V
    //   51: aload_0
    //   52: aload_1
    //   53: iload_3
    //   54: iload #8
    //   56: invokespecial a : (Le/f/c/s/a;IZ)Le/f/c/w/r/c;
    //   59: astore #9
    //   61: aload #9
    //   63: ifnonnull -> 85
    //   66: aload_1
    //   67: aload_0
    //   68: getfield i : [I
    //   71: iconst_0
    //   72: iaload
    //   73: invokestatic a : (Le/f/c/s/a;I)I
    //   76: istore #5
    //   78: iload #4
    //   80: istore #6
    //   82: goto -> 88
    //   85: iconst_0
    //   86: istore #6
    //   88: iload #6
    //   90: istore #4
    //   92: iload #6
    //   94: ifne -> 43
    //   97: aload_0
    //   98: aload_1
    //   99: aload #9
    //   101: iload #8
    //   103: iconst_1
    //   104: invokevirtual a : (Le/f/c/s/a;Le/f/c/w/r/c;ZZ)Le/f/c/w/r/b;
    //   107: astore #10
    //   109: aload_2
    //   110: invokeinterface isEmpty : ()Z
    //   115: ifne -> 148
    //   118: aload_2
    //   119: aload_2
    //   120: invokeinterface size : ()I
    //   125: iconst_1
    //   126: isub
    //   127: invokeinterface get : (I)Ljava/lang/Object;
    //   132: checkcast e/f/c/w/r/g/b
    //   135: invokevirtual d : ()Z
    //   138: ifne -> 144
    //   141: goto -> 148
    //   144: invokestatic a : ()Le/f/c/j;
    //   147: athrow
    //   148: aload_0
    //   149: aload_1
    //   150: aload #9
    //   152: iload #8
    //   154: iconst_0
    //   155: invokevirtual a : (Le/f/c/s/a;Le/f/c/w/r/c;ZZ)Le/f/c/w/r/b;
    //   158: astore_1
    //   159: goto -> 164
    //   162: aconst_null
    //   163: astore_1
    //   164: new e/f/c/w/r/g/b
    //   167: dup
    //   168: aload #10
    //   170: aload_1
    //   171: aload #9
    //   173: iconst_1
    //   174: invokespecial <init> : (Le/f/c/w/r/b;Le/f/c/w/r/b;Le/f/c/w/r/c;Z)V
    //   177: areturn
    //   178: astore_1
    //   179: goto -> 162
    // Exception table:
    //   from	to	target	type
    //   148	159	178	e/f/c/j
  }
  
  List<b> a(int paramInt, a parama) {
    boolean bool = false;
    while (!bool) {
      try {
        this.g.add(a(parama, this.g, paramInt));
      } catch (j j1) {
        if (!this.g.isEmpty()) {
          bool = true;
          continue;
        } 
        throw j1;
      } 
    } 
    if (h())
      return this.g; 
    boolean bool1 = this.h.isEmpty();
    a(paramInt, false);
    if ((bool1 ^ true) != 0) {
      List<b> list = a(false);
      if (list != null)
        return list; 
      list = a(true);
      if (list != null)
        return list; 
    } 
    j j = j.a();
    throw j;
  }
  
  public void a() {
    this.g.clear();
    this.h.clear();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/r/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */