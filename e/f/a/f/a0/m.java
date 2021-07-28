package e.f.a.f.a0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class m {
  @Deprecated
  public float a;
  
  @Deprecated
  public float b;
  
  @Deprecated
  public float c;
  
  @Deprecated
  public float d;
  
  @Deprecated
  public float e;
  
  @Deprecated
  public float f;
  
  private final List<f> g = new ArrayList<f>();
  
  private final List<g> h = new ArrayList<g>();
  
  public m() {
    b(0.0F, 0.0F);
  }
  
  private void a(float paramFloat) {
    if (e() == paramFloat)
      return; 
    float f = (paramFloat - e() + 360.0F) % 360.0F;
    if (f > 180.0F)
      return; 
    d d = new d(a(), b(), a(), b());
    d.a(d, e());
    d.b(d, f);
    this.h.add(new b(d));
    b(paramFloat);
  }
  
  private void a(g paramg, float paramFloat1, float paramFloat2) {
    a(paramFloat1);
    this.h.add(paramg);
    b(paramFloat2);
  }
  
  private void b(float paramFloat) {
    this.e = paramFloat;
  }
  
  private void c(float paramFloat) {
    this.f = paramFloat;
  }
  
  private void d(float paramFloat) {
    this.c = paramFloat;
  }
  
  private float e() {
    return this.e;
  }
  
  private void e(float paramFloat) {
    this.d = paramFloat;
  }
  
  private float f() {
    return this.f;
  }
  
  private void f(float paramFloat) {
    this.a = paramFloat;
  }
  
  private void g(float paramFloat) {
    this.b = paramFloat;
  }
  
  float a() {
    return this.c;
  }
  
  g a(Matrix paramMatrix) {
    a(f());
    return new a(this, new ArrayList<g>(this.h), paramMatrix);
  }
  
  public void a(float paramFloat1, float paramFloat2) {
    e e = new e();
    e.a(e, paramFloat1);
    e.b(e, paramFloat2);
    this.g.add(e);
    c c = new c(e, a(), b());
    a(c, c.a() + 270.0F, c.a() + 270.0F);
    d(paramFloat1);
    e(paramFloat2);
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    f(paramFloat1);
    g(paramFloat2);
    d(paramFloat1);
    e(paramFloat2);
    b(paramFloat3);
    c((paramFloat3 + paramFloat4) % 360.0F);
    this.g.clear();
    this.h.clear();
  }
  
  public void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6) {
    boolean bool;
    d d1 = new d(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
    d.a(d1, paramFloat5);
    d.b(d1, paramFloat6);
    this.g.add(d1);
    b b = new b(d1);
    float f = paramFloat5 + paramFloat6;
    if (paramFloat6 < 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    paramFloat6 = paramFloat5;
    if (bool)
      paramFloat6 = (paramFloat5 + 180.0F) % 360.0F; 
    if (bool) {
      paramFloat5 = (180.0F + f) % 360.0F;
    } else {
      paramFloat5 = f;
    } 
    a(b, paramFloat6, paramFloat5);
    paramFloat5 = (paramFloat3 - paramFloat1) / 2.0F;
    double d = f;
    d((paramFloat1 + paramFloat3) * 0.5F + paramFloat5 * (float)Math.cos(Math.toRadians(d)));
    e((paramFloat2 + paramFloat4) * 0.5F + (paramFloat4 - paramFloat2) / 2.0F * (float)Math.sin(Math.toRadians(d)));
  }
  
  public void a(Matrix paramMatrix, Path paramPath) {
    int j = this.g.size();
    for (int i = 0; i < j; i++)
      ((f)this.g.get(i)).a(paramMatrix, paramPath); 
  }
  
  float b() {
    return this.d;
  }
  
  public void b(float paramFloat1, float paramFloat2) {
    a(paramFloat1, paramFloat2, 270.0F, 0.0F);
  }
  
  float c() {
    return this.a;
  }
  
  float d() {
    return this.b;
  }
  
  class a extends g {
    a(m this$0, List param1List, Matrix param1Matrix) {}
    
    public void a(Matrix param1Matrix, e.f.a.f.z.a param1a, int param1Int, Canvas param1Canvas) {
      Iterator<m.g> iterator = this.b.iterator();
      while (iterator.hasNext())
        ((m.g)iterator.next()).a(this.c, param1a, param1Int, param1Canvas); 
    }
  }
  
  static class b extends g {
    private final m.d b;
    
    public b(m.d param1d) {
      this.b = param1d;
    }
    
    public void a(Matrix param1Matrix, e.f.a.f.z.a param1a, int param1Int, Canvas param1Canvas) {
      float f1 = m.d.e(this.b);
      float f2 = m.d.f(this.b);
      param1a.a(param1Canvas, param1Matrix, new RectF(m.d.a(this.b), m.d.b(this.b), m.d.c(this.b), m.d.d(this.b)), param1Int, f1, f2);
    }
  }
  
  static class c extends g {
    private final m.e b;
    
    private final float c;
    
    private final float d;
    
    public c(m.e param1e, float param1Float1, float param1Float2) {
      this.b = param1e;
      this.c = param1Float1;
      this.d = param1Float2;
    }
    
    float a() {
      return (float)Math.toDegrees(Math.atan(((m.e.b(this.b) - this.d) / (m.e.a(this.b) - this.c))));
    }
    
    public void a(Matrix param1Matrix, e.f.a.f.z.a param1a, int param1Int, Canvas param1Canvas) {
      float f1 = m.e.b(this.b);
      float f2 = this.d;
      float f3 = m.e.a(this.b);
      float f4 = this.c;
      RectF rectF = new RectF(0.0F, 0.0F, (float)Math.hypot((f1 - f2), (f3 - f4)), 0.0F);
      param1Matrix = new Matrix(param1Matrix);
      param1Matrix.preTranslate(this.c, this.d);
      param1Matrix.preRotate(a());
      param1a.a(param1Canvas, param1Matrix, rectF, param1Int);
    }
  }
  
  public static class d extends f {
    private static final RectF h = new RectF();
    
    @Deprecated
    public float b;
    
    @Deprecated
    public float c;
    
    @Deprecated
    public float d;
    
    @Deprecated
    public float e;
    
    @Deprecated
    public float f;
    
    @Deprecated
    public float g;
    
    public d(float param1Float1, float param1Float2, float param1Float3, float param1Float4) {
      b(param1Float1);
      f(param1Float2);
      c(param1Float3);
      a(param1Float4);
    }
    
    private float a() {
      return this.e;
    }
    
    private void a(float param1Float) {
      this.e = param1Float;
    }
    
    private float b() {
      return this.b;
    }
    
    private void b(float param1Float) {
      this.b = param1Float;
    }
    
    private float c() {
      return this.d;
    }
    
    private void c(float param1Float) {
      this.d = param1Float;
    }
    
    private float d() {
      return this.f;
    }
    
    private void d(float param1Float) {
      this.f = param1Float;
    }
    
    private float e() {
      return this.g;
    }
    
    private void e(float param1Float) {
      this.g = param1Float;
    }
    
    private float f() {
      return this.c;
    }
    
    private void f(float param1Float) {
      this.c = param1Float;
    }
    
    public void a(Matrix param1Matrix, Path param1Path) {
      Matrix matrix = this.a;
      param1Matrix.invert(matrix);
      param1Path.transform(matrix);
      h.set(b(), f(), c(), a());
      param1Path.arcTo(h, d(), e(), false);
      param1Path.transform(param1Matrix);
    }
  }
  
  public static class e extends f {
    private float b;
    
    private float c;
    
    public void a(Matrix param1Matrix, Path param1Path) {
      Matrix matrix = this.a;
      param1Matrix.invert(matrix);
      param1Path.transform(matrix);
      param1Path.lineTo(this.b, this.c);
      param1Path.transform(param1Matrix);
    }
  }
  
  public static abstract class f {
    protected final Matrix a = new Matrix();
    
    public abstract void a(Matrix param1Matrix, Path param1Path);
  }
  
  static abstract class g {
    static final Matrix a = new Matrix();
    
    public abstract void a(Matrix param1Matrix, e.f.a.f.z.a param1a, int param1Int, Canvas param1Canvas);
    
    public final void a(e.f.a.f.z.a param1a, int param1Int, Canvas param1Canvas) {
      a(a, param1a, param1Int, param1Canvas);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/a0/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */