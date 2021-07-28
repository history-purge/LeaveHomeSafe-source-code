package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import android.view.View;
import b.g.m.v;

class d extends RecyclerView.n implements RecyclerView.s {
  private static final int[] D = new int[] { 16842919 };
  
  private static final int[] E = new int[0];
  
  int A = 0;
  
  private final Runnable B = new a(this);
  
  private final RecyclerView.t C = new b(this);
  
  private final int a;
  
  private final int b;
  
  final StateListDrawable c;
  
  final Drawable d;
  
  private final int e;
  
  private final int f;
  
  private final StateListDrawable g;
  
  private final Drawable h;
  
  private final int i;
  
  private final int j;
  
  int k;
  
  int l;
  
  float m;
  
  int n;
  
  int o;
  
  float p;
  
  private int q = 0;
  
  private int r = 0;
  
  private RecyclerView s;
  
  private boolean t = false;
  
  private boolean u = false;
  
  private int v = 0;
  
  private int w = 0;
  
  private final int[] x = new int[2];
  
  private final int[] y = new int[2];
  
  final ValueAnimator z = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
  
  d(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3) {
    this.c = paramStateListDrawable1;
    this.d = paramDrawable1;
    this.g = paramStateListDrawable2;
    this.h = paramDrawable2;
    this.e = Math.max(paramInt1, paramStateListDrawable1.getIntrinsicWidth());
    this.f = Math.max(paramInt1, paramDrawable1.getIntrinsicWidth());
    this.i = Math.max(paramInt1, paramStateListDrawable2.getIntrinsicWidth());
    this.j = Math.max(paramInt1, paramDrawable2.getIntrinsicWidth());
    this.a = paramInt2;
    this.b = paramInt3;
    this.c.setAlpha(255);
    this.d.setAlpha(255);
    this.z.addListener((Animator.AnimatorListener)new c(this));
    this.z.addUpdateListener(new d(this));
    a(paramRecyclerView);
  }
  
  private int a(float paramFloat1, float paramFloat2, int[] paramArrayOfint, int paramInt1, int paramInt2, int paramInt3) {
    int i = paramArrayOfint[1] - paramArrayOfint[0];
    if (i == 0)
      return 0; 
    paramFloat1 = (paramFloat2 - paramFloat1) / i;
    paramInt1 -= paramInt3;
    paramInt3 = (int)(paramFloat1 * paramInt1);
    paramInt2 += paramInt3;
    return (paramInt2 < paramInt1 && paramInt2 >= 0) ? paramInt3 : 0;
  }
  
  private void a(float paramFloat) {
    int[] arrayOfInt = e();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(this.o - paramFloat) < 2.0F)
      return; 
    int i = a(this.p, paramFloat, arrayOfInt, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
    if (i != 0)
      this.s.scrollBy(i, 0); 
    this.p = paramFloat;
  }
  
  private void a(Canvas paramCanvas) {
    int j = this.r;
    int i = this.i;
    j -= i;
    int m = this.o;
    int k = this.n;
    m -= k / 2;
    this.g.setBounds(0, 0, k, i);
    this.h.setBounds(0, 0, this.q, this.j);
    paramCanvas.translate(0.0F, j);
    this.h.draw(paramCanvas);
    paramCanvas.translate(m, 0.0F);
    this.g.draw(paramCanvas);
    paramCanvas.translate(-m, -j);
  }
  
  private void b(float paramFloat) {
    int[] arrayOfInt = f();
    paramFloat = Math.max(arrayOfInt[0], Math.min(arrayOfInt[1], paramFloat));
    if (Math.abs(this.l - paramFloat) < 2.0F)
      return; 
    int i = a(this.m, paramFloat, arrayOfInt, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
    if (i != 0)
      this.s.scrollBy(0, i); 
    this.m = paramFloat;
  }
  
  private void b(Canvas paramCanvas) {
    int i = this.q;
    int j = this.e;
    i -= j;
    int k = this.l;
    int m = this.k;
    k -= m / 2;
    this.c.setBounds(0, 0, j, m);
    this.d.setBounds(0, 0, this.f, this.r);
    if (g()) {
      this.d.draw(paramCanvas);
      paramCanvas.translate(this.e, k);
      paramCanvas.scale(-1.0F, 1.0F);
      this.c.draw(paramCanvas);
      paramCanvas.scale(1.0F, 1.0F);
      i = this.e;
    } else {
      paramCanvas.translate(i, 0.0F);
      this.d.draw(paramCanvas);
      paramCanvas.translate(0.0F, k);
      this.c.draw(paramCanvas);
    } 
    paramCanvas.translate(-i, -k);
  }
  
  private void c() {
    this.s.removeCallbacks(this.B);
  }
  
  private void c(int paramInt) {
    c();
    this.s.postDelayed(this.B, paramInt);
  }
  
  private void d() {
    this.s.removeItemDecoration(this);
    this.s.removeOnItemTouchListener(this);
    this.s.removeOnScrollListener(this.C);
    c();
  }
  
  private int[] e() {
    int[] arrayOfInt = this.y;
    int i = this.b;
    arrayOfInt[0] = i;
    arrayOfInt[1] = this.q - i;
    return arrayOfInt;
  }
  
  private int[] f() {
    int[] arrayOfInt = this.x;
    int i = this.b;
    arrayOfInt[0] = i;
    arrayOfInt[1] = this.r - i;
    return arrayOfInt;
  }
  
  private boolean g() {
    return (v.p((View)this.s) == 1);
  }
  
  private void h() {
    this.s.addItemDecoration(this);
    this.s.addOnItemTouchListener(this);
    this.s.addOnScrollListener(this.C);
  }
  
  void a() {
    this.s.invalidate();
  }
  
  void a(int paramInt) {
    int i = this.A;
    if (i != 1) {
      if (i != 2)
        return; 
    } else {
      this.z.cancel();
    } 
    this.A = 3;
    ValueAnimator valueAnimator = this.z;
    valueAnimator.setFloatValues(new float[] { ((Float)valueAnimator.getAnimatedValue()).floatValue(), 0.0F });
    this.z.setDuration(paramInt);
    this.z.start();
  }
  
  void a(int paramInt1, int paramInt2) {
    boolean bool;
    int i = this.s.computeVerticalScrollRange();
    int j = this.r;
    if (i - j > 0 && j >= this.a) {
      bool = true;
    } else {
      bool = false;
    } 
    this.t = bool;
    int k = this.s.computeHorizontalScrollRange();
    int m = this.q;
    if (k - m > 0 && m >= this.a) {
      bool = true;
    } else {
      bool = false;
    } 
    this.u = bool;
    if (!this.t && !this.u) {
      if (this.v != 0)
        b(0); 
      return;
    } 
    if (this.t) {
      float f1 = paramInt2;
      float f2 = j;
      this.l = (int)(f2 * (f1 + f2 / 2.0F) / i);
      this.k = Math.min(j, j * j / i);
    } 
    if (this.u) {
      float f1 = paramInt1;
      float f2 = m;
      this.o = (int)(f2 * (f1 + f2 / 2.0F) / k);
      this.n = Math.min(m, m * m / k);
    } 
    paramInt1 = this.v;
    if (paramInt1 == 0 || paramInt1 == 1)
      b(1); 
  }
  
  public void a(RecyclerView paramRecyclerView) {
    RecyclerView recyclerView = this.s;
    if (recyclerView == paramRecyclerView)
      return; 
    if (recyclerView != null)
      d(); 
    this.s = paramRecyclerView;
    if (this.s != null)
      h(); 
  }
  
  public void a(boolean paramBoolean) {}
  
  boolean a(float paramFloat1, float paramFloat2) {
    if (paramFloat2 >= (this.r - this.i)) {
      int i = this.o;
      int j = this.n;
      if (paramFloat1 >= (i - j / 2) && paramFloat1 <= (i + j / 2))
        return true; 
    } 
    return false;
  }
  
  public boolean a(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield v : I
    //   4: istore_3
    //   5: iconst_0
    //   6: istore #5
    //   8: iload_3
    //   9: iconst_1
    //   10: if_icmpne -> 117
    //   13: aload_0
    //   14: aload_2
    //   15: invokevirtual getX : ()F
    //   18: aload_2
    //   19: invokevirtual getY : ()F
    //   22: invokevirtual b : (FF)Z
    //   25: istore #6
    //   27: aload_0
    //   28: aload_2
    //   29: invokevirtual getX : ()F
    //   32: aload_2
    //   33: invokevirtual getY : ()F
    //   36: invokevirtual a : (FF)Z
    //   39: istore #7
    //   41: iload #5
    //   43: istore #4
    //   45: aload_2
    //   46: invokevirtual getAction : ()I
    //   49: ifne -> 129
    //   52: iload #6
    //   54: ifne -> 66
    //   57: iload #5
    //   59: istore #4
    //   61: iload #7
    //   63: ifeq -> 129
    //   66: iload #7
    //   68: ifeq -> 89
    //   71: aload_0
    //   72: iconst_1
    //   73: putfield w : I
    //   76: aload_0
    //   77: aload_2
    //   78: invokevirtual getX : ()F
    //   81: f2i
    //   82: i2f
    //   83: putfield p : F
    //   86: goto -> 109
    //   89: iload #6
    //   91: ifeq -> 109
    //   94: aload_0
    //   95: iconst_2
    //   96: putfield w : I
    //   99: aload_0
    //   100: aload_2
    //   101: invokevirtual getY : ()F
    //   104: f2i
    //   105: i2f
    //   106: putfield m : F
    //   109: aload_0
    //   110: iconst_2
    //   111: invokevirtual b : (I)V
    //   114: goto -> 126
    //   117: iload #5
    //   119: istore #4
    //   121: iload_3
    //   122: iconst_2
    //   123: if_icmpne -> 129
    //   126: iconst_1
    //   127: istore #4
    //   129: iload #4
    //   131: ireturn
  }
  
  public void b() {
    int i = this.A;
    if (i != 0) {
      if (i != 3)
        return; 
      this.z.cancel();
    } 
    this.A = 1;
    ValueAnimator valueAnimator = this.z;
    valueAnimator.setFloatValues(new float[] { ((Float)valueAnimator.getAnimatedValue()).floatValue(), 1.0F });
    this.z.setDuration(500L);
    this.z.setStartDelay(0L);
    this.z.start();
  }
  
  void b(int paramInt) {
    // Byte code:
    //   0: iload_1
    //   1: iconst_2
    //   2: if_icmpne -> 28
    //   5: aload_0
    //   6: getfield v : I
    //   9: iconst_2
    //   10: if_icmpeq -> 28
    //   13: aload_0
    //   14: getfield c : Landroid/graphics/drawable/StateListDrawable;
    //   17: getstatic androidx/recyclerview/widget/d.D : [I
    //   20: invokevirtual setState : ([I)Z
    //   23: pop
    //   24: aload_0
    //   25: invokespecial c : ()V
    //   28: iload_1
    //   29: ifne -> 39
    //   32: aload_0
    //   33: invokevirtual a : ()V
    //   36: goto -> 43
    //   39: aload_0
    //   40: invokevirtual b : ()V
    //   43: aload_0
    //   44: getfield v : I
    //   47: iconst_2
    //   48: if_icmpne -> 74
    //   51: iload_1
    //   52: iconst_2
    //   53: if_icmpeq -> 74
    //   56: aload_0
    //   57: getfield c : Landroid/graphics/drawable/StateListDrawable;
    //   60: getstatic androidx/recyclerview/widget/d.E : [I
    //   63: invokevirtual setState : ([I)Z
    //   66: pop
    //   67: sipush #1200
    //   70: istore_2
    //   71: goto -> 83
    //   74: iload_1
    //   75: iconst_1
    //   76: if_icmpne -> 88
    //   79: sipush #1500
    //   82: istore_2
    //   83: aload_0
    //   84: iload_2
    //   85: invokespecial c : (I)V
    //   88: aload_0
    //   89: iload_1
    //   90: putfield v : I
    //   93: return
  }
  
  public void b(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.a0 parama0) {
    if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
      this.q = this.s.getWidth();
      this.r = this.s.getHeight();
      b(0);
      return;
    } 
    if (this.A != 0) {
      if (this.t)
        b(paramCanvas); 
      if (this.u)
        a(paramCanvas); 
    } 
  }
  
  public void b(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent) {
    if (this.v == 0)
      return; 
    if (paramMotionEvent.getAction() == 0) {
      boolean bool1 = b(paramMotionEvent.getX(), paramMotionEvent.getY());
      boolean bool2 = a(paramMotionEvent.getX(), paramMotionEvent.getY());
      if (bool1 || bool2) {
        if (bool2) {
          this.w = 1;
          this.p = (int)paramMotionEvent.getX();
        } else if (bool1) {
          this.w = 2;
          this.m = (int)paramMotionEvent.getY();
        } 
        b(2);
        return;
      } 
    } else {
      if (paramMotionEvent.getAction() == 1 && this.v == 2) {
        this.m = 0.0F;
        this.p = 0.0F;
        b(1);
        this.w = 0;
        return;
      } 
      if (paramMotionEvent.getAction() == 2 && this.v == 2) {
        b();
        if (this.w == 1)
          a(paramMotionEvent.getX()); 
        if (this.w == 2)
          b(paramMotionEvent.getY()); 
      } 
    } 
  }
  
  boolean b(float paramFloat1, float paramFloat2) {
    if (g() ? (paramFloat1 <= (this.e / 2)) : (paramFloat1 >= (this.q - this.e))) {
      int i = this.l;
      int j = this.k;
      if (paramFloat2 >= (i - j / 2) && paramFloat2 <= (i + j / 2))
        return true; 
    } 
    return false;
  }
  
  class a implements Runnable {
    a(d this$0) {}
    
    public void run() {
      this.c.a(500);
    }
  }
  
  class b extends RecyclerView.t {
    b(d this$0) {}
    
    public void a(RecyclerView param1RecyclerView, int param1Int1, int param1Int2) {
      this.a.a(param1RecyclerView.computeHorizontalScrollOffset(), param1RecyclerView.computeVerticalScrollOffset());
    }
  }
  
  private class c extends AnimatorListenerAdapter {
    private boolean a = false;
    
    c(d this$0) {}
    
    public void onAnimationCancel(Animator param1Animator) {
      this.a = true;
    }
    
    public void onAnimationEnd(Animator param1Animator) {
      if (this.a) {
        this.a = false;
        return;
      } 
      if (((Float)this.b.z.getAnimatedValue()).floatValue() == 0.0F) {
        d d2 = this.b;
        d2.A = 0;
        d2.b(0);
        return;
      } 
      d d1 = this.b;
      d1.A = 2;
      d1.a();
    }
  }
  
  private class d implements ValueAnimator.AnimatorUpdateListener {
    d(d this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      int i = (int)(((Float)param1ValueAnimator.getAnimatedValue()).floatValue() * 255.0F);
      this.a.c.setAlpha(i);
      this.a.d.setAlpha(i);
      this.a.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/recyclerview/widget/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */