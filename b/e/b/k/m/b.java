package b.e.b.k.m;

import b.e.b.d;
import b.e.b.e;
import b.e.b.k.d;
import b.e.b.k.e;
import b.e.b.k.f;
import b.e.b.k.j;
import b.e.b.k.k;
import b.e.b.k.l;
import java.util.ArrayList;

public class b {
  private final ArrayList<e> a = new ArrayList<e>();
  
  private a b = new a();
  
  private f c;
  
  public b(f paramf) {
    this.c = paramf;
  }
  
  private void a(f paramf, String paramString, int paramInt1, int paramInt2) {
    int i = paramf.r();
    int j = paramf.q();
    paramf.m(0);
    paramf.l(0);
    paramf.p(paramInt1);
    paramf.h(paramInt2);
    paramf.m(i);
    paramf.l(j);
    this.c.H();
  }
  
  private boolean a(b paramb, e parame, boolean paramBoolean) {
    boolean bool1;
    boolean bool2;
    this.b.a = parame.m();
    this.b.b = parame.w();
    this.b.c = parame.z();
    this.b.d = parame.j();
    a a2 = this.b;
    a2.i = false;
    a2.j = paramBoolean;
    if (a2.a == e.b.e) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (this.b.b == e.b.e) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool2 && parame.N > 0.0F) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool1 && parame.N > 0.0F) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool2 && parame.l[0] == 4)
      this.b.a = e.b.c; 
    if (bool1 && parame.l[1] == 4)
      this.b.b = e.b.c; 
    paramb.a(parame, this.b);
    parame.p(this.b.e);
    parame.h(this.b.f);
    parame.a(this.b.h);
    parame.g(this.b.g);
    a a1 = this.b;
    a1.j = false;
    return a1.i;
  }
  
  private void b(f paramf) {
    int j = ((l)paramf).g0.size();
    b b1 = paramf.J();
    for (int i = 0; i < j; i++) {
      e e = ((l)paramf).g0.get(i);
      if (!(e instanceof b.e.b.k.g) && (!e.d.e.j || !e.e.e.j)) {
        e.b b2 = e.b(0);
        boolean bool = true;
        e.b b3 = e.b(1);
        e.b b4 = e.b.e;
        if (b2 != b4 || e.j == 1 || b3 != b4 || e.k == 1)
          bool = false; 
        if (!bool) {
          a(b1, e, false);
          e e1 = paramf.l0;
          if (e1 != null)
            e1.a++; 
        } 
      } 
    } 
    b1.a();
  }
  
  public long a(f paramf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9) {
    boolean bool;
    b b1 = paramf.J();
    paramInt9 = ((l)paramf).g0.size();
    int i = paramf.z();
    int j = paramf.j();
    boolean bool1 = j.a(paramInt1, 128);
    if (bool1 || j.a(paramInt1, 64)) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    paramInt3 = paramInt1;
    if (paramInt1 != 0) {
      paramInt2 = 0;
      while (true) {
        paramInt3 = paramInt1;
        if (paramInt2 < paramInt9) {
          e e = ((l)paramf).g0.get(paramInt2);
          if (e.m() == e.b.e) {
            paramInt3 = 1;
          } else {
            paramInt3 = 0;
          } 
          if (e.w() == e.b.e) {
            paramInt8 = 1;
          } else {
            paramInt8 = 0;
          } 
          if (paramInt3 != 0 && paramInt8 != 0 && e.h() > 0.0F) {
            paramInt3 = 1;
          } else {
            paramInt3 = 0;
          } 
          if ((e.D() && paramInt3 != 0) || (e.F() && paramInt3 != 0) || e instanceof k || e.D() || e.F()) {
            paramInt3 = 0;
            break;
          } 
          paramInt2++;
          continue;
        } 
        break;
      } 
    } 
    if (paramInt3 != 0) {
      e e = d.r;
      if (e != null)
        e.c++; 
    } 
    if ((paramInt4 == 1073741824 && paramInt6 == 1073741824) || bool1) {
      paramInt1 = 1;
    } else {
      paramInt1 = 0;
    } 
    if ((paramInt3 & paramInt1) != 0) {
      boolean bool2;
      paramInt1 = Math.min(paramf.p(), paramInt5);
      paramInt2 = Math.min(paramf.o(), paramInt7);
      if (paramInt4 == 1073741824 && paramf.z() != paramInt1) {
        paramf.p(paramInt1);
        paramf.L();
      } 
      if (paramInt6 == 1073741824 && paramf.j() != paramInt2) {
        paramf.h(paramInt2);
        paramf.L();
      } 
      if (paramInt4 == 1073741824 && paramInt6 == 1073741824) {
        bool2 = paramf.d(bool1);
        paramInt1 = 2;
      } else {
        boolean bool3 = paramf.e(bool1);
        if (paramInt4 == 1073741824) {
          bool3 &= paramf.a(bool1, 0);
          paramInt2 = 1;
        } else {
          paramInt2 = 0;
        } 
        bool2 = bool3;
        paramInt1 = paramInt2;
        if (paramInt6 == 1073741824) {
          bool2 = bool3 & paramf.a(bool1, 1);
          paramInt1 = paramInt2 + 1;
        } 
      } 
      bool = bool2;
      paramInt2 = paramInt1;
      if (bool2) {
        if (paramInt4 == 1073741824) {
          bool = true;
        } else {
          bool = false;
        } 
        if (paramInt6 == 1073741824) {
          bool1 = true;
        } else {
          bool1 = false;
        } 
        paramf.a(bool, bool1);
        bool = bool2;
        paramInt2 = paramInt1;
      } 
    } else {
      bool = false;
      paramInt2 = 0;
    } 
    if (!bool || paramInt2 != 2) {
      int k;
      if (paramInt9 > 0)
        b(paramf); 
      paramInt3 = paramf.K();
      int m = this.a.size();
      if (paramInt9 > 0)
        a(paramf, "First pass", i, j); 
      paramInt1 = paramInt3;
      if (m > 0) {
        boolean bool2;
        int i1;
        if (paramf.m() == e.b.d) {
          paramInt8 = 1;
        } else {
          paramInt8 = 0;
        } 
        if (paramf.w() == e.b.d) {
          paramInt9 = 1;
        } else {
          paramInt9 = 0;
        } 
        paramInt2 = Math.max(paramf.z(), this.c.r());
        paramInt1 = Math.max(paramf.j(), this.c.q());
        int n = 0;
        paramInt6 = 0;
        paramInt4 = j;
        paramInt5 = i;
        while (n < m) {
          e e = this.a.get(n);
          if (e instanceof k) {
            int i2 = e.z();
            i = e.j();
            boolean bool3 = paramInt6 | a(b1, e, true);
            e e1 = paramf.l0;
            if (e1 != null)
              e1.b++; 
            int i3 = e.z();
            j = e.j();
            paramInt6 = paramInt2;
            if (i3 != i2) {
              e.p(i3);
              paramInt6 = paramInt2;
              if (paramInt8 != 0) {
                paramInt6 = paramInt2;
                if (e.t() > paramInt2)
                  paramInt6 = Math.max(paramInt2, e.t() + e.a(d.b.f).a()); 
              } 
              bool3 = true;
            } 
            paramInt2 = paramInt1;
            if (j != i) {
              e.h(j);
              paramInt2 = paramInt1;
              if (paramInt9 != 0) {
                paramInt2 = paramInt1;
                if (e.e() > paramInt1)
                  paramInt2 = Math.max(paramInt1, e.e() + e.a(d.b.g).a()); 
              } 
              bool3 = true;
            } 
            bool3 = ((k)e).I() | bool3;
            paramInt1 = paramInt2;
            paramInt2 = paramInt6;
            bool2 = bool3;
          } 
          n++;
        } 
        j = 0;
        paramInt7 = paramInt4;
        n = paramInt5;
        i = paramInt1;
        paramInt4 = m;
        paramInt5 = j;
        while (paramInt5 < 2) {
          int i2;
          j = 0;
          paramInt1 = i;
          i = paramInt5;
          while (j < paramInt4) {
            e e = this.a.get(j);
            if ((!(e instanceof b.e.b.k.h) || e instanceof k) && !(e instanceof b.e.b.k.g) && e.y() != 8 && (!e.d.e.j || !e.e.e.j) && !(e instanceof k)) {
              int i5;
              paramInt5 = e.z();
              int i7 = e.j();
              m = e.d();
              int i10 = a(b1, e, true);
              e e1 = paramf.l0;
              if (e1 != null)
                e1.b++; 
              int i9 = e.z();
              int i8 = e.j();
              if (i9 != paramInt5) {
                e.p(i9);
                paramInt5 = paramInt2;
                if (paramInt8 != 0) {
                  paramInt5 = paramInt2;
                  if (e.t() > paramInt2)
                    paramInt5 = Math.max(paramInt2, e.t() + e.a(d.b.f).a()); 
                } 
                paramInt6 = 1;
                paramInt2 = paramInt5;
              } else {
                bool2 = paramInt6 | i10;
              } 
              int i6 = paramInt1;
              if (i8 != i7) {
                e.h(i8);
                int i11 = paramInt1;
                if (paramInt9 != 0) {
                  int i12 = paramInt1;
                  if (e.e() > paramInt1)
                    i5 = Math.max(paramInt1, e.e() + e.a(d.b.g).a()); 
                } 
                bool2 = true;
              } 
              if (e.C() && m != e.d()) {
                bool2 = true;
                i2 = i5;
              } else {
                i2 = i5;
              } 
            } 
            int i4 = j + 1;
          } 
          if (bool2) {
            a(paramf, "intermediate pass", n, paramInt7);
            bool2 = false;
          } 
          int i3 = i + 1;
          i1 = i2;
        } 
        if (bool2) {
          boolean bool3;
          a(paramf, "2nd pass", n, paramInt7);
          if (paramf.z() < paramInt2) {
            paramf.p(paramInt2);
            bool3 = true;
          } else {
            bool3 = false;
          } 
          if (paramf.j() < i1) {
            paramf.h(i1);
            bool3 = true;
          } 
          if (bool3)
            a(paramf, "3rd pass", n, paramInt7); 
        } 
        k = paramInt3;
      } 
      paramf.t(k);
    } 
    return 0L;
  }
  
  public void a(f paramf) {
    this.a.clear();
    int j = ((l)paramf).g0.size();
    for (int i = 0; i < j; i++) {
      e e = ((l)paramf).g0.get(i);
      if (e.m() == e.b.e || e.m() == e.b.f || e.w() == e.b.e || e.w() == e.b.f)
        this.a.add(e); 
    } 
    paramf.L();
  }
  
  public static class a {
    public e.b a;
    
    public e.b b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    public int g;
    
    public boolean h;
    
    public boolean i;
    
    public boolean j;
  }
  
  public static interface b {
    void a();
    
    void a(e param1e, b.a param1a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */