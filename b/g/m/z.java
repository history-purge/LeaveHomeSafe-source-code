package b.g.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class z {
  private WeakReference<View> a;
  
  Runnable b = null;
  
  Runnable c = null;
  
  int d = -1;
  
  z(View paramView) {
    this.a = new WeakReference<View>(paramView);
  }
  
  private void a(View paramView, a0 parama0) {
    if (parama0 != null) {
      paramView.animate().setListener((Animator.AnimatorListener)new a(this, parama0, paramView));
      return;
    } 
    paramView.animate().setListener(null);
  }
  
  public z a(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().alpha(paramFloat); 
    return this;
  }
  
  public z a(long paramLong) {
    View view = this.a.get();
    if (view != null)
      view.animate().setDuration(paramLong); 
    return this;
  }
  
  public z a(Interpolator paramInterpolator) {
    View view = this.a.get();
    if (view != null)
      view.animate().setInterpolator((TimeInterpolator)paramInterpolator); 
    return this;
  }
  
  public z a(a0 parama0) {
    View view = this.a.get();
    if (view != null) {
      if (Build.VERSION.SDK_INT < 16) {
        view.setTag(2113929216, parama0);
        parama0 = new c(this);
      } 
      a(view, parama0);
    } 
    return this;
  }
  
  public z a(c0 paramc0) {
    View view = this.a.get();
    if (view != null && Build.VERSION.SDK_INT >= 19) {
      b b = null;
      if (paramc0 != null)
        b = new b(this, paramc0, view); 
      view.animate().setUpdateListener(b);
    } 
    return this;
  }
  
  public void a() {
    View view = this.a.get();
    if (view != null)
      view.animate().cancel(); 
  }
  
  public long b() {
    View view = this.a.get();
    return (view != null) ? view.animate().getDuration() : 0L;
  }
  
  public z b(float paramFloat) {
    View view = this.a.get();
    if (view != null)
      view.animate().translationY(paramFloat); 
    return this;
  }
  
  public z b(long paramLong) {
    View view = this.a.get();
    if (view != null)
      view.animate().setStartDelay(paramLong); 
    return this;
  }
  
  public void c() {
    View view = this.a.get();
    if (view != null)
      view.animate().start(); 
  }
  
  class a extends AnimatorListenerAdapter {
    a(z this$0, a0 param1a0, View param1View) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a.a(this.b);
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.b(this.b);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.c(this.b);
    }
  }
  
  class b implements ValueAnimator.AnimatorUpdateListener {
    b(z this$0, c0 param1c0, View param1View) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.a(this.b);
    }
  }
  
  static class c implements a0 {
    z a;
    
    boolean b;
    
    c(z param1z) {
      this.a = param1z;
    }
    
    public void a(View param1View) {
      Object object = param1View.getTag(2113929216);
      if (object instanceof a0) {
        object = object;
      } else {
        object = null;
      } 
      if (object != null)
        object.a(param1View); 
    }
    
    @SuppressLint({"WrongConstant"})
    public void b(View param1View) {
      int i = this.a.d;
      a0 a01 = null;
      if (i > -1) {
        param1View.setLayerType(i, null);
        this.a.d = -1;
      } 
      if (Build.VERSION.SDK_INT >= 16 || !this.b) {
        z z1 = this.a;
        Runnable runnable = z1.c;
        if (runnable != null) {
          z1.c = null;
          runnable.run();
        } 
        Object object = param1View.getTag(2113929216);
        if (object instanceof a0)
          a01 = (a0)object; 
        if (a01 != null)
          a01.b(param1View); 
        this.b = true;
      } 
    }
    
    public void c(View param1View) {
      this.b = false;
      int i = this.a.d;
      a0 a01 = null;
      if (i > -1)
        param1View.setLayerType(2, null); 
      z z1 = this.a;
      Runnable runnable = z1.b;
      if (runnable != null) {
        z1.b = null;
        runnable.run();
      } 
      Object object = param1View.getTag(2113929216);
      if (object instanceof a0)
        a01 = (a0)object; 
      if (a01 != null)
        a01.c(param1View); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */