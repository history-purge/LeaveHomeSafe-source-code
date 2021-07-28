package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import b.g.m.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class c extends n {
  private static TimeInterpolator s;
  
  private ArrayList<RecyclerView.d0> h = new ArrayList<RecyclerView.d0>();
  
  private ArrayList<RecyclerView.d0> i = new ArrayList<RecyclerView.d0>();
  
  private ArrayList<j> j = new ArrayList<j>();
  
  private ArrayList<i> k = new ArrayList<i>();
  
  ArrayList<ArrayList<RecyclerView.d0>> l = new ArrayList<ArrayList<RecyclerView.d0>>();
  
  ArrayList<ArrayList<j>> m = new ArrayList<ArrayList<j>>();
  
  ArrayList<ArrayList<i>> n = new ArrayList<ArrayList<i>>();
  
  ArrayList<RecyclerView.d0> o = new ArrayList<RecyclerView.d0>();
  
  ArrayList<RecyclerView.d0> p = new ArrayList<RecyclerView.d0>();
  
  ArrayList<RecyclerView.d0> q = new ArrayList<RecyclerView.d0>();
  
  ArrayList<RecyclerView.d0> r = new ArrayList<RecyclerView.d0>();
  
  private void a(List<i> paramList, RecyclerView.d0 paramd0) {
    for (int i = paramList.size() - 1; i >= 0; i--) {
      i i1 = paramList.get(i);
      if (a(i1, paramd0) && i1.a == null && i1.b == null)
        paramList.remove(i1); 
    } 
  }
  
  private boolean a(i parami, RecyclerView.d0 paramd0) {
    RecyclerView.d0 d01 = parami.b;
    boolean bool = false;
    if (d01 == paramd0) {
      parami.b = null;
    } else {
      if (parami.a == paramd0) {
        parami.a = null;
        bool = true;
        paramd0.a.setAlpha(1.0F);
        paramd0.a.setTranslationX(0.0F);
        paramd0.a.setTranslationY(0.0F);
        a(paramd0, bool);
        return true;
      } 
      return false;
    } 
    paramd0.a.setAlpha(1.0F);
    paramd0.a.setTranslationX(0.0F);
    paramd0.a.setTranslationY(0.0F);
    a(paramd0, bool);
    return true;
  }
  
  private void b(i parami) {
    RecyclerView.d0 d0 = parami.a;
    if (d0 != null)
      a(parami, d0); 
    d0 = parami.b;
    if (d0 != null)
      a(parami, d0); 
  }
  
  private void u(RecyclerView.d0 paramd0) {
    View view = paramd0.a;
    ViewPropertyAnimator viewPropertyAnimator = view.animate();
    this.q.add(paramd0);
    viewPropertyAnimator.setDuration(f()).alpha(0.0F).setListener((Animator.AnimatorListener)new d(this, paramd0, viewPropertyAnimator, view)).start();
  }
  
  private void v(RecyclerView.d0 paramd0) {
    if (s == null)
      s = (new ValueAnimator()).getInterpolator(); 
    paramd0.a.animate().setInterpolator(s);
    c(paramd0);
  }
  
  void a(i parami) {
    View view1;
    RecyclerView.d0 d01 = parami.a;
    View view2 = null;
    if (d01 == null) {
      d01 = null;
    } else {
      view1 = d01.a;
    } 
    RecyclerView.d0 d02 = parami.b;
    if (d02 != null)
      view2 = d02.a; 
    if (view1 != null) {
      ViewPropertyAnimator viewPropertyAnimator = view1.animate().setDuration(d());
      this.r.add(parami.a);
      viewPropertyAnimator.translationX((parami.e - parami.c));
      viewPropertyAnimator.translationY((parami.f - parami.d));
      viewPropertyAnimator.alpha(0.0F).setListener((Animator.AnimatorListener)new g(this, parami, viewPropertyAnimator, view1)).start();
    } 
    if (view2 != null) {
      ViewPropertyAnimator viewPropertyAnimator = view2.animate();
      this.r.add(parami.b);
      viewPropertyAnimator.translationX(0.0F).translationY(0.0F).setDuration(d()).alpha(1.0F).setListener((Animator.AnimatorListener)new h(this, parami, viewPropertyAnimator, view2)).start();
    } 
  }
  
  void a(List<RecyclerView.d0> paramList) {
    for (int i = paramList.size() - 1; i >= 0; i--)
      ((RecyclerView.d0)paramList.get(i)).a.animate().cancel(); 
  }
  
  public boolean a(RecyclerView.d0 paramd0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = paramd0.a;
    paramInt1 += (int)view.getTranslationX();
    paramInt2 += (int)paramd0.a.getTranslationY();
    v(paramd0);
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if (i == 0 && j == 0) {
      j(paramd0);
      return false;
    } 
    if (i != 0)
      view.setTranslationX(-i); 
    if (j != 0)
      view.setTranslationY(-j); 
    this.j.add(new j(paramd0, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public boolean a(RecyclerView.d0 paramd01, RecyclerView.d0 paramd02, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramd01 == paramd02)
      return a(paramd01, paramInt1, paramInt2, paramInt3, paramInt4); 
    float f1 = paramd01.a.getTranslationX();
    float f2 = paramd01.a.getTranslationY();
    float f3 = paramd01.a.getAlpha();
    v(paramd01);
    int i = (int)((paramInt3 - paramInt1) - f1);
    int j = (int)((paramInt4 - paramInt2) - f2);
    paramd01.a.setTranslationX(f1);
    paramd01.a.setTranslationY(f2);
    paramd01.a.setAlpha(f3);
    if (paramd02 != null) {
      v(paramd02);
      paramd02.a.setTranslationX(-i);
      paramd02.a.setTranslationY(-j);
      paramd02.a.setAlpha(0.0F);
    } 
    this.k.add(new i(paramd01, paramd02, paramInt1, paramInt2, paramInt3, paramInt4));
    return true;
  }
  
  public boolean a(RecyclerView.d0 paramd0, List<Object> paramList) {
    return (!paramList.isEmpty() || super.a(paramd0, paramList));
  }
  
  public void b() {
    int i;
    for (i = this.j.size() - 1; i >= 0; i--) {
      j j = this.j.get(i);
      View view = j.a.a;
      view.setTranslationY(0.0F);
      view.setTranslationX(0.0F);
      j(j.a);
      this.j.remove(i);
    } 
    for (i = this.h.size() - 1; i >= 0; i--) {
      l(this.h.get(i));
      this.h.remove(i);
    } 
    for (i = this.i.size() - 1; i >= 0; i--) {
      RecyclerView.d0 d0 = this.i.get(i);
      d0.a.setAlpha(1.0F);
      h(d0);
      this.i.remove(i);
    } 
    for (i = this.k.size() - 1; i >= 0; i--)
      b(this.k.get(i)); 
    this.k.clear();
    if (!g())
      return; 
    for (i = this.m.size() - 1; i >= 0; i--) {
      ArrayList<j> arrayList = this.m.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        j j1 = arrayList.get(j);
        View view = j1.a.a;
        view.setTranslationY(0.0F);
        view.setTranslationX(0.0F);
        j(j1.a);
        arrayList.remove(j);
        if (arrayList.isEmpty())
          this.m.remove(arrayList); 
      } 
    } 
    for (i = this.l.size() - 1; i >= 0; i--) {
      ArrayList<RecyclerView.d0> arrayList = this.l.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        RecyclerView.d0 d0 = arrayList.get(j);
        d0.a.setAlpha(1.0F);
        h(d0);
        arrayList.remove(j);
        if (arrayList.isEmpty())
          this.l.remove(arrayList); 
      } 
    } 
    for (i = this.n.size() - 1; i >= 0; i--) {
      ArrayList<i> arrayList = this.n.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        b(arrayList.get(j));
        if (arrayList.isEmpty())
          this.n.remove(arrayList); 
      } 
    } 
    a(this.q);
    a(this.p);
    a(this.o);
    a(this.r);
    a();
  }
  
  void b(RecyclerView.d0 paramd0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    View view = paramd0.a;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0)
      view.animate().translationX(0.0F); 
    if (paramInt2 != 0)
      view.animate().translationY(0.0F); 
    ViewPropertyAnimator viewPropertyAnimator = view.animate();
    this.p.add(paramd0);
    viewPropertyAnimator.setDuration(e()).setListener((Animator.AnimatorListener)new f(this, paramd0, paramInt1, view, paramInt2, viewPropertyAnimator)).start();
  }
  
  public void c(RecyclerView.d0 paramd0) {
    View view = paramd0.a;
    view.animate().cancel();
    int i;
    for (i = this.j.size() - 1; i >= 0; i--) {
      if (((j)this.j.get(i)).a == paramd0) {
        view.setTranslationY(0.0F);
        view.setTranslationX(0.0F);
        j(paramd0);
        this.j.remove(i);
      } 
    } 
    a(this.k, paramd0);
    if (this.h.remove(paramd0)) {
      view.setAlpha(1.0F);
      l(paramd0);
    } 
    if (this.i.remove(paramd0)) {
      view.setAlpha(1.0F);
      h(paramd0);
    } 
    for (i = this.n.size() - 1; i >= 0; i--) {
      ArrayList<i> arrayList = this.n.get(i);
      a(arrayList, paramd0);
      if (arrayList.isEmpty())
        this.n.remove(i); 
    } 
    for (i = this.m.size() - 1; i >= 0; i--) {
      ArrayList arrayList = this.m.get(i);
      for (int j = arrayList.size() - 1; j >= 0; j--) {
        if (((j)arrayList.get(j)).a == paramd0) {
          view.setTranslationY(0.0F);
          view.setTranslationX(0.0F);
          j(paramd0);
          arrayList.remove(j);
          if (arrayList.isEmpty())
            this.m.remove(i); 
          break;
        } 
      } 
    } 
    for (i = this.l.size() - 1; i >= 0; i--) {
      ArrayList arrayList = this.l.get(i);
      if (arrayList.remove(paramd0)) {
        view.setAlpha(1.0F);
        h(paramd0);
        if (arrayList.isEmpty())
          this.l.remove(i); 
      } 
    } 
    this.q.remove(paramd0);
    this.o.remove(paramd0);
    this.r.remove(paramd0);
    this.p.remove(paramd0);
    j();
  }
  
  public boolean f(RecyclerView.d0 paramd0) {
    v(paramd0);
    paramd0.a.setAlpha(0.0F);
    this.i.add(paramd0);
    return true;
  }
  
  public boolean g() {
    return (!this.i.isEmpty() || !this.k.isEmpty() || !this.j.isEmpty() || !this.h.isEmpty() || !this.p.isEmpty() || !this.q.isEmpty() || !this.o.isEmpty() || !this.r.isEmpty() || !this.m.isEmpty() || !this.l.isEmpty() || !this.n.isEmpty());
  }
  
  public boolean g(RecyclerView.d0 paramd0) {
    v(paramd0);
    this.h.add(paramd0);
    return true;
  }
  
  public void i() {
    int i = this.h.isEmpty() ^ true;
    int j = this.j.isEmpty() ^ true;
    int k = this.k.isEmpty() ^ true;
    int m = this.i.isEmpty() ^ true;
    if (i == 0 && j == 0 && m == 0 && k == 0)
      return; 
    Iterator<RecyclerView.d0> iterator = this.h.iterator();
    while (iterator.hasNext())
      u(iterator.next()); 
    this.h.clear();
    if (j != 0) {
      ArrayList<j> arrayList = new ArrayList();
      arrayList.addAll(this.j);
      this.m.add(arrayList);
      this.j.clear();
      a a = new a(this, arrayList);
      if (i != 0) {
        v.a(((j)arrayList.get(0)).a.a, a, f());
      } else {
        a.run();
      } 
    } 
    if (k != 0) {
      ArrayList<i> arrayList = new ArrayList();
      arrayList.addAll(this.k);
      this.n.add(arrayList);
      this.k.clear();
      b b = new b(this, arrayList);
      if (i != 0) {
        v.a(((i)arrayList.get(0)).a.a, b, f());
      } else {
        b.run();
      } 
    } 
    if (m != 0) {
      ArrayList<RecyclerView.d0> arrayList = new ArrayList();
      arrayList.addAll(this.i);
      this.l.add(arrayList);
      this.i.clear();
      c c1 = new c(this, arrayList);
      if (i != 0 || j != 0 || k != 0) {
        long l1;
        long l3 = 0L;
        if (i != 0) {
          l1 = f();
        } else {
          l1 = 0L;
        } 
        if (j != 0) {
          l2 = e();
        } else {
          l2 = 0L;
        } 
        if (k != 0)
          l3 = d(); 
        long l2 = Math.max(l2, l3);
        v.a(((RecyclerView.d0)arrayList.get(0)).a, c1, l1 + l2);
        return;
      } 
      c1.run();
      return;
    } 
  }
  
  void j() {
    if (!g())
      a(); 
  }
  
  void t(RecyclerView.d0 paramd0) {
    View view = paramd0.a;
    ViewPropertyAnimator viewPropertyAnimator = view.animate();
    this.o.add(paramd0);
    viewPropertyAnimator.alpha(1.0F).setDuration(c()).setListener((Animator.AnimatorListener)new e(this, paramd0, view, viewPropertyAnimator)).start();
  }
  
  class a implements Runnable {
    a(c this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      for (c.j j : this.c)
        this.d.b(j.a, j.b, j.c, j.d, j.e); 
      this.c.clear();
      this.d.m.remove(this.c);
    }
  }
  
  class b implements Runnable {
    b(c this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      for (c.i i : this.c)
        this.d.a(i); 
      this.c.clear();
      this.d.n.remove(this.c);
    }
  }
  
  class c implements Runnable {
    c(c this$0, ArrayList param1ArrayList) {}
    
    public void run() {
      for (RecyclerView.d0 d0 : this.c)
        this.d.t(d0); 
      this.c.clear();
      this.d.l.remove(this.c);
    }
  }
  
  class d extends AnimatorListenerAdapter {
    d(c this$0, RecyclerView.d0 param1d0, ViewPropertyAnimator param1ViewPropertyAnimator, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.b.setListener(null);
      this.c.setAlpha(1.0F);
      this.d.l(this.a);
      this.d.q.remove(this.a);
      this.d.j();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.m(this.a);
    }
  }
  
  class e extends AnimatorListenerAdapter {
    e(c this$0, RecyclerView.d0 param1d0, View param1View, ViewPropertyAnimator param1ViewPropertyAnimator) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.b.setAlpha(1.0F);
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.c.setListener(null);
      this.d.h(this.a);
      this.d.o.remove(this.a);
      this.d.j();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.i(this.a);
    }
  }
  
  class f extends AnimatorListenerAdapter {
    f(c this$0, RecyclerView.d0 param1d0, int param1Int1, View param1View, int param1Int2, ViewPropertyAnimator param1ViewPropertyAnimator) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      if (this.b != 0)
        this.c.setTranslationX(0.0F); 
      if (this.d != 0)
        this.c.setTranslationY(0.0F); 
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.e.setListener(null);
      this.f.j(this.a);
      this.f.p.remove(this.a);
      this.f.j();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.f.k(this.a);
    }
  }
  
  class g extends AnimatorListenerAdapter {
    g(c this$0, c.i param1i, ViewPropertyAnimator param1ViewPropertyAnimator, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.b.setListener(null);
      this.c.setAlpha(1.0F);
      this.c.setTranslationX(0.0F);
      this.c.setTranslationY(0.0F);
      this.d.a(this.a.a, true);
      this.d.r.remove(this.a.a);
      this.d.j();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.b(this.a.a, true);
    }
  }
  
  class h extends AnimatorListenerAdapter {
    h(c this$0, c.i param1i, ViewPropertyAnimator param1ViewPropertyAnimator, View param1View) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.b.setListener(null);
      this.c.setAlpha(1.0F);
      this.c.setTranslationX(0.0F);
      this.c.setTranslationY(0.0F);
      this.d.a(this.a.b, false);
      this.d.r.remove(this.a.b);
      this.d.j();
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.b(this.a.b, false);
    }
  }
  
  private static class i {
    public RecyclerView.d0 a;
    
    public RecyclerView.d0 b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    public int f;
    
    private i(RecyclerView.d0 param1d01, RecyclerView.d0 param1d02) {
      this.a = param1d01;
      this.b = param1d02;
    }
    
    i(RecyclerView.d0 param1d01, RecyclerView.d0 param1d02, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this(param1d01, param1d02);
      this.c = param1Int1;
      this.d = param1Int2;
      this.e = param1Int3;
      this.f = param1Int4;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("ChangeInfo{oldHolder=");
      stringBuilder.append(this.a);
      stringBuilder.append(", newHolder=");
      stringBuilder.append(this.b);
      stringBuilder.append(", fromX=");
      stringBuilder.append(this.c);
      stringBuilder.append(", fromY=");
      stringBuilder.append(this.d);
      stringBuilder.append(", toX=");
      stringBuilder.append(this.e);
      stringBuilder.append(", toY=");
      stringBuilder.append(this.f);
      stringBuilder.append('}');
      return stringBuilder.toString();
    }
  }
  
  private static class j {
    public RecyclerView.d0 a;
    
    public int b;
    
    public int c;
    
    public int d;
    
    public int e;
    
    j(RecyclerView.d0 param1d0, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a = param1d0;
      this.b = param1Int1;
      this.c = param1Int2;
      this.d = param1Int3;
      this.e = param1Int4;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */