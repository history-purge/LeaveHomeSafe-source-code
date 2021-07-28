package b.r;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import b.g.m.v;

class o0 {
  private static final u0 a;
  
  static final Property<View, Float> b = new a(Float.class, "translationAlpha");
  
  static {
    new b(Rect.class, "clipBounds");
  }
  
  static void a(View paramView) {
    a.a(paramView);
  }
  
  static void a(View paramView, float paramFloat) {
    a.a(paramView, paramFloat);
  }
  
  static void a(View paramView, int paramInt) {
    a.a(paramView, paramInt);
  }
  
  static void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  static void a(View paramView, Matrix paramMatrix) {
    a.a(paramView, paramMatrix);
  }
  
  static n0 b(View paramView) {
    return (n0)((Build.VERSION.SDK_INT >= 18) ? new m0(paramView) : l0.c(paramView));
  }
  
  static void b(View paramView, Matrix paramMatrix) {
    a.b(paramView, paramMatrix);
  }
  
  static float c(View paramView) {
    return a.b(paramView);
  }
  
  static void c(View paramView, Matrix paramMatrix) {
    a.c(paramView, paramMatrix);
  }
  
  static z0 d(View paramView) {
    return (z0)((Build.VERSION.SDK_INT >= 18) ? new y0(paramView) : new x0(paramView.getWindowToken()));
  }
  
  static void e(View paramView) {
    a.c(paramView);
  }
  
  static {
    u0 u01;
    int i = Build.VERSION.SDK_INT;
    if (i >= 29) {
      u01 = new t0();
    } else if (i >= 23) {
      u01 = new s0();
    } else if (i >= 22) {
      u01 = new r0();
    } else if (i >= 21) {
      u01 = new q0();
    } else if (i >= 19) {
      u01 = new p0();
    } else {
      u01 = new u0();
    } 
    a = u01;
  }
  
  static final class a extends Property<View, Float> {
    a(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Float a(View param1View) {
      return Float.valueOf(o0.c(param1View));
    }
    
    public void a(View param1View, Float param1Float) {
      o0.a(param1View, param1Float.floatValue());
    }
  }
  
  static final class b extends Property<View, Rect> {
    b(Class param1Class, String param1String) {
      super(param1Class, param1String);
    }
    
    public Rect a(View param1View) {
      return v.j(param1View);
    }
    
    public void a(View param1View, Rect param1Rect) {
      v.a(param1View, param1Rect);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */