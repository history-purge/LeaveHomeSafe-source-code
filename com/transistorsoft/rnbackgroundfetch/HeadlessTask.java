package com.transistorsoft.rnbackgroundfetch;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.common.LifecycleState;
import e.e.o.c0.c;
import e.e.o.p;
import e.e.o.r;
import e.e.o.u;

public class HeadlessTask implements c {
  private static String HEADLESS_TASK_NAME = "BackgroundFetch";
  
  private static Handler mHandler = new Handler();
  
  private e.e.o.c0.b mActiveTaskContext;
  
  private u mReactNativeHost;
  
  public HeadlessTask(Context paramContext, com.transistorsoft.tsbackgroundfetch.a parama) {
    try {
      this.mReactNativeHost = ((p)paramContext.getApplicationContext()).a();
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      writableNativeMap.putString("taskId", parama.c());
      writableNativeMap.putBoolean("timeout", parama.d());
      startTask(new e.e.o.c0.a(HEADLESS_TASK_NAME, (WritableMap)writableNativeMap, 30000L));
      return;
    } catch (AssertionError|ClassCastException assertionError) {
      Log.e("TSBackgroundFetch", "Failed to fetch ReactApplication.  Task ignored.");
      return;
    } 
  }
  
  private void invokeStartTask(ReactContext paramReactContext, e.e.o.c0.a parama) {
    if (paramReactContext.getLifecycleState() == LifecycleState.e)
      return; 
    e.e.o.c0.b b1 = e.e.o.c0.b.a(paramReactContext);
    b1.a(this);
    this.mActiveTaskContext = b1;
    try {
      UiThreadUtil.runOnUiThread(new b(this, b1, parama));
      return;
    } catch (IllegalStateException illegalStateException) {
      Log.e("TSBackgroundFetch", "Headless task attempted to run in the foreground.  Task ignored.");
      return;
    } 
  }
  
  public void finish() {
    e.e.o.c0.b b1 = this.mActiveTaskContext;
    if (b1 != null)
      b1.b(this); 
  }
  
  public void onHeadlessJsTaskFinish(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onHeadlessJsTaskFinish: ");
    stringBuilder.append(paramInt);
    Log.d("TSBackgroundFetch", stringBuilder.toString());
    this.mActiveTaskContext.b(this);
  }
  
  public void onHeadlessJsTaskStart(int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("onHeadlessJsTaskStart: ");
    stringBuilder.append(paramInt);
    Log.d("TSBackgroundFetch", stringBuilder.toString());
  }
  
  protected void startTask(e.e.o.c0.a parama) {
    UiThreadUtil.assertOnUiThread();
    r r = this.mReactNativeHost.h();
    ReactContext reactContext = r.b();
    if (reactContext == null) {
      r.a(new a(this, parama, r));
      if (!r.e()) {
        r.a();
        return;
      } 
    } else {
      invokeStartTask(reactContext, parama);
    } 
  }
  
  class a implements r.k {
    a(HeadlessTask this$0, e.e.o.c0.a param1a, r param1r) {}
    
    public void a(ReactContext param1ReactContext) {
      HeadlessTask.mHandler.postDelayed(new a(this, param1ReactContext), 500L);
      this.b.b(this);
    }
    
    class a implements Runnable {
      a(HeadlessTask.a this$0, ReactContext param2ReactContext) {}
      
      public void run() {
        HeadlessTask.a a1 = this.d;
        a1.c.invokeStartTask(this.c, a1.a);
      }
    }
  }
  
  class a implements Runnable {
    a(HeadlessTask this$0, ReactContext param1ReactContext) {}
    
    public void run() {
      HeadlessTask.a a1 = this.d;
      a1.c.invokeStartTask(this.c, a1.a);
    }
  }
  
  class b implements Runnable {
    b(HeadlessTask this$0, e.e.o.c0.b param1b, e.e.o.c0.a param1a) {}
    
    public void run() {
      try {
        this.c.a(this.d);
        return;
      } catch (IllegalStateException illegalStateException) {
        Log.e("TSBackgroundFetch", "Headless task attempted to run in the foreground.  Task ignored.");
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/rnbackgroundfetch/HeadlessTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */