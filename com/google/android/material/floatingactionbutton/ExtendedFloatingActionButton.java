package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import e.f.a.f.k;
import e.f.a.f.l.h;
import java.util.Iterator;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
  private final Rect t;
  
  private final d u;
  
  private final d v;
  
  private final d w;
  
  private final d x;
  
  private final CoordinatorLayout.c<ExtendedFloatingActionButton> y;
  
  private boolean z;
  
  static {
    new b(Float.class, "width");
    new c(Float.class, "height");
  }
  
  private void a(d paramd, d paramd1) {
    if (paramd.g())
      return; 
    if (!b()) {
      paramd.c();
      paramd.a(paramd1);
      return;
    } 
    measure(0, 0);
    AnimatorSet animatorSet = paramd.e();
    animatorSet.addListener((Animator.AnimatorListener)new a(this, paramd, paramd1));
    Iterator<Animator.AnimatorListener> iterator = paramd.f().iterator();
    while (iterator.hasNext())
      animatorSet.addListener(iterator.next()); 
    animatorSet.start();
  }
  
  private boolean b() {
    return (v.I((View)this) && !isInEditMode());
  }
  
  public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
    return this.y;
  }
  
  int getCollapsedSize() {
    return Math.min(v.u((View)this), v.t((View)this)) * 2 + getIconSize();
  }
  
  public h getExtendMotionSpec() {
    return this.v.d();
  }
  
  public h getHideMotionSpec() {
    return this.x.d();
  }
  
  public h getShowMotionSpec() {
    return this.w.d();
  }
  
  public h getShrinkMotionSpec() {
    return this.u.d();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    if (this.z && TextUtils.isEmpty(getText()) && getIcon() != null) {
      this.z = false;
      this.u.c();
    } 
  }
  
  public void setExtendMotionSpec(h paramh) {
    this.v.a(paramh);
  }
  
  public void setExtendMotionSpecResource(int paramInt) {
    setExtendMotionSpec(h.a(getContext(), paramInt));
  }
  
  public void setExtended(boolean paramBoolean) {
    d d1;
    if (this.z == paramBoolean)
      return; 
    if (paramBoolean) {
      d1 = this.v;
    } else {
      d1 = this.u;
    } 
    if (d1.g())
      return; 
    d1.c();
  }
  
  public void setHideMotionSpec(h paramh) {
    this.x.a(paramh);
  }
  
  public void setHideMotionSpecResource(int paramInt) {
    setHideMotionSpec(h.a(getContext(), paramInt));
  }
  
  public void setShowMotionSpec(h paramh) {
    this.w.a(paramh);
  }
  
  public void setShowMotionSpecResource(int paramInt) {
    setShowMotionSpec(h.a(getContext(), paramInt));
  }
  
  public void setShrinkMotionSpec(h paramh) {
    this.u.a(paramh);
  }
  
  public void setShrinkMotionSpecResource(int paramInt) {
    setShrinkMotionSpec(h.a(getContext(), paramInt));
  }
  
  protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
    private Rect a;
    
    private ExtendedFloatingActionButton.d b;
    
    private ExtendedFloatingActionButton.d c;
    
    private boolean d;
    
    private boolean e;
    
    public ExtendedFloatingActionButtonBehavior() {
      this.d = false;
      this.e = true;
    }
    
    public ExtendedFloatingActionButtonBehavior(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, k.ExtendedFloatingActionButton_Behavior_Layout);
      this.d = typedArray.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
      this.e = typedArray.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
      typedArray.recycle();
    }
    
    private void a(CoordinatorLayout param1CoordinatorLayout, ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      Rect rect = ExtendedFloatingActionButton.e(param1ExtendedFloatingActionButton);
      if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
        CoordinatorLayout.f f = (CoordinatorLayout.f)param1ExtendedFloatingActionButton.getLayoutParams();
        int i = param1ExtendedFloatingActionButton.getRight();
        int k = param1CoordinatorLayout.getWidth();
        int m = ((ViewGroup.MarginLayoutParams)f).rightMargin;
        int j = 0;
        if (i >= k - m) {
          i = rect.right;
        } else if (param1ExtendedFloatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams)f).leftMargin) {
          i = -rect.left;
        } else {
          i = 0;
        } 
        if (param1ExtendedFloatingActionButton.getBottom() >= param1CoordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams)f).bottomMargin) {
          j = rect.bottom;
        } else if (param1ExtendedFloatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams)f).topMargin) {
          j = -rect.top;
        } 
        if (j != 0)
          v.e((View)param1ExtendedFloatingActionButton, j); 
        if (i != 0)
          v.d((View)param1ExtendedFloatingActionButton, i); 
      } 
    }
    
    private static boolean a(View param1View) {
      ViewGroup.LayoutParams layoutParams = param1View.getLayoutParams();
      return (layoutParams instanceof CoordinatorLayout.f) ? (((CoordinatorLayout.f)layoutParams).d() instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) : false;
    }
    
    private boolean a(View param1View, ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1ExtendedFloatingActionButton.getLayoutParams();
      return (!this.d && !this.e) ? false : (!(f.c() != param1View.getId()));
    }
    
    private boolean a(CoordinatorLayout param1CoordinatorLayout, AppBarLayout param1AppBarLayout, ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      if (!a((View)param1AppBarLayout, param1ExtendedFloatingActionButton))
        return false; 
      if (this.a == null)
        this.a = new Rect(); 
      Rect rect = this.a;
      com.google.android.material.internal.b.a((ViewGroup)param1CoordinatorLayout, (View)param1AppBarLayout, rect);
      if (rect.bottom <= param1AppBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
        b(param1ExtendedFloatingActionButton);
      } else {
        a(param1ExtendedFloatingActionButton);
      } 
      return true;
    }
    
    private boolean b(View param1View, ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      if (!a(param1View, param1ExtendedFloatingActionButton))
        return false; 
      CoordinatorLayout.f f = (CoordinatorLayout.f)param1ExtendedFloatingActionButton.getLayoutParams();
      if (param1View.getTop() < param1ExtendedFloatingActionButton.getHeight() / 2 + ((ViewGroup.MarginLayoutParams)f).topMargin) {
        b(param1ExtendedFloatingActionButton);
      } else {
        a(param1ExtendedFloatingActionButton);
      } 
      return true;
    }
    
    public void a(CoordinatorLayout.f param1f) {
      if (param1f.h == 0)
        param1f.h = 80; 
    }
    
    protected void a(ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      ExtendedFloatingActionButton.d d1;
      d d2;
      if (this.e) {
        d1 = this.c;
      } else {
        d1 = this.b;
      } 
      if (this.e) {
        d2 = ExtendedFloatingActionButton.c(param1ExtendedFloatingActionButton);
      } else {
        d2 = ExtendedFloatingActionButton.d(param1ExtendedFloatingActionButton);
      } 
      ExtendedFloatingActionButton.a(param1ExtendedFloatingActionButton, d2, d1);
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, ExtendedFloatingActionButton param1ExtendedFloatingActionButton, int param1Int) {
      List<View> list = param1CoordinatorLayout.b((View)param1ExtendedFloatingActionButton);
      int j = list.size();
      int i;
      for (i = 0; i < j; i++) {
        View view = list.get(i);
        if ((view instanceof AppBarLayout) ? a(param1CoordinatorLayout, (AppBarLayout)view, param1ExtendedFloatingActionButton) : (a(view) && b(view, param1ExtendedFloatingActionButton)))
          break; 
      } 
      param1CoordinatorLayout.c((View)param1ExtendedFloatingActionButton, param1Int);
      a(param1CoordinatorLayout, param1ExtendedFloatingActionButton);
      return true;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, ExtendedFloatingActionButton param1ExtendedFloatingActionButton, Rect param1Rect) {
      Rect rect = ExtendedFloatingActionButton.e(param1ExtendedFloatingActionButton);
      param1Rect.set(param1ExtendedFloatingActionButton.getLeft() + rect.left, param1ExtendedFloatingActionButton.getTop() + rect.top, param1ExtendedFloatingActionButton.getRight() - rect.right, param1ExtendedFloatingActionButton.getBottom() - rect.bottom);
      return true;
    }
    
    public boolean a(CoordinatorLayout param1CoordinatorLayout, ExtendedFloatingActionButton param1ExtendedFloatingActionButton, View param1View) {
      if (param1View instanceof AppBarLayout) {
        a(param1CoordinatorLayout, (AppBarLayout)param1View, param1ExtendedFloatingActionButton);
      } else if (a(param1View)) {
        b(param1View, param1ExtendedFloatingActionButton);
      } 
      return false;
    }
    
    protected void b(ExtendedFloatingActionButton param1ExtendedFloatingActionButton) {
      ExtendedFloatingActionButton.d d1;
      d d2;
      if (this.e) {
        d1 = this.c;
      } else {
        d1 = this.b;
      } 
      if (this.e) {
        d2 = ExtendedFloatingActionButton.a(param1ExtendedFloatingActionButton);
      } else {
        d2 = ExtendedFloatingActionButton.b(param1ExtendedFloatingActionButton);
      } 
      ExtendedFloatingActionButton.a(param1ExtendedFloatingActionButton, d2, d1);
    }
  }
  
  class a extends AnimatorListenerAdapter {
    private boolean a;
    
    a(ExtendedFloatingActionButton this$0, d param1d, ExtendedFloatingActionButton.d param1d1) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
      this.b.b();
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      this.b.a();
      if (!this.a)
        this.b.a(this.c); 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.b.onAnimationStart(param1Animator);
      this.a = false;
    }
  }
  
  static final class b extends Property<View, Float> {
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Float a(View param1View) {
      return Float.valueOf((param1View.getLayoutParams()).width);
    }
    
    public void a(View param1View, Float param1Float) {
      (param1View.getLayoutParams()).width = param1Float.intValue();
      param1View.requestLayout();
    }
  }
  
  static final class c extends Property<View, Float> {
    c(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Float a(View param1View) {
      return Float.valueOf((param1View.getLayoutParams()).height);
    }
    
    public void a(View param1View, Float param1Float) {
      (param1View.getLayoutParams()).height = param1Float.intValue();
      param1View.requestLayout();
    }
  }
  
  public static abstract class d {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/floatingactionbutton/ExtendedFloatingActionButton.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */