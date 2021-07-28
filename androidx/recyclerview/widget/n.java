package androidx.recyclerview.widget;

import android.view.View;

public abstract class n extends RecyclerView.l {
  boolean g = true;
  
  public final void a(RecyclerView.d0 paramd0, boolean paramBoolean) {
    c(paramd0, paramBoolean);
    b(paramd0);
  }
  
  public boolean a(RecyclerView.d0 paramd0) {
    return (!this.g || paramd0.o());
  }
  
  public abstract boolean a(RecyclerView.d0 paramd0, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public abstract boolean a(RecyclerView.d0 paramd01, RecyclerView.d0 paramd02, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(RecyclerView.d0 paramd01, RecyclerView.d0 paramd02, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    int i;
    int j;
    int k = paramc1.a;
    int m = paramc1.b;
    if (paramd02.y()) {
      i = paramc1.a;
      j = paramc1.b;
    } else {
      i = paramc2.a;
      j = paramc2.b;
    } 
    return a(paramd01, paramd02, k, m, i, j);
  }
  
  public boolean a(RecyclerView.d0 paramd0, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    return (paramc1 != null && (paramc1.a != paramc2.a || paramc1.b != paramc2.b)) ? a(paramd0, paramc1.a, paramc1.b, paramc2.a, paramc2.b) : f(paramd0);
  }
  
  public final void b(RecyclerView.d0 paramd0, boolean paramBoolean) {
    d(paramd0, paramBoolean);
  }
  
  public boolean b(RecyclerView.d0 paramd0, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    int i;
    int j;
    int k = paramc1.a;
    int m = paramc1.b;
    View view = paramd0.a;
    if (paramc2 == null) {
      i = view.getLeft();
    } else {
      i = paramc2.a;
    } 
    if (paramc2 == null) {
      j = view.getTop();
    } else {
      j = paramc2.b;
    } 
    if (!paramd0.q() && (k != i || m != j)) {
      view.layout(i, j, view.getWidth() + i, view.getHeight() + j);
      return a(paramd0, k, m, i, j);
    } 
    return g(paramd0);
  }
  
  public void c(RecyclerView.d0 paramd0, boolean paramBoolean) {}
  
  public boolean c(RecyclerView.d0 paramd0, RecyclerView.l.c paramc1, RecyclerView.l.c paramc2) {
    if (paramc1.a != paramc2.a || paramc1.b != paramc2.b)
      return a(paramd0, paramc1.a, paramc1.b, paramc2.a, paramc2.b); 
    j(paramd0);
    return false;
  }
  
  public void d(RecyclerView.d0 paramd0, boolean paramBoolean) {}
  
  public abstract boolean f(RecyclerView.d0 paramd0);
  
  public abstract boolean g(RecyclerView.d0 paramd0);
  
  public final void h(RecyclerView.d0 paramd0) {
    n(paramd0);
    b(paramd0);
  }
  
  public final void i(RecyclerView.d0 paramd0) {
    o(paramd0);
  }
  
  public final void j(RecyclerView.d0 paramd0) {
    p(paramd0);
    b(paramd0);
  }
  
  public final void k(RecyclerView.d0 paramd0) {
    q(paramd0);
  }
  
  public final void l(RecyclerView.d0 paramd0) {
    r(paramd0);
    b(paramd0);
  }
  
  public final void m(RecyclerView.d0 paramd0) {
    s(paramd0);
  }
  
  public void n(RecyclerView.d0 paramd0) {}
  
  public void o(RecyclerView.d0 paramd0) {}
  
  public void p(RecyclerView.d0 paramd0) {}
  
  public void q(RecyclerView.d0 paramd0) {}
  
  public void r(RecyclerView.d0 paramd0) {}
  
  public void s(RecyclerView.d0 paramd0) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */