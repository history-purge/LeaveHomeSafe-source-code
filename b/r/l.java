package b.r;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import b.g.m.v;

@SuppressLint({"ViewConstructor"})
class l extends ViewGroup implements i {
  ViewGroup c;
  
  View d;
  
  final View e;
  
  int f;
  
  private Matrix g;
  
  private final ViewTreeObserver.OnPreDrawListener h = new a(this);
  
  l(View paramView) {
    super(paramView.getContext());
    this.e = paramView;
    setWillNotDraw(false);
    setLayerType(2, null);
  }
  
  static l a(View paramView) {
    return (l)paramView.getTag(s.ghost_view);
  }
  
  static l a(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    if (paramView.getParent() instanceof ViewGroup) {
      Matrix matrix1;
      l l1;
      Matrix matrix2;
      j j1 = j.a(paramViewGroup);
      l l3 = a(paramView);
      byte b = 0;
      l l2 = l3;
      int j = b;
      if (l3 != null) {
        j j2 = (j)l3.getParent();
        l2 = l3;
        j = b;
        if (j2 != j1) {
          j = l3.f;
          j2.removeView((View)l3);
          l2 = null;
        } 
      } 
      if (l2 == null) {
        j j2;
        matrix2 = paramMatrix;
        if (paramMatrix == null) {
          matrix2 = new Matrix();
          b(paramView, paramViewGroup, matrix2);
        } 
        l1 = new l(paramView);
        l1.a(matrix2);
        if (j1 == null) {
          j2 = new j(paramViewGroup);
        } else {
          j1.a();
          j2 = j1;
        } 
        a((View)paramViewGroup, (View)j2);
        a((View)paramViewGroup, (View)l1);
        j2.a(l1);
        l1.f = j;
        l l4 = l1;
      } else {
        matrix1 = matrix2;
        if (l1 != null) {
          matrix2.a((Matrix)l1);
          matrix1 = matrix2;
        } 
      } 
      ((l)matrix1).f++;
      return (l)matrix1;
    } 
    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
  }
  
  static void a(View paramView1, View paramView2) {
    o0.a(paramView2, paramView2.getLeft(), paramView2.getTop(), paramView2.getLeft() + paramView1.getWidth(), paramView2.getTop() + paramView1.getHeight());
  }
  
  static void a(View paramView, l paraml) {
    paramView.setTag(s.ghost_view, paraml);
  }
  
  static void b(View paramView) {
    l l1 = a(paramView);
    if (l1 != null) {
      l1.f--;
      if (l1.f <= 0)
        ((j)l1.getParent()).removeView((View)l1); 
    } 
  }
  
  static void b(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix) {
    ViewGroup viewGroup = (ViewGroup)paramView.getParent();
    paramMatrix.reset();
    o0.b((View)viewGroup, paramMatrix);
    paramMatrix.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
    o0.c((View)paramViewGroup, paramMatrix);
  }
  
  void a(Matrix paramMatrix) {
    this.g = paramMatrix;
  }
  
  public void a(ViewGroup paramViewGroup, View paramView) {
    this.c = paramViewGroup;
    this.d = paramView;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    a(this.e, this);
    this.e.getViewTreeObserver().addOnPreDrawListener(this.h);
    o0.a(this.e, 4);
    if (this.e.getParent() != null)
      ((View)this.e.getParent()).invalidate(); 
  }
  
  protected void onDetachedFromWindow() {
    this.e.getViewTreeObserver().removeOnPreDrawListener(this.h);
    o0.a(this.e, 0);
    a(this.e, (l)null);
    if (this.e.getParent() != null)
      ((View)this.e.getParent()).invalidate(); 
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    c.a(paramCanvas, true);
    paramCanvas.setMatrix(this.g);
    o0.a(this.e, 0);
    this.e.invalidate();
    o0.a(this.e, 4);
    drawChild(paramCanvas, this.e, getDrawingTime());
    c.a(paramCanvas, false);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
    if (a(this.e) == this) {
      if (paramInt == 0) {
        paramInt = 4;
      } else {
        paramInt = 0;
      } 
      o0.a(this.e, paramInt);
    } 
  }
  
  class a implements ViewTreeObserver.OnPreDrawListener {
    a(l this$0) {}
    
    public boolean onPreDraw() {
      v.M((View)this.c);
      l l1 = this.c;
      ViewGroup viewGroup = l1.c;
      if (viewGroup != null) {
        View view = l1.d;
        if (view != null) {
          viewGroup.endViewTransition(view);
          v.M((View)this.c.c);
          viewGroup = this.c;
          ((l)viewGroup).c = null;
          ((l)viewGroup).d = null;
        } 
      } 
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */