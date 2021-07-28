package com.swmansion.gesturehandler.react;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.q;

public class RNGestureHandlerButtonViewManager extends ViewGroupManager<RNGestureHandlerButtonViewManager.a> {
  public a createViewInstance(k0 paramk0) {
    return new a((Context)paramk0);
  }
  
  public String getName() {
    return "RNGestureHandlerButton";
  }
  
  protected void onAfterUpdateTransaction(a parama) {
    a.a(parama);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "borderRadius")
  public void setBorderRadius(a parama, float paramFloat) {
    parama.a(paramFloat);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "borderless")
  public void setBorderless(a parama, boolean paramBoolean) {
    parama.a(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "enabled")
  public void setEnabled(a parama, boolean paramBoolean) {
    parama.setEnabled(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "foreground")
  @TargetApi(23)
  public void setForeground(a parama, boolean paramBoolean) {
    parama.b(paramBoolean);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "rippleColor")
  public void setRippleColor(a parama, Integer paramInteger) {
    parama.a(paramInteger);
  }
  
  @com.facebook.react.uimanager.e1.a(name = "rippleRadius")
  public void setRippleRadius(a parama, Integer paramInteger) {
    parama.b(paramInteger);
  }
  
  static class a extends ViewGroup {
    static TypedValue j = new TypedValue();
    
    static a k;
    
    int c = 0;
    
    Integer d;
    
    Integer e;
    
    boolean f = false;
    
    boolean g = false;
    
    float h = 0.0F;
    
    boolean i = false;
    
    public a(Context param1Context) {
      super(param1Context);
      setClickable(true);
      setFocusable(true);
      this.i = true;
    }
    
    @TargetApi(21)
    private static int a(Context param1Context, String param1String) {
      SoftAssertions.assertNotNull(param1String);
      return "selectableItemBackground".equals(param1String) ? 16843534 : ("selectableItemBackgroundBorderless".equals(param1String) ? 16843868 : param1Context.getResources().getIdentifier(param1String, "attr", "android"));
    }
    
    private Drawable a() {
      String str;
      int i = Build.VERSION.SDK_INT;
      if (this.g && i >= 21) {
        str = "selectableItemBackgroundBorderless";
      } else {
        str = "selectableItemBackground";
      } 
      int j = a(getContext(), str);
      getContext().getTheme().resolveAttribute(j, j, true);
      return (i >= 21) ? getResources().getDrawable(j.resourceId, getContext().getTheme()) : getResources().getDrawable(j.resourceId);
    }
    
    private Drawable a(Drawable param1Drawable) {
      Integer integer = this.d;
      if (integer != null && Build.VERSION.SDK_INT >= 21 && param1Drawable instanceof RippleDrawable) {
        int i = integer.intValue();
        ColorStateList colorStateList = new ColorStateList(new int[][] { { 16842910 },  }, new int[] { i });
        ((RippleDrawable)param1Drawable).setColor(colorStateList);
      } 
      if (Build.VERSION.SDK_INT >= 23) {
        integer = this.e;
        if (integer != null && param1Drawable instanceof RippleDrawable)
          ((RippleDrawable)param1Drawable).setRadius((int)q.b(integer.intValue())); 
      } 
      return param1Drawable;
    }
    
    private void b() {
      if (!this.i)
        return; 
      this.i = false;
      if (this.c == 0)
        setBackground(null); 
      if (Build.VERSION.SDK_INT >= 23)
        setForeground(null); 
      if (this.f && Build.VERSION.SDK_INT >= 23) {
        Drawable drawable = a();
        a(drawable);
        setForeground(drawable);
        int i = this.c;
        if (i != 0) {
          setBackgroundColor(i);
          return;
        } 
      } else {
        if (this.c == 0 && this.d == null) {
          setBackground(a());
          return;
        } 
        PaintDrawable paintDrawable = new PaintDrawable(this.c);
        Drawable drawable = a();
        float f = this.h;
        if (f != 0.0F) {
          paintDrawable.setCornerRadius(f);
          if (Build.VERSION.SDK_INT >= 21 && drawable instanceof RippleDrawable) {
            PaintDrawable paintDrawable1 = new PaintDrawable(-1);
            paintDrawable1.setCornerRadius(this.h);
            ((RippleDrawable)drawable).setDrawableByLayerId(16908334, (Drawable)paintDrawable1);
          } 
        } 
        a(drawable);
        setBackground((Drawable)new LayerDrawable(new Drawable[] { (Drawable)paintDrawable, drawable }));
      } 
    }
    
    public void a(float param1Float) {
      this.h = param1Float * (getResources().getDisplayMetrics()).density;
      this.i = true;
    }
    
    public void a(Integer param1Integer) {
      this.d = param1Integer;
      this.i = true;
    }
    
    public void a(boolean param1Boolean) {
      this.g = param1Boolean;
    }
    
    public void b(Integer param1Integer) {
      this.e = param1Integer;
      this.i = true;
    }
    
    public void b(boolean param1Boolean) {
      this.f = param1Boolean;
      this.i = true;
    }
    
    public void dispatchDrawableHotspotChanged(float param1Float1, float param1Float2) {}
    
    public void drawableHotspotChanged(float param1Float1, float param1Float2) {
      a a1 = k;
      if (a1 == null || a1 == this)
        super.drawableHotspotChanged(param1Float1, param1Float2); 
    }
    
    public boolean onInterceptTouchEvent(MotionEvent param1MotionEvent) {
      if (super.onInterceptTouchEvent(param1MotionEvent))
        return true; 
      onTouchEvent(param1MotionEvent);
      return isPressed();
    }
    
    protected void onLayout(boolean param1Boolean, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {}
    
    public void setBackgroundColor(int param1Int) {
      this.c = param1Int;
      this.i = true;
    }
    
    public void setPressed(boolean param1Boolean) {
      if (param1Boolean && k == null)
        k = this; 
      if (!param1Boolean || k == this)
        super.setPressed(param1Boolean); 
      if (!param1Boolean && k == this)
        k = null; 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */