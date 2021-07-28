package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

public abstract class k {
  protected final RecyclerView.o a;
  
  private int b = Integer.MIN_VALUE;
  
  final Rect c = new Rect();
  
  private k(RecyclerView.o paramo) {
    this.a = paramo;
  }
  
  public static k a(RecyclerView.o paramo) {
    return new a(paramo);
  }
  
  public static k a(RecyclerView.o paramo, int paramInt) {
    if (paramInt != 0) {
      if (paramInt == 1)
        return b(paramo); 
      throw new IllegalArgumentException("invalid orientation");
    } 
    return a(paramo);
  }
  
  public static k b(RecyclerView.o paramo) {
    return new b(paramo);
  }
  
  public abstract int a();
  
  public abstract int a(View paramView);
  
  public abstract void a(int paramInt);
  
  public abstract int b();
  
  public abstract int b(View paramView);
  
  public abstract int c();
  
  public abstract int c(View paramView);
  
  public abstract int d();
  
  public abstract int d(View paramView);
  
  public abstract int e();
  
  public abstract int e(View paramView);
  
  public abstract int f();
  
  public abstract int f(View paramView);
  
  public abstract int g();
  
  public int h() {
    return (Integer.MIN_VALUE == this.b) ? 0 : (g() - this.b);
  }
  
  public void i() {
    this.b = g();
  }
  
  static final class a extends k {
    a(RecyclerView.o param1o) {
      super(param1o, null);
    }
    
    public int a() {
      return this.a.r();
    }
    
    public int a(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.i(param1View) + p.rightMargin;
    }
    
    public void a(int param1Int) {
      this.a.e(param1Int);
    }
    
    public int b() {
      return this.a.r() - this.a.p();
    }
    
    public int b(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.h(param1View) + p.leftMargin + p.rightMargin;
    }
    
    public int c() {
      return this.a.p();
    }
    
    public int c(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.g(param1View) + p.topMargin + p.bottomMargin;
    }
    
    public int d() {
      return this.a.s();
    }
    
    public int d(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.f(param1View) - p.leftMargin;
    }
    
    public int e() {
      return this.a.i();
    }
    
    public int e(View param1View) {
      this.a.a(param1View, true, this.c);
      return this.c.right;
    }
    
    public int f() {
      return this.a.o();
    }
    
    public int f(View param1View) {
      this.a.a(param1View, true, this.c);
      return this.c.left;
    }
    
    public int g() {
      return this.a.r() - this.a.o() - this.a.p();
    }
  }
  
  static final class b extends k {
    b(RecyclerView.o param1o) {
      super(param1o, null);
    }
    
    public int a() {
      return this.a.h();
    }
    
    public int a(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.e(param1View) + p.bottomMargin;
    }
    
    public void a(int param1Int) {
      this.a.f(param1Int);
    }
    
    public int b() {
      return this.a.h() - this.a.n();
    }
    
    public int b(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.g(param1View) + p.topMargin + p.bottomMargin;
    }
    
    public int c() {
      return this.a.n();
    }
    
    public int c(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.h(param1View) + p.leftMargin + p.rightMargin;
    }
    
    public int d() {
      return this.a.i();
    }
    
    public int d(View param1View) {
      RecyclerView.p p = (RecyclerView.p)param1View.getLayoutParams();
      return this.a.j(param1View) - p.topMargin;
    }
    
    public int e() {
      return this.a.s();
    }
    
    public int e(View param1View) {
      this.a.a(param1View, true, this.c);
      return this.c.bottom;
    }
    
    public int f() {
      return this.a.q();
    }
    
    public int f(View param1View) {
      this.a.a(param1View, true, this.c);
      return this.c.top;
    }
    
    public int g() {
      return this.a.h() - this.a.q() - this.a.n();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */