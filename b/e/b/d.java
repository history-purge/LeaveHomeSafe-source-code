package b.e.b;

import b.e.b.k.d;
import b.e.b.k.e;
import java.util.Arrays;
import java.util.HashMap;

public class d {
  private static int q = 1000;
  
  public static e r;
  
  public static boolean s = true;
  
  public static long t;
  
  public static long u;
  
  int a;
  
  private HashMap<String, i> b;
  
  private a c;
  
  private int d;
  
  private int e;
  
  b[] f;
  
  public boolean g;
  
  public boolean h;
  
  private boolean[] i;
  
  int j;
  
  int k;
  
  private int l;
  
  final c m;
  
  private i[] n;
  
  private int o;
  
  private a p;
  
  public d() {
    b b1;
    this.a = 0;
    this.b = null;
    this.d = 32;
    int j = this.d;
    this.e = j;
    this.f = null;
    this.g = false;
    this.h = false;
    this.i = new boolean[j];
    this.j = 1;
    this.k = 0;
    this.l = j;
    this.n = new i[q];
    this.o = 0;
    this.f = new b[j];
    j();
    this.m = new c();
    this.c = new h(this.m);
    if (s) {
      b1 = new b(this, this.m);
    } else {
      b1 = new b(this.m);
    } 
    this.p = b1;
  }
  
  private final int a(a parama, boolean paramBoolean) {
    e e1 = r;
    if (e1 != null)
      e1.h++; 
    int j;
    for (j = 0; j < this.j; j++)
      this.i[j] = false; 
    boolean bool = false;
    for (j = 0; !bool; j = k) {
      e1 = r;
      if (e1 != null)
        e1.i++; 
      int k = j + 1;
      if (k >= this.j * 2)
        return k; 
      if (parama.getKey() != null)
        this.i[(parama.getKey()).c] = true; 
      i i1 = parama.a(this, this.i);
      if (i1 != null) {
        boolean[] arrayOfBoolean = this.i;
        j = i1.c;
        if (arrayOfBoolean[j])
          return k; 
        arrayOfBoolean[j] = true;
      } 
      if (i1 != null) {
        j = 0;
        int m = -1;
        for (float f = Float.MAX_VALUE; j < this.k; f = f1) {
          float f1;
          int n;
          b b1 = this.f[j];
          if (b1.a.j == i.a.c) {
            n = m;
            f1 = f;
          } else if (b1.f) {
            n = m;
            f1 = f;
          } else {
            n = m;
            f1 = f;
            if (b1.b(i1)) {
              float f2 = b1.e.a(i1);
              n = m;
              f1 = f;
              if (f2 < 0.0F) {
                f2 = -b1.b / f2;
                n = m;
                f1 = f;
                if (f2 < f) {
                  n = j;
                  f1 = f2;
                } 
              } 
            } 
          } 
          j++;
          m = n;
        } 
        j = k;
        if (m > -1) {
          b b1 = this.f[m];
          b1.a.d = -1;
          e e2 = r;
          if (e2 != null)
            e2.j++; 
          b1.d(i1);
          i1 = b1.a;
          i1.d = m;
          i1.c(b1);
          j = k;
        } 
        continue;
      } 
      bool = true;
    } 
    return j;
  }
  
  public static b a(d paramd, i parami1, i parami2, float paramFloat) {
    b b1 = paramd.b();
    b1.a(parami1, parami2, paramFloat);
    return b1;
  }
  
  private i a(i.a parama, String paramString) {
    i i1 = this.m.c.a();
    if (i1 == null) {
      i1 = new i(parama, paramString);
    } else {
      i1.a();
    } 
    i1.a(parama, paramString);
    int j = this.o;
    int k = q;
    if (j >= k) {
      q = k * 2;
      this.n = Arrays.<i>copyOf(this.n, q);
    } 
    i[] arrayOfI = this.n;
    j = this.o;
    this.o = j + 1;
    arrayOfI[j] = i1;
    return i1;
  }
  
  private int b(a parama) {
    boolean bool;
    int j = 0;
    while (true) {
      if (j < this.k) {
        b[] arrayOfB = this.f;
        if ((arrayOfB[j]).a.j != i.a.c && (arrayOfB[j]).b < 0.0F) {
          j = 1;
          break;
        } 
        j++;
        continue;
      } 
      j = 0;
      break;
    } 
    if (j != 0) {
      boolean bool1 = false;
      j = 0;
      while (true) {
        bool = j;
        if (!bool1) {
          e e1 = r;
          if (e1 != null)
            e1.k++; 
          int n = j + 1;
          int m = 0;
          j = -1;
          bool = true;
          float f = Float.MAX_VALUE;
          int k;
          for (k = 0; m < this.k; k = i3) {
            float f1;
            int i1;
            int i2;
            int i3;
            b b1 = this.f[m];
            if (b1.a.j == i.a.c) {
              i1 = j;
              i2 = bool;
              f1 = f;
              i3 = k;
            } else if (b1.f) {
              i1 = j;
              i2 = bool;
              f1 = f;
              i3 = k;
            } else {
              i1 = j;
              i2 = bool;
              f1 = f;
              i3 = k;
              if (b1.b < 0.0F) {
                int i4;
                for (i4 = 1;; i4++) {
                  i1 = j;
                  i2 = bool;
                  f1 = f;
                  i3 = k;
                  if (i4 < this.j) {
                    i i5 = this.m.d[i4];
                    float f2 = b1.e.a(i5);
                    if (f2 <= 0.0F)
                      continue; 
                    i2 = k;
                    i3 = 0;
                    k = bool;
                    i1 = j;
                    j = i3;
                    for (bool = i2;; bool = i2)
                      j++; 
                    j = k;
                    k = bool;
                    bool = j;
                    j = i1;
                    continue;
                  } 
                  break;
                } 
              } 
            } 
            m++;
            j = i1;
            bool = i2;
            f = f1;
          } 
          if (j != -1) {
            b b1 = this.f[j];
            b1.a.d = -1;
            e e2 = r;
            if (e2 != null)
              e2.j++; 
            b1.d(this.m.d[bool]);
            i i1 = b1.a;
            i1.d = j;
            i1.c(b1);
          } else {
            bool1 = true;
          } 
          if (n > this.j / 2)
            bool1 = true; 
          j = n;
          continue;
        } 
        break;
      } 
    } else {
      bool = false;
    } 
    return bool;
  }
  
  private final void b(b paramb) {
    // Byte code:
    //   0: getstatic b/e/b/d.s : Z
    //   3: ifeq -> 38
    //   6: aload_0
    //   7: getfield f : [Lb/e/b/b;
    //   10: astore_3
    //   11: aload_0
    //   12: getfield k : I
    //   15: istore_2
    //   16: aload_3
    //   17: iload_2
    //   18: aaload
    //   19: ifnull -> 76
    //   22: aload_0
    //   23: getfield m : Lb/e/b/c;
    //   26: getfield a : Lb/e/b/f;
    //   29: astore #4
    //   31: aload_3
    //   32: iload_2
    //   33: aaload
    //   34: astore_3
    //   35: goto -> 67
    //   38: aload_0
    //   39: getfield f : [Lb/e/b/b;
    //   42: astore_3
    //   43: aload_0
    //   44: getfield k : I
    //   47: istore_2
    //   48: aload_3
    //   49: iload_2
    //   50: aaload
    //   51: ifnull -> 76
    //   54: aload_0
    //   55: getfield m : Lb/e/b/c;
    //   58: getfield b : Lb/e/b/f;
    //   61: astore #4
    //   63: aload_3
    //   64: iload_2
    //   65: aaload
    //   66: astore_3
    //   67: aload #4
    //   69: aload_3
    //   70: invokeinterface a : (Ljava/lang/Object;)Z
    //   75: pop
    //   76: aload_0
    //   77: getfield f : [Lb/e/b/b;
    //   80: astore_3
    //   81: aload_0
    //   82: getfield k : I
    //   85: istore_2
    //   86: aload_3
    //   87: iload_2
    //   88: aload_1
    //   89: aastore
    //   90: aload_1
    //   91: getfield a : Lb/e/b/i;
    //   94: astore_3
    //   95: aload_3
    //   96: iload_2
    //   97: putfield d : I
    //   100: aload_0
    //   101: iload_2
    //   102: iconst_1
    //   103: iadd
    //   104: putfield k : I
    //   107: aload_3
    //   108: aload_1
    //   109: invokevirtual c : (Lb/e/b/b;)V
    //   112: return
  }
  
  private void g() {
    for (int j = 0; j < this.k; j++) {
      b b1 = this.f[j];
      b1.a.f = b1.b;
    } 
  }
  
  public static e h() {
    return r;
  }
  
  private void i() {
    this.d *= 2;
    this.f = Arrays.<b>copyOf(this.f, this.d);
    c c1 = this.m;
    c1.d = Arrays.<i>copyOf(c1.d, this.d);
    int j = this.d;
    this.i = new boolean[j];
    this.e = j;
    this.l = j;
    e e1 = r;
    if (e1 != null) {
      e1.d++;
      e1.o = Math.max(e1.o, j);
      e1 = r;
      e1.x = e1.o;
    } 
  }
  
  private void j() {
    boolean bool = s;
    int j = 0;
    byte b1 = 0;
    if (bool) {
      j = b1;
      while (true) {
        b[] arrayOfB = this.f;
        if (j < arrayOfB.length) {
          b b2 = arrayOfB[j];
          if (b2 != null)
            this.m.a.a(b2); 
          this.f[j] = null;
          j++;
          continue;
        } 
        break;
      } 
    } else {
      while (true) {
        b[] arrayOfB = this.f;
        if (j < arrayOfB.length) {
          b b2 = arrayOfB[j];
          if (b2 != null)
            this.m.b.a(b2); 
          this.f[j] = null;
          j++;
          continue;
        } 
        break;
      } 
    } 
  }
  
  public b a(i parami1, i parami2, int paramInt1, int paramInt2) {
    if (paramInt2 == 8 && parami2.g && parami1.d == -1) {
      parami1.a(this, parami2.f + paramInt1);
      return null;
    } 
    b b1 = b();
    b1.a(parami1, parami2, paramInt1);
    if (paramInt2 != 8)
      b1.a(this, paramInt2); 
    a(b1);
    return b1;
  }
  
  public i a() {
    e e1 = r;
    if (e1 != null)
      e1.n++; 
    if (this.j + 1 >= this.e)
      i(); 
    i i1 = a(i.a.e, (String)null);
    this.a++;
    this.j++;
    int j = this.a;
    i1.c = j;
    this.m.d[j] = i1;
    return i1;
  }
  
  public i a(int paramInt, String paramString) {
    e e1 = r;
    if (e1 != null)
      e1.l++; 
    if (this.j + 1 >= this.e)
      i(); 
    i i1 = a(i.a.f, paramString);
    this.a++;
    this.j++;
    int j = this.a;
    i1.c = j;
    i1.e = paramInt;
    this.m.d[j] = i1;
    this.c.a(i1);
    return i1;
  }
  
  public i a(Object paramObject) {
    i i1 = null;
    if (paramObject == null)
      return null; 
    if (this.j + 1 >= this.e)
      i(); 
    if (paramObject instanceof d) {
      d d1 = (d)paramObject;
      i1 = d1.d();
      paramObject = i1;
      if (i1 == null) {
        d1.a(this.m);
        paramObject = d1.d();
      } 
      int k = ((i)paramObject).c;
      if (k != -1 && k <= this.a) {
        Object object = paramObject;
        if (this.m.d[k] == null) {
          if (((i)paramObject).c != -1)
            paramObject.a(); 
          this.a++;
          this.j++;
          k = this.a;
          ((i)paramObject).c = k;
          ((i)paramObject).j = i.a.c;
          this.m.d[k] = (i)paramObject;
          return (i)paramObject;
        } 
        return (i)object;
      } 
    } else {
      return i1;
    } 
    if (((i)paramObject).c != -1)
      paramObject.a(); 
    this.a++;
    this.j++;
    int j = this.a;
    ((i)paramObject).c = j;
    ((i)paramObject).j = i.a.c;
    this.m.d[j] = (i)paramObject;
    return (i)paramObject;
  }
  
  public void a(b paramb) {
    if (paramb == null)
      return; 
    e e1 = r;
    if (e1 != null) {
      e1.f++;
      if (paramb.f)
        e1.g++; 
    } 
    if (this.k + 1 >= this.l || this.j + 1 >= this.e)
      i(); 
    boolean bool1 = false;
    boolean bool2 = false;
    if (!paramb.f) {
      paramb.c(this);
      if (paramb.c())
        return; 
      paramb.a();
      bool1 = bool2;
      if (paramb.a(this)) {
        i i1 = a();
        paramb.a = i1;
        b(paramb);
        this.p.a(paramb);
        a(this.p, true);
        if (i1.d == -1) {
          if (paramb.a == i1) {
            i1 = paramb.c(i1);
            if (i1 != null) {
              e e2 = r;
              if (e2 != null)
                e2.j++; 
              paramb.d(i1);
            } 
          } 
          if (!paramb.f)
            paramb.a.c(paramb); 
          this.k--;
        } 
        bool1 = true;
      } 
      if (!paramb.b())
        return; 
    } 
    if (!bool1)
      b(paramb); 
  }
  
  void a(b paramb, int paramInt1, int paramInt2) {
    paramb.a(a(paramInt2, (String)null), paramInt1);
  }
  
  void a(a parama) {
    e e1 = r;
    if (e1 != null) {
      e1.t++;
      e1.u = Math.max(e1.u, this.j);
      e1 = r;
      e1.v = Math.max(e1.v, this.k);
    } 
    b(parama);
    a(parama, false);
    g();
  }
  
  public void a(i parami, int paramInt) {
    int j = parami.d;
    if (j == -1) {
      parami.a(this, paramInt);
      return;
    } 
    if (j != -1) {
      b b3 = this.f[j];
      if (!b3.f)
        if (b3.e.a() == 0) {
          b3.f = true;
        } else {
          b3 = b();
          b3.c(parami, paramInt);
          b1 = b3;
          a(b1);
        }  
      b3.b = paramInt;
      return;
    } 
    b b2 = b();
    b2.b((i)b1, paramInt);
    b b1 = b2;
    a(b1);
  }
  
  public void a(i parami1, i parami2, int paramInt1, float paramFloat, i parami3, i parami4, int paramInt2, int paramInt3) {
    b b1 = b();
    b1.a(parami1, parami2, paramInt1, paramFloat, parami3, parami4, paramInt2);
    if (paramInt3 != 8)
      b1.a(this, paramInt3); 
    a(b1);
  }
  
  public void a(i parami1, i parami2, int paramInt, boolean paramBoolean) {
    b b1 = b();
    i i1 = c();
    i1.e = 0;
    b1.a(parami1, parami2, i1, paramInt);
    a(b1);
  }
  
  public void a(i parami1, i parami2, i parami3, i parami4, float paramFloat, int paramInt) {
    b b1 = b();
    b1.a(parami1, parami2, parami3, parami4, paramFloat);
    if (paramInt != 8)
      b1.a(this, paramInt); 
    a(b1);
  }
  
  public void a(e parame1, e parame2, float paramFloat, int paramInt) {
    i i3 = a(parame1.a(d.b.d));
    i i5 = a(parame1.a(d.b.e));
    i i4 = a(parame1.a(d.b.f));
    i i7 = a(parame1.a(d.b.g));
    i i1 = a(parame2.a(d.b.d));
    i i8 = a(parame2.a(d.b.e));
    i i6 = a(parame2.a(d.b.f));
    i i2 = a(parame2.a(d.b.g));
    b b2 = b();
    double d2 = paramFloat;
    double d3 = Math.sin(d2);
    double d1 = paramInt;
    Double.isNaN(d1);
    b2.b(i5, i7, i8, i2, (float)(d3 * d1));
    a(b2);
    b b1 = b();
    d2 = Math.cos(d2);
    Double.isNaN(d1);
    b1.b(i3, i4, i1, i6, (float)(d2 * d1));
    a(b1);
  }
  
  public int b(Object paramObject) {
    paramObject = ((d)paramObject).d();
    return (paramObject != null) ? (int)(((i)paramObject).f + 0.5F) : 0;
  }
  
  public b b() {
    b b1;
    if (s) {
      b b2 = this.m.a.a();
      b1 = b2;
      if (b2 == null) {
        b1 = new b(this, this.m);
        u++;
        i.b();
        return b1;
      } 
    } else {
      b b2 = this.m.b.a();
      b1 = b2;
      if (b2 == null) {
        b1 = new b(this.m);
        t++;
        i.b();
        return b1;
      } 
    } 
    b1.d();
    i.b();
    return b1;
  }
  
  public void b(i parami1, i parami2, int paramInt1, int paramInt2) {
    b b1 = b();
    i i1 = c();
    i1.e = 0;
    b1.a(parami1, parami2, i1, paramInt1);
    if (paramInt2 != 8)
      a(b1, (int)(b1.e.a(i1) * -1.0F), paramInt2); 
    a(b1);
  }
  
  public void b(i parami1, i parami2, int paramInt, boolean paramBoolean) {
    b b1 = b();
    i i1 = c();
    i1.e = 0;
    b1.b(parami1, parami2, i1, paramInt);
    a(b1);
  }
  
  public i c() {
    e e1 = r;
    if (e1 != null)
      e1.m++; 
    if (this.j + 1 >= this.e)
      i(); 
    i i1 = a(i.a.e, (String)null);
    this.a++;
    this.j++;
    int j = this.a;
    i1.c = j;
    this.m.d[j] = i1;
    return i1;
  }
  
  public void c(i parami1, i parami2, int paramInt1, int paramInt2) {
    b b1 = b();
    i i1 = c();
    i1.e = 0;
    b1.b(parami1, parami2, i1, paramInt1);
    if (paramInt2 != 8)
      a(b1, (int)(b1.e.a(i1) * -1.0F), paramInt2); 
    a(b1);
  }
  
  public c d() {
    return this.m;
  }
  
  public void e() {
    e e1 = r;
    if (e1 != null)
      e1.e++; 
    if (this.g || this.h) {
      e1 = r;
      if (e1 != null)
        e1.q++; 
      byte b1 = 0;
      int j = 0;
      while (true) {
        if (j < this.k) {
          if (!(this.f[j]).f) {
            j = b1;
            break;
          } 
          j++;
          continue;
        } 
        j = 1;
        break;
      } 
      if (j != 0) {
        e1 = r;
        if (e1 != null)
          e1.p++; 
        g();
        return;
      } 
    } 
    a(this.c);
  }
  
  public void f() {
    int j = 0;
    while (true) {
      i i1;
      b b1;
      c c1 = this.m;
      i[] arrayOfI = c1.d;
      if (j < arrayOfI.length) {
        i1 = arrayOfI[j];
        if (i1 != null)
          i1.a(); 
        j++;
        continue;
      } 
      ((c)i1).c.a(this.n, this.o);
      this.o = 0;
      Arrays.fill((Object[])this.m.d, (Object)null);
      HashMap<String, i> hashMap = this.b;
      if (hashMap != null)
        hashMap.clear(); 
      this.a = 0;
      this.c.clear();
      this.j = 1;
      for (j = 0; j < this.k; j++)
        (this.f[j]).c = false; 
      j();
      this.k = 0;
      if (s) {
        b1 = new b(this, this.m);
      } else {
        b1 = new b(this.m);
      } 
      this.p = b1;
      return;
    } 
  }
  
  static interface a {
    i a(d param1d, boolean[] param1ArrayOfboolean);
    
    void a(a param1a);
    
    void a(i param1i);
    
    void clear();
    
    i getKey();
  }
  
  class b extends b {
    public b(d this$0, c param1c) {
      this.e = new j(this, param1c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */