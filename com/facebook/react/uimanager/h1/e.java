package com.facebook.react.uimanager.h1;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;

public class e {
  private static Handler h;
  
  private final a a = new h();
  
  private final a b = new k();
  
  private final a c = new i();
  
  private final SparseArray<j> d = new SparseArray(0);
  
  private boolean e;
  
  private long f = -1L;
  
  private Runnable g;
  
  private void a(long paramLong) {
    if (h == null)
      h = new Handler(Looper.getMainLooper()); 
    Runnable runnable = this.g;
    if (runnable != null) {
      h.removeCallbacks(runnable);
      h.postDelayed(this.g, paramLong);
    } 
  }
  
  private void b(View paramView) {
    int i = 0;
    paramView.setClickable(false);
    if (paramView instanceof ViewGroup) {
      ViewGroup viewGroup = (ViewGroup)paramView;
      while (i < viewGroup.getChildCount()) {
        b(viewGroup.getChildAt(i));
        i++;
      } 
    } 
  }
  
  public void a() {
    this.a.b();
    this.b.b();
    this.c.b();
    this.g = null;
    this.e = false;
    this.f = -1L;
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    a a1;
    UiThreadUtil.assertOnUiThread();
    int i = paramView.getId();
    j j = (j)this.d.get(i);
    if (j != null) {
      j.a(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    } 
    if (paramView.getWidth() == 0 || paramView.getHeight() == 0) {
      a1 = this.a;
    } else {
      a1 = this.b;
    } 
    Animation animation = a1.a(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
    if (animation instanceof j) {
      animation.setAnimationListener(new b(this, i));
    } else {
      paramView.layout(paramInt1, paramInt2, paramInt3 + paramInt1, paramInt4 + paramInt2);
    } 
    if (animation != null) {
      long l = animation.getDuration();
      if (l > this.f) {
        this.f = l;
        a(l);
      } 
      paramView.startAnimation(animation);
    } 
  }
  
  public void a(View paramView, f paramf) {
    UiThreadUtil.assertOnUiThread();
    Animation animation = this.c.a(paramView, paramView.getLeft(), paramView.getTop(), paramView.getWidth(), paramView.getHeight());
    if (animation != null) {
      b(paramView);
      animation.setAnimationListener(new c(this, paramf));
      long l = animation.getDuration();
      if (l > this.f) {
        a(l);
        this.f = l;
      } 
      paramView.startAnimation(animation);
      return;
    } 
    paramf.a();
  }
  
  public void a(ReadableMap paramReadableMap, Callback paramCallback) {
    if (paramReadableMap == null) {
      a();
      return;
    } 
    int i = 0;
    this.e = false;
    if (paramReadableMap.hasKey("duration"))
      i = paramReadableMap.getInt("duration"); 
    if (paramReadableMap.hasKey(g.a(g.c))) {
      this.a.a(paramReadableMap.getMap(g.a(g.c)), i);
      this.e = true;
    } 
    if (paramReadableMap.hasKey(g.a(g.d))) {
      this.b.a(paramReadableMap.getMap(g.a(g.d)), i);
      this.e = true;
    } 
    if (paramReadableMap.hasKey(g.a(g.e))) {
      this.c.a(paramReadableMap.getMap(g.a(g.e)), i);
      this.e = true;
    } 
    if (this.e && paramCallback != null)
      this.g = new a(this, paramCallback); 
  }
  
  public boolean a(View paramView) {
    boolean bool = false;
    if (paramView == null)
      return false; 
    if ((this.e && paramView.getParent() != null) || this.d.get(paramView.getId()) != null)
      bool = true; 
    return bool;
  }
  
  class a implements Runnable {
    a(e this$0, Callback param1Callback) {}
    
    public void run() {
      this.c.invoke(new Object[] { Boolean.TRUE });
    }
  }
  
  class b implements Animation.AnimationListener {
    b(e this$0, int param1Int) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      e.a(this.b).remove(this.a);
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {
      e.a(this.b).put(this.a, param1Animation);
    }
  }
  
  class c implements Animation.AnimationListener {
    c(e this$0, f param1f) {}
    
    public void onAnimationEnd(Animation param1Animation) {
      this.a.a();
    }
    
    public void onAnimationRepeat(Animation param1Animation) {}
    
    public void onAnimationStart(Animation param1Animation) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */