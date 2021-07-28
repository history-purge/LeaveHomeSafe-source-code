package com.swmansion.rnscreens;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.q;
import com.google.android.material.appbar.AppBarLayout;

public class h extends f {
  private static final float f0 = q.b(4.0F);
  
  private AppBarLayout c0;
  
  private Toolbar d0;
  
  private boolean e0;
  
  @SuppressLint({"ValidFragment"})
  public h(b paramb) {
    super(paramb);
  }
  
  private void D0() {
    ViewParent viewParent = M().getParent();
    if (viewParent instanceof g)
      ((g)viewParent).f(); 
  }
  
  public boolean A0() {
    return this.b0.b();
  }
  
  public void B0() {
    View view = this.b0.getChildAt(0);
    if (view instanceof i)
      ((i)view).b(); 
  }
  
  public void C0() {
    if (this.c0 != null) {
      Toolbar toolbar = this.d0;
      if (toolbar != null) {
        ViewParent viewParent = toolbar.getParent();
        AppBarLayout appBarLayout = this.c0;
        if (viewParent == appBarLayout)
          appBarLayout.removeView((View)this.d0); 
      } 
    } 
    this.d0 = null;
  }
  
  public View a(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle) {
    a a = new a(o(), this);
    CoordinatorLayout.f f1 = new CoordinatorLayout.f(-1, -1);
    f1.a((CoordinatorLayout.c)new AppBarLayout.ScrollingViewBehavior());
    this.b0.setLayoutParams((ViewGroup.LayoutParams)f1);
    b b = this.b0;
    f.c((View)b);
    a.addView((View)b);
    this.c0 = new AppBarLayout(o());
    this.c0.setBackgroundColor(0);
    this.c0.setLayoutParams((ViewGroup.LayoutParams)new AppBarLayout.d(-1, -2));
    a.addView((View)this.c0);
    if (this.e0)
      this.c0.setTargetElevation(0.0F); 
    Toolbar toolbar = this.d0;
    if (toolbar != null) {
      AppBarLayout appBarLayout = this.c0;
      f.c((View)toolbar);
      appBarLayout.addView((View)toolbar);
    } 
    return (View)a;
  }
  
  public Animation a(int paramInt1, boolean paramBoolean, int paramInt2) {
    if (paramBoolean && paramInt1 == 0)
      D0(); 
    return null;
  }
  
  public void a(Toolbar paramToolbar) {
    AppBarLayout appBarLayout = this.c0;
    if (appBarLayout != null)
      appBarLayout.addView((View)paramToolbar); 
    this.d0 = paramToolbar;
    AppBarLayout.d d = new AppBarLayout.d(-1, -2);
    d.a(0);
    this.d0.setLayoutParams((ViewGroup.LayoutParams)d);
  }
  
  public void j(boolean paramBoolean) {
    if (this.e0 != paramBoolean) {
      float f1;
      AppBarLayout appBarLayout = this.c0;
      if (paramBoolean) {
        f1 = 0.0F;
      } else {
        f1 = f0;
      } 
      appBarLayout.setTargetElevation(f1);
      this.e0 = paramBoolean;
    } 
  }
  
  public void x0() {
    super.x0();
    D0();
  }
  
  public boolean y0() {
    d d = this.b0.getContainer();
    if (d instanceof g) {
      if (((g)d).getRootScreen() == w0()) {
        Fragment fragment = y();
        return (fragment instanceof h) ? ((h)fragment).y0() : false;
      } 
      return true;
    } 
    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
  }
  
  public void z0() {
    d d = this.b0.getContainer();
    if (d instanceof g) {
      ((g)d).a(this);
      return;
    } 
    throw new IllegalStateException("ScreenStackFragment added into a non-stack container");
  }
  
  private static class a extends CoordinatorLayout {
    private final f B;
    
    public a(Context param1Context, f param1f) {
      super(param1Context);
      this.B = param1f;
    }
    
    protected void onAnimationEnd() {
      super.onAnimationEnd();
      this.B.x0();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */