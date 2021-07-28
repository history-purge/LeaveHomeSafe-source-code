package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import b.g.m.v;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.q;
import e.e.o.d0.a.a;
import java.util.Map;

@a(name = "StatusBarManager")
public class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
  private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
  
  private static final String HEIGHT_KEY = "HEIGHT";
  
  public static final String NAME = "StatusBarManager";
  
  public StatusBarModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  public String getName() {
    return "StatusBarManager";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    float f;
    String str;
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    Activity activity = getCurrentActivity();
    int i = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
    if (i > 0) {
      f = q.a(reactApplicationContext.getResources().getDimensionPixelSize(i));
    } else {
      f = 0.0F;
    } 
    if (activity != null && Build.VERSION.SDK_INT >= 21) {
      str = String.format("#%06X", new Object[] { Integer.valueOf(activity.getWindow().getStatusBarColor() & 0xFFFFFF) });
    } else {
      str = "black";
    } 
    return f.a("HEIGHT", Float.valueOf(f), "DEFAULT_BACKGROUND_COLOR", str);
  }
  
  public void setColor(double paramDouble, boolean paramBoolean) {
    int i = (int)paramDouble;
    Activity activity = getCurrentActivity();
    if (activity == null) {
      e.e.e.e.a.e("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
      return;
    } 
    if (Build.VERSION.SDK_INT >= 21)
      UiThreadUtil.runOnUiThread((Runnable)new a(this, (ReactContext)getReactApplicationContext(), activity, paramBoolean, i)); 
  }
  
  public void setHidden(boolean paramBoolean) {
    Activity activity = getCurrentActivity();
    if (activity == null) {
      e.e.e.e.a.e("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
      return;
    } 
    UiThreadUtil.runOnUiThread(new c(this, paramBoolean, activity));
  }
  
  public void setStyle(String paramString) {
    Activity activity = getCurrentActivity();
    if (activity == null) {
      e.e.e.e.a.e("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
      return;
    } 
    if (Build.VERSION.SDK_INT >= 23)
      UiThreadUtil.runOnUiThread(new d(this, activity, paramString)); 
  }
  
  public void setTranslucent(boolean paramBoolean) {
    Activity activity = getCurrentActivity();
    if (activity == null) {
      e.e.e.e.a.e("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
      return;
    } 
    if (Build.VERSION.SDK_INT >= 21)
      UiThreadUtil.runOnUiThread((Runnable)new b(this, (ReactContext)getReactApplicationContext(), activity, paramBoolean)); 
  }
  
  class a extends GuardedRunnable {
    a(StatusBarModule this$0, ReactContext param1ReactContext, Activity param1Activity, boolean param1Boolean, int param1Int) {
      super(param1ReactContext);
    }
    
    @TargetApi(21)
    public void runGuarded() {
      this.c.getWindow().addFlags(-2147483648);
      if (this.d) {
        int i = this.c.getWindow().getStatusBarColor();
        ValueAnimator valueAnimator = ValueAnimator.ofObject((TypeEvaluator)new ArgbEvaluator(), new Object[] { Integer.valueOf(i), Integer.valueOf(this.e) });
        valueAnimator.addUpdateListener(new a(this));
        valueAnimator.setDuration(300L).setStartDelay(0L);
        valueAnimator.start();
        return;
      } 
      this.c.getWindow().setStatusBarColor(this.e);
    }
    
    class a implements ValueAnimator.AnimatorUpdateListener {
      a(StatusBarModule.a this$0) {}
      
      public void onAnimationUpdate(ValueAnimator param2ValueAnimator) {
        this.a.c.getWindow().setStatusBarColor(((Integer)param2ValueAnimator.getAnimatedValue()).intValue());
      }
    }
  }
  
  class a implements ValueAnimator.AnimatorUpdateListener {
    a(StatusBarModule this$0) {}
    
    public void onAnimationUpdate(ValueAnimator param1ValueAnimator) {
      this.a.c.getWindow().setStatusBarColor(((Integer)param1ValueAnimator.getAnimatedValue()).intValue());
    }
  }
  
  class b extends GuardedRunnable {
    b(StatusBarModule this$0, ReactContext param1ReactContext, Activity param1Activity, boolean param1Boolean) {
      super(param1ReactContext);
    }
    
    @TargetApi(21)
    public void runGuarded() {
      View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
      View view = this.c.getWindow().getDecorView();
      if (this.d) {
        onApplyWindowInsetsListener = new a(this);
      } else {
        onApplyWindowInsetsListener = null;
      } 
      view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
      v.N(view);
    }
    
    class a implements View.OnApplyWindowInsetsListener {
      a(StatusBarModule.b this$0) {}
      
      public WindowInsets onApplyWindowInsets(View param2View, WindowInsets param2WindowInsets) {
        WindowInsets windowInsets = param2View.onApplyWindowInsets(param2WindowInsets);
        return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
      }
    }
  }
  
  class a implements View.OnApplyWindowInsetsListener {
    a(StatusBarModule this$0) {}
    
    public WindowInsets onApplyWindowInsets(View param1View, WindowInsets param1WindowInsets) {
      WindowInsets windowInsets = param1View.onApplyWindowInsets(param1WindowInsets);
      return windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), 0, windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
    }
  }
  
  class c implements Runnable {
    c(StatusBarModule this$0, boolean param1Boolean, Activity param1Activity) {}
    
    public void run() {
      if (this.c) {
        this.d.getWindow().addFlags(1024);
        this.d.getWindow().clearFlags(2048);
        return;
      } 
      this.d.getWindow().addFlags(2048);
      this.d.getWindow().clearFlags(1024);
    }
  }
  
  class d implements Runnable {
    d(StatusBarModule this$0, Activity param1Activity, String param1String) {}
    
    @TargetApi(23)
    public void run() {
      View view = this.c.getWindow().getDecorView();
      int i = view.getSystemUiVisibility();
      if ("dark-content".equals(this.d)) {
        i |= 0x2000;
      } else {
        i &= 0xFFFFDFFF;
      } 
      view.setSystemUiVisibility(i);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/statusbar/StatusBarModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */