package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.h.c;
import e.e.o.d0.a.a;

@a(name = "LogBox")
public class LogBoxModule extends NativeLogBoxSpec {
  public static final String NAME = "LogBox";
  
  private final c mDevSupportManager;
  
  private d mLogBoxDialog;
  
  private View mReactRootView;
  
  public LogBoxModule(ReactApplicationContext paramReactApplicationContext, c paramc) {
    super(paramReactApplicationContext);
    this.mDevSupportManager = paramc;
    UiThreadUtil.runOnUiThread(new a(this));
  }
  
  public String getName() {
    return "LogBox";
  }
  
  public void hide() {
    UiThreadUtil.runOnUiThread(new c(this));
  }
  
  public void onCatalystInstanceDestroy() {
    UiThreadUtil.runOnUiThread(new d(this));
  }
  
  public void show() {
    if (this.mReactRootView != null)
      UiThreadUtil.runOnUiThread(new b(this)); 
  }
  
  class a implements Runnable {
    a(LogBoxModule this$0) {}
    
    public void run() {
      if (this.c.mReactRootView == null && this.c.mDevSupportManager != null) {
        LogBoxModule logBoxModule = this.c;
        LogBoxModule.access$002(logBoxModule, logBoxModule.mDevSupportManager.a("LogBox"));
        if (this.c.mReactRootView == null)
          com.facebook.react.util.c.a("Unable to launch logbox because react was unable to create the root view"); 
      } 
    }
  }
  
  class b implements Runnable {
    b(LogBoxModule this$0) {}
    
    public void run() {
      if (this.c.mLogBoxDialog == null && this.c.mReactRootView != null) {
        Activity activity = this.c.getCurrentActivity();
        if (activity == null || activity.isFinishing()) {
          com.facebook.react.util.c.a("Unable to launch logbox because react activity is not available, here is the error that logbox would've displayed: ");
          return;
        } 
        LogBoxModule logBoxModule = this.c;
        LogBoxModule.access$202(logBoxModule, new d(activity, logBoxModule.mReactRootView));
        this.c.mLogBoxDialog.setCancelable(false);
        this.c.mLogBoxDialog.show();
        return;
      } 
    }
  }
  
  class c implements Runnable {
    c(LogBoxModule this$0) {}
    
    public void run() {
      if (this.c.mLogBoxDialog != null) {
        if (this.c.mReactRootView != null && this.c.mReactRootView.getParent() != null)
          ((ViewGroup)this.c.mReactRootView.getParent()).removeView(this.c.mReactRootView); 
        this.c.mLogBoxDialog.dismiss();
        LogBoxModule.access$202(this.c, null);
      } 
    }
  }
  
  class d implements Runnable {
    d(LogBoxModule this$0) {}
    
    public void run() {
      if (this.c.mReactRootView != null) {
        this.c.mDevSupportManager.a(this.c.mReactRootView);
        LogBoxModule.access$002(this.c, null);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/LogBoxModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */