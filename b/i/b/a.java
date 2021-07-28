package b.i.b;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityRecord;
import b.d.h;
import b.g.m.a;
import b.g.m.e0.d;
import b.g.m.e0.e;
import b.g.m.v;
import b.g.m.y;
import java.util.ArrayList;
import java.util.List;

public abstract class a extends a {
  private static final Rect n = new Rect(2147483647, 2147483647, -2147483648, -2147483648);
  
  private static final b.a<b.g.m.e0.c> o = new a();
  
  private static final b.b<h<b.g.m.e0.c>, b.g.m.e0.c> p = new b();
  
  private final Rect d = new Rect();
  
  private final Rect e = new Rect();
  
  private final Rect f = new Rect();
  
  private final int[] g = new int[2];
  
  private final AccessibilityManager h;
  
  private final View i;
  
  private c j;
  
  int k = Integer.MIN_VALUE;
  
  int l = Integer.MIN_VALUE;
  
  private int m = Integer.MIN_VALUE;
  
  public a(View paramView) {
    if (paramView != null) {
      this.i = paramView;
      this.h = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
      paramView.setFocusable(true);
      if (v.n(paramView) == 0)
        v.h(paramView, 1); 
      return;
    } 
    throw new IllegalArgumentException("View may not be null");
  }
  
  private static Rect a(View paramView, int paramInt, Rect paramRect) {
    int i = paramView.getWidth();
    int j = paramView.getHeight();
    if (paramInt != 17) {
      if (paramInt != 33) {
        if (paramInt != 66) {
          if (paramInt == 130) {
            paramRect.set(0, -1, i, -1);
            return paramRect;
          } 
          throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        } 
        paramRect.set(-1, 0, -1, j);
        return paramRect;
      } 
      paramRect.set(0, j, i, j);
      return paramRect;
    } 
    paramRect.set(i, 0, i, j);
    return paramRect;
  }
  
  private void a(int paramInt, Rect paramRect) {
    b(paramInt).a(paramRect);
  }
  
  private boolean a(int paramInt, Bundle paramBundle) {
    return v.a(this.i, paramInt, paramBundle);
  }
  
  private boolean a(Rect paramRect) {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramRect != null) {
      if (paramRect.isEmpty())
        return false; 
      if (this.i.getWindowVisibility() != 0)
        return false; 
      View view = this.i;
      while (true) {
        View view1;
        ViewParent viewParent = view.getParent();
        if (viewParent instanceof View) {
          View view2 = (View)viewParent;
          if (view2.getAlpha() > 0.0F) {
            view1 = view2;
            if (view2.getVisibility() != 0)
              return false; 
            continue;
          } 
          return false;
        } 
        bool1 = bool2;
        if (view1 != null)
          bool1 = true; 
        break;
      } 
    } 
    return bool1;
  }
  
  private AccessibilityEvent b(int paramInt1, int paramInt2) {
    return (paramInt1 != -1) ? c(paramInt1, paramInt2) : e(paramInt2);
  }
  
  private boolean b(int paramInt, Rect paramRect) {
    b.g.m.e0.c c2;
    h<b.g.m.e0.c> h = f();
    int j = this.l;
    int i = Integer.MIN_VALUE;
    if (j == Integer.MIN_VALUE) {
      c2 = null;
    } else {
      c2 = (b.g.m.e0.c)h.a(j);
    } 
    if (paramInt != 1 && paramInt != 2) {
      if (paramInt == 17 || paramInt == 33 || paramInt == 66 || paramInt == 130) {
        Rect rect = new Rect();
        j = this.l;
        if (j != Integer.MIN_VALUE) {
          a(j, rect);
        } else if (paramRect != null) {
          rect.set(paramRect);
        } else {
          a(this.i, paramInt, rect);
        } 
        paramRect = b.a(h, p, o, c2, rect, paramInt);
      } else {
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
      } 
    } else {
      boolean bool;
      if (v.p(this.i) == 1) {
        bool = true;
      } else {
        bool = false;
      } 
      paramRect = b.a(h, p, o, c2, paramInt, bool, false);
    } 
    b.g.m.e0.c c1 = (b.g.m.e0.c)paramRect;
    if (c1 == null) {
      paramInt = i;
    } else {
      paramInt = h.b(h.a(c1));
    } 
    return c(paramInt);
  }
  
  private AccessibilityEvent c(int paramInt1, int paramInt2) {
    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(paramInt2);
    b.g.m.e0.c c1 = b(paramInt1);
    accessibilityEvent.getText().add(c1.h());
    accessibilityEvent.setContentDescription(c1.e());
    accessibilityEvent.setScrollable(c1.s());
    accessibilityEvent.setPassword(c1.r());
    accessibilityEvent.setEnabled(c1.n());
    accessibilityEvent.setChecked(c1.l());
    a(paramInt1, accessibilityEvent);
    if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
      accessibilityEvent.setClassName(c1.d());
      e.a((AccessibilityRecord)accessibilityEvent, this.i, paramInt1);
      accessibilityEvent.setPackageName(this.i.getContext().getPackageName());
      return accessibilityEvent;
    } 
    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
  }
  
  private boolean c(int paramInt1, int paramInt2, Bundle paramBundle) {
    return (paramInt2 != 1) ? ((paramInt2 != 2) ? ((paramInt2 != 64) ? ((paramInt2 != 128) ? a(paramInt1, paramInt2, paramBundle) : d(paramInt1)) : h(paramInt1)) : a(paramInt1)) : c(paramInt1);
  }
  
  private boolean d() {
    int i = this.l;
    return (i != Integer.MIN_VALUE && a(i, 16, (Bundle)null));
  }
  
  private boolean d(int paramInt) {
    if (this.k == paramInt) {
      this.k = Integer.MIN_VALUE;
      this.i.invalidate();
      a(paramInt, 65536);
      return true;
    } 
    return false;
  }
  
  private AccessibilityEvent e(int paramInt) {
    AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(paramInt);
    this.i.onInitializeAccessibilityEvent(accessibilityEvent);
    return accessibilityEvent;
  }
  
  private b.g.m.e0.c e() {
    b.g.m.e0.c c1 = b.g.m.e0.c.f(this.i);
    v.a(this.i, c1);
    ArrayList<Integer> arrayList = new ArrayList();
    a(arrayList);
    if (c1.c() <= 0 || arrayList.size() <= 0) {
      int i = 0;
      int j = arrayList.size();
      while (i < j) {
        c1.a(this.i, ((Integer)arrayList.get(i)).intValue());
        i++;
      } 
      return c1;
    } 
    throw new RuntimeException("Views cannot have both real and virtual children");
  }
  
  private h<b.g.m.e0.c> f() {
    ArrayList<Integer> arrayList = new ArrayList();
    a(arrayList);
    h<b.g.m.e0.c> h = new h();
    for (int i = 0; i < arrayList.size(); i++)
      h.c(i, f(i)); 
    return h;
  }
  
  private b.g.m.e0.c f(int paramInt) {
    b.g.m.e0.c c1 = b.g.m.e0.c.A();
    c1.f(true);
    c1.g(true);
    c1.a("android.view.View");
    c1.c(n);
    c1.d(n);
    c1.b(this.i);
    a(paramInt, c1);
    if (c1.h() != null || c1.e() != null) {
      c1.a(this.e);
      if (!this.e.equals(n)) {
        int i = c1.b();
        if ((i & 0x40) == 0) {
          if ((i & 0x80) == 0) {
            boolean bool;
            c1.e(this.i.getContext().getPackageName());
            c1.c(this.i, paramInt);
            if (this.k == paramInt) {
              c1.a(true);
              c1.a(128);
            } else {
              c1.a(false);
              c1.a(64);
            } 
            if (this.l == paramInt) {
              bool = true;
            } else {
              bool = false;
            } 
            if (bool) {
              c1.a(2);
            } else if (c1.o()) {
              c1.a(1);
            } 
            c1.h(bool);
            this.i.getLocationOnScreen(this.g);
            c1.b(this.d);
            if (this.d.equals(n)) {
              c1.a(this.d);
              if (c1.b != -1) {
                b.g.m.e0.c c2 = b.g.m.e0.c.A();
                for (paramInt = c1.b; paramInt != -1; paramInt = c2.b) {
                  c2.b(this.i, -1);
                  c2.c(n);
                  a(paramInt, c2);
                  c2.a(this.e);
                  Rect rect1 = this.d;
                  Rect rect2 = this.e;
                  rect1.offset(rect2.left, rect2.top);
                } 
                c2.w();
              } 
              this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
            } 
            if (this.i.getLocalVisibleRect(this.f)) {
              this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
              if (this.d.intersect(this.f)) {
                c1.d(this.d);
                if (a(this.d))
                  c1.o(true); 
              } 
            } 
            return c1;
          } 
          throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        } 
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
      } 
      RuntimeException runtimeException = new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
      throw runtimeException;
    } 
    throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
  }
  
  private static int g(int paramInt) {
    return (paramInt != 19) ? ((paramInt != 21) ? ((paramInt != 22) ? 130 : 66) : 17) : 33;
  }
  
  private boolean h(int paramInt) {
    if (this.h.isEnabled()) {
      if (!this.h.isTouchExplorationEnabled())
        return false; 
      int i = this.k;
      if (i != paramInt) {
        if (i != Integer.MIN_VALUE)
          d(i); 
        this.k = paramInt;
        this.i.invalidate();
        a(paramInt, 32768);
        return true;
      } 
    } 
    return false;
  }
  
  private void i(int paramInt) {
    int i = this.m;
    if (i == paramInt)
      return; 
    this.m = paramInt;
    a(paramInt, 128);
    a(i, 256);
  }
  
  protected abstract int a(float paramFloat1, float paramFloat2);
  
  public d a(View paramView) {
    if (this.j == null)
      this.j = new c(this); 
    return this.j;
  }
  
  protected void a(int paramInt, AccessibilityEvent paramAccessibilityEvent) {}
  
  protected abstract void a(int paramInt, b.g.m.e0.c paramc);
  
  protected void a(int paramInt, boolean paramBoolean) {}
  
  public void a(View paramView, b.g.m.e0.c paramc) {
    super.a(paramView, paramc);
    a(paramc);
  }
  
  protected void a(AccessibilityEvent paramAccessibilityEvent) {}
  
  protected void a(b.g.m.e0.c paramc) {}
  
  protected abstract void a(List<Integer> paramList);
  
  public final void a(boolean paramBoolean, int paramInt, Rect paramRect) {
    int i = this.l;
    if (i != Integer.MIN_VALUE)
      a(i); 
    if (paramBoolean)
      b(paramInt, paramRect); 
  }
  
  public final boolean a(int paramInt) {
    if (this.l != paramInt)
      return false; 
    this.l = Integer.MIN_VALUE;
    a(paramInt, false);
    a(paramInt, 8);
    return true;
  }
  
  public final boolean a(int paramInt1, int paramInt2) {
    if (paramInt1 != Integer.MIN_VALUE) {
      if (!this.h.isEnabled())
        return false; 
      ViewParent viewParent = this.i.getParent();
      if (viewParent == null)
        return false; 
      AccessibilityEvent accessibilityEvent = b(paramInt1, paramInt2);
      return y.a(viewParent, this.i, accessibilityEvent);
    } 
    return false;
  }
  
  protected abstract boolean a(int paramInt1, int paramInt2, Bundle paramBundle);
  
  public final boolean a(KeyEvent paramKeyEvent) {
    int j = paramKeyEvent.getAction();
    boolean bool2 = false;
    int i = 0;
    boolean bool1 = bool2;
    if (j != 1) {
      j = paramKeyEvent.getKeyCode();
      if (j != 61) {
        if (j != 66)
          switch (j) {
            default:
              return false;
            case 19:
            case 20:
            case 21:
            case 22:
              bool1 = bool2;
              if (paramKeyEvent.hasNoModifiers()) {
                j = g(j);
                int k = paramKeyEvent.getRepeatCount();
                for (bool1 = false; i < k + 1 && b(j, (Rect)null); bool1 = true)
                  i++; 
                return bool1;
              } 
              return bool1;
            case 23:
              break;
          }  
        bool1 = bool2;
        if (paramKeyEvent.hasNoModifiers()) {
          bool1 = bool2;
          if (paramKeyEvent.getRepeatCount() == 0) {
            d();
            return true;
          } 
        } 
      } else {
        if (paramKeyEvent.hasNoModifiers())
          return b(2, (Rect)null); 
        bool1 = bool2;
        if (paramKeyEvent.hasModifiers(1))
          bool1 = b(1, (Rect)null); 
      } 
    } 
    return bool1;
  }
  
  public final boolean a(MotionEvent paramMotionEvent) {
    boolean bool = this.h.isEnabled();
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (bool) {
      if (!this.h.isTouchExplorationEnabled())
        return false; 
      int i = paramMotionEvent.getAction();
      if (i != 7 && i != 9) {
        if (i != 10)
          return false; 
        if (this.m != Integer.MIN_VALUE) {
          i(-2147483648);
          return true;
        } 
        return false;
      } 
      i = a(paramMotionEvent.getX(), paramMotionEvent.getY());
      i(i);
      bool1 = bool2;
      if (i != Integer.MIN_VALUE)
        bool1 = true; 
    } 
    return bool1;
  }
  
  public final int b() {
    return this.k;
  }
  
  b.g.m.e0.c b(int paramInt) {
    return (paramInt == -1) ? e() : f(paramInt);
  }
  
  public void b(View paramView, AccessibilityEvent paramAccessibilityEvent) {
    super.b(paramView, paramAccessibilityEvent);
    a(paramAccessibilityEvent);
  }
  
  boolean b(int paramInt1, int paramInt2, Bundle paramBundle) {
    return (paramInt1 != -1) ? c(paramInt1, paramInt2, paramBundle) : a(paramInt2, paramBundle);
  }
  
  public final int c() {
    return this.l;
  }
  
  public final boolean c(int paramInt) {
    if (!this.i.isFocused() && !this.i.requestFocus())
      return false; 
    int i = this.l;
    if (i == paramInt)
      return false; 
    if (i != Integer.MIN_VALUE)
      a(i); 
    this.l = paramInt;
    a(paramInt, true);
    a(paramInt, 8);
    return true;
  }
  
  static final class a implements b.a<b.g.m.e0.c> {
    public void a(b.g.m.e0.c param1c, Rect param1Rect) {
      param1c.a(param1Rect);
    }
  }
  
  static final class b implements b.b<h<b.g.m.e0.c>, b.g.m.e0.c> {
    public int a(h<b.g.m.e0.c> param1h) {
      return param1h.b();
    }
    
    public b.g.m.e0.c a(h<b.g.m.e0.c> param1h, int param1Int) {
      return (b.g.m.e0.c)param1h.c(param1Int);
    }
  }
  
  private class c extends d {
    c(a this$0) {}
    
    public b.g.m.e0.c a(int param1Int) {
      return b.g.m.e0.c.a(this.b.b(param1Int));
    }
    
    public boolean a(int param1Int1, int param1Int2, Bundle param1Bundle) {
      return this.b.b(param1Int1, param1Int2, param1Bundle);
    }
    
    public b.g.m.e0.c b(int param1Int) {
      if (param1Int == 2) {
        param1Int = this.b.k;
      } else {
        param1Int = this.b.l;
      } 
      return (param1Int == Integer.MIN_VALUE) ? null : a(param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/i/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */