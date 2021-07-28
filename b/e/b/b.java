package b.e.b;

import java.util.ArrayList;

public class b implements d.a {
  i a = null;
  
  float b = 0.0F;
  
  boolean c;
  
  ArrayList<i> d = new ArrayList<i>();
  
  public a e;
  
  boolean f = false;
  
  public b() {}
  
  public b(c paramc) {
    this.e = new a(this, paramc);
  }
  
  private i a(boolean[] paramArrayOfboolean, i parami) {
    // Byte code:
    //   0: aload_0
    //   1: getfield e : Lb/e/b/b$a;
    //   4: invokeinterface a : ()I
    //   9: istore #7
    //   11: aconst_null
    //   12: astore #8
    //   14: iconst_0
    //   15: istore #6
    //   17: fconst_0
    //   18: fstore_3
    //   19: iload #6
    //   21: iload #7
    //   23: if_icmpge -> 168
    //   26: aload_0
    //   27: getfield e : Lb/e/b/b$a;
    //   30: iload #6
    //   32: invokeinterface a : (I)F
    //   37: fstore #5
    //   39: aload #8
    //   41: astore #9
    //   43: fload_3
    //   44: fstore #4
    //   46: fload #5
    //   48: fconst_0
    //   49: fcmpg
    //   50: ifge -> 152
    //   53: aload_0
    //   54: getfield e : Lb/e/b/b$a;
    //   57: iload #6
    //   59: invokeinterface b : (I)Lb/e/b/i;
    //   64: astore #10
    //   66: aload_1
    //   67: ifnull -> 87
    //   70: aload #8
    //   72: astore #9
    //   74: fload_3
    //   75: fstore #4
    //   77: aload_1
    //   78: aload #10
    //   80: getfield c : I
    //   83: baload
    //   84: ifne -> 152
    //   87: aload #8
    //   89: astore #9
    //   91: fload_3
    //   92: fstore #4
    //   94: aload #10
    //   96: aload_2
    //   97: if_acmpeq -> 152
    //   100: aload #10
    //   102: getfield j : Lb/e/b/i$a;
    //   105: astore #11
    //   107: aload #11
    //   109: getstatic b/e/b/i$a.e : Lb/e/b/i$a;
    //   112: if_acmpeq -> 130
    //   115: aload #8
    //   117: astore #9
    //   119: fload_3
    //   120: fstore #4
    //   122: aload #11
    //   124: getstatic b/e/b/i$a.f : Lb/e/b/i$a;
    //   127: if_acmpne -> 152
    //   130: aload #8
    //   132: astore #9
    //   134: fload_3
    //   135: fstore #4
    //   137: fload #5
    //   139: fload_3
    //   140: fcmpg
    //   141: ifge -> 152
    //   144: fload #5
    //   146: fstore #4
    //   148: aload #10
    //   150: astore #9
    //   152: iload #6
    //   154: iconst_1
    //   155: iadd
    //   156: istore #6
    //   158: aload #9
    //   160: astore #8
    //   162: fload #4
    //   164: fstore_3
    //   165: goto -> 19
    //   168: aload #8
    //   170: areturn
  }
  
  private boolean a(i parami, d paramd) {
    return (parami.m <= 1);
  }
  
  public b a(float paramFloat1, float paramFloat2, float paramFloat3, i parami1, i parami2, i parami3, i parami4) {
    this.b = 0.0F;
    if (paramFloat2 == 0.0F || paramFloat1 == paramFloat3) {
      this.e.a(parami1, 1.0F);
      this.e.a(parami2, -1.0F);
      this.e.a(parami4, 1.0F);
      this.e.a(parami3, -1.0F);
      return this;
    } 
    if (paramFloat1 == 0.0F) {
      this.e.a(parami1, 1.0F);
      this.e.a(parami2, -1.0F);
      return this;
    } 
    if (paramFloat3 == 0.0F) {
      this.e.a(parami3, 1.0F);
      this.e.a(parami4, -1.0F);
      return this;
    } 
    paramFloat1 = paramFloat1 / paramFloat2 / paramFloat3 / paramFloat2;
    this.e.a(parami1, 1.0F);
    this.e.a(parami2, -1.0F);
    this.e.a(parami4, paramFloat1);
    this.e.a(parami3, -paramFloat1);
    return this;
  }
  
  public b a(d paramd, int paramInt) {
    this.e.a(paramd.a(paramInt, "ep"), 1.0F);
    this.e.a(paramd.a(paramInt, "em"), -1.0F);
    return this;
  }
  
  b a(i parami, int paramInt) {
    this.e.a(parami, paramInt);
    return this;
  }
  
  b a(i parami1, i parami2, float paramFloat) {
    this.e.a(parami1, -1.0F);
    this.e.a(parami2, paramFloat);
    return this;
  }
  
  public b a(i parami1, i parami2, int paramInt) {
    int j = 0;
    int k = 0;
    if (paramInt != 0) {
      j = k;
      k = paramInt;
      if (paramInt < 0) {
        k = paramInt * -1;
        j = 1;
      } 
      this.b = k;
    } 
    if (j == 0) {
      this.e.a(parami1, -1.0F);
      this.e.a(parami2, 1.0F);
      return this;
    } 
    this.e.a(parami1, 1.0F);
    this.e.a(parami2, -1.0F);
    return this;
  }
  
  b a(i parami1, i parami2, int paramInt1, float paramFloat, i parami3, i parami4, int paramInt2) {
    if (parami2 == parami3) {
      this.e.a(parami1, 1.0F);
      this.e.a(parami4, 1.0F);
      this.e.a(parami2, -2.0F);
      return this;
    } 
    if (paramFloat == 0.5F) {
      this.e.a(parami1, 1.0F);
      this.e.a(parami2, -1.0F);
      this.e.a(parami3, -1.0F);
      this.e.a(parami4, 1.0F);
      if (paramInt1 > 0 || paramInt2 > 0) {
        paramInt1 = -paramInt1 + paramInt2;
      } else {
        return this;
      } 
    } else {
      if (paramFloat <= 0.0F) {
        this.e.a(parami1, -1.0F);
        this.e.a(parami2, 1.0F);
        paramFloat = paramInt1;
        this.b = paramFloat;
        return this;
      } 
      if (paramFloat >= 1.0F) {
        this.e.a(parami4, -1.0F);
        this.e.a(parami3, 1.0F);
        paramInt1 = -paramInt2;
      } else {
        a a1 = this.e;
        float f = 1.0F - paramFloat;
        a1.a(parami1, f * 1.0F);
        this.e.a(parami2, f * -1.0F);
        this.e.a(parami3, -1.0F * paramFloat);
        this.e.a(parami4, 1.0F * paramFloat);
        if (paramInt1 > 0 || paramInt2 > 0) {
          paramFloat = -paramInt1 * f + paramInt2 * paramFloat;
          this.b = paramFloat;
          return this;
        } 
        return this;
      } 
    } 
    paramFloat = paramInt1;
    this.b = paramFloat;
    return this;
  }
  
  public b a(i parami1, i parami2, i parami3, int paramInt) {
    int j = 0;
    int k = 0;
    if (paramInt != 0) {
      j = k;
      k = paramInt;
      if (paramInt < 0) {
        k = paramInt * -1;
        j = 1;
      } 
      this.b = k;
    } 
    if (j == 0) {
      this.e.a(parami1, -1.0F);
      this.e.a(parami2, 1.0F);
      this.e.a(parami3, 1.0F);
      return this;
    } 
    this.e.a(parami1, 1.0F);
    this.e.a(parami2, -1.0F);
    this.e.a(parami3, -1.0F);
    return this;
  }
  
  public b a(i parami1, i parami2, i parami3, i parami4, float paramFloat) {
    this.e.a(parami1, -1.0F);
    this.e.a(parami2, 1.0F);
    this.e.a(parami3, paramFloat);
    this.e.a(parami4, -paramFloat);
    return this;
  }
  
  public i a(d paramd, boolean[] paramArrayOfboolean) {
    return a(paramArrayOfboolean, (i)null);
  }
  
  void a() {
    float f = this.b;
    if (f < 0.0F) {
      this.b = f * -1.0F;
      this.e.b();
    } 
  }
  
  public void a(b paramb, boolean paramBoolean) {
    float f = this.e.a(paramb, paramBoolean);
    this.b += paramb.b * f;
    if (paramBoolean)
      paramb.a.b(this); 
  }
  
  public void a(d.a parama) {
    if (parama instanceof b) {
      parama = parama;
      this.a = null;
      this.e.clear();
      for (int j = 0; j < ((b)parama).e.a(); j++) {
        i i1 = ((b)parama).e.b(j);
        float f = ((b)parama).e.a(j);
        this.e.a(i1, f, true);
      } 
    } 
  }
  
  public void a(d paramd, i parami, boolean paramBoolean) {
    if (!parami.g)
      return; 
    float f = this.e.a(parami);
    this.b += parami.f * f;
    this.e.a(parami, paramBoolean);
    if (paramBoolean)
      parami.b(this); 
  }
  
  public void a(i parami) {
    int j = parami.e;
    float f = 1.0F;
    if (j != 1)
      if (j == 2) {
        f = 1000.0F;
      } else if (j == 3) {
        f = 1000000.0F;
      } else if (j == 4) {
        f = 1.0E9F;
      } else if (j == 5) {
        f = 1.0E12F;
      }  
    this.e.a(parami, f);
  }
  
  boolean a(d paramd) {
    boolean bool;
    i i1 = b(paramd);
    if (i1 == null) {
      bool = true;
    } else {
      d(i1);
      bool = false;
    } 
    if (this.e.a() == 0)
      this.f = true; 
    return bool;
  }
  
  b b(i parami, int paramInt) {
    this.a = parami;
    float f = paramInt;
    parami.f = f;
    this.b = f;
    this.f = true;
    return this;
  }
  
  public b b(i parami1, i parami2, i parami3, int paramInt) {
    int j = 0;
    int k = 0;
    if (paramInt != 0) {
      j = k;
      k = paramInt;
      if (paramInt < 0) {
        k = paramInt * -1;
        j = 1;
      } 
      this.b = k;
    } 
    if (j == 0) {
      this.e.a(parami1, -1.0F);
      this.e.a(parami2, 1.0F);
      this.e.a(parami3, -1.0F);
      return this;
    } 
    this.e.a(parami1, 1.0F);
    this.e.a(parami2, -1.0F);
    this.e.a(parami3, 1.0F);
    return this;
  }
  
  public b b(i parami1, i parami2, i parami3, i parami4, float paramFloat) {
    this.e.a(parami3, 0.5F);
    this.e.a(parami4, 0.5F);
    this.e.a(parami1, -0.5F);
    this.e.a(parami2, -0.5F);
    this.b = -paramFloat;
    return this;
  }
  
  i b(d paramd) {
    int k = this.e.a();
    i i2 = null;
    int j = 0;
    i i1 = null;
    float f2 = 0.0F;
    boolean bool1 = false;
    float f1 = 0.0F;
    boolean bool;
    for (bool = false; j < k; bool = bool3) {
      float f4;
      float f5;
      boolean bool2;
      boolean bool3;
      i i4;
      i i5;
      float f3 = this.e.a(j);
      i i3 = this.e.b(j);
      if (i3.j == i.a.c) {
        if (i2 == null || f2 > f3) {
          bool2 = a(i3, paramd);
          i4 = i3;
          i5 = i1;
          f4 = f3;
          f5 = f1;
          bool3 = bool;
        } else {
          i4 = i2;
          i5 = i1;
          f4 = f2;
          bool2 = bool1;
          f5 = f1;
          bool3 = bool;
          if (!bool1) {
            i4 = i2;
            i5 = i1;
            f4 = f2;
            bool2 = bool1;
            f5 = f1;
            bool3 = bool;
            if (a(i3, paramd)) {
              bool2 = true;
              i4 = i3;
              i5 = i1;
              f4 = f3;
              f5 = f1;
              bool3 = bool;
            } 
          } 
        } 
      } else {
        i4 = i2;
        i5 = i1;
        f4 = f2;
        bool2 = bool1;
        f5 = f1;
        bool3 = bool;
        if (i2 == null) {
          i4 = i2;
          i5 = i1;
          f4 = f2;
          bool2 = bool1;
          f5 = f1;
          bool3 = bool;
          if (f3 < 0.0F)
            if (i1 == null || f1 > f3) {
              bool3 = a(i3, paramd);
              i4 = i2;
              i5 = i3;
              f4 = f2;
              bool2 = bool1;
              f5 = f3;
            } else {
              i4 = i2;
              i5 = i1;
              f4 = f2;
              bool2 = bool1;
              f5 = f1;
              bool3 = bool;
              if (!bool) {
                i4 = i2;
                i5 = i1;
                f4 = f2;
                bool2 = bool1;
                f5 = f1;
                bool3 = bool;
                if (a(i3, paramd)) {
                  bool3 = true;
                  f5 = f3;
                  bool2 = bool1;
                  f4 = f2;
                  i5 = i3;
                  i4 = i2;
                } 
              } 
            }  
        } 
      } 
      j++;
      i2 = i4;
      i1 = i5;
      f2 = f4;
      bool1 = bool2;
      f1 = f5;
    } 
    return (i2 != null) ? i2 : i1;
  }
  
  boolean b() {
    i i1 = this.a;
    return (i1 != null && (i1.j == i.a.c || this.b >= 0.0F));
  }
  
  boolean b(i parami) {
    return this.e.b(parami);
  }
  
  public b c(i parami, int paramInt) {
    float f;
    a a1;
    if (paramInt < 0) {
      this.b = (paramInt * -1);
      a1 = this.e;
      f = 1.0F;
    } else {
      this.b = paramInt;
      a1 = this.e;
      f = -1.0F;
    } 
    a1.a(parami, f);
    return this;
  }
  
  public i c(i parami) {
    return a((boolean[])null, parami);
  }
  
  public void c(d paramd) {
    if (paramd.f.length == 0)
      return; 
    for (boolean bool = false; !bool; bool = true) {
      int k = this.e.a();
      for (int j = 0; j < k; j++) {
        i i1 = this.e.b(j);
        if (i1.d != -1 || i1.g)
          this.d.add(i1); 
      } 
      if (this.d.size() > 0) {
        for (i i1 : this.d) {
          if (i1.g) {
            a(paramd, i1, true);
            continue;
          } 
          a(paramd.f[i1.d], true);
        } 
        this.d.clear();
        continue;
      } 
    } 
  }
  
  public boolean c() {
    return (this.a == null && this.b == 0.0F && this.e.a() == 0);
  }
  
  public void clear() {
    this.e.clear();
    this.a = null;
    this.b = 0.0F;
  }
  
  public void d() {
    this.a = null;
    this.e.clear();
    this.b = 0.0F;
    this.f = false;
  }
  
  void d(i parami) {
    i i1 = this.a;
    if (i1 != null) {
      this.e.a(i1, -1.0F);
      this.a = null;
    } 
    float f = this.e.a(parami, true) * -1.0F;
    this.a = parami;
    if (f == 1.0F)
      return; 
    this.b /= f;
    this.e.a(f);
  }
  
  String e() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Lb/e/b/i;
    //   4: ifnonnull -> 35
    //   7: new java/lang/StringBuilder
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: astore #6
    //   16: aload #6
    //   18: ldc ''
    //   20: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: pop
    //   24: aload #6
    //   26: ldc '0'
    //   28: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   31: pop
    //   32: goto -> 62
    //   35: new java/lang/StringBuilder
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: astore #6
    //   44: aload #6
    //   46: ldc ''
    //   48: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: pop
    //   52: aload #6
    //   54: aload_0
    //   55: getfield a : Lb/e/b/i;
    //   58: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload #6
    //   64: invokevirtual toString : ()Ljava/lang/String;
    //   67: astore #6
    //   69: new java/lang/StringBuilder
    //   72: dup
    //   73: invokespecial <init> : ()V
    //   76: astore #7
    //   78: aload #7
    //   80: aload #6
    //   82: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: pop
    //   86: aload #7
    //   88: ldc ' = '
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload #7
    //   96: invokevirtual toString : ()Ljava/lang/String;
    //   99: astore #6
    //   101: aload_0
    //   102: getfield b : F
    //   105: fstore_1
    //   106: iconst_0
    //   107: istore #4
    //   109: fload_1
    //   110: fconst_0
    //   111: fcmpl
    //   112: ifeq -> 154
    //   115: new java/lang/StringBuilder
    //   118: dup
    //   119: invokespecial <init> : ()V
    //   122: astore #7
    //   124: aload #7
    //   126: aload #6
    //   128: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: pop
    //   132: aload #7
    //   134: aload_0
    //   135: getfield b : F
    //   138: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   141: pop
    //   142: aload #7
    //   144: invokevirtual toString : ()Ljava/lang/String;
    //   147: astore #6
    //   149: iconst_1
    //   150: istore_3
    //   151: goto -> 156
    //   154: iconst_0
    //   155: istore_3
    //   156: aload_0
    //   157: getfield e : Lb/e/b/b$a;
    //   160: invokeinterface a : ()I
    //   165: istore #5
    //   167: iload #4
    //   169: iload #5
    //   171: if_icmpge -> 427
    //   174: aload_0
    //   175: getfield e : Lb/e/b/b$a;
    //   178: iload #4
    //   180: invokeinterface b : (I)Lb/e/b/i;
    //   185: astore #7
    //   187: aload #7
    //   189: ifnonnull -> 195
    //   192: goto -> 418
    //   195: aload_0
    //   196: getfield e : Lb/e/b/b$a;
    //   199: iload #4
    //   201: invokeinterface a : (I)F
    //   206: fstore_2
    //   207: fload_2
    //   208: fconst_0
    //   209: fcmpl
    //   210: ifne -> 216
    //   213: goto -> 418
    //   216: aload #7
    //   218: invokevirtual toString : ()Ljava/lang/String;
    //   221: astore #8
    //   223: iload_3
    //   224: ifne -> 263
    //   227: aload #6
    //   229: astore #7
    //   231: fload_2
    //   232: fstore_1
    //   233: fload_2
    //   234: fconst_0
    //   235: fcmpg
    //   236: ifge -> 347
    //   239: new java/lang/StringBuilder
    //   242: dup
    //   243: invokespecial <init> : ()V
    //   246: astore #7
    //   248: aload #7
    //   250: aload #6
    //   252: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   255: pop
    //   256: ldc '- '
    //   258: astore #6
    //   260: goto -> 327
    //   263: fload_2
    //   264: fconst_0
    //   265: fcmpl
    //   266: ifle -> 306
    //   269: new java/lang/StringBuilder
    //   272: dup
    //   273: invokespecial <init> : ()V
    //   276: astore #7
    //   278: aload #7
    //   280: aload #6
    //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: aload #7
    //   288: ldc ' + '
    //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: aload #7
    //   296: invokevirtual toString : ()Ljava/lang/String;
    //   299: astore #7
    //   301: fload_2
    //   302: fstore_1
    //   303: goto -> 347
    //   306: new java/lang/StringBuilder
    //   309: dup
    //   310: invokespecial <init> : ()V
    //   313: astore #7
    //   315: aload #7
    //   317: aload #6
    //   319: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   322: pop
    //   323: ldc ' - '
    //   325: astore #6
    //   327: aload #7
    //   329: aload #6
    //   331: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   334: pop
    //   335: aload #7
    //   337: invokevirtual toString : ()Ljava/lang/String;
    //   340: astore #7
    //   342: fload_2
    //   343: ldc -1.0
    //   345: fmul
    //   346: fstore_1
    //   347: fload_1
    //   348: fconst_1
    //   349: fcmpl
    //   350: ifne -> 365
    //   353: new java/lang/StringBuilder
    //   356: dup
    //   357: invokespecial <init> : ()V
    //   360: astore #6
    //   362: goto -> 393
    //   365: new java/lang/StringBuilder
    //   368: dup
    //   369: invokespecial <init> : ()V
    //   372: astore #6
    //   374: aload #6
    //   376: aload #7
    //   378: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: pop
    //   382: aload #6
    //   384: fload_1
    //   385: invokevirtual append : (F)Ljava/lang/StringBuilder;
    //   388: pop
    //   389: ldc ' '
    //   391: astore #7
    //   393: aload #6
    //   395: aload #7
    //   397: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   400: pop
    //   401: aload #6
    //   403: aload #8
    //   405: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   408: pop
    //   409: aload #6
    //   411: invokevirtual toString : ()Ljava/lang/String;
    //   414: astore #6
    //   416: iconst_1
    //   417: istore_3
    //   418: iload #4
    //   420: iconst_1
    //   421: iadd
    //   422: istore #4
    //   424: goto -> 167
    //   427: aload #6
    //   429: astore #7
    //   431: iload_3
    //   432: ifne -> 467
    //   435: new java/lang/StringBuilder
    //   438: dup
    //   439: invokespecial <init> : ()V
    //   442: astore #7
    //   444: aload #7
    //   446: aload #6
    //   448: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   451: pop
    //   452: aload #7
    //   454: ldc '0.0'
    //   456: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   459: pop
    //   460: aload #7
    //   462: invokevirtual toString : ()Ljava/lang/String;
    //   465: astore #7
    //   467: aload #7
    //   469: areturn
  }
  
  public i getKey() {
    return this.a;
  }
  
  public String toString() {
    return e();
  }
  
  public static interface a {
    float a(int param1Int);
    
    float a(b param1b, boolean param1Boolean);
    
    float a(i param1i);
    
    float a(i param1i, boolean param1Boolean);
    
    int a();
    
    void a(float param1Float);
    
    void a(i param1i, float param1Float);
    
    void a(i param1i, float param1Float, boolean param1Boolean);
    
    i b(int param1Int);
    
    void b();
    
    boolean b(i param1i);
    
    void clear();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */