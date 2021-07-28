package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.lifecycle.g;

class v {
  private final m a;
  
  private final w b;
  
  private final Fragment c;
  
  private boolean d = false;
  
  private int e = -1;
  
  v(m paramm, w paramw, Fragment paramFragment) {
    this.a = paramm;
    this.b = paramw;
    this.c = paramFragment;
  }
  
  v(m paramm, w paramw, Fragment paramFragment, u paramu) {
    this.a = paramm;
    this.b = paramw;
    this.c = paramFragment;
    Fragment fragment2 = this.c;
    fragment2.e = null;
    fragment2.f = null;
    fragment2.t = 0;
    fragment2.q = false;
    fragment2.n = false;
    Fragment fragment1 = fragment2.j;
    if (fragment1 != null) {
      String str = fragment1.h;
    } else {
      fragment1 = null;
    } 
    fragment2.k = (String)fragment1;
    fragment2 = this.c;
    fragment2.j = null;
    Bundle bundle = paramu.o;
    if (bundle == null)
      bundle = new Bundle(); 
    fragment2.d = bundle;
  }
  
  v(m paramm, w paramw, ClassLoader paramClassLoader, j paramj, u paramu) {
    this.a = paramm;
    this.b = paramw;
    this.c = paramj.a(paramClassLoader, paramu.c);
    Bundle bundle2 = paramu.l;
    if (bundle2 != null)
      bundle2.setClassLoader(paramClassLoader); 
    this.c.m(paramu.l);
    Fragment fragment = this.c;
    fragment.h = paramu.d;
    fragment.p = paramu.e;
    fragment.r = true;
    fragment.y = paramu.f;
    fragment.z = paramu.g;
    fragment.A = paramu.h;
    fragment.D = paramu.i;
    fragment.o = paramu.j;
    fragment.C = paramu.k;
    fragment.B = paramu.m;
    fragment.S = g.c.values()[paramu.n];
    Bundle bundle1 = paramu.o;
    if (bundle1 != null) {
      this.c.d = bundle1;
    } else {
      this.c.d = new Bundle();
    } 
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Instantiated fragment ");
      stringBuilder.append(this.c);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
  }
  
  private boolean a(View paramView) {
    if (paramView == this.c.J)
      return true; 
    for (ViewParent viewParent = paramView.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
      if (viewParent == this.c.J)
        return true; 
    } 
    return false;
  }
  
  private Bundle s() {
    Bundle bundle2 = new Bundle();
    this.c.j(bundle2);
    this.a.d(this.c, bundle2, false);
    Bundle bundle1 = bundle2;
    if (bundle2.isEmpty())
      bundle1 = null; 
    if (this.c.J != null)
      p(); 
    bundle2 = bundle1;
    if (this.c.e != null) {
      bundle2 = bundle1;
      if (bundle1 == null)
        bundle2 = new Bundle(); 
      bundle2.putSparseParcelableArray("android:view_state", this.c.e);
    } 
    bundle1 = bundle2;
    if (this.c.f != null) {
      bundle1 = bundle2;
      if (bundle2 == null)
        bundle1 = new Bundle(); 
      bundle1.putBundle("android:view_registry_state", this.c.f);
    } 
    bundle2 = bundle1;
    if (!this.c.L) {
      bundle2 = bundle1;
      if (bundle1 == null)
        bundle2 = new Bundle(); 
      bundle2.putBoolean("android:user_visible_hint", this.c.L);
    } 
    return bundle2;
  }
  
  void a() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto ACTIVITY_CREATED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment1 = this.c;
    fragment1.g(fragment1.d);
    m m1 = this.a;
    Fragment fragment2 = this.c;
    m1.a(fragment2, fragment2.d, false);
  }
  
  void a(int paramInt) {
    this.e = paramInt;
  }
  
  void a(ClassLoader paramClassLoader) {
    Bundle bundle = this.c.d;
    if (bundle == null)
      return; 
    bundle.setClassLoader(paramClassLoader);
    Fragment fragment = this.c;
    fragment.e = fragment.d.getSparseParcelableArray("android:view_state");
    fragment = this.c;
    fragment.f = fragment.d.getBundle("android:view_registry_state");
    fragment = this.c;
    fragment.k = fragment.d.getString("android:target_state");
    fragment = this.c;
    if (fragment.k != null)
      fragment.l = fragment.d.getInt("android:target_req_state", 0); 
    fragment = this.c;
    Boolean bool = fragment.g;
    if (bool != null) {
      fragment.L = bool.booleanValue();
      this.c.g = null;
    } else {
      fragment.L = fragment.d.getBoolean("android:user_visible_hint", true);
    } 
    fragment = this.c;
    if (!fragment.L)
      fragment.K = true; 
  }
  
  void b() {
    int i = this.b.b(this.c);
    Fragment fragment = this.c;
    fragment.I.addView(fragment.J, i);
  }
  
  void c() {
    StringBuilder stringBuilder;
    if (n.d(3)) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("moveto ATTACHED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment2 = this.c;
    Fragment fragment3 = fragment2.j;
    v v1 = null;
    if (fragment3 != null) {
      v1 = this.b.e(fragment3.h);
      if (v1 != null) {
        fragment2 = this.c;
        fragment2.k = fragment2.j.h;
        fragment2.j = null;
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append("Fragment ");
        stringBuilder.append(this.c);
        stringBuilder.append(" declared target fragment ");
        stringBuilder.append(this.c.j);
        stringBuilder.append(" that does not belong to this FragmentManager!");
        throw new IllegalStateException(stringBuilder.toString());
      } 
    } else {
      String str = fragment2.k;
      if (str != null) {
        v1 = this.b.e(str);
        if (v1 == null) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Fragment ");
          stringBuilder.append(this.c);
          stringBuilder.append(" declared target fragment ");
          stringBuilder.append(this.c.k);
          stringBuilder.append(" that does not belong to this FragmentManager!");
          throw new IllegalStateException(stringBuilder.toString());
        } 
      } 
    } 
    if (stringBuilder != null && (n.P || (stringBuilder.k()).c < 1))
      stringBuilder.l(); 
    Fragment fragment1 = this.c;
    fragment1.v = fragment1.u.v();
    fragment1 = this.c;
    fragment1.x = fragment1.u.y();
    this.a.e(this.c, false);
    this.c.h0();
    this.a.a(this.c, false);
  }
  
  int d() {
    d0.e.b b;
    Fragment fragment2 = this.c;
    if (fragment2.u == null)
      return fragment2.c; 
    int j = this.e;
    int k = b.a[fragment2.S.ordinal()];
    int i = j;
    if (k != 1)
      if (k != 2) {
        if (k != 3) {
          if (k != 4) {
            i = Math.min(j, -1);
          } else {
            i = Math.min(j, 0);
          } 
        } else {
          i = Math.min(j, 1);
        } 
      } else {
        i = Math.min(j, 5);
      }  
    fragment2 = this.c;
    j = i;
    if (fragment2.p) {
      View view;
      if (fragment2.q) {
        i = Math.max(this.e, 2);
        view = this.c.J;
        j = i;
        if (view != null) {
          j = i;
          if (view.getParent() == null)
            j = Math.min(i, 2); 
        } 
      } else if (this.e < 4) {
        j = Math.min(i, ((Fragment)view).c);
      } else {
        j = Math.min(i, 1);
      } 
    } 
    k = j;
    if (!this.c.n)
      k = Math.min(j, 1); 
    Fragment fragment3 = null;
    fragment2 = fragment3;
    if (n.P) {
      Fragment fragment = this.c;
      ViewGroup viewGroup = fragment.I;
      fragment2 = fragment3;
      if (viewGroup != null)
        b = d0.a(viewGroup, fragment.z()).d(this); 
    } 
    if (b == d0.e.b.d) {
      i = Math.min(k, 6);
    } else if (b == d0.e.b.e) {
      i = Math.max(k, 3);
    } else {
      Fragment fragment = this.c;
      i = k;
      if (fragment.o)
        if (fragment.R()) {
          i = Math.min(k, 1);
        } else {
          i = Math.min(k, -1);
        }  
    } 
    Fragment fragment1 = this.c;
    j = i;
    if (fragment1.K) {
      j = i;
      if (fragment1.c < 5)
        j = Math.min(i, 4); 
    } 
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("computeExpectedState() of ");
      stringBuilder.append(j);
      stringBuilder.append(" for ");
      stringBuilder.append(this.c);
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    return j;
  }
  
  void e() {
    m m1;
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto CREATED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment = this.c;
    if (!fragment.R) {
      this.a.c(fragment, fragment.d, false);
      fragment = this.c;
      fragment.h(fragment.d);
      m1 = this.a;
      Fragment fragment1 = this.c;
      m1.b(fragment1, fragment1.d, false);
      return;
    } 
    m1.k(((Fragment)m1).d);
    this.c.c = 1;
  }
  
  void f() {
    StringBuilder stringBuilder;
    if (this.c.p)
      return; 
    if (n.d(3)) {
      stringBuilder = new StringBuilder();
      stringBuilder.append("moveto CREATE_VIEW: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment1 = this.c;
    LayoutInflater layoutInflater = fragment1.i(fragment1.d);
    fragment1 = null;
    Fragment fragment3 = this.c;
    ViewGroup viewGroup = fragment3.I;
    if (viewGroup != null) {
      ViewGroup viewGroup1 = viewGroup;
    } else {
      int i = fragment3.z;
      if (i != 0)
        if (i != -1) {
          viewGroup = (ViewGroup)fragment3.u.r().a(this.c.z);
          ViewGroup viewGroup1 = viewGroup;
          if (viewGroup == null) {
            ViewGroup viewGroup2;
            Fragment fragment = this.c;
            if (fragment.r) {
              viewGroup2 = viewGroup;
            } else {
              String str;
              try {
                str = viewGroup2.F().getResourceName(this.c.z);
              } catch (android.content.res.Resources.NotFoundException notFoundException) {
                str = "unknown";
              } 
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("No view found for id 0x");
              stringBuilder1.append(Integer.toHexString(this.c.z));
              stringBuilder1.append(" (");
              stringBuilder1.append(str);
              stringBuilder1.append(") for fragment ");
              stringBuilder1.append(this.c);
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
          } 
        } else {
          stringBuilder = new StringBuilder();
          stringBuilder.append("Cannot create fragment ");
          stringBuilder.append(this.c);
          stringBuilder.append(" for a container view with no id");
          throw new IllegalArgumentException(stringBuilder.toString());
        }  
    } 
    Fragment fragment2 = this.c;
    fragment2.I = (ViewGroup)stringBuilder;
    fragment2.b(layoutInflater, (ViewGroup)stringBuilder, fragment2.d);
    View view = this.c.J;
    if (view != null) {
      boolean bool = false;
      view.setSaveFromParentEnabled(false);
      Fragment fragment5 = this.c;
      fragment5.J.setTag(b.l.b.fragment_container_view_tag, fragment5);
      if (stringBuilder != null)
        b(); 
      Fragment fragment4 = this.c;
      if (fragment4.B)
        fragment4.J.setVisibility(8); 
      if (b.g.m.v.G(this.c.J)) {
        b.g.m.v.N(this.c.J);
      } else {
        View view1 = this.c.J;
        view1.addOnAttachStateChangeListener(new a(this, view1));
      } 
      this.c.r0();
      m m1 = this.a;
      fragment5 = this.c;
      m1.a(fragment5, fragment5.J, fragment5.d, false);
      int i = this.c.J.getVisibility();
      float f = this.c.J.getAlpha();
      if (n.P) {
        this.c.a(f);
        Fragment fragment = this.c;
        if (fragment.I != null && i == 0) {
          View view1 = fragment.J.findFocus();
          if (view1 != null) {
            this.c.b(view1);
            if (n.d(2)) {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("requestFocus: Saved focused view ");
              stringBuilder1.append(view1);
              stringBuilder1.append(" for Fragment ");
              stringBuilder1.append(this.c);
              Log.v("FragmentManager", stringBuilder1.toString());
            } 
          } 
          this.c.J.setAlpha(0.0F);
        } 
      } else {
        Fragment fragment = this.c;
        boolean bool1 = bool;
        if (i == 0) {
          bool1 = bool;
          if (fragment.I != null)
            bool1 = true; 
        } 
        fragment.N = bool1;
      } 
    } 
    this.c.c = 2;
  }
  
  void g() {
    boolean bool1;
    boolean bool2;
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom CREATED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment = this.c;
    boolean bool4 = fragment.o;
    boolean bool3 = true;
    if (bool4 && !fragment.R()) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (bool1 || this.b.e().f(this.c)) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (bool2) {
      int i;
      k<?> k = this.c.v;
      if (k instanceof androidx.lifecycle.x) {
        bool3 = this.b.e().d();
      } else if (k.f() instanceof Activity) {
        i = true ^ ((Activity)k.f()).isChangingConfigurations();
      } 
      if (bool1 || i != 0)
        this.b.e().b(this.c); 
      this.c.i0();
      this.a.b(this.c, false);
      for (v v1 : this.b.b()) {
        if (v1 != null) {
          Fragment fragment2 = v1.k();
          if (this.c.h.equals(fragment2.k)) {
            fragment2.j = this.c;
            fragment2.k = null;
          } 
        } 
      } 
      Fragment fragment1 = this.c;
      String str1 = fragment1.k;
      if (str1 != null)
        fragment1.j = this.b.b(str1); 
      this.b.b(this);
      return;
    } 
    String str = this.c.k;
    if (str != null) {
      Fragment fragment1 = this.b.b(str);
      if (fragment1 != null && fragment1.D)
        this.c.j = fragment1; 
    } 
    this.c.c = 0;
  }
  
  void h() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom CREATE_VIEW: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    Fragment fragment2 = this.c;
    ViewGroup viewGroup = fragment2.I;
    if (viewGroup != null) {
      View view = fragment2.J;
      if (view != null)
        viewGroup.removeView(view); 
    } 
    this.c.j0();
    this.a.i(this.c, false);
    Fragment fragment1 = this.c;
    fragment1.I = null;
    fragment1.J = null;
    fragment1.U = null;
    fragment1.V.b(null);
    this.c.q = false;
  }
  
  void i() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom ATTACHED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.k0();
    m m1 = this.a;
    Fragment fragment2 = this.c;
    boolean bool2 = false;
    m1.c(fragment2, false);
    Fragment fragment1 = this.c;
    fragment1.c = -1;
    fragment1.v = null;
    fragment1.x = null;
    fragment1.u = null;
    boolean bool1 = bool2;
    if (fragment1.o) {
      bool1 = bool2;
      if (!fragment1.R())
        bool1 = true; 
    } 
    if (bool1 || this.b.e().f(this.c)) {
      if (n.d(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("initState called for fragment: ");
        stringBuilder.append(this.c);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      this.c.O();
    } 
  }
  
  void j() {
    Fragment fragment = this.c;
    if (fragment.p && fragment.q && !fragment.s) {
      if (n.d(3)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("moveto CREATE_VIEW: ");
        stringBuilder.append(this.c);
        Log.d("FragmentManager", stringBuilder.toString());
      } 
      fragment = this.c;
      fragment.b(fragment.i(fragment.d), (ViewGroup)null, this.c.d);
      View view = this.c.J;
      if (view != null) {
        view.setSaveFromParentEnabled(false);
        Fragment fragment1 = this.c;
        fragment1.J.setTag(b.l.b.fragment_container_view_tag, fragment1);
        fragment1 = this.c;
        if (fragment1.B)
          fragment1.J.setVisibility(8); 
        this.c.r0();
        m m1 = this.a;
        Fragment fragment2 = this.c;
        m1.a(fragment2, fragment2.J, fragment2.d, false);
        this.c.c = 2;
      } 
    } 
  }
  
  Fragment k() {
    return this.c;
  }
  
  void l() {
    if (this.d) {
      if (n.d(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ignoring re-entrant call to moveToExpectedState() for ");
        stringBuilder.append(k());
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      return;
    } 
    try {
      this.d = true;
      while (true) {
        int i = d();
        if (i != this.c.c) {
          if (i > this.c.c) {
            switch (this.c.c + 1) {
              case 7:
                n();
                continue;
              case 6:
                this.c.c = 6;
                continue;
              case 5:
                q();
                continue;
              case 4:
                if (this.c.J != null && this.c.I != null)
                  d0.a(this.c.I, this.c.z()).a(d0.e.c.f(this.c.J.getVisibility()), this); 
                this.c.c = 4;
                continue;
              case 3:
                a();
                continue;
              case 2:
                j();
                f();
                continue;
              case 1:
                e();
                continue;
              case 0:
                c();
                continue;
            } 
            continue;
          } 
          switch (this.c.c - 1) {
            case 6:
              m();
              continue;
            case 5:
              this.c.c = 5;
              continue;
            case 4:
              r();
              continue;
            case 3:
              if (n.d(3)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("movefrom ACTIVITY_CREATED: ");
                stringBuilder.append(this.c);
                Log.d("FragmentManager", stringBuilder.toString());
              } 
              if (this.c.J != null && this.c.e == null)
                p(); 
              if (this.c.J != null && this.c.I != null)
                d0.a(this.c.I, this.c.z()).b(this); 
              this.c.c = 3;
              continue;
            case 2:
              this.c.q = false;
              this.c.c = 2;
              continue;
            case 1:
              h();
              this.c.c = 1;
              continue;
            case 0:
              g();
              continue;
            case -1:
              i();
              continue;
          } 
          continue;
        } 
        if (n.P && this.c.O) {
          if (this.c.J != null && this.c.I != null) {
            d0 d0 = d0.a(this.c.I, this.c.z());
            if (this.c.B) {
              d0.a(this);
            } else {
              d0.c(this);
            } 
          } 
          if (this.c.u != null)
            this.c.u.h(this.c); 
          this.c.O = false;
          this.c.b(this.c.B);
        } 
        return;
      } 
    } finally {
      this.d = false;
    } 
  }
  
  void m() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom RESUMED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.m0();
    this.a.d(this.c, false);
  }
  
  void n() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto RESUMED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    View view = this.c.v();
    if (view != null && a(view)) {
      boolean bool = view.requestFocus();
      if (n.d(2)) {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("requestFocus: Restoring focused view ");
        stringBuilder.append(view);
        stringBuilder.append(" ");
        if (bool) {
          str = "succeeded";
        } else {
          str = "failed";
        } 
        stringBuilder.append(str);
        stringBuilder.append(" on Fragment ");
        stringBuilder.append(this.c);
        stringBuilder.append(" resulting in focused view ");
        stringBuilder.append(this.c.J.findFocus());
        Log.v("FragmentManager", stringBuilder.toString());
      } 
    } 
    this.c.b((View)null);
    this.c.o0();
    this.a.f(this.c, false);
    Fragment fragment = this.c;
    fragment.d = null;
    fragment.e = null;
    fragment.f = null;
  }
  
  u o() {
    u u = new u(this.c);
    if (this.c.c > -1 && u.o == null) {
      u.o = s();
      if (this.c.k != null) {
        if (u.o == null)
          u.o = new Bundle(); 
        u.o.putString("android:target_state", this.c.k);
        int i = this.c.l;
        if (i != 0) {
          u.o.putInt("android:target_req_state", i);
          return u;
        } 
      } 
    } else {
      u.o = this.c.d;
    } 
    return u;
  }
  
  void p() {
    if (this.c.J == null)
      return; 
    SparseArray<Parcelable> sparseArray = new SparseArray();
    this.c.J.saveHierarchyState(sparseArray);
    if (sparseArray.size() > 0)
      this.c.e = sparseArray; 
    Bundle bundle = new Bundle();
    this.c.U.b(bundle);
    if (!bundle.isEmpty())
      this.c.f = bundle; 
  }
  
  void q() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("moveto STARTED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.p0();
    this.a.g(this.c, false);
  }
  
  void r() {
    if (n.d(3)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("movefrom STARTED: ");
      stringBuilder.append(this.c);
      Log.d("FragmentManager", stringBuilder.toString());
    } 
    this.c.q0();
    this.a.h(this.c, false);
  }
  
  class a implements View.OnAttachStateChangeListener {
    a(v this$0, View param1View) {}
    
    public void onViewAttachedToWindow(View param1View) {
      this.c.removeOnAttachStateChangeListener(this);
      b.g.m.v.N(this.c);
    }
    
    public void onViewDetachedFromWindow(View param1View) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */