package com.swmansion.rnscreens;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.fragment.app.x;
import com.facebook.react.modules.core.g;
import e.e.o.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class d<T extends f> extends ViewGroup {
  protected final ArrayList<T> c = new ArrayList<T>();
  
  protected n d;
  
  private x e;
  
  private x f;
  
  private boolean g;
  
  private boolean h;
  
  private boolean i = false;
  
  private final com.facebook.react.modules.core.a.a j = new a(this);
  
  private final com.facebook.react.modules.core.a.a k = new b(this);
  
  public d(Context paramContext) {
    super(paramContext);
  }
  
  private void c(f paramf) {
    getOrCreateTransaction().a(getId(), paramf);
  }
  
  private void d(f paramf) {
    getOrCreateTransaction().a(paramf);
  }
  
  private void e(f paramf) {
    x x1 = getOrCreateTransaction();
    x1.a(paramf);
    x1.a(getId(), paramf);
  }
  
  private final void f() {
    this.d.p();
    c();
  }
  
  private void g() {
    x x1 = this.d.b();
    Iterator<Fragment> iterator = this.d.u().iterator();
    boolean bool = false;
    while (iterator.hasNext()) {
      Fragment fragment = iterator.next();
      if (fragment instanceof f && ((f)fragment).b0.getContainer() == this) {
        x1.a(fragment);
        bool = true;
      } 
    } 
    if (bool)
      x1.d(); 
  }
  
  private void h() {
    boolean bool;
    ViewParent viewParent;
    n n1;
    IllegalStateException illegalStateException;
    d d1 = this;
    while (true) {
      bool = d1 instanceof y;
      if (!bool && !(d1 instanceof b) && d1.getParent() != null) {
        viewParent = d1.getParent();
        continue;
      } 
      break;
    } 
    if (viewParent instanceof b) {
      n1 = ((b)viewParent).getFragment().n();
    } else if (bool) {
      Context context = ((y)n1).getContext();
      while (true) {
        bool = context instanceof e;
        if (!bool && context instanceof ContextWrapper) {
          context = ((ContextWrapper)context).getBaseContext();
          continue;
        } 
        break;
      } 
      if (bool) {
        n n2 = ((e)context).k();
      } else {
        throw new IllegalStateException("In order to use RNScreens components your app's activity need to extend ReactFragmentActivity or ReactCompatActivity");
      } 
    } else {
      illegalStateException = new IllegalStateException("ScreenContainer is not attached under ReactRootView");
      throw illegalStateException;
    } 
    setFragmentManager((n)illegalStateException);
  }
  
  private void i() {
    if (this.g && this.h) {
      if (this.d == null)
        return; 
      this.g = false;
      f();
    } 
  }
  
  private void setFragmentManager(n paramn) {
    this.d = paramn;
    i();
  }
  
  protected b a(int paramInt) {
    return ((f)this.c.get(paramInt)).w0();
  }
  
  protected T a(b paramb) {
    return (T)new f(paramb);
  }
  
  protected void a() {
    if (!this.g) {
      this.g = true;
      g.a().a(g.c.e, this.j);
    } 
  }
  
  protected void a(b paramb, int paramInt) {
    T t = a(paramb);
    paramb.setFragment((f)t);
    this.c.add(paramInt, t);
    paramb.setContainer(this);
    a();
  }
  
  protected boolean a(f paramf) {
    return this.c.contains(paramf);
  }
  
  protected void b() {
    a();
  }
  
  protected void b(int paramInt) {
    ((f)this.c.get(paramInt)).w0().setContainer(null);
    this.c.remove(paramInt);
    a();
  }
  
  protected boolean b(f paramf) {
    return paramf.w0().a();
  }
  
  protected void c() {
    boolean bool2;
    HashSet hashSet = new HashSet(this.d.u());
    int j = this.c.size();
    boolean bool1 = false;
    int i;
    for (i = 0; i < j; i++) {
      f f = (f)this.c.get(i);
      if (!b(f) && f.P())
        d(f); 
      hashSet.remove(f);
    } 
    if (!hashSet.isEmpty()) {
      Object[] arrayOfObject = hashSet.toArray();
      for (i = 0; i < arrayOfObject.length; i++) {
        if (arrayOfObject[i] instanceof f && ((f)arrayOfObject[i]).w0().getContainer() == null)
          d((f)arrayOfObject[i]); 
      } 
    } 
    int k = this.c.size();
    i = 0;
    for (j = 0; i < k; j = m) {
      int m = j;
      if (b((f)this.c.get(i)))
        m = j + 1; 
      i++;
    } 
    if (j > 1) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    k = this.c.size();
    j = 0;
    i = bool1;
    while (i < k) {
      int m;
      f f = (f)this.c.get(i);
      boolean bool = b(f);
      if (bool && !f.P()) {
        c(f);
        m = 1;
      } else {
        m = j;
        if (bool) {
          m = j;
          if (j != 0) {
            e(f);
            m = j;
          } 
        } 
      } 
      f.w0().setTransitioning(bool2);
      i++;
      j = m;
    } 
    e();
  }
  
  protected void d() {
    int j = this.c.size();
    for (int i = 0; i < j; i++)
      ((f)this.c.get(i)).w0().setContainer(null); 
    this.c.clear();
    a();
  }
  
  protected void e() {
    x x1 = this.e;
    if (x1 != null) {
      this.f = x1;
      this.f.a(new c(this, x1));
      this.e.b();
      this.e = null;
    } 
  }
  
  protected x getOrCreateTransaction() {
    if (this.e == null) {
      this.e = this.d.b();
      this.e.a(true);
    } 
    return this.e;
  }
  
  protected int getScreenCount() {
    return this.c.size();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    this.h = true;
    this.g = true;
    h();
  }
  
  protected void onDetachedFromWindow() {
    n n1 = this.d;
    if (n1 != null && !n1.C()) {
      g();
      this.d.p();
    } 
    super.onDetachedFromWindow();
    this.h = false;
    removeAllViews();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    paramInt2 = getChildCount();
    for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
      getChildAt(paramInt1).layout(0, 0, getWidth(), getHeight()); 
  }
  
  protected void onMeasure(int paramInt1, int paramInt2) {
    super.onMeasure(paramInt1, paramInt2);
    int j = getChildCount();
    for (int i = 0; i < j; i++)
      getChildAt(i).measure(paramInt1, paramInt2); 
  }
  
  public void requestLayout() {
    super.requestLayout();
    if (!this.i && this.k != null) {
      this.i = true;
      g.a().a(g.c.e, this.k);
    } 
  }
  
  class a extends com.facebook.react.modules.core.a.a {
    a(d this$0) {}
    
    public void a(long param1Long) {
      d.a(this.b);
    }
  }
  
  class b extends com.facebook.react.modules.core.a.a {
    b(d this$0) {}
    
    public void a(long param1Long) {
      d.a(this.b, false);
      d d1 = this.b;
      d1.measure(View.MeasureSpec.makeMeasureSpec(d1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.b.getHeight(), 1073741824));
      d1 = this.b;
      d1.layout(d1.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
    }
  }
  
  class c implements Runnable {
    c(d this$0, x param1x) {}
    
    public void run() {
      if (d.b(this.d) == this.c)
        d.a(this.d, (x)null); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */