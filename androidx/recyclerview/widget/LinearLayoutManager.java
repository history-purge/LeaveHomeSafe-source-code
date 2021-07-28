package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements f, RecyclerView.z.b {
  int A = -1;
  
  int B = Integer.MIN_VALUE;
  
  private boolean C;
  
  d D = null;
  
  final a E = new a();
  
  private final b F = new b();
  
  private int G = 2;
  
  private int[] H = new int[2];
  
  int s = 1;
  
  private c t;
  
  k u;
  
  private boolean v;
  
  private boolean w = false;
  
  boolean x = false;
  
  private boolean y = false;
  
  private boolean z = true;
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean) {
    k(paramInt);
    a(paramBoolean);
  }
  
  public LinearLayoutManager(Context paramContext, AttributeSet paramAttributeSet, int paramInt1, int paramInt2) {
    RecyclerView.o.d d1 = RecyclerView.o.a(paramContext, paramAttributeSet, paramInt1, paramInt2);
    k(d1.a);
    a(d1.c);
    b(d1.d);
  }
  
  private View M() {
    return e(0, e());
  }
  
  private View N() {
    return e(e() - 1, -1);
  }
  
  private View O() {
    return this.x ? M() : N();
  }
  
  private View P() {
    return this.x ? N() : M();
  }
  
  private View Q() {
    int i;
    if (this.x) {
      i = 0;
    } else {
      i = e() - 1;
    } 
    return d(i);
  }
  
  private View R() {
    boolean bool;
    if (this.x) {
      bool = e() - 1;
    } else {
      bool = false;
    } 
    return d(bool);
  }
  
  private void S() {
    int i;
    if (this.s == 1 || !J()) {
      boolean bool = this.w;
    } else {
      i = this.w ^ true;
    } 
    this.x = i;
  }
  
  private int a(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = this.u.b() - paramInt;
    if (i > 0) {
      i = -c(-i, paramv, parama0);
      if (paramBoolean) {
        paramInt = this.u.b() - paramInt + i;
        if (paramInt > 0) {
          this.u.a(paramInt);
          return paramInt + i;
        } 
      } 
      return i;
    } 
    return 0;
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, RecyclerView.a0 parama0) {
    this.t.m = L();
    this.t.f = paramInt1;
    int[] arrayOfInt = this.H;
    boolean bool = false;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    a(parama0, arrayOfInt);
    int i = Math.max(0, this.H[0]);
    int j = Math.max(0, this.H[1]);
    if (paramInt1 == 1)
      bool = true; 
    c c1 = this.t;
    if (bool) {
      paramInt1 = j;
    } else {
      paramInt1 = i;
    } 
    c1.h = paramInt1;
    c1 = this.t;
    if (!bool)
      i = j; 
    c1.i = i;
    paramInt1 = -1;
    if (bool) {
      c1 = this.t;
      c1.h += this.u.c();
      View view = Q();
      c c2 = this.t;
      if (!this.x)
        paramInt1 = 1; 
      c2.e = paramInt1;
      c2 = this.t;
      paramInt1 = l(view);
      c c3 = this.t;
      c2.d = paramInt1 + c3.e;
      c3.b = this.u.a(view);
      paramInt1 = this.u.a(view) - this.u.b();
    } else {
      View view = R();
      c c2 = this.t;
      c2.h += this.u.f();
      c2 = this.t;
      if (this.x)
        paramInt1 = 1; 
      c2.e = paramInt1;
      c2 = this.t;
      paramInt1 = l(view);
      c c3 = this.t;
      c2.d = paramInt1 + c3.e;
      c3.b = this.u.d(view);
      paramInt1 = -this.u.d(view) + this.u.f();
    } 
    c1 = this.t;
    c1.c = paramInt2;
    if (paramBoolean)
      c1.c -= paramInt1; 
    this.t.g = paramInt1;
  }
  
  private void a(a parama) {
    f(parama.b, parama.c);
  }
  
  private void a(RecyclerView.v paramv, int paramInt1, int paramInt2) {
    if (paramInt1 == paramInt2)
      return; 
    int i = paramInt1;
    if (paramInt2 > paramInt1) {
      while (--paramInt2 >= paramInt1) {
        a(paramInt2, paramv);
        paramInt2--;
      } 
    } else {
      while (i > paramInt2) {
        a(i, paramv);
        i--;
      } 
    } 
  }
  
  private void a(RecyclerView.v paramv, c paramc) {
    if (paramc.a) {
      if (paramc.m)
        return; 
      int i = paramc.g;
      int j = paramc.i;
      if (paramc.f == -1) {
        b(paramv, i, j);
        return;
      } 
      c(paramv, i, j);
    } 
  }
  
  private boolean a(RecyclerView.a0 parama0, a parama) {
    boolean bool = parama0.d();
    boolean bool1 = false;
    if (!bool) {
      int i = this.A;
      if (i == -1)
        return false; 
      if (i < 0 || i >= parama0.a()) {
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        return false;
      } 
      parama.b = this.A;
      d d1 = this.D;
      if (d1 != null && d1.e()) {
        parama.d = this.D.e;
        if (parama.d) {
          i = this.u.b() - this.D.d;
        } else {
          i = this.u.f() + this.D.d;
        } 
        parama.c = i;
        return true;
      } 
      if (this.B == Integer.MIN_VALUE) {
        View view = c(this.A);
        if (view != null) {
          if (this.u.b(view) > this.u.g()) {
            parama.a();
            return true;
          } 
          if (this.u.d(view) - this.u.f() < 0) {
            parama.c = this.u.f();
            parama.d = false;
            return true;
          } 
          if (this.u.b() - this.u.a(view) < 0) {
            parama.c = this.u.b();
            parama.d = true;
            return true;
          } 
          if (parama.d) {
            i = this.u.a(view) + this.u.h();
          } else {
            i = this.u.d(view);
          } 
          parama.c = i;
          return true;
        } 
        if (e() > 0) {
          i = l(d(0));
          if (this.A < i) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool == this.x)
            bool1 = true; 
          parama.d = bool1;
        } 
        parama.a();
        return true;
      } 
      bool = this.x;
      parama.d = bool;
      if (bool) {
        i = this.u.b() - this.B;
      } else {
        i = this.u.f() + this.B;
      } 
      parama.c = i;
      return true;
    } 
    return false;
  }
  
  private boolean a(RecyclerView.v paramv, RecyclerView.a0 parama0, a parama) {
    View view1;
    int j = e();
    int i = 0;
    if (j == 0)
      return false; 
    View view2 = g();
    if (view2 != null && parama.a(view2, parama0)) {
      parama.b(view2, l(view2));
      return true;
    } 
    if (this.v != this.y)
      return false; 
    if (parama.d) {
      view1 = h(paramv, parama0);
    } else {
      view1 = i((RecyclerView.v)view1, parama0);
    } 
    if (view1 != null) {
      parama.a(view1, l(view1));
      if (!parama0.d() && D()) {
        if (this.u.d(view1) >= this.u.b() || this.u.a(view1) < this.u.f())
          i = 1; 
        if (i) {
          if (parama.d) {
            i = this.u.b();
          } else {
            i = this.u.f();
          } 
          parama.c = i;
        } 
      } 
      return true;
    } 
    return false;
  }
  
  private int b(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0, boolean paramBoolean) {
    int i = paramInt - this.u.f();
    if (i > 0) {
      int j = -c(i, paramv, parama0);
      i = j;
      if (paramBoolean) {
        paramInt = paramInt + j - this.u.f();
        i = j;
        if (paramInt > 0) {
          this.u.a(-paramInt);
          i = j - paramInt;
        } 
      } 
      return i;
    } 
    return 0;
  }
  
  private void b(a parama) {
    g(parama.b, parama.c);
  }
  
  private void b(RecyclerView.v paramv, int paramInt1, int paramInt2) {
    int j = e();
    if (paramInt1 < 0)
      return; 
    int i = this.u.a() - paramInt1 + paramInt2;
    if (this.x) {
      for (paramInt1 = 0; paramInt1 < j; paramInt1++) {
        View view = d(paramInt1);
        if (this.u.d(view) < i || this.u.f(view) < i) {
          a(paramv, 0, paramInt1);
          return;
        } 
      } 
    } else {
      paramInt2 = j - 1;
      for (paramInt1 = paramInt2; paramInt1 >= 0; paramInt1--) {
        View view = d(paramInt1);
        if (this.u.d(view) < i || this.u.f(view) < i) {
          a(paramv, paramInt2, paramInt1);
          break;
        } 
      } 
    } 
  }
  
  private void b(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt1, int paramInt2) {
    if (parama0.e() && e() != 0 && !parama0.d()) {
      if (!D())
        return; 
      List<RecyclerView.d0> list = paramv.f();
      int n = list.size();
      int i1 = l(d(0));
      int i = 0;
      int m = 0;
      int j = 0;
      while (i < n) {
        RecyclerView.d0 d0 = list.get(i);
        if (!d0.q()) {
          boolean bool;
          int i2 = d0.i();
          byte b1 = 1;
          if (i2 < i1) {
            bool = true;
          } else {
            bool = false;
          } 
          if (bool != this.x)
            b1 = -1; 
          i2 = this.u.b(d0.a);
          if (b1 == -1) {
            m += i2;
          } else {
            j += i2;
          } 
        } 
        i++;
      } 
      this.t.l = list;
      if (m > 0) {
        g(l(R()), paramInt1);
        c c1 = this.t;
        c1.h = m;
        c1.c = 0;
        c1.a();
        a(paramv, this.t, parama0, false);
      } 
      if (j > 0) {
        f(l(Q()), paramInt2);
        c c1 = this.t;
        c1.h = j;
        c1.c = 0;
        c1.a();
        a(paramv, this.t, parama0, false);
      } 
      this.t.l = null;
    } 
  }
  
  private void b(RecyclerView.v paramv, RecyclerView.a0 parama0, a parama) {
    boolean bool;
    if (a(parama0, parama))
      return; 
    if (a(paramv, parama0, parama))
      return; 
    parama.a();
    if (this.y) {
      bool = parama0.a() - 1;
    } else {
      bool = false;
    } 
    parama.b = bool;
  }
  
  private void c(RecyclerView.v paramv, int paramInt1, int paramInt2) {
    if (paramInt1 < 0)
      return; 
    int i = paramInt1 - paramInt2;
    paramInt2 = e();
    if (this.x) {
      for (paramInt1 = --paramInt2; paramInt1 >= 0; paramInt1--) {
        View view = d(paramInt1);
        if (this.u.a(view) > i || this.u.e(view) > i) {
          a(paramv, paramInt2, paramInt1);
          return;
        } 
      } 
    } else {
      for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++) {
        View view = d(paramInt1);
        if (this.u.a(view) > i || this.u.e(view) > i) {
          a(paramv, 0, paramInt1);
          break;
        } 
      } 
    } 
  }
  
  private View f(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return a(paramv, parama0, 0, e(), parama0.a());
  }
  
  private void f(int paramInt1, int paramInt2) {
    boolean bool;
    this.t.c = this.u.b() - paramInt2;
    c c1 = this.t;
    if (this.x) {
      bool = true;
    } else {
      bool = true;
    } 
    c1.e = bool;
    c1 = this.t;
    c1.d = paramInt1;
    c1.f = 1;
    c1.b = paramInt2;
    c1.g = Integer.MIN_VALUE;
  }
  
  private View g(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return a(paramv, parama0, e() - 1, -1, parama0.a());
  }
  
  private void g(int paramInt1, int paramInt2) {
    this.t.c = paramInt2 - this.u.f();
    c c1 = this.t;
    c1.d = paramInt1;
    if (this.x) {
      paramInt1 = 1;
    } else {
      paramInt1 = -1;
    } 
    c1.e = paramInt1;
    c1 = this.t;
    c1.f = -1;
    c1.b = paramInt2;
    c1.g = Integer.MIN_VALUE;
  }
  
  private View h(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return this.x ? f(paramv, parama0) : g(paramv, parama0);
  }
  
  private int i(RecyclerView.a0 parama0) {
    if (e() == 0)
      return 0; 
    F();
    return m.a(parama0, this.u, b(this.z ^ true, true), a(this.z ^ true, true), this, this.z);
  }
  
  private View i(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return this.x ? g(paramv, parama0) : f(paramv, parama0);
  }
  
  private int j(RecyclerView.a0 parama0) {
    if (e() == 0)
      return 0; 
    F();
    return m.a(parama0, this.u, b(this.z ^ true, true), a(this.z ^ true, true), this, this.z, this.x);
  }
  
  private int k(RecyclerView.a0 parama0) {
    if (e() == 0)
      return 0; 
    F();
    return m.b(parama0, this.u, b(this.z ^ true, true), a(this.z ^ true, true), this, this.z);
  }
  
  boolean B() {
    return (i() != 1073741824 && s() != 1073741824 && t());
  }
  
  public boolean D() {
    return (this.D == null && this.v == this.y);
  }
  
  c E() {
    return new c();
  }
  
  void F() {
    if (this.t == null)
      this.t = E(); 
  }
  
  public int G() {
    View view = a(0, e(), false, true);
    return (view == null) ? -1 : l(view);
  }
  
  public int H() {
    View view = a(e() - 1, -1, false, true);
    return (view == null) ? -1 : l(view);
  }
  
  public int I() {
    return this.s;
  }
  
  protected boolean J() {
    return (k() == 1);
  }
  
  public boolean K() {
    return this.z;
  }
  
  boolean L() {
    return (this.u.d() == 0 && this.u.a() == 0);
  }
  
  public int a(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 1) ? 0 : c(paramInt, paramv, parama0);
  }
  
  public int a(RecyclerView.a0 parama0) {
    return i(parama0);
  }
  
  int a(RecyclerView.v paramv, c paramc, RecyclerView.a0 parama0, boolean paramBoolean) {
    int j = paramc.c;
    int i = paramc.g;
    if (i != Integer.MIN_VALUE) {
      if (j < 0)
        paramc.g = i + j; 
      a(paramv, paramc);
    } 
    i = paramc.c + paramc.h;
    b b1 = this.F;
    while (true) {
      while (true)
        break; 
      if (paramBoolean) {
        Object object = SYNTHETIC_LOCAL_VARIABLE_6;
        if (b1.d)
          break; 
      } 
    } 
    return j - paramc.c;
  }
  
  public PointF a(int paramInt) {
    if (e() == 0)
      return null; 
    boolean bool1 = false;
    int i = l(d(0));
    boolean bool = true;
    if (paramInt < i)
      bool1 = true; 
    paramInt = bool;
    if (bool1 != this.x)
      paramInt = -1; 
    return (this.s == 0) ? new PointF(paramInt, 0.0F) : new PointF(0.0F, paramInt);
  }
  
  View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    char c1;
    p p;
    F();
    char c2 = 'ŀ';
    if (paramBoolean1) {
      c1 = '怃';
    } else {
      c1 = 'ŀ';
    } 
    if (!paramBoolean2)
      c2 = Character.MIN_VALUE; 
    if (this.s == 0) {
      p = this.e;
    } else {
      p = this.f;
    } 
    return p.a(paramInt1, paramInt2, c1, c2);
  }
  
  public View a(View paramView, int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    View view1;
    View view2;
    S();
    if (e() == 0)
      return null; 
    paramInt = j(paramInt);
    if (paramInt == Integer.MIN_VALUE)
      return null; 
    F();
    a(paramInt, (int)(this.u.g() * 0.33333334F), false, parama0);
    c c1 = this.t;
    c1.g = Integer.MIN_VALUE;
    c1.a = false;
    a(paramv, c1, parama0, true);
    if (paramInt == -1) {
      view1 = P();
    } else {
      view1 = O();
    } 
    if (paramInt == -1) {
      view2 = R();
    } else {
      view2 = Q();
    } 
    return view2.hasFocusable() ? ((view1 == null) ? null : view2) : view1;
  }
  
  View a(RecyclerView.v paramv, RecyclerView.a0 parama0, int paramInt1, int paramInt2, int paramInt3) {
    View view;
    byte b1;
    F();
    int i = this.u.f();
    int j = this.u.b();
    if (paramInt2 > paramInt1) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    parama0 = null;
    for (paramv = null; paramInt1 != paramInt2; paramv = v1) {
      View view1;
      View view2 = d(paramInt1);
      int m = l(view2);
      RecyclerView.a0 a01 = parama0;
      RecyclerView.v v1 = paramv;
      if (m >= 0) {
        a01 = parama0;
        v1 = paramv;
        if (m < paramInt3)
          if (((RecyclerView.p)view2.getLayoutParams()).c()) {
            a01 = parama0;
            v1 = paramv;
            if (paramv == null) {
              View view3 = view2;
              a01 = parama0;
            } 
          } else if (this.u.d(view2) >= j || this.u.a(view2) < i) {
            a01 = parama0;
            v1 = paramv;
            if (parama0 == null) {
              view1 = view2;
              v1 = paramv;
            } 
          } else {
            return view2;
          }  
      } 
      paramInt1 += b1;
      view = view1;
    } 
    return (View)((view != null) ? view : paramv);
  }
  
  View a(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.x) {
      boolean bool = false;
      int j = e();
      return a(bool, j, paramBoolean1, paramBoolean2);
    } 
    int i = e() - 1;
    byte b1 = -1;
    return a(i, b1, paramBoolean1, paramBoolean2);
  }
  
  public void a(int paramInt1, int paramInt2, RecyclerView.a0 parama0, RecyclerView.o.c paramc) {
    if (this.s != 0)
      paramInt1 = paramInt2; 
    if (e() != 0) {
      if (paramInt1 == 0)
        return; 
      F();
      if (paramInt1 > 0) {
        paramInt2 = 1;
      } else {
        paramInt2 = -1;
      } 
      a(paramInt2, Math.abs(paramInt1), true, parama0);
      a(parama0, this.t, paramc);
    } 
  }
  
  public void a(int paramInt, RecyclerView.o.c paramc) {
    boolean bool1;
    d d1 = this.D;
    byte b1 = -1;
    if (d1 != null && d1.e()) {
      d1 = this.D;
      bool1 = d1.e;
      i = d1.c;
    } else {
      S();
      boolean bool2 = this.x;
      int m = this.A;
      i = m;
      bool1 = bool2;
      if (m == -1)
        if (bool2) {
          i = paramInt - 1;
          bool1 = bool2;
        } else {
          i = 0;
          bool1 = bool2;
        }  
    } 
    if (!bool1)
      b1 = 1; 
    boolean bool = false;
    int j = i;
    for (int i = bool; i < this.G && j >= 0 && j < paramInt; i++) {
      paramc.a(j, 0);
      j += b1;
    } 
  }
  
  public void a(Parcelable paramParcelable) {
    if (paramParcelable instanceof d) {
      this.D = (d)paramParcelable;
      z();
    } 
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent) {
    super.a(paramAccessibilityEvent);
    if (e() > 0) {
      paramAccessibilityEvent.setFromIndex(G());
      paramAccessibilityEvent.setToIndex(H());
    } 
  }
  
  void a(RecyclerView.a0 parama0, c paramc, RecyclerView.o.c paramc1) {
    int i = paramc.d;
    if (i >= 0 && i < parama0.a())
      paramc1.a(i, Math.max(0, paramc.g)); 
  }
  
  protected void a(RecyclerView.a0 parama0, int[] paramArrayOfint) {
    int j;
    boolean bool;
    int i = h(parama0);
    if (this.t.f == -1) {
      j = 0;
      bool = i;
    } else {
      bool = false;
      j = i;
    } 
    paramArrayOfint[0] = bool;
    paramArrayOfint[1] = j;
  }
  
  void a(RecyclerView.v paramv, RecyclerView.a0 parama0, a parama, int paramInt) {}
  
  void a(RecyclerView.v paramv, RecyclerView.a0 parama0, c paramc, b paramb) {
    int i;
    int j;
    int m;
    int n;
    View view = paramc.a(paramv);
    if (view == null) {
      paramb.b = true;
      return;
    } 
    RecyclerView.p p = (RecyclerView.p)view.getLayoutParams();
    if (paramc.l == null) {
      boolean bool1;
      boolean bool2 = this.x;
      if (paramc.f == -1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool2 == bool1) {
        b(view);
      } else {
        b(view, 0);
      } 
    } else {
      boolean bool1;
      boolean bool2 = this.x;
      if (paramc.f == -1) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      if (bool2 == bool1) {
        a(view);
      } else {
        a(view, 0);
      } 
    } 
    a(view, 0, 0);
    paramb.a = this.u.b(view);
    if (this.s == 1) {
      if (J()) {
        i = r() - p();
        j = i - this.u.c(view);
      } else {
        j = o();
        i = this.u.c(view) + j;
      } 
      n = paramc.f;
      m = paramc.b;
      if (n == -1) {
        n = paramb.a;
        int i1 = m;
        int i2 = i;
        i = m - n;
        n = j;
        j = i2;
        m = i1;
      } else {
        n = paramb.a;
        int i1 = m;
        int i2 = i;
        m = n + m;
        n = j;
        i = i1;
        j = i2;
      } 
    } else {
      n = q();
      j = this.u.c(view) + n;
      m = paramc.f;
      i = paramc.b;
      if (m == -1) {
        int i3 = paramb.a;
        m = i;
        int i2 = n;
        int i1 = j;
        n = i - i3;
        i = i2;
        j = m;
        m = i1;
      } else {
        m = paramb.a;
        int i2 = m + i;
        int i1 = i;
        m = j;
        j = i2;
        i = n;
        n = i1;
      } 
    } 
    a(view, n, i, j, m);
    if (p.c() || p.b())
      paramb.c = true; 
    paramb.d = view.hasFocusable();
  }
  
  public void a(RecyclerView paramRecyclerView, RecyclerView.a0 parama0, int paramInt) {
    h h = new h(paramRecyclerView.getContext());
    h.c(paramInt);
    b(h);
  }
  
  public void a(String paramString) {
    if (this.D == null)
      super.a(paramString); 
  }
  
  public void a(boolean paramBoolean) {
    a((String)null);
    if (paramBoolean == this.w)
      return; 
    this.w = paramBoolean;
    z();
  }
  
  public boolean a() {
    return (this.s == 0);
  }
  
  public int b(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    return (this.s == 0) ? 0 : c(paramInt, paramv, parama0);
  }
  
  public int b(RecyclerView.a0 parama0) {
    return j(parama0);
  }
  
  View b(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.x) {
      int j = e() - 1;
      byte b1 = -1;
      return a(j, b1, paramBoolean1, paramBoolean2);
    } 
    boolean bool = false;
    int i = e();
    return a(bool, i, paramBoolean1, paramBoolean2);
  }
  
  public void b(RecyclerView paramRecyclerView, RecyclerView.v paramv) {
    super.b(paramRecyclerView, paramv);
    if (this.C) {
      b(paramv);
      paramv.a();
    } 
  }
  
  public void b(boolean paramBoolean) {
    a((String)null);
    if (this.y == paramBoolean)
      return; 
    this.y = paramBoolean;
    z();
  }
  
  public boolean b() {
    return (this.s == 1);
  }
  
  int c(int paramInt, RecyclerView.v paramv, RecyclerView.a0 parama0) {
    if (e() != 0) {
      byte b1;
      if (paramInt == 0)
        return 0; 
      F();
      this.t.a = true;
      if (paramInt > 0) {
        b1 = 1;
      } else {
        b1 = -1;
      } 
      int i = Math.abs(paramInt);
      a(b1, i, true, parama0);
      c c1 = this.t;
      int j = c1.g + a(paramv, c1, parama0, false);
      if (j < 0)
        return 0; 
      if (i > j)
        paramInt = b1 * j; 
      this.u.a(-paramInt);
      this.t.k = paramInt;
      return paramInt;
    } 
    return 0;
  }
  
  public int c(RecyclerView.a0 parama0) {
    return k(parama0);
  }
  
  public View c(int paramInt) {
    int i = e();
    if (i == 0)
      return null; 
    int j = paramInt - l(d(0));
    if (j >= 0 && j < i) {
      View view = d(j);
      if (l(view) == paramInt)
        return view; 
    } 
    return super.c(paramInt);
  }
  
  public RecyclerView.p c() {
    return new RecyclerView.p(-2, -2);
  }
  
  public int d(RecyclerView.a0 parama0) {
    return i(parama0);
  }
  
  public int e(RecyclerView.a0 parama0) {
    return j(parama0);
  }
  
  View e(int paramInt1, int paramInt2) {
    char c1;
    char c2;
    p p;
    F();
    if (paramInt2 > paramInt1) {
      c1 = '\001';
    } else if (paramInt2 < paramInt1) {
      c1 = '￿';
    } else {
      c1 = Character.MIN_VALUE;
    } 
    if (!c1)
      return d(paramInt1); 
    if (this.u.d(d(paramInt1)) < this.u.f()) {
      c1 = '䄄';
      c2 = '䀄';
    } else {
      c1 = '၁';
      c2 = 'ခ';
    } 
    if (this.s == 0) {
      p = this.e;
    } else {
      p = this.f;
    } 
    return p.a(paramInt1, paramInt2, c1, c2);
  }
  
  public void e(RecyclerView.v paramv, RecyclerView.a0 parama0) {
    a a2;
    c c1;
    d d1 = this.D;
    int m = -1;
    if ((d1 != null || this.A != -1) && parama0.a() == 0) {
      b(paramv);
      return;
    } 
    d1 = this.D;
    if (d1 != null && d1.e())
      this.A = this.D.c; 
    F();
    this.t.a = false;
    S();
    View view = g();
    if (!this.E.e || this.A != -1 || this.D != null) {
      this.E.b();
      a2 = this.E;
      a2.d = this.x ^ this.y;
      b(paramv, parama0, a2);
      this.E.e = true;
    } else if (a2 != null && (this.u.d((View)a2) >= this.u.b() || this.u.a((View)a2) <= this.u.f())) {
      this.E.b((View)a2, l((View)a2));
    } 
    c c2 = this.t;
    if (c2.k >= 0) {
      i = 1;
    } else {
      i = -1;
    } 
    c2.f = i;
    int[] arrayOfInt = this.H;
    arrayOfInt[0] = 0;
    arrayOfInt[1] = 0;
    a(parama0, arrayOfInt);
    int n = Math.max(0, this.H[0]) + this.u.f();
    int i1 = Math.max(0, this.H[1]) + this.u.c();
    int i = n;
    int j = i1;
    if (parama0.d()) {
      int i2 = this.A;
      i = n;
      j = i1;
      if (i2 != -1) {
        i = n;
        j = i1;
        if (this.B != Integer.MIN_VALUE) {
          View view1 = c(i2);
          i = n;
          j = i1;
          if (view1 != null) {
            if (this.x) {
              j = this.u.b() - this.u.a(view1);
              i = this.B;
            } else {
              i = this.u.d(view1) - this.u.f();
              j = this.B;
            } 
            i = j - i;
            if (i > 0) {
              i = n + i;
              j = i1;
            } else {
              j = i1 - i;
              i = n;
            } 
          } 
        } 
      } 
    } 
    if (this.E.d ? this.x : !this.x)
      m = 1; 
    a(paramv, parama0, this.E, m);
    a(paramv);
    this.t.m = L();
    this.t.j = parama0.d();
    this.t.i = 0;
    a a1 = this.E;
    if (a1.d) {
      b(a1);
      c1 = this.t;
      c1.h = i;
      a(paramv, c1, parama0, false);
      c1 = this.t;
      m = c1.b;
      i1 = c1.d;
      n = c1.c;
      i = j;
      if (n > 0)
        i = j + n; 
      a(this.E);
      c1 = this.t;
      c1.h = i;
      c1.d += c1.e;
      a(paramv, c1, parama0, false);
      c1 = this.t;
      n = c1.b;
      int i2 = c1.c;
      j = m;
      i = n;
      if (i2 > 0) {
        g(i1, m);
        c1 = this.t;
        c1.h = i2;
        a(paramv, c1, parama0, false);
        j = this.t.b;
        i = n;
      } 
    } else {
      a((a)c1);
      c1 = this.t;
      c1.h = j;
      a(paramv, c1, parama0, false);
      c1 = this.t;
      m = c1.b;
      i1 = c1.d;
      n = c1.c;
      j = i;
      if (n > 0)
        j = i + n; 
      b(this.E);
      c1 = this.t;
      c1.h = j;
      c1.d += c1.e;
      a(paramv, c1, parama0, false);
      c1 = this.t;
      n = c1.b;
      int i2 = c1.c;
      j = n;
      i = m;
      if (i2 > 0) {
        f(i1, m);
        c1 = this.t;
        c1.h = i2;
        a(paramv, c1, parama0, false);
        i = this.t.b;
        j = n;
      } 
    } 
    n = j;
    m = i;
    if (e() > 0) {
      if ((this.x ^ this.y) != 0) {
        n = a(i, paramv, parama0, true);
        m = j + n;
        j = i + n;
        i = b(m, paramv, parama0, false);
      } else {
        n = b(j, paramv, parama0, true);
        m = j + n;
        j = i + n;
        i = a(j, paramv, parama0, false);
      } 
      n = m + i;
      m = j + i;
    } 
    b(paramv, parama0, n, m);
    if (!parama0.d()) {
      this.u.i();
    } else {
      this.E.b();
    } 
    this.v = this.y;
  }
  
  public int f(RecyclerView.a0 parama0) {
    return k(parama0);
  }
  
  public void g(RecyclerView.a0 parama0) {
    super.g(parama0);
    this.D = null;
    this.A = -1;
    this.B = Integer.MIN_VALUE;
    this.E.b();
  }
  
  @Deprecated
  protected int h(RecyclerView.a0 parama0) {
    return parama0.c() ? this.u.g() : 0;
  }
  
  public void i(int paramInt) {
    this.A = paramInt;
    this.B = Integer.MIN_VALUE;
    d d1 = this.D;
    if (d1 != null)
      d1.f(); 
    z();
  }
  
  int j(int paramInt) {
    return (paramInt != 1) ? ((paramInt != 2) ? ((paramInt != 17) ? ((paramInt != 33) ? ((paramInt != 66) ? ((paramInt != 130) ? Integer.MIN_VALUE : ((this.s == 1) ? 1 : Integer.MIN_VALUE)) : ((this.s == 0) ? 1 : Integer.MIN_VALUE)) : ((this.s == 1) ? -1 : Integer.MIN_VALUE)) : ((this.s == 0) ? -1 : Integer.MIN_VALUE)) : ((this.s == 1) ? 1 : (J() ? -1 : 1))) : ((this.s == 1) ? -1 : (J() ? 1 : -1));
  }
  
  public void k(int paramInt) {
    if (paramInt == 0 || paramInt == 1) {
      a((String)null);
      if (paramInt != this.s || this.u == null) {
        this.u = k.a(this, paramInt);
        this.E.a = this.u;
        this.s = paramInt;
        z();
      } 
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("invalid orientation:");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public boolean v() {
    return true;
  }
  
  public Parcelable y() {
    d d1 = this.D;
    if (d1 != null)
      return new d(d1); 
    d1 = new d();
    if (e() > 0) {
      F();
      int i = this.v ^ this.x;
      d1.e = i;
      if (i != 0) {
        View view1 = Q();
        d1.d = this.u.b() - this.u.a(view1);
        d1.c = l(view1);
        return d1;
      } 
      View view = R();
      d1.c = l(view);
      d1.d = this.u.d(view) - this.u.f();
      return d1;
    } 
    d1.f();
    return d1;
  }
  
  static class a {
    k a;
    
    int b;
    
    int c;
    
    boolean d;
    
    boolean e;
    
    a() {
      b();
    }
    
    void a() {
      int i;
      if (this.d) {
        i = this.a.b();
      } else {
        i = this.a.f();
      } 
      this.c = i;
    }
    
    public void a(View param1View, int param1Int) {
      int i;
      if (this.d) {
        i = this.a.a(param1View) + this.a.h();
      } else {
        i = this.a.d(param1View);
      } 
      this.c = i;
      this.b = param1Int;
    }
    
    boolean a(View param1View, RecyclerView.a0 param1a0) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return (!p.c() && p.a() >= 0 && p.a() < param1a0.a());
    }
    
    void b() {
      this.b = -1;
      this.c = Integer.MIN_VALUE;
      this.d = false;
      this.e = false;
    }
    
    public void b(View param1View, int param1Int) {
      int i = this.a.h();
      if (i >= 0) {
        a(param1View, param1Int);
        return;
      } 
      this.b = param1Int;
      if (this.d) {
        param1Int = this.a.b() - i - this.a.a(param1View);
        this.c = this.a.b() - param1Int;
        if (param1Int > 0) {
          i = this.a.b(param1View);
          int j = this.c;
          int m = this.a.f();
          i = j - i - m + Math.min(this.a.d(param1View) - m, 0);
          if (i < 0) {
            this.c += Math.min(param1Int, -i);
            return;
          } 
        } 
      } else {
        int j = this.a.d(param1View);
        param1Int = j - this.a.f();
        this.c = j;
        if (param1Int > 0) {
          int m = this.a.b(param1View);
          int n = this.a.b();
          int i1 = this.a.a(param1View);
          i = this.a.b() - Math.min(0, n - i - i1) - j + m;
          if (i < 0)
            this.c -= Math.min(param1Int, -i); 
        } 
      } 
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("AnchorInfo{mPosition=");
      stringBuilder.append(this.b);
      stringBuilder.append(", mCoordinate=");
      stringBuilder.append(this.c);
      stringBuilder.append(", mLayoutFromEnd=");
      stringBuilder.append(this.d);
      stringBuilder.append(", mValid=");
      stringBuilder.append(this.e);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  protected static class b {
    public int a;
    
    public boolean b;
    
    public boolean c;
    
    public boolean d;
    
    void a() {
      this.a = 0;
      this.b = false;
      this.c = false;
      this.d = false;
    }
  }
  
  static class c {
    boolean a = true;
    
    int b;
    
    int c;
    
    int d;
    
    int e;
    
    int f;
    
    int g;
    
    int h = 0;
    
    int i = 0;
    
    boolean j;
    
    int k;
    
    List<RecyclerView.d0> l = null;
    
    boolean m;
    
    private View b() {
      int j = this.l.size();
      for (int i = 0; i < j; i++) {
        View view = ((RecyclerView.d0)this.l.get(i)).a;
        RecyclerView.p p = (RecyclerView.p)view.getLayoutParams();
        if (!p.c() && this.d == p.a()) {
          a(view);
          return view;
        } 
      } 
      return null;
    }
    
    View a(RecyclerView.v param1v) {
      if (this.l != null)
        return b(); 
      View view = param1v.d(this.d);
      this.d += this.e;
      return view;
    }
    
    public void a() {
      a((View)null);
    }
    
    public void a(View param1View) {
      int i;
      param1View = b(param1View);
      if (param1View == null) {
        i = -1;
      } else {
        i = ((RecyclerView.p)param1View.getLayoutParams()).a();
      } 
      this.d = i;
    }
    
    boolean a(RecyclerView.a0 param1a0) {
      int i = this.d;
      return (i >= 0 && i < param1a0.a());
    }
    
    public View b(View param1View) {
      int k = this.l.size();
      View view = null;
      int j = Integer.MAX_VALUE;
      int i = 0;
      while (i < k) {
        View view2 = ((RecyclerView.d0)this.l.get(i)).a;
        RecyclerView.p p = (RecyclerView.p)view2.getLayoutParams();
        View view1 = view;
        int m = j;
        if (view2 != param1View)
          if (p.c()) {
            view1 = view;
            m = j;
          } else {
            int n = (p.a() - this.d) * this.e;
            if (n < 0) {
              view1 = view;
              m = j;
            } else {
              view1 = view;
              m = j;
              if (n < j) {
                view1 = view2;
                if (n == 0)
                  return view1; 
                m = n;
              } 
            } 
          }  
        i++;
        view = view1;
        j = m;
      } 
      return view;
    }
  }
  
  @SuppressLint({"BanParcelableUsage"})
  public static class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();
    
    int c;
    
    int d;
    
    boolean e;
    
    public d() {}
    
    d(Parcel param1Parcel) {
      this.c = param1Parcel.readInt();
      this.d = param1Parcel.readInt();
      int i = param1Parcel.readInt();
      boolean bool = true;
      if (i != 1)
        bool = false; 
      this.e = bool;
    }
    
    public d(d param1d) {
      this.c = param1d.c;
      this.d = param1d.d;
      this.e = param1d.e;
    }
    
    public int describeContents() {
      return 0;
    }
    
    boolean e() {
      return (this.c >= 0);
    }
    
    void f() {
      this.c = -1;
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    static final class a implements Parcelable.Creator<d> {
      public LinearLayoutManager.d createFromParcel(Parcel param2Parcel) {
        return new LinearLayoutManager.d(param2Parcel);
      }
      
      public LinearLayoutManager.d[] newArray(int param2Int) {
        return new LinearLayoutManager.d[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.Creator<d> {
    public LinearLayoutManager.d createFromParcel(Parcel param1Parcel) {
      return new LinearLayoutManager.d(param1Parcel);
    }
    
    public LinearLayoutManager.d[] newArray(int param1Int) {
      return new LinearLayoutManager.d[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */