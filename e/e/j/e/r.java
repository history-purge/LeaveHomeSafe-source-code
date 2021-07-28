package e.e.j.e;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class r {
  public static q a(Drawable paramDrawable) {
    if (paramDrawable == null)
      return null; 
    if (paramDrawable instanceof q)
      return (q)paramDrawable; 
    if (paramDrawable instanceof d)
      return a(((d)paramDrawable).a()); 
    if (paramDrawable instanceof a) {
      paramDrawable = paramDrawable;
      int j = paramDrawable.a();
      for (int i = 0; i < j; i++) {
        q q = a(paramDrawable.a(i));
        if (q != null)
          return q; 
      } 
    } 
    return null;
  }
  
  public static abstract class a implements b {
    public Matrix a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2) {
      a(param1Matrix, param1Rect, param1Int1, param1Int2, param1Float1, param1Float2, param1Rect.width() / param1Int1, param1Rect.height() / param1Int2);
      return param1Matrix;
    }
    
    public abstract void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4);
  }
  
  public static interface b {
    public static final b a = r.j.g;
    
    public static final b b = r.g.g;
    
    public static final b c = r.c.g;
    
    public static final b d = r.e.g;
    
    public static final b e = r.d.g;
    
    public static final b f = r.k.g;
    
    static {
      b1 = r.f.g;
    }
    
    Matrix a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2);
    
    static {
      b b1 = r.i.g;
    }
    
    static {
      b1 = r.h.g;
    }
  }
  
  private static class c extends a {
    public static final r.b g = new c();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      param1Float1 = param1Rect.left;
      param1Float2 = (param1Rect.width() - param1Int1);
      param1Float3 = param1Rect.top;
      param1Float4 = (param1Rect.height() - param1Int2);
      param1Matrix.setTranslate((int)(param1Float1 + param1Float2 * 0.5F + 0.5F), (int)(param1Float3 + param1Float4 * 0.5F + 0.5F));
    }
    
    public String toString() {
      return "center";
    }
  }
  
  private static class d extends a {
    public static final r.b g = new d();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      if (param1Float4 > param1Float3) {
        param1Float2 = param1Rect.left;
        param1Float3 = param1Rect.width();
        float f = param1Int1;
        param1Float1 = param1Rect.top;
        param1Float2 += (param1Float3 - f * param1Float4) * 0.5F;
        param1Float3 = param1Float4;
      } else {
        param1Float2 = param1Rect.left;
        param1Float1 = param1Rect.top;
        param1Float1 = (param1Rect.height() - param1Int2 * param1Float3) * 0.5F + param1Float1;
      } 
      param1Matrix.setScale(param1Float3, param1Float3);
      param1Matrix.postTranslate((int)(param1Float2 + 0.5F), (int)(param1Float1 + 0.5F));
    }
    
    public String toString() {
      return "center_crop";
    }
  }
  
  private static class e extends a {
    public static final r.b g = new e();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      param1Float1 = Math.min(Math.min(param1Float3, param1Float4), 1.0F);
      param1Float2 = param1Rect.left;
      param1Float3 = param1Rect.width();
      param1Float4 = param1Int1;
      float f1 = param1Rect.top;
      float f2 = param1Rect.height();
      float f3 = param1Int2;
      param1Matrix.setScale(param1Float1, param1Float1);
      param1Matrix.postTranslate((int)(param1Float2 + (param1Float3 - param1Float4 * param1Float1) * 0.5F + 0.5F), (int)(f1 + (f2 - f3 * param1Float1) * 0.5F + 0.5F));
    }
    
    public String toString() {
      return "center_inside";
    }
  }
  
  private static class f extends a {
    public static final r.b g = new f();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      param1Float1 = Math.min(param1Float3, param1Float4);
      param1Float2 = param1Rect.left;
      param1Float3 = param1Rect.top;
      param1Float4 = param1Rect.height();
      float f1 = param1Int2;
      param1Matrix.setScale(param1Float1, param1Float1);
      param1Matrix.postTranslate((int)(param1Float2 + 0.5F), (int)(param1Float3 + param1Float4 - f1 * param1Float1 + 0.5F));
    }
    
    public String toString() {
      return "fit_bottom_start";
    }
  }
  
  private static class g extends a {
    public static final r.b g = new g();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      param1Float1 = Math.min(param1Float3, param1Float4);
      param1Float2 = param1Rect.left;
      param1Float3 = param1Rect.width();
      param1Float4 = param1Int1;
      float f1 = param1Rect.top;
      float f2 = param1Rect.height();
      float f3 = param1Int2;
      param1Matrix.setScale(param1Float1, param1Float1);
      param1Matrix.postTranslate((int)(param1Float2 + (param1Float3 - param1Float4 * param1Float1) * 0.5F + 0.5F), (int)(f1 + (f2 - f3 * param1Float1) * 0.5F + 0.5F));
    }
    
    public String toString() {
      return "fit_center";
    }
  }
  
  private static class h extends a {
    public static final r.b g = new h();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      param1Float1 = Math.min(param1Float3, param1Float4);
      param1Float2 = param1Rect.left;
      param1Float3 = param1Rect.width();
      param1Float4 = param1Int1;
      float f1 = param1Rect.top;
      float f2 = param1Rect.height();
      float f3 = param1Int2;
      param1Matrix.setScale(param1Float1, param1Float1);
      param1Matrix.postTranslate((int)(param1Float2 + param1Float3 - param1Float4 * param1Float1 + 0.5F), (int)(f1 + f2 - f3 * param1Float1 + 0.5F));
    }
    
    public String toString() {
      return "fit_end";
    }
  }
  
  private static class i extends a {
    public static final r.b g = new i();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      param1Float1 = Math.min(param1Float3, param1Float4);
      param1Float2 = param1Rect.left;
      param1Float3 = param1Rect.top;
      param1Matrix.setScale(param1Float1, param1Float1);
      param1Matrix.postTranslate((int)(param1Float2 + 0.5F), (int)(param1Float3 + 0.5F));
    }
    
    public String toString() {
      return "fit_start";
    }
  }
  
  private static class j extends a {
    public static final r.b g = new j();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      param1Float1 = param1Rect.left;
      param1Float2 = param1Rect.top;
      param1Matrix.setScale(param1Float3, param1Float4);
      param1Matrix.postTranslate((int)(param1Float1 + 0.5F), (int)(param1Float2 + 0.5F));
    }
    
    public String toString() {
      return "fit_xy";
    }
  }
  
  private static class k extends a {
    public static final r.b g = new k();
    
    public void a(Matrix param1Matrix, Rect param1Rect, int param1Int1, int param1Int2, float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      if (param1Float4 > param1Float3) {
        param1Float2 = param1Rect.width();
        param1Float3 = param1Int1 * param1Float4;
        param1Float2 = param1Rect.left + Math.max(Math.min(param1Float2 * 0.5F - param1Float1 * param1Float3, 0.0F), param1Rect.width() - param1Float3);
        param1Float1 = param1Rect.top;
        param1Float3 = param1Float4;
      } else {
        param1Float1 = param1Rect.left;
        param1Float4 = param1Rect.height();
        float f1 = param1Int2 * param1Float3;
        float f2 = param1Rect.top;
        param1Float4 = Math.max(Math.min(param1Float4 * 0.5F - param1Float2 * f1, 0.0F), param1Rect.height() - f1) + f2;
        param1Float2 = param1Float1;
        param1Float1 = param1Float4;
      } 
      param1Matrix.setScale(param1Float3, param1Float3);
      param1Matrix.postTranslate((int)(param1Float2 + 0.5F), (int)(param1Float1 + 0.5F));
    }
    
    public String toString() {
      return "focus_crop";
    }
  }
  
  public static interface l {
    Object getState();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/e/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */