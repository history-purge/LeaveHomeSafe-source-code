package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.a.j;
import b.g.m.a0;
import b.g.m.v;
import b.g.m.z;

abstract class a extends ViewGroup {
  protected final a c = new a(this);
  
  protected final Context d;
  
  protected ActionMenuView e;
  
  protected c f;
  
  protected int g;
  
  protected z h;
  
  private boolean i;
  
  private boolean j;
  
  a(Context paramContext) {
    this(paramContext, null);
  }
  
  a(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    TypedValue typedValue = new TypedValue();
    if (paramContext.getTheme().resolveAttribute(b.a.a.actionBarPopupTheme, typedValue, true)) {
      paramInt = typedValue.resourceId;
      if (paramInt != 0) {
        this.d = (Context)new ContextThemeWrapper(paramContext, paramInt);
        return;
      } 
    } 
    this.d = paramContext;
  }
  
  protected static int a(int paramInt1, int paramInt2, boolean paramBoolean) {
    return paramBoolean ? (paramInt1 - paramInt2) : (paramInt1 + paramInt2);
  }
  
  protected int a(View paramView, int paramInt1, int paramInt2, int paramInt3) {
    paramView.measure(View.MeasureSpec.makeMeasureSpec(paramInt1, -2147483648), paramInt2);
    return Math.max(0, paramInt1 - paramView.getMeasuredWidth() - paramInt3);
  }
  
  protected int a(View paramView, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramView.getMeasuredWidth();
    int j = paramView.getMeasuredHeight();
    paramInt2 += (paramInt3 - j) / 2;
    if (paramBoolean) {
      paramView.layout(paramInt1 - i, paramInt2, paramInt1, j + paramInt2);
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt1 + i, j + paramInt2);
    } 
    paramInt1 = i;
    if (paramBoolean)
      paramInt1 = -i; 
    return paramInt1;
  }
  
  public z a(int paramInt, long paramLong) {
    z z1 = this.h;
    if (z1 != null)
      z1.a(); 
    if (paramInt == 0) {
      if (getVisibility() != 0)
        setAlpha(0.0F); 
      z1 = v.a((View)this);
      z1.a(1.0F);
      z1.a(paramLong);
      a a2 = this.c;
      a2.a(z1, paramInt);
      z1.a(a2);
      return z1;
    } 
    z1 = v.a((View)this);
    z1.a(0.0F);
    z1.a(paramLong);
    a a1 = this.c;
    a1.a(z1, paramInt);
    z1.a(a1);
    return z1;
  }
  
  public int getAnimatedVisibility() {
    return (this.h != null) ? this.c.b : getVisibility();
  }
  
  public int getContentHeight() {
    return this.g;
  }
  
  protected void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    TypedArray typedArray = getContext().obtainStyledAttributes(null, j.ActionBar, b.a.a.actionBarStyle, 0);
    setContentHeight(typedArray.getLayoutDimension(j.ActionBar_height, 0));
    typedArray.recycle();
    c c1 = this.f;
    if (c1 != null)
      c1.a(paramConfiguration); 
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9)
      this.j = false; 
    if (!this.j) {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if (i == 9 && !bool)
        this.j = true; 
    } 
    if (i == 10 || i == 3)
      this.j = false; 
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0)
      this.i = false; 
    if (!this.i) {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if (i == 0 && !bool)
        this.i = true; 
    } 
    if (i == 1 || i == 3)
      this.i = false; 
    return true;
  }
  
  public abstract void setContentHeight(int paramInt);
  
  public void setVisibility(int paramInt) {
    if (paramInt != getVisibility()) {
      z z1 = this.h;
      if (z1 != null)
        z1.a(); 
      super.setVisibility(paramInt);
    } 
  }
  
  protected class a implements a0 {
    private boolean a = false;
    
    int b;
    
    protected a(a this$0) {}
    
    public a a(z param1z, int param1Int) {
      this.c.h = param1z;
      this.b = param1Int;
      return this;
    }
    
    public void a(View param1View) {
      this.a = true;
    }
    
    public void b(View param1View) {
      if (this.a)
        return; 
      a a1 = this.c;
      a1.h = null;
      a.b(a1, this.b);
    }
    
    public void c(View param1View) {
      a.a(this.c, 0);
      this.a = false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/appcompat/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */