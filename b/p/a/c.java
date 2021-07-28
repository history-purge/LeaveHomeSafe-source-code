package b.p.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import b.g.m.l;
import b.g.m.m;
import b.g.m.p;
import b.g.m.q;
import b.g.m.v;

public class c extends ViewGroup implements p, l {
  private static final String Q = c.class.getSimpleName();
  
  private static final int[] R = new int[] { 16842766 };
  
  protected int A;
  
  int B;
  
  int C;
  
  b D;
  
  private Animation E;
  
  private Animation F;
  
  private Animation G;
  
  private Animation H;
  
  private Animation I;
  
  boolean J;
  
  private int K;
  
  boolean L;
  
  private i M;
  
  private Animation.AnimationListener N = new a(this);
  
  private final Animation O = new f(this);
  
  private final Animation P = new g(this);
  
  private View c;
  
  j d;
  
  boolean e = false;
  
  private int f;
  
  private float g = -1.0F;
  
  private float h;
  
  private final q i;
  
  private final m j;
  
  private final int[] k = new int[2];
  
  private final int[] l = new int[2];
  
  private boolean m;
  
  private int n;
  
  int o;
  
  private float p;
  
  private float q;
  
  private boolean r;
  
  private int s = -1;
  
  boolean t;
  
  private boolean u;
  
  private final DecelerateInterpolator v;
  
  a w;
  
  private int x = -1;
  
  protected int y;
  
  float z;
  
  public c(Context paramContext) {
    this(paramContext, null);
  }
  
  public c(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    this.f = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.n = getResources().getInteger(17694721);
    setWillNotDraw(false);
    this.v = new DecelerateInterpolator(2.0F);
    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    this.K = (int)(displayMetrics.density * 40.0F);
    c();
    setChildrenDrawingOrderEnabled(true);
    this.B = (int)(displayMetrics.density * 64.0F);
    this.g = this.B;
    this.i = new q(this);
    this.j = new m((View)this);
    setNestedScrollingEnabled(true);
    int k = -this.K;
    this.o = k;
    this.A = k;
    a(1.0F);
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R);
    setEnabled(typedArray.getBoolean(0, true));
    typedArray.recycle();
  }
  
  private Animation a(int paramInt1, int paramInt2) {
    d d = new d(this, paramInt1, paramInt2);
    d.setDuration(300L);
    this.w.a(null);
    this.w.clearAnimation();
    this.w.startAnimation(d);
    return d;
  }
  
  private void a(int paramInt, Animation.AnimationListener paramAnimationListener) {
    this.y = paramInt;
    this.O.reset();
    this.O.setDuration(200L);
    this.O.setInterpolator((Interpolator)this.v);
    if (paramAnimationListener != null)
      this.w.a(paramAnimationListener); 
    this.w.clearAnimation();
    this.w.startAnimation(this.O);
  }
  
  private void a(MotionEvent paramMotionEvent) {
    int k = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(k) == this.s) {
      if (k == 0) {
        k = 1;
      } else {
        k = 0;
      } 
      this.s = paramMotionEvent.getPointerId(k);
    } 
  }
  
  private void a(boolean paramBoolean1, boolean paramBoolean2) {
    if (this.e != paramBoolean1) {
      this.J = paramBoolean2;
      d();
      this.e = paramBoolean1;
      if (this.e) {
        a(this.o, this.N);
        return;
      } 
      a(this.N);
    } 
  }
  
  private boolean a(Animation paramAnimation) {
    return (paramAnimation != null && paramAnimation.hasStarted() && !paramAnimation.hasEnded());
  }
  
  private void b(float paramFloat) {
    if (paramFloat > this.g) {
      a(true, true);
      return;
    } 
    this.e = false;
    this.D.a(0.0F, 0.0F);
    e e = null;
    if (!this.t)
      e = new e(this); 
    b(this.o, e);
    this.D.a(false);
  }
  
  private void b(int paramInt, Animation.AnimationListener paramAnimationListener) {
    if (this.t) {
      c(paramInt, paramAnimationListener);
      return;
    } 
    this.y = paramInt;
    this.P.reset();
    this.P.setDuration(200L);
    this.P.setInterpolator((Interpolator)this.v);
    if (paramAnimationListener != null)
      this.w.a(paramAnimationListener); 
    this.w.clearAnimation();
    this.w.startAnimation(this.P);
  }
  
  private void b(Animation.AnimationListener paramAnimationListener) {
    this.w.setVisibility(0);
    this.D.setAlpha(255);
    this.E = new b(this);
    this.E.setDuration(this.n);
    if (paramAnimationListener != null)
      this.w.a(paramAnimationListener); 
    this.w.clearAnimation();
    this.w.startAnimation(this.E);
  }
  
  private void c() {
    this.w = new a(getContext(), -328966);
    this.D = new b(getContext());
    this.D.a(1);
    this.w.setImageDrawable(this.D);
    this.w.setVisibility(8);
    addView((View)this.w);
  }
  
  private void c(float paramFloat) {
    this.D.a(true);
    float f1 = Math.min(1.0F, Math.abs(paramFloat / this.g));
    double d1 = f1;
    Double.isNaN(d1);
    float f2 = (float)Math.max(d1 - 0.4D, 0.0D) * 5.0F / 3.0F;
    float f4 = Math.abs(paramFloat);
    float f5 = this.g;
    int k = this.C;
    if (k <= 0)
      if (this.L) {
        k = this.B - this.A;
      } else {
        k = this.B;
      }  
    float f3 = k;
    d1 = (Math.max(0.0F, Math.min(f4 - f5, f3 * 2.0F) / f3) / 4.0F);
    double d2 = Math.pow(d1, 2.0D);
    Double.isNaN(d1);
    f4 = (float)(d1 - d2) * 2.0F;
    k = this.A;
    int n = (int)(f3 * f1 + f3 * f4 * 2.0F);
    if (this.w.getVisibility() != 0)
      this.w.setVisibility(0); 
    if (!this.t) {
      this.w.setScaleX(1.0F);
      this.w.setScaleY(1.0F);
    } 
    if (this.t)
      setAnimationProgress(Math.min(1.0F, paramFloat / this.g)); 
    if (paramFloat < this.g) {
      if (this.D.getAlpha() > 76 && !a(this.G))
        f(); 
    } else if (this.D.getAlpha() < 255 && !a(this.H)) {
      e();
    } 
    this.D.a(0.0F, Math.min(0.8F, f2 * 0.8F));
    this.D.a(Math.min(1.0F, f2));
    this.D.b((f2 * 0.4F - 0.25F + f4 * 2.0F) * 0.5F);
    setTargetOffsetTopAndBottom(k + n - this.o);
  }
  
  private void c(int paramInt, Animation.AnimationListener paramAnimationListener) {
    this.y = paramInt;
    this.z = this.w.getScaleX();
    this.I = new h(this);
    this.I.setDuration(150L);
    if (paramAnimationListener != null)
      this.w.a(paramAnimationListener); 
    this.w.clearAnimation();
    this.w.startAnimation(this.I);
  }
  
  private void d() {
    if (this.c == null)
      for (int k = 0; k < getChildCount(); k++) {
        View view = getChildAt(k);
        if (!view.equals(this.w)) {
          this.c = view;
          return;
        } 
      }  
  }
  
  private void d(float paramFloat) {
    float f = this.q;
    int k = this.f;
    if (paramFloat - f > k && !this.r) {
      this.p = f + k;
      this.r = true;
      this.D.setAlpha(76);
    } 
  }
  
  private void e() {
    this.H = a(this.D.getAlpha(), 255);
  }
  
  private void f() {
    this.G = a(this.D.getAlpha(), 76);
  }
  
  private void setColorViewAlpha(int paramInt) {
    this.w.getBackground().setAlpha(paramInt);
    this.D.setAlpha(paramInt);
  }
  
  void a(float paramFloat) {
    int k = this.y;
    setTargetOffsetTopAndBottom(k + (int)((this.A - k) * paramFloat) - this.w.getTop());
  }
  
  void a(Animation.AnimationListener paramAnimationListener) {
    this.F = new c(this);
    this.F.setDuration(150L);
    this.w.a(paramAnimationListener);
    this.w.clearAnimation();
    this.w.startAnimation(this.F);
  }
  
  public void a(boolean paramBoolean, int paramInt1, int paramInt2) {
    this.t = paramBoolean;
    this.A = paramInt1;
    this.B = paramInt2;
    this.L = true;
    b();
    this.e = false;
  }
  
  public boolean a() {
    i i1 = this.M;
    if (i1 != null)
      return i1.a(this, this.c); 
    View view = this.c;
    return (view instanceof ListView) ? androidx.core.widget.g.a((ListView)view, -1) : view.canScrollVertically(-1);
  }
  
  void b() {
    this.w.clearAnimation();
    this.D.stop();
    this.w.setVisibility(8);
    setColorViewAlpha(255);
    if (this.t) {
      setAnimationProgress(0.0F);
    } else {
      setTargetOffsetTopAndBottom(this.A - this.o);
    } 
    this.o = this.w.getTop();
  }
  
  public boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return this.j.a(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2) {
    return this.j.a(paramFloat1, paramFloat2);
  }
  
  public boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    return this.j.a(paramInt1, paramInt2, paramArrayOfint1, paramArrayOfint2);
  }
  
  public boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    return this.j.a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfint);
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2) {
    int k = this.x;
    if (k < 0)
      return paramInt2; 
    if (paramInt2 == paramInt1 - 1)
      return k; 
    paramInt1 = paramInt2;
    if (paramInt2 >= k)
      paramInt1 = paramInt2 + 1; 
    return paramInt1;
  }
  
  public int getNestedScrollAxes() {
    return this.i.a();
  }
  
  public int getProgressCircleDiameter() {
    return this.K;
  }
  
  public int getProgressViewEndOffset() {
    return this.B;
  }
  
  public int getProgressViewStartOffset() {
    return this.A;
  }
  
  public boolean hasNestedScrollingParent() {
    return this.j.a();
  }
  
  public boolean isNestedScrollingEnabled() {
    return this.j.b();
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    b();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    d();
    int k = paramMotionEvent.getActionMasked();
    if (this.u && k == 0)
      this.u = false; 
    if (isEnabled() && !this.u && !a() && !this.e) {
      if (this.m)
        return false; 
      if (k != 0) {
        if (k != 1)
          if (k != 2) {
            if (k != 3) {
              if (k == 6)
                a(paramMotionEvent); 
              return this.r;
            } 
          } else {
            k = this.s;
            if (k == -1) {
              Log.e(Q, "Got ACTION_MOVE event but don't have an active pointer id.");
              return false;
            } 
            k = paramMotionEvent.findPointerIndex(k);
            if (k < 0)
              return false; 
            d(paramMotionEvent.getY(k));
            return this.r;
          }  
        this.r = false;
        this.s = -1;
      } else {
        setTargetOffsetTopAndBottom(this.A - this.w.getTop());
        this.s = paramMotionEvent.getPointerId(0);
        this.r = false;
        k = paramMotionEvent.findPointerIndex(this.s);
        if (k < 0)
          return false; 
        this.q = paramMotionEvent.getY(k);
      } 
      return this.r;
    } 
    return false;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt1 = getMeasuredWidth();
    paramInt2 = getMeasuredHeight();
    if (getChildCount() == 0)
      return; 
    if (this.c == null)
      d(); 
    View view = this.c;
    if (view == null)
      return; 
    paramInt3 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    view.layout(paramInt3, paramInt4, paramInt1 - getPaddingLeft() - getPaddingRight() + paramInt3, paramInt2 - getPaddingTop() - getPaddingBottom() + paramInt4);
    paramInt3 = this.w.getMeasuredWidth();
    paramInt2 = this.w.getMeasuredHeight();
    a a1 = this.w;
    paramInt1 /= 2;
    paramInt3 /= 2;
    paramInt4 = this.o;
    a1.layout(paramInt1 - paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
  }
  
  public void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    if (this.c == null)
      d(); 
    View view = this.c;
    if (view == null)
      return; 
    view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), 1073741824));
    this.w.measure(View.MeasureSpec.makeMeasureSpec(this.K, 1073741824), View.MeasureSpec.makeMeasureSpec(this.K, 1073741824));
    this.x = -1;
    for (paramInt1 = 0; paramInt1 < getChildCount(); paramInt1++) {
      if (getChildAt(paramInt1) == this.w) {
        this.x = paramInt1;
        return;
      } 
    } 
  }
  
  public boolean onNestedFling(View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean) {
    return dispatchNestedFling(paramFloat1, paramFloat2, paramBoolean);
  }
  
  public boolean onNestedPreFling(View paramView, float paramFloat1, float paramFloat2) {
    return dispatchNestedPreFling(paramFloat1, paramFloat2);
  }
  
  public void onNestedPreScroll(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfint) {
    if (paramInt2 > 0) {
      float f = this.h;
      if (f > 0.0F) {
        float f1 = paramInt2;
        if (f1 > f) {
          paramArrayOfint[1] = paramInt2 - (int)f;
          this.h = 0.0F;
        } else {
          this.h = f - f1;
          paramArrayOfint[1] = paramInt2;
        } 
        c(this.h);
      } 
    } 
    if (this.L && paramInt2 > 0 && this.h == 0.0F && Math.abs(paramInt2 - paramArrayOfint[1]) > 0)
      this.w.setVisibility(8); 
    int[] arrayOfInt = this.k;
    if (dispatchNestedPreScroll(paramInt1 - paramArrayOfint[0], paramInt2 - paramArrayOfint[1], arrayOfInt, null)) {
      paramArrayOfint[0] = paramArrayOfint[0] + arrayOfInt[0];
      paramArrayOfint[1] = paramArrayOfint[1] + arrayOfInt[1];
    } 
  }
  
  public void onNestedScroll(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    dispatchNestedScroll(paramInt1, paramInt2, paramInt3, paramInt4, this.l);
    paramInt1 = paramInt4 + this.l[1];
    if (paramInt1 < 0 && !a()) {
      this.h += Math.abs(paramInt1);
      c(this.h);
    } 
  }
  
  public void onNestedScrollAccepted(View paramView1, View paramView2, int paramInt) {
    this.i.a(paramView1, paramView2, paramInt);
    startNestedScroll(paramInt & 0x2);
    this.h = 0.0F;
    this.m = true;
  }
  
  public boolean onStartNestedScroll(View paramView1, View paramView2, int paramInt) {
    return (isEnabled() && !this.u && !this.e && (paramInt & 0x2) != 0);
  }
  
  public void onStopNestedScroll(View paramView) {
    this.i.a(paramView);
    this.m = false;
    float f = this.h;
    if (f > 0.0F) {
      b(f);
      this.h = 0.0F;
    } 
    stopNestedScroll();
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    int k = paramMotionEvent.getActionMasked();
    if (this.u && k == 0)
      this.u = false; 
    if (isEnabled() && !this.u && !a() && !this.e) {
      if (this.m)
        return false; 
      if (k != 0) {
        if (k != 1) {
          if (k != 2) {
            if (k != 3) {
              if (k != 5) {
                if (k != 6)
                  return true; 
                a(paramMotionEvent);
                return true;
              } 
              k = paramMotionEvent.getActionIndex();
              if (k < 0) {
                Log.e(Q, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                return false;
              } 
              this.s = paramMotionEvent.getPointerId(k);
              return true;
            } 
            return false;
          } 
          k = paramMotionEvent.findPointerIndex(this.s);
          if (k < 0) {
            Log.e(Q, "Got ACTION_MOVE event but have an invalid active pointer id.");
            return false;
          } 
          float f = paramMotionEvent.getY(k);
          d(f);
          if (this.r) {
            f = (f - this.p) * 0.5F;
            if (f > 0.0F) {
              c(f);
              return true;
            } 
            return false;
          } 
        } else {
          k = paramMotionEvent.findPointerIndex(this.s);
          if (k < 0) {
            Log.e(Q, "Got ACTION_UP event but don't have an active pointer id.");
            return false;
          } 
          if (this.r) {
            float f1 = paramMotionEvent.getY(k);
            float f2 = this.p;
            this.r = false;
            b((f1 - f2) * 0.5F);
          } 
          this.s = -1;
          return false;
        } 
      } else {
        this.s = paramMotionEvent.getPointerId(0);
        this.r = false;
      } 
      return true;
    } 
    return false;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    if (Build.VERSION.SDK_INT >= 21 || !(this.c instanceof android.widget.AbsListView)) {
      View view = this.c;
      if (view != null && !v.J(view))
        return; 
      super.requestDisallowInterceptTouchEvent(paramBoolean);
    } 
  }
  
  void setAnimationProgress(float paramFloat) {
    this.w.setScaleX(paramFloat);
    this.w.setScaleY(paramFloat);
  }
  
  @Deprecated
  public void setColorScheme(int... paramVarArgs) {
    setColorSchemeResources(paramVarArgs);
  }
  
  public void setColorSchemeColors(int... paramVarArgs) {
    d();
    this.D.a(paramVarArgs);
  }
  
  public void setColorSchemeResources(int... paramVarArgs) {
    Context context = getContext();
    int[] arrayOfInt = new int[paramVarArgs.length];
    for (int k = 0; k < paramVarArgs.length; k++)
      arrayOfInt[k] = b.g.e.a.a(context, paramVarArgs[k]); 
    setColorSchemeColors(arrayOfInt);
  }
  
  public void setDistanceToTriggerSync(int paramInt) {
    this.g = paramInt;
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    if (!paramBoolean)
      b(); 
  }
  
  public void setNestedScrollingEnabled(boolean paramBoolean) {
    this.j.a(paramBoolean);
  }
  
  public void setOnChildScrollUpCallback(i parami) {
    this.M = parami;
  }
  
  public void setOnRefreshListener(j paramj) {
    this.d = paramj;
  }
  
  @Deprecated
  public void setProgressBackgroundColor(int paramInt) {
    setProgressBackgroundColorSchemeResource(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeColor(int paramInt) {
    this.w.setBackgroundColor(paramInt);
  }
  
  public void setProgressBackgroundColorSchemeResource(int paramInt) {
    setProgressBackgroundColorSchemeColor(b.g.e.a.a(getContext(), paramInt));
  }
  
  public void setRefreshing(boolean paramBoolean) {
    if (paramBoolean && this.e != paramBoolean) {
      int k;
      this.e = paramBoolean;
      if (!this.L) {
        k = this.B + this.A;
      } else {
        k = this.B;
      } 
      setTargetOffsetTopAndBottom(k - this.o);
      this.J = false;
      b(this.N);
      return;
    } 
    a(paramBoolean, false);
  }
  
  public void setSize(int paramInt) {
    float f;
    if (paramInt != 0 && paramInt != 1)
      return; 
    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
    if (paramInt == 0) {
      f = 56.0F;
    } else {
      f = 40.0F;
    } 
    this.K = (int)(displayMetrics.density * f);
    this.w.setImageDrawable(null);
    this.D.a(paramInt);
    this.w.setImageDrawable(this.D);
  }
  
  public void setSlingshotDistance(int paramInt) {
    this.C = paramInt;
  }
  
  void setTargetOffsetTopAndBottom(int paramInt) {
    this.w.bringToFront();
    v.e((View)this.w, paramInt);
    this.o = this.w.getTop();
  }
  
  public boolean startNestedScroll(int paramInt) {
    return this.j.b(paramInt);
  }
  
  public void stopNestedScroll() {
    this.j.c();
  }
  
  class a implements Animation.AnimationListener {
    a(c this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      c c1 = this.a;
      if (c1.e) {
        c1.D.setAlpha(255);
        this.a.D.start();
        c1 = this.a;
        if (c1.J) {
          c.j j = c1.d;
          if (j != null)
            j.a(); 
        } 
        c1 = this.a;
        c1.o = c1.w.getTop();
        return;
      } 
      c1.b();
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class b extends Animation {
    b(c this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      this.c.setAnimationProgress(param1Float);
    }
  }
  
  class c extends Animation {
    c(c this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      this.c.setAnimationProgress(1.0F - param1Float);
    }
  }
  
  class d extends Animation {
    d(c this$0, int param1Int1, int param1Int2) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      b b = this.e.D;
      int i = this.c;
      b.setAlpha((int)(i + (this.d - i) * param1Float));
    }
  }
  
  class e implements Animation.AnimationListener {
    e(c this$0) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      c c1 = this.a;
      if (!c1.t)
        c1.a((Animation.AnimationListener)null); 
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
  
  class f extends Animation {
    f(c this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      c c1 = this.c;
      if (!c1.L) {
        i = c1.B - Math.abs(c1.A);
      } else {
        i = c1.B;
      } 
      c1 = this.c;
      int j = c1.y;
      int i = (int)((i - j) * param1Float);
      int k = c1.w.getTop();
      this.c.setTargetOffsetTopAndBottom(j + i - k);
      this.c.D.a(1.0F - param1Float);
    }
  }
  
  class g extends Animation {
    g(c this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      this.c.a(param1Float);
    }
  }
  
  class h extends Animation {
    h(c this$0) {}
    
    public void applyTransformation(float param1Float, Transformation param1Transformation) {
      c c1 = this.c;
      float f = c1.z;
      c1.setAnimationProgress(f + -f * param1Float);
      this.c.a(param1Float);
    }
  }
  
  public static interface i {
    boolean a(c param1c, View param1View);
  }
  
  public static interface j {
    void a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/p/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */