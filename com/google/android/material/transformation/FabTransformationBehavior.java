package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import e.f.a.f.f;
import e.f.a.f.l.h;
import e.f.a.f.l.i;
import e.f.a.f.l.j;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
  private final Rect c = new Rect();
  
  private final RectF d = new RectF();
  
  private final RectF e = new RectF();
  
  private final int[] f = new int[2];
  
  private float g;
  
  private float h;
  
  public FabTransformationBehavior() {}
  
  public FabTransformationBehavior(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
  }
  
  private float a(View paramView1, View paramView2, j paramj) {
    RectF rectF1 = this.d;
    RectF rectF2 = this.e;
    a(paramView1, rectF1);
    b(paramView2, rectF2);
    rectF2.offset(-c(paramView1, paramView2, paramj), 0.0F);
    return rectF1.centerX() - rectF2.left;
  }
  
  private float a(e parame, i parami, float paramFloat1, float paramFloat2) {
    long l1 = parami.a();
    long l2 = parami.b();
    i i1 = parame.a.a("expansion");
    float f = (float)(i1.a() + i1.b() + 17L - l1) / (float)l2;
    return e.f.a.f.l.a.a(paramFloat1, paramFloat2, parami.c().getInterpolation(f));
  }
  
  private Pair<i, i> a(float paramFloat1, float paramFloat2, boolean paramBoolean, e parame) {
    i i;
    h h;
    String str;
    if (paramFloat1 == 0.0F || paramFloat2 == 0.0F) {
      i i1 = parame.a.a("translationXLinear");
      h = parame.a;
      str = "translationYLinear";
      i = i1;
      return new Pair(i, h.a(str));
    } 
    if ((paramBoolean && paramFloat2 < 0.0F) || (!paramBoolean && paramFloat2 > 0.0F)) {
      i i1 = ((e)i).a.a("translationXCurveUpwards");
      h h1 = ((e)i).a;
      str = "translationYCurveUpwards";
      i = i1;
      h = h1;
    } else {
      i i1 = ((e)i).a.a("translationXCurveDownwards");
      h h1 = ((e)i).a;
      str = "translationYCurveDownwards";
      i = i1;
      h = h1;
    } 
    return new Pair(i, h.a(str));
  }
  
  private ViewGroup a(View paramView) {
    View view = paramView.findViewById(f.mtrl_child_content_container);
    return (view != null) ? c(view) : ((paramView instanceof b || paramView instanceof a) ? c(((ViewGroup)paramView).getChildAt(0)) : c(paramView));
  }
  
  private void a(View paramView, long paramLong, int paramInt1, int paramInt2, float paramFloat, List<Animator> paramList) {
    if (Build.VERSION.SDK_INT >= 21 && paramLong > 0L) {
      Animator animator = ViewAnimationUtils.createCircularReveal(paramView, paramInt1, paramInt2, paramFloat, paramFloat);
      animator.setStartDelay(0L);
      animator.setDuration(paramLong);
      paramList.add(animator);
    } 
  }
  
  private void a(View paramView, long paramLong1, long paramLong2, long paramLong3, int paramInt1, int paramInt2, float paramFloat, List<Animator> paramList) {
    if (Build.VERSION.SDK_INT >= 21) {
      paramLong1 += paramLong2;
      if (paramLong1 < paramLong3) {
        Animator animator = ViewAnimationUtils.createCircularReveal(paramView, paramInt1, paramInt2, paramFloat, paramFloat);
        animator.setStartDelay(paramLong1);
        animator.setDuration(paramLong3 - paramLong1);
        paramList.add(animator);
      } 
    } 
  }
  
  private void a(View paramView, RectF paramRectF) {
    b(paramView, paramRectF);
    paramRectF.offset(this.g, this.h);
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean, e parame, List<Animator> paramList) {
    float f1 = c(paramView1, paramView2, parame.b);
    float f2 = d(paramView1, paramView2, parame.b);
    Pair<i, i> pair = a(f1, f2, paramBoolean, parame);
    i i1 = (i)pair.first;
    i i2 = (i)pair.second;
    Property property1 = View.TRANSLATION_X;
    if (!paramBoolean)
      f1 = this.g; 
    ObjectAnimator objectAnimator2 = ObjectAnimator.ofFloat(paramView1, property1, new float[] { f1 });
    Property property2 = View.TRANSLATION_Y;
    if (paramBoolean) {
      f1 = f2;
    } else {
      f1 = this.h;
    } 
    ObjectAnimator objectAnimator1 = ObjectAnimator.ofFloat(paramView1, property2, new float[] { f1 });
    i1.a((Animator)objectAnimator2);
    i2.a((Animator)objectAnimator1);
    paramList.add(objectAnimator2);
    paramList.add(objectAnimator1);
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, e parame, float paramFloat1, float paramFloat2, List<Animator> paramList, List<Animator.AnimatorListener> paramList1) {
    Animator animator;
    if (!(paramView2 instanceof e.f.a.f.p.d))
      return; 
    e.f.a.f.p.d d = (e.f.a.f.p.d)paramView2;
    float f2 = a(paramView1, paramView2, parame.b);
    float f3 = b(paramView1, paramView2, parame.b);
    ((FloatingActionButton)paramView1).a(this.c);
    float f1 = this.c.width() / 2.0F;
    i i = parame.a.a("expansion");
    if (paramBoolean1) {
      if (!paramBoolean2)
        d.setRevealInfo(new e.f.a.f.p.d.e(f2, f3, f1)); 
      if (paramBoolean2)
        f1 = (d.getRevealInfo()).c; 
      animator = e.f.a.f.p.a.a(d, f2, f3, e.f.a.f.v.a.a(f2, f3, 0.0F, 0.0F, paramFloat1, paramFloat2));
      animator.addListener((Animator.AnimatorListener)new d(this, d));
      a(paramView2, i.a(), (int)f2, (int)f3, f1, paramList);
    } else {
      paramFloat1 = (d.getRevealInfo()).c;
      animator = e.f.a.f.p.a.a(d, f2, f3, f1);
      long l = i.a();
      int j = (int)f2;
      int k = (int)f3;
      a(paramView2, l, j, k, paramFloat1, paramList);
      a(paramView2, i.a(), i.b(), parame.a.a(), j, k, f1, paramList);
    } 
    i.a(animator);
    paramList.add(animator);
    paramList1.add(e.f.a.f.p.a.a(d));
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, e parame, List<Animator> paramList, List<Animator.AnimatorListener> paramList1) {
    ObjectAnimator objectAnimator;
    if (!(paramView2 instanceof ViewGroup))
      return; 
    if (paramView2 instanceof e.f.a.f.p.d && e.f.a.f.p.c.a == 0)
      return; 
    ViewGroup viewGroup = a(paramView2);
    if (viewGroup == null)
      return; 
    if (paramBoolean1) {
      if (!paramBoolean2)
        e.f.a.f.l.d.a.set(viewGroup, Float.valueOf(0.0F)); 
      objectAnimator = ObjectAnimator.ofFloat(viewGroup, e.f.a.f.l.d.a, new float[] { 1.0F });
    } else {
      objectAnimator = ObjectAnimator.ofFloat(objectAnimator, e.f.a.f.l.d.a, new float[] { 0.0F });
    } 
    parame.a.a("contentFade").a((Animator)objectAnimator);
    paramList.add(objectAnimator);
  }
  
  private void a(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, e parame, List<Animator> paramList, List<Animator.AnimatorListener> paramList1, RectF paramRectF) {
    ObjectAnimator objectAnimator1;
    ObjectAnimator objectAnimator2;
    float f1 = c(paramView1, paramView2, parame.b);
    float f2 = d(paramView1, paramView2, parame.b);
    Pair<i, i> pair = a(f1, f2, paramBoolean1, parame);
    i i1 = (i)pair.first;
    i i2 = (i)pair.second;
    if (paramBoolean1) {
      if (!paramBoolean2) {
        paramView2.setTranslationX(-f1);
        paramView2.setTranslationY(-f2);
      } 
      objectAnimator1 = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_X, new float[] { 0.0F });
      ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Y, new float[] { 0.0F });
      a(paramView2, parame, i1, i2, -f1, -f2, 0.0F, 0.0F, paramRectF);
      objectAnimator2 = objectAnimator;
    } else {
      objectAnimator1 = ObjectAnimator.ofFloat(objectAnimator2, View.TRANSLATION_X, new float[] { -f1 });
      objectAnimator2 = ObjectAnimator.ofFloat(objectAnimator2, View.TRANSLATION_Y, new float[] { -f2 });
    } 
    i1.a((Animator)objectAnimator1);
    i2.a((Animator)objectAnimator2);
    paramList.add(objectAnimator1);
    paramList.add(objectAnimator2);
  }
  
  private void a(View paramView, e parame, i parami1, i parami2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, RectF paramRectF) {
    paramFloat1 = a(parame, parami1, paramFloat1, paramFloat3);
    paramFloat2 = a(parame, parami2, paramFloat2, paramFloat4);
    Rect rect = this.c;
    paramView.getWindowVisibleDisplayFrame(rect);
    RectF rectF1 = this.d;
    rectF1.set(rect);
    RectF rectF2 = this.e;
    b(paramView, rectF2);
    rectF2.offset(paramFloat1, paramFloat2);
    rectF2.intersect(rectF1);
    paramRectF.set(rectF2);
  }
  
  private float b(View paramView1, View paramView2, j paramj) {
    RectF rectF1 = this.d;
    RectF rectF2 = this.e;
    a(paramView1, rectF1);
    b(paramView2, rectF2);
    rectF2.offset(0.0F, -d(paramView1, paramView2, paramj));
    return rectF1.centerY() - rectF2.top;
  }
  
  private int b(View paramView) {
    ColorStateList colorStateList = v.h(paramView);
    return (colorStateList != null) ? colorStateList.getColorForState(paramView.getDrawableState(), colorStateList.getDefaultColor()) : 0;
  }
  
  private void b(View paramView, RectF paramRectF) {
    paramRectF.set(0.0F, 0.0F, paramView.getWidth(), paramView.getHeight());
    int[] arrayOfInt = this.f;
    paramView.getLocationInWindow(arrayOfInt);
    paramRectF.offsetTo(arrayOfInt[0], arrayOfInt[1]);
    paramRectF.offset((int)-paramView.getTranslationX(), (int)-paramView.getTranslationY());
  }
  
  private void b(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, e parame, List<Animator> paramList, List<Animator.AnimatorListener> paramList1) {
    ObjectAnimator objectAnimator;
    if (!(paramView2 instanceof e.f.a.f.p.d))
      return; 
    e.f.a.f.p.d d = (e.f.a.f.p.d)paramView2;
    int i = b(paramView1);
    if (paramBoolean1) {
      if (!paramBoolean2)
        d.setCircularRevealScrimColor(i); 
      objectAnimator = ObjectAnimator.ofInt(d, e.f.a.f.p.d.d.a, new int[] { 0xFFFFFF & i });
    } else {
      objectAnimator = ObjectAnimator.ofInt(d, e.f.a.f.p.d.d.a, new int[] { i });
    } 
    objectAnimator.setEvaluator((TypeEvaluator)e.f.a.f.l.c.a());
    parame.a.a("color").a((Animator)objectAnimator);
    paramList.add(objectAnimator);
  }
  
  private float c(View paramView1, View paramView2, j paramj) {
    float f;
    RectF rectF1 = this.d;
    RectF rectF2 = this.e;
    a(paramView1, rectF1);
    b(paramView2, rectF2);
    int i = paramj.a & 0x7;
    if (i != 1) {
      if (i != 3) {
        if (i != 5) {
          f = 0.0F;
        } else {
          f = rectF2.right;
          float f1 = rectF1.right;
          f -= f1;
        } 
      } else {
        f = rectF2.left;
        float f1 = rectF1.left;
        f -= f1;
      } 
    } else {
      f = rectF2.centerX();
      float f1 = rectF1.centerX();
      f -= f1;
    } 
    return f + paramj.b;
  }
  
  private ViewGroup c(View paramView) {
    return (paramView instanceof ViewGroup) ? (ViewGroup)paramView : null;
  }
  
  @TargetApi(21)
  private void c(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, e parame, List<Animator> paramList, List<Animator.AnimatorListener> paramList1) {
    ObjectAnimator objectAnimator;
    float f = v.l(paramView2) - v.l(paramView1);
    if (paramBoolean1) {
      if (!paramBoolean2)
        paramView2.setTranslationZ(-f); 
      objectAnimator = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Z, new float[] { 0.0F });
    } else {
      objectAnimator = ObjectAnimator.ofFloat(paramView2, View.TRANSLATION_Z, new float[] { -f });
    } 
    parame.a.a("elevation").a((Animator)objectAnimator);
    paramList.add(objectAnimator);
  }
  
  private float d(View paramView1, View paramView2, j paramj) {
    float f;
    RectF rectF1 = this.d;
    RectF rectF2 = this.e;
    a(paramView1, rectF1);
    b(paramView2, rectF2);
    int i = paramj.a & 0x70;
    if (i != 16) {
      if (i != 48) {
        if (i != 80) {
          f = 0.0F;
        } else {
          f = rectF2.bottom;
          float f1 = rectF1.bottom;
          f -= f1;
        } 
      } else {
        f = rectF2.top;
        float f1 = rectF1.top;
        f -= f1;
      } 
    } else {
      f = rectF2.centerY();
      float f1 = rectF1.centerY();
      f -= f1;
    } 
    return f + paramj.c;
  }
  
  private void d(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2, e parame, List<Animator> paramList, List<Animator.AnimatorListener> paramList1) {
    if (paramView2 instanceof e.f.a.f.p.d) {
      ObjectAnimator objectAnimator;
      if (!(paramView1 instanceof ImageView))
        return; 
      e.f.a.f.p.d d = (e.f.a.f.p.d)paramView2;
      Drawable drawable = ((ImageView)paramView1).getDrawable();
      if (drawable == null)
        return; 
      drawable.mutate();
      if (paramBoolean1) {
        if (!paramBoolean2)
          drawable.setAlpha(255); 
        objectAnimator = ObjectAnimator.ofInt(drawable, e.f.a.f.l.e.b, new int[] { 0 });
      } else {
        objectAnimator = ObjectAnimator.ofInt(drawable, e.f.a.f.l.e.b, new int[] { 255 });
      } 
      objectAnimator.addUpdateListener(new b(this, paramView2));
      parame.a.a("iconFade").a((Animator)objectAnimator);
      paramList.add(objectAnimator);
      paramList1.add(new c(this, d, drawable));
    } 
  }
  
  protected abstract e a(Context paramContext, boolean paramBoolean);
  
  public void a(CoordinatorLayout.f paramf) {
    if (paramf.h == 0)
      paramf.h = 80; 
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView1, View paramView2) {
    if (paramView1.getVisibility() != 8) {
      boolean bool = paramView2 instanceof FloatingActionButton;
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool) {
        int i = ((FloatingActionButton)paramView2).getExpandedComponentIdHint();
        if (i != 0) {
          bool1 = bool2;
          return (i == paramView1.getId()) ? true : bool1;
        } 
      } else {
        return bool1;
      } 
    } else {
      throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    } 
    return true;
  }
  
  protected AnimatorSet b(View paramView1, View paramView2, boolean paramBoolean1, boolean paramBoolean2) {
    e e = a(paramView2.getContext(), paramBoolean1);
    if (paramBoolean1) {
      this.g = paramView1.getTranslationX();
      this.h = paramView1.getTranslationY();
    } 
    ArrayList<Animator> arrayList = new ArrayList();
    ArrayList<Animator.AnimatorListener> arrayList1 = new ArrayList();
    if (Build.VERSION.SDK_INT >= 21)
      c(paramView1, paramView2, paramBoolean1, paramBoolean2, e, arrayList, arrayList1); 
    RectF rectF = this.d;
    a(paramView1, paramView2, paramBoolean1, paramBoolean2, e, arrayList, arrayList1, rectF);
    float f1 = rectF.width();
    float f2 = rectF.height();
    a(paramView1, paramView2, paramBoolean1, e, arrayList);
    d(paramView1, paramView2, paramBoolean1, paramBoolean2, e, arrayList, arrayList1);
    a(paramView1, paramView2, paramBoolean1, paramBoolean2, e, f1, f2, arrayList, arrayList1);
    b(paramView1, paramView2, paramBoolean1, paramBoolean2, e, arrayList, arrayList1);
    a(paramView1, paramView2, paramBoolean1, paramBoolean2, e, arrayList, arrayList1);
    AnimatorSet animatorSet = new AnimatorSet();
    e.f.a.f.l.b.a(animatorSet, arrayList);
    animatorSet.addListener((Animator.AnimatorListener)new a(this, paramBoolean1, paramView2, paramView1));
    int i = 0;
    int j = arrayList1.size();
    while (i < j) {
      animatorSet.addListener(arrayList1.get(i));
      i++;
    } 
    return animatorSet;
  }
  
  class a extends AnimatorListenerAdapter {
    a(FabTransformationBehavior this$0, boolean param1Boolean, View param1View1, View param1View2) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      if (!this.a) {
        this.b.setVisibility(4);
        this.c.setAlpha(1.0F);
        this.c.setVisibility(0);
      } 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      if (this.a) {
        this.b.setVisibility(0);
        this.c.setAlpha(0.0F);
        this.c.setVisibility(4);
      } 
    }
  }
  
  class b implements ValueAnimator.AnimatorUpdateListener {
    b(FabTransformationBehavior this$0, View param1View) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.invalidate();
    }
  }
  
  class c extends AnimatorListenerAdapter {
    c(FabTransformationBehavior this$0, e.f.a.f.p.d param1d, Drawable param1Drawable) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      this.a.setCircularRevealOverlayDrawable(null);
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.a.setCircularRevealOverlayDrawable(this.b);
    }
  }
  
  class d extends AnimatorListenerAdapter {
    d(FabTransformationBehavior this$0, e.f.a.f.p.d param1d) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      e.f.a.f.p.d.e e = this.a.getRevealInfo();
      e.c = Float.MAX_VALUE;
      this.a.setRevealInfo(e);
    }
  }
  
  protected static class e {
    public h a;
    
    public j b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/transformation/FabTransformationBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */