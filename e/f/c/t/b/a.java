package e.f.c.t.b;

import e.f.c.f;
import e.f.c.s.b;

final class a {
  private final b a;
  
  private final b b;
  
  private final e c;
  
  a(b paramb) {
    int i = paramb.c();
    if (i >= 8 && i <= 144 && (i & 0x1) == 0) {
      this.c = b(paramb);
      this.a = a(paramb);
      this.b = new b(this.a.f(), this.a.c());
      return;
    } 
    throw f.a();
  }
  
  private int a(int paramInt1, int paramInt2) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  private b a(b paramb) {
    int j = this.c.e();
    int i = this.c.d();
    if (paramb.c() == j) {
      int k = this.c.b();
      int m = this.c.a();
      int n = j / k;
      int i1 = i / m;
      b b1 = new b(i1 * m, n * k);
      for (i = 0; i < n; i++) {
        for (j = 0; j < i1; j++) {
          int i2;
          for (i2 = 0; i2 < k; i2++) {
            int i3;
            for (i3 = 0; i3 < m; i3++) {
              if (paramb.b((m + 2) * j + 1 + i3, (k + 2) * i + 1 + i2))
                b1.c(j * m + i3, i * k + i2); 
            } 
          } 
        } 
      } 
      return b1;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Dimension of bitMatrix must match the version size");
    throw illegalArgumentException;
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = paramInt1;
    int j = paramInt2;
    if (paramInt1 < 0) {
      i = paramInt1 + paramInt3;
      j = paramInt2 + 4 - (paramInt3 + 4 & 0x7);
    } 
    paramInt2 = i;
    paramInt1 = j;
    if (j < 0) {
      paramInt1 = j + paramInt4;
      paramInt2 = i + 4 - (paramInt4 + 4 & 0x7);
    } 
    this.b.c(paramInt1, paramInt2);
    return this.a.b(paramInt1, paramInt2);
  }
  
  private int b(int paramInt1, int paramInt2) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  private static e b(b paramb) {
    return e.a(paramb.c(), paramb.f());
  }
  
  private int c(int paramInt1, int paramInt2) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  private int d(int paramInt1, int paramInt2) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:659)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e2expr(TypeTransformer.java:629)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:716)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  e a() {
    return this.c;
  }
  
  byte[] b() {
    Object object1;
    Object object2;
    Object object3;
    Object object4;
    Object object5;
    Object object6;
    Object object7;
    f f;
    byte[] arrayOfByte = new byte[this.c.f()];
    int i = this.a.c();
    int j = this.a.f();
    byte b1 = 4;
    boolean bool2 = false;
    boolean bool6 = false;
    boolean bool1 = false;
    boolean bool5 = false;
    boolean bool4 = false;
    boolean bool3 = false;
    while (true) {
      int i2;
      int i3;
      if (object3 == i && object2 == null && object7 == null) {
        f[object1] = (byte)a(i, j);
        int i4 = object3 - 2;
        m = object2 + 2;
        n = object1 + 1;
        boolean bool = true;
        Object object14 = object6;
        Object object15 = object5;
        Object object16 = object4;
        continue;
      } 
      int k = i - 2;
      if (object3 == k && object2 == null && (j & 0x3) != 0 && object6 == null) {
        f[object1] = (byte)b(i, j);
        k = object3 - 2;
        m = object2 + 2;
        n = object1 + 1;
        boolean bool = true;
        Object object14 = object7;
        Object object15 = object5;
        Object object16 = object4;
        continue;
      } 
      if (object3 == i + 4 && object2 == 2 && (j & 0x7) == 0 && object5 == null) {
        f[object1] = (byte)c(i, j);
        k = object3 - 2;
        m = object2 + 2;
        n = object1 + 1;
        boolean bool = true;
        Object object14 = object7;
        Object object15 = object6;
        Object object16 = object4;
        continue;
      } 
      Object object8 = object3;
      Object object9 = object2;
      Object object10 = object1;
      if (object3 == k) {
        object8 = object3;
        object9 = object2;
        object10 = object1;
        if (object2 == null) {
          object8 = object3;
          object9 = object2;
          object10 = object1;
          if ((j & 0x7) == 4) {
            object8 = object3;
            object9 = object2;
            object10 = object1;
            if (object4 == null) {
              f[object1] = (byte)d(i, j);
              k = object3 - 2;
              m = object2 + 2;
              n = object1 + 1;
              boolean bool = true;
              object10 = object7;
              Object object14 = object6;
              Object object15 = object5;
              continue;
            } 
          } 
        } 
      } 
      while (true) {
        Object object = object10;
        if (m < i) {
          object = object10;
          if (n >= 0) {
            object = object10;
            if (!this.b.b(n, m)) {
              f[object10] = (byte)b(m, n, i, j);
              k = object10 + 1;
            } 
          } 
        } 
        i2 = m - 2;
        i1 = n + 2;
        if (i2 >= 0) {
          m = i2;
          n = i1;
          int i4 = k;
          if (i1 >= j)
            break; 
          continue;
        } 
        break;
      } 
      int n = i2 + 1;
      i1 += 3;
      int m = k;
      k = i1;
      int i1 = n;
      while (true) {
        n = m;
        if (i1 >= 0) {
          n = m;
          if (k < j) {
            n = m;
            if (!this.b.b(k, i1)) {
              f[m] = (byte)b(i1, k, i, j);
              n = m + 1;
            } 
          } 
        } 
        i3 = i1 + 2;
        i2 = k - 2;
        if (i3 < i) {
          i1 = i3;
          k = i2;
          m = n;
          if (i2 < 0)
            break; 
          continue;
        } 
        break;
      } 
      k = i3 + 3;
      m = i2 + 1;
      Object object13 = object4;
      Object object12 = object5;
      Object object11 = object6;
      object10 = object7;
      continue;
      object3 = SYNTHETIC_LOCAL_VARIABLE_1;
      object2 = SYNTHETIC_LOCAL_VARIABLE_2;
      object7 = SYNTHETIC_LOCAL_VARIABLE_11;
      object1 = SYNTHETIC_LOCAL_VARIABLE_3;
      object6 = SYNTHETIC_LOCAL_VARIABLE_12;
      object5 = SYNTHETIC_LOCAL_VARIABLE_13;
      object4 = SYNTHETIC_LOCAL_VARIABLE_14;
      if (SYNTHETIC_LOCAL_VARIABLE_1 >= i) {
        object3 = SYNTHETIC_LOCAL_VARIABLE_1;
        object2 = SYNTHETIC_LOCAL_VARIABLE_2;
        object7 = SYNTHETIC_LOCAL_VARIABLE_11;
        object1 = SYNTHETIC_LOCAL_VARIABLE_3;
        object6 = SYNTHETIC_LOCAL_VARIABLE_12;
        object5 = SYNTHETIC_LOCAL_VARIABLE_13;
        object4 = SYNTHETIC_LOCAL_VARIABLE_14;
        if (SYNTHETIC_LOCAL_VARIABLE_2 >= j) {
          if (SYNTHETIC_LOCAL_VARIABLE_3 == this.c.f())
            return arrayOfByte; 
          f = f.a();
          throw f;
        } 
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/t/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */