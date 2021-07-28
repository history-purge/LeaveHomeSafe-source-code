package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.g.m.v;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
  b.i.b.c a;
  
  b b;
  
  private boolean c;
  
  private float d = 0.0F;
  
  private boolean e;
  
  int f = 2;
  
  float g = 0.5F;
  
  float h = 0.0F;
  
  float i = 0.5F;
  
  private final b.i.b.c.c j = new a(this);
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return Math.min(Math.max(paramFloat1, paramFloat2), paramFloat3);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3) {
    return Math.min(Math.max(paramInt1, paramInt2), paramInt3);
  }
  
  private void a(ViewGroup paramViewGroup) {
    if (this.a == null) {
      b.i.b.c c1;
      if (this.e) {
        c1 = b.i.b.c.a(paramViewGroup, this.d, this.j);
      } else {
        c1 = b.i.b.c.a((ViewGroup)c1, this.j);
      } 
      this.a = c1;
    } 
  }
  
  static float b(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat3 - paramFloat1) / (paramFloat2 - paramFloat1);
  }
  
  public void a(float paramFloat) {
    this.i = a(0.0F, paramFloat, 1.0F);
  }
  
  public void a(int paramInt) {
    this.f = paramInt;
  }
  
  public boolean a(View paramView) {
    return true;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    boolean bool = this.c;
    int i = paramMotionEvent.getActionMasked();
    if (i != 0) {
      if (i == 1 || i == 3)
        this.c = false; 
    } else {
      this.c = paramCoordinatorLayout.a((View)paramV, (int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
      bool = this.c;
    } 
    if (bool) {
      a((ViewGroup)paramCoordinatorLayout);
      return this.a.b(paramMotionEvent);
    } 
    return false;
  }
  
  public void b(float paramFloat) {
    this.h = a(0.0F, paramFloat, 1.0F);
  }
  
  public boolean b(CoordinatorLayout paramCoordinatorLayout, V paramV, MotionEvent paramMotionEvent) {
    b.i.b.c c1 = this.a;
    if (c1 != null) {
      c1.a(paramMotionEvent);
      return true;
    } 
    return false;
  }
  
  class a extends b.i.b.c.c {
    private int a;
    
    private int b = -1;
    
    a(SwipeDismissBehavior this$0) {}
    
    private boolean a(View param1View, float param1Float) {
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool1 = false;
      if (param1Float != 0.0F) {
        boolean bool;
        if (v.p(param1View) == 1) {
          bool = true;
        } else {
          bool = false;
        } 
        int m = this.c.f;
        if (m == 2)
          return true; 
        if (m == 0) {
          if (bool ? (param1Float < 0.0F) : (param1Float > 0.0F))
            bool1 = true; 
          return bool1;
        } 
        bool1 = bool2;
        if (m == 1)
          if (bool) {
            bool1 = bool2;
            if (param1Float > 0.0F)
              return true; 
          } else {
            bool1 = bool2;
            if (param1Float < 0.0F)
              return true; 
          }  
        return bool1;
      } 
      int i = param1View.getLeft();
      int j = this.a;
      int k = Math.round(param1View.getWidth() * this.c.g);
      bool1 = bool3;
      if (Math.abs(i - j) >= k)
        bool1 = true; 
      return bool1;
    }
    
    public int a(View param1View) {
      return param1View.getWidth();
    }
    
    public int a(View param1View, int param1Int1, int param1Int2) {
      if (v.p(param1View) == 1) {
        param1Int2 = 1;
      } else {
        param1Int2 = 0;
      } 
      int i = this.c.f;
      if (i == 0) {
        if (param1Int2 != 0) {
          i = this.a - param1View.getWidth();
          param1Int2 = this.a;
        } 
      } else {
        if (i == 1) {
          if (param1Int2 != 0) {
            i = this.a;
            param1Int2 = param1View.getWidth() + i;
            return SwipeDismissBehavior.a(i, param1Int1, param1Int2);
          } 
        } else {
          i = this.a - param1View.getWidth();
          param1Int2 = this.a;
          param1Int2 = param1View.getWidth() + param1Int2;
          return SwipeDismissBehavior.a(i, param1Int1, param1Int2);
        } 
        i = this.a - param1View.getWidth();
        param1Int2 = this.a;
      } 
      i = this.a;
      param1Int2 = param1View.getWidth() + i;
      return SwipeDismissBehavior.a(i, param1Int1, param1Int2);
    }
    
    public void a(View param1View, float param1Float1, float param1Float2) {
      boolean bool;
      this.b = -1;
      int i = param1View.getWidth();
      if (a(param1View, param1Float1)) {
        int j = param1View.getLeft();
        int k = this.a;
        if (j < k) {
          i = k - i;
        } else {
          i = k + i;
        } 
        bool = true;
      } else {
        i = this.a;
        bool = false;
      } 
      if (this.c.a.d(i, param1View.getTop())) {
        v.a(param1View, new SwipeDismissBehavior.c(this.c, param1View, bool));
        return;
      } 
      if (bool) {
        SwipeDismissBehavior.b b = this.c.b;
        if (b != null)
          b.a(param1View); 
      } 
    }
    
    public void a(View param1View, int param1Int) {
      this.b = param1Int;
      this.a = param1View.getLeft();
      ViewParent viewParent = param1View.getParent();
      if (viewParent != null)
        viewParent.requestDisallowInterceptTouchEvent(true); 
    }
    
    public void a(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      float f1 = this.a + param1View.getWidth() * this.c.h;
      float f2 = this.a + param1View.getWidth() * this.c.i;
      float f3 = param1Int1;
      if (f3 <= f1) {
        param1View.setAlpha(1.0F);
        return;
      } 
      if (f3 >= f2) {
        param1View.setAlpha(0.0F);
        return;
      } 
      param1View.setAlpha(SwipeDismissBehavior.a(0.0F, 1.0F - SwipeDismissBehavior.b(f1, f2, f3), 1.0F));
    }
    
    public int b(View param1View, int param1Int1, int param1Int2) {
      return param1View.getTop();
    }
    
    public boolean b(View param1View, int param1Int) {
      int i = this.b;
      return ((i == -1 || i == param1Int) && this.c.a(param1View));
    }
    
    public void c(int param1Int) {
      SwipeDismissBehavior.b b = this.c.b;
      if (b != null)
        b.a(param1Int); 
    }
  }
  
  public static interface b {
    void a(int param1Int);
    
    void a(View param1View);
  }
  
  private class c implements Runnable {
    private final View c;
    
    private final boolean d;
    
    c(SwipeDismissBehavior this$0, View param1View, boolean param1Boolean) {
      this.c = param1View;
      this.d = param1Boolean;
    }
    
    public void run() {
      b.i.b.c c1 = this.e.a;
      if (c1 != null && c1.a(true)) {
        v.a(this.c, this);
        return;
      } 
      if (this.d) {
        SwipeDismissBehavior.b b = this.e.b;
        if (b != null)
          b.a(this.c); 
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/behavior/SwipeDismissBehavior.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */