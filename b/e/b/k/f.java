package b.e.b.k;

import b.e.b.d;
import b.e.b.e;
import b.e.b.k.m.b;
import b.e.b.k.m.e;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;

public class f extends l {
  b h0 = new b(this);
  
  public e i0 = new e(this);
  
  protected b.b j0 = null;
  
  private boolean k0 = false;
  
  public e l0;
  
  protected d m0 = new d();
  
  int n0;
  
  int o0;
  
  int p0 = 0;
  
  int q0 = 0;
  
  c[] r0 = new c[4];
  
  c[] s0 = new c[4];
  
  private int t0 = 263;
  
  private boolean u0 = false;
  
  private boolean v0 = false;
  
  private void R() {
    this.p0 = 0;
    this.q0 = 0;
  }
  
  private void d(e parame) {
    int i = this.p0;
    c[] arrayOfC = this.s0;
    if (i + 1 >= arrayOfC.length)
      this.s0 = Arrays.<c>copyOf(arrayOfC, arrayOfC.length * 2); 
    this.s0[this.p0] = new c(parame, 0, O());
    this.p0++;
  }
  
  private void e(e parame) {
    int i = this.q0;
    c[] arrayOfC = this.r0;
    if (i + 1 >= arrayOfC.length)
      this.r0 = Arrays.<c>copyOf(arrayOfC, arrayOfC.length * 2); 
    this.r0[this.q0] = new c(parame, 1, O());
    this.q0++;
  }
  
  public void G() {
    this.m0.f();
    this.n0 = 0;
    this.o0 = 0;
    super.G();
  }
  
  public void H() {
    Object object;
    boolean bool2;
    this.P = 0;
    this.Q = 0;
    int j = Math.max(0, z());
    int k = Math.max(0, j());
    this.u0 = false;
    this.v0 = false;
    if (s(64) || s(128)) {
      i = 1;
    } else {
      i = 0;
    } 
    d d1 = this.m0;
    d1.g = false;
    d1.h = false;
    if (this.t0 != 0 && i)
      d1.h = true; 
    e.b[] arrayOfB = this.J;
    e.b b1 = arrayOfB[1];
    e.b b2 = arrayOfB[0];
    ArrayList<e> arrayList = this.g0;
    if (m() == e.b.d || w() == e.b.d) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    R();
    int m = this.g0.size();
    int i;
    for (i = 0; i < m; i++) {
      e e1 = this.g0.get(i);
      if (e1 instanceof l)
        ((l)e1).H(); 
    } 
    boolean bool1 = false;
    boolean bool = true;
    i = 0;
    while (bool) {
      int i2 = object + 1;
      boolean bool3 = bool;
      try {
        this.m0.f();
        bool3 = bool;
        R();
        bool3 = bool;
        b(this.m0);
        for (int i3 = 0; i3 < m; i3++) {
          bool3 = bool;
          ((e)this.g0.get(i3)).b(this.m0);
        } 
        bool3 = bool;
        bool = d(this.m0);
        bool3 = bool;
        if (bool) {
          bool3 = bool;
          this.m0.e();
          bool3 = bool;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        PrintStream printStream = System.out;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("EXCEPTION : ");
        stringBuilder.append(exception);
        printStream.println(stringBuilder.toString());
      } 
      d d2 = this.m0;
      if (bool3) {
        a(d2, j.a);
      } else {
        c(d2);
        for (int i3 = 0; i3 < m; i3++)
          ((e)this.g0.get(i3)).c(this.m0); 
      } 
      if (bool2 && i2 < 8 && j.a[2]) {
        int i4 = 0;
        int i5 = 0;
        int i3 = 0;
        while (i4 < m) {
          e e1 = this.g0.get(i4);
          i5 = Math.max(i5, e1.P + e1.z());
          i3 = Math.max(i3, e1.Q + e1.j());
          i4++;
        } 
        i4 = Math.max(this.S, i5);
        i3 = Math.max(this.T, i3);
        if (b2 == e.b.d && z() < i4) {
          p(i4);
          this.J[0] = e.b.d;
          bool3 = true;
          i = 1;
        } else {
          bool3 = false;
        } 
        if (b1 == e.b.d && j() < i3) {
          h(i3);
          this.J[1] = e.b.d;
          bool3 = true;
          i = 1;
        } 
      } else {
        bool3 = false;
      } 
      int n = Math.max(this.S, z());
      if (n > z()) {
        p(n);
        this.J[0] = e.b.c;
        bool3 = true;
        i = 1;
      } 
      n = Math.max(this.T, j());
      if (n > j()) {
        h(n);
        this.J[1] = e.b.c;
        bool3 = true;
        i = 1;
      } 
      boolean bool4 = bool3;
      int i1 = i;
      if (i == 0) {
        bool = bool3;
        n = i;
        if (this.J[0] == e.b.d) {
          bool = bool3;
          n = i;
          if (j > 0) {
            bool = bool3;
            n = i;
            if (z() > j) {
              this.u0 = true;
              this.J[0] = e.b.c;
              p(j);
              bool = true;
              n = 1;
            } 
          } 
        } 
        bool4 = bool;
        i1 = n;
        if (this.J[1] == e.b.d) {
          bool4 = bool;
          i1 = n;
          if (k > 0) {
            bool4 = bool;
            i1 = n;
            if (j() > k) {
              this.v0 = true;
              this.J[1] = e.b.c;
              h(k);
              bool = true;
              i = 1;
              continue;
            } 
          } 
        } 
      } 
      bool = bool4;
      i = i1;
      continue;
      object = SYNTHETIC_LOCAL_VARIABLE_6;
    } 
    this.g0 = arrayList;
    if (i != 0) {
      e.b[] arrayOfB1 = this.J;
      arrayOfB1[0] = b2;
      arrayOfB1[1] = b1;
    } 
    a(this.m0.d());
  }
  
  public b.b J() {
    return this.j0;
  }
  
  public int K() {
    return this.t0;
  }
  
  public void L() {
    this.i0.b();
  }
  
  public void M() {
    this.i0.c();
  }
  
  public boolean N() {
    return this.v0;
  }
  
  public boolean O() {
    return this.k0;
  }
  
  public boolean P() {
    return this.u0;
  }
  
  public void Q() {
    this.h0.a(this);
  }
  
  public long a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
    this.n0 = paramInt8;
    this.o0 = paramInt9;
    return this.h0.a(this, paramInt1, paramInt8, paramInt9, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7);
  }
  
  public void a(d paramd, boolean[] paramArrayOfboolean) {
    int i = 0;
    paramArrayOfboolean[2] = false;
    c(paramd);
    int j = this.g0.size();
    while (i < j) {
      ((e)this.g0.get(i)).c(paramd);
      i++;
    } 
  }
  
  void a(e parame, int paramInt) {
    if (paramInt == 0) {
      d(parame);
      return;
    } 
    if (paramInt == 1)
      e(parame); 
  }
  
  public void a(b.b paramb) {
    this.j0 = paramb;
    this.i0.a(paramb);
  }
  
  public void a(boolean paramBoolean1, boolean paramBoolean2) {
    super.a(paramBoolean1, paramBoolean2);
    int j = this.g0.size();
    for (int i = 0; i < j; i++)
      ((e)this.g0.get(i)).a(paramBoolean1, paramBoolean2); 
  }
  
  public boolean a(boolean paramBoolean, int paramInt) {
    return this.i0.a(paramBoolean, paramInt);
  }
  
  public boolean d(d paramd) {
    a(paramd);
    int j = this.g0.size();
    int i = 0;
    boolean bool = false;
    while (i < j) {
      e e1 = this.g0.get(i);
      e1.a(0, false);
      e1.a(1, false);
      if (e1 instanceof a)
        bool = true; 
      i++;
    } 
    if (bool)
      for (i = 0; i < j; i++) {
        e e1 = this.g0.get(i);
        if (e1 instanceof a)
          ((a)e1).K(); 
      }  
    for (i = 0; i < j; i++) {
      e e1 = this.g0.get(i);
      if (e1.b())
        e1.a(paramd); 
    } 
    for (i = 0; i < j; i++) {
      e e1 = this.g0.get(i);
      if (e1 instanceof f) {
        e.b[] arrayOfB = e1.J;
        e.b b1 = arrayOfB[0];
        e.b b2 = arrayOfB[1];
        if (b1 == e.b.d)
          e1.a(e.b.c); 
        if (b2 == e.b.d)
          e1.b(e.b.c); 
        e1.a(paramd);
        if (b1 == e.b.d)
          e1.a(b1); 
        if (b2 == e.b.d)
          e1.b(b2); 
      } else {
        j.a(this, paramd, e1);
        if (!e1.b())
          e1.a(paramd); 
      } 
    } 
    if (this.p0 > 0)
      b.a(this, paramd, 0); 
    if (this.q0 > 0)
      b.a(this, paramd, 1); 
    return true;
  }
  
  public boolean d(boolean paramBoolean) {
    return this.i0.a(paramBoolean);
  }
  
  public boolean e(boolean paramBoolean) {
    return this.i0.b(paramBoolean);
  }
  
  public void f(boolean paramBoolean) {
    this.k0 = paramBoolean;
  }
  
  public boolean s(int paramInt) {
    return ((this.t0 & paramInt) == paramInt);
  }
  
  public void t(int paramInt) {
    this.t0 = paramInt;
    d.s = j.a(paramInt, 256);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */