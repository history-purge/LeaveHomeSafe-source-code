package com.swmansion.gesturehandler.react;

import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.views.modal.c;
import e.e.o.y;
import e.h.a.d;

public class g {
  private final ReactContext a;
  
  private final d b;
  
  private final e.h.a.b c;
  
  private final ViewGroup d;
  
  private boolean e = false;
  
  private boolean f = false;
  
  public g(ReactContext paramReactContext, ViewGroup paramViewGroup) {
    UiThreadUtil.assertOnUiThread();
    int i = paramViewGroup.getId();
    if (i >= 1) {
      RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule)paramReactContext.getNativeModule(RNGestureHandlerModule.class);
      f f = rNGestureHandlerModule.getRegistry();
      this.d = a(paramViewGroup);
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("[GESTURE HANDLER] Initialize gesture handler for root view ");
      stringBuilder1.append(this.d);
      Log.i("ReactNative", stringBuilder1.toString());
      this.a = paramReactContext;
      this.b = new d(paramViewGroup, f, new j());
      this.b.a(0.1F);
      this.c = new b(null);
      this.c.a(-i);
      f.a(this.c);
      f.a(this.c.m(), i);
      rNGestureHandlerModule.registerRootHelper(this);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Expect view tag to be set for ");
    stringBuilder.append(paramViewGroup);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  private static ViewGroup a(ViewGroup paramViewGroup) {
    ViewParent viewParent;
    UiThreadUtil.assertOnUiThread();
    ViewGroup viewGroup = paramViewGroup;
    while (viewGroup != null && !(viewGroup instanceof y) && !c.a((ViewParent)viewGroup))
      viewParent = viewGroup.getParent(); 
    if (viewParent != null)
      return (ViewGroup)viewParent; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("View ");
    stringBuilder.append(paramViewGroup);
    stringBuilder.append(" has not been mounted under ReactRootView");
    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
    throw illegalStateException;
  }
  
  private void c() {
    e.h.a.b b1 = this.c;
    if (b1 != null && b1.l() == 2) {
      this.c.a();
      this.c.d();
    } 
  }
  
  public ViewGroup a() {
    return this.d;
  }
  
  void a(int paramInt, boolean paramBoolean) {
    if (paramBoolean)
      UiThreadUtil.runOnUiThread(new a(this)); 
  }
  
  public void a(boolean paramBoolean) {
    if (this.b != null && !this.f)
      c(); 
  }
  
  public boolean a(MotionEvent paramMotionEvent) {
    this.f = true;
    this.b.b(paramMotionEvent);
    this.f = false;
    return this.e;
  }
  
  public void b() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[GESTURE HANDLER] Tearing down gesture handler registered for root view ");
    stringBuilder.append(this.d);
    Log.i("ReactNative", stringBuilder.toString());
    RNGestureHandlerModule rNGestureHandlerModule = (RNGestureHandlerModule)this.a.getNativeModule(RNGestureHandlerModule.class);
    rNGestureHandlerModule.getRegistry().a(this.c.m());
    rNGestureHandlerModule.unregisterRootHelper(this);
  }
  
  class a implements Runnable {
    a(g this$0) {}
    
    public void run() {
      g.b(this.c);
    }
  }
  
  private class b extends e.h.a.b {
    private b(g this$0) {}
    
    protected void c(MotionEvent param1MotionEvent) {
      if (l() == 0) {
        b();
        g.a(this.B, false);
      } 
      if (param1MotionEvent.getActionMasked() == 1)
        d(); 
    }
    
    protected void q() {
      g.a(this.B, true);
      long l = SystemClock.uptimeMillis();
      MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
      motionEvent.setAction(3);
      if (g.a(this.B) instanceof y) {
        ((y)g.a(this.B)).a(motionEvent);
        return;
      } 
      c.a(g.a(this.B), motionEvent);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */