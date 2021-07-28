package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.fbreact.specs.NativeAccessibilityInfoSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import e.e.o.d0.a.a;

@a(name = "AccessibilityInfo")
public class AccessibilityInfoModule extends NativeAccessibilityInfoSpec implements LifecycleEventListener {
  public static final String NAME = "AccessibilityInfo";
  
  private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
  
  private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
  
  private final ContentObserver animationScaleObserver = new a(this, new Handler(Looper.getMainLooper()));
  
  private AccessibilityManager mAccessibilityManager;
  
  private final ContentResolver mContentResolver;
  
  private boolean mReduceMotionEnabled = false;
  
  private boolean mTouchExplorationEnabled = false;
  
  private b mTouchExplorationStateChangeListener;
  
  public AccessibilityInfoModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    this.mAccessibilityManager = (AccessibilityManager)paramReactApplicationContext.getApplicationContext().getSystemService("accessibility");
    this.mContentResolver = getReactApplicationContext().getContentResolver();
    this.mTouchExplorationEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
    this.mReduceMotionEnabled = getIsReduceMotionEnabledValue();
    if (Build.VERSION.SDK_INT >= 19)
      this.mTouchExplorationStateChangeListener = new b(null); 
  }
  
  private boolean getIsReduceMotionEnabledValue() {
    String str;
    if (Build.VERSION.SDK_INT < 17) {
      str = null;
    } else {
      str = Settings.Global.getString(this.mContentResolver, "transition_animation_scale");
    } 
    return (str != null && str.equals("0.0"));
  }
  
  private void updateAndSendReduceMotionChangeEvent() {
    boolean bool = getIsReduceMotionEnabledValue();
    if (this.mReduceMotionEnabled != bool) {
      this.mReduceMotionEnabled = bool;
      ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
      if (reactApplicationContext != null)
        ((DeviceEventManagerModule.RCTDeviceEventEmitter)reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("reduceMotionDidChange", Boolean.valueOf(this.mReduceMotionEnabled)); 
    } 
  }
  
  private void updateAndSendTouchExplorationChangeEvent(boolean paramBoolean) {
    if (this.mTouchExplorationEnabled != paramBoolean) {
      this.mTouchExplorationEnabled = paramBoolean;
      if (getReactApplicationContextIfActiveOrWarn() != null)
        ((DeviceEventManagerModule.RCTDeviceEventEmitter)getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("touchExplorationDidChange", Boolean.valueOf(this.mTouchExplorationEnabled)); 
    } 
  }
  
  public void announceForAccessibility(String paramString) {
    AccessibilityManager accessibilityManager = this.mAccessibilityManager;
    if (accessibilityManager != null) {
      if (!accessibilityManager.isEnabled())
        return; 
      AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain(16384);
      accessibilityEvent.getText().add(paramString);
      accessibilityEvent.setClassName(AccessibilityInfoModule.class.getName());
      accessibilityEvent.setPackageName(getReactApplicationContext().getPackageName());
      this.mAccessibilityManager.sendAccessibilityEvent(accessibilityEvent);
    } 
  }
  
  public String getName() {
    return "AccessibilityInfo";
  }
  
  public void initialize() {
    getReactApplicationContext().addLifecycleEventListener(this);
    updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    updateAndSendReduceMotionChangeEvent();
  }
  
  public void isReduceMotionEnabled(Callback paramCallback) {
    paramCallback.invoke(new Object[] { Boolean.valueOf(this.mReduceMotionEnabled) });
  }
  
  public void isTouchExplorationEnabled(Callback paramCallback) {
    paramCallback.invoke(new Object[] { Boolean.valueOf(this.mTouchExplorationEnabled) });
  }
  
  public void onCatalystInstanceDestroy() {
    super.onCatalystInstanceDestroy();
    getReactApplicationContext().removeLifecycleEventListener(this);
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    if (Build.VERSION.SDK_INT >= 19)
      this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener); 
    if (Build.VERSION.SDK_INT >= 17)
      this.mContentResolver.unregisterContentObserver(this.animationScaleObserver); 
  }
  
  public void onHostResume() {
    if (Build.VERSION.SDK_INT >= 19)
      this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener); 
    if (Build.VERSION.SDK_INT >= 17) {
      Uri uri = Settings.Global.getUriFor("transition_animation_scale");
      this.mContentResolver.registerContentObserver(uri, false, this.animationScaleObserver);
    } 
    updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
    updateAndSendReduceMotionChangeEvent();
  }
  
  public void setAccessibilityFocus(double paramDouble) {}
  
  class a extends ContentObserver {
    a(AccessibilityInfoModule this$0, Handler param1Handler) {
      super(param1Handler);
    }
    
    public void onChange(boolean param1Boolean) {
      onChange(param1Boolean, null);
    }
    
    public void onChange(boolean param1Boolean, Uri param1Uri) {
      if (this.a.getReactApplicationContext().hasActiveCatalystInstance())
        this.a.updateAndSendReduceMotionChangeEvent(); 
    }
  }
  
  @TargetApi(19)
  private class b implements AccessibilityManager.TouchExplorationStateChangeListener {
    private b(AccessibilityInfoModule this$0) {}
    
    public void onTouchExplorationStateChanged(boolean param1Boolean) {
      this.a.updateAndSendTouchExplorationChangeEvent(param1Boolean);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/accessibilityinfo/AccessibilityInfoModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */