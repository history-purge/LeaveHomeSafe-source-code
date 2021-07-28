package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

public class h extends RecyclerView.z {
  protected final LinearInterpolator i = new LinearInterpolator();
  
  protected final DecelerateInterpolator j = new DecelerateInterpolator();
  
  protected PointF k;
  
  private final DisplayMetrics l;
  
  private boolean m = false;
  
  private float n;
  
  protected int o = 0;
  
  protected int p = 0;
  
  public h(Context paramContext) {
    this.l = paramContext.getResources().getDisplayMetrics();
  }
  
  private int b(int paramInt1, int paramInt2) {
    paramInt2 = paramInt1 - paramInt2;
    return (paramInt1 * paramInt2 <= 0) ? 0 : paramInt2;
  }
  
  private float k() {
    if (!this.m) {
      this.n = a(this.l);
      this.m = true;
    } 
    return this.n;
  }
  
  protected float a(DisplayMetrics paramDisplayMetrics) {
    return 25.0F / paramDisplayMetrics.densityDpi;
  }
  
  public int a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    if (paramInt5 != -1) {
      if (paramInt5 != 0) {
        if (paramInt5 == 1)
          return paramInt4 - paramInt2; 
        throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
      } 
      paramInt1 = paramInt3 - paramInt1;
      if (paramInt1 > 0)
        return paramInt1; 
      paramInt1 = paramInt4 - paramInt2;
      return (paramInt1 < 0) ? paramInt1 : 0;
    } 
    return paramInt3 - paramInt1;
  }
  
  public int a(View paramView, int paramInt) {
    RecyclerView.o o = b();
    if (o == null || !o.a())
      return 0; 
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return a(o.f(paramView) - p.leftMargin, o.i(paramView) + p.rightMargin, o.o(), o.r() - o.p(), paramInt);
  }
  
  protected void a(int paramInt1, int paramInt2, RecyclerView.a0 parama0, RecyclerView.z.a parama) {
    if (a() == 0) {
      h();
      return;
    } 
    this.o = b(this.o, paramInt1);
    this.p = b(this.p, paramInt2);
    if (this.o == 0 && this.p == 0)
      a(parama); 
  }
  
  protected void a(View paramView, RecyclerView.a0 parama0, RecyclerView.z.a parama) {
    int i = a(paramView, i());
    int j = b(paramView, j());
    int k = d((int)Math.sqrt((i * i + j * j)));
    if (k > 0)
      parama.a(-i, -j, k, (Interpolator)this.j); 
  }
  
  protected void a(RecyclerView.z.a parama) {
    PointF pointF = a(c());
    if (pointF == null || (pointF.x == 0.0F && pointF.y == 0.0F)) {
      parama.a(c());
      h();
      return;
    } 
    a(pointF);
    this.k = pointF;
    this.o = (int)(pointF.x * 10000.0F);
    this.p = (int)(pointF.y * 10000.0F);
    int i = e(10000);
    parama.a((int)(this.o * 1.2F), (int)(this.p * 1.2F), (int)(i * 1.2F), (Interpolator)this.i);
  }
  
  public int b(View paramView, int paramInt) {
    RecyclerView.o o = b();
    if (o == null || !o.b())
      return 0; 
    RecyclerView.p p = (RecyclerView.p)paramView.getLayoutParams();
    return a(o.j(paramView) - p.topMargin, o.e(paramView) + p.bottomMargin, o.q(), o.h() - o.n(), paramInt);
  }
  
  protected int d(int paramInt) {
    double d = e(paramInt);
    Double.isNaN(d);
    return (int)Math.ceil(d / 0.3356D);
  }
  
  protected int e(int paramInt) {
    return (int)Math.ceil((Math.abs(paramInt) * k()));
  }
  
  protected void f() {}
  
  protected void g() {
    this.p = 0;
    this.o = 0;
    this.k = null;
  }
  
  protected int i() {
    PointF pointF = this.k;
    if (pointF != null) {
      float f = pointF.x;
      if (f != 0.0F)
        return (f > 0.0F) ? 1 : -1; 
    } 
    return 0;
  }
  
  protected int j() {
    PointF pointF = this.k;
    if (pointF != null) {
      float f = pointF.y;
      if (f != 0.0F)
        return (f > 0.0F) ? 1 : -1; 
    } 
    return 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */