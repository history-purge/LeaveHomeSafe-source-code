package com.facebook.react.modules.core;

import android.net.Uri;
import com.facebook.fbreact.specs.NativeDeviceEventManagerSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import e.e.o.d0.a.a;

@a(name = "DeviceEventManager")
public class DeviceEventManagerModule extends NativeDeviceEventManagerSpec {
  public static final String NAME = "DeviceEventManager";
  
  private final Runnable mInvokeDefaultBackPressRunnable;
  
  public DeviceEventManagerModule(ReactApplicationContext paramReactApplicationContext, b paramb) {
    super(paramReactApplicationContext);
    this.mInvokeDefaultBackPressRunnable = new a(this, paramb);
  }
  
  public void emitHardwareBackPressed() {
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    if (reactApplicationContext != null)
      ((RCTDeviceEventEmitter)reactApplicationContext.getJSModule(RCTDeviceEventEmitter.class)).emit("hardwareBackPress", null); 
  }
  
  public void emitNewIntentReceived(Uri paramUri) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContextIfActiveOrWarn();
    if (reactApplicationContext != null) {
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("url", paramUri.toString());
      ((RCTDeviceEventEmitter)reactApplicationContext.getJSModule(RCTDeviceEventEmitter.class)).emit("url", writableMap);
    } 
  }
  
  public String getName() {
    return "DeviceEventManager";
  }
  
  public void invokeDefaultBackPressHandler() {
    getReactApplicationContext().runOnUiQueueThread(this.mInvokeDefaultBackPressRunnable);
  }
  
  @e.e.n.a.a
  public static interface RCTDeviceEventEmitter extends JavaScriptModule {
    void emit(String param1String, Object param1Object);
  }
  
  class a implements Runnable {
    a(DeviceEventManagerModule this$0, b param1b) {}
    
    public void run() {
      UiThreadUtil.assertOnUiThread();
      this.c.e();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/DeviceEventManagerModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */