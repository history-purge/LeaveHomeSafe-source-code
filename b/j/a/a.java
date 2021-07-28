package b.j.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import b.g.m.v;
import java.util.ArrayList;
import java.util.List;

public class a extends ViewGroup {
  private static final int[] M = new int[] { 16843828 };
  
  static final int[] N = new int[] { 16842931 };
  
  static final boolean O;
  
  private static final boolean P;
  
  private Drawable A;
  
  private CharSequence B;
  
  private CharSequence C;
  
  private Object D;
  
  private boolean E;
  
  private Drawable F = null;
  
  private Drawable G = null;
  
  private Drawable H = null;
  
  private Drawable I = null;
  
  private final ArrayList<View> J;
  
  private Rect K;
  
  private Matrix L;
  
  private final c c = new c();
  
  private float d;
  
  private int e;
  
  private int f = -1728053248;
  
  private float g;
  
  private Paint h = new Paint();
  
  private final b.i.b.c i;
  
  private final b.i.b.c j;
  
  private final g k;
  
  private final g l;
  
  private int m;
  
  private boolean n;
  
  private boolean o = true;
  
  private int p = 3;
  
  private int q = 3;
  
  private int r = 3;
  
  private int s = 3;
  
  private boolean t;
  
  private d u;
  
  private List<d> v;
  
  private float w;
  
  private float x;
  
  private Drawable y;
  
  private Drawable z;
  
  static {
    if (Build.VERSION.SDK_INT >= 19) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    O = bool1;
    if (Build.VERSION.SDK_INT >= 21) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    P = bool1;
  }
  
  public a(Context paramContext) {
    this(paramContext, null);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet) {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public a(Context paramContext, AttributeSet paramAttributeSet, int paramInt) {
    super(paramContext, paramAttributeSet, paramInt);
    setDescendantFocusability(262144);
    float f1 = (getResources().getDisplayMetrics()).density;
    this.e = (int)(64.0F * f1 + 0.5F);
    float f2 = 400.0F * f1;
    this.k = new g(this, 3);
    this.l = new g(this, 5);
    this.i = b.i.b.c.a(this, 1.0F, this.k);
    this.i.d(1);
    this.i.a(f2);
    this.k.a(this.i);
    this.j = b.i.b.c.a(this, 1.0F, this.l);
    this.j.d(2);
    this.j.a(f2);
    this.l.a(this.j);
    setFocusableInTouchMode(true);
    v.h((View)this, 1);
    v.a((View)this, new b(this));
    setMotionEventSplittingEnabled(false);
    if (v.m((View)this))
      if (Build.VERSION.SDK_INT >= 21) {
        setOnApplyWindowInsetsListener(new a(this));
        setSystemUiVisibility(1280);
        TypedArray typedArray = paramContext.obtainStyledAttributes(M);
        try {
          this.y = typedArray.getDrawable(0);
        } finally {
          typedArray.recycle();
        } 
      } else {
        this.y = null;
      }  
    this.d = f1 * 10.0F;
    this.J = new ArrayList<View>();
  }
  
  private boolean a(float paramFloat1, float paramFloat2, View paramView) {
    if (this.K == null)
      this.K = new Rect(); 
    paramView.getHitRect(this.K);
    return this.K.contains((int)paramFloat1, (int)paramFloat2);
  }
  
  private boolean a(Drawable paramDrawable, int paramInt) {
    if (paramDrawable == null || !androidx.core.graphics.drawable.a.f(paramDrawable))
      return false; 
    androidx.core.graphics.drawable.a.a(paramDrawable, paramInt);
    return true;
  }
  
  private boolean a(MotionEvent paramMotionEvent, View paramView) {
    if (!paramView.getMatrix().isIdentity()) {
      paramMotionEvent = b(paramMotionEvent, paramView);
      boolean bool1 = paramView.dispatchGenericMotionEvent(paramMotionEvent);
      paramMotionEvent.recycle();
      return bool1;
    } 
    float f1 = (getScrollX() - paramView.getLeft());
    float f2 = (getScrollY() - paramView.getTop());
    paramMotionEvent.offsetLocation(f1, f2);
    boolean bool = paramView.dispatchGenericMotionEvent(paramMotionEvent);
    paramMotionEvent.offsetLocation(-f1, -f2);
    return bool;
  }
  
  private MotionEvent b(MotionEvent paramMotionEvent, View paramView) {
    float f1 = (getScrollX() - paramView.getLeft());
    float f2 = (getScrollY() - paramView.getTop());
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.offsetLocation(f1, f2);
    Matrix matrix = paramView.getMatrix();
    if (!matrix.isIdentity()) {
      if (this.L == null)
        this.L = new Matrix(); 
      matrix.invert(this.L);
      paramMotionEvent.transform(this.L);
    } 
    return paramMotionEvent;
  }
  
  private void c(View paramView, boolean paramBoolean) {
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      byte b;
      View view = getChildAt(i);
      if ((!paramBoolean && !i(view)) || (paramBoolean && view == paramView)) {
        b = 1;
      } else {
        b = 4;
      } 
      v.h(view, b);
    } 
  }
  
  private boolean e() {
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      if (((e)getChildAt(i).getLayoutParams()).c)
        return true; 
    } 
    return false;
  }
  
  static String f(int paramInt) {
    return ((paramInt & 0x3) == 3) ? "LEFT" : (((paramInt & 0x5) == 5) ? "RIGHT" : Integer.toHexString(paramInt));
  }
  
  private boolean f() {
    return (d() != null);
  }
  
  private Drawable g() {
    int i = v.p((View)this);
    if (i == 0) {
      Drawable drawable = this.F;
      if (drawable != null) {
        a(drawable, i);
        return this.F;
      } 
    } else {
      Drawable drawable = this.G;
      if (drawable != null) {
        a(drawable, i);
        return this.G;
      } 
    } 
    return this.H;
  }
  
  private Drawable h() {
    int i = v.p((View)this);
    if (i == 0) {
      Drawable drawable = this.G;
      if (drawable != null) {
        a(drawable, i);
        return this.G;
      } 
    } else {
      Drawable drawable = this.F;
      if (drawable != null) {
        a(drawable, i);
        return this.F;
      } 
    } 
    return this.I;
  }
  
  private void i() {
    if (P)
      return; 
    this.z = g();
    this.A = h();
  }
  
  private static boolean l(View paramView) {
    Drawable drawable = paramView.getBackground();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (drawable != null) {
      bool1 = bool2;
      if (drawable.getOpacity() == -1)
        bool1 = true; 
    } 
    return bool1;
  }
  
  static boolean m(View paramView) {
    return (v.n(paramView) != 4 && v.n(paramView) != 2);
  }
  
  void a() {
    if (!this.t) {
      long l = SystemClock.uptimeMillis();
      MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      int j = getChildCount();
      for (int i = 0; i < j; i++)
        getChildAt(i).dispatchTouchEvent(motionEvent); 
      motionEvent.recycle();
      this.t = true;
    } 
  }
  
  public void a(int paramInt) {
    a(paramInt, true);
  }
  
  public void a(int paramInt1, int paramInt2) {
    int i = b.g.m.d.a(paramInt2, v.p((View)this));
    if (paramInt2 != 3) {
      if (paramInt2 != 5) {
        if (paramInt2 != 8388611) {
          if (paramInt2 == 8388613)
            this.s = paramInt1; 
        } else {
          this.r = paramInt1;
        } 
      } else {
        this.q = paramInt1;
      } 
    } else {
      this.p = paramInt1;
    } 
    if (paramInt1 != 0) {
      b.i.b.c c1;
      if (i == 3) {
        c1 = this.i;
      } else {
        c1 = this.j;
      } 
      c1.a();
    } 
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return; 
      View view = b(i);
      if (view != null) {
        k(view);
        return;
      } 
    } else {
      View view = b(i);
      if (view != null)
        a(view); 
    } 
  }
  
  void a(int paramInt1, int paramInt2, View paramView) {
    int i = this.i.e();
    int j = this.j.e();
    byte b = 2;
    if (i == 1 || j == 1) {
      paramInt1 = 1;
    } else {
      paramInt1 = b;
      if (i != 2)
        if (j == 2) {
          paramInt1 = b;
        } else {
          paramInt1 = 0;
        }  
    } 
    if (paramView != null && paramInt2 == 0) {
      float f = ((e)paramView.getLayoutParams()).b;
      if (f == 0.0F) {
        b(paramView);
      } else if (f == 1.0F) {
        c(paramView);
      } 
    } 
    if (paramInt1 != this.m) {
      this.m = paramInt1;
      List<d> list = this.v;
      if (list != null)
        for (paramInt2 = list.size() - 1; paramInt2 >= 0; paramInt2--)
          ((d)this.v.get(paramInt2)).a(paramInt1);  
    } 
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    View view = b(paramInt);
    if (view != null) {
      a(view, paramBoolean);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No drawer view found with gravity ");
    stringBuilder.append(f(paramInt));
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(View paramView) {
    a(paramView, true);
  }
  
  void a(View paramView, float paramFloat) {
    List<d> list = this.v;
    if (list != null)
      for (int i = list.size() - 1; i >= 0; i--)
        ((d)this.v.get(i)).a(paramView, paramFloat);  
  }
  
  public void a(View paramView, boolean paramBoolean) {
    if (i(paramView)) {
      e e = (e)paramView.getLayoutParams();
      if (this.o) {
        e.b = 0.0F;
        e.d = 0;
      } else {
        b.i.b.c c1;
        if (paramBoolean) {
          int i;
          e.d |= 0x4;
          if (a(paramView, 3)) {
            c1 = this.i;
            i = -paramView.getWidth();
          } else {
            c1 = this.j;
            i = getWidth();
          } 
          c1.b(paramView, i, paramView.getTop());
        } else {
          b(paramView, 0.0F);
          a(((e)c1).a, 0, paramView);
          paramView.setVisibility(4);
        } 
      } 
      invalidate();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a sliding drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void a(d paramd) {
    if (paramd == null)
      return; 
    if (this.v == null)
      this.v = new ArrayList<d>(); 
    this.v.add(paramd);
  }
  
  public void a(Object paramObject, boolean paramBoolean) {
    this.D = paramObject;
    this.E = paramBoolean;
    if (!paramBoolean && getBackground() == null) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    } 
    setWillNotDraw(paramBoolean);
    requestLayout();
  }
  
  void a(boolean paramBoolean) {
    int j;
    int m = getChildCount();
    int i = 0;
    int k = 0;
    while (i < m) {
      int n;
      View view = getChildAt(i);
      e e = (e)view.getLayoutParams();
      int i1 = k;
      if (i(view))
        if (paramBoolean && !e.c) {
          i1 = k;
        } else {
          int i2;
          i1 = view.getWidth();
          if (a(view, 3)) {
            i2 = this.i.b(view, -i1, view.getTop());
          } else {
            i2 = this.j.b(view, getWidth(), view.getTop());
          } 
          n = k | i2;
          e.c = false;
        }  
      i++;
      j = n;
    } 
    this.k.b();
    this.l.b();
    if (j != 0)
      invalidate(); 
  }
  
  boolean a(View paramView, int paramInt) {
    return ((e(paramView) & paramInt) == paramInt);
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2) {
    if (getDescendantFocusability() == 393216)
      return; 
    int k = getChildCount();
    boolean bool = false;
    int i = 0;
    int j = 0;
    while (i < k) {
      View view = getChildAt(i);
      if (i(view)) {
        if (h(view)) {
          view.addFocusables(paramArrayList, paramInt1, paramInt2);
          j = 1;
        } 
      } else {
        this.J.add(view);
      } 
      i++;
    } 
    if (!j) {
      j = this.J.size();
      for (i = bool; i < j; i++) {
        View view = this.J.get(i);
        if (view.getVisibility() == 0)
          view.addFocusables(paramArrayList, paramInt1, paramInt2); 
      } 
    } 
    this.J.clear();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    super.addView(paramView, paramInt, paramLayoutParams);
    if (c() != null || i(paramView)) {
      paramInt = 4;
    } else {
      paramInt = 1;
    } 
    v.h(paramView, paramInt);
    if (!O)
      v.a(paramView, this.c); 
  }
  
  View b(int paramInt) {
    int i = b.g.m.d.a(paramInt, v.p((View)this));
    int j = getChildCount();
    for (paramInt = 0; paramInt < j; paramInt++) {
      View view = getChildAt(paramInt);
      if ((e(view) & 0x7) == (i & 0x7))
        return view; 
    } 
    return null;
  }
  
  public void b() {
    a(false);
  }
  
  public void b(int paramInt, boolean paramBoolean) {
    View view = b(paramInt);
    if (view != null) {
      b(view, paramBoolean);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No drawer view found with gravity ");
    stringBuilder.append(f(paramInt));
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  void b(View paramView) {
    e e = (e)paramView.getLayoutParams();
    if ((e.d & 0x1) == 1) {
      e.d = 0;
      List<d> list = this.v;
      if (list != null)
        for (int i = list.size() - 1; i >= 0; i--)
          ((d)this.v.get(i)).b(paramView);  
      c(paramView, false);
      if (hasWindowFocus()) {
        paramView = getRootView();
        if (paramView != null)
          paramView.sendAccessibilityEvent(32); 
      } 
    } 
  }
  
  void b(View paramView, float paramFloat) {
    float f1 = f(paramView);
    float f2 = paramView.getWidth();
    int i = (int)(f1 * f2);
    i = (int)(f2 * paramFloat) - i;
    if (!a(paramView, 3))
      i = -i; 
    paramView.offsetLeftAndRight(i);
    c(paramView, paramFloat);
  }
  
  public void b(View paramView, boolean paramBoolean) {
    if (i(paramView)) {
      e e = (e)paramView.getLayoutParams();
      if (this.o) {
        e.b = 1.0F;
        e.d = 1;
        c(paramView, true);
      } else if (paramBoolean) {
        e.d |= 0x2;
        if (a(paramView, 3)) {
          this.i.b(paramView, 0, paramView.getTop());
        } else {
          this.j.b(paramView, getWidth() - paramView.getWidth(), paramView.getTop());
        } 
      } else {
        b(paramView, 1.0F);
        a(e.a, 0, paramView);
        paramView.setVisibility(0);
      } 
      invalidate();
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a sliding drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void b(d paramd) {
    if (paramd == null)
      return; 
    List<d> list = this.v;
    if (list == null)
      return; 
    list.remove(paramd);
  }
  
  public int c(int paramInt) {
    int i = v.p((View)this);
    if (paramInt != 3) {
      if (paramInt != 5) {
        if (paramInt != 8388611) {
          if (paramInt == 8388613) {
            paramInt = this.s;
            if (paramInt != 3)
              return paramInt; 
            if (i == 0) {
              paramInt = this.q;
            } else {
              paramInt = this.p;
            } 
            if (paramInt != 3)
              return paramInt; 
          } 
        } else {
          paramInt = this.r;
          if (paramInt != 3)
            return paramInt; 
          if (i == 0) {
            paramInt = this.p;
          } else {
            paramInt = this.q;
          } 
          if (paramInt != 3)
            return paramInt; 
        } 
      } else {
        paramInt = this.q;
        if (paramInt != 3)
          return paramInt; 
        if (i == 0) {
          paramInt = this.s;
        } else {
          paramInt = this.r;
        } 
        if (paramInt != 3)
          return paramInt; 
      } 
    } else {
      paramInt = this.p;
      if (paramInt != 3)
        return paramInt; 
      if (i == 0) {
        paramInt = this.r;
      } else {
        paramInt = this.s;
      } 
      if (paramInt != 3)
        return paramInt; 
    } 
    return 0;
  }
  
  View c() {
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      View view = getChildAt(i);
      if ((((e)view.getLayoutParams()).d & 0x1) == 1)
        return view; 
    } 
    return null;
  }
  
  void c(View paramView) {
    e e = (e)paramView.getLayoutParams();
    if ((e.d & 0x1) == 0) {
      e.d = 1;
      List<d> list = this.v;
      if (list != null)
        for (int i = list.size() - 1; i >= 0; i--)
          ((d)this.v.get(i)).a(paramView);  
      c(paramView, true);
      if (hasWindowFocus())
        sendAccessibilityEvent(32); 
    } 
  }
  
  void c(View paramView, float paramFloat) {
    e e = (e)paramView.getLayoutParams();
    if (paramFloat == e.b)
      return; 
    e.b = paramFloat;
    a(paramView, paramFloat);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof e && super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll() {
    int j = getChildCount();
    float f = 0.0F;
    for (int i = 0; i < j; i++)
      f = Math.max(f, ((e)getChildAt(i).getLayoutParams()).b); 
    this.g = f;
    boolean bool1 = this.i.a(true);
    boolean bool2 = this.j.a(true);
    if (bool1 || bool2)
      v.M((View)this); 
  }
  
  public int d(View paramView) {
    if (i(paramView))
      return c(((e)paramView.getLayoutParams()).a); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  View d() {
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      View view = getChildAt(i);
      if (i(view) && j(view))
        return view; 
    } 
    return null;
  }
  
  public CharSequence d(int paramInt) {
    paramInt = b.g.m.d.a(paramInt, v.p((View)this));
    return (paramInt == 3) ? this.B : ((paramInt == 5) ? this.C : null);
  }
  
  public boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent) {
    if ((paramMotionEvent.getSource() & 0x2) == 0 || paramMotionEvent.getAction() == 10 || this.g <= 0.0F)
      return super.dispatchGenericMotionEvent(paramMotionEvent); 
    int i = getChildCount();
    if (i != 0) {
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      while (--i >= 0) {
        View view = getChildAt(i);
        if (a(f1, f2, view) && !g(view) && a(paramMotionEvent, view))
          return true; 
        i--;
      } 
    } 
    return false;
  }
  
  protected boolean drawChild(Canvas paramCanvas, View paramView, long paramLong) {
    Drawable drawable;
    int m = getHeight();
    boolean bool1 = g(paramView);
    int i = getWidth();
    int k = paramCanvas.save();
    int j = 0;
    if (bool1) {
      int i1 = getChildCount();
      int n = 0;
      j = 0;
      while (n < i1) {
        View view = getChildAt(n);
        int i2 = j;
        int i3 = i;
        if (view != paramView) {
          i2 = j;
          i3 = i;
          if (view.getVisibility() == 0) {
            i2 = j;
            i3 = i;
            if (l(view)) {
              i2 = j;
              i3 = i;
              if (i(view))
                if (view.getHeight() < m) {
                  i2 = j;
                  i3 = i;
                } else if (a(view, 3)) {
                  int i4 = view.getRight();
                  i2 = j;
                  i3 = i;
                  if (i4 > j) {
                    i2 = i4;
                    i3 = i;
                  } 
                } else {
                  int i4 = view.getLeft();
                  i2 = j;
                  i3 = i;
                  if (i4 < i) {
                    i3 = i4;
                    i2 = j;
                  } 
                }  
            } 
          } 
        } 
        n++;
        j = i2;
        i = i3;
      } 
      paramCanvas.clipRect(j, 0, i, getHeight());
    } 
    boolean bool2 = super.drawChild(paramCanvas, paramView, paramLong);
    paramCanvas.restoreToCount(k);
    float f = this.g;
    if (f > 0.0F && bool1) {
      int n = this.f;
      int i1 = (int)(((0xFF000000 & n) >>> 24) * f);
      this.h.setColor(n & 0xFFFFFF | i1 << 24);
      paramCanvas.drawRect(j, 0.0F, i, getHeight(), this.h);
      return bool2;
    } 
    if (this.z != null && a(paramView, 3)) {
      i = this.z.getIntrinsicWidth();
      j = paramView.getRight();
      int n = this.i.c();
      f = Math.max(0.0F, Math.min(j / n, 1.0F));
      this.z.setBounds(j, paramView.getTop(), i + j, paramView.getBottom());
      this.z.setAlpha((int)(f * 255.0F));
      drawable = this.z;
      drawable.draw(paramCanvas);
      return bool2;
    } 
    if (this.A != null && a((View)drawable, 5)) {
      i = this.A.getIntrinsicWidth();
      j = drawable.getLeft();
      int n = getWidth();
      int i1 = this.j.c();
      f = Math.max(0.0F, Math.min((n - j) / i1, 1.0F));
      this.A.setBounds(j - i, drawable.getTop(), j, drawable.getBottom());
      this.A.setAlpha((int)(f * 255.0F));
      drawable = this.A;
      drawable.draw(paramCanvas);
      return bool2;
    } 
    return bool2;
  }
  
  int e(View paramView) {
    return b.g.m.d.a(((e)paramView.getLayoutParams()).a, v.p((View)this));
  }
  
  public void e(int paramInt) {
    b(paramInt, true);
  }
  
  float f(View paramView) {
    return ((e)paramView.getLayoutParams()).b;
  }
  
  boolean g(View paramView) {
    return (((e)paramView.getLayoutParams()).a == 0);
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return (ViewGroup.LayoutParams)new e(-1, -1);
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return (ViewGroup.LayoutParams)new e(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (ViewGroup.LayoutParams)((paramLayoutParams instanceof e) ? new e((e)paramLayoutParams) : ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams) ? new e((ViewGroup.MarginLayoutParams)paramLayoutParams) : new e(paramLayoutParams)));
  }
  
  public float getDrawerElevation() {
    return P ? this.d : 0.0F;
  }
  
  public Drawable getStatusBarBackgroundDrawable() {
    return this.y;
  }
  
  public boolean h(View paramView) {
    if (i(paramView))
      return ((((e)paramView.getLayoutParams()).d & 0x1) == 1); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  boolean i(View paramView) {
    int i = b.g.m.d.a(((e)paramView.getLayoutParams()).a, v.p(paramView));
    return ((i & 0x3) != 0) ? true : (((i & 0x5) != 0));
  }
  
  public boolean j(View paramView) {
    if (i(paramView))
      return (((e)paramView.getLayoutParams()).b > 0.0F); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramView);
    stringBuilder.append(" is not a drawer");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void k(View paramView) {
    b(paramView, true);
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.o = true;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    this.o = true;
  }
  
  public void onDraw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial onDraw : (Landroid/graphics/Canvas;)V
    //   5: aload_0
    //   6: getfield E : Z
    //   9: ifeq -> 75
    //   12: aload_0
    //   13: getfield y : Landroid/graphics/drawable/Drawable;
    //   16: ifnull -> 75
    //   19: getstatic android/os/Build$VERSION.SDK_INT : I
    //   22: bipush #21
    //   24: if_icmplt -> 47
    //   27: aload_0
    //   28: getfield D : Ljava/lang/Object;
    //   31: astore_3
    //   32: aload_3
    //   33: ifnull -> 47
    //   36: aload_3
    //   37: checkcast android/view/WindowInsets
    //   40: invokevirtual getSystemWindowInsetTop : ()I
    //   43: istore_2
    //   44: goto -> 49
    //   47: iconst_0
    //   48: istore_2
    //   49: iload_2
    //   50: ifle -> 75
    //   53: aload_0
    //   54: getfield y : Landroid/graphics/drawable/Drawable;
    //   57: iconst_0
    //   58: iconst_0
    //   59: aload_0
    //   60: invokevirtual getWidth : ()I
    //   63: iload_2
    //   64: invokevirtual setBounds : (IIII)V
    //   67: aload_0
    //   68: getfield y : Landroid/graphics/drawable/Drawable;
    //   71: aload_1
    //   72: invokevirtual draw : (Landroid/graphics/Canvas;)V
    //   75: return
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual getActionMasked : ()I
    //   4: istore #4
    //   6: aload_0
    //   7: getfield i : Lb/i/b/c;
    //   10: aload_1
    //   11: invokevirtual b : (Landroid/view/MotionEvent;)Z
    //   14: istore #7
    //   16: aload_0
    //   17: getfield j : Lb/i/b/c;
    //   20: aload_1
    //   21: invokevirtual b : (Landroid/view/MotionEvent;)Z
    //   24: istore #8
    //   26: iconst_1
    //   27: istore #6
    //   29: iload #4
    //   31: ifeq -> 99
    //   34: iload #4
    //   36: iconst_1
    //   37: if_icmpeq -> 83
    //   40: iload #4
    //   42: iconst_2
    //   43: if_icmpeq -> 55
    //   46: iload #4
    //   48: iconst_3
    //   49: if_icmpeq -> 83
    //   52: goto -> 93
    //   55: aload_0
    //   56: getfield i : Lb/i/b/c;
    //   59: iconst_3
    //   60: invokevirtual a : (I)Z
    //   63: ifeq -> 93
    //   66: aload_0
    //   67: getfield k : Lb/j/a/a$g;
    //   70: invokevirtual b : ()V
    //   73: aload_0
    //   74: getfield l : Lb/j/a/a$g;
    //   77: invokevirtual b : ()V
    //   80: goto -> 93
    //   83: aload_0
    //   84: iconst_1
    //   85: invokevirtual a : (Z)V
    //   88: aload_0
    //   89: iconst_0
    //   90: putfield t : Z
    //   93: iconst_0
    //   94: istore #4
    //   96: goto -> 166
    //   99: aload_1
    //   100: invokevirtual getX : ()F
    //   103: fstore_2
    //   104: aload_1
    //   105: invokevirtual getY : ()F
    //   108: fstore_3
    //   109: aload_0
    //   110: fload_2
    //   111: putfield w : F
    //   114: aload_0
    //   115: fload_3
    //   116: putfield x : F
    //   119: aload_0
    //   120: getfield g : F
    //   123: fconst_0
    //   124: fcmpl
    //   125: ifle -> 158
    //   128: aload_0
    //   129: getfield i : Lb/i/b/c;
    //   132: fload_2
    //   133: f2i
    //   134: fload_3
    //   135: f2i
    //   136: invokevirtual b : (II)Landroid/view/View;
    //   139: astore_1
    //   140: aload_1
    //   141: ifnull -> 158
    //   144: aload_0
    //   145: aload_1
    //   146: invokevirtual g : (Landroid/view/View;)Z
    //   149: ifeq -> 158
    //   152: iconst_1
    //   153: istore #4
    //   155: goto -> 161
    //   158: iconst_0
    //   159: istore #4
    //   161: aload_0
    //   162: iconst_0
    //   163: putfield t : Z
    //   166: iload #6
    //   168: istore #5
    //   170: iload #7
    //   172: iload #8
    //   174: ior
    //   175: ifne -> 210
    //   178: iload #6
    //   180: istore #5
    //   182: iload #4
    //   184: ifne -> 210
    //   187: iload #6
    //   189: istore #5
    //   191: aload_0
    //   192: invokespecial e : ()Z
    //   195: ifne -> 210
    //   198: aload_0
    //   199: getfield t : Z
    //   202: ifeq -> 207
    //   205: iconst_1
    //   206: ireturn
    //   207: iconst_0
    //   208: istore #5
    //   210: iload #5
    //   212: ireturn
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent) {
    if (paramInt == 4 && f()) {
      paramKeyEvent.startTracking();
      return true;
    } 
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent) {
    View view;
    if (paramInt == 4) {
      view = d();
      if (view != null && d(view) == 0)
        b(); 
      return (view != null);
    } 
    return super.onKeyUp(paramInt, (KeyEvent)view);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    this.n = true;
    int i = paramInt3 - paramInt1;
    int j = getChildCount();
    for (paramInt3 = 0; paramInt3 < j; paramInt3++) {
      View view = getChildAt(paramInt3);
      if (view.getVisibility() != 8) {
        e e = (e)view.getLayoutParams();
        if (g(view)) {
          paramInt1 = e.leftMargin;
          view.layout(paramInt1, e.topMargin, view.getMeasuredWidth() + paramInt1, e.topMargin + view.getMeasuredHeight());
        } else {
          float f;
          int k;
          boolean bool;
          int m = view.getMeasuredWidth();
          int n = view.getMeasuredHeight();
          if (a(view, 3)) {
            paramInt1 = -m;
            f = m;
            k = paramInt1 + (int)(e.b * f);
            f = (m + k) / f;
          } else {
            f = m;
            k = i - (int)(e.b * f);
            f = (i - k) / f;
          } 
          if (f != e.b) {
            bool = true;
          } else {
            bool = false;
          } 
          paramInt1 = e.a & 0x70;
          if (paramInt1 != 16) {
            int i1;
            int i2;
            if (paramInt1 != 80) {
              i2 = e.topMargin;
              paramInt1 = m + k;
              i1 = n + i2;
            } else {
              i1 = paramInt4 - paramInt2;
              i2 = i1 - e.bottomMargin - view.getMeasuredHeight();
              paramInt1 = m + k;
              i1 -= e.bottomMargin;
            } 
            view.layout(k, i2, paramInt1, i1);
          } else {
            int i2 = paramInt4 - paramInt2;
            int i1 = (i2 - n) / 2;
            paramInt1 = e.topMargin;
            if (i1 >= paramInt1) {
              int i3 = e.bottomMargin;
              paramInt1 = i1;
              if (i1 + n > i2 - i3)
                paramInt1 = i2 - i3 - n; 
            } 
            view.layout(k, paramInt1, m + k, n + paramInt1);
          } 
          if (bool)
            c(view, f); 
          if (e.b > 0.0F) {
            paramInt1 = 0;
          } else {
            paramInt1 = 4;
          } 
          if (view.getVisibility() != paramInt1)
            view.setVisibility(paramInt1); 
        } 
      } 
    } 
    this.n = false;
    this.o = false;
  }
  
  @SuppressLint({"WrongConstant"})
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iload_1
    //   1: invokestatic getMode : (I)I
    //   4: istore #10
    //   6: iload_2
    //   7: invokestatic getMode : (I)I
    //   10: istore #9
    //   12: iload_1
    //   13: invokestatic getSize : (I)I
    //   16: istore #5
    //   18: iload_2
    //   19: invokestatic getSize : (I)I
    //   22: istore #6
    //   24: iload #10
    //   26: ldc_w 1073741824
    //   29: if_icmpne -> 48
    //   32: iload #5
    //   34: istore #7
    //   36: iload #6
    //   38: istore #8
    //   40: iload #9
    //   42: ldc_w 1073741824
    //   45: if_icmpeq -> 117
    //   48: aload_0
    //   49: invokevirtual isInEditMode : ()Z
    //   52: ifeq -> 827
    //   55: iload #10
    //   57: ldc_w -2147483648
    //   60: if_icmpne -> 66
    //   63: goto -> 76
    //   66: iload #10
    //   68: ifne -> 76
    //   71: sipush #300
    //   74: istore #5
    //   76: iload #9
    //   78: ldc_w -2147483648
    //   81: if_icmpne -> 95
    //   84: iload #5
    //   86: istore #7
    //   88: iload #6
    //   90: istore #8
    //   92: goto -> 117
    //   95: iload #5
    //   97: istore #7
    //   99: iload #6
    //   101: istore #8
    //   103: iload #9
    //   105: ifne -> 117
    //   108: sipush #300
    //   111: istore #8
    //   113: iload #5
    //   115: istore #7
    //   117: aload_0
    //   118: iload #7
    //   120: iload #8
    //   122: invokevirtual setMeasuredDimension : (II)V
    //   125: aload_0
    //   126: getfield D : Ljava/lang/Object;
    //   129: ifnull -> 145
    //   132: aload_0
    //   133: invokestatic m : (Landroid/view/View;)Z
    //   136: ifeq -> 145
    //   139: iconst_1
    //   140: istore #9
    //   142: goto -> 148
    //   145: iconst_0
    //   146: istore #9
    //   148: aload_0
    //   149: invokestatic p : (Landroid/view/View;)I
    //   152: istore #12
    //   154: aload_0
    //   155: invokevirtual getChildCount : ()I
    //   158: istore #13
    //   160: iconst_0
    //   161: istore #10
    //   163: iconst_0
    //   164: istore #6
    //   166: iconst_0
    //   167: istore #5
    //   169: iload #10
    //   171: iload #13
    //   173: if_icmpge -> 826
    //   176: aload_0
    //   177: iload #10
    //   179: invokevirtual getChildAt : (I)Landroid/view/View;
    //   182: astore #18
    //   184: aload #18
    //   186: invokevirtual getVisibility : ()I
    //   189: bipush #8
    //   191: if_icmpne -> 197
    //   194: goto -> 508
    //   197: aload #18
    //   199: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   202: checkcast b/j/a/a$e
    //   205: astore #19
    //   207: iload #9
    //   209: ifeq -> 454
    //   212: aload #19
    //   214: getfield a : I
    //   217: iload #12
    //   219: invokestatic a : (II)I
    //   222: istore #11
    //   224: aload #18
    //   226: invokestatic m : (Landroid/view/View;)Z
    //   229: istore #15
    //   231: getstatic android/os/Build$VERSION.SDK_INT : I
    //   234: istore #14
    //   236: iload #15
    //   238: ifeq -> 333
    //   241: iload #14
    //   243: bipush #21
    //   245: if_icmplt -> 454
    //   248: aload_0
    //   249: getfield D : Ljava/lang/Object;
    //   252: checkcast android/view/WindowInsets
    //   255: astore #17
    //   257: iload #11
    //   259: iconst_3
    //   260: if_icmpne -> 289
    //   263: aload #17
    //   265: aload #17
    //   267: invokevirtual getSystemWindowInsetLeft : ()I
    //   270: aload #17
    //   272: invokevirtual getSystemWindowInsetTop : ()I
    //   275: iconst_0
    //   276: aload #17
    //   278: invokevirtual getSystemWindowInsetBottom : ()I
    //   281: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   284: astore #16
    //   286: goto -> 322
    //   289: aload #17
    //   291: astore #16
    //   293: iload #11
    //   295: iconst_5
    //   296: if_icmpne -> 322
    //   299: aload #17
    //   301: iconst_0
    //   302: aload #17
    //   304: invokevirtual getSystemWindowInsetTop : ()I
    //   307: aload #17
    //   309: invokevirtual getSystemWindowInsetRight : ()I
    //   312: aload #17
    //   314: invokevirtual getSystemWindowInsetBottom : ()I
    //   317: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   320: astore #16
    //   322: aload #18
    //   324: aload #16
    //   326: invokevirtual dispatchApplyWindowInsets : (Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    //   329: pop
    //   330: goto -> 454
    //   333: iload #14
    //   335: bipush #21
    //   337: if_icmplt -> 454
    //   340: aload_0
    //   341: getfield D : Ljava/lang/Object;
    //   344: checkcast android/view/WindowInsets
    //   347: astore #17
    //   349: iload #11
    //   351: iconst_3
    //   352: if_icmpne -> 381
    //   355: aload #17
    //   357: aload #17
    //   359: invokevirtual getSystemWindowInsetLeft : ()I
    //   362: aload #17
    //   364: invokevirtual getSystemWindowInsetTop : ()I
    //   367: iconst_0
    //   368: aload #17
    //   370: invokevirtual getSystemWindowInsetBottom : ()I
    //   373: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   376: astore #16
    //   378: goto -> 414
    //   381: aload #17
    //   383: astore #16
    //   385: iload #11
    //   387: iconst_5
    //   388: if_icmpne -> 414
    //   391: aload #17
    //   393: iconst_0
    //   394: aload #17
    //   396: invokevirtual getSystemWindowInsetTop : ()I
    //   399: aload #17
    //   401: invokevirtual getSystemWindowInsetRight : ()I
    //   404: aload #17
    //   406: invokevirtual getSystemWindowInsetBottom : ()I
    //   409: invokevirtual replaceSystemWindowInsets : (IIII)Landroid/view/WindowInsets;
    //   412: astore #16
    //   414: aload #19
    //   416: aload #16
    //   418: invokevirtual getSystemWindowInsetLeft : ()I
    //   421: putfield leftMargin : I
    //   424: aload #19
    //   426: aload #16
    //   428: invokevirtual getSystemWindowInsetTop : ()I
    //   431: putfield topMargin : I
    //   434: aload #19
    //   436: aload #16
    //   438: invokevirtual getSystemWindowInsetRight : ()I
    //   441: putfield rightMargin : I
    //   444: aload #19
    //   446: aload #16
    //   448: invokevirtual getSystemWindowInsetBottom : ()I
    //   451: putfield bottomMargin : I
    //   454: aload_0
    //   455: aload #18
    //   457: invokevirtual g : (Landroid/view/View;)Z
    //   460: ifeq -> 511
    //   463: aload #18
    //   465: iload #7
    //   467: aload #19
    //   469: getfield leftMargin : I
    //   472: isub
    //   473: aload #19
    //   475: getfield rightMargin : I
    //   478: isub
    //   479: ldc_w 1073741824
    //   482: invokestatic makeMeasureSpec : (II)I
    //   485: iload #8
    //   487: aload #19
    //   489: getfield topMargin : I
    //   492: isub
    //   493: aload #19
    //   495: getfield bottomMargin : I
    //   498: isub
    //   499: ldc_w 1073741824
    //   502: invokestatic makeMeasureSpec : (II)I
    //   505: invokevirtual measure : (II)V
    //   508: goto -> 743
    //   511: aload_0
    //   512: aload #18
    //   514: invokevirtual i : (Landroid/view/View;)Z
    //   517: ifeq -> 752
    //   520: getstatic b/j/a/a.P : Z
    //   523: ifeq -> 552
    //   526: aload #18
    //   528: invokestatic l : (Landroid/view/View;)F
    //   531: fstore_3
    //   532: aload_0
    //   533: getfield d : F
    //   536: fstore #4
    //   538: fload_3
    //   539: fload #4
    //   541: fcmpl
    //   542: ifeq -> 552
    //   545: aload #18
    //   547: fload #4
    //   549: invokestatic a : (Landroid/view/View;F)V
    //   552: aload_0
    //   553: aload #18
    //   555: invokevirtual e : (Landroid/view/View;)I
    //   558: bipush #7
    //   560: iand
    //   561: istore #14
    //   563: iload #14
    //   565: iconst_3
    //   566: if_icmpne -> 575
    //   569: iconst_1
    //   570: istore #11
    //   572: goto -> 578
    //   575: iconst_0
    //   576: istore #11
    //   578: iload #11
    //   580: ifeq -> 588
    //   583: iload #6
    //   585: ifne -> 601
    //   588: iload #11
    //   590: ifne -> 679
    //   593: iload #5
    //   595: ifne -> 601
    //   598: goto -> 679
    //   601: new java/lang/StringBuilder
    //   604: dup
    //   605: invokespecial <init> : ()V
    //   608: astore #16
    //   610: aload #16
    //   612: ldc_w 'Child drawer has absolute gravity '
    //   615: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   618: pop
    //   619: aload #16
    //   621: iload #14
    //   623: invokestatic f : (I)Ljava/lang/String;
    //   626: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   629: pop
    //   630: aload #16
    //   632: ldc_w ' but this '
    //   635: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   638: pop
    //   639: aload #16
    //   641: ldc_w 'DrawerLayout'
    //   644: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   647: pop
    //   648: aload #16
    //   650: ldc_w ' already has a '
    //   653: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   656: pop
    //   657: aload #16
    //   659: ldc_w 'drawer view along that edge'
    //   662: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   665: pop
    //   666: new java/lang/IllegalStateException
    //   669: dup
    //   670: aload #16
    //   672: invokevirtual toString : ()Ljava/lang/String;
    //   675: invokespecial <init> : (Ljava/lang/String;)V
    //   678: athrow
    //   679: iload #11
    //   681: ifeq -> 690
    //   684: iconst_1
    //   685: istore #6
    //   687: goto -> 693
    //   690: iconst_1
    //   691: istore #5
    //   693: aload #18
    //   695: iload_1
    //   696: aload_0
    //   697: getfield e : I
    //   700: aload #19
    //   702: getfield leftMargin : I
    //   705: iadd
    //   706: aload #19
    //   708: getfield rightMargin : I
    //   711: iadd
    //   712: aload #19
    //   714: getfield width : I
    //   717: invokestatic getChildMeasureSpec : (III)I
    //   720: iload_2
    //   721: aload #19
    //   723: getfield topMargin : I
    //   726: aload #19
    //   728: getfield bottomMargin : I
    //   731: iadd
    //   732: aload #19
    //   734: getfield height : I
    //   737: invokestatic getChildMeasureSpec : (III)I
    //   740: invokevirtual measure : (II)V
    //   743: iload #10
    //   745: iconst_1
    //   746: iadd
    //   747: istore #10
    //   749: goto -> 169
    //   752: new java/lang/StringBuilder
    //   755: dup
    //   756: invokespecial <init> : ()V
    //   759: astore #16
    //   761: aload #16
    //   763: ldc_w 'Child '
    //   766: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   769: pop
    //   770: aload #16
    //   772: aload #18
    //   774: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   777: pop
    //   778: aload #16
    //   780: ldc_w ' at index '
    //   783: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   786: pop
    //   787: aload #16
    //   789: iload #10
    //   791: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   794: pop
    //   795: aload #16
    //   797: ldc_w ' does not have a valid layout_gravity - must be Gravity.LEFT, '
    //   800: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   803: pop
    //   804: aload #16
    //   806: ldc_w 'Gravity.RIGHT or Gravity.NO_GRAVITY'
    //   809: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   812: pop
    //   813: new java/lang/IllegalStateException
    //   816: dup
    //   817: aload #16
    //   819: invokevirtual toString : ()Ljava/lang/String;
    //   822: invokespecial <init> : (Ljava/lang/String;)V
    //   825: athrow
    //   826: return
    //   827: new java/lang/IllegalArgumentException
    //   830: dup
    //   831: ldc_w 'DrawerLayout must be measured with MeasureSpec.EXACTLY.'
    //   834: invokespecial <init> : (Ljava/lang/String;)V
    //   837: astore #16
    //   839: goto -> 845
    //   842: aload #16
    //   844: athrow
    //   845: goto -> 842
  }
  
  protected void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof f)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    f f = (f)paramParcelable;
    super.onRestoreInstanceState(f.e());
    int i = f.e;
    if (i != 0) {
      View view = b(i);
      if (view != null)
        k(view); 
    } 
    i = f.f;
    if (i != 3)
      a(i, 3); 
    i = f.g;
    if (i != 3)
      a(i, 5); 
    i = f.h;
    if (i != 3)
      a(i, 8388611); 
    i = f.i;
    if (i != 3)
      a(i, 8388613); 
  }
  
  public void onRtlPropertiesChanged(int paramInt) {
    i();
  }
  
  protected Parcelable onSaveInstanceState() {
    f f = new f(super.onSaveInstanceState());
    int j = getChildCount();
    for (int i = 0; i < j; i++) {
      e e = (e)getChildAt(i).getLayoutParams();
      int k = e.d;
      boolean bool = true;
      if (k == 1) {
        k = 1;
      } else {
        k = 0;
      } 
      if (e.d != 2)
        bool = false; 
      if (k != 0 || bool) {
        f.e = e.a;
        break;
      } 
    } 
    f.f = this.p;
    f.g = this.q;
    f.h = this.r;
    f.i = this.s;
    return (Parcelable)f;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    View view;
    this.i.a(paramMotionEvent);
    this.j.a(paramMotionEvent);
    int i = paramMotionEvent.getAction() & 0xFF;
    boolean bool = false;
    if (i != 0) {
      if (i != 1) {
        if (i != 3)
          return true; 
        a(true);
      } else {
        float f2 = paramMotionEvent.getX();
        float f1 = paramMotionEvent.getY();
        view = this.i.b((int)f2, (int)f1);
        if (view != null && g(view)) {
          f2 -= this.w;
          f1 -= this.x;
          i = this.i.d();
          if (f2 * f2 + f1 * f1 < (i * i)) {
            view = c();
            if (view == null || d(view) == 2)
              bool = true; 
            a(bool);
            return true;
          } 
        } 
        bool = true;
      } 
    } else {
      float f1 = view.getX();
      float f2 = view.getY();
      this.w = f1;
      this.x = f2;
    } 
    this.t = false;
    return true;
  }
  
  public void requestDisallowInterceptTouchEvent(boolean paramBoolean) {
    super.requestDisallowInterceptTouchEvent(paramBoolean);
    if (paramBoolean)
      a(true); 
  }
  
  public void requestLayout() {
    if (!this.n)
      super.requestLayout(); 
  }
  
  public void setDrawerElevation(float paramFloat) {
    this.d = paramFloat;
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (i(view))
        v.a(view, this.d); 
    } 
  }
  
  @Deprecated
  public void setDrawerListener(d paramd) {
    d d1 = this.u;
    if (d1 != null)
      b(d1); 
    if (paramd != null)
      a(paramd); 
    this.u = paramd;
  }
  
  public void setDrawerLockMode(int paramInt) {
    a(paramInt, 3);
    a(paramInt, 5);
  }
  
  public void setScrimColor(int paramInt) {
    this.f = paramInt;
    invalidate();
  }
  
  public void setStatusBarBackground(int paramInt) {
    Drawable drawable;
    if (paramInt != 0) {
      drawable = b.g.e.a.c(getContext(), paramInt);
    } else {
      drawable = null;
    } 
    this.y = drawable;
    invalidate();
  }
  
  public void setStatusBarBackground(Drawable paramDrawable) {
    this.y = paramDrawable;
    invalidate();
  }
  
  public void setStatusBarBackgroundColor(int paramInt) {
    this.y = (Drawable)new ColorDrawable(paramInt);
    invalidate();
  }
  
  static {
    boolean bool1;
    boolean bool2 = true;
  }
  
  class a implements View.OnApplyWindowInsetsListener {
    a(a this$0) {}
    
    public WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets) {
      boolean bool;
      a a1 = (a)param1View;
      if (param1WindowInsets.getSystemWindowInsetTop() > 0) {
        bool = true;
      } else {
        bool = false;
      } 
      a1.a(param1WindowInsets, bool);
      return param1WindowInsets.consumeSystemWindowInsets();
    }
  }
  
  class b extends b.g.m.a {
    private final Rect d = new Rect();
    
    b(a this$0) {}
    
    private void a(b.g.m.e0.c param1c, ViewGroup param1ViewGroup) {
      int j = param1ViewGroup.getChildCount();
      for (int i = 0; i < j; i++) {
        View view = param1ViewGroup.getChildAt(i);
        if (a.m(view))
          param1c.a(view); 
      } 
    }
    
    private void a(b.g.m.e0.c param1c1, b.g.m.e0.c param1c2) {
      Rect rect = this.d;
      param1c2.a(rect);
      param1c1.c(rect);
      param1c2.b(rect);
      param1c1.d(rect);
      param1c1.o(param1c2.v());
      param1c1.e(param1c2.g());
      param1c1.a(param1c2.d());
      param1c1.b(param1c2.e());
      param1c1.f(param1c2.n());
      param1c1.d(param1c2.m());
      param1c1.g(param1c2.o());
      param1c1.h(param1c2.p());
      param1c1.a(param1c2.j());
      param1c1.m(param1c2.t());
      param1c1.j(param1c2.q());
      param1c1.a(param1c2.b());
    }
    
    public void a(View param1View, b.g.m.e0.c param1c) {
      if (a.O) {
        super.a(param1View, param1c);
      } else {
        b.g.m.e0.c c1 = b.g.m.e0.c.a(param1c);
        super.a(param1View, c1);
        param1c.c(param1View);
        ViewParent viewParent = v.v(param1View);
        if (viewParent instanceof View)
          param1c.b((View)viewParent); 
        a(param1c, c1);
        c1.w();
        a(param1c, (ViewGroup)param1View);
      } 
      param1c.a(a.class.getName());
      param1c.g(false);
      param1c.h(false);
      param1c.b(b.g.m.e0.c.a.e);
      param1c.b(b.g.m.e0.c.a.f);
    }
    
    public boolean a(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      List<CharSequence> list;
      CharSequence charSequence;
      if (param1AccessibilityEvent.getEventType() == 32) {
        list = param1AccessibilityEvent.getText();
        View view = this.e.d();
        if (view != null) {
          int i = this.e.e(view);
          charSequence = this.e.d(i);
          if (charSequence != null)
            list.add(charSequence); 
        } 
        return true;
      } 
      return super.a((View)list, (AccessibilityEvent)charSequence);
    }
    
    public boolean a(ViewGroup param1ViewGroup, View param1View, AccessibilityEvent param1AccessibilityEvent) {
      return (a.O || a.m(param1View)) ? super.a(param1ViewGroup, param1View, param1AccessibilityEvent) : false;
    }
    
    public void b(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      super.b(param1View, param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName(a.class.getName());
    }
  }
  
  static final class c extends b.g.m.a {
    public void a(View param1View, b.g.m.e0.c param1c) {
      super.a(param1View, param1c);
      if (!a.m(param1View))
        param1c.b(null); 
    }
  }
  
  public static interface d {
    void a(int param1Int);
    
    void a(View param1View);
    
    void a(View param1View, float param1Float);
    
    void b(View param1View);
  }
  
  public static class e extends ViewGroup.MarginLayoutParams {
    public int a = 0;
    
    float b;
    
    boolean c;
    
    int d;
    
    public e(int param1Int1, int param1Int2) {
      super(param1Int1, param1Int2);
    }
    
    public e(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, a.N);
      this.a = typedArray.getInt(0, 0);
      typedArray.recycle();
    }
    
    public e(ViewGroup.LayoutParams param1LayoutParams) {
      super(param1LayoutParams);
    }
    
    public e(ViewGroup.MarginLayoutParams param1MarginLayoutParams) {
      super(param1MarginLayoutParams);
    }
    
    public e(e param1e) {
      super(param1e);
      this.a = param1e.a;
    }
  }
  
  protected static class f extends b.i.a.a {
    public static final Parcelable.Creator<f> CREATOR = (Parcelable.Creator<f>)new a();
    
    int e = 0;
    
    int f;
    
    int g;
    
    int h;
    
    int i;
    
    public f(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readInt();
      this.g = param1Parcel.readInt();
      this.h = param1Parcel.readInt();
      this.i = param1Parcel.readInt();
    }
    
    public f(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeInt(this.f);
      param1Parcel.writeInt(this.g);
      param1Parcel.writeInt(this.h);
      param1Parcel.writeInt(this.i);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<f> {
      public a.f createFromParcel(Parcel param2Parcel) {
        return new a.f(param2Parcel, null);
      }
      
      public a.f createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new a.f(param2Parcel, param2ClassLoader);
      }
      
      public a.f[] newArray(int param2Int) {
        return new a.f[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<f> {
    public a.f createFromParcel(Parcel param1Parcel) {
      return new a.f(param1Parcel, null);
    }
    
    public a.f createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new a.f(param1Parcel, param1ClassLoader);
    }
    
    public a.f[] newArray(int param1Int) {
      return new a.f[param1Int];
    }
  }
  
  private class g extends b.i.b.c.c {
    private final int a;
    
    private b.i.b.c b;
    
    private final Runnable c = new a(this);
    
    g(a this$0, int param1Int) {
      this.a = param1Int;
    }
    
    private void c() {
      int i = this.a;
      byte b = 3;
      if (i == 3)
        b = 5; 
      View view = this.d.b(b);
      if (view != null)
        this.d.a(view); 
    }
    
    public int a(View param1View) {
      return this.d.i(param1View) ? param1View.getWidth() : 0;
    }
    
    public int a(View param1View, int param1Int1, int param1Int2) {
      if (this.d.a(param1View, 3)) {
        param1Int2 = -param1View.getWidth();
        boolean bool = false;
        return Math.max(param1Int2, Math.min(param1Int1, bool));
      } 
      int i = this.d.getWidth();
      param1Int2 = i - param1View.getWidth();
      return Math.max(param1Int2, Math.min(param1Int1, i));
    }
    
    void a() {
      View view;
      int k = this.b.c();
      int i = this.a;
      int j = 0;
      if (i == 3) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i != 0) {
        view = this.d.b(3);
        if (view != null)
          j = -view.getWidth(); 
        j += k;
      } else {
        view = this.d.b(5);
        j = this.d.getWidth() - k;
      } 
      if (view != null && ((i != 0 && view.getLeft() < j) || (i == 0 && view.getLeft() > j)) && this.d.d(view) == 0) {
        a.e e = (a.e)view.getLayoutParams();
        this.b.b(view, j, view.getTop());
        e.c = true;
        this.d.invalidate();
        c();
        this.d.a();
      } 
    }
    
    public void a(int param1Int1, int param1Int2) {
      a a1;
      if ((param1Int1 & 0x1) == 1) {
        a1 = this.d;
        param1Int1 = 3;
      } else {
        a1 = this.d;
        param1Int1 = 5;
      } 
      View view = a1.b(param1Int1);
      if (view != null && this.d.d(view) == 0)
        this.b.a(view, param1Int2); 
    }
    
    public void a(View param1View, float param1Float1, float param1Float2) {
      // Byte code:
      //   0: aload_0
      //   1: getfield d : Lb/j/a/a;
      //   4: aload_1
      //   5: invokevirtual f : (Landroid/view/View;)F
      //   8: fstore_3
      //   9: aload_1
      //   10: invokevirtual getWidth : ()I
      //   13: istore #6
      //   15: aload_0
      //   16: getfield d : Lb/j/a/a;
      //   19: aload_1
      //   20: iconst_3
      //   21: invokevirtual a : (Landroid/view/View;I)Z
      //   24: ifeq -> 63
      //   27: fload_2
      //   28: fconst_0
      //   29: fcmpl
      //   30: ifgt -> 57
      //   33: fload_2
      //   34: fconst_0
      //   35: fcmpl
      //   36: ifne -> 49
      //   39: fload_3
      //   40: ldc 0.5
      //   42: fcmpl
      //   43: ifle -> 49
      //   46: goto -> 57
      //   49: iload #6
      //   51: ineg
      //   52: istore #4
      //   54: goto -> 106
      //   57: iconst_0
      //   58: istore #4
      //   60: goto -> 106
      //   63: aload_0
      //   64: getfield d : Lb/j/a/a;
      //   67: invokevirtual getWidth : ()I
      //   70: istore #5
      //   72: fload_2
      //   73: fconst_0
      //   74: fcmpg
      //   75: iflt -> 99
      //   78: iload #5
      //   80: istore #4
      //   82: fload_2
      //   83: fconst_0
      //   84: fcmpl
      //   85: ifne -> 106
      //   88: iload #5
      //   90: istore #4
      //   92: fload_3
      //   93: ldc 0.5
      //   95: fcmpl
      //   96: ifle -> 106
      //   99: iload #5
      //   101: iload #6
      //   103: isub
      //   104: istore #4
      //   106: aload_0
      //   107: getfield b : Lb/i/b/c;
      //   110: iload #4
      //   112: aload_1
      //   113: invokevirtual getTop : ()I
      //   116: invokevirtual d : (II)Z
      //   119: pop
      //   120: aload_0
      //   121: getfield d : Lb/j/a/a;
      //   124: invokevirtual invalidate : ()V
      //   127: return
    }
    
    public void a(View param1View, int param1Int) {
      ((a.e)param1View.getLayoutParams()).c = false;
      c();
    }
    
    public void a(View param1View, int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      float f;
      param1Int2 = param1View.getWidth();
      if (this.d.a(param1View, 3)) {
        f = (param1Int1 + param1Int2);
      } else {
        f = (this.d.getWidth() - param1Int1);
      } 
      f /= param1Int2;
      this.d.c(param1View, f);
      if (f == 0.0F) {
        param1Int1 = 4;
      } else {
        param1Int1 = 0;
      } 
      param1View.setVisibility(param1Int1);
      this.d.invalidate();
    }
    
    public void a(b.i.b.c param1c) {
      this.b = param1c;
    }
    
    public int b(View param1View, int param1Int1, int param1Int2) {
      return param1View.getTop();
    }
    
    public void b() {
      this.d.removeCallbacks(this.c);
    }
    
    public void b(int param1Int1, int param1Int2) {
      this.d.postDelayed(this.c, 160L);
    }
    
    public boolean b(int param1Int) {
      return false;
    }
    
    public boolean b(View param1View, int param1Int) {
      return (this.d.i(param1View) && this.d.a(param1View, this.a) && this.d.d(param1View) == 0);
    }
    
    public void c(int param1Int) {
      this.d.a(this.a, param1Int, this.b.b());
    }
    
    class a implements Runnable {
      a(a.g this$0) {}
      
      public void run() {
        this.c.a();
      }
    }
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      this.c.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/j/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */