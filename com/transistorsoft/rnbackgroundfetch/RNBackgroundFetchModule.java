package com.transistorsoft.rnbackgroundfetch;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.transistorsoft.tsbackgroundfetch.b;
import com.transistorsoft.tsbackgroundfetch.c;

public class RNBackgroundFetchModule extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener {
  private static final String EVENT_FETCH = "fetch";
  
  private static final String FETCH_TASK_ID = "react-native-background-fetch";
  
  private static final String JOB_SERVICE_CLASS = HeadlessTask.class.getName();
  
  public static final String TAG = "RNBackgroundFetch";
  
  private boolean initialized = false;
  
  private boolean isForceReload = false;
  
  public RNBackgroundFetchModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    paramReactApplicationContext.addLifecycleEventListener(this);
  }
  
  private c.b buildConfig(ReadableMap paramReadableMap) {
    c.b b = new c.b();
    if (paramReadableMap.hasKey("minimumFetchInterval"))
      b.a(paramReadableMap.getInt("minimumFetchInterval")); 
    if (paramReadableMap.hasKey("taskId"))
      b.b(paramReadableMap.getString("taskId")); 
    if (paramReadableMap.hasKey("delay"))
      b.a(Integer.valueOf(paramReadableMap.getInt("delay")).longValue()); 
    if (paramReadableMap.hasKey("stopOnTerminate"))
      b.i(paramReadableMap.getBoolean("stopOnTerminate")); 
    if (paramReadableMap.hasKey("forceAlarmManager"))
      b.a(paramReadableMap.getBoolean("forceAlarmManager")); 
    if (paramReadableMap.hasKey("startOnBoot"))
      b.h(paramReadableMap.getBoolean("startOnBoot")); 
    if (paramReadableMap.hasKey("enableHeadless") && paramReadableMap.getBoolean("enableHeadless"))
      b.a(JOB_SERVICE_CLASS); 
    if (paramReadableMap.hasKey("requiredNetworkType"))
      b.b(paramReadableMap.getInt("requiredNetworkType")); 
    if (paramReadableMap.hasKey("requiresBatteryNotLow"))
      b.d(paramReadableMap.getBoolean("requiresBatteryNotLow")); 
    if (paramReadableMap.hasKey("requiresCharging"))
      b.e(paramReadableMap.getBoolean("requiresCharging")); 
    if (paramReadableMap.hasKey("requiresDeviceIdle"))
      b.f(paramReadableMap.getBoolean("requiresDeviceIdle")); 
    if (paramReadableMap.hasKey("requiresStorageNotLow"))
      b.g(paramReadableMap.getBoolean("requiresStorageNotLow")); 
    if (paramReadableMap.hasKey("periodic"))
      b.c(paramReadableMap.getBoolean("periodic")); 
    return b;
  }
  
  private b getAdapter() {
    return b.a((Context)getReactApplicationContext());
  }
  
  private void initializeBackgroundFetch() {
    if (getCurrentActivity() == null)
      return; 
    this.initialized = true;
  }
  
  @ReactMethod
  public void configure(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    b b1 = getAdapter();
    a a = new a(this);
    c.b b = buildConfig(paramReadableMap);
    b.b("react-native-background-fetch");
    b.b(true);
    b1.a(b.a(), a);
    paramCallback1.invoke(new Object[] { Integer.valueOf(2) });
  }
  
  @ReactMethod
  public void finish(String paramString) {
    getAdapter().a(paramString);
  }
  
  public String getName() {
    return "RNBackgroundFetch";
  }
  
  public void onActivityResult(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void onHostDestroy() {
    this.initialized = false;
  }
  
  public void onHostPause() {}
  
  public void onHostResume() {
    if (!this.initialized)
      initializeBackgroundFetch(); 
  }
  
  public void onNewIntent(Intent paramIntent) {}
  
  @ReactMethod
  public void scheduleTask(ReadableMap paramReadableMap, Callback paramCallback1, Callback paramCallback2) {
    getAdapter().a(buildConfig(paramReadableMap).a());
    paramCallback1.invoke(new Object[] { Boolean.valueOf(true) });
  }
  
  @ReactMethod
  public void start(Callback paramCallback1, Callback paramCallback2) {
    b b = getAdapter();
    b.c("react-native-background-fetch");
    paramCallback1.invoke(new Object[] { Integer.valueOf(b.d()) });
  }
  
  @ReactMethod
  public void status(Callback paramCallback) {
    paramCallback.invoke(new Object[] { Integer.valueOf(getAdapter().d()) });
  }
  
  @ReactMethod
  public void stop(String paramString, Callback paramCallback1, Callback paramCallback2) {
    String str = paramString;
    if (paramString == null)
      str = "react-native-background-fetch"; 
    getAdapter().d(str);
    paramCallback1.invoke(new Object[] { Boolean.valueOf(true) });
  }
  
  class a implements b.c {
    a(RNBackgroundFetchModule this$0) {}
    
    public void a(String param1String) {
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      writableNativeMap.putString("taskId", param1String);
      writableNativeMap.putBoolean("timeout", false);
      ((RCTNativeAppEventEmitter)this.a.getReactApplicationContext().getJSModule(RCTNativeAppEventEmitter.class)).emit("fetch", writableNativeMap);
    }
    
    public void b(String param1String) {
      WritableNativeMap writableNativeMap = new WritableNativeMap();
      writableNativeMap.putString("taskId", param1String);
      writableNativeMap.putBoolean("timeout", true);
      ((RCTNativeAppEventEmitter)this.a.getReactApplicationContext().getJSModule(RCTNativeAppEventEmitter.class)).emit("fetch", writableNativeMap);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/rnbackgroundfetch/RNBackgroundFetchModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */