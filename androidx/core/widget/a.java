package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import b.g.m.v;

public abstract class a implements View.OnTouchListener {
  private static final int t = ViewConfiguration.getTapTimeout();
  
  final a c = new a();
  
  private final Interpolator d = (Interpolator)new AccelerateInterpolator();
  
  final View e;
  
  private Runnable f;
  
  private float[] g = new float[] { 0.0F, 0.0F };
  
  private float[] h = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
  
  private int i;
  
  private int j;
  
  private float[] k = new float[] { 0.0F, 0.0F };
  
  private float[] l = new float[] { 0.0F, 0.0F };
  
  private float[] m = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
  
  private boolean n;
  
  boolean o;
  
  boolean p;
  
  boolean q;
  
  private boolean r;
  
  private boolean s;
  
  public a(View paramView) {
    this.e = paramView;
    float f = (Resources.getSystem().getDisplayMetrics()).density;
    int i = (int)(1575.0F * f + 0.5F);
    int j = (int)(f * 315.0F + 0.5F);
    f = i;
    b(f, f);
    f = j;
    c(f, f);
    d(1);
    a(Float.MAX_VALUE, Float.MAX_VALUE);
    d(0.2F, 0.2F);
    e(1.0F, 1.0F);
    c(t);
    f(500);
    e(500);
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return (paramFloat1 > paramFloat3) ? paramFloat3 : ((paramFloat1 < paramFloat2) ? paramFloat2 : paramFloat1);
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    paramFloat1 = a(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    paramFloat3 = f(paramFloat4, paramFloat1);
    paramFloat1 = f(paramFloat2 - paramFloat4, paramFloat1) - paramFloat3;
    if (paramFloat1 < 0.0F) {
      paramFloat1 = -this.d.getInterpolation(-paramFloat1);
    } else {
      if (paramFloat1 > 0.0F) {
        paramFloat1 = this.d.getInterpolation(paramFloat1);
        return a(paramFloat1, -1.0F, 1.0F);
      } 
      return 0.0F;
    } 
    return a(paramFloat1, -1.0F, 1.0F);
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    paramFloat1 = a(this.g[paramInt], paramFloat2, this.h[paramInt], paramFloat1);
    if (paramFloat1 == 0.0F)
      return 0.0F; 
    float f2 = this.k[paramInt];
    paramFloat2 = this.l[paramInt];
    float f1 = this.m[paramInt];
    paramFloat3 = f2 * paramFloat3;
    return (paramFloat1 > 0.0F) ? a(paramFloat1 * paramFloat3, paramFloat2, f1) : -a(-paramFloat1 * paramFloat3, paramFloat2, f1);
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 > paramInt3) ? paramInt3 : ((paramInt1 < paramInt2) ? paramInt2 : paramInt1);
  }
  
  private void c() {
    if (this.o) {
      this.q = false;
      return;
    } 
    this.c.g();
  }
  
  private void d() {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Ljava/lang/Runnable;
    //   4: ifnonnull -> 19
    //   7: aload_0
    //   8: new androidx/core/widget/a$b
    //   11: dup
    //   12: aload_0
    //   13: invokespecial <init> : (Landroidx/core/widget/a;)V
    //   16: putfield f : Ljava/lang/Runnable;
    //   19: aload_0
    //   20: iconst_1
    //   21: putfield q : Z
    //   24: aload_0
    //   25: iconst_1
    //   26: putfield o : Z
    //   29: aload_0
    //   30: getfield n : Z
    //   33: ifne -> 61
    //   36: aload_0
    //   37: getfield j : I
    //   40: istore_1
    //   41: iload_1
    //   42: ifle -> 61
    //   45: aload_0
    //   46: getfield e : Landroid/view/View;
    //   49: aload_0
    //   50: getfield f : Ljava/lang/Runnable;
    //   53: iload_1
    //   54: i2l
    //   55: invokestatic a : (Landroid/view/View;Ljava/lang/Runnable;J)V
    //   58: goto -> 70
    //   61: aload_0
    //   62: getfield f : Ljava/lang/Runnable;
    //   65: invokeinterface run : ()V
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield n : Z
    //   75: return
  }
  
  private float f(float paramFloat1, float paramFloat2) {
    if (paramFloat2 == 0.0F)
      return 0.0F; 
    int i = this.i;
    if (i != 0 && i != 1) {
      if (i != 2)
        return 0.0F; 
      if (paramFloat1 < 0.0F)
        return paramFloat1 / -paramFloat2; 
    } else if (paramFloat1 < paramFloat2) {
      if (paramFloat1 >= 0.0F)
        return 1.0F - paramFloat1 / paramFloat2; 
      if (this.q && this.i == 1)
        return 1.0F; 
    } 
    return 0.0F;
  }
  
  public a a(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.h;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a a(boolean paramBoolean) {
    if (this.r && !paramBoolean)
      c(); 
    this.r = paramBoolean;
    return this;
  }
  
  void a() {
    long l = SystemClock.uptimeMillis();
    MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
    this.e.onTouchEvent(motionEvent);
    motionEvent.recycle();
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  public abstract boolean a(int paramInt);
  
  public a b(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.m;
    arrayOfFloat[0] = paramFloat1 / 1000.0F;
    arrayOfFloat[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  boolean b() {
    a a1 = this.c;
    int i = a1.e();
    int j = a1.d();
    return ((i != 0 && b(i)) || (j != 0 && a(j)));
  }
  
  public abstract boolean b(int paramInt);
  
  public a c(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.l;
    arrayOfFloat[0] = paramFloat1 / 1000.0F;
    arrayOfFloat[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  public a c(int paramInt) {
    this.j = paramInt;
    return this;
  }
  
  public a d(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.g;
    arrayOfFloat[0] = paramFloat1;
    arrayOfFloat[1] = paramFloat2;
    return this;
  }
  
  public a d(int paramInt) {
    this.i = paramInt;
    return this;
  }
  
  public a e(float paramFloat1, float paramFloat2) {
    float[] arrayOfFloat = this.k;
    arrayOfFloat[0] = paramFloat1 / 1000.0F;
    arrayOfFloat[1] = paramFloat2 / 1000.0F;
    return this;
  }
  
  public a e(int paramInt) {
    this.c.a(paramInt);
    return this;
  }
  
  public a f(int paramInt) {
    this.c.b(paramInt);
    return this;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield r : Z
    //   4: istore #6
    //   6: iconst_0
    //   7: istore #7
    //   9: iload #6
    //   11: ifne -> 16
    //   14: iconst_0
    //   15: ireturn
    //   16: aload_2
    //   17: invokevirtual getActionMasked : ()I
    //   20: istore #5
    //   22: iload #5
    //   24: ifeq -> 55
    //   27: iload #5
    //   29: iconst_1
    //   30: if_icmpeq -> 48
    //   33: iload #5
    //   35: iconst_2
    //   36: if_icmpeq -> 65
    //   39: iload #5
    //   41: iconst_3
    //   42: if_icmpeq -> 48
    //   45: goto -> 140
    //   48: aload_0
    //   49: invokespecial c : ()V
    //   52: goto -> 140
    //   55: aload_0
    //   56: iconst_1
    //   57: putfield p : Z
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield n : Z
    //   65: aload_0
    //   66: iconst_0
    //   67: aload_2
    //   68: invokevirtual getX : ()F
    //   71: aload_1
    //   72: invokevirtual getWidth : ()I
    //   75: i2f
    //   76: aload_0
    //   77: getfield e : Landroid/view/View;
    //   80: invokevirtual getWidth : ()I
    //   83: i2f
    //   84: invokespecial a : (IFFF)F
    //   87: fstore_3
    //   88: aload_0
    //   89: iconst_1
    //   90: aload_2
    //   91: invokevirtual getY : ()F
    //   94: aload_1
    //   95: invokevirtual getHeight : ()I
    //   98: i2f
    //   99: aload_0
    //   100: getfield e : Landroid/view/View;
    //   103: invokevirtual getHeight : ()I
    //   106: i2f
    //   107: invokespecial a : (IFFF)F
    //   110: fstore #4
    //   112: aload_0
    //   113: getfield c : Landroidx/core/widget/a$a;
    //   116: fload_3
    //   117: fload #4
    //   119: invokevirtual a : (FF)V
    //   122: aload_0
    //   123: getfield q : Z
    //   126: ifne -> 140
    //   129: aload_0
    //   130: invokevirtual b : ()Z
    //   133: ifeq -> 140
    //   136: aload_0
    //   137: invokespecial d : ()V
    //   140: iload #7
    //   142: istore #6
    //   144: aload_0
    //   145: getfield s : Z
    //   148: ifeq -> 165
    //   151: iload #7
    //   153: istore #6
    //   155: aload_0
    //   156: getfield q : Z
    //   159: ifeq -> 165
    //   162: iconst_1
    //   163: istore #6
    //   165: iload #6
    //   167: ireturn
  }
  
  private static class a {
    private int a;
    
    private int b;
    
    private float c;
    
    private float d;
    
    private long e = Long.MIN_VALUE;
    
    private long f = 0L;
    
    private int g = 0;
    
    private int h = 0;
    
    private long i = -1L;
    
    private float j;
    
    private int k;
    
    private float a(float param1Float) {
      return -4.0F * param1Float * param1Float + param1Float * 4.0F;
    }
    
    private float a(long param1Long) {
      if (param1Long < this.e)
        return 0.0F; 
      long l = this.i;
      if (l < 0L || param1Long < l)
        return a.a((float)(param1Long - this.e) / this.a, 0.0F, 1.0F) * 0.5F; 
      float f = this.j;
      return 1.0F - f + f * a.a((float)(param1Long - l) / this.k, 0.0F, 1.0F);
    }
    
    public void a() {
      if (this.f != 0L) {
        long l1 = AnimationUtils.currentAnimationTimeMillis();
        float f = a(a(l1));
        long l2 = this.f;
        this.f = l1;
        f = (float)(l1 - l2) * f;
        this.g = (int)(this.c * f);
        this.h = (int)(f * this.d);
        return;
      } 
      throw new RuntimeException("Cannot compute scroll delta before calling start()");
    }
    
    public void a(float param1Float1, float param1Float2) {
      this.c = param1Float1;
      this.d = param1Float2;
    }
    
    public void a(int param1Int) {
      this.b = param1Int;
    }
    
    public int b() {
      return this.g;
    }
    
    public void b(int param1Int) {
      this.a = param1Int;
    }
    
    public int c() {
      return this.h;
    }
    
    public int d() {
      float f = this.c;
      return (int)(f / Math.abs(f));
    }
    
    public int e() {
      float f = this.d;
      return (int)(f / Math.abs(f));
    }
    
    public boolean f() {
      return (this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + this.k);
    }
    
    public void g() {
      long l = AnimationUtils.currentAnimationTimeMillis();
      this.k = a.a((int)(l - this.e), 0, this.b);
      this.j = a(l);
      this.i = l;
    }
    
    public void h() {
      this.e = AnimationUtils.currentAnimationTimeMillis();
      this.i = -1L;
      this.f = this.e;
      this.j = 0.5F;
      this.g = 0;
      this.h = 0;
    }
  }
  
  private class b implements Runnable {
    b(a this$0) {}
    
    public void run() {
      a a2 = this.c;
      if (!a2.q)
        return; 
      if (a2.o) {
        a2.o = false;
        a2.c.h();
      } 
      a.a a1 = this.c.c;
      if (a1.f() || !this.c.b()) {
        this.c.q = false;
        return;
      } 
      a a3 = this.c;
      if (a3.p) {
        a3.p = false;
        a3.a();
      } 
      a1.a();
      int i = a1.b();
      int j = a1.c();
      this.c.a(i, j);
      v.a(this.c.e, this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/widget/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */