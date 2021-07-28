package b.p.a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.util.f;

public class b extends Drawable implements Animatable {
  private static final Interpolator i = (Interpolator)new LinearInterpolator();
  
  private static final Interpolator j = (Interpolator)new b.m.a.a.b();
  
  private static final int[] k = new int[] { -16777216 };
  
  private final c c;
  
  private float d;
  
  private Resources e;
  
  private Animator f;
  
  float g;
  
  boolean h;
  
  public b(Context paramContext) {
    f.a(paramContext);
    this.e = paramContext.getResources();
    this.c = new c();
    this.c.a(k);
    c(2.5F);
    a();
  }
  
  private int a(float paramFloat, int paramInt1, int paramInt2) {
    int i = paramInt1 >> 24 & 0xFF;
    int j = paramInt1 >> 16 & 0xFF;
    int k = paramInt1 >> 8 & 0xFF;
    paramInt1 &= 0xFF;
    return i + (int)(((paramInt2 >> 24 & 0xFF) - i) * paramFloat) << 24 | j + (int)(((paramInt2 >> 16 & 0xFF) - j) * paramFloat) << 16 | k + (int)(((paramInt2 >> 8 & 0xFF) - k) * paramFloat) << 8 | paramInt1 + (int)(paramFloat * ((paramInt2 & 0xFF) - paramInt1));
  }
  
  private void a() {
    c c1 = this.c;
    ValueAnimator valueAnimator = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
    valueAnimator.addUpdateListener(new a(this, c1));
    valueAnimator.setRepeatCount(-1);
    valueAnimator.setRepeatMode(1);
    valueAnimator.setInterpolator((TimeInterpolator)i);
    valueAnimator.addListener(new b(this, c1));
    this.f = (Animator)valueAnimator;
  }
  
  private void a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    c c1 = this.c;
    float f = (this.e.getDisplayMetrics()).density;
    c1.f(paramFloat2 * f);
    c1.b(paramFloat1 * f);
    c1.c(0);
    c1.a(paramFloat3 * f, paramFloat4 * f);
  }
  
  private void b(float paramFloat, c paramc) {
    a(paramFloat, paramc);
    float f = (float)(Math.floor((paramc.h() / 0.8F)) + 1.0D);
    paramc.e(paramc.i() + (paramc.g() - 0.01F - paramc.i()) * paramFloat);
    paramc.c(paramc.g());
    paramc.d(paramc.h() + (f - paramc.h()) * paramFloat);
  }
  
  private void d(float paramFloat) {
    this.d = paramFloat;
  }
  
  public void a(float paramFloat) {
    this.c.a(paramFloat);
    invalidateSelf();
  }
  
  public void a(float paramFloat1, float paramFloat2) {
    this.c.e(paramFloat1);
    this.c.c(paramFloat2);
    invalidateSelf();
  }
  
  void a(float paramFloat, c paramc) {
    int i;
    if (paramFloat > 0.75F) {
      i = a((paramFloat - 0.75F) / 0.25F, paramc.f(), paramc.c());
    } else {
      i = paramc.f();
    } 
    paramc.b(i);
  }
  
  void a(float paramFloat, c paramc, boolean paramBoolean) {
    if (this.h) {
      b(paramFloat, paramc);
      return;
    } 
    if (paramFloat != 1.0F || paramBoolean) {
      float f1;
      float f2;
      float f3 = paramc.h();
      if (paramFloat < 0.5F) {
        f2 = paramFloat / 0.5F;
        f1 = paramc.i();
        f2 = j.getInterpolation(f2) * 0.79F + 0.01F + f1;
      } else {
        f1 = (paramFloat - 0.5F) / 0.5F;
        f2 = paramc.i() + 0.79F;
        f1 = f2 - (1.0F - j.getInterpolation(f1)) * 0.79F + 0.01F;
      } 
      float f4 = this.g;
      paramc.e(f1);
      paramc.c(f2);
      paramc.d(f3 + 0.20999998F * paramFloat);
      d((paramFloat + f4) * 216.0F);
    } 
  }
  
  public void a(int paramInt) {
    float f1;
    float f2;
    float f3;
    float f4;
    if (paramInt == 0) {
      f4 = 11.0F;
      f1 = 3.0F;
      f2 = 12.0F;
      f3 = 6.0F;
    } else {
      f4 = 7.5F;
      f1 = 2.5F;
      f2 = 10.0F;
      f3 = 5.0F;
    } 
    a(f4, f1, f2, f3);
    invalidateSelf();
  }
  
  public void a(boolean paramBoolean) {
    this.c.a(paramBoolean);
    invalidateSelf();
  }
  
  public void a(int... paramVarArgs) {
    this.c.a(paramVarArgs);
    this.c.c(0);
    invalidateSelf();
  }
  
  public void b(float paramFloat) {
    this.c.d(paramFloat);
    invalidateSelf();
  }
  
  public void c(float paramFloat) {
    this.c.f(paramFloat);
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas) {
    Rect rect = getBounds();
    paramCanvas.save();
    paramCanvas.rotate(this.d, rect.exactCenterX(), rect.exactCenterY());
    this.c.a(paramCanvas, rect);
    paramCanvas.restore();
  }
  
  public int getAlpha() {
    return this.c.a();
  }
  
  public int getOpacity() {
    return -3;
  }
  
  public boolean isRunning() {
    return this.f.isRunning();
  }
  
  public void setAlpha(int paramInt) {
    this.c.a(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.c.a(paramColorFilter);
    invalidateSelf();
  }
  
  public void start() {
    long l;
    Animator animator;
    this.f.cancel();
    this.c.l();
    if (this.c.b() != this.c.e()) {
      this.h = true;
      animator = this.f;
      l = 666L;
    } else {
      this.c.c(0);
      this.c.k();
      animator = this.f;
      l = 1332L;
    } 
    animator.setDuration(l);
    this.f.start();
  }
  
  public void stop() {
    this.f.cancel();
    d(0.0F);
    this.c.a(false);
    this.c.c(0);
    this.c.k();
    invalidateSelf();
  }
  
  class a implements ValueAnimator.AnimatorUpdateListener {
    a(b this$0, b.c param1c) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      float f = ((Float)param1ValueAnimator.getAnimatedValue()).floatValue();
      this.b.a(f, this.a);
      this.b.a(f, this.a, false);
      this.b.invalidateSelf();
    }
  }
  
  class b implements Animator.AnimatorListener {
    b(b this$0, b.c param1c) {}
    
    public void onAnimationCancel(Animator param1Animator) {}
    
    public void onAnimationEnd(Animator param1Animator) {}
    
    public void onAnimationRepeat(Animator param1Animator) {
      this.b.a(1.0F, this.a, true);
      this.a.l();
      this.a.j();
      b b1 = this.b;
      if (b1.h) {
        b1.h = false;
        param1Animator.cancel();
        param1Animator.setDuration(1332L);
        param1Animator.start();
        this.a.a(false);
        return;
      } 
      b1.g++;
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.b.g = 0.0F;
    }
  }
  
  private static class c {
    final RectF a = new RectF();
    
    final Paint b = new Paint();
    
    final Paint c = new Paint();
    
    final Paint d = new Paint();
    
    float e = 0.0F;
    
    float f = 0.0F;
    
    float g = 0.0F;
    
    float h = 5.0F;
    
    int[] i;
    
    int j;
    
    float k;
    
    float l;
    
    float m;
    
    boolean n;
    
    Path o;
    
    float p = 1.0F;
    
    float q;
    
    int r;
    
    int s;
    
    int t = 255;
    
    int u;
    
    c() {
      this.b.setStrokeCap(Paint.Cap.SQUARE);
      this.b.setAntiAlias(true);
      this.b.setStyle(Paint.Style.STROKE);
      this.c.setStyle(Paint.Style.FILL);
      this.c.setAntiAlias(true);
      this.d.setColor(0);
    }
    
    int a() {
      return this.t;
    }
    
    void a(float param1Float) {
      if (param1Float != this.p)
        this.p = param1Float; 
    }
    
    void a(float param1Float1, float param1Float2) {
      this.r = (int)param1Float1;
      this.s = (int)param1Float2;
    }
    
    void a(int param1Int) {
      this.t = param1Int;
    }
    
    void a(Canvas param1Canvas, float param1Float1, float param1Float2, RectF param1RectF) {
      if (this.n) {
        Path path = this.o;
        if (path == null) {
          this.o = new Path();
          this.o.setFillType(Path.FillType.EVEN_ODD);
        } else {
          path.reset();
        } 
        float f1 = Math.min(param1RectF.width(), param1RectF.height()) / 2.0F;
        float f2 = this.r * this.p / 2.0F;
        this.o.moveTo(0.0F, 0.0F);
        this.o.lineTo(this.r * this.p, 0.0F);
        path = this.o;
        float f3 = this.r;
        float f4 = this.p;
        path.lineTo(f3 * f4 / 2.0F, this.s * f4);
        this.o.offset(f1 + param1RectF.centerX() - f2, param1RectF.centerY() + this.h / 2.0F);
        this.o.close();
        this.c.setColor(this.u);
        this.c.setAlpha(this.t);
        param1Canvas.save();
        param1Canvas.rotate(param1Float1 + param1Float2, param1RectF.centerX(), param1RectF.centerY());
        param1Canvas.drawPath(this.o, this.c);
        param1Canvas.restore();
      } 
    }
    
    void a(Canvas param1Canvas, Rect param1Rect) {
      RectF rectF = this.a;
      float f2 = this.q;
      float f1 = this.h / 2.0F + f2;
      if (f2 <= 0.0F)
        f1 = Math.min(param1Rect.width(), param1Rect.height()) / 2.0F - Math.max(this.r * this.p / 2.0F, this.h / 2.0F); 
      rectF.set(param1Rect.centerX() - f1, param1Rect.centerY() - f1, param1Rect.centerX() + f1, param1Rect.centerY() + f1);
      f1 = this.e;
      f2 = this.g;
      f1 = (f1 + f2) * 360.0F;
      f2 = (this.f + f2) * 360.0F - f1;
      this.b.setColor(this.u);
      this.b.setAlpha(this.t);
      float f3 = this.h / 2.0F;
      rectF.inset(f3, f3);
      param1Canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0F, this.d);
      f3 = -f3;
      rectF.inset(f3, f3);
      param1Canvas.drawArc(rectF, f1, f2, false, this.b);
      a(param1Canvas, f1, f2, rectF);
    }
    
    void a(ColorFilter param1ColorFilter) {
      this.b.setColorFilter(param1ColorFilter);
    }
    
    void a(boolean param1Boolean) {
      if (this.n != param1Boolean)
        this.n = param1Boolean; 
    }
    
    void a(int[] param1ArrayOfint) {
      this.i = param1ArrayOfint;
      c(0);
    }
    
    float b() {
      return this.f;
    }
    
    void b(float param1Float) {
      this.q = param1Float;
    }
    
    void b(int param1Int) {
      this.u = param1Int;
    }
    
    int c() {
      return this.i[d()];
    }
    
    void c(float param1Float) {
      this.f = param1Float;
    }
    
    void c(int param1Int) {
      this.j = param1Int;
      this.u = this.i[this.j];
    }
    
    int d() {
      return (this.j + 1) % this.i.length;
    }
    
    void d(float param1Float) {
      this.g = param1Float;
    }
    
    float e() {
      return this.e;
    }
    
    void e(float param1Float) {
      this.e = param1Float;
    }
    
    int f() {
      return this.i[this.j];
    }
    
    void f(float param1Float) {
      this.h = param1Float;
      this.b.setStrokeWidth(param1Float);
    }
    
    float g() {
      return this.l;
    }
    
    float h() {
      return this.m;
    }
    
    float i() {
      return this.k;
    }
    
    void j() {
      c(d());
    }
    
    void k() {
      this.k = 0.0F;
      this.l = 0.0F;
      this.m = 0.0F;
      e(0.0F);
      c(0.0F);
      d(0.0F);
    }
    
    void l() {
      this.k = this.e;
      this.l = this.f;
      this.m = this.g;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/p/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */