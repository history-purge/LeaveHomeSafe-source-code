package e.f.a.f.p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

public interface d extends c.a {
  void a();
  
  void b();
  
  int getCircularRevealScrimColor();
  
  e getRevealInfo();
  
  void setCircularRevealOverlayDrawable(Drawable paramDrawable);
  
  void setCircularRevealScrimColor(int paramInt);
  
  void setRevealInfo(e parame);
  
  public static class b implements TypeEvaluator<e> {
    public static final TypeEvaluator<d.e> b = new b();
    
    private final d.e a = new d.e(null);
    
    public d.e a(float param1Float, d.e param1e1, d.e param1e2) {
      this.a.a(e.f.a.f.v.a.a(param1e1.a, param1e2.a, param1Float), e.f.a.f.v.a.a(param1e1.b, param1e2.b, param1Float), e.f.a.f.v.a.a(param1e1.c, param1e2.c, param1Float));
      return this.a;
    }
  }
  
  public static class c extends Property<d, e> {
    public static final Property<d, d.e> a = new c("circularReveal");
    
    private c(String param1String) {
      super(d.e.class, param1String);
    }
    
    public d.e a(d param1d) {
      return param1d.getRevealInfo();
    }
    
    public void a(d param1d, d.e param1e) {
      param1d.setRevealInfo(param1e);
    }
  }
  
  public static class d extends Property<d, Integer> {
    public static final Property<d, Integer> a = new d("circularRevealScrimColor");
    
    private d(String param1String) {
      super(Integer.class, param1String);
    }
    
    public Integer a(d param1d) {
      return Integer.valueOf(param1d.getCircularRevealScrimColor());
    }
    
    public void a(d param1d, Integer param1Integer) {
      param1d.setCircularRevealScrimColor(param1Integer.intValue());
    }
  }
  
  public static class e {
    public float a;
    
    public float b;
    
    public float c;
    
    private e() {}
    
    public e(float param1Float1, float param1Float2, float param1Float3) {
      this.a = param1Float1;
      this.b = param1Float2;
      this.c = param1Float3;
    }
    
    public void a(float param1Float1, float param1Float2, float param1Float3) {
      this.a = param1Float1;
      this.b = param1Float2;
      this.c = param1Float3;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/p/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */