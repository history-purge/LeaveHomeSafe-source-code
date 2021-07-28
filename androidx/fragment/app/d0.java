package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b.g.m.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

abstract class d0 {
  private final ViewGroup a;
  
  final ArrayList<e> b = new ArrayList<e>();
  
  final ArrayList<e> c = new ArrayList<e>();
  
  boolean d = false;
  
  boolean e = false;
  
  d0(ViewGroup paramViewGroup) {
    this.a = paramViewGroup;
  }
  
  private e a(Fragment paramFragment) {
    for (e e : this.b) {
      if (e.d().equals(paramFragment) && !e.f())
        return e; 
    } 
    return null;
  }
  
  static d0 a(ViewGroup paramViewGroup, e0 parame0) {
    Object object = paramViewGroup.getTag(b.l.b.special_effects_controller_view_tag);
    if (object instanceof d0)
      return (d0)object; 
    d0 d01 = parame0.a(paramViewGroup);
    paramViewGroup.setTag(b.l.b.special_effects_controller_view_tag, d01);
    return d01;
  }
  
  static d0 a(ViewGroup paramViewGroup, n paramn) {
    return a(paramViewGroup, paramn.A());
  }
  
  private void a(e.c paramc, e.b paramb, v paramv) {
    synchronized (this.b) {
      b.g.j.a a = new b.g.j.a();
      e e = a(paramv.k());
      if (e != null) {
        e.a(paramc, paramb);
        return;
      } 
      d d = new d(paramc, paramb, paramv, a);
      this.b.add(d);
      d.a(new a(this, d));
      d.a(new b(this, d));
      return;
    } 
  }
  
  private e b(Fragment paramFragment) {
    for (e e : this.c) {
      if (e.d().equals(paramFragment) && !e.f())
        return e; 
    } 
    return null;
  }
  
  private void f() {
    for (e e : this.b) {
      if (e.e() == e.b.d)
        e.a(e.c.f(e.d().u0().getVisibility()), e.b.c); 
    } 
  }
  
  void a() {
    if (this.e)
      return; 
    if (!v.G((View)this.a)) {
      b();
      this.d = false;
      return;
    } 
    synchronized (this.b) {
      if (!this.b.isEmpty()) {
        ArrayList<e> arrayList = new ArrayList<e>(this.c);
        this.c.clear();
        for (e e : arrayList) {
          if (n.d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Cancelling operation ");
            stringBuilder.append(e);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          e.a();
          if (!e.g())
            this.c.add(e); 
        } 
        f();
        arrayList = new ArrayList<e>(this.b);
        this.b.clear();
        this.c.addAll(arrayList);
        Iterator<e> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((e)iterator.next()).h(); 
        a(arrayList, this.d);
        this.d = false;
      } 
      return;
    } 
  }
  
  void a(e.c paramc, v paramv) {
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing add operation for fragment ");
      stringBuilder.append(paramv.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(paramc, e.b.d, paramv);
  }
  
  void a(v paramv) {
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing hide operation for fragment ");
      stringBuilder.append(paramv.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(e.c.e, e.b.c, paramv);
  }
  
  abstract void a(List<e> paramList, boolean paramBoolean);
  
  void a(boolean paramBoolean) {
    this.d = paramBoolean;
  }
  
  void b() {
    boolean bool = v.G((View)this.a);
    synchronized (this.b) {
      f();
      Iterator<e> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((e)iterator.next()).h(); 
      for (e e : new ArrayList(this.c)) {
        if (n.d(2)) {
          String str;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("SpecialEffectsController: ");
          if (bool) {
            str = "";
          } else {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Container ");
            stringBuilder1.append(this.a);
            stringBuilder1.append(" is not attached to window. ");
            str = stringBuilder1.toString();
          } 
          stringBuilder.append(str);
          stringBuilder.append("Cancelling running operation ");
          stringBuilder.append(e);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        e.a();
      } 
      for (e e : new ArrayList(this.b)) {
        if (n.d(2)) {
          String str;
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("SpecialEffectsController: ");
          if (bool) {
            str = "";
          } else {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Container ");
            stringBuilder1.append(this.a);
            stringBuilder1.append(" is not attached to window. ");
            str = stringBuilder1.toString();
          } 
          stringBuilder.append(str);
          stringBuilder.append("Cancelling pending operation ");
          stringBuilder.append(e);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        e.a();
      } 
      return;
    } 
  }
  
  void b(v paramv) {
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing remove operation for fragment ");
      stringBuilder.append(paramv.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(e.c.c, e.b.e, paramv);
  }
  
  void c() {
    if (this.e) {
      this.e = false;
      a();
    } 
  }
  
  void c(v paramv) {
    if (n.d(2)) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("SpecialEffectsController: Enqueuing show operation for fragment ");
      stringBuilder.append(paramv.k());
      Log.v("FragmentManager", stringBuilder.toString());
    } 
    a(e.c.d, e.b.c, paramv);
  }
  
  public ViewGroup d() {
    return this.a;
  }
  
  e.b d(v paramv) {
    e e2 = a(paramv.k());
    if (e2 != null)
      return e2.e(); 
    e e1 = b(paramv.k());
    return (e1 != null) ? e1.e() : null;
  }
  
  void e() {
    synchronized (this.b) {
      f();
      this.e = false;
      int i = this.b.size() - 1;
      while (true) {
        if (i >= 0) {
          e e = this.b.get(i);
          e.c c = e.c.b((e.d()).J);
          if (e.c() == e.c.d && c != e.c.d) {
            this.e = e.d().T();
          } else {
            i--;
            continue;
          } 
        } 
        return;
      } 
    } 
  }
  
  class a implements Runnable {
    a(d0 this$0, d0.d param1d) {}
    
    public void run() {
      if (this.d.b.contains(this.c))
        this.c.c().a((this.c.d()).J); 
    }
  }
  
  class b implements Runnable {
    b(d0 this$0, d0.d param1d) {}
    
    public void run() {
      this.d.b.remove(this.c);
      this.d.c.remove(this.c);
    }
  }
  
  private static class d extends e {
    private final v h;
    
    d(d0.e.c param1c, d0.e.b param1b, v param1v, b.g.j.a param1a) {
      super(param1c, param1b, param1v.k(), param1a);
      this.h = param1v;
    }
    
    public void b() {
      super.b();
      this.h.l();
    }
    
    void h() {
      if (e() == d0.e.b.d) {
        Fragment fragment = this.h.k();
        View view = fragment.J.findFocus();
        if (view != null) {
          fragment.b(view);
          if (n.d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("requestFocus: Saved focused view ");
            stringBuilder.append(view);
            stringBuilder.append(" for Fragment ");
            stringBuilder.append(fragment);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
        } 
        view = d().u0();
        if (view.getParent() == null) {
          this.h.b();
          view.setAlpha(0.0F);
        } 
        if (view.getAlpha() == 0.0F && view.getVisibility() == 0)
          view.setVisibility(4); 
        view.setAlpha(fragment.D());
      } 
    }
  }
  
  static class e {
    private c a;
    
    private b b;
    
    private final Fragment c;
    
    private final List<Runnable> d = new ArrayList<Runnable>();
    
    private final HashSet<b.g.j.a> e = new HashSet<b.g.j.a>();
    
    private boolean f = false;
    
    private boolean g = false;
    
    e(c param1c, b param1b, Fragment param1Fragment, b.g.j.a param1a) {
      this.a = param1c;
      this.b = param1b;
      this.c = param1Fragment;
      param1a.a(new a(this));
    }
    
    final void a() {
      if (f())
        return; 
      this.f = true;
      if (this.e.isEmpty()) {
        b();
        return;
      } 
      Iterator<?> iterator = (new ArrayList(this.e)).iterator();
      while (iterator.hasNext())
        ((b.g.j.a)iterator.next()).a(); 
    }
    
    final void a(c param1c, b param1b) {
      int i = d0.c.b[param1b.ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
            return; 
          if (this.a != c.c) {
            if (n.d(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: For fragment ");
              stringBuilder.append(this.c);
              stringBuilder.append(" mFinalState = ");
              stringBuilder.append(this.a);
              stringBuilder.append(" -> ");
              stringBuilder.append(param1c);
              stringBuilder.append(". ");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            this.a = param1c;
            return;
          } 
        } else {
          if (n.d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: For fragment ");
            stringBuilder.append(this.c);
            stringBuilder.append(" mFinalState = ");
            stringBuilder.append(this.a);
            stringBuilder.append(" -> REMOVED. mLifecycleImpact  = ");
            stringBuilder.append(this.b);
            stringBuilder.append(" to REMOVING.");
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          this.a = c.c;
          b b1 = b.e;
          this.b = b1;
        } 
      } else {
        b b1;
        if (this.a == c.c) {
          if (n.d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: For fragment ");
            stringBuilder.append(this.c);
            stringBuilder.append(" mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = ");
            stringBuilder.append(this.b);
            stringBuilder.append(" to ADDING.");
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          this.a = c.d;
          b1 = b.d;
        } else {
          return;
        } 
        this.b = b1;
      } 
    }
    
    public final void a(b.g.j.a param1a) {
      if (this.e.remove(param1a) && this.e.isEmpty())
        b(); 
    }
    
    final void a(Runnable param1Runnable) {
      this.d.add(param1Runnable);
    }
    
    public void b() {
      if (this.g)
        return; 
      if (n.d(2)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SpecialEffectsController: ");
        stringBuilder.append(this);
        stringBuilder.append(" has called complete.");
        Log.v("FragmentManager", stringBuilder.toString());
      } 
      this.g = true;
      Iterator<Runnable> iterator = this.d.iterator();
      while (iterator.hasNext())
        ((Runnable)iterator.next()).run(); 
    }
    
    public final void b(b.g.j.a param1a) {
      h();
      this.e.add(param1a);
    }
    
    public c c() {
      return this.a;
    }
    
    public final Fragment d() {
      return this.c;
    }
    
    b e() {
      return this.b;
    }
    
    final boolean f() {
      return this.f;
    }
    
    final boolean g() {
      return this.g;
    }
    
    void h() {}
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Operation ");
      stringBuilder.append("{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append("} ");
      stringBuilder.append("{");
      stringBuilder.append("mFinalState = ");
      stringBuilder.append(this.a);
      stringBuilder.append("} ");
      stringBuilder.append("{");
      stringBuilder.append("mLifecycleImpact = ");
      stringBuilder.append(this.b);
      stringBuilder.append("} ");
      stringBuilder.append("{");
      stringBuilder.append("mFragment = ");
      stringBuilder.append(this.c);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    class a implements b.g.j.a.a {
      a(d0.e this$0) {}
      
      public void a() {
        this.a.a();
      }
    }
    
    enum b {
      c, d, e;
    }
    
    enum c {
      c, d, e, f;
      
      static c b(View param2View) {
        return (param2View.getAlpha() == 0.0F && param2View.getVisibility() == 0) ? f : f(param2View.getVisibility());
      }
      
      static c f(int param2Int) {
        if (param2Int != 0) {
          if (param2Int != 4) {
            if (param2Int == 8)
              return e; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown visibility ");
            stringBuilder.append(param2Int);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          return f;
        } 
        return d;
      }
      
      void a(View param2View) {
        int i = d0.c.a[ordinal()];
        if (i != 1) {
          if (i != 2) {
            if (i != 3) {
              if (i != 4)
                return; 
              if (n.d(2)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SpecialEffectsController: Setting view ");
                stringBuilder.append(param2View);
                stringBuilder.append(" to INVISIBLE");
                Log.v("FragmentManager", stringBuilder.toString());
              } 
              param2View.setVisibility(4);
              return;
            } 
            if (n.d(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: Setting view ");
              stringBuilder.append(param2View);
              stringBuilder.append(" to GONE");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            i = 8;
          } else {
            if (n.d(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: Setting view ");
              stringBuilder.append(param2View);
              stringBuilder.append(" to VISIBLE");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            i = 0;
          } 
          param2View.setVisibility(i);
          return;
        } 
        ViewGroup viewGroup = (ViewGroup)param2View.getParent();
        if (viewGroup != null) {
          if (n.d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Removing view ");
            stringBuilder.append(param2View);
            stringBuilder.append(" from container ");
            stringBuilder.append(viewGroup);
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          viewGroup.removeView(param2View);
        } 
      }
    }
  }
  
  class a implements b.g.j.a.a {
    a(d0 this$0) {}
    
    public void a() {
      this.a.a();
    }
  }
  
  enum b {
    c, d, e;
  }
  
  enum c {
    c, d, e, f;
    
    static c b(View param1View) {
      return (param1View.getAlpha() == 0.0F && param1View.getVisibility() == 0) ? f : f(param1View.getVisibility());
    }
    
    static c f(int param1Int) {
      if (param1Int != 0) {
        if (param1Int != 4) {
          if (param1Int == 8)
            return e; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown visibility ");
          stringBuilder.append(param1Int);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return f;
      } 
      return d;
    }
    
    void a(View param1View) {
      int i = d0.c.a[ordinal()];
      if (i != 1) {
        if (i != 2) {
          if (i != 3) {
            if (i != 4)
              return; 
            if (n.d(2)) {
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("SpecialEffectsController: Setting view ");
              stringBuilder.append(param1View);
              stringBuilder.append(" to INVISIBLE");
              Log.v("FragmentManager", stringBuilder.toString());
            } 
            param1View.setVisibility(4);
            return;
          } 
          if (n.d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Setting view ");
            stringBuilder.append(param1View);
            stringBuilder.append(" to GONE");
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          i = 8;
        } else {
          if (n.d(2)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SpecialEffectsController: Setting view ");
            stringBuilder.append(param1View);
            stringBuilder.append(" to VISIBLE");
            Log.v("FragmentManager", stringBuilder.toString());
          } 
          i = 0;
        } 
        param1View.setVisibility(i);
        return;
      } 
      ViewGroup viewGroup = (ViewGroup)param1View.getParent();
      if (viewGroup != null) {
        if (n.d(2)) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("SpecialEffectsController: Removing view ");
          stringBuilder.append(param1View);
          stringBuilder.append(" from container ");
          stringBuilder.append(viewGroup);
          Log.v("FragmentManager", stringBuilder.toString());
        } 
        viewGroup.removeView(param1View);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */