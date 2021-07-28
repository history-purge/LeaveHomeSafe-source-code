package b.t.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import b.g.m.d0;
import b.g.m.r;
import b.g.m.v;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class b extends ViewGroup {
  static final int[] h0 = new int[] { 16842931 };
  
  private static final Comparator<f> i0 = new a();
  
  private static final Interpolator j0 = new b();
  
  private static final n k0 = new n();
  
  private boolean A;
  
  private int B;
  
  private int C;
  
  private int D;
  
  private float E;
  
  private float F;
  
  private float G;
  
  private float H;
  
  private int I = -1;
  
  private VelocityTracker J;
  
  private int K;
  
  private int L;
  
  private int M;
  
  private int N;
  
  private boolean O;
  
  private EdgeEffect P;
  
  private EdgeEffect Q;
  
  private boolean R = true;
  
  private boolean S;
  
  private int T;
  
  private List<j> U;
  
  private j V;
  
  private j W;
  
  private List<i> a0;
  
  private k b0;
  
  private int c;
  
  private int c0;
  
  private final ArrayList<f> d = new ArrayList<f>();
  
  private int d0;
  
  private final f e = new f();
  
  private ArrayList<View> e0;
  
  private final Rect f = new Rect();
  
  private final Runnable f0 = new c(this);
  
  a g;
  
  private int g0 = 0;
  
  int h;
  
  private int i = -1;
  
  private Parcelable j = null;
  
  private ClassLoader k = null;
  
  private Scroller l;
  
  private boolean m;
  
  private l n;
  
  private int o;
  
  private Drawable p;
  
  private int q;
  
  private int r;
  
  private float s = -3.4028235E38F;
  
  private float t = Float.MAX_VALUE;
  
  private int u;
  
  private boolean v;
  
  private boolean w;
  
  private boolean x;
  
  private int y = 1;
  
  private boolean z;
  
  public b(Context paramContext) {
    super(paramContext);
    b();
  }
  
  private int a(int paramInt1, float paramFloat, int paramInt2, int paramInt3) {
    if (Math.abs(paramInt3) > this.M && Math.abs(paramInt2) > this.K) {
      if (paramInt2 <= 0)
        paramInt1++; 
    } else {
      float f1;
      if (paramInt1 >= this.h) {
        f1 = 0.4F;
      } else {
        f1 = 0.6F;
      } 
      paramInt1 += (int)(paramFloat + f1);
    } 
    paramInt2 = paramInt1;
    if (this.d.size() > 0) {
      f f1 = this.d.get(0);
      ArrayList<f> arrayList = this.d;
      f f2 = arrayList.get(arrayList.size() - 1);
      paramInt2 = Math.max(f1.b, Math.min(paramInt1, f2.b));
    } 
    return paramInt2;
  }
  
  private Rect a(Rect paramRect, View paramView) {
    Rect rect = paramRect;
    if (paramRect == null)
      rect = new Rect(); 
    if (paramView == null) {
      rect.set(0, 0, 0, 0);
      return rect;
    } 
    rect.left = paramView.getLeft();
    rect.right = paramView.getRight();
    rect.top = paramView.getTop();
    rect.bottom = paramView.getBottom();
    ViewParent viewParent = paramView.getParent();
    while (viewParent instanceof ViewGroup && viewParent != this) {
      ViewGroup viewGroup = (ViewGroup)viewParent;
      rect.left += viewGroup.getLeft();
      rect.right += viewGroup.getRight();
      rect.top += viewGroup.getTop();
      rect.bottom += viewGroup.getBottom();
      ViewParent viewParent1 = viewGroup.getParent();
    } 
    return rect;
  }
  
  private void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 > 0 && !this.d.isEmpty()) {
      if (!this.l.isFinished()) {
        this.l.setFinalX(getCurrentItem() * getClientWidth());
        return;
      } 
      int i = getPaddingLeft();
      int m = getPaddingRight();
      int i1 = getPaddingLeft();
      int i2 = getPaddingRight();
      paramInt1 = (int)(getScrollX() / (paramInt2 - i1 - i2 + paramInt4) * (paramInt1 - i - m + paramInt3));
    } else {
      float f1;
      f f2 = b(this.h);
      if (f2 != null) {
        f1 = Math.min(f2.e, this.t);
      } else {
        f1 = 0.0F;
      } 
      paramInt1 = (int)(f1 * (paramInt1 - getPaddingLeft() - getPaddingRight()));
      if (paramInt1 != getScrollX()) {
        a(false);
      } else {
        return;
      } 
    } 
    scrollTo(paramInt1, getScrollY());
  }
  
  private void a(int paramInt1, boolean paramBoolean1, int paramInt2, boolean paramBoolean2) {
    boolean bool;
    f f1 = b(paramInt1);
    if (f1 != null) {
      bool = (int)(getClientWidth() * Math.max(this.s, Math.min(f1.e, this.t)));
    } else {
      bool = false;
    } 
    if (paramBoolean1) {
      a(bool, 0, paramInt2);
      if (paramBoolean2) {
        d(paramInt1);
        return;
      } 
    } else {
      if (paramBoolean2)
        d(paramInt1); 
      a(false);
      scrollTo(bool, 0);
      f(bool);
    } 
  }
  
  private void a(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getActionIndex();
    if (paramMotionEvent.getPointerId(i) == this.I) {
      if (i == 0) {
        i = 1;
      } else {
        i = 0;
      } 
      this.E = paramMotionEvent.getX(i);
      this.I = paramMotionEvent.getPointerId(i);
      VelocityTracker velocityTracker = this.J;
      if (velocityTracker != null)
        velocityTracker.clear(); 
    } 
  }
  
  private void a(f paramf1, int paramInt, f paramf2) {
    float f2;
    float f3;
    int i2 = this.g.a();
    int i = getClientWidth();
    if (i > 0) {
      f2 = this.o / i;
    } else {
      f2 = 0.0F;
    } 
    if (paramf2 != null) {
      i = paramf2.b;
      int i3 = paramf1.b;
      if (i < i3) {
        i3 = 0;
        float f4 = paramf2.e + paramf2.d + f2;
        while (true) {
          int i4 = i + 1;
          if (i4 <= paramf1.b && i3 < this.d.size()) {
            while (true) {
              paramf2 = this.d.get(i3);
              i = i4;
              f3 = f4;
              if (i4 > paramf2.b) {
                i = i4;
                f3 = f4;
                if (i3 < this.d.size() - 1) {
                  i3++;
                  continue;
                } 
              } 
              break;
            } 
            while (i < paramf2.b) {
              f3 += this.g.a(i) + f2;
              i++;
            } 
            paramf2.e = f3;
            f4 = f3 + paramf2.d + f2;
            continue;
          } 
          break;
        } 
      } else if (i > i3) {
        i3 = this.d.size() - 1;
        float f4 = paramf2.e;
        while (--i >= paramf1.b && i3 >= 0) {
          int i4;
          while (true) {
            paramf2 = this.d.get(i3);
            i4 = i;
            f3 = f4;
            if (i < paramf2.b) {
              i4 = i;
              f3 = f4;
              if (i3 > 0) {
                i3--;
                continue;
              } 
            } 
            break;
          } 
          while (i4 > paramf2.b) {
            f3 -= this.g.a(i4) + f2;
            i4--;
          } 
          f4 = f3 - paramf2.d + f2;
          paramf2.e = f4;
          i = i4 - 1;
        } 
      } 
    } 
    int i1 = this.d.size();
    float f1 = paramf1.e;
    int m = paramf1.b;
    i = m - 1;
    if (m == 0) {
      f3 = f1;
    } else {
      f3 = -3.4028235E38F;
    } 
    this.s = f3;
    m = paramf1.b;
    if (m == --i2) {
      f3 = paramf1.e + paramf1.d - 1.0F;
    } else {
      f3 = Float.MAX_VALUE;
    } 
    this.t = f3;
    m = paramInt - 1;
    while (m >= 0) {
      paramf2 = this.d.get(m);
      while (true) {
        int i3 = paramf2.b;
        if (i > i3) {
          f1 -= this.g.a(i) + f2;
          i--;
          continue;
        } 
        f1 -= paramf2.d + f2;
        paramf2.e = f1;
        if (i3 == 0)
          this.s = f1; 
        break;
      } 
      m--;
      i--;
    } 
    f1 = paramf1.e + paramf1.d + f2;
    m = paramf1.b + 1;
    i = paramInt + 1;
    for (paramInt = m; i < i1; paramInt++) {
      paramf1 = this.d.get(i);
      while (true) {
        m = paramf1.b;
        if (paramInt < m) {
          f1 += this.g.a(paramInt) + f2;
          paramInt++;
          continue;
        } 
        if (m == i2)
          this.t = paramf1.d + f1 - 1.0F; 
        break;
      } 
      paramf1.e = f1;
      f1 += paramf1.d + f2;
      i++;
    } 
  }
  
  private void a(boolean paramBoolean) {
    if (this.g0 == 2) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      setScrollingCacheEnabled(false);
      if ((this.l.isFinished() ^ true) != 0) {
        this.l.abortAnimation();
        int i1 = getScrollX();
        int i2 = getScrollY();
        int i3 = this.l.getCurrX();
        int i4 = this.l.getCurrY();
        if (i1 != i3 || i2 != i4) {
          scrollTo(i3, i4);
          if (i3 != i1)
            f(i3); 
        } 
      } 
    } 
    this.x = false;
    byte b1 = 0;
    int m = i;
    for (int i = b1; i < this.d.size(); i++) {
      f f1 = this.d.get(i);
      if (f1.c) {
        f1.c = false;
        m = 1;
      } 
    } 
    if (m != 0) {
      if (paramBoolean) {
        v.a((View)this, this.f0);
        return;
      } 
      this.f0.run();
    } 
  }
  
  private boolean a(float paramFloat1, float paramFloat2) {
    return ((paramFloat1 < this.C && paramFloat2 > 0.0F) || (paramFloat1 > (getWidth() - this.C) && paramFloat2 < 0.0F));
  }
  
  private void b(int paramInt1, float paramFloat, int paramInt2) {
    j j2 = this.V;
    if (j2 != null)
      j2.a(paramInt1, paramFloat, paramInt2); 
    List<j> list = this.U;
    if (list != null) {
      int i = 0;
      int m = list.size();
      while (i < m) {
        j j3 = this.U.get(i);
        if (j3 != null)
          j3.a(paramInt1, paramFloat, paramInt2); 
        i++;
      } 
    } 
    j j1 = this.W;
    if (j1 != null)
      j1.a(paramInt1, paramFloat, paramInt2); 
  }
  
  private void b(boolean paramBoolean) {
    int m = getChildCount();
    for (int i = 0; i < m; i++) {
      boolean bool;
      if (paramBoolean) {
        bool = this.c0;
      } else {
        bool = false;
      } 
      getChildAt(i).setLayerType(bool, null);
    } 
  }
  
  private boolean b(float paramFloat) {
    boolean bool1;
    float f1 = this.E;
    this.E = paramFloat;
    float f2 = getScrollX() + f1 - paramFloat;
    float f3 = getClientWidth();
    paramFloat = this.s * f3;
    f1 = this.t * f3;
    ArrayList<f> arrayList1 = this.d;
    boolean bool3 = false;
    boolean bool4 = false;
    boolean bool2 = false;
    f f4 = arrayList1.get(0);
    ArrayList<f> arrayList2 = this.d;
    f f5 = arrayList2.get(arrayList2.size() - 1);
    if (f4.b != 0) {
      paramFloat = f4.e * f3;
      i = 0;
    } else {
      i = 1;
    } 
    if (f5.b != this.g.a() - 1) {
      f1 = f5.e * f3;
      bool1 = false;
    } else {
      bool1 = true;
    } 
    if (f2 < paramFloat) {
      if (i) {
        this.P.onPull(Math.abs(paramFloat - f2) / f3);
        bool2 = true;
      } 
    } else {
      bool2 = bool4;
      paramFloat = f2;
      if (f2 > f1) {
        bool2 = bool3;
        if (bool1) {
          this.Q.onPull(Math.abs(f2 - f1) / f3);
          bool2 = true;
        } 
        paramFloat = f1;
      } 
    } 
    f1 = this.E;
    int i = (int)paramFloat;
    this.E = f1 + paramFloat - i;
    scrollTo(i, getScrollY());
    f(i);
    return bool2;
  }
  
  private void c(boolean paramBoolean) {
    ViewParent viewParent = getParent();
    if (viewParent != null)
      viewParent.requestDisallowInterceptTouchEvent(paramBoolean); 
  }
  
  private static boolean c(View paramView) {
    return (paramView.getClass().getAnnotation(e.class) != null);
  }
  
  private void d(int paramInt) {
    j j2 = this.V;
    if (j2 != null)
      j2.b(paramInt); 
    List<j> list = this.U;
    if (list != null) {
      int i = 0;
      int m = list.size();
      while (i < m) {
        j j3 = this.U.get(i);
        if (j3 != null)
          j3.b(paramInt); 
        i++;
      } 
    } 
    j j1 = this.W;
    if (j1 != null)
      j1.b(paramInt); 
  }
  
  private void e(int paramInt) {
    j j2 = this.V;
    if (j2 != null)
      j2.a(paramInt); 
    List<j> list = this.U;
    if (list != null) {
      int i = 0;
      int m = list.size();
      while (i < m) {
        j j3 = this.U.get(i);
        if (j3 != null)
          j3.a(paramInt); 
        i++;
      } 
    } 
    j j1 = this.W;
    if (j1 != null)
      j1.a(paramInt); 
  }
  
  private void f() {
    this.z = false;
    this.A = false;
    VelocityTracker velocityTracker = this.J;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.J = null;
    } 
  }
  
  private boolean f(int paramInt) {
    if (this.d.size() == 0) {
      if (this.R)
        return false; 
      this.S = false;
      a(0, 0.0F, 0);
      if (this.S)
        return false; 
      throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    } 
    f f3 = g();
    int m = getClientWidth();
    int i1 = this.o;
    float f2 = i1;
    float f1 = m;
    f2 /= f1;
    int i = f3.b;
    f1 = (paramInt / f1 - f3.e) / (f3.d + f2);
    paramInt = (int)((m + i1) * f1);
    this.S = false;
    a(i, f1, paramInt);
    if (this.S)
      return true; 
    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
  }
  
  private f g() {
    float f1;
    float f2;
    int i = getClientWidth();
    if (i > 0) {
      f1 = getScrollX() / i;
    } else {
      f1 = 0.0F;
    } 
    if (i > 0) {
      f2 = this.o / i;
    } else {
      f2 = 0.0F;
    } 
    f f5 = null;
    i = 0;
    boolean bool = true;
    int m = -1;
    float f3 = 0.0F;
    float f4 = 0.0F;
    while (i < this.d.size()) {
      f f7 = this.d.get(i);
      int i1 = i;
      f f6 = f7;
      if (!bool) {
        int i2 = f7.b;
        m++;
        i1 = i;
        f6 = f7;
        if (i2 != m) {
          f6 = this.e;
          f6.e = f3 + f4 + f2;
          f6.b = m;
          f6.d = this.g.a(f6.b);
          i1 = i - 1;
        } 
      } 
      f3 = f6.e;
      f4 = f6.d;
      if (bool || f1 >= f3) {
        if (f1 >= f4 + f3 + f2) {
          if (i1 == this.d.size() - 1)
            return f6; 
          m = f6.b;
          f4 = f6.d;
          i = i1 + 1;
          bool = false;
          f5 = f6;
          continue;
        } 
        return f6;
      } 
      return f5;
    } 
    return f5;
  }
  
  private int getClientWidth() {
    return getMeasuredWidth() - getPaddingLeft() - getPaddingRight();
  }
  
  private void h() {
    for (int i = 0; i < getChildCount(); i = m + 1) {
      int m = i;
      if (!((g)getChildAt(i).getLayoutParams()).a) {
        removeViewAt(i);
        m = i - 1;
      } 
    } 
  }
  
  private boolean i() {
    this.I = -1;
    f();
    this.P.onRelease();
    this.Q.onRelease();
    return (this.P.isFinished() || this.Q.isFinished());
  }
  
  private void j() {
    if (this.d0 != 0) {
      ArrayList<View> arrayList = this.e0;
      if (arrayList == null) {
        this.e0 = new ArrayList<View>();
      } else {
        arrayList.clear();
      } 
      int m = getChildCount();
      for (int i = 0; i < m; i++) {
        View view = getChildAt(i);
        this.e0.add(view);
      } 
      Collections.sort(this.e0, k0);
    } 
  }
  
  private void setScrollingCacheEnabled(boolean paramBoolean) {
    if (this.w != paramBoolean)
      this.w = paramBoolean; 
  }
  
  float a(float paramFloat) {
    return (float)Math.sin(((paramFloat - 0.5F) * 0.47123894F));
  }
  
  f a(int paramInt1, int paramInt2) {
    f f1 = new f();
    f1.b = paramInt1;
    f1.a = this.g.a(this, paramInt1);
    f1.d = this.g.a(paramInt1);
    if (paramInt2 < 0 || paramInt2 >= this.d.size()) {
      this.d.add(f1);
      return f1;
    } 
    this.d.add(paramInt2, f1);
    return f1;
  }
  
  f a(View paramView) {
    while (true) {
      ViewParent viewParent = paramView.getParent();
      if (viewParent != this) {
        if (viewParent != null) {
          if (!(viewParent instanceof View))
            return null; 
          paramView = (View)viewParent;
          continue;
        } 
        continue;
      } 
      return b(paramView);
    } 
  }
  
  void a() {
    Object object1;
    int i;
    Object object2;
    int i1;
    int i5 = this.g.a();
    this.c = i5;
    if (this.d.size() < this.y * 2 + 1 && this.d.size() < i5) {
      m = 1;
    } else {
      m = 0;
    } 
    int i2 = this.h;
    int i4 = m;
    int m = i2;
    int i3 = 0;
    i2 = 0;
    while (i3 < this.d.size()) {
      f f1 = this.d.get(i3);
      int i9 = this.g.a(f1.a);
      if (i9 == -1) {
        int i10 = i3;
        Object object3 = object2;
        Object object4 = object1;
        continue;
      } 
      if (i9 == -2) {
        byte b1;
        this.d.remove(i3);
        int i10 = i3 - 1;
        Object object = object2;
        if (object2 == null) {
          this.g.b(this);
          b1 = 1;
        } 
        this.g.a(this, f1.b, f1.a);
        i4 = this.h;
        i3 = i10;
        i1 = b1;
        if (i4 == f1.b) {
          i = Math.max(0, Math.min(i4, i5 - 1));
          i1 = b1;
          i3 = i10;
        } 
      } else {
        int i13 = f1.b;
        int i10 = i3;
        int i11 = i1;
        int i12 = i;
        if (i13 != i9) {
          if (i13 == this.h)
            i = i9; 
          f1.b = i9;
        } else {
          continue;
        } 
      } 
      i4 = 1;
      int i6 = i3;
      int i7 = i1;
      int i8 = i;
      continue;
      i3 = SYNTHETIC_LOCAL_VARIABLE_4 + 1;
      object2 = SYNTHETIC_LOCAL_VARIABLE_5;
      object1 = SYNTHETIC_LOCAL_VARIABLE_7;
    } 
    if (i1)
      this.g.a(this); 
    Collections.sort(this.d, i0);
    if (i4 != 0) {
      i3 = getChildCount();
      for (i1 = 0; i1 < i3; i1++) {
        g g = (g)getChildAt(i1).getLayoutParams();
        if (!g.a)
          g.c = 0.0F; 
      } 
      a(i, false, true);
      requestLayout();
    } 
  }
  
  protected void a(int paramInt1, float paramFloat, int paramInt2) {
    int i = this.T;
    boolean bool = false;
    if (i > 0) {
      int i2 = getScrollX();
      i = getPaddingLeft();
      int m = getPaddingRight();
      int i3 = getWidth();
      int i4 = getChildCount();
      int i1;
      for (i1 = 0; i1 < i4; i1++) {
        View view = getChildAt(i1);
        g g = (g)view.getLayoutParams();
        if (g.a) {
          int i5 = g.b & 0x7;
          if (i5 != 1) {
            if (i5 != 3) {
              if (i5 != 5) {
                int i6 = i;
                i5 = i;
                i = i6;
              } else {
                i5 = i3 - m - view.getMeasuredWidth();
                m += view.getMeasuredWidth();
              } 
            } else {
              int i6 = view.getWidth() + i;
              i5 = i;
              i = i6;
            } 
          } else {
            i5 = Math.max((i3 - view.getMeasuredWidth()) / 2, i);
          } 
          i5 = i5 + i2 - view.getLeft();
          if (i5 != 0)
            view.offsetLeftAndRight(i5); 
        } 
      } 
    } 
    b(paramInt1, paramFloat, paramInt2);
    if (this.b0 != null) {
      paramInt2 = getScrollX();
      i = getChildCount();
      for (paramInt1 = bool; paramInt1 < i; paramInt1++) {
        View view = getChildAt(paramInt1);
        if (!((g)view.getLayoutParams()).a) {
          paramFloat = (view.getLeft() - paramInt2) / getClientWidth();
          this.b0.a(view, paramFloat);
        } 
      } 
    } 
    this.S = true;
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3) {
    int i;
    if (getChildCount() == 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    Scroller scroller = this.l;
    if (scroller != null && !scroller.isFinished()) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      if (this.m) {
        i = this.l.getCurrX();
      } else {
        i = this.l.getStartX();
      } 
      this.l.abortAnimation();
      setScrollingCacheEnabled(false);
    } else {
      i = getScrollX();
    } 
    int m = getScrollY();
    int i1 = paramInt1 - i;
    paramInt2 -= m;
    if (i1 == 0 && paramInt2 == 0) {
      a(false);
      e();
      setScrollState(0);
      return;
    } 
    setScrollingCacheEnabled(true);
    setScrollState(2);
    paramInt1 = getClientWidth();
    int i2 = paramInt1 / 2;
    float f2 = Math.abs(i1);
    float f1 = paramInt1;
    float f3 = Math.min(1.0F, f2 * 1.0F / f1);
    f2 = i2;
    f3 = a(f3);
    paramInt1 = Math.abs(paramInt3);
    if (paramInt1 > 0) {
      paramInt1 = Math.round(Math.abs((f2 + f3 * f2) / paramInt1) * 1000.0F) * 4;
    } else {
      f2 = this.g.a(this.h);
      paramInt1 = (int)((Math.abs(i1) / (f1 * f2 + this.o) + 1.0F) * 100.0F);
    } 
    paramInt1 = Math.min(paramInt1, 600);
    this.m = false;
    this.l.startScroll(i, m, i1, paramInt2, paramInt1);
    v.M((View)this);
  }
  
  public void a(int paramInt, boolean paramBoolean) {
    this.x = false;
    a(paramInt, paramBoolean, false);
  }
  
  void a(int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
    a(paramInt, paramBoolean1, paramBoolean2, 0);
  }
  
  void a(int paramInt1, boolean paramBoolean1, boolean paramBoolean2, int paramInt2) {
    int i;
    a a1 = this.g;
    if (a1 == null || a1.a() <= 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    if (!paramBoolean2 && this.h == paramInt1 && this.d.size() != 0) {
      setScrollingCacheEnabled(false);
      return;
    } 
    paramBoolean2 = true;
    if (paramInt1 < 0) {
      i = 0;
    } else {
      i = paramInt1;
      if (paramInt1 >= this.g.a())
        i = this.g.a() - 1; 
    } 
    paramInt1 = this.y;
    int m = this.h;
    if (i > m + paramInt1 || i < m - paramInt1)
      for (paramInt1 = 0; paramInt1 < this.d.size(); paramInt1++)
        ((f)this.d.get(paramInt1)).c = true;  
    if (this.h == i)
      paramBoolean2 = false; 
    if (this.R) {
      this.h = i;
      if (paramBoolean2)
        d(i); 
      requestLayout();
      return;
    } 
    c(i);
    a(i, paramBoolean1, paramInt2, paramBoolean2);
  }
  
  public boolean a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual findFocus : ()Landroid/view/View;
    //   4: astore #7
    //   6: iconst_0
    //   7: istore #4
    //   9: aconst_null
    //   10: astore #6
    //   12: aload #7
    //   14: aload_0
    //   15: if_acmpne -> 25
    //   18: aload #6
    //   20: astore #5
    //   22: goto -> 199
    //   25: aload #7
    //   27: ifnull -> 195
    //   30: aload #7
    //   32: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   35: astore #5
    //   37: aload #5
    //   39: instanceof android/view/ViewGroup
    //   42: ifeq -> 68
    //   45: aload #5
    //   47: aload_0
    //   48: if_acmpne -> 56
    //   51: iconst_1
    //   52: istore_2
    //   53: goto -> 70
    //   56: aload #5
    //   58: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   63: astore #5
    //   65: goto -> 37
    //   68: iconst_0
    //   69: istore_2
    //   70: iload_2
    //   71: ifne -> 195
    //   74: new java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial <init> : ()V
    //   81: astore #8
    //   83: aload #8
    //   85: aload #7
    //   87: invokevirtual getClass : ()Ljava/lang/Class;
    //   90: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: aload #7
    //   99: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   102: astore #5
    //   104: aload #5
    //   106: instanceof android/view/ViewGroup
    //   109: ifeq -> 147
    //   112: aload #8
    //   114: ldc_w ' => '
    //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   120: pop
    //   121: aload #8
    //   123: aload #5
    //   125: invokevirtual getClass : ()Ljava/lang/Class;
    //   128: invokevirtual getSimpleName : ()Ljava/lang/String;
    //   131: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload #5
    //   137: invokeinterface getParent : ()Landroid/view/ViewParent;
    //   142: astore #5
    //   144: goto -> 104
    //   147: new java/lang/StringBuilder
    //   150: dup
    //   151: invokespecial <init> : ()V
    //   154: astore #5
    //   156: aload #5
    //   158: ldc_w 'arrowScroll tried to find focus based on non-child current focused view '
    //   161: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   164: pop
    //   165: aload #5
    //   167: aload #8
    //   169: invokevirtual toString : ()Ljava/lang/String;
    //   172: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: pop
    //   176: ldc_w 'ViewPager'
    //   179: aload #5
    //   181: invokevirtual toString : ()Ljava/lang/String;
    //   184: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   187: pop
    //   188: aload #6
    //   190: astore #5
    //   192: goto -> 199
    //   195: aload #7
    //   197: astore #5
    //   199: invokestatic getInstance : ()Landroid/view/FocusFinder;
    //   202: aload_0
    //   203: aload #5
    //   205: iload_1
    //   206: invokevirtual findNextFocus : (Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
    //   209: astore #6
    //   211: aload #6
    //   213: ifnull -> 339
    //   216: aload #6
    //   218: aload #5
    //   220: if_acmpeq -> 339
    //   223: iload_1
    //   224: bipush #17
    //   226: if_icmpne -> 286
    //   229: aload_0
    //   230: aload_0
    //   231: getfield f : Landroid/graphics/Rect;
    //   234: aload #6
    //   236: invokespecial a : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   239: getfield left : I
    //   242: istore_2
    //   243: aload_0
    //   244: aload_0
    //   245: getfield f : Landroid/graphics/Rect;
    //   248: aload #5
    //   250: invokespecial a : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   253: getfield left : I
    //   256: istore_3
    //   257: aload #5
    //   259: ifnull -> 276
    //   262: iload_2
    //   263: iload_3
    //   264: if_icmplt -> 276
    //   267: aload_0
    //   268: invokevirtual c : ()Z
    //   271: istore #4
    //   273: goto -> 283
    //   276: aload #6
    //   278: invokevirtual requestFocus : ()Z
    //   281: istore #4
    //   283: goto -> 379
    //   286: iload_1
    //   287: bipush #66
    //   289: if_icmpne -> 379
    //   292: aload_0
    //   293: aload_0
    //   294: getfield f : Landroid/graphics/Rect;
    //   297: aload #6
    //   299: invokespecial a : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   302: getfield left : I
    //   305: istore_2
    //   306: aload_0
    //   307: aload_0
    //   308: getfield f : Landroid/graphics/Rect;
    //   311: aload #5
    //   313: invokespecial a : (Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
    //   316: getfield left : I
    //   319: istore_3
    //   320: aload #5
    //   322: ifnull -> 276
    //   325: iload_2
    //   326: iload_3
    //   327: if_icmpgt -> 276
    //   330: aload_0
    //   331: invokevirtual d : ()Z
    //   334: istore #4
    //   336: goto -> 283
    //   339: iload_1
    //   340: bipush #17
    //   342: if_icmpeq -> 373
    //   345: iload_1
    //   346: iconst_1
    //   347: if_icmpne -> 353
    //   350: goto -> 373
    //   353: iload_1
    //   354: bipush #66
    //   356: if_icmpeq -> 364
    //   359: iload_1
    //   360: iconst_2
    //   361: if_icmpne -> 379
    //   364: aload_0
    //   365: invokevirtual d : ()Z
    //   368: istore #4
    //   370: goto -> 379
    //   373: aload_0
    //   374: invokevirtual c : ()Z
    //   377: istore #4
    //   379: iload #4
    //   381: ifeq -> 392
    //   384: aload_0
    //   385: iload_1
    //   386: invokestatic getContantForFocusDirection : (I)I
    //   389: invokevirtual playSoundEffect : (I)V
    //   392: iload #4
    //   394: ireturn
  }
  
  public boolean a(KeyEvent paramKeyEvent) {
    if (paramKeyEvent.getAction() == 0) {
      int i = paramKeyEvent.getKeyCode();
      if (i != 21) {
        if (i != 22) {
          if (i == 61) {
            if (paramKeyEvent.hasNoModifiers())
              return a(2); 
            if (paramKeyEvent.hasModifiers(1))
              return a(1); 
          } 
        } else {
          if (paramKeyEvent.hasModifiers(2))
            return d(); 
          i = 66;
          return a(i);
        } 
      } else {
        if (paramKeyEvent.hasModifiers(2))
          return c(); 
        i = 17;
        return a(i);
      } 
    } 
    return false;
  }
  
  protected boolean a(View paramView, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3) {
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      int m = paramView.getScrollX();
      int i1 = paramView.getScrollY();
      int i;
      for (i = viewGroup.getChildCount() - 1; i >= 0; i--) {
        View view = viewGroup.getChildAt(i);
        int i2 = paramInt2 + m;
        if (i2 >= view.getLeft() && i2 < view.getRight()) {
          int i3 = paramInt3 + i1;
          if (i3 >= view.getTop() && i3 < view.getBottom() && a(view, true, paramInt1, i2 - view.getLeft(), i3 - view.getTop()))
            return true; 
        } 
      } 
    } 
    return (paramBoolean && paramView.canScrollHorizontally(-paramInt1));
  }
  
  public void addFocusables(ArrayList<View> paramArrayList, int paramInt1, int paramInt2) {
    int i = paramArrayList.size();
    int m = getDescendantFocusability();
    if (m != 393216) {
      int i1;
      for (i1 = 0; i1 < getChildCount(); i1++) {
        View view = getChildAt(i1);
        if (view.getVisibility() == 0) {
          f f1 = b(view);
          if (f1 != null && f1.b == this.h)
            view.addFocusables(paramArrayList, paramInt1, paramInt2); 
        } 
      } 
    } 
    if (m != 262144 || i == paramArrayList.size()) {
      if (!isFocusable())
        return; 
      if ((paramInt2 & 0x1) == 1 && isInTouchMode() && !isFocusableInTouchMode())
        return; 
      if (paramArrayList != null)
        paramArrayList.add(this); 
    } 
  }
  
  public void addTouchables(ArrayList<View> paramArrayList) {
    for (int i = 0; i < getChildCount(); i++) {
      View view = getChildAt(i);
      if (view.getVisibility() == 0) {
        f f1 = b(view);
        if (f1 != null && f1.b == this.h)
          view.addTouchables(paramArrayList); 
      } 
    } 
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams) {
    ViewGroup.LayoutParams layoutParams = paramLayoutParams;
    if (!checkLayoutParams(paramLayoutParams))
      layoutParams = generateLayoutParams(paramLayoutParams); 
    paramLayoutParams = layoutParams;
    ((g)paramLayoutParams).a |= c(paramView);
    if (this.v) {
      if (paramLayoutParams == null || !((g)paramLayoutParams).a) {
        ((g)paramLayoutParams).d = true;
        addViewInLayout(paramView, paramInt, layoutParams);
        return;
      } 
      throw new IllegalStateException("Cannot add pager decor view during layout");
    } 
    super.addView(paramView, paramInt, layoutParams);
  }
  
  f b(int paramInt) {
    for (int i = 0; i < this.d.size(); i++) {
      f f1 = this.d.get(i);
      if (f1.b == paramInt)
        return f1; 
    } 
    return null;
  }
  
  f b(View paramView) {
    for (int i = 0; i < this.d.size(); i++) {
      f f1 = this.d.get(i);
      if (this.g.a(paramView, f1.a))
        return f1; 
    } 
    return null;
  }
  
  void b() {
    setWillNotDraw(false);
    setDescendantFocusability(262144);
    setFocusable(true);
    Context context = getContext();
    this.l = new Scroller(context, j0);
    ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
    float f1 = (context.getResources().getDisplayMetrics()).density;
    this.D = viewConfiguration.getScaledPagingTouchSlop();
    this.K = (int)(400.0F * f1);
    this.L = viewConfiguration.getScaledMaximumFlingVelocity();
    this.P = new EdgeEffect(context);
    this.Q = new EdgeEffect(context);
    this.M = (int)(25.0F * f1);
    this.N = (int)(2.0F * f1);
    this.B = (int)(f1 * 16.0F);
    v.a((View)this, new h(this));
    if (v.n((View)this) == 0)
      v.h((View)this, 1); 
    v.a((View)this, new d(this));
  }
  
  void c(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: getfield h : I
    //   4: istore #5
    //   6: iload #5
    //   8: iload_1
    //   9: if_icmpeq -> 28
    //   12: aload_0
    //   13: iload #5
    //   15: invokevirtual b : (I)Lb/t/a/b$f;
    //   18: astore #14
    //   20: aload_0
    //   21: iload_1
    //   22: putfield h : I
    //   25: goto -> 31
    //   28: aconst_null
    //   29: astore #14
    //   31: aload_0
    //   32: getfield g : Lb/t/a/a;
    //   35: ifnonnull -> 43
    //   38: aload_0
    //   39: invokespecial j : ()V
    //   42: return
    //   43: aload_0
    //   44: getfield x : Z
    //   47: ifeq -> 55
    //   50: aload_0
    //   51: invokespecial j : ()V
    //   54: return
    //   55: aload_0
    //   56: invokevirtual getWindowToken : ()Landroid/os/IBinder;
    //   59: ifnonnull -> 63
    //   62: return
    //   63: aload_0
    //   64: getfield g : Lb/t/a/a;
    //   67: aload_0
    //   68: invokevirtual b : (Landroid/view/ViewGroup;)V
    //   71: aload_0
    //   72: getfield y : I
    //   75: istore_1
    //   76: iconst_0
    //   77: aload_0
    //   78: getfield h : I
    //   81: iload_1
    //   82: isub
    //   83: invokestatic max : (II)I
    //   86: istore #11
    //   88: aload_0
    //   89: getfield g : Lb/t/a/a;
    //   92: invokevirtual a : ()I
    //   95: istore #9
    //   97: iload #9
    //   99: iconst_1
    //   100: isub
    //   101: aload_0
    //   102: getfield h : I
    //   105: iload_1
    //   106: iadd
    //   107: invokestatic min : (II)I
    //   110: istore #10
    //   112: iload #9
    //   114: aload_0
    //   115: getfield c : I
    //   118: if_icmpne -> 1144
    //   121: iconst_0
    //   122: istore_1
    //   123: iload_1
    //   124: aload_0
    //   125: getfield d : Ljava/util/ArrayList;
    //   128: invokevirtual size : ()I
    //   131: if_icmpge -> 184
    //   134: aload_0
    //   135: getfield d : Ljava/util/ArrayList;
    //   138: iload_1
    //   139: invokevirtual get : (I)Ljava/lang/Object;
    //   142: checkcast b/t/a/b$f
    //   145: astore #13
    //   147: aload #13
    //   149: getfield b : I
    //   152: istore #5
    //   154: aload_0
    //   155: getfield h : I
    //   158: istore #6
    //   160: iload #5
    //   162: iload #6
    //   164: if_icmplt -> 177
    //   167: iload #5
    //   169: iload #6
    //   171: if_icmpne -> 184
    //   174: goto -> 187
    //   177: iload_1
    //   178: iconst_1
    //   179: iadd
    //   180: istore_1
    //   181: goto -> 123
    //   184: aconst_null
    //   185: astore #13
    //   187: aload #13
    //   189: astore #15
    //   191: aload #13
    //   193: ifnonnull -> 216
    //   196: aload #13
    //   198: astore #15
    //   200: iload #9
    //   202: ifle -> 216
    //   205: aload_0
    //   206: aload_0
    //   207: getfield h : I
    //   210: iload_1
    //   211: invokevirtual a : (II)Lb/t/a/b$f;
    //   214: astore #15
    //   216: aload #15
    //   218: ifnull -> 928
    //   221: iload_1
    //   222: iconst_1
    //   223: isub
    //   224: istore #5
    //   226: iload #5
    //   228: iflt -> 248
    //   231: aload_0
    //   232: getfield d : Ljava/util/ArrayList;
    //   235: iload #5
    //   237: invokevirtual get : (I)Ljava/lang/Object;
    //   240: checkcast b/t/a/b$f
    //   243: astore #13
    //   245: goto -> 251
    //   248: aconst_null
    //   249: astore #13
    //   251: aload_0
    //   252: invokespecial getClientWidth : ()I
    //   255: istore #12
    //   257: iload #12
    //   259: ifgt -> 268
    //   262: fconst_0
    //   263: fstore #4
    //   265: goto -> 287
    //   268: fconst_2
    //   269: aload #15
    //   271: getfield d : F
    //   274: fsub
    //   275: aload_0
    //   276: invokevirtual getPaddingLeft : ()I
    //   279: i2f
    //   280: iload #12
    //   282: i2f
    //   283: fdiv
    //   284: fadd
    //   285: fstore #4
    //   287: aload_0
    //   288: getfield h : I
    //   291: iconst_1
    //   292: isub
    //   293: istore #8
    //   295: fconst_0
    //   296: fstore_3
    //   297: iload #8
    //   299: iflt -> 562
    //   302: fload_3
    //   303: fload #4
    //   305: fcmpl
    //   306: iflt -> 420
    //   309: iload #8
    //   311: iload #11
    //   313: if_icmpge -> 420
    //   316: aload #13
    //   318: ifnonnull -> 324
    //   321: goto -> 562
    //   324: fload_3
    //   325: fstore_2
    //   326: iload_1
    //   327: istore #7
    //   329: aload #13
    //   331: astore #16
    //   333: iload #5
    //   335: istore #6
    //   337: iload #8
    //   339: aload #13
    //   341: getfield b : I
    //   344: if_icmpne -> 540
    //   347: fload_3
    //   348: fstore_2
    //   349: iload_1
    //   350: istore #7
    //   352: aload #13
    //   354: astore #16
    //   356: iload #5
    //   358: istore #6
    //   360: aload #13
    //   362: getfield c : Z
    //   365: ifne -> 540
    //   368: aload_0
    //   369: getfield d : Ljava/util/ArrayList;
    //   372: iload #5
    //   374: invokevirtual remove : (I)Ljava/lang/Object;
    //   377: pop
    //   378: aload_0
    //   379: getfield g : Lb/t/a/a;
    //   382: aload_0
    //   383: iload #8
    //   385: aload #13
    //   387: getfield a : Ljava/lang/Object;
    //   390: invokevirtual a : (Landroid/view/ViewGroup;ILjava/lang/Object;)V
    //   393: iload #5
    //   395: iconst_1
    //   396: isub
    //   397: istore #5
    //   399: iload_1
    //   400: iconst_1
    //   401: isub
    //   402: istore_1
    //   403: fload_3
    //   404: fstore_2
    //   405: iload_1
    //   406: istore #6
    //   408: iload #5
    //   410: istore #7
    //   412: iload #5
    //   414: iflt -> 519
    //   417: goto -> 500
    //   420: aload #13
    //   422: ifnull -> 466
    //   425: iload #8
    //   427: aload #13
    //   429: getfield b : I
    //   432: if_icmpne -> 466
    //   435: fload_3
    //   436: aload #13
    //   438: getfield d : F
    //   441: fadd
    //   442: fstore_3
    //   443: iload #5
    //   445: iconst_1
    //   446: isub
    //   447: istore #5
    //   449: fload_3
    //   450: fstore_2
    //   451: iload_1
    //   452: istore #6
    //   454: iload #5
    //   456: istore #7
    //   458: iload #5
    //   460: iflt -> 519
    //   463: goto -> 500
    //   466: fload_3
    //   467: aload_0
    //   468: iload #8
    //   470: iload #5
    //   472: iconst_1
    //   473: iadd
    //   474: invokevirtual a : (II)Lb/t/a/b$f;
    //   477: getfield d : F
    //   480: fadd
    //   481: fstore_3
    //   482: iload_1
    //   483: iconst_1
    //   484: iadd
    //   485: istore_1
    //   486: fload_3
    //   487: fstore_2
    //   488: iload_1
    //   489: istore #6
    //   491: iload #5
    //   493: istore #7
    //   495: iload #5
    //   497: iflt -> 519
    //   500: aload_0
    //   501: getfield d : Ljava/util/ArrayList;
    //   504: iload #5
    //   506: invokevirtual get : (I)Ljava/lang/Object;
    //   509: checkcast b/t/a/b$f
    //   512: astore #13
    //   514: fload_3
    //   515: fstore_2
    //   516: goto -> 529
    //   519: aconst_null
    //   520: astore #13
    //   522: iload #7
    //   524: istore #5
    //   526: iload #6
    //   528: istore_1
    //   529: iload #5
    //   531: istore #6
    //   533: aload #13
    //   535: astore #16
    //   537: iload_1
    //   538: istore #7
    //   540: iload #8
    //   542: iconst_1
    //   543: isub
    //   544: istore #8
    //   546: fload_2
    //   547: fstore_3
    //   548: iload #7
    //   550: istore_1
    //   551: aload #16
    //   553: astore #13
    //   555: iload #6
    //   557: istore #5
    //   559: goto -> 297
    //   562: aload #15
    //   564: getfield d : F
    //   567: fstore_3
    //   568: iload_1
    //   569: iconst_1
    //   570: iadd
    //   571: istore #5
    //   573: fload_3
    //   574: fconst_2
    //   575: fcmpg
    //   576: ifge -> 902
    //   579: iload #5
    //   581: aload_0
    //   582: getfield d : Ljava/util/ArrayList;
    //   585: invokevirtual size : ()I
    //   588: if_icmpge -> 608
    //   591: aload_0
    //   592: getfield d : Ljava/util/ArrayList;
    //   595: iload #5
    //   597: invokevirtual get : (I)Ljava/lang/Object;
    //   600: checkcast b/t/a/b$f
    //   603: astore #13
    //   605: goto -> 611
    //   608: aconst_null
    //   609: astore #13
    //   611: iload #12
    //   613: ifgt -> 622
    //   616: fconst_0
    //   617: fstore #4
    //   619: goto -> 635
    //   622: aload_0
    //   623: invokevirtual getPaddingRight : ()I
    //   626: i2f
    //   627: iload #12
    //   629: i2f
    //   630: fdiv
    //   631: fconst_2
    //   632: fadd
    //   633: fstore #4
    //   635: aload_0
    //   636: getfield h : I
    //   639: istore #6
    //   641: aload #13
    //   643: astore #16
    //   645: iload #6
    //   647: iconst_1
    //   648: iadd
    //   649: istore #7
    //   651: iload #7
    //   653: iload #9
    //   655: if_icmpge -> 902
    //   658: fload_3
    //   659: fload #4
    //   661: fcmpl
    //   662: iflt -> 790
    //   665: iload #7
    //   667: iload #10
    //   669: if_icmple -> 790
    //   672: aload #16
    //   674: ifnonnull -> 680
    //   677: goto -> 902
    //   680: fload_3
    //   681: fstore_2
    //   682: iload #5
    //   684: istore #6
    //   686: aload #16
    //   688: astore #13
    //   690: iload #7
    //   692: aload #16
    //   694: getfield b : I
    //   697: if_icmpne -> 885
    //   700: fload_3
    //   701: fstore_2
    //   702: iload #5
    //   704: istore #6
    //   706: aload #16
    //   708: astore #13
    //   710: aload #16
    //   712: getfield c : Z
    //   715: ifne -> 885
    //   718: aload_0
    //   719: getfield d : Ljava/util/ArrayList;
    //   722: iload #5
    //   724: invokevirtual remove : (I)Ljava/lang/Object;
    //   727: pop
    //   728: aload_0
    //   729: getfield g : Lb/t/a/a;
    //   732: aload_0
    //   733: iload #7
    //   735: aload #16
    //   737: getfield a : Ljava/lang/Object;
    //   740: invokevirtual a : (Landroid/view/ViewGroup;ILjava/lang/Object;)V
    //   743: fload_3
    //   744: fstore_2
    //   745: iload #5
    //   747: istore #6
    //   749: iload #5
    //   751: aload_0
    //   752: getfield d : Ljava/util/ArrayList;
    //   755: invokevirtual size : ()I
    //   758: if_icmpge -> 784
    //   761: aload_0
    //   762: getfield d : Ljava/util/ArrayList;
    //   765: iload #5
    //   767: invokevirtual get : (I)Ljava/lang/Object;
    //   770: checkcast b/t/a/b$f
    //   773: astore #13
    //   775: fload_3
    //   776: fstore_2
    //   777: iload #5
    //   779: istore #6
    //   781: goto -> 885
    //   784: aconst_null
    //   785: astore #13
    //   787: goto -> 885
    //   790: aload #16
    //   792: ifnull -> 840
    //   795: iload #7
    //   797: aload #16
    //   799: getfield b : I
    //   802: if_icmpne -> 840
    //   805: fload_3
    //   806: aload #16
    //   808: getfield d : F
    //   811: fadd
    //   812: fstore_3
    //   813: iload #5
    //   815: iconst_1
    //   816: iadd
    //   817: istore #5
    //   819: fload_3
    //   820: fstore_2
    //   821: iload #5
    //   823: istore #6
    //   825: iload #5
    //   827: aload_0
    //   828: getfield d : Ljava/util/ArrayList;
    //   831: invokevirtual size : ()I
    //   834: if_icmpge -> 784
    //   837: goto -> 761
    //   840: aload_0
    //   841: iload #7
    //   843: iload #5
    //   845: invokevirtual a : (II)Lb/t/a/b$f;
    //   848: astore #13
    //   850: iload #5
    //   852: iconst_1
    //   853: iadd
    //   854: istore #5
    //   856: fload_3
    //   857: aload #13
    //   859: getfield d : F
    //   862: fadd
    //   863: fstore_3
    //   864: fload_3
    //   865: fstore_2
    //   866: iload #5
    //   868: istore #6
    //   870: iload #5
    //   872: aload_0
    //   873: getfield d : Ljava/util/ArrayList;
    //   876: invokevirtual size : ()I
    //   879: if_icmpge -> 784
    //   882: goto -> 761
    //   885: fload_2
    //   886: fstore_3
    //   887: iload #6
    //   889: istore #5
    //   891: aload #13
    //   893: astore #16
    //   895: iload #7
    //   897: istore #6
    //   899: goto -> 645
    //   902: aload_0
    //   903: aload #15
    //   905: iload_1
    //   906: aload #14
    //   908: invokespecial a : (Lb/t/a/b$f;ILb/t/a/b$f;)V
    //   911: aload_0
    //   912: getfield g : Lb/t/a/a;
    //   915: aload_0
    //   916: aload_0
    //   917: getfield h : I
    //   920: aload #15
    //   922: getfield a : Ljava/lang/Object;
    //   925: invokevirtual b : (Landroid/view/ViewGroup;ILjava/lang/Object;)V
    //   928: aload_0
    //   929: getfield g : Lb/t/a/a;
    //   932: aload_0
    //   933: invokevirtual a : (Landroid/view/ViewGroup;)V
    //   936: aload_0
    //   937: invokevirtual getChildCount : ()I
    //   940: istore #5
    //   942: iconst_0
    //   943: istore_1
    //   944: iload_1
    //   945: iload #5
    //   947: if_icmpge -> 1031
    //   950: aload_0
    //   951: iload_1
    //   952: invokevirtual getChildAt : (I)Landroid/view/View;
    //   955: astore #14
    //   957: aload #14
    //   959: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   962: checkcast b/t/a/b$g
    //   965: astore #13
    //   967: aload #13
    //   969: iload_1
    //   970: putfield f : I
    //   973: aload #13
    //   975: getfield a : Z
    //   978: ifne -> 1024
    //   981: aload #13
    //   983: getfield c : F
    //   986: fconst_0
    //   987: fcmpl
    //   988: ifne -> 1024
    //   991: aload_0
    //   992: aload #14
    //   994: invokevirtual b : (Landroid/view/View;)Lb/t/a/b$f;
    //   997: astore #14
    //   999: aload #14
    //   1001: ifnull -> 1024
    //   1004: aload #13
    //   1006: aload #14
    //   1008: getfield d : F
    //   1011: putfield c : F
    //   1014: aload #13
    //   1016: aload #14
    //   1018: getfield b : I
    //   1021: putfield e : I
    //   1024: iload_1
    //   1025: iconst_1
    //   1026: iadd
    //   1027: istore_1
    //   1028: goto -> 944
    //   1031: aload_0
    //   1032: invokespecial j : ()V
    //   1035: aload_0
    //   1036: invokevirtual hasFocus : ()Z
    //   1039: ifeq -> 1143
    //   1042: aload_0
    //   1043: invokevirtual findFocus : ()Landroid/view/View;
    //   1046: astore #13
    //   1048: aload #13
    //   1050: ifnull -> 1064
    //   1053: aload_0
    //   1054: aload #13
    //   1056: invokevirtual a : (Landroid/view/View;)Lb/t/a/b$f;
    //   1059: astore #13
    //   1061: goto -> 1067
    //   1064: aconst_null
    //   1065: astore #13
    //   1067: aload #13
    //   1069: ifnull -> 1084
    //   1072: aload #13
    //   1074: getfield b : I
    //   1077: aload_0
    //   1078: getfield h : I
    //   1081: if_icmpeq -> 1143
    //   1084: iconst_0
    //   1085: istore_1
    //   1086: iload_1
    //   1087: aload_0
    //   1088: invokevirtual getChildCount : ()I
    //   1091: if_icmpge -> 1143
    //   1094: aload_0
    //   1095: iload_1
    //   1096: invokevirtual getChildAt : (I)Landroid/view/View;
    //   1099: astore #13
    //   1101: aload_0
    //   1102: aload #13
    //   1104: invokevirtual b : (Landroid/view/View;)Lb/t/a/b$f;
    //   1107: astore #14
    //   1109: aload #14
    //   1111: ifnull -> 1136
    //   1114: aload #14
    //   1116: getfield b : I
    //   1119: aload_0
    //   1120: getfield h : I
    //   1123: if_icmpne -> 1136
    //   1126: aload #13
    //   1128: iconst_2
    //   1129: invokevirtual requestFocus : (I)Z
    //   1132: ifeq -> 1136
    //   1135: return
    //   1136: iload_1
    //   1137: iconst_1
    //   1138: iadd
    //   1139: istore_1
    //   1140: goto -> 1086
    //   1143: return
    //   1144: aload_0
    //   1145: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   1148: aload_0
    //   1149: invokevirtual getId : ()I
    //   1152: invokevirtual getResourceName : (I)Ljava/lang/String;
    //   1155: astore #13
    //   1157: goto -> 1169
    //   1160: aload_0
    //   1161: invokevirtual getId : ()I
    //   1164: invokestatic toHexString : (I)Ljava/lang/String;
    //   1167: astore #13
    //   1169: new java/lang/StringBuilder
    //   1172: dup
    //   1173: invokespecial <init> : ()V
    //   1176: astore #14
    //   1178: aload #14
    //   1180: ldc_w 'The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: '
    //   1183: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1186: pop
    //   1187: aload #14
    //   1189: aload_0
    //   1190: getfield c : I
    //   1193: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1196: pop
    //   1197: aload #14
    //   1199: ldc_w ', found: '
    //   1202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1205: pop
    //   1206: aload #14
    //   1208: iload #9
    //   1210: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1213: pop
    //   1214: aload #14
    //   1216: ldc_w ' Pager id: '
    //   1219: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1222: pop
    //   1223: aload #14
    //   1225: aload #13
    //   1227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1230: pop
    //   1231: aload #14
    //   1233: ldc_w ' Pager class: '
    //   1236: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1239: pop
    //   1240: aload #14
    //   1242: aload_0
    //   1243: invokevirtual getClass : ()Ljava/lang/Class;
    //   1246: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1249: pop
    //   1250: aload #14
    //   1252: ldc_w ' Problematic adapter: '
    //   1255: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1258: pop
    //   1259: aload #14
    //   1261: aload_0
    //   1262: getfield g : Lb/t/a/a;
    //   1265: invokevirtual getClass : ()Ljava/lang/Class;
    //   1268: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1271: pop
    //   1272: new java/lang/IllegalStateException
    //   1275: dup
    //   1276: aload #14
    //   1278: invokevirtual toString : ()Ljava/lang/String;
    //   1281: invokespecial <init> : (Ljava/lang/String;)V
    //   1284: astore #13
    //   1286: goto -> 1292
    //   1289: aload #13
    //   1291: athrow
    //   1292: goto -> 1289
    //   1295: astore #13
    //   1297: goto -> 1160
    // Exception table:
    //   from	to	target	type
    //   1144	1157	1295	android/content/res/Resources$NotFoundException
  }
  
  boolean c() {
    int i = this.h;
    if (i > 0) {
      a(i - 1, true);
      return true;
    } 
    return false;
  }
  
  public boolean canScrollHorizontally(int paramInt) {
    a a1 = this.g;
    boolean bool2 = false;
    boolean bool1 = false;
    if (a1 == null)
      return false; 
    int i = getClientWidth();
    int m = getScrollX();
    if (paramInt < 0) {
      if (m > (int)(i * this.s))
        bool1 = true; 
      return bool1;
    } 
    bool1 = bool2;
    if (paramInt > 0) {
      bool1 = bool2;
      if (m < (int)(i * this.t))
        bool1 = true; 
    } 
    return bool1;
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return (paramLayoutParams instanceof g && super.checkLayoutParams(paramLayoutParams));
  }
  
  public void computeScroll() {
    this.m = true;
    if (!this.l.isFinished() && this.l.computeScrollOffset()) {
      int i = getScrollX();
      int m = getScrollY();
      int i1 = this.l.getCurrX();
      int i2 = this.l.getCurrY();
      if (i != i1 || m != i2) {
        scrollTo(i1, i2);
        if (!f(i1)) {
          this.l.abortAnimation();
          scrollTo(0, i2);
        } 
      } 
      v.M((View)this);
      return;
    } 
    a(true);
  }
  
  boolean d() {
    a a1 = this.g;
    if (a1 != null && this.h < a1.a() - 1) {
      a(this.h + 1, true);
      return true;
    } 
    return false;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent) {
    return (super.dispatchKeyEvent(paramKeyEvent) || a(paramKeyEvent));
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    if (paramAccessibilityEvent.getEventType() == 4096)
      return super.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent); 
    int m = getChildCount();
    for (int i = 0; i < m; i++) {
      View view = getChildAt(i);
      if (view.getVisibility() == 0) {
        f f1 = b(view);
        if (f1 != null && f1.b == this.h && view.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent))
          return true; 
      } 
    } 
    return false;
  }
  
  public void draw(Canvas paramCanvas) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokespecial draw : (Landroid/graphics/Canvas;)V
    //   5: aload_0
    //   6: invokevirtual getOverScrollMode : ()I
    //   9: istore #4
    //   11: iconst_0
    //   12: istore_3
    //   13: iconst_0
    //   14: istore_2
    //   15: iload #4
    //   17: ifeq -> 66
    //   20: iload #4
    //   22: iconst_1
    //   23: if_icmpne -> 49
    //   26: aload_0
    //   27: getfield g : Lb/t/a/a;
    //   30: astore #8
    //   32: aload #8
    //   34: ifnull -> 49
    //   37: aload #8
    //   39: invokevirtual a : ()I
    //   42: iconst_1
    //   43: if_icmple -> 49
    //   46: goto -> 66
    //   49: aload_0
    //   50: getfield P : Landroid/widget/EdgeEffect;
    //   53: invokevirtual finish : ()V
    //   56: aload_0
    //   57: getfield Q : Landroid/widget/EdgeEffect;
    //   60: invokevirtual finish : ()V
    //   63: goto -> 256
    //   66: aload_0
    //   67: getfield P : Landroid/widget/EdgeEffect;
    //   70: invokevirtual isFinished : ()Z
    //   73: ifne -> 155
    //   76: aload_1
    //   77: invokevirtual save : ()I
    //   80: istore_3
    //   81: aload_0
    //   82: invokevirtual getHeight : ()I
    //   85: aload_0
    //   86: invokevirtual getPaddingTop : ()I
    //   89: isub
    //   90: aload_0
    //   91: invokevirtual getPaddingBottom : ()I
    //   94: isub
    //   95: istore_2
    //   96: aload_0
    //   97: invokevirtual getWidth : ()I
    //   100: istore #4
    //   102: aload_1
    //   103: ldc_w 270.0
    //   106: invokevirtual rotate : (F)V
    //   109: aload_1
    //   110: iload_2
    //   111: ineg
    //   112: aload_0
    //   113: invokevirtual getPaddingTop : ()I
    //   116: iadd
    //   117: i2f
    //   118: aload_0
    //   119: getfield s : F
    //   122: iload #4
    //   124: i2f
    //   125: fmul
    //   126: invokevirtual translate : (FF)V
    //   129: aload_0
    //   130: getfield P : Landroid/widget/EdgeEffect;
    //   133: iload_2
    //   134: iload #4
    //   136: invokevirtual setSize : (II)V
    //   139: iconst_0
    //   140: aload_0
    //   141: getfield P : Landroid/widget/EdgeEffect;
    //   144: aload_1
    //   145: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   148: ior
    //   149: istore_2
    //   150: aload_1
    //   151: iload_3
    //   152: invokevirtual restoreToCount : (I)V
    //   155: iload_2
    //   156: istore_3
    //   157: aload_0
    //   158: getfield Q : Landroid/widget/EdgeEffect;
    //   161: invokevirtual isFinished : ()Z
    //   164: ifne -> 256
    //   167: aload_1
    //   168: invokevirtual save : ()I
    //   171: istore #4
    //   173: aload_0
    //   174: invokevirtual getWidth : ()I
    //   177: istore_3
    //   178: aload_0
    //   179: invokevirtual getHeight : ()I
    //   182: istore #5
    //   184: aload_0
    //   185: invokevirtual getPaddingTop : ()I
    //   188: istore #6
    //   190: aload_0
    //   191: invokevirtual getPaddingBottom : ()I
    //   194: istore #7
    //   196: aload_1
    //   197: ldc_w 90.0
    //   200: invokevirtual rotate : (F)V
    //   203: aload_1
    //   204: aload_0
    //   205: invokevirtual getPaddingTop : ()I
    //   208: ineg
    //   209: i2f
    //   210: aload_0
    //   211: getfield t : F
    //   214: fconst_1
    //   215: fadd
    //   216: fneg
    //   217: iload_3
    //   218: i2f
    //   219: fmul
    //   220: invokevirtual translate : (FF)V
    //   223: aload_0
    //   224: getfield Q : Landroid/widget/EdgeEffect;
    //   227: iload #5
    //   229: iload #6
    //   231: isub
    //   232: iload #7
    //   234: isub
    //   235: iload_3
    //   236: invokevirtual setSize : (II)V
    //   239: iload_2
    //   240: aload_0
    //   241: getfield Q : Landroid/widget/EdgeEffect;
    //   244: aload_1
    //   245: invokevirtual draw : (Landroid/graphics/Canvas;)Z
    //   248: ior
    //   249: istore_3
    //   250: aload_1
    //   251: iload #4
    //   253: invokevirtual restoreToCount : (I)V
    //   256: iload_3
    //   257: ifeq -> 264
    //   260: aload_0
    //   261: invokestatic M : (Landroid/view/View;)V
    //   264: return
  }
  
  protected void drawableStateChanged() {
    super.drawableStateChanged();
    Drawable drawable = this.p;
    if (drawable != null && drawable.isStateful())
      drawable.setState(getDrawableState()); 
  }
  
  void e() {
    c(this.h);
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
    return new g();
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet) {
    return new g(getContext(), paramAttributeSet);
  }
  
  protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams) {
    return generateDefaultLayoutParams();
  }
  
  public a getAdapter() {
    return this.g;
  }
  
  protected int getChildDrawingOrder(int paramInt1, int paramInt2) {
    int i = paramInt2;
    if (this.d0 == 2)
      i = paramInt1 - 1 - paramInt2; 
    return ((g)((View)this.e0.get(i)).getLayoutParams()).f;
  }
  
  public int getCurrentItem() {
    return this.h;
  }
  
  public int getOffscreenPageLimit() {
    return this.y;
  }
  
  public int getPageMargin() {
    return this.o;
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.R = true;
  }
  
  protected void onDetachedFromWindow() {
    removeCallbacks(this.f0);
    Scroller scroller = this.l;
    if (scroller != null && !scroller.isFinished())
      this.l.abortAnimation(); 
    super.onDetachedFromWindow();
  }
  
  protected void onDraw(Canvas paramCanvas) {
    super.onDraw(paramCanvas);
    if (this.o > 0 && this.p != null && this.d.size() > 0 && this.g != null) {
      int i1 = getScrollX();
      int i2 = getWidth();
      float f1 = this.o;
      float f3 = i2;
      float f2 = f1 / f3;
      ArrayList<f> arrayList = this.d;
      int m = 0;
      f f4 = arrayList.get(0);
      f1 = f4.e;
      int i3 = this.d.size();
      int i = f4.b;
      int i4 = ((f)this.d.get(i3 - 1)).b;
      while (i < i4) {
        float f5;
        f f6;
        while (i > f4.b && m < i3) {
          ArrayList<f> arrayList1 = this.d;
          f6 = arrayList1.get(++m);
        } 
        if (i == f6.b) {
          f1 = f6.e;
          float f7 = f6.d;
          f5 = (f1 + f7) * f3;
          f1 = f1 + f7 + f2;
        } else {
          float f7 = this.g.a(i);
          f5 = (f1 + f7) * f3;
          f1 += f7 + f2;
        } 
        if (this.o + f5 > i1) {
          this.p.setBounds(Math.round(f5), this.q, Math.round(this.o + f5), this.r);
          this.p.draw(paramCanvas);
        } 
        if (f5 > (i1 + i2))
          return; 
        i++;
      } 
    } 
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    int i = paramMotionEvent.getAction() & 0xFF;
    if (i == 3 || i == 1) {
      i();
      return false;
    } 
    if (i != 0) {
      if (this.z)
        return true; 
      if (this.A)
        return false; 
    } 
    if (i != 0) {
      if (i != 2) {
        if (i == 6)
          a(paramMotionEvent); 
      } else {
        i = this.I;
        if (i != -1) {
          i = paramMotionEvent.findPointerIndex(i);
          float f2 = paramMotionEvent.getX(i);
          float f1 = f2 - this.E;
          float f4 = Math.abs(f1);
          float f3 = paramMotionEvent.getY(i);
          float f5 = Math.abs(f3 - this.H);
          if (f1 != 0.0F && !a(this.E, f1) && a((View)this, false, (int)f1, (int)f2, (int)f3)) {
            this.E = f2;
            this.F = f3;
            this.A = true;
            return false;
          } 
          if (f4 > this.D && f4 * 0.5F > f5) {
            this.z = true;
            c(true);
            setScrollState(1);
            if (f1 > 0.0F) {
              f1 = this.G + this.D;
            } else {
              f1 = this.G - this.D;
            } 
            this.E = f1;
            this.F = f3;
            setScrollingCacheEnabled(true);
          } else if (f5 > this.D) {
            this.A = true;
          } 
          if (this.z && b(f2))
            v.M((View)this); 
        } 
      } 
    } else {
      float f1 = paramMotionEvent.getX();
      this.G = f1;
      this.E = f1;
      f1 = paramMotionEvent.getY();
      this.H = f1;
      this.F = f1;
      this.I = paramMotionEvent.getPointerId(0);
      this.A = false;
      this.m = true;
      this.l.computeScrollOffset();
      if (this.g0 == 2 && Math.abs(this.l.getFinalX() - this.l.getCurrX()) > this.N) {
        this.l.abortAnimation();
        this.x = false;
        e();
        this.z = true;
        c(true);
        setScrollState(1);
      } else {
        a(false);
        this.z = false;
      } 
    } 
    if (this.J == null)
      this.J = VelocityTracker.obtain(); 
    this.J.addMovement(paramMotionEvent);
    return this.z;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i2 = getChildCount();
    int i3 = paramInt3 - paramInt1;
    int i4 = paramInt4 - paramInt2;
    paramInt2 = getPaddingLeft();
    paramInt1 = getPaddingTop();
    int i = getPaddingRight();
    paramInt4 = getPaddingBottom();
    int i5 = getScrollX();
    int m = 0;
    int i1 = 0;
    while (i1 < i2) {
      View view = getChildAt(i1);
      int i6 = paramInt2;
      int i9 = i;
      int i8 = paramInt1;
      int i7 = paramInt4;
      paramInt3 = m;
      if (view.getVisibility() != 8) {
        g g = (g)view.getLayoutParams();
        i6 = paramInt2;
        i9 = i;
        i8 = paramInt1;
        i7 = paramInt4;
        paramInt3 = m;
        if (g.a) {
          i6 = g.b;
          paramInt3 = i6 & 0x7;
          i7 = i6 & 0x70;
          if (paramInt3 != 1) {
            if (paramInt3 != 3) {
              if (paramInt3 != 5) {
                paramInt3 = paramInt2;
                i6 = paramInt2;
              } else {
                paramInt3 = i3 - i - view.getMeasuredWidth();
                i += view.getMeasuredWidth();
                i6 = paramInt2;
              } 
            } else {
              i6 = view.getMeasuredWidth();
              paramInt3 = paramInt2;
              i6 += paramInt2;
            } 
          } else {
            paramInt3 = Math.max((i3 - view.getMeasuredWidth()) / 2, paramInt2);
            i6 = paramInt2;
          } 
          if (i7 != 16) {
            if (i7 != 48) {
              if (i7 != 80) {
                paramInt2 = paramInt1;
              } else {
                paramInt2 = i4 - paramInt4 - view.getMeasuredHeight();
                paramInt4 += view.getMeasuredHeight();
              } 
            } else {
              i7 = view.getMeasuredHeight();
              paramInt2 = paramInt1;
              paramInt1 = i7 + paramInt1;
            } 
          } else {
            paramInt2 = Math.max((i4 - view.getMeasuredHeight()) / 2, paramInt1);
          } 
          paramInt3 += i5;
          view.layout(paramInt3, paramInt2, view.getMeasuredWidth() + paramInt3, paramInt2 + view.getMeasuredHeight());
          paramInt3 = m + 1;
          i7 = paramInt4;
          i8 = paramInt1;
          i9 = i;
        } 
      } 
      i1++;
      paramInt2 = i6;
      i = i9;
      paramInt1 = i8;
      paramInt4 = i7;
      m = paramInt3;
    } 
    for (paramInt3 = 0; paramInt3 < i2; paramInt3++) {
      View view = getChildAt(paramInt3);
      if (view.getVisibility() != 8) {
        g g = (g)view.getLayoutParams();
        if (!g.a) {
          f f1 = b(view);
          if (f1 != null) {
            float f2 = (i3 - paramInt2 - i);
            int i6 = (int)(f1.e * f2) + paramInt2;
            if (g.d) {
              g.d = false;
              view.measure(View.MeasureSpec.makeMeasureSpec((int)(f2 * g.c), 1073741824), View.MeasureSpec.makeMeasureSpec(i4 - paramInt1 - paramInt4, 1073741824));
            } 
            view.layout(i6, paramInt1, view.getMeasuredWidth() + i6, view.getMeasuredHeight() + paramInt1);
          } 
        } 
      } 
    } 
    this.q = paramInt1;
    this.r = i4 - paramInt4;
    this.T = m;
    if (this.R)
      a(this.h, false, 0, false); 
    this.R = false;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: iconst_0
    //   1: istore #11
    //   3: aload_0
    //   4: iconst_0
    //   5: iload_1
    //   6: invokestatic getDefaultSize : (II)I
    //   9: iconst_0
    //   10: iload_2
    //   11: invokestatic getDefaultSize : (II)I
    //   14: invokevirtual setMeasuredDimension : (II)V
    //   17: aload_0
    //   18: invokevirtual getMeasuredWidth : ()I
    //   21: istore_1
    //   22: aload_0
    //   23: iload_1
    //   24: bipush #10
    //   26: idiv
    //   27: aload_0
    //   28: getfield B : I
    //   31: invokestatic min : (II)I
    //   34: putfield C : I
    //   37: aload_0
    //   38: invokevirtual getPaddingLeft : ()I
    //   41: istore_3
    //   42: aload_0
    //   43: invokevirtual getPaddingRight : ()I
    //   46: istore #4
    //   48: aload_0
    //   49: invokevirtual getMeasuredHeight : ()I
    //   52: istore_2
    //   53: aload_0
    //   54: invokevirtual getPaddingTop : ()I
    //   57: istore #5
    //   59: aload_0
    //   60: invokevirtual getPaddingBottom : ()I
    //   63: istore #6
    //   65: aload_0
    //   66: invokevirtual getChildCount : ()I
    //   69: istore #12
    //   71: iload_2
    //   72: iload #5
    //   74: isub
    //   75: iload #6
    //   77: isub
    //   78: istore_2
    //   79: iload_1
    //   80: iload_3
    //   81: isub
    //   82: iload #4
    //   84: isub
    //   85: istore_1
    //   86: iconst_0
    //   87: istore #5
    //   89: iconst_1
    //   90: istore #8
    //   92: ldc_w 1073741824
    //   95: istore #10
    //   97: iload #5
    //   99: iload #12
    //   101: if_icmpge -> 434
    //   104: aload_0
    //   105: iload #5
    //   107: invokevirtual getChildAt : (I)Landroid/view/View;
    //   110: astore #13
    //   112: iload_2
    //   113: istore_3
    //   114: iload_1
    //   115: istore #4
    //   117: aload #13
    //   119: invokevirtual getVisibility : ()I
    //   122: bipush #8
    //   124: if_icmpeq -> 420
    //   127: aload #13
    //   129: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   132: checkcast b/t/a/b$g
    //   135: astore #14
    //   137: iload_2
    //   138: istore_3
    //   139: iload_1
    //   140: istore #4
    //   142: aload #14
    //   144: ifnull -> 420
    //   147: iload_2
    //   148: istore_3
    //   149: iload_1
    //   150: istore #4
    //   152: aload #14
    //   154: getfield a : Z
    //   157: ifeq -> 420
    //   160: aload #14
    //   162: getfield b : I
    //   165: istore #4
    //   167: iload #4
    //   169: bipush #7
    //   171: iand
    //   172: istore_3
    //   173: iload #4
    //   175: bipush #112
    //   177: iand
    //   178: istore #4
    //   180: iload #4
    //   182: bipush #48
    //   184: if_icmpeq -> 203
    //   187: iload #4
    //   189: bipush #80
    //   191: if_icmpne -> 197
    //   194: goto -> 203
    //   197: iconst_0
    //   198: istore #7
    //   200: goto -> 206
    //   203: iconst_1
    //   204: istore #7
    //   206: iload #8
    //   208: istore #6
    //   210: iload_3
    //   211: iconst_3
    //   212: if_icmpeq -> 230
    //   215: iload_3
    //   216: iconst_5
    //   217: if_icmpne -> 227
    //   220: iload #8
    //   222: istore #6
    //   224: goto -> 230
    //   227: iconst_0
    //   228: istore #6
    //   230: ldc_w -2147483648
    //   233: istore_3
    //   234: iload #7
    //   236: ifeq -> 247
    //   239: ldc_w 1073741824
    //   242: istore #4
    //   244: goto -> 269
    //   247: iload_3
    //   248: istore #4
    //   250: iload #6
    //   252: ifeq -> 269
    //   255: ldc_w 1073741824
    //   258: istore #8
    //   260: iload_3
    //   261: istore #4
    //   263: iload #8
    //   265: istore_3
    //   266: goto -> 273
    //   269: ldc_w -2147483648
    //   272: istore_3
    //   273: aload #14
    //   275: getfield width : I
    //   278: istore #8
    //   280: iload #8
    //   282: bipush #-2
    //   284: if_icmpeq -> 315
    //   287: iload #8
    //   289: iconst_m1
    //   290: if_icmpeq -> 300
    //   293: iload #8
    //   295: istore #4
    //   297: goto -> 303
    //   300: iload_1
    //   301: istore #4
    //   303: ldc_w 1073741824
    //   306: istore #8
    //   308: iload #4
    //   310: istore #9
    //   312: goto -> 322
    //   315: iload_1
    //   316: istore #9
    //   318: iload #4
    //   320: istore #8
    //   322: aload #14
    //   324: getfield height : I
    //   327: istore #4
    //   329: iload #4
    //   331: bipush #-2
    //   333: if_icmpeq -> 353
    //   336: iload #4
    //   338: iconst_m1
    //   339: if_icmpeq -> 348
    //   342: iload #4
    //   344: istore_3
    //   345: goto -> 362
    //   348: iload_2
    //   349: istore_3
    //   350: goto -> 362
    //   353: iload_2
    //   354: istore #4
    //   356: iload_3
    //   357: istore #10
    //   359: iload #4
    //   361: istore_3
    //   362: aload #13
    //   364: iload #9
    //   366: iload #8
    //   368: invokestatic makeMeasureSpec : (II)I
    //   371: iload_3
    //   372: iload #10
    //   374: invokestatic makeMeasureSpec : (II)I
    //   377: invokevirtual measure : (II)V
    //   380: iload #7
    //   382: ifeq -> 399
    //   385: iload_2
    //   386: aload #13
    //   388: invokevirtual getMeasuredHeight : ()I
    //   391: isub
    //   392: istore_3
    //   393: iload_1
    //   394: istore #4
    //   396: goto -> 420
    //   399: iload_2
    //   400: istore_3
    //   401: iload_1
    //   402: istore #4
    //   404: iload #6
    //   406: ifeq -> 420
    //   409: iload_1
    //   410: aload #13
    //   412: invokevirtual getMeasuredWidth : ()I
    //   415: isub
    //   416: istore #4
    //   418: iload_2
    //   419: istore_3
    //   420: iload #5
    //   422: iconst_1
    //   423: iadd
    //   424: istore #5
    //   426: iload_3
    //   427: istore_2
    //   428: iload #4
    //   430: istore_1
    //   431: goto -> 89
    //   434: iload_1
    //   435: ldc_w 1073741824
    //   438: invokestatic makeMeasureSpec : (II)I
    //   441: pop
    //   442: aload_0
    //   443: iload_2
    //   444: ldc_w 1073741824
    //   447: invokestatic makeMeasureSpec : (II)I
    //   450: putfield u : I
    //   453: aload_0
    //   454: iconst_1
    //   455: putfield v : Z
    //   458: aload_0
    //   459: invokevirtual e : ()V
    //   462: aload_0
    //   463: iconst_0
    //   464: putfield v : Z
    //   467: aload_0
    //   468: invokevirtual getChildCount : ()I
    //   471: istore_3
    //   472: iload #11
    //   474: istore_2
    //   475: iload_2
    //   476: iload_3
    //   477: if_icmpge -> 551
    //   480: aload_0
    //   481: iload_2
    //   482: invokevirtual getChildAt : (I)Landroid/view/View;
    //   485: astore #13
    //   487: aload #13
    //   489: invokevirtual getVisibility : ()I
    //   492: bipush #8
    //   494: if_icmpeq -> 544
    //   497: aload #13
    //   499: invokevirtual getLayoutParams : ()Landroid/view/ViewGroup$LayoutParams;
    //   502: checkcast b/t/a/b$g
    //   505: astore #14
    //   507: aload #14
    //   509: ifnull -> 520
    //   512: aload #14
    //   514: getfield a : Z
    //   517: ifne -> 544
    //   520: aload #13
    //   522: iload_1
    //   523: i2f
    //   524: aload #14
    //   526: getfield c : F
    //   529: fmul
    //   530: f2i
    //   531: ldc_w 1073741824
    //   534: invokestatic makeMeasureSpec : (II)I
    //   537: aload_0
    //   538: getfield u : I
    //   541: invokevirtual measure : (II)V
    //   544: iload_2
    //   545: iconst_1
    //   546: iadd
    //   547: istore_2
    //   548: goto -> 475
    //   551: return
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect) {
    byte b1;
    int i = getChildCount();
    int m = -1;
    if ((paramInt & 0x2) != 0) {
      m = i;
      i = 0;
      b1 = 1;
    } else {
      i--;
      b1 = -1;
    } 
    while (i != m) {
      View view = getChildAt(i);
      if (view.getVisibility() == 0) {
        f f1 = b(view);
        if (f1 != null && f1.b == this.h && view.requestFocus(paramInt, paramRect))
          return true; 
      } 
      i += b1;
    } 
    return false;
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {
    if (!(paramParcelable instanceof m)) {
      super.onRestoreInstanceState(paramParcelable);
      return;
    } 
    m m = (m)paramParcelable;
    super.onRestoreInstanceState(m.e());
    a a1 = this.g;
    if (a1 != null) {
      a1.a(m.f, m.g);
      a(m.e, false, true);
      return;
    } 
    this.i = m.e;
    this.j = m.f;
    this.k = m.g;
  }
  
  public Parcelable onSaveInstanceState() {
    m m = new m(super.onSaveInstanceState());
    m.e = this.h;
    a a1 = this.g;
    if (a1 != null)
      m.f = a1.c(); 
    return (Parcelable)m;
  }
  
  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if (paramInt1 != paramInt3) {
      paramInt2 = this.o;
      a(paramInt1, paramInt3, paramInt2, paramInt2);
    } 
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    // Byte code:
    //   0: aload_0
    //   1: getfield O : Z
    //   4: ifeq -> 9
    //   7: iconst_1
    //   8: ireturn
    //   9: aload_1
    //   10: invokevirtual getAction : ()I
    //   13: istore #6
    //   15: iconst_0
    //   16: istore #9
    //   18: iload #6
    //   20: ifne -> 32
    //   23: aload_1
    //   24: invokevirtual getEdgeFlags : ()I
    //   27: ifeq -> 32
    //   30: iconst_0
    //   31: ireturn
    //   32: aload_0
    //   33: getfield g : Lb/t/a/a;
    //   36: astore #10
    //   38: aload #10
    //   40: ifnull -> 602
    //   43: aload #10
    //   45: invokevirtual a : ()I
    //   48: ifne -> 53
    //   51: iconst_0
    //   52: ireturn
    //   53: aload_0
    //   54: getfield J : Landroid/view/VelocityTracker;
    //   57: ifnonnull -> 67
    //   60: aload_0
    //   61: invokestatic obtain : ()Landroid/view/VelocityTracker;
    //   64: putfield J : Landroid/view/VelocityTracker;
    //   67: aload_0
    //   68: getfield J : Landroid/view/VelocityTracker;
    //   71: aload_1
    //   72: invokevirtual addMovement : (Landroid/view/MotionEvent;)V
    //   75: aload_1
    //   76: invokevirtual getAction : ()I
    //   79: sipush #255
    //   82: iand
    //   83: istore #6
    //   85: iload #6
    //   87: ifeq -> 532
    //   90: iload #6
    //   92: iconst_1
    //   93: if_icmpeq -> 392
    //   96: iload #6
    //   98: iconst_2
    //   99: if_icmpeq -> 196
    //   102: iload #6
    //   104: iconst_3
    //   105: if_icmpeq -> 175
    //   108: iload #6
    //   110: iconst_5
    //   111: if_icmpeq -> 148
    //   114: iload #6
    //   116: bipush #6
    //   118: if_icmpeq -> 124
    //   121: goto -> 591
    //   124: aload_0
    //   125: aload_1
    //   126: invokespecial a : (Landroid/view/MotionEvent;)V
    //   129: aload_0
    //   130: aload_1
    //   131: aload_1
    //   132: aload_0
    //   133: getfield I : I
    //   136: invokevirtual findPointerIndex : (I)I
    //   139: invokevirtual getX : (I)F
    //   142: putfield E : F
    //   145: goto -> 591
    //   148: aload_1
    //   149: invokevirtual getActionIndex : ()I
    //   152: istore #6
    //   154: aload_0
    //   155: aload_1
    //   156: iload #6
    //   158: invokevirtual getX : (I)F
    //   161: putfield E : F
    //   164: aload_1
    //   165: iload #6
    //   167: invokevirtual getPointerId : (I)I
    //   170: istore #6
    //   172: goto -> 585
    //   175: aload_0
    //   176: getfield z : Z
    //   179: ifeq -> 591
    //   182: aload_0
    //   183: aload_0
    //   184: getfield h : I
    //   187: iconst_1
    //   188: iconst_0
    //   189: iconst_0
    //   190: invokespecial a : (IZIZ)V
    //   193: goto -> 523
    //   196: aload_0
    //   197: getfield z : Z
    //   200: ifne -> 362
    //   203: aload_1
    //   204: aload_0
    //   205: getfield I : I
    //   208: invokevirtual findPointerIndex : (I)I
    //   211: istore #6
    //   213: iload #6
    //   215: iconst_m1
    //   216: if_icmpne -> 222
    //   219: goto -> 523
    //   222: aload_1
    //   223: iload #6
    //   225: invokevirtual getX : (I)F
    //   228: fstore_2
    //   229: fload_2
    //   230: aload_0
    //   231: getfield E : F
    //   234: fsub
    //   235: invokestatic abs : (F)F
    //   238: fstore #4
    //   240: aload_1
    //   241: iload #6
    //   243: invokevirtual getY : (I)F
    //   246: fstore_3
    //   247: fload_3
    //   248: aload_0
    //   249: getfield F : F
    //   252: fsub
    //   253: invokestatic abs : (F)F
    //   256: fstore #5
    //   258: fload #4
    //   260: aload_0
    //   261: getfield D : I
    //   264: i2f
    //   265: fcmpl
    //   266: ifle -> 362
    //   269: fload #4
    //   271: fload #5
    //   273: fcmpl
    //   274: ifle -> 362
    //   277: aload_0
    //   278: iconst_1
    //   279: putfield z : Z
    //   282: aload_0
    //   283: iconst_1
    //   284: invokespecial c : (Z)V
    //   287: aload_0
    //   288: getfield G : F
    //   291: fstore #4
    //   293: fload_2
    //   294: fload #4
    //   296: fsub
    //   297: fconst_0
    //   298: fcmpl
    //   299: ifle -> 314
    //   302: fload #4
    //   304: aload_0
    //   305: getfield D : I
    //   308: i2f
    //   309: fadd
    //   310: fstore_2
    //   311: goto -> 323
    //   314: fload #4
    //   316: aload_0
    //   317: getfield D : I
    //   320: i2f
    //   321: fsub
    //   322: fstore_2
    //   323: aload_0
    //   324: fload_2
    //   325: putfield E : F
    //   328: aload_0
    //   329: fload_3
    //   330: putfield F : F
    //   333: aload_0
    //   334: iconst_1
    //   335: invokevirtual setScrollState : (I)V
    //   338: aload_0
    //   339: iconst_1
    //   340: invokespecial setScrollingCacheEnabled : (Z)V
    //   343: aload_0
    //   344: invokevirtual getParent : ()Landroid/view/ViewParent;
    //   347: astore #10
    //   349: aload #10
    //   351: ifnull -> 362
    //   354: aload #10
    //   356: iconst_1
    //   357: invokeinterface requestDisallowInterceptTouchEvent : (Z)V
    //   362: aload_0
    //   363: getfield z : Z
    //   366: ifeq -> 591
    //   369: iconst_0
    //   370: aload_0
    //   371: aload_1
    //   372: aload_1
    //   373: aload_0
    //   374: getfield I : I
    //   377: invokevirtual findPointerIndex : (I)I
    //   380: invokevirtual getX : (I)F
    //   383: invokespecial b : (F)Z
    //   386: ior
    //   387: istore #9
    //   389: goto -> 591
    //   392: aload_0
    //   393: getfield z : Z
    //   396: ifeq -> 591
    //   399: aload_0
    //   400: getfield J : Landroid/view/VelocityTracker;
    //   403: astore #10
    //   405: aload #10
    //   407: sipush #1000
    //   410: aload_0
    //   411: getfield L : I
    //   414: i2f
    //   415: invokevirtual computeCurrentVelocity : (IF)V
    //   418: aload #10
    //   420: aload_0
    //   421: getfield I : I
    //   424: invokevirtual getXVelocity : (I)F
    //   427: f2i
    //   428: istore #6
    //   430: aload_0
    //   431: iconst_1
    //   432: putfield x : Z
    //   435: aload_0
    //   436: invokespecial getClientWidth : ()I
    //   439: istore #7
    //   441: aload_0
    //   442: invokevirtual getScrollX : ()I
    //   445: istore #8
    //   447: aload_0
    //   448: invokespecial g : ()Lb/t/a/b$f;
    //   451: astore #10
    //   453: aload_0
    //   454: getfield o : I
    //   457: i2f
    //   458: fstore_3
    //   459: iload #7
    //   461: i2f
    //   462: fstore_2
    //   463: fload_3
    //   464: fload_2
    //   465: fdiv
    //   466: fstore_3
    //   467: aload_0
    //   468: aload_0
    //   469: aload #10
    //   471: getfield b : I
    //   474: iload #8
    //   476: i2f
    //   477: fload_2
    //   478: fdiv
    //   479: aload #10
    //   481: getfield e : F
    //   484: fsub
    //   485: aload #10
    //   487: getfield d : F
    //   490: fload_3
    //   491: fadd
    //   492: fdiv
    //   493: iload #6
    //   495: aload_1
    //   496: aload_1
    //   497: aload_0
    //   498: getfield I : I
    //   501: invokevirtual findPointerIndex : (I)I
    //   504: invokevirtual getX : (I)F
    //   507: aload_0
    //   508: getfield G : F
    //   511: fsub
    //   512: f2i
    //   513: invokespecial a : (IFII)I
    //   516: iconst_1
    //   517: iconst_1
    //   518: iload #6
    //   520: invokevirtual a : (IZZI)V
    //   523: aload_0
    //   524: invokespecial i : ()Z
    //   527: istore #9
    //   529: goto -> 591
    //   532: aload_0
    //   533: getfield l : Landroid/widget/Scroller;
    //   536: invokevirtual abortAnimation : ()V
    //   539: aload_0
    //   540: iconst_0
    //   541: putfield x : Z
    //   544: aload_0
    //   545: invokevirtual e : ()V
    //   548: aload_1
    //   549: invokevirtual getX : ()F
    //   552: fstore_2
    //   553: aload_0
    //   554: fload_2
    //   555: putfield G : F
    //   558: aload_0
    //   559: fload_2
    //   560: putfield E : F
    //   563: aload_1
    //   564: invokevirtual getY : ()F
    //   567: fstore_2
    //   568: aload_0
    //   569: fload_2
    //   570: putfield H : F
    //   573: aload_0
    //   574: fload_2
    //   575: putfield F : F
    //   578: aload_1
    //   579: iconst_0
    //   580: invokevirtual getPointerId : (I)I
    //   583: istore #6
    //   585: aload_0
    //   586: iload #6
    //   588: putfield I : I
    //   591: iload #9
    //   593: ifeq -> 600
    //   596: aload_0
    //   597: invokestatic M : (Landroid/view/View;)V
    //   600: iconst_1
    //   601: ireturn
    //   602: iconst_0
    //   603: ireturn
  }
  
  public void removeView(View paramView) {
    if (this.v) {
      removeViewInLayout(paramView);
      return;
    } 
    super.removeView(paramView);
  }
  
  public void setAdapter(a parama) {
    a a1 = this.g;
    byte b1 = 0;
    if (a1 != null) {
      a1.a((DataSetObserver)null);
      this.g.b(this);
      for (int i = 0; i < this.d.size(); i++) {
        f f1 = this.d.get(i);
        this.g.a(this, f1.b, f1.a);
      } 
      this.g.a(this);
      this.d.clear();
      h();
      this.h = 0;
      scrollTo(0, 0);
    } 
    a1 = this.g;
    this.g = parama;
    this.c = 0;
    if (this.g != null) {
      if (this.n == null)
        this.n = new l(this); 
      this.g.a(this.n);
      this.x = false;
      boolean bool = this.R;
      this.R = true;
      this.c = this.g.a();
      if (this.i >= 0) {
        this.g.a(this.j, this.k);
        a(this.i, false, true);
        this.i = -1;
        this.j = null;
        this.k = null;
      } else if (!bool) {
        e();
      } else {
        requestLayout();
      } 
    } 
    List<i> list = this.a0;
    if (list != null && !list.isEmpty()) {
      int m = this.a0.size();
      for (int i = b1; i < m; i++)
        ((i)this.a0.get(i)).a(this, a1, parama); 
    } 
  }
  
  public void setCurrentItem(int paramInt) {
    this.x = false;
    a(paramInt, this.R ^ true, false);
  }
  
  public void setOffscreenPageLimit(int paramInt) {
    int i = paramInt;
    if (paramInt < 1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Requested offscreen page limit ");
      stringBuilder.append(paramInt);
      stringBuilder.append(" too small; defaulting to ");
      stringBuilder.append(1);
      Log.w("ViewPager", stringBuilder.toString());
      i = 1;
    } 
    if (i != this.y) {
      this.y = i;
      e();
    } 
  }
  
  @Deprecated
  public void setOnPageChangeListener(j paramj) {
    this.V = paramj;
  }
  
  public void setPageMargin(int paramInt) {
    int i = this.o;
    this.o = paramInt;
    int m = getWidth();
    a(m, m, paramInt, i);
    requestLayout();
  }
  
  public void setPageMarginDrawable(int paramInt) {
    setPageMarginDrawable(b.g.e.a.c(getContext(), paramInt));
  }
  
  public void setPageMarginDrawable(Drawable paramDrawable) {
    boolean bool;
    this.p = paramDrawable;
    if (paramDrawable != null)
      refreshDrawableState(); 
    if (paramDrawable == null) {
      bool = true;
    } else {
      bool = false;
    } 
    setWillNotDraw(bool);
    invalidate();
  }
  
  void setScrollState(int paramInt) {
    if (this.g0 == paramInt)
      return; 
    this.g0 = paramInt;
    if (this.b0 != null) {
      boolean bool;
      if (paramInt != 0) {
        bool = true;
      } else {
        bool = false;
      } 
      b(bool);
    } 
    e(paramInt);
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable) {
    return (super.verifyDrawable(paramDrawable) || paramDrawable == this.p);
  }
  
  static final class a implements Comparator<f> {
    public int a(b.f param1f1, b.f param1f2) {
      return param1f1.b - param1f2.b;
    }
  }
  
  static final class b implements Interpolator {
    public float getInterpolation(float param1Float) {
      param1Float--;
      return param1Float * param1Float * param1Float * param1Float * param1Float + 1.0F;
    }
  }
  
  class c implements Runnable {
    c(b this$0) {}
    
    public void run() {
      this.c.setScrollState(0);
      this.c.e();
    }
  }
  
  class d implements r {
    private final Rect a = new Rect();
    
    d(b this$0) {}
    
    public d0 a(View param1View, d0 param1d0) {
      d0 d01 = v.b(param1View, param1d0);
      if (d01.i())
        return d01; 
      Rect rect = this.a;
      rect.left = d01.e();
      rect.top = d01.g();
      rect.right = d01.f();
      rect.bottom = d01.d();
      int i = 0;
      int j = this.b.getChildCount();
      while (i < j) {
        d0 d02 = v.a(this.b.getChildAt(i), d01);
        rect.left = Math.min(d02.e(), rect.left);
        rect.top = Math.min(d02.g(), rect.top);
        rect.right = Math.min(d02.f(), rect.right);
        rect.bottom = Math.min(d02.d(), rect.bottom);
        i++;
      } 
      return d01.b(rect.left, rect.top, rect.right, rect.bottom);
    }
  }
  
  @Inherited
  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.TYPE})
  public static @interface e {}
  
  static class f {
    Object a;
    
    int b;
    
    boolean c;
    
    float d;
    
    float e;
  }
  
  public static class g extends ViewGroup.LayoutParams {
    public boolean a;
    
    public int b;
    
    float c = 0.0F;
    
    boolean d;
    
    int e;
    
    int f;
    
    public g() {
      super(-1, -1);
    }
    
    public g(Context param1Context, AttributeSet param1AttributeSet) {
      super(param1Context, param1AttributeSet);
      TypedArray typedArray = param1Context.obtainStyledAttributes(param1AttributeSet, b.h0);
      this.b = typedArray.getInteger(0, 48);
      typedArray.recycle();
    }
  }
  
  class h extends b.g.m.a {
    h(b this$0) {}
    
    private boolean b() {
      a a1 = this.d.g;
      return (a1 != null && a1.a() > 1);
    }
    
    public void a(View param1View, b.g.m.e0.c param1c) {
      super.a(param1View, param1c);
      param1c.a(b.class.getName());
      param1c.l(b());
      if (this.d.canScrollHorizontally(1))
        param1c.a(4096); 
      if (this.d.canScrollHorizontally(-1))
        param1c.a(8192); 
    }
    
    public boolean a(View param1View, int param1Int, Bundle param1Bundle) {
      if (super.a(param1View, param1Int, param1Bundle))
        return true; 
      if (param1Int != 4096) {
        if (param1Int != 8192)
          return false; 
        if (this.d.canScrollHorizontally(-1)) {
          b b1 = this.d;
          param1Int = b1.h - 1;
          b1.setCurrentItem(param1Int);
          return true;
        } 
        return false;
      } 
      if (this.d.canScrollHorizontally(1)) {
        b b1 = this.d;
        param1Int = b1.h + 1;
        b1.setCurrentItem(param1Int);
        return true;
      } 
      return false;
    }
    
    public void b(View param1View, AccessibilityEvent param1AccessibilityEvent) {
      super.b(param1View, param1AccessibilityEvent);
      param1AccessibilityEvent.setClassName(b.class.getName());
      param1AccessibilityEvent.setScrollable(b());
      if (param1AccessibilityEvent.getEventType() == 4096) {
        a a1 = this.d.g;
        if (a1 != null) {
          param1AccessibilityEvent.setItemCount(a1.a());
          param1AccessibilityEvent.setFromIndex(this.d.h);
          param1AccessibilityEvent.setToIndex(this.d.h);
        } 
      } 
    }
  }
  
  public static interface i {
    void a(b param1b, a param1a1, a param1a2);
  }
  
  public static interface j {
    void a(int param1Int);
    
    void a(int param1Int1, float param1Float, int param1Int2);
    
    void b(int param1Int);
  }
  
  public static interface k {
    void a(View param1View, float param1Float);
  }
  
  private class l extends DataSetObserver {
    l(b this$0) {}
    
    public void onChanged() {
      this.a.a();
    }
    
    public void onInvalidated() {
      this.a.a();
    }
  }
  
  public static class m extends b.i.a.a {
    public static final Parcelable.Creator<m> CREATOR = (Parcelable.Creator<m>)new a();
    
    int e;
    
    Parcelable f;
    
    ClassLoader g;
    
    m(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      super(param1Parcel, param1ClassLoader);
      ClassLoader classLoader = param1ClassLoader;
      if (param1ClassLoader == null)
        classLoader = m.class.getClassLoader(); 
      this.e = param1Parcel.readInt();
      this.f = param1Parcel.readParcelable(classLoader);
      this.g = classLoader;
    }
    
    public m(Parcelable param1Parcelable) {
      super(param1Parcelable);
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("FragmentPager.SavedState{");
      stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      stringBuilder.append(" position=");
      stringBuilder.append(this.e);
      stringBuilder.append("}");
      return stringBuilder.toString();
    }
    
    public void writeToParcel(Parcel param1Parcel, int param1Int) {
      super.writeToParcel(param1Parcel, param1Int);
      param1Parcel.writeInt(this.e);
      param1Parcel.writeParcelable(this.f, param1Int);
    }
    
    static final class a implements Parcelable.ClassLoaderCreator<m> {
      public b.m createFromParcel(Parcel param2Parcel) {
        return new b.m(param2Parcel, null);
      }
      
      public b.m createFromParcel(Parcel param2Parcel, ClassLoader param2ClassLoader) {
        return new b.m(param2Parcel, param2ClassLoader);
      }
      
      public b.m[] newArray(int param2Int) {
        return new b.m[param2Int];
      }
    }
  }
  
  static final class a implements Parcelable.ClassLoaderCreator<m> {
    public b.m createFromParcel(Parcel param1Parcel) {
      return new b.m(param1Parcel, null);
    }
    
    public b.m createFromParcel(Parcel param1Parcel, ClassLoader param1ClassLoader) {
      return new b.m(param1Parcel, param1ClassLoader);
    }
    
    public b.m[] newArray(int param1Int) {
      return new b.m[param1Int];
    }
  }
  
  static class n implements Comparator<View> {
    public int a(View param1View1, View param1View2) {
      b.g g1 = (b.g)param1View1.getLayoutParams();
      b.g g2 = (b.g)param1View2.getLayoutParams();
      boolean bool = g1.a;
      return (bool != g2.a) ? (bool ? 1 : -1) : (g1.e - g2.e);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/t/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */