package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Scroller;

public abstract class o extends RecyclerView.r {
  RecyclerView a;
  
  private Scroller b;
  
  private final RecyclerView.t c = new a(this);
  
  private void b() {
    this.a.removeOnScrollListener(this.c);
    this.a.setOnFlingListener(null);
  }
  
  private boolean b(RecyclerView.o paramo, int paramInt1, int paramInt2) {
    if (!(paramo instanceof RecyclerView.z.b))
      return false; 
    RecyclerView.z z = a(paramo);
    if (z == null)
      return false; 
    paramInt1 = a(paramo, paramInt1, paramInt2);
    if (paramInt1 == -1)
      return false; 
    z.c(paramInt1);
    paramo.b(z);
    return true;
  }
  
  private void c() {
    if (this.a.getOnFlingListener() == null) {
      this.a.addOnScrollListener(this.c);
      this.a.setOnFlingListener(this);
      return;
    } 
    throw new IllegalStateException("An instance of OnFlingListener already set.");
  }
  
  public abstract int a(RecyclerView.o paramo, int paramInt1, int paramInt2);
  
  protected RecyclerView.z a(RecyclerView.o paramo) {
    return b(paramo);
  }
  
  void a() {
    RecyclerView recyclerView = this.a;
    if (recyclerView == null)
      return; 
    RecyclerView.o o1 = recyclerView.getLayoutManager();
    if (o1 == null)
      return; 
    View view = c(o1);
    if (view == null)
      return; 
    int[] arrayOfInt = a(o1, view);
    if (arrayOfInt[0] != 0 || arrayOfInt[1] != 0)
      this.a.smoothScrollBy(arrayOfInt[0], arrayOfInt[1]); 
  }
  
  public void a(RecyclerView paramRecyclerView) {
    RecyclerView recyclerView = this.a;
    if (recyclerView == paramRecyclerView)
      return; 
    if (recyclerView != null)
      b(); 
    this.a = paramRecyclerView;
    if (this.a != null) {
      c();
      this.b = new Scroller(this.a.getContext(), (Interpolator)new DecelerateInterpolator());
      a();
    } 
  }
  
  public boolean a(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   4: invokevirtual getLayoutManager : ()Landroidx/recyclerview/widget/RecyclerView$o;
    //   7: astore #6
    //   9: iconst_0
    //   10: istore #5
    //   12: aload #6
    //   14: ifnonnull -> 19
    //   17: iconst_0
    //   18: ireturn
    //   19: aload_0
    //   20: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   23: invokevirtual getAdapter : ()Landroidx/recyclerview/widget/RecyclerView$g;
    //   26: ifnonnull -> 31
    //   29: iconst_0
    //   30: ireturn
    //   31: aload_0
    //   32: getfield a : Landroidx/recyclerview/widget/RecyclerView;
    //   35: invokevirtual getMinFlingVelocity : ()I
    //   38: istore_3
    //   39: iload_2
    //   40: invokestatic abs : (I)I
    //   43: iload_3
    //   44: if_icmpgt -> 59
    //   47: iload #5
    //   49: istore #4
    //   51: iload_1
    //   52: invokestatic abs : (I)I
    //   55: iload_3
    //   56: if_icmple -> 77
    //   59: iload #5
    //   61: istore #4
    //   63: aload_0
    //   64: aload #6
    //   66: iload_1
    //   67: iload_2
    //   68: invokespecial b : (Landroidx/recyclerview/widget/RecyclerView$o;II)Z
    //   71: ifeq -> 77
    //   74: iconst_1
    //   75: istore #4
    //   77: iload #4
    //   79: ireturn
  }
  
  public abstract int[] a(RecyclerView.o paramo, View paramView);
  
  @Deprecated
  protected h b(RecyclerView.o paramo) {
    return !(paramo instanceof RecyclerView.z.b) ? null : new b(this, this.a.getContext());
  }
  
  public int[] b(int paramInt1, int paramInt2) {
    this.b.fling(0, 0, paramInt1, paramInt2, -2147483648, 2147483647, -2147483648, 2147483647);
    return new int[] { this.b.getFinalX(), this.b.getFinalY() };
  }
  
  public abstract View c(RecyclerView.o paramo);
  
  class a extends RecyclerView.t {
    boolean a = false;
    
    a(o this$0) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int) {
      super.a(param1RecyclerView, param1Int);
      if (param1Int == 0 && this.a) {
        this.a = false;
        this.b.a();
      } 
    }
    
    public void a(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      if (param1Int1 != 0 || param1Int2 != 0)
        this.a = true; 
    }
  }
  
  class b extends h {
    b(o this$0, Context param1Context) {
      super(param1Context);
    }
    
    protected float a(DisplayMetrics param1DisplayMetrics) {
      return 100.0F / param1DisplayMetrics.densityDpi;
    }
    
    protected void a(View param1View, RecyclerView.a0 param1a0, RecyclerView.z.a param1a) {
      o o1 = this.q;
      RecyclerView recyclerView = o1.a;
      if (recyclerView == null)
        return; 
      int[] arrayOfInt = o1.a(recyclerView.getLayoutManager(), param1View);
      int i = arrayOfInt[0];
      int j = arrayOfInt[1];
      int k = d(Math.max(Math.abs(i), Math.abs(j)));
      if (k > 0)
        param1a.a(i, j, k, (Interpolator)this.j); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */