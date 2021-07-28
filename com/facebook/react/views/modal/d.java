package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.view.f;
import e.e.o.k;
import java.util.ArrayList;

public class d extends ViewGroup implements LifecycleEventListener {
  private b c;
  
  private Dialog d;
  
  private boolean e;
  
  private boolean f;
  
  private String g;
  
  private boolean h;
  
  private boolean i;
  
  private DialogInterface.OnShowListener j;
  
  private c k;
  
  public d(Context paramContext) {
    super(paramContext);
    ((ReactContext)paramContext).addLifecycleEventListener(this);
    this.c = new b(paramContext);
  }
  
  private void c() {
    UiThreadUtil.assertOnUiThread();
    Dialog dialog = this.d;
    if (dialog != null) {
      if (dialog.isShowing()) {
        Activity activity = (Activity)e.e.o.i0.a.a.a(this.d.getContext(), Activity.class);
        if (activity == null || !activity.isFinishing())
          this.d.dismiss(); 
      } 
      this.d = null;
      ((ViewGroup)this.c.getParent()).removeViewAt(0);
    } 
  }
  
  private void d() {
    e.e.m.a.a.a(this.d, "mDialog must exist when we call updateProperties");
    Activity activity = getCurrentActivity();
    if (activity != null)
      if (((activity.getWindow().getAttributes()).flags & 0x400) != 0) {
        this.d.getWindow().addFlags(1024);
      } else {
        this.d.getWindow().clearFlags(1024);
      }  
    if (this.e) {
      this.d.getWindow().clearFlags(2);
      return;
    } 
    this.d.getWindow().setDimAmount(0.5F);
    this.d.getWindow().setFlags(2, 2);
  }
  
  private View getContentView() {
    FrameLayout frameLayout = new FrameLayout(getContext());
    frameLayout.addView((View)this.c);
    if (this.f) {
      frameLayout.setSystemUiVisibility(1024);
      return (View)frameLayout;
    } 
    frameLayout.setFitsSystemWindows(true);
    return (View)frameLayout;
  }
  
  private Activity getCurrentActivity() {
    return ((ReactContext)getContext()).getCurrentActivity();
  }
  
  public void a() {
    ((ReactContext)getContext()).removeLifecycleEventListener(this);
    c();
  }
  
  public void a(j0 paramj0, int paramInt1, int paramInt2) {
    this.c.a(paramj0, paramInt1, paramInt2);
  }
  
  public void addChildrenForAccessibility(ArrayList<View> paramArrayList) {}
  
  public void addView(View paramView, int paramInt) {
    UiThreadUtil.assertOnUiThread();
    this.c.addView(paramView, paramInt);
  }
  
  protected void b() {
    Activity activity1;
    UiThreadUtil.assertOnUiThread();
    if (this.d != null)
      if (this.i) {
        c();
      } else {
        d();
        return;
      }  
    this.i = false;
    int i = k.Theme_FullScreenDialog;
    if (this.g.equals("fade")) {
      i = k.Theme_FullScreenDialogAnimatedFade;
    } else if (this.g.equals("slide")) {
      i = k.Theme_FullScreenDialogAnimatedSlide;
    } 
    Activity activity2 = getCurrentActivity();
    if (activity2 == null) {
      Context context = getContext();
    } else {
      activity1 = activity2;
    } 
    this.d = new Dialog((Context)activity1, i);
    this.d.getWindow().setFlags(8, 8);
    this.d.setContentView(getContentView());
    d();
    this.d.setOnShowListener(this.j);
    this.d.setOnKeyListener(new a(this));
    this.d.getWindow().setSoftInputMode(16);
    if (this.h)
      this.d.getWindow().addFlags(16777216); 
    if (activity2 != null && !activity2.isFinishing()) {
      this.d.show();
      if (activity1 instanceof Activity)
        this.d.getWindow().getDecorView().setSystemUiVisibility(activity1.getWindow().getDecorView().getSystemUiVisibility()); 
      this.d.getWindow().clearFlags(8);
    } 
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return false;
  }
  
  @TargetApi(23)
  public void dispatchProvideStructure(ViewStructure paramViewStructure) {
    this.c.dispatchProvideStructure(paramViewStructure);
  }
  
  public View getChildAt(int paramInt) {
    return this.c.getChildAt(paramInt);
  }
  
  public int getChildCount() {
    return this.c.getChildCount();
  }
  
  public Dialog getDialog() {
    return this.d;
  }
  
  protected void onDetachedFromWindow() {
    super.onDetachedFromWindow();
    c();
  }
  
  public void onHostDestroy() {
    a();
  }
  
  public void onHostPause() {}
  
  public void onHostResume() {
    b();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void removeView(View paramView) {
    UiThreadUtil.assertOnUiThread();
    this.c.removeView(paramView);
  }
  
  public void removeViewAt(int paramInt) {
    UiThreadUtil.assertOnUiThread();
    View view = getChildAt(paramInt);
    this.c.removeView(view);
  }
  
  protected void setAnimationType(String paramString) {
    this.g = paramString;
    this.i = true;
  }
  
  protected void setHardwareAccelerated(boolean paramBoolean) {
    this.h = paramBoolean;
    this.i = true;
  }
  
  protected void setOnRequestCloseListener(c paramc) {
    this.k = paramc;
  }
  
  protected void setOnShowListener(DialogInterface.OnShowListener paramOnShowListener) {
    this.j = paramOnShowListener;
  }
  
  protected void setStatusBarTranslucent(boolean paramBoolean) {
    this.f = paramBoolean;
    this.i = true;
  }
  
  protected void setTransparent(boolean paramBoolean) {
    this.e = paramBoolean;
  }
  
  class a implements DialogInterface.OnKeyListener {
    a(d this$0) {}
    
    public boolean onKey(DialogInterface param1DialogInterface, int param1Int, KeyEvent param1KeyEvent) {
      if (param1KeyEvent.getAction() == 1) {
        if (param1Int == 4) {
          e.e.m.a.a.a(d.a(this.c), "setOnRequestCloseListener must be called by the manager");
          d.a(this.c).a(param1DialogInterface);
          return true;
        } 
        Activity activity = ((ReactContext)this.c.getContext()).getCurrentActivity();
        if (activity != null)
          return activity.onKeyUp(param1Int, param1KeyEvent); 
      } 
      return false;
    }
  }
  
  static class b extends f implements f0 {
    private boolean u = false;
    
    private int v;
    
    private int w;
    
    private j0 x;
    
    private final h y = new h((ViewGroup)this);
    
    public b(Context param1Context) {
      super(param1Context);
    }
    
    private com.facebook.react.uimanager.events.d e() {
      return ((UIManagerModule)f().getNativeModule(UIManagerModule.class)).getEventDispatcher();
    }
    
    private ReactContext f() {
      return (ReactContext)getContext();
    }
    
    private void g() {
      if (getChildCount() > 0) {
        this.u = false;
        int i = getChildAt(0).getId();
        j0 j01 = this.x;
        if (j01 != null) {
          a(j01, this.v, this.w);
          return;
        } 
        ReactContext reactContext = f();
        reactContext.runOnNativeModulesQueueThread((Runnable)new a(this, reactContext, i));
        return;
      } 
      this.u = true;
    }
    
    public void a(MotionEvent param1MotionEvent) {
      this.y.b(param1MotionEvent, e());
    }
    
    public void a(j0 param1j0, int param1Int1, int param1Int2) {
      this.x = param1j0;
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      writableNativeMap.putDouble("screenWidth", q.a(param1Int1));
      writableNativeMap.putDouble("screenHeight", q.a(param1Int2));
      param1j0.a((WritableMap)writableNativeMap);
    }
    
    public void a(Throwable param1Throwable) {
      f().handleException(new RuntimeException(param1Throwable));
    }
    
    public void addView(View param1View, int param1Int, ViewGroup.LayoutParams param1LayoutParams) {
      super.addView(param1View, param1Int, param1LayoutParams);
      if (this.u)
        g(); 
    }
    
    public boolean onInterceptTouchEvent(MotionEvent param1MotionEvent) {
      this.y.a(param1MotionEvent, e());
      return super.onInterceptTouchEvent(param1MotionEvent);
    }
    
    protected void onSizeChanged(int param1Int1, int param1Int2, int param1Int3, int param1Int4) {
      super.onSizeChanged(param1Int1, param1Int2, param1Int3, param1Int4);
      this.v = param1Int1;
      this.w = param1Int2;
      g();
    }
    
    public boolean onTouchEvent(MotionEvent param1MotionEvent) {
      this.y.a(param1MotionEvent, e());
      super.onTouchEvent(param1MotionEvent);
      return true;
    }
    
    public void requestDisallowInterceptTouchEvent(boolean param1Boolean) {}
    
    class a extends GuardedRunnable {
      a(d.b this$0, ReactContext param2ReactContext, int param2Int) {
        super(param2ReactContext);
      }
      
      public void runGuarded() {
        ((UIManagerModule)d.b.c(this.d).getNativeModule(UIManagerModule.class)).updateNodeSize(this.c, d.b.a(this.d), d.b.b(this.d));
      }
    }
  }
  
  class a extends GuardedRunnable {
    a(d this$0, ReactContext param1ReactContext, int param1Int) {
      super(param1ReactContext);
    }
    
    public void runGuarded() {
      ((UIManagerModule)d.b.c(this.d).getNativeModule(UIManagerModule.class)).updateNodeSize(this.c, d.b.a(this.d), d.b.b(this.d));
    }
  }
  
  public static interface c {
    void a(DialogInterface param1DialogInterface);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/modal/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */