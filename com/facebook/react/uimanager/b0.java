package com.facebook.react.uimanager;

import com.facebook.yoga.a;
import com.facebook.yoga.c;
import com.facebook.yoga.g;
import com.facebook.yoga.h;
import com.facebook.yoga.i;
import com.facebook.yoga.j;
import com.facebook.yoga.k;
import com.facebook.yoga.l;
import com.facebook.yoga.m;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.s;
import com.facebook.yoga.t;
import com.facebook.yoga.v;
import com.facebook.yoga.w;
import e.e.m.a.a;
import java.util.ArrayList;
import java.util.Arrays;

public class b0 implements a0<b0> {
  private static final c z = d0.a();
  
  private int c;
  
  private String d;
  
  private int e;
  
  private k0 f;
  
  private boolean g;
  
  private boolean h = true;
  
  private ArrayList<b0> i;
  
  private b0 j;
  
  private b0 k;
  
  private boolean l;
  
  private int m = 0;
  
  private b0 n;
  
  private ArrayList<b0> o;
  
  private int p;
  
  private int q;
  
  private int r;
  
  private int s;
  
  private final i0 t = new i0(0.0F);
  
  private final float[] u = new float[9];
  
  private final boolean[] v = new boolean[9];
  
  private p w;
  
  private Integer x;
  
  private Integer y;
  
  public b0() {
    if (!y()) {
      p p2 = (p)d1.a().a();
      p p1 = p2;
      if (p2 == null)
        p1 = q.a(z); 
      this.w = p1;
      this.w.a(this);
      Arrays.fill(this.u, Float.NaN);
      return;
    } 
    this.w = null;
  }
  
  private int Q() {
    l l1 = i();
    l l2 = l.e;
    int i = 1;
    if (l1 == l2)
      return this.m; 
    if (l1 == l.d)
      i = 1 + this.m; 
    return i;
  }
  
  private void R() {
    int i = 0;
    while (true) {
      float f;
      p p1;
      j j;
      if (i <= 8) {
        if ((i == 5) ? (g.a(this.u[i]) && g.a(this.u[6]) && g.a(this.u[8])) : ((i == 3) ? (g.a(this.u[i]) && g.a(this.u[7]) && g.a(this.u[8])) : g.a(this.u[i]))) {
          p1 = this.w;
          j = j.f(i);
          f = this.t.b(i);
        } else {
          if (this.v[i]) {
            this.w.e(j.f(i), this.u[i]);
          } else {
            p1 = this.w;
            j = j.f(i);
            f = this.u[i];
            p1.d(j, f);
          } 
          i++;
          continue;
        } 
      } else {
        break;
      } 
      p1.d(j, f);
    } 
  }
  
  private void h(int paramInt) {
    if (i() != l.c)
      for (b0 b01 = getParent(); b01 != null; b01 = b01.getParent()) {
        b01.m += paramInt;
        if (b01.i() == l.c)
          return; 
      }  
  }
  
  public final b0 A() {
    return this.n;
  }
  
  public final boolean B() {
    return this.l;
  }
  
  public final float C() {
    return this.w.f();
  }
  
  public final h D() {
    return this.w.c();
  }
  
  public final boolean E() {
    p p1 = this.w;
    return (p1 != null && p1.j());
  }
  
  public boolean F() {
    return false;
  }
  
  public final boolean G() {
    p p1 = this.w;
    return (p1 != null && p1.k());
  }
  
  public boolean H() {
    return this.w.l();
  }
  
  public boolean I() {
    return false;
  }
  
  public boolean J() {
    return H();
  }
  
  public final void K() {
    p p1 = this.w;
    if (p1 != null)
      p1.m(); 
  }
  
  public void L() {
    if (this.h)
      return; 
    this.h = true;
    b0 b01 = getParent();
    if (b01 != null)
      b01.L(); 
  }
  
  public void M() {}
  
  public void N() {
    this.w.o();
  }
  
  public void O() {
    this.w.p();
  }
  
  public void P() {
    this.w.q();
  }
  
  public final int a() {
    ArrayList<b0> arrayList = this.i;
    return (arrayList == null) ? 0 : arrayList.size();
  }
  
  public final int a(b0 paramb0) {
    boolean bool1;
    boolean bool2 = false;
    int j = 0;
    int i = 0;
    while (true) {
      bool1 = bool2;
      if (j < a()) {
        b0 b01 = a(j);
        if (paramb0 == b01) {
          bool1 = true;
          break;
        } 
        i += b01.Q();
        j++;
        continue;
      } 
      break;
    } 
    if (bool1)
      return i; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Child ");
    stringBuilder.append(paramb0.t());
    stringBuilder.append(" was not a child of ");
    stringBuilder.append(this.c);
    RuntimeException runtimeException = new RuntimeException(stringBuilder.toString());
    throw runtimeException;
  }
  
  public final b0 a(int paramInt) {
    ArrayList<b0> arrayList = this.i;
    if (arrayList != null)
      return arrayList.get(paramInt); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Index ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" out of bounds: node has no children");
    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public void a(float paramFloat) {
    this.w.g(paramFloat);
  }
  
  public void a(float paramFloat1, float paramFloat2) {
    this.w.a(paramFloat1, paramFloat2);
  }
  
  public void a(int paramInt, float paramFloat) {
    this.w.a(j.f(paramInt), paramFloat);
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.x = Integer.valueOf(paramInt1);
    this.y = Integer.valueOf(paramInt2);
  }
  
  public void a(b0 paramb0, int paramInt) {
    if (this.i == null)
      this.i = new ArrayList<b0>(4); 
    this.i.add(paramInt, paramb0);
    paramb0.j = this;
    if (this.w != null && !J()) {
      p p1 = paramb0.w;
      if (p1 != null) {
        this.w.a(p1, paramInt);
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '");
        stringBuilder.append(paramb0.toString());
        stringBuilder.append("' to a '");
        stringBuilder.append(toString());
        stringBuilder.append("')");
        throw new RuntimeException(stringBuilder.toString());
      } 
    } 
    L();
    paramInt = paramb0.Q();
    this.m += paramInt;
    h(paramInt);
  }
  
  public final void a(c0 paramc0) {
    z0.a(this, paramc0);
    M();
  }
  
  public void a(k0 paramk0) {
    this.f = paramk0;
  }
  
  public void a(n paramn) {}
  
  public void a(v0 paramv0) {}
  
  public void a(a parama) {
    this.w.a(parama);
  }
  
  public void a(h paramh) {
    this.w.a(paramh);
  }
  
  public void a(i parami) {
    this.w.a(parami);
  }
  
  public void a(k paramk) {
    this.w.a(paramk);
  }
  
  public void a(l paraml) {
    this.w.a(paraml);
  }
  
  public void a(m paramm) {
    this.w.a(paramm);
  }
  
  public void a(s params) {
    this.w.a(params);
  }
  
  public void a(t paramt) {
    this.w.a(paramt);
  }
  
  public void a(w paramw) {
    this.w.a(paramw);
  }
  
  public void a(Object paramObject) {}
  
  public final void a(String paramString) {
    this.d = paramString;
  }
  
  public final void a(boolean paramBoolean) {
    boolean bool1;
    b0 b01 = getParent();
    boolean bool2 = true;
    if (b01 == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    a.a(bool1, "Must remove from no opt parent first");
    if (this.n == null) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    a.a(bool1, "Must remove from native parent first");
    if (z() == 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    a.a(bool1, "Must remove all native children first");
    this.l = paramBoolean;
  }
  
  public boolean a(float paramFloat1, float paramFloat2, v0 paramv0, n paramn) {
    if (this.h)
      a(paramv0); 
    boolean bool = E();
    boolean bool2 = false;
    boolean bool1 = false;
    if (bool) {
      float f1 = u();
      float f2 = p();
      paramFloat1 += f1;
      int i1 = Math.round(paramFloat1);
      paramFloat2 += f2;
      int k = Math.round(paramFloat2);
      int i2 = Math.round(paramFloat1 + C());
      int m = Math.round(paramFloat2 + l());
      int i = Math.round(f1);
      int j = Math.round(f2);
      i1 = i2 - i1;
      k = m - k;
      if (i != this.p || j != this.q || i1 != this.r || k != this.s)
        bool1 = true; 
      this.p = i;
      this.q = j;
      this.r = i1;
      this.s = k;
      bool2 = bool1;
      if (bool1) {
        if (paramn != null) {
          paramn.b(this);
          return bool1;
        } 
        paramv0.a(getParent().t(), t(), q(), g(), b(), c());
        bool2 = bool1;
      } 
    } 
    return bool2;
  }
  
  public int b() {
    return this.r;
  }
  
  public final int b(b0 paramb0) {
    ArrayList<b0> arrayList = this.i;
    return (arrayList == null) ? -1 : arrayList.indexOf(paramb0);
  }
  
  public b0 b(int paramInt) {
    ArrayList<b0> arrayList = this.i;
    if (arrayList != null) {
      b0 b01 = arrayList.remove(paramInt);
      b01.j = null;
      if (this.w != null && !J())
        this.w.a(paramInt); 
      L();
      paramInt = b01.Q();
      this.m -= paramInt;
      h(-paramInt);
      return b01;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Index ");
    stringBuilder.append(paramInt);
    stringBuilder.append(" out of bounds: node has no children");
    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public void b(float paramFloat) {
    this.w.q(paramFloat);
  }
  
  public void b(int paramInt, float paramFloat) {
    this.t.a(paramInt, paramFloat);
    R();
  }
  
  public final void b(b0 paramb0, int paramInt) {
    boolean bool1;
    l l1 = i();
    l l2 = l.c;
    boolean bool2 = true;
    if (l1 == l2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    a.a(bool1);
    if (paramb0.i() != l.e) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    a.a(bool1);
    if (this.o == null)
      this.o = new ArrayList<b0>(4); 
    this.o.add(paramInt, paramb0);
    paramb0.n = this;
  }
  
  public void b(a parama) {
    this.w.b(parama);
  }
  
  public int c() {
    return this.s;
  }
  
  public final int c(b0 paramb0) {
    a.a(this.o);
    return this.o.indexOf(paramb0);
  }
  
  public void c(float paramFloat) {
    this.w.c(paramFloat);
  }
  
  public void c(int paramInt) {
    this.c = paramInt;
  }
  
  public void c(int paramInt, float paramFloat) {
    this.w.b(j.f(paramInt), paramFloat);
  }
  
  public void c(a parama) {
    this.w.c(parama);
  }
  
  public final b0 d(int paramInt) {
    a.a(this.o);
    b0 b01 = this.o.remove(paramInt);
    b01.n = null;
    return b01;
  }
  
  public final v d() {
    return this.w.i();
  }
  
  public void d(float paramFloat) {
    this.w.d(paramFloat);
  }
  
  public void d(int paramInt, float paramFloat) {
    this.w.c(j.f(paramInt), paramFloat);
  }
  
  public boolean d(b0 paramb0) {
    for (b0 b01 = getParent(); b01 != null; b01 = b01.getParent()) {
      if (b01 == paramb0)
        return true; 
    } 
    return false;
  }
  
  public void dispose() {
    p p1 = this.w;
    if (p1 != null) {
      p1.n();
      d1.a().a(this.w);
    } 
  }
  
  public final void e() {
    this.h = false;
    if (E())
      K(); 
  }
  
  public void e(float paramFloat) {
    this.w.a(paramFloat);
  }
  
  public final void e(int paramInt) {
    this.e = paramInt;
  }
  
  public void e(int paramInt, float paramFloat) {
    this.u[paramInt] = paramFloat;
    this.v[paramInt] = false;
    R();
  }
  
  public final void e(b0 paramb0) {
    this.k = paramb0;
  }
  
  public final float f(int paramInt) {
    return this.w.a(j.f(paramInt));
  }
  
  public void f() {
    if (!y()) {
      this.w.a();
      return;
    } 
    if (getParent() != null)
      getParent().f(); 
  }
  
  public void f(float paramFloat) {
    this.w.h(paramFloat);
  }
  
  public void f(int paramInt, float paramFloat) {
    this.u[paramInt] = paramFloat;
    this.v[paramInt] = g.a(paramFloat) ^ true;
    R();
  }
  
  public int g() {
    return this.q;
  }
  
  public void g(float paramFloat) {
    this.w.i(paramFloat);
  }
  
  public void g(int paramInt) {
    this.w.b(j.f(paramInt));
  }
  
  public void g(int paramInt, float paramFloat) {
    this.w.f(j.f(paramInt), paramFloat);
  }
  
  public Integer getHeightMeasureSpec() {
    return this.y;
  }
  
  public final b0 getParent() {
    return this.j;
  }
  
  public Integer getWidthMeasureSpec() {
    return this.x;
  }
  
  public final k0 h() {
    k0 k01 = this.f;
    a.a(k01);
    return k01;
  }
  
  public void h(float paramFloat) {
    this.w.j(paramFloat);
  }
  
  public void h(int paramInt, float paramFloat) {
    this.w.g(j.f(paramInt), paramFloat);
  }
  
  public l i() {
    return (y() || B()) ? l.e : (F() ? l.d : l.c);
  }
  
  public void i(float paramFloat) {
    this.w.k(paramFloat);
  }
  
  public final int j() {
    boolean bool;
    if (this.e != 0) {
      bool = true;
    } else {
      bool = false;
    } 
    a.a(bool);
    return this.e;
  }
  
  public void j(float paramFloat) {
    this.w.l(paramFloat);
  }
  
  public void k(float paramFloat) {
    this.w.m(paramFloat);
  }
  
  public final boolean k() {
    return this.g;
  }
  
  public final float l() {
    return this.w.d();
  }
  
  public void l(float paramFloat) {
    this.w.n(paramFloat);
  }
  
  public final String m() {
    String str = this.d;
    a.a(str);
    return str;
  }
  
  public void m(float paramFloat) {
    this.w.o(paramFloat);
  }
  
  public void n(float paramFloat) {
    this.w.p(paramFloat);
  }
  
  public final boolean n() {
    return (this.h || E() || G());
  }
  
  public final v o() {
    return this.w.b();
  }
  
  public void o(float paramFloat) {
    this.w.r(paramFloat);
  }
  
  public final float p() {
    return this.w.h();
  }
  
  public int q() {
    return this.p;
  }
  
  public Iterable<? extends a0> r() {
    return (Iterable)(I() ? null : this.i);
  }
  
  public void s() {
    if (a() == 0)
      return; 
    int j = 0;
    for (int i = a() - 1; i >= 0; i--) {
      if (this.w != null && !J())
        this.w.a(i); 
      b0 b01 = a(i);
      b01.j = null;
      j += b01.Q();
      b01.dispose();
    } 
    ArrayList<b0> arrayList = this.i;
    a.a(arrayList);
    arrayList.clear();
    L();
    this.m -= j;
    h(-j);
  }
  
  public void setFlex(float paramFloat) {
    this.w.b(paramFloat);
  }
  
  public void setFlexGrow(float paramFloat) {
    this.w.e(paramFloat);
  }
  
  public void setFlexShrink(float paramFloat) {
    this.w.f(paramFloat);
  }
  
  public void setShouldNotifyOnLayout(boolean paramBoolean) {
    this.g = paramBoolean;
  }
  
  public final int t() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    stringBuilder.append(this.d);
    stringBuilder.append(" ");
    stringBuilder.append(t());
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  public final float u() {
    return this.w.g();
  }
  
  public final void v() {
    ArrayList<b0> arrayList = this.o;
    if (arrayList != null) {
      for (int i = arrayList.size() - 1; i >= 0; i--)
        ((b0)this.o.get(i)).n = null; 
      this.o.clear();
    } 
  }
  
  public void w() {
    a(Float.NaN, Float.NaN);
  }
  
  public final b0 x() {
    b0 b01 = this.k;
    return (b01 != null) ? b01 : A();
  }
  
  public boolean y() {
    return false;
  }
  
  public final int z() {
    ArrayList<b0> arrayList = this.o;
    return (arrayList == null) ? 0 : arrayList.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/b0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */