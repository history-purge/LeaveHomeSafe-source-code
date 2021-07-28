package com.facebook.react.views.viewpager;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import b.t.a.b;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.f;
import java.util.ArrayList;
import java.util.List;

public class d extends b {
  private final com.facebook.react.uimanager.events.d l0;
  
  private boolean m0;
  
  private boolean n0 = true;
  
  private final Runnable o0 = new a(this);
  
  public d(ReactContext paramReactContext) {
    super((Context)paramReactContext);
    this.l0 = ((UIManagerModule)paramReactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
    this.m0 = false;
    setOnPageChangeListener(new c(null));
    setAdapter(new b(null));
  }
  
  void a(View paramView, int paramInt) {
    getAdapter().a(paramView, paramInt);
  }
  
  public void b(int paramInt, boolean paramBoolean) {
    this.m0 = true;
    a(paramInt, paramBoolean);
    this.m0 = false;
  }
  
  View d(int paramInt) {
    return getAdapter().b(paramInt);
  }
  
  void e(int paramInt) {
    getAdapter().c(paramInt);
  }
  
  public b getAdapter() {
    return (b)super.getAdapter();
  }
  
  int getViewCountInAdapter() {
    return getAdapter().a();
  }
  
  protected void onAttachedToWindow() {
    super.onAttachedToWindow();
    requestLayout();
    post(this.o0);
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.n0)
      return false; 
    try {
      if (super.onInterceptTouchEvent(paramMotionEvent)) {
        f.a((View)this, paramMotionEvent);
        return true;
      } 
    } catch (IllegalArgumentException illegalArgumentException) {
      e.e.e.e.a.c("ReactNative", "Error intercepting touch event.", illegalArgumentException);
    } 
    return false;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent) {
    if (!this.n0)
      return false; 
    try {
      return super.onTouchEvent(paramMotionEvent);
    } catch (IllegalArgumentException illegalArgumentException) {
      e.e.e.e.a.c("ReactNative", "Error handling touch event.", illegalArgumentException);
      return false;
    } 
  }
  
  public void setScrollEnabled(boolean paramBoolean) {
    this.n0 = paramBoolean;
  }
  
  public void setViews(List<View> paramList) {
    getAdapter().a(paramList);
  }
  
  class a implements Runnable {
    a(d this$0) {}
    
    public void run() {
      d d1 = this.c;
      d1.measure(View.MeasureSpec.makeMeasureSpec(d1.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.c.getHeight(), 1073741824));
      d1 = this.c;
      d1.layout(d1.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
    }
  }
  
  private class b extends b.t.a.a {
    private final List<View> c = new ArrayList<View>();
    
    private boolean d = false;
    
    private b(d this$0) {}
    
    public int a() {
      return this.c.size();
    }
    
    public int a(Object param1Object) {
      return (this.d || !this.c.contains(param1Object)) ? -2 : this.c.indexOf(param1Object);
    }
    
    public Object a(ViewGroup param1ViewGroup, int param1Int) {
      View view = this.c.get(param1Int);
      param1ViewGroup.addView(view, 0, d.a(this.e));
      return view;
    }
    
    void a(View param1View, int param1Int) {
      this.c.add(param1Int, param1View);
      b();
      this.e.setOffscreenPageLimit(this.c.size());
    }
    
    public void a(ViewGroup param1ViewGroup, int param1Int, Object param1Object) {
      param1ViewGroup.removeView((View)param1Object);
    }
    
    void a(List<View> param1List) {
      this.c.clear();
      this.c.addAll(param1List);
      b();
      this.d = false;
    }
    
    public boolean a(View param1View, Object param1Object) {
      return (param1View == param1Object);
    }
    
    View b(int param1Int) {
      return this.c.get(param1Int);
    }
    
    void c(int param1Int) {
      this.c.remove(param1Int);
      b();
      this.e.setOffscreenPageLimit(this.c.size());
    }
  }
  
  private class c implements b.j {
    private c(d this$0) {}
    
    public void a(int param1Int) {
      String str;
      if (param1Int != 0) {
        if (param1Int != 1) {
          if (param1Int == 2) {
            str = "settling";
          } else {
            throw new IllegalStateException("Unsupported pageScrollState");
          } 
        } else {
          str = "dragging";
        } 
      } else {
        str = "idle";
      } 
      d.b(this.a).a(new b(this.a.getId(), str));
    }
    
    public void a(int param1Int1, float param1Float, int param1Int2) {
      d.b(this.a).a(new a(this.a.getId(), param1Int1, param1Float));
    }
    
    public void b(int param1Int) {
      if (!d.c(this.a))
        d.b(this.a).a(new c(this.a.getId(), param1Int)); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/viewpager/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */