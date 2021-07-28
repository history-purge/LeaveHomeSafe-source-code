package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebook.react.views.view.f;

@SuppressLint({"ViewConstructor"})
public class e extends f implements ViewTreeObserver.OnPreDrawListener {
  private a u;
  
  private a v;
  
  private c w;
  
  public e(Context paramContext) {
    super(paramContext);
  }
  
  private void e() {
    a a1 = f.b((View)this);
    c c1 = f.a((ViewGroup)getRootView(), (View)this);
    if (a1 != null && c1 != null) {
      a a2 = this.v;
      if (a2 == null || this.w == null || !a2.a(a1) || !this.w.a(c1)) {
        a a3 = this.u;
        e.e.m.a.a.a(a3);
        a3.a(this, a1, c1);
        this.v = a1;
        this.w = c1;
      } 
    } 
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    getViewTreeObserver().addOnPreDrawListener(this);
    e();
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    getViewTreeObserver().removeOnPreDrawListener(this);
  }
  
  public boolean onPreDraw() {
    e();
    return true;
  }
  
  public void setOnInsetsChangeListener(a parama) {
    this.u = parama;
  }
  
  public static interface a {
    void a(e param1e, a param1a, c param1c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */