package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.core.util.d;
import java.util.ArrayList;
import java.util.List;

class a implements j.a {
  private d<b> a = (d<b>)new Pools.SimplePool(30);
  
  final ArrayList<b> b = new ArrayList<b>();
  
  final ArrayList<b> c = new ArrayList<b>();
  
  final a d;
  
  Runnable e;
  
  final boolean f;
  
  final j g;
  
  private int h = 0;
  
  a(a parama) {
    this(parama, false);
  }
  
  a(a parama, boolean paramBoolean) {
    this.d = parama;
    this.f = paramBoolean;
    this.g = new j(this);
  }
  
  private int b(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/util/ArrayList;
    //   4: invokevirtual size : ()I
    //   7: iconst_1
    //   8: isub
    //   9: istore #4
    //   11: iload_1
    //   12: istore_3
    //   13: iload #4
    //   15: iflt -> 355
    //   18: aload_0
    //   19: getfield c : Ljava/util/ArrayList;
    //   22: iload #4
    //   24: invokevirtual get : (I)Ljava/lang/Object;
    //   27: checkcast androidx/recyclerview/widget/a$b
    //   30: astore #7
    //   32: aload #7
    //   34: getfield a : I
    //   37: istore #5
    //   39: iload #5
    //   41: bipush #8
    //   43: if_icmpne -> 259
    //   46: aload #7
    //   48: getfield b : I
    //   51: istore #5
    //   53: aload #7
    //   55: getfield d : I
    //   58: istore_1
    //   59: iload #5
    //   61: iload_1
    //   62: if_icmpge -> 71
    //   65: iload_1
    //   66: istore #6
    //   68: goto -> 78
    //   71: iload #5
    //   73: istore #6
    //   75: iload_1
    //   76: istore #5
    //   78: iload_3
    //   79: iload #5
    //   81: if_icmplt -> 184
    //   84: iload_3
    //   85: iload #6
    //   87: if_icmpgt -> 184
    //   90: aload #7
    //   92: getfield b : I
    //   95: istore_1
    //   96: iload #5
    //   98: iload_1
    //   99: if_icmpne -> 147
    //   102: iload_2
    //   103: iconst_1
    //   104: if_icmpne -> 124
    //   107: aload #7
    //   109: getfield d : I
    //   112: iconst_1
    //   113: iadd
    //   114: istore_1
    //   115: aload #7
    //   117: iload_1
    //   118: putfield d : I
    //   121: goto -> 140
    //   124: iload_2
    //   125: iconst_2
    //   126: if_icmpne -> 140
    //   129: aload #7
    //   131: getfield d : I
    //   134: iconst_1
    //   135: isub
    //   136: istore_1
    //   137: goto -> 115
    //   140: iload_3
    //   141: iconst_1
    //   142: iadd
    //   143: istore_1
    //   144: goto -> 344
    //   147: iload_2
    //   148: iconst_1
    //   149: if_icmpne -> 165
    //   152: iload_1
    //   153: iconst_1
    //   154: iadd
    //   155: istore_1
    //   156: aload #7
    //   158: iload_1
    //   159: putfield b : I
    //   162: goto -> 177
    //   165: iload_2
    //   166: iconst_2
    //   167: if_icmpne -> 177
    //   170: iload_1
    //   171: iconst_1
    //   172: isub
    //   173: istore_1
    //   174: goto -> 156
    //   177: iload_3
    //   178: iconst_1
    //   179: isub
    //   180: istore_1
    //   181: goto -> 344
    //   184: aload #7
    //   186: getfield b : I
    //   189: istore #5
    //   191: iload_3
    //   192: istore_1
    //   193: iload_3
    //   194: iload #5
    //   196: if_icmpge -> 344
    //   199: iload_2
    //   200: iconst_1
    //   201: if_icmpne -> 232
    //   204: aload #7
    //   206: iload #5
    //   208: iconst_1
    //   209: iadd
    //   210: putfield b : I
    //   213: aload #7
    //   215: getfield d : I
    //   218: iconst_1
    //   219: iadd
    //   220: istore_1
    //   221: aload #7
    //   223: iload_1
    //   224: putfield d : I
    //   227: iload_3
    //   228: istore_1
    //   229: goto -> 344
    //   232: iload_3
    //   233: istore_1
    //   234: iload_2
    //   235: iconst_2
    //   236: if_icmpne -> 344
    //   239: aload #7
    //   241: iload #5
    //   243: iconst_1
    //   244: isub
    //   245: putfield b : I
    //   248: aload #7
    //   250: getfield d : I
    //   253: iconst_1
    //   254: isub
    //   255: istore_1
    //   256: goto -> 221
    //   259: aload #7
    //   261: getfield b : I
    //   264: istore #6
    //   266: iload #6
    //   268: iload_3
    //   269: if_icmpgt -> 308
    //   272: iload #5
    //   274: iconst_1
    //   275: if_icmpne -> 289
    //   278: iload_3
    //   279: aload #7
    //   281: getfield d : I
    //   284: isub
    //   285: istore_1
    //   286: goto -> 344
    //   289: iload_3
    //   290: istore_1
    //   291: iload #5
    //   293: iconst_2
    //   294: if_icmpne -> 344
    //   297: iload_3
    //   298: aload #7
    //   300: getfield d : I
    //   303: iadd
    //   304: istore_1
    //   305: goto -> 344
    //   308: iload_2
    //   309: iconst_1
    //   310: if_icmpne -> 329
    //   313: iload #6
    //   315: iconst_1
    //   316: iadd
    //   317: istore_1
    //   318: aload #7
    //   320: iload_1
    //   321: putfield b : I
    //   324: iload_3
    //   325: istore_1
    //   326: goto -> 344
    //   329: iload_3
    //   330: istore_1
    //   331: iload_2
    //   332: iconst_2
    //   333: if_icmpne -> 344
    //   336: iload #6
    //   338: iconst_1
    //   339: isub
    //   340: istore_1
    //   341: goto -> 318
    //   344: iload #4
    //   346: iconst_1
    //   347: isub
    //   348: istore #4
    //   350: iload_1
    //   351: istore_3
    //   352: goto -> 13
    //   355: aload_0
    //   356: getfield c : Ljava/util/ArrayList;
    //   359: invokevirtual size : ()I
    //   362: iconst_1
    //   363: isub
    //   364: istore_1
    //   365: iload_1
    //   366: iflt -> 444
    //   369: aload_0
    //   370: getfield c : Ljava/util/ArrayList;
    //   373: iload_1
    //   374: invokevirtual get : (I)Ljava/lang/Object;
    //   377: checkcast androidx/recyclerview/widget/a$b
    //   380: astore #7
    //   382: aload #7
    //   384: getfield a : I
    //   387: bipush #8
    //   389: if_icmpne -> 414
    //   392: aload #7
    //   394: getfield d : I
    //   397: istore_2
    //   398: iload_2
    //   399: aload #7
    //   401: getfield b : I
    //   404: if_icmpeq -> 422
    //   407: iload_2
    //   408: ifge -> 437
    //   411: goto -> 422
    //   414: aload #7
    //   416: getfield d : I
    //   419: ifgt -> 437
    //   422: aload_0
    //   423: getfield c : Ljava/util/ArrayList;
    //   426: iload_1
    //   427: invokevirtual remove : (I)Ljava/lang/Object;
    //   430: pop
    //   431: aload_0
    //   432: aload #7
    //   434: invokevirtual a : (Landroidx/recyclerview/widget/a$b;)V
    //   437: iload_1
    //   438: iconst_1
    //   439: isub
    //   440: istore_1
    //   441: goto -> 365
    //   444: iload_3
    //   445: ireturn
  }
  
  private void b(b paramb) {
    g(paramb);
  }
  
  private void c(b paramb) {
    g(paramb);
  }
  
  private void d(b paramb) {
    int n = paramb.b;
    int k = paramb.d + n;
    int m = 0;
    byte b1 = -1;
    int i = n;
    while (i < k) {
      int i1;
      if (this.d.a(i) != null || d(i)) {
        if (b1 == 0) {
          f(a(2, n, m, null));
          i1 = 1;
        } else {
          i1 = 0;
        } 
        b1 = 1;
      } else {
        if (b1 == 1) {
          g(a(2, n, m, null));
          b1 = 1;
        } else {
          b1 = 0;
        } 
        boolean bool = false;
        i1 = b1;
        b1 = bool;
      } 
      if (i1 != 0) {
        i -= m;
        k -= m;
        i1 = 1;
      } else {
        i1 = m + 1;
      } 
      i++;
      m = i1;
    } 
    b b2 = paramb;
    if (m != paramb.d) {
      a(paramb);
      b2 = a(2, n, m, null);
    } 
    if (b1 == 0) {
      f(b2);
      return;
    } 
    g(b2);
  }
  
  private boolean d(int paramInt) {
    int k = this.c.size();
    for (int i = 0; i < k; i++) {
      b b = this.c.get(i);
      int m = b.a;
      if (m == 8) {
        if (a(b.d, i + 1) == paramInt)
          return true; 
      } else if (m == 1) {
        int n = b.b;
        int i1 = b.d;
        for (m = n; m < i1 + n; m++) {
          if (a(m, i + 1) == paramInt)
            return true; 
        } 
      } 
    } 
    return false;
  }
  
  private void e(b paramb) {
    int n = paramb.b;
    int i2 = paramb.d;
    int k = n;
    int i = 0;
    int i1 = -1;
    int m = n;
    while (m < i2 + n) {
      int i3;
      int i4;
      if (this.d.a(m) != null || d(m)) {
        i4 = i;
        int i5 = k;
        if (i1 == 0) {
          f(a(4, k, i, paramb.c));
          i5 = m;
          i4 = 0;
        } 
        i3 = 1;
        k = i5;
      } else {
        i4 = i;
        i3 = k;
        if (i1 == 1) {
          g(a(4, k, i, paramb.c));
          i3 = m;
          i4 = 0;
        } 
        i = 0;
        k = i3;
        i3 = i;
      } 
      i = i4 + 1;
      m++;
      i1 = i3;
    } 
    Object object = paramb;
    if (i != paramb.d) {
      object = paramb.c;
      a(paramb);
      object = a(4, k, i, object);
    } 
    if (i1 == 0) {
      f((b)object);
      return;
    } 
    g((b)object);
  }
  
  private void f(b paramb) {
    int i = paramb.a;
    if (i != 1 && i != 8) {
      byte b1;
      int n = b(paramb.b, i);
      i = paramb.b;
      int k = paramb.a;
      if (k != 2) {
        if (k == 4) {
          b1 = 1;
        } else {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("op should be remove or update.");
          stringBuilder.append(paramb);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
      } else {
        b1 = 0;
      } 
      int m = 1;
      int i1;
      for (i1 = 1; m < paramb.d; i1 = k) {
        int i2 = b(paramb.b + b1 * m, paramb.a);
        k = paramb.a;
        if ((k != 2) ? (k == 4 && i2 == n + 1) : (i2 == n)) {
          k = 1;
        } else {
          k = 0;
        } 
        if (k != 0) {
          k = i1 + 1;
        } else {
          b b2 = a(paramb.a, n, i1, paramb.c);
          a(b2, i);
          a(b2);
          k = i;
          if (paramb.a == 4)
            k = i + i1; 
          n = i2;
          i1 = 1;
          i = k;
          k = i1;
        } 
        m++;
      } 
      Object object = paramb.c;
      a(paramb);
      if (i1 > 0) {
        paramb = a(paramb.a, n, i1, object);
        a(paramb, i);
        a(paramb);
      } 
      return;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("should not dispatch add or move for pre layout");
    throw illegalArgumentException;
  }
  
  private void g(b paramb) {
    this.c.add(paramb);
    int i = paramb.a;
    if (i != 1) {
      if (i != 2) {
        if (i != 4) {
          if (i == 8) {
            this.d.a(paramb.b, paramb.d);
            return;
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown update op type for ");
          stringBuilder.append(paramb);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        this.d.a(paramb.b, paramb.d, paramb.c);
        return;
      } 
      this.d.b(paramb.b, paramb.d);
      return;
    } 
    this.d.c(paramb.b, paramb.d);
  }
  
  public int a(int paramInt) {
    int m = this.b.size();
    int k = 0;
    int i;
    for (i = paramInt; k < m; i = paramInt) {
      b b = this.b.get(k);
      paramInt = b.a;
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 8) {
            paramInt = i;
          } else {
            paramInt = b.b;
            if (paramInt == i) {
              paramInt = b.d;
            } else {
              int n = i;
              if (paramInt < i)
                n = i - 1; 
              paramInt = n;
              if (b.d <= n)
                paramInt = n + 1; 
            } 
          } 
        } else {
          int n = b.b;
          paramInt = i;
          if (n <= i) {
            paramInt = b.d;
            if (n + paramInt > i)
              return -1; 
            paramInt = i - paramInt;
          } 
        } 
      } else {
        paramInt = i;
        if (b.b <= i)
          paramInt = i + b.d; 
      } 
      k++;
    } 
    return i;
  }
  
  int a(int paramInt1, int paramInt2) {
    int k = this.c.size();
    int i = paramInt2;
    for (paramInt2 = paramInt1; i < k; paramInt2 = paramInt1) {
      b b = this.c.get(i);
      int m = b.a;
      if (m == 8) {
        paramInt1 = b.b;
        if (paramInt1 == paramInt2) {
          paramInt1 = b.d;
        } else {
          int n = paramInt2;
          if (paramInt1 < paramInt2)
            n = paramInt2 - 1; 
          paramInt1 = n;
          if (b.d <= n)
            paramInt1 = n + 1; 
        } 
      } else {
        int n = b.b;
        paramInt1 = paramInt2;
        if (n <= paramInt2)
          if (m == 2) {
            paramInt1 = b.d;
            if (paramInt2 < n + paramInt1)
              return -1; 
            paramInt1 = paramInt2 - paramInt1;
          } else {
            paramInt1 = paramInt2;
            if (m == 1)
              paramInt1 = paramInt2 + b.d; 
          }  
      } 
      i++;
    } 
    return paramInt2;
  }
  
  public b a(int paramInt1, int paramInt2, int paramInt3, Object paramObject) {
    b b = (b)this.a.a();
    if (b == null)
      return new b(paramInt1, paramInt2, paramInt3, paramObject); 
    b.a = paramInt1;
    b.b = paramInt2;
    b.d = paramInt3;
    b.c = paramObject;
    return b;
  }
  
  void a() {
    int k = this.c.size();
    for (int i = 0; i < k; i++)
      this.d.a(this.c.get(i)); 
    a(this.c);
    this.h = 0;
  }
  
  public void a(b paramb) {
    if (!this.f) {
      paramb.c = null;
      this.a.a(paramb);
    } 
  }
  
  void a(b paramb, int paramInt) {
    this.d.b(paramb);
    int i = paramb.a;
    if (i != 2) {
      if (i == 4) {
        this.d.a(paramInt, paramb.d, paramb.c);
        return;
      } 
      throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
    } 
    this.d.d(paramInt, paramb.d);
  }
  
  void a(List<b> paramList) {
    int k = paramList.size();
    for (int i = 0; i < k; i++)
      a(paramList.get(i)); 
    paramList.clear();
  }
  
  int b(int paramInt) {
    return a(paramInt, 0);
  }
  
  void b() {
    a();
    int k = this.b.size();
    for (int i = 0; i < k; i++) {
      b b = this.b.get(i);
      int m = b.a;
      if (m != 1) {
        if (m != 2) {
          if (m != 4) {
            if (m == 8) {
              this.d.a(b);
              this.d.a(b.b, b.d);
            } 
          } else {
            this.d.a(b);
            this.d.a(b.b, b.d, b.c);
          } 
        } else {
          this.d.a(b);
          this.d.d(b.b, b.d);
        } 
      } else {
        this.d.a(b);
        this.d.c(b.b, b.d);
      } 
      Runnable runnable = this.e;
      if (runnable != null)
        runnable.run(); 
    } 
    a(this.b);
    this.h = 0;
  }
  
  boolean c() {
    return (this.b.size() > 0);
  }
  
  boolean c(int paramInt) {
    return ((paramInt & this.h) != 0);
  }
  
  boolean d() {
    return (!this.c.isEmpty() && !this.b.isEmpty());
  }
  
  void e() {
    this.g.a(this.b);
    int k = this.b.size();
    for (int i = 0; i < k; i++) {
      b b = this.b.get(i);
      int m = b.a;
      if (m != 1) {
        if (m != 2) {
          if (m != 4) {
            if (m == 8)
              c(b); 
          } else {
            e(b);
          } 
        } else {
          d(b);
        } 
      } else {
        b(b);
      } 
      Runnable runnable = this.e;
      if (runnable != null)
        runnable.run(); 
    } 
    this.b.clear();
  }
  
  void f() {
    a(this.b);
    a(this.c);
    this.h = 0;
  }
  
  static interface a {
    RecyclerView.d0 a(int param1Int);
    
    void a(int param1Int1, int param1Int2);
    
    void a(int param1Int1, int param1Int2, Object param1Object);
    
    void a(a.b param1b);
    
    void b(int param1Int1, int param1Int2);
    
    void b(a.b param1b);
    
    void c(int param1Int1, int param1Int2);
    
    void d(int param1Int1, int param1Int2);
  }
  
  static class b {
    int a;
    
    int b;
    
    Object c;
    
    int d;
    
    b(int param1Int1, int param1Int2, int param1Int3, Object param1Object) {
      this.a = param1Int1;
      this.b = param1Int2;
      this.d = param1Int3;
      this.c = param1Object;
    }
    
    String a() {
      int i = this.a;
      return (i != 1) ? ((i != 2) ? ((i != 4) ? ((i != 8) ? "??" : "mv") : "up") : "rm") : "add";
    }
    
    public boolean equals(Object param1Object) {
      if (this == param1Object)
        return true; 
      if (param1Object != null) {
        if (b.class != param1Object.getClass())
          return false; 
        b b1 = (b)param1Object;
        int i = this.a;
        if (i != b1.a)
          return false; 
        if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == b1.b && this.b == b1.d)
          return true; 
        if (this.d != b1.d)
          return false; 
        if (this.b != b1.b)
          return false; 
        param1Object = this.c;
        Object object = b1.c;
        if (param1Object != null) {
          if (!param1Object.equals(object))
            return false; 
        } else if (object != null) {
          return false;
        } 
        return true;
      } 
      return false;
    }
    
    public int hashCode() {
      return (this.a * 31 + this.b) * 31 + this.d;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append("[");
      stringBuilder.append(a());
      stringBuilder.append(",s:");
      stringBuilder.append(this.b);
      stringBuilder.append("c:");
      stringBuilder.append(this.d);
      stringBuilder.append(",p:");
      stringBuilder.append(this.c);
      stringBuilder.append("]");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */