package b.r;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import b.g.m.v;

public class w extends v0 {
  private static final TimeInterpolator O = (TimeInterpolator)new DecelerateInterpolator();
  
  private static final TimeInterpolator P = (TimeInterpolator)new AccelerateInterpolator();
  
  private static final g Q = new a();
  
  private static final g R = new b();
  
  private static final g S = new c();
  
  private static final g T = new d();
  
  private static final g U = new e();
  
  private static final g V = new f();
  
  private g N = V;
  
  public w(int paramInt) {
    b(paramInt);
  }
  
  private void d(d0 paramd0) {
    View view = paramd0.b;
    int[] arrayOfInt = new int[2];
    view.getLocationOnScreen(arrayOfInt);
    paramd0.a.put("android:slide:screenPosition", arrayOfInt);
  }
  
  public Animator a(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02) {
    if (paramd02 == null)
      return null; 
    int[] arrayOfInt = (int[])paramd02.a.get("android:slide:screenPosition");
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    float f3 = this.N.b(paramViewGroup, paramView);
    float f4 = this.N.a(paramViewGroup, paramView);
    return f0.a(paramView, paramd02, arrayOfInt[0], arrayOfInt[1], f3, f4, f1, f2, O, this);
  }
  
  public void a(d0 paramd0) {
    super.a(paramd0);
    d(paramd0);
  }
  
  public Animator b(ViewGroup paramViewGroup, View paramView, d0 paramd01, d0 paramd02) {
    if (paramd01 == null)
      return null; 
    int[] arrayOfInt = (int[])paramd01.a.get("android:slide:screenPosition");
    float f1 = paramView.getTranslationX();
    float f2 = paramView.getTranslationY();
    float f3 = this.N.b(paramViewGroup, paramView);
    float f4 = this.N.a(paramViewGroup, paramView);
    return f0.a(paramView, paramd01, arrayOfInt[0], arrayOfInt[1], f1, f2, f3, f4, P, this);
  }
  
  public void b(int paramInt) {
    g g1;
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 48) {
          if (paramInt != 80) {
            if (paramInt != 8388611) {
              if (paramInt == 8388613) {
                g1 = U;
              } else {
                throw new IllegalArgumentException("Invalid slide direction");
              } 
            } else {
              g1 = R;
            } 
          } else {
            g1 = V;
          } 
        } else {
          g1 = S;
        } 
      } else {
        g1 = T;
      } 
    } else {
      g1 = Q;
    } 
    this.N = g1;
    v v = new v();
    v.a(paramInt);
    a(v);
  }
  
  public void c(d0 paramd0) {
    super.c(paramd0);
    d(paramd0);
  }
  
  static final class a extends h {
    a() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationX() - param1ViewGroup.getWidth();
    }
  }
  
  static final class b extends h {
    b() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      int i = v.p((View)param1ViewGroup);
      boolean bool = true;
      if (i != 1)
        bool = false; 
      float f1 = param1View.getTranslationX();
      float f2 = param1ViewGroup.getWidth();
      return bool ? (f1 + f2) : (f1 - f2);
    }
  }
  
  static final class c extends i {
    c() {
      super(null);
    }
    
    public float a(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationY() - param1ViewGroup.getHeight();
    }
  }
  
  static final class d extends h {
    d() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationX() + param1ViewGroup.getWidth();
    }
  }
  
  static final class e extends h {
    e() {
      super(null);
    }
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      int i = v.p((View)param1ViewGroup);
      boolean bool = true;
      if (i != 1)
        bool = false; 
      float f1 = param1View.getTranslationX();
      float f2 = param1ViewGroup.getWidth();
      return bool ? (f1 - f2) : (f1 + f2);
    }
  }
  
  static final class f extends i {
    f() {
      super(null);
    }
    
    public float a(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationY() + param1ViewGroup.getHeight();
    }
  }
  
  private static interface g {
    float a(ViewGroup param1ViewGroup, View param1View);
    
    float b(ViewGroup param1ViewGroup, View param1View);
  }
  
  private static abstract class h implements g {
    private h() {}
    
    public float a(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationY();
    }
  }
  
  private static abstract class i implements g {
    private i() {}
    
    public float b(ViewGroup param1ViewGroup, View param1View) {
      return param1View.getTranslationX();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */