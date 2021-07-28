package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import b.g.m.v;
import e.f.a.f.a0.n;
import java.util.ArrayList;
import java.util.Iterator;

class b {
  static final TimeInterpolator F = e.f.a.f.l.a.c;
  
  static final int[] G = new int[] { 16842919, 16842910 };
  
  static final int[] H = new int[] { 16843623, 16842908, 16842910 };
  
  static final int[] I = new int[] { 16842908, 16842910 };
  
  static final int[] J = new int[] { 16843623, 16842910 };
  
  static final int[] K = new int[] { 16842910 };
  
  static final int[] L = new int[0];
  
  private final Rect A = new Rect();
  
  private final RectF B = new RectF();
  
  private final RectF C = new RectF();
  
  private final Matrix D = new Matrix();
  
  private ViewTreeObserver.OnPreDrawListener E;
  
  e.f.a.f.a0.k a;
  
  e.f.a.f.a0.g b;
  
  Drawable c;
  
  a d;
  
  Drawable e;
  
  boolean f;
  
  boolean g = true;
  
  float h;
  
  float i;
  
  float j;
  
  int k;
  
  private final com.google.android.material.internal.e l;
  
  private e.f.a.f.l.h m;
  
  private e.f.a.f.l.h n;
  
  private Animator o;
  
  private e.f.a.f.l.h p;
  
  private e.f.a.f.l.h q;
  
  private float r;
  
  private float s = 1.0F;
  
  private int t;
  
  private int u = 0;
  
  private ArrayList<Animator.AnimatorListener> v;
  
  private ArrayList<Animator.AnimatorListener> w;
  
  private ArrayList<i> x;
  
  final FloatingActionButton y;
  
  final e.f.a.f.z.b z;
  
  b(FloatingActionButton paramFloatingActionButton, e.f.a.f.z.b paramb) {
    this.y = paramFloatingActionButton;
    this.z = paramb;
    this.l = new com.google.android.material.internal.e();
    this.l.a(G, a(new h(this)));
    this.l.a(H, a(new g(this)));
    this.l.a(I, a(new g(this)));
    this.l.a(J, a(new g(this)));
    this.l.a(K, a(new k(this)));
    this.l.a(L, a(new f(this)));
    this.r = this.y.getRotation();
  }
  
  private boolean A() {
    return (v.I((View)this.y) && !this.y.isInEditMode());
  }
  
  private AnimatorSet a(e.f.a.f.l.h paramh, float paramFloat1, float paramFloat2, float paramFloat3) {
    ArrayList<ObjectAnimator> arrayList = new ArrayList();
    ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(this.y, View.ALPHA, new float[] { paramFloat1 });
    paramh.a("opacity").a((Animator)objectAnimator);
    arrayList.add(objectAnimator);
    objectAnimator = ObjectAnimator.ofFloat(this.y, View.SCALE_X, new float[] { paramFloat2 });
    paramh.a("scale").a((Animator)objectAnimator);
    a(objectAnimator);
    arrayList.add(objectAnimator);
    objectAnimator = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, new float[] { paramFloat2 });
    paramh.a("scale").a((Animator)objectAnimator);
    a(objectAnimator);
    arrayList.add(objectAnimator);
    a(paramFloat3, this.D);
    objectAnimator = ObjectAnimator.ofObject(this.y, (Property)new e.f.a.f.l.f(), (TypeEvaluator)new c(this), (Object[])new Matrix[] { new Matrix(this.D) });
    paramh.a("iconScale").a((Animator)objectAnimator);
    arrayList.add(objectAnimator);
    AnimatorSet animatorSet = new AnimatorSet();
    e.f.a.f.l.b.a(animatorSet, arrayList);
    return animatorSet;
  }
  
  private ValueAnimator a(l paraml) {
    ValueAnimator valueAnimator = new ValueAnimator();
    valueAnimator.setInterpolator(F);
    valueAnimator.setDuration(100L);
    valueAnimator.addListener((Animator.AnimatorListener)paraml);
    valueAnimator.addUpdateListener(paraml);
    valueAnimator.setFloatValues(new float[] { 0.0F, 1.0F });
    return valueAnimator;
  }
  
  private void a(float paramFloat, Matrix paramMatrix) {
    paramMatrix.reset();
    Drawable drawable = this.y.getDrawable();
    if (drawable != null && this.t != 0) {
      RectF rectF1 = this.B;
      RectF rectF2 = this.C;
      rectF1.set(0.0F, 0.0F, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
      int i = this.t;
      rectF2.set(0.0F, 0.0F, i, i);
      paramMatrix.setRectToRect(rectF1, rectF2, Matrix.ScaleToFit.CENTER);
      i = this.t;
      paramMatrix.postScale(paramFloat, paramFloat, i / 2.0F, i / 2.0F);
    } 
  }
  
  private void a(ObjectAnimator paramObjectAnimator) {
    if (Build.VERSION.SDK_INT != 26)
      return; 
    paramObjectAnimator.setEvaluator(new d(this));
  }
  
  private e.f.a.f.l.h x() {
    if (this.n == null)
      this.n = e.f.a.f.l.h.a(this.y.getContext(), e.f.a.f.a.design_fab_hide_motion_spec); 
    e.f.a.f.l.h h1 = this.n;
    androidx.core.util.f.a(h1);
    return h1;
  }
  
  private e.f.a.f.l.h y() {
    if (this.m == null)
      this.m = e.f.a.f.l.h.a(this.y.getContext(), e.f.a.f.a.design_fab_show_motion_spec); 
    e.f.a.f.l.h h1 = this.m;
    androidx.core.util.f.a(h1);
    return h1;
  }
  
  private ViewTreeObserver.OnPreDrawListener z() {
    if (this.E == null)
      this.E = new e(this); 
    return this.E;
  }
  
  final Drawable a() {
    return this.e;
  }
  
  final void a(float paramFloat) {
    if (this.h != paramFloat) {
      this.h = paramFloat;
      a(this.h, this.i, this.j);
    } 
  }
  
  void a(float paramFloat1, float paramFloat2, float paramFloat3) {
    w();
    e(paramFloat1);
  }
  
  public void a(Animator.AnimatorListener paramAnimatorListener) {
    if (this.w == null)
      this.w = new ArrayList<Animator.AnimatorListener>(); 
    this.w.add(paramAnimatorListener);
  }
  
  void a(ColorStateList paramColorStateList) {
    e.f.a.f.a0.g g1 = this.b;
    if (g1 != null)
      g1.setTintList(paramColorStateList); 
    a a1 = this.d;
    if (a1 == null)
      return; 
    a1.a(paramColorStateList);
    throw null;
  }
  
  void a(PorterDuff.Mode paramMode) {
    e.f.a.f.a0.g g1 = this.b;
    if (g1 != null)
      g1.setTintMode(paramMode); 
  }
  
  void a(Rect paramRect) {
    float f;
    if (this.f) {
      i = (this.k - this.y.getSizeDimension()) / 2;
    } else {
      i = 0;
    } 
    if (this.g) {
      f = b() + this.j;
    } else {
      f = 0.0F;
    } 
    int j = Math.max(i, (int)Math.ceil(f));
    int i = Math.max(i, (int)Math.ceil((f * 1.5F)));
    paramRect.set(j, i, j, i);
  }
  
  void a(i parami) {
    if (this.x == null)
      this.x = new ArrayList<i>(); 
    this.x.add(parami);
  }
  
  void a(j paramj, boolean paramBoolean) {
    Iterator<Animator.AnimatorListener> iterator;
    byte b1;
    if (i())
      return; 
    Animator animator = this.o;
    if (animator != null)
      animator.cancel(); 
    if (A()) {
      e.f.a.f.l.h h1 = this.q;
      if (h1 == null)
        h1 = x(); 
      AnimatorSet animatorSet = a(h1, 0.0F, 0.0F, 0.0F);
      animatorSet.addListener((Animator.AnimatorListener)new a(this, paramBoolean, paramj));
      ArrayList<Animator.AnimatorListener> arrayList = this.w;
      if (arrayList != null) {
        iterator = arrayList.iterator();
        while (iterator.hasNext())
          animatorSet.addListener(iterator.next()); 
      } 
      animatorSet.start();
      return;
    } 
    FloatingActionButton floatingActionButton = this.y;
    if (paramBoolean) {
      b1 = 8;
    } else {
      b1 = 4;
    } 
    floatingActionButton.a(b1, paramBoolean);
    if (iterator != null)
      iterator.b(); 
  }
  
  final void a(e.f.a.f.a0.k paramk) {
    this.a = paramk;
    e.f.a.f.a0.g g1 = this.b;
    if (g1 != null)
      g1.setShapeAppearanceModel(paramk); 
    Drawable drawable = this.c;
    if (drawable instanceof n)
      ((n)drawable).setShapeAppearanceModel(paramk); 
    drawable = this.d;
    if (drawable == null)
      return; 
    drawable.a(paramk);
    throw null;
  }
  
  final void a(e.f.a.f.l.h paramh) {
    this.q = paramh;
  }
  
  void a(boolean paramBoolean) {
    this.f = paramBoolean;
  }
  
  void a(int[] paramArrayOfint) {
    this.l.a(paramArrayOfint);
  }
  
  float b() {
    return this.h;
  }
  
  final void b(float paramFloat) {
    if (this.i != paramFloat) {
      this.i = paramFloat;
      a(this.h, this.i, this.j);
    } 
  }
  
  void b(Animator.AnimatorListener paramAnimatorListener) {
    if (this.v == null)
      this.v = new ArrayList<Animator.AnimatorListener>(); 
    this.v.add(paramAnimatorListener);
  }
  
  void b(ColorStateList paramColorStateList) {
    Drawable drawable = this.c;
    if (drawable != null)
      androidx.core.graphics.drawable.a.a(drawable, e.f.a.f.y.b.a(paramColorStateList)); 
  }
  
  void b(Rect paramRect) {
    Drawable drawable;
    e.f.a.f.z.b b1;
    androidx.core.util.f.a(this.e, "Didn't initialize content background");
    if (s()) {
      InsetDrawable insetDrawable = new InsetDrawable(this.e, paramRect.left, paramRect.top, paramRect.right, paramRect.bottom);
      b1 = this.z;
    } else {
      b1 = this.z;
      drawable = this.e;
    } 
    b1.a(drawable);
  }
  
  void b(j paramj, boolean paramBoolean) {
    Iterator<Animator.AnimatorListener> iterator;
    if (j())
      return; 
    Animator animator = this.o;
    if (animator != null)
      animator.cancel(); 
    if (A()) {
      if (this.y.getVisibility() != 0) {
        this.y.setAlpha(0.0F);
        this.y.setScaleY(0.0F);
        this.y.setScaleX(0.0F);
        c(0.0F);
      } 
      e.f.a.f.l.h h1 = this.p;
      if (h1 == null)
        h1 = y(); 
      AnimatorSet animatorSet = a(h1, 1.0F, 1.0F, 1.0F);
      animatorSet.addListener((Animator.AnimatorListener)new b(this, paramBoolean, paramj));
      ArrayList<Animator.AnimatorListener> arrayList = this.v;
      if (arrayList != null) {
        iterator = arrayList.iterator();
        while (iterator.hasNext())
          animatorSet.addListener(iterator.next()); 
      } 
      animatorSet.start();
      return;
    } 
    this.y.a(0, paramBoolean);
    this.y.setAlpha(1.0F);
    this.y.setScaleY(1.0F);
    this.y.setScaleX(1.0F);
    c(1.0F);
    if (iterator != null)
      iterator.a(); 
  }
  
  final void b(e.f.a.f.l.h paramh) {
    this.p = paramh;
  }
  
  void b(boolean paramBoolean) {
    this.g = paramBoolean;
    w();
  }
  
  final void c(float paramFloat) {
    this.s = paramFloat;
    Matrix matrix = this.D;
    a(paramFloat, matrix);
    this.y.setImageMatrix(matrix);
  }
  
  boolean c() {
    return this.f;
  }
  
  final e.f.a.f.l.h d() {
    return this.q;
  }
  
  final void d(float paramFloat) {
    if (this.j != paramFloat) {
      this.j = paramFloat;
      a(this.h, this.i, this.j);
    } 
  }
  
  float e() {
    return this.i;
  }
  
  void e(float paramFloat) {
    e.f.a.f.a0.g g1 = this.b;
    if (g1 != null)
      g1.a(paramFloat); 
  }
  
  float f() {
    return this.j;
  }
  
  final e.f.a.f.a0.k g() {
    return this.a;
  }
  
  final e.f.a.f.l.h h() {
    return this.p;
  }
  
  boolean i() {
    int i = this.y.getVisibility();
    boolean bool2 = false;
    boolean bool1 = false;
    if (i == 0) {
      if (this.u == 1)
        bool1 = true; 
      return bool1;
    } 
    bool1 = bool2;
    if (this.u != 2)
      bool1 = true; 
    return bool1;
  }
  
  boolean j() {
    int i = this.y.getVisibility();
    boolean bool2 = false;
    boolean bool1 = false;
    if (i != 0) {
      if (this.u == 2)
        bool1 = true; 
      return bool1;
    } 
    bool1 = bool2;
    if (this.u != 1)
      bool1 = true; 
    return bool1;
  }
  
  void k() {
    this.l.a();
  }
  
  void l() {
    e.f.a.f.a0.g g1 = this.b;
    if (g1 != null)
      e.f.a.f.a0.h.a((View)this.y, g1); 
    if (r())
      this.y.getViewTreeObserver().addOnPreDrawListener(z()); 
  }
  
  void m() {}
  
  void n() {
    ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
    ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
    if (onPreDrawListener != null) {
      viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
      this.E = null;
    } 
  }
  
  void o() {
    float f = this.y.getRotation();
    if (this.r != f) {
      this.r = f;
      u();
    } 
  }
  
  void p() {
    ArrayList<i> arrayList = this.x;
    if (arrayList != null) {
      Iterator<i> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ((i)iterator.next()).b(); 
    } 
  }
  
  void q() {
    ArrayList<i> arrayList = this.x;
    if (arrayList != null) {
      Iterator<i> iterator = arrayList.iterator();
      while (iterator.hasNext())
        ((i)iterator.next()).a(); 
    } 
  }
  
  boolean r() {
    return true;
  }
  
  boolean s() {
    return true;
  }
  
  final boolean t() {
    return (!this.f || this.y.getSizeDimension() >= this.k);
  }
  
  void u() {
    // Byte code:
    //   0: getstatic android/os/Build$VERSION.SDK_INT : I
    //   3: bipush #19
    //   5: if_icmpne -> 67
    //   8: aload_0
    //   9: getfield r : F
    //   12: ldc_w 90.0
    //   15: frem
    //   16: fconst_0
    //   17: fcmpl
    //   18: ifeq -> 44
    //   21: aload_0
    //   22: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   25: invokevirtual getLayerType : ()I
    //   28: istore_2
    //   29: iconst_1
    //   30: istore_1
    //   31: iload_2
    //   32: iconst_1
    //   33: if_icmpeq -> 67
    //   36: aload_0
    //   37: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   40: astore_3
    //   41: goto -> 61
    //   44: aload_0
    //   45: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   48: invokevirtual getLayerType : ()I
    //   51: ifeq -> 67
    //   54: aload_0
    //   55: getfield y : Lcom/google/android/material/floatingactionbutton/FloatingActionButton;
    //   58: astore_3
    //   59: iconst_0
    //   60: istore_1
    //   61: aload_3
    //   62: iload_1
    //   63: aconst_null
    //   64: invokevirtual setLayerType : (ILandroid/graphics/Paint;)V
    //   67: aload_0
    //   68: getfield b : Le/f/a/f/a0/g;
    //   71: astore_3
    //   72: aload_3
    //   73: ifnull -> 85
    //   76: aload_3
    //   77: aload_0
    //   78: getfield r : F
    //   81: f2i
    //   82: invokevirtual a : (I)V
    //   85: return
  }
  
  final void v() {
    c(this.s);
  }
  
  final void w() {
    Rect rect = this.A;
    a(rect);
    b(rect);
    this.z.a(rect.left, rect.top, rect.right, rect.bottom);
  }
  
  class a extends AnimatorListenerAdapter {
    private boolean a;
    
    a(b this$0, boolean param1Boolean, b.j param1j) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      b.a(this.d, 0);
      b.a(this.d, (Animator)null);
      if (!this.a) {
        byte b1;
        FloatingActionButton floatingActionButton = this.d.y;
        if (this.b) {
          b1 = 8;
        } else {
          b1 = 4;
        } 
        floatingActionButton.a(b1, this.b);
        b.j j1 = this.c;
        if (j1 != null)
          j1.b(); 
      } 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.d.y.a(0, this.b);
      b.a(this.d, 1);
      b.a(this.d, param1Animator);
      this.a = false;
    }
  }
  
  class b extends AnimatorListenerAdapter {
    b(b this$0, boolean param1Boolean, b.j param1j) {}
    
    public void onAnimationEnd(Animator param1Animator) {
      b.a(this.c, 0);
      b.a(this.c, (Animator)null);
      b.j j1 = this.b;
      if (j1 != null)
        j1.a(); 
    }
    
    public void onAnimationStart(Animator param1Animator) {
      this.c.y.a(0, this.a);
      b.a(this.c, 2);
      b.a(this.c, param1Animator);
    }
  }
  
  class c extends e.f.a.f.l.g {
    c(b this$0) {}
    
    public Matrix a(float param1Float, Matrix param1Matrix1, Matrix param1Matrix2) {
      b.a(this.d, param1Float);
      return super.a(param1Float, param1Matrix1, param1Matrix2);
    }
  }
  
  class d implements TypeEvaluator<Float> {
    FloatEvaluator a = new FloatEvaluator();
    
    d(b this$0) {}
    
    public Float a(float param1Float, Float param1Float1, Float param1Float2) {
      float f = this.a.evaluate(param1Float, param1Float1, param1Float2).floatValue();
      param1Float = f;
      if (f < 0.1F)
        param1Float = 0.0F; 
      return Float.valueOf(param1Float);
    }
  }
  
  class e implements ViewTreeObserver.OnPreDrawListener {
    e(b this$0) {}
    
    public boolean onPreDraw() {
      this.c.o();
      return true;
    }
  }
  
  private class f extends l {
    f(b this$0) {
      super(this$0, null);
    }
    
    protected float a() {
      return 0.0F;
    }
  }
  
  private class g extends l {
    g(b this$0) {
      super(this$0, null);
    }
    
    protected float a() {
      b b1 = this.e;
      return b1.h + b1.i;
    }
  }
  
  private class h extends l {
    h(b this$0) {
      super(this$0, null);
    }
    
    protected float a() {
      b b1 = this.e;
      return b1.h + b1.j;
    }
  }
  
  static interface i {
    void a();
    
    void b();
  }
  
  static interface j {
    void a();
    
    void b();
  }
  
  private class k extends l {
    k(b this$0) {
      super(this$0, null);
    }
    
    protected float a() {
      return this.e.h;
    }
  }
  
  private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    private boolean a;
    
    private float b;
    
    private float c;
    
    private l(b this$0) {}
    
    protected abstract float a();
    
    public void onAnimationEnd(Animator param1Animator) {
      this.d.e((int)this.c);
      this.a = false;
    }
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      if (!this.a) {
        float f1;
        e.f.a.f.a0.g g = this.d.b;
        if (g == null) {
          f1 = 0.0F;
        } else {
          f1 = g.e();
        } 
        this.b = f1;
        this.c = a();
        this.a = true;
      } 
      b b1 = this.d;
      float f = this.b;
      b1.e((int)(f + (this.c - f) * param1ValueAnimator.getAnimatedFraction()));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/floatingactionbutton/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */