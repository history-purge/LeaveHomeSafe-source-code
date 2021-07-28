package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.f.a.f.a0.h;
import e.f.a.f.l.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
  private final int R;
  
  private final e.f.a.f.a0.g S;
  
  private Animator T;
  
  private Animator U;
  
  private int V;
  
  private int W;
  
  private boolean a0;
  
  private int b0;
  
  private ArrayList<f> c0;
  
  private boolean d0;
  
  private Behavior e0;
  
  private int f0;
  
  AnimatorListenerAdapter g0;
  
  k<FloatingActionButton> h0;
  
  private void a(int paramInt, boolean paramBoolean) {
    if (!v.I((View)this))
      return; 
    Animator animator = this.U;
    if (animator != null)
      animator.cancel(); 
    ArrayList<Animator> arrayList = new ArrayList();
    if (!q()) {
      paramInt = 0;
      paramBoolean = false;
    } 
    a(paramInt, paramBoolean, arrayList);
    AnimatorSet animatorSet = new AnimatorSet();
    animatorSet.playTogether(arrayList);
    this.U = (Animator)animatorSet;
    this.U.addListener((Animator.AnimatorListener)new c(this));
    this.U.start();
  }
  
  private void a(int paramInt, boolean paramBoolean, List<Animator> paramList) {
    AnimatorSet animatorSet;
    ActionMenuView actionMenuView = getActionMenuView();
    if (actionMenuView == null)
      return; 
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[] { 1.0F });
    if (Math.abs(actionMenuView.getTranslationX() - a(actionMenuView, paramInt, paramBoolean)) > 1.0F) {
      ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[] { 0.0F });
      objectAnimator1.addListener((Animator.AnimatorListener)new d(this, actionMenuView, paramInt, paramBoolean));
      animatorSet = new AnimatorSet();
      animatorSet.setDuration(150L);
      animatorSet.playSequentially(new Animator[] { (Animator)objectAnimator1, (Animator)objectAnimator });
      paramList.add(animatorSet);
      return;
    } 
    if (animatorSet.getAlpha() < 1.0F)
      paramList.add(objectAnimator); 
  }
  
  private void a(FloatingActionButton paramFloatingActionButton) {
    paramFloatingActionButton.a((Animator.AnimatorListener)this.g0);
    paramFloatingActionButton.b((Animator.AnimatorListener)new e(this));
    paramFloatingActionButton.a(this.h0);
  }
  
  private void b(int paramInt, List<Animator> paramList) {
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(o(), "translationX", new float[] { c(paramInt) });
    objectAnimator.setDuration(300L);
    paramList.add(objectAnimator);
  }
  
  private void b(ActionMenuView paramActionMenuView, int paramInt, boolean paramBoolean) {
    paramActionMenuView.setTranslationX(a(paramActionMenuView, paramInt, paramBoolean));
  }
  
  private float c(int paramInt) {
    int i = v.p((View)this);
    boolean bool = true;
    if (i == 1) {
      i = 1;
    } else {
      i = 0;
    } 
    if (paramInt == 1) {
      int j = getMeasuredWidth() / 2;
      int m = this.R;
      paramInt = bool;
      if (i != 0)
        paramInt = -1; 
      return ((j - m) * paramInt);
    } 
    return 0.0F;
  }
  
  private void d(int paramInt) {
    if (this.V != paramInt) {
      if (!v.I((View)this))
        return; 
      Animator animator = this.T;
      if (animator != null)
        animator.cancel(); 
      ArrayList<Animator> arrayList = new ArrayList();
      if (this.W == 1) {
        b(paramInt, arrayList);
      } else {
        a(paramInt, arrayList);
      } 
      AnimatorSet animatorSet = new AnimatorSet();
      animatorSet.playTogether(arrayList);
      this.T = (Animator)animatorSet;
      this.T.addListener((Animator.AnimatorListener)new a(this));
      this.T.start();
    } 
  }
  
  private ActionMenuView getActionMenuView() {
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (view instanceof ActionMenuView)
        return (ActionMenuView)view; 
    } 
    return null;
  }
  
  private int getBottomInset() {
    return this.f0;
  }
  
  private float getFabTranslationX() {
    return c(this.V);
  }
  
  private float getFabTranslationY() {
    return -getTopEdgeTreatment().a();
  }
  
  private a getTopEdgeTreatment() {
    return (a)this.S.k().h();
  }
  
  private void l() {
    Animator animator = this.U;
    if (animator != null)
      animator.cancel(); 
    animator = this.T;
    if (animator != null)
      animator.cancel(); 
  }
  
  private void m() {
    int i = this.b0 - 1;
    this.b0 = i;
    if (i == 0) {
      ArrayList<f> arrayList = this.c0;
      if (arrayList != null) {
        Iterator<f> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((f)iterator.next()).a(this); 
      } 
    } 
  }
  
  private void n() {
    int i = this.b0;
    this.b0 = i + 1;
    if (i == 0) {
      ArrayList<f> arrayList = this.c0;
      if (arrayList != null) {
        Iterator<f> iterator = arrayList.iterator();
        while (iterator.hasNext())
          ((f)iterator.next()).b(this); 
      } 
    } 
  }
  
  private FloatingActionButton o() {
    View view = p();
    return (view instanceof FloatingActionButton) ? (FloatingActionButton)view : null;
  }
  
  private View p() {
    if (!(getParent() instanceof CoordinatorLayout))
      return null; 
    for (View view : ((CoordinatorLayout)getParent()).c((View)this)) {
      if (view instanceof FloatingActionButton || view instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton)
        return view; 
    } 
    return null;
  }
  
  private boolean q() {
    FloatingActionButton floatingActionButton = o();
    return (floatingActionButton != null && floatingActionButton.c());
  }
  
  private void r() {
    ActionMenuView actionMenuView = getActionMenuView();
    if (actionMenuView != null) {
      actionMenuView.setAlpha(1.0F);
      if (!q()) {
        b(actionMenuView, 0, false);
        return;
      } 
      b(actionMenuView, this.V, this.d0);
    } 
  }
  
  private void s() {
    float f;
    getTopEdgeTreatment().e(getFabTranslationX());
    View view = p();
    e.f.a.f.a0.g g1 = this.S;
    if (this.d0 && q()) {
      f = 1.0F;
    } else {
      f = 0.0F;
    } 
    g1.b(f);
    if (view != null) {
      view.setTranslationY(getFabTranslationY());
      view.setTranslationX(getFabTranslationX());
    } 
  }
  
  protected int a(ActionMenuView paramActionMenuView, int paramInt, boolean paramBoolean) {
    int i;
    boolean bool;
    if (v.p((View)this) == 1) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      i = getMeasuredWidth();
    } else {
      i = 0;
    } 
    int m = 0;
    int j;
    for (j = i; m < getChildCount(); j = i) {
      boolean bool1;
      View view = getChildAt(m);
      if (view.getLayoutParams() instanceof Toolbar.e && (((androidx.appcompat.app.a.a)view.getLayoutParams()).a & 0x800007) == 8388611) {
        bool1 = true;
      } else {
        bool1 = false;
      } 
      i = j;
      if (bool1)
        if (bool) {
          i = Math.min(j, view.getLeft());
        } else {
          i = Math.max(j, view.getRight());
        }  
      m++;
    } 
    if (bool) {
      i = paramActionMenuView.getRight();
    } else {
      i = paramActionMenuView.getLeft();
    } 
    return (paramInt == 1 && paramBoolean) ? (j - i) : 0;
  }
  
  protected void a(int paramInt, List<Animator> paramList) {
    FloatingActionButton floatingActionButton = o();
    if (floatingActionButton != null) {
      if (floatingActionButton.b())
        return; 
      n();
      floatingActionButton.a(new b(this, paramInt));
    } 
  }
  
  boolean b(int paramInt) {
    float f = paramInt;
    if (f != getTopEdgeTreatment().d()) {
      getTopEdgeTreatment().d(f);
      this.S.invalidateSelf();
      return true;
    } 
    return false;
  }
  
  public ColorStateList getBackgroundTint() {
    return this.S.l();
  }
  
  public Behavior getBehavior() {
    if (this.e0 == null)
      this.e0 = new Behavior(); 
    return this.e0;
  }
  
  public float getCradleVerticalOffset() {
    return getTopEdgeTreatment().a();
  }
  
  public int getFabAlignmentMode() {
    return this.V;
  }
  
  public int getFabAnimationMode() {
    return this.W;
  }
  
  public float getFabCradleMargin() {
    return getTopEdgeTreatment().b();
  }
  
  public float getFabCradleRoundedCornerRadius() {
    return getTopEdgeTreatment().c();
  }
  
  public boolean getHideOnScroll() {
    return this.a0;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    h.a((View)this, this.S);
    if (getParent() instanceof ViewGroup)
      ((ViewGroup)getParent()).setClipChildren(false); 
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramBoolean) {
      l();
      s();
    } 
    r();
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof g)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    g g1 = (g)paramParcelable;
    super.onRestoreInstanceState(g1.e());
    this.V = g1.e;
    this.d0 = g1.f;
  }
  
  protected Parcelable onSaveInstanceState() {
    g g1 = new g(super.onSaveInstanceState());
    g1.e = this.V;
    g1.f = this.d0;
    return (Parcelable)g1;
  }
  
  public void setBackgroundTint(ColorStateList paramColorStateList) {
    androidx.core.graphics.drawable.a.a((Drawable)this.S, paramColorStateList);
  }
  
  public void setCradleVerticalOffset(float paramFloat) {
    if (paramFloat != getCradleVerticalOffset()) {
      getTopEdgeTreatment().a(paramFloat);
      this.S.invalidateSelf();
      s();
    } 
  }
  
  public void setElevation(float paramFloat) {
    this.S.a(paramFloat);
    int i = this.S.j();
    int j = this.S.i();
    getBehavior().a((View)this, i - j);
  }
  
  public void setFabAlignmentMode(int paramInt) {
    d(paramInt);
    a(paramInt, this.d0);
    this.V = paramInt;
  }
  
  public void setFabAnimationMode(int paramInt) {
    this.W = paramInt;
  }
  
  public void setFabCradleMargin(float paramFloat) {
    if (paramFloat != getFabCradleMargin()) {
      getTopEdgeTreatment().b(paramFloat);
      this.S.invalidateSelf();
    } 
  }
  
  public void setFabCradleRoundedCornerRadius(float paramFloat) {
    if (paramFloat != getFabCradleRoundedCornerRadius()) {
      getTopEdgeTreatment().c(paramFloat);
      this.S.invalidateSelf();
    } 
  }
  
  public void setHideOnScroll(boolean paramBoolean) {
    this.a0 = paramBoolean;
  }
  
  public void setSubtitle(CharSequence paramCharSequence) {}
  
  public void setTitle(CharSequence paramCharSequence) {}
  
  public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
    private final Rect e = new Rect();
    
    private WeakReference<BottomAppBar> f;
    
    private int g;
    
    private final View.OnLayoutChangeListener h = new a(this);
    
    public Behavior() {}
    
    public Behavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, BottomAppBar param1BottomAppBar, int param1Int) {
      this.f = new WeakReference<BottomAppBar>(param1BottomAppBar);
      View view = BottomAppBar.d(param1BottomAppBar);
      if (view != null && !v.I(view)) {
        CoordinatorLayout.f f = (CoordinatorLayout.f)view.getLayoutParams();
        f.d = 49;
        this.g = ((ViewGroup.MarginLayoutParams)f).bottomMargin;
        if (view instanceof FloatingActionButton) {
          FloatingActionButton floatingActionButton = (FloatingActionButton)view;
          floatingActionButton.addOnLayoutChangeListener(this.h);
          BottomAppBar.a(param1BottomAppBar, floatingActionButton);
        } 
        BottomAppBar.e(param1BottomAppBar);
      } 
      param1CoordinatorLayout.c((View)param1BottomAppBar, param1Int);
      return super.a(param1CoordinatorLayout, (View)param1BottomAppBar, param1Int);
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, BottomAppBar param1BottomAppBar, View param1View1, View param1View2, int param1Int1, int param1Int2) {
      return (param1BottomAppBar.getHideOnScroll() && super.b(param1CoordinatorLayout, (View)param1BottomAppBar, param1View1, param1View2, param1Int1, param1Int2));
    }
    
    class a implements View.OnLayoutChangeListener {
      a(BottomAppBar.Behavior this$0) {}
      
      public void onLayoutChange(View param2View, int param2Int1, int param2Int2, int param2Int3, int param2Int4, int param2Int5, int param2Int6, int param2Int7, int param2Int8) {
        BottomAppBar bottomAppBar = BottomAppBar.Behavior.a(this.c).get();
        if (bottomAppBar == null || !(param2View instanceof FloatingActionButton)) {
          param2View.removeOnLayoutChangeListener(this);
          return;
        } 
        FloatingActionButton floatingActionButton = (FloatingActionButton)param2View;
        floatingActionButton.b(BottomAppBar.Behavior.b(this.c));
        param2Int1 = BottomAppBar.Behavior.b(this.c).height();
        bottomAppBar.b(param2Int1);
        CoordinatorLayout.f f = (CoordinatorLayout.f)param2View.getLayoutParams();
        if (BottomAppBar.Behavior.c(this.c) == 0) {
          param2Int1 = (floatingActionButton.getMeasuredHeight() - param2Int1) / 2;
          param2Int2 = bottomAppBar.getResources().getDimensionPixelOffset(e.f.a.f.d.mtrl_bottomappbar_fab_bottom_margin);
          ((ViewGroup.MarginLayoutParams)f).bottomMargin = BottomAppBar.c(bottomAppBar) + param2Int2 - param2Int1;
        } 
      }
    }
  }
  
  class a implements View.OnLayoutChangeListener {
    a(BottomAppBar this$0) {}
    
    public void onLayoutChange(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5, int param1Int6, int param1Int7, int param1Int8) {
      BottomAppBar bottomAppBar = BottomAppBar.Behavior.a(this.c).get();
      if (bottomAppBar == null || !(param1View instanceof FloatingActionButton)) {
        param1View.removeOnLayoutChangeListener(this);
        return;
      } 
      FloatingActionButton floatingActionButton = (FloatingActionButton)param1View;
      floatingActionButton.b(BottomAppBar.Behavior.b(this.c));
      param1Int1 = BottomAppBar.Behavior.b(this.c).height();
      bottomAppBar.b(param1Int1);
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1View.getLayoutParams();
      if (BottomAppBar.Behavior.c(this.c) == 0) {
        param1Int1 = (floatingActionButton.getMeasuredHeight() - param1Int1) / 2;
        param1Int2 = bottomAppBar.getResources().getDimensionPixelOffset(e.f.a.f.d.mtrl_bottomappbar_fab_bottom_margin);
        ((ViewGroup.MarginLayoutParams)f).bottomMargin = BottomAppBar.c(bottomAppBar) + param1Int2 - param1Int1;
      } 
    }
  }
  
  class a extends AnimatorListenerAdapter {
    a(BottomAppBar this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      BottomAppBar.g(this.a);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      BottomAppBar.f(this.a);
    }
  }
  
  class b extends FloatingActionButton.b {
    b(BottomAppBar this$0, int param1Int) {}
    
    public void a(FloatingActionButton param1FloatingActionButton) {
      param1FloatingActionButton.setTranslationX(BottomAppBar.a(this.b, this.a));
      param1FloatingActionButton.b(new a(this));
    }
    
    class a extends FloatingActionButton.b {
      a(BottomAppBar.b this$0) {}
      
      public void b(FloatingActionButton param2FloatingActionButton) {
        BottomAppBar.g(this.a.b);
      }
    }
  }
  
  class a extends FloatingActionButton.b {
    a(BottomAppBar this$0) {}
    
    public void b(FloatingActionButton param1FloatingActionButton) {
      BottomAppBar.g(this.a.b);
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(BottomAppBar this$0) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      BottomAppBar.g(this.a);
      BottomAppBar.a(this.a, (Animator)null);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      BottomAppBar.f(this.a);
    }
  }
  
  class d extends AnimatorListenerAdapter {
    public boolean a;
    
    d(BottomAppBar this$0, ActionMenuView param1ActionMenuView, int param1Int, boolean param1Boolean) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a)
        BottomAppBar.a(this.e, this.b, this.c, this.d); 
    }
  }
  
  class e extends AnimatorListenerAdapter {
    e(BottomAppBar this$0) {}
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.g0.onAnimationStart(param1Animator);
      FloatingActionButton floatingActionButton = BottomAppBar.a(this.a);
      if (floatingActionButton != null)
        floatingActionButton.setTranslationX(BottomAppBar.b(this.a)); 
    }
  }
  
  static interface f {
    void a(BottomAppBar param1BottomAppBar);
    
    void b(BottomAppBar param1BottomAppBar);
  }
  
  static class g extends b.i.a.a {
    public static final Parcelable.Creator<g> CREATOR = (Parcelable.Creator<g>)new a();
    
    int e;
    
    boolean f;
    
    public g(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      boolean bool;
      this.e = param1Parcel.readInt();
      if (param1Parcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      this.f = bool;
    }
    
    public g(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<g> {
      public BottomAppBar.g createFromParcel(Parcel param2Parcel) {
        return new BottomAppBar.g(param2Parcel, null);
      }
      
      public BottomAppBar.g createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new BottomAppBar.g(param2Parcel, param2ClassLoader);
      }
      
      public BottomAppBar.g[] newArray(int param2Int) {
        return new BottomAppBar.g[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<g> {
    public BottomAppBar.g createFromParcel(Parcel param1Parcel) {
      return new BottomAppBar.g(param1Parcel, null);
    }
    
    public BottomAppBar.g createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new BottomAppBar.g(param1Parcel, param1ClassLoader);
    }
    
    public BottomAppBar.g[] newArray(int param1Int) {
      return new BottomAppBar.g[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/bottomappbar/BottomAppBar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */