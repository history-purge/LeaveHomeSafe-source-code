package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.n;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import androidx.core.util.f;
import androidx.core.widget.l;
import b.d.g;
import b.g.m.u;
import b.g.m.v;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.i;
import e.f.a.f.a0.k;
import e.f.a.f.a0.n;
import e.f.a.f.k;
import e.f.a.f.l.h;
import e.f.a.f.l.k;
import e.f.a.f.u.a;
import java.util.List;

@d(FloatingActionButton.Behavior.class)
public class FloatingActionButton extends i implements u, l, a, n {
  private ColorStateList d;
  
  private PorterDuff.Mode e;
  
  private ColorStateList f;
  
  private PorterDuff.Mode g;
  
  private ColorStateList h;
  
  private int i;
  
  private int j;
  
  private int k;
  
  private int l;
  
  boolean m;
  
  final Rect n;
  
  private final Rect o;
  
  private final n p;
  
  private final e.f.a.f.u.c q;
  
  private b r;
  
  private int a(int paramInt) {
    int j = this.j;
    if (j != 0)
      return j; 
    Resources resources = getResources();
    if (paramInt != -1) {
      if (paramInt != 1) {
        paramInt = e.f.a.f.d.design_fab_size_normal;
        return resources.getDimensionPixelSize(paramInt);
      } 
      paramInt = e.f.a.f.d.design_fab_size_mini;
      return resources.getDimensionPixelSize(paramInt);
    } 
    return (Math.max((resources.getConfiguration()).screenWidthDp, (resources.getConfiguration()).screenHeightDp) < 470) ? a(1) : a(0);
  }
  
  private static int a(int paramInt1, int paramInt2) {
    int j = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    if (j != Integer.MIN_VALUE) {
      if (j != 0) {
        if (j == 1073741824)
          return paramInt2; 
        throw new IllegalArgumentException();
      } 
    } else {
      paramInt1 = Math.min(paramInt1, paramInt2);
    } 
    return paramInt1;
  }
  
  private b.j c(b paramb) {
    return (paramb == null) ? null : new a(this, paramb);
  }
  
  private void c(Rect paramRect) {
    int j = paramRect.left;
    Rect rect = this.n;
    paramRect.left = j + rect.left;
    paramRect.top += rect.top;
    paramRect.right -= rect.right;
    paramRect.bottom -= rect.bottom;
  }
  
  private b d() {
    return (Build.VERSION.SDK_INT >= 21) ? new c(this, new c(this)) : new b(this, new c(this));
  }
  
  private void e() {
    Drawable drawable = getDrawable();
    if (drawable == null)
      return; 
    ColorStateList colorStateList = this.f;
    if (colorStateList == null) {
      androidx.core.graphics.drawable.a.b(drawable);
      return;
    } 
    int j = colorStateList.getColorForState(getDrawableState(), 0);
    PorterDuff.Mode mode2 = this.g;
    PorterDuff.Mode mode1 = mode2;
    if (mode2 == null)
      mode1 = PorterDuff.Mode.SRC_IN; 
    drawable.mutate().setColorFilter((ColorFilter)j.a(j, mode1));
  }
  
  private b getImpl() {
    if (this.r == null)
      this.r = d(); 
    return this.r;
  }
  
  public void a(Animator.AnimatorListener paramAnimatorListener) {
    getImpl().a(paramAnimatorListener);
  }
  
  public void a(b paramb) {
    a(paramb, true);
  }
  
  void a(b paramb, boolean paramBoolean) {
    getImpl().a(c(paramb), paramBoolean);
  }
  
  public void a(k<? extends FloatingActionButton> paramk) {
    getImpl().a(new d<FloatingActionButton>(this, paramk));
  }
  
  public boolean a() {
    this.q.b();
    throw null;
  }
  
  @Deprecated
  public boolean a(Rect paramRect) {
    if (v.I((View)this)) {
      paramRect.set(0, 0, getWidth(), getHeight());
      c(paramRect);
      return true;
    } 
    return false;
  }
  
  public void b(Animator.AnimatorListener paramAnimatorListener) {
    getImpl().b(paramAnimatorListener);
  }
  
  public void b(Rect paramRect) {
    paramRect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
    c(paramRect);
  }
  
  public void b(b paramb) {
    b(paramb, true);
  }
  
  void b(b paramb, boolean paramBoolean) {
    getImpl().b(c(paramb), paramBoolean);
  }
  
  public boolean b() {
    return getImpl().i();
  }
  
  public boolean c() {
    return getImpl().j();
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    getImpl().a(getDrawableState());
  }
  
  public ColorStateList getBackgroundTintList() {
    return this.d;
  }
  
  public PorterDuff.Mode getBackgroundTintMode() {
    return this.e;
  }
  
  public float getCompatElevation() {
    return getImpl().b();
  }
  
  public float getCompatHoveredFocusedTranslationZ() {
    return getImpl().e();
  }
  
  public float getCompatPressedTranslationZ() {
    return getImpl().f();
  }
  
  public Drawable getContentBackground() {
    return getImpl().a();
  }
  
  public int getCustomSize() {
    return this.j;
  }
  
  public int getExpandedComponentIdHint() {
    this.q.a();
    throw null;
  }
  
  public h getHideMotionSpec() {
    return getImpl().d();
  }
  
  @Deprecated
  public int getRippleColor() {
    ColorStateList colorStateList = this.h;
    return (colorStateList != null) ? colorStateList.getDefaultColor() : 0;
  }
  
  public ColorStateList getRippleColorStateList() {
    return this.h;
  }
  
  public k getShapeAppearanceModel() {
    k k = getImpl().g();
    f.a(k);
    return k;
  }
  
  public h getShowMotionSpec() {
    return getImpl().h();
  }
  
  public int getSize() {
    return this.i;
  }
  
  int getSizeDimension() {
    return a(this.i);
  }
  
  public ColorStateList getSupportBackgroundTintList() {
    return getBackgroundTintList();
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode() {
    return getBackgroundTintMode();
  }
  
  public ColorStateList getSupportImageTintList() {
    return this.f;
  }
  
  public PorterDuff.Mode getSupportImageTintMode() {
    return this.g;
  }
  
  public boolean getUseCompatPadding() {
    return this.m;
  }
  
  public void jumpDrawablesToCurrentState() {
    super.jumpDrawablesToCurrentState();
    getImpl().k();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    getImpl().l();
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    getImpl().n();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    int j = getSizeDimension();
    this.k = (j - this.l) / 2;
    getImpl().w();
    paramInt1 = Math.min(a(j, paramInt1), a(j, paramInt2));
    Rect rect = this.n;
    setMeasuredDimension(rect.left + paramInt1 + rect.right, paramInt1 + rect.top + rect.bottom);
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof e.f.a.f.b0.a)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    e.f.a.f.b0.a a1 = (e.f.a.f.b0.a)paramParcelable;
    super.onRestoreInstanceState(a1.e());
    e.f.a.f.u.c c1 = this.q;
    Object object = a1.e.get("expandableWidgetHelper");
    f.a(object);
    c1.a((Bundle)object);
    throw null;
  }
  
  protected Parcelable onSaveInstanceState() {
    Bundle bundle;
    Parcelable parcelable2 = super.onSaveInstanceState();
    Parcelable parcelable1 = parcelable2;
    if (parcelable2 == null)
      bundle = new Bundle(); 
    g g = (new e.f.a.f.b0.a((Parcelable)bundle)).e;
    this.q.c();
    throw null;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    return (paramMotionEvent.getAction() == 0 && a(this.o) && !this.o.contains((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY())) ? false : super.onTouchEvent(paramMotionEvent);
  }
  
  public void setBackgroundColor(int paramInt) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundResource(int paramInt) {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList) {
    if (this.d != paramColorStateList) {
      this.d = paramColorStateList;
      getImpl().a(paramColorStateList);
    } 
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode) {
    if (this.e != paramMode) {
      this.e = paramMode;
      getImpl().a(paramMode);
    } 
  }
  
  public void setCompatElevation(float paramFloat) {
    getImpl().a(paramFloat);
  }
  
  public void setCompatElevationResource(int paramInt) {
    setCompatElevation(getResources().getDimension(paramInt));
  }
  
  public void setCompatHoveredFocusedTranslationZ(float paramFloat) {
    getImpl().b(paramFloat);
  }
  
  public void setCompatHoveredFocusedTranslationZResource(int paramInt) {
    setCompatHoveredFocusedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCompatPressedTranslationZ(float paramFloat) {
    getImpl().d(paramFloat);
  }
  
  public void setCompatPressedTranslationZResource(int paramInt) {
    setCompatPressedTranslationZ(getResources().getDimension(paramInt));
  }
  
  public void setCustomSize(int paramInt) {
    if (paramInt >= 0) {
      if (paramInt != this.j) {
        this.j = paramInt;
        requestLayout();
      } 
      return;
    } 
    throw new IllegalArgumentException("Custom size must be non-negative");
  }
  
  public void setElevation(float paramFloat) {
    super.setElevation(paramFloat);
    getImpl().e(paramFloat);
  }
  
  public void setEnsureMinTouchTargetSize(boolean paramBoolean) {
    if (paramBoolean != getImpl().c()) {
      getImpl().a(paramBoolean);
      requestLayout();
    } 
  }
  
  public void setExpandedComponentIdHint(int paramInt) {
    this.q.a(paramInt);
    throw null;
  }
  
  public void setHideMotionSpec(h paramh) {
    getImpl().a(paramh);
  }
  
  public void setHideMotionSpecResource(int paramInt) {
    setHideMotionSpec(h.a(getContext(), paramInt));
  }
  
  public void setImageDrawable(Drawable paramDrawable) {
    if (getDrawable() != paramDrawable) {
      super.setImageDrawable(paramDrawable);
      getImpl().v();
      if (this.f != null)
        e(); 
    } 
  }
  
  public void setImageResource(int paramInt) {
    this.p.a(paramInt);
    e();
  }
  
  public void setRippleColor(int paramInt) {
    setRippleColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setRippleColor(ColorStateList paramColorStateList) {
    if (this.h != paramColorStateList) {
      this.h = paramColorStateList;
      getImpl().b(this.h);
    } 
  }
  
  public void setScaleX(float paramFloat) {
    super.setScaleX(paramFloat);
    getImpl().p();
  }
  
  public void setScaleY(float paramFloat) {
    super.setScaleY(paramFloat);
    getImpl().p();
  }
  
  public void setShadowPaddingEnabled(boolean paramBoolean) {
    getImpl().b(paramBoolean);
  }
  
  public void setShapeAppearanceModel(k paramk) {
    getImpl().a(paramk);
  }
  
  public void setShowMotionSpec(h paramh) {
    getImpl().b(paramh);
  }
  
  public void setShowMotionSpecResource(int paramInt) {
    setShowMotionSpec(h.a(getContext(), paramInt));
  }
  
  public void setSize(int paramInt) {
    this.j = 0;
    if (paramInt != this.i) {
      this.i = paramInt;
      requestLayout();
    } 
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList) {
    setBackgroundTintList(paramColorStateList);
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode) {
    setBackgroundTintMode(paramMode);
  }
  
  public void setSupportImageTintList(ColorStateList paramColorStateList) {
    if (this.f != paramColorStateList) {
      this.f = paramColorStateList;
      e();
    } 
  }
  
  public void setSupportImageTintMode(PorterDuff.Mode paramMode) {
    if (this.g != paramMode) {
      this.g = paramMode;
      e();
    } 
  }
  
  public void setTranslationX(float paramFloat) {
    super.setTranslationX(paramFloat);
    getImpl().q();
  }
  
  public void setTranslationY(float paramFloat) {
    super.setTranslationY(paramFloat);
    getImpl().q();
  }
  
  public void setTranslationZ(float paramFloat) {
    super.setTranslationZ(paramFloat);
    getImpl().q();
  }
  
  public void setUseCompatPadding(boolean paramBoolean) {
    if (this.m != paramBoolean) {
      this.m = paramBoolean;
      getImpl().m();
    } 
  }
  
  public void setVisibility(int paramInt) {
    super.setVisibility(paramInt);
  }
  
  protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {
    private Rect a;
    
    private FloatingActionButton.b b;
    
    private boolean c;
    
    public BaseBehavior() {
      this.c = true;
    }
    
    public BaseBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.FloatingActionButton_Behavior_Layout);
      this.c = typedArray.getBoolean(k.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
      typedArray.recycle();
    }
    
    private void a(CoordinatorLayout param1CoordinatorLayout, FloatingActionButton param1FloatingActionButton) {
      Rect rect = param1FloatingActionButton.n;
      if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
        CoordinatorLayout.f f = (CoordinatorLayout.f)param1FloatingActionButton.getLayoutParams();
        int i = param1FloatingActionButton.getRight();
        int k = param1CoordinatorLayout.getWidth();
        int m = ((ViewGroup.MarginLayoutParams)f).rightMargin;
        int j = 0;
        if (i >= k - m) {
          i = rect.right;
        } else if (param1FloatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams)f).leftMargin) {
          i = -rect.left;
        } else {
          i = 0;
        } 
        if (param1FloatingActionButton.getBottom() >= param1CoordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams)f).bottomMargin) {
          j = rect.bottom;
        } else if (param1FloatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams)f).topMargin) {
          j = -rect.top;
        } 
        if (j != 0)
          v.e((View)param1FloatingActionButton, j); 
        if (i != 0)
          v.d((View)param1FloatingActionButton, i); 
      } 
    }
    
    private static boolean a(View param1View) {
      ViewGroup.LayoutParams layoutParams = param1View.getLayoutParams();
      return (layoutParams instanceof CoordinatorLayout.f) ? (((CoordinatorLayout.f)layoutParams).d() instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) : false;
    }
    
    private boolean a(View param1View, FloatingActionButton param1FloatingActionButton) {
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1FloatingActionButton.getLayoutParams();
      return !this.c ? false : ((f.c() != param1View.getId()) ? false : (!(param1FloatingActionButton.getUserSetVisibility() != 0)));
    }
    
    private boolean a(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, FloatingActionButton param1FloatingActionButton) {
      if (!a((View)param1AppBarLayout, param1FloatingActionButton))
        return false; 
      if (this.a == null)
        this.a = new Rect(); 
      Rect rect = this.a;
      com.google.android.material.internal.b.a((ViewGroup)param1CoordinatorLayout, (View)param1AppBarLayout, rect);
      if (rect.bottom <= param1AppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        param1FloatingActionButton.a(this.b, false);
      } else {
        param1FloatingActionButton.b(this.b, false);
      } 
      return true;
    }
    
    private boolean b(View param1View, FloatingActionButton param1FloatingActionButton) {
      if (!a(param1View, param1FloatingActionButton))
        return false; 
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1FloatingActionButton.getLayoutParams();
      if (param1View.getTop() < param1FloatingActionButton.getHeight() / 2 + ((ViewGroup.MarginLayoutParams)f).topMargin) {
        param1FloatingActionButton.a(this.b, false);
      } else {
        param1FloatingActionButton.b(this.b, false);
      } 
      return true;
    }
    
    public void a(CoordinatorLayout.f param1f) {
      if (param1f.h == 0)
        param1f.h = 80; 
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, FloatingActionButton param1FloatingActionButton, int param1Int) {
      List<View> list = param1CoordinatorLayout.b((View)param1FloatingActionButton);
      int j = list.size();
      int i;
      for (i = 0; i < j; i++) {
        View view = list.get(i);
        if ((view instanceof AppBarLayout) ? a(param1CoordinatorLayout, (AppBarLayout)view, param1FloatingActionButton) : (a(view) && b(view, param1FloatingActionButton)))
          break; 
      } 
      param1CoordinatorLayout.c((View)param1FloatingActionButton, param1Int);
      a(param1CoordinatorLayout, param1FloatingActionButton);
      return true;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, FloatingActionButton param1FloatingActionButton, Rect param1Rect) {
      Rect rect = param1FloatingActionButton.n;
      param1Rect.set(param1FloatingActionButton.getLeft() + rect.left, param1FloatingActionButton.getTop() + rect.top, param1FloatingActionButton.getRight() - rect.right, param1FloatingActionButton.getBottom() - rect.bottom);
      return true;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, FloatingActionButton param1FloatingActionButton, View param1View) {
      if (param1View instanceof AppBarLayout) {
        a(param1CoordinatorLayout, (AppBarLayout)param1View, param1FloatingActionButton);
      } else if (a(param1View)) {
        b(param1View, param1FloatingActionButton);
      } 
      return false;
    }
  }
  
  public static class Behavior extends BaseBehavior<FloatingActionButton> {
    public Behavior() {}
    
    public Behavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
    }
  }
  
  class a implements b.j {
    a(FloatingActionButton this$0, FloatingActionButton.b param1b) {}
    
    public void a() {
      this.a.b(this.b);
    }
    
    public void b() {
      this.a.a(this.b);
    }
  }
  
  public static abstract class b {
    public void a(FloatingActionButton param1FloatingActionButton) {}
    
    public void b(FloatingActionButton param1FloatingActionButton) {}
  }
  
  private class c implements e.f.a.f.z.b {
    c(FloatingActionButton this$0) {}
    
    public void a(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      this.a.n.set(param1Int1, param1Int2, param1Int3, param1Int4);
      FloatingActionButton floatingActionButton = this.a;
      floatingActionButton.setPadding(param1Int1 + FloatingActionButton.a(floatingActionButton), param1Int2 + FloatingActionButton.a(this.a), param1Int3 + FloatingActionButton.a(this.a), param1Int4 + FloatingActionButton.a(this.a));
    }
    
    public void a(Drawable param1Drawable) {
      if (param1Drawable != null)
        FloatingActionButton.a(this.a, param1Drawable); 
    }
    
    public boolean a() {
      return this.a.m;
    }
  }
  
  class d<T extends FloatingActionButton> implements b.i {
    private final k<T> a;
    
    d(FloatingActionButton this$0, k<T> param1k) {
      this.a = param1k;
    }
    
    public void a() {
      this.a.a((View)this.b);
    }
    
    public void b() {
      this.a.b((View)this.b);
    }
    
    public boolean equals(Object param1Object) {
      return (param1Object instanceof d && ((d)param1Object).a.equals(this.a));
    }
    
    public int hashCode() {
      return this.a.hashCode();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/floatingactionbutton/FloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */