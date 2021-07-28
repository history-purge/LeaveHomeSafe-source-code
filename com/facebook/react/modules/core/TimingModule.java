package com.facebook.react.modules.core;

import com.facebook.fbreact.specs.NativeTimingSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.devsupport.h.c;
import e.e.o.c0.b;
import e.e.o.c0.c;
import e.e.o.d0.a.a;

@a(name = "Timing")
public final class TimingModule extends NativeTimingSpec implements LifecycleEventListener, c {
  public static final String NAME = "Timing";
  
  private final d mJavaTimerManager;
  
  public TimingModule(ReactApplicationContext paramReactApplicationContext, c paramc) {
    super(paramReactApplicationContext);
    this.mJavaTimerManager = new d(paramReactApplicationContext, new a(this), g.a(), paramc);
  }
  
  public void createTimer(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean) {
    int i = (int)paramDouble1;
    int j = (int)paramDouble2;
    this.mJavaTimerManager.a(i, j, paramDouble3, paramBoolean);
  }
  
  public void deleteTimer(double paramDouble) {
    int i = (int)paramDouble;
    this.mJavaTimerManager.deleteTimer(i);
  }
  
  public String getName() {
    return "Timing";
  }
  
  public boolean hasActiveTimersInRange(long paramLong) {
    return this.mJavaTimerManager.a(paramLong);
  }
  
  public void initialize() {
    getReactApplicationContext().addLifecycleEventListener(this);
    b.a((ReactContext)getReactApplicationContext()).a(this);
  }
  
  public void onCatalystInstanceDestroy() {
    b.a((ReactContext)getReactApplicationContext()).b(this);
    this.mJavaTimerManager.d();
  }
  
  public void onHeadlessJsTaskFinish(int paramInt) {
    this.mJavaTimerManager.a(paramInt);
  }
  
  public void onHeadlessJsTaskStart(int paramInt) {
    this.mJavaTimerManager.b(paramInt);
  }
  
  public void onHostDestroy() {
    this.mJavaTimerManager.a();
  }
  
  public void onHostPause() {
    this.mJavaTimerManager.b();
  }
  
  public void onHostResume() {
    this.mJavaTimerManager.c();
  }
  
  public void setSendIdleEvents(boolean paramBoolean) {
    this.mJavaTimerManager.setSendIdleEvents(paramBoolean);
  }
  
  public class a implements c {
    public a(TimingModule this$0) {}
    
    public void callIdleCallbacks(double param1Double) {
      ReactApplicationContext reactApplicationContext = this.a.getReactApplicationContextIfActiveOrWarn();
      if (reactApplicationContext != null)
        ((JSTimers)reactApplicationContext.getJSModule(JSTimers.class)).callIdleCallbacks(param1Double); 
    }
    
    public void callTimers(WritableArray param1WritableArray) {
      ReactApplicationContext reactApplicationContext = this.a.getReactApplicationContextIfActiveOrWarn();
      if (reactApplicationContext != null)
        ((JSTimers)reactApplicationContext.getJSModule(JSTimers.class)).callTimers(param1WritableArray); 
    }
    
    public void emitTimeDriftWarning(String param1String) {
      ReactApplicationContext reactApplicationContext = this.a.getReactApplicationContextIfActiveOrWarn();
      if (reactApplicationContext != null)
        ((JSTimers)reactApplicationContext.getJSModule(JSTimers.class)).emitTimeDriftWarning(param1String); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/TimingModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */