package com.facebook.react.modules.deviceinfo;

import android.content.Context;
import com.facebook.fbreact.specs.NativeDeviceInfoSpec;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.c;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Map;

@a(name = "DeviceInfo")
public class DeviceInfoModule extends NativeDeviceInfoSpec implements LifecycleEventListener {
  public static final String NAME = "DeviceInfo";
  
  private float mFontScale;
  
  private ReadableMap mPreviousDisplayMetrics;
  
  private ReactApplicationContext mReactApplicationContext;
  
  public DeviceInfoModule(Context paramContext) {
    super(null);
    this.mReactApplicationContext = null;
    c.b(paramContext);
    this.mFontScale = (paramContext.getResources().getConfiguration()).fontScale;
  }
  
  public DeviceInfoModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    c.b((Context)paramReactApplicationContext);
    this.mFontScale = (paramReactApplicationContext.getResources().getConfiguration()).fontScale;
    this.mReactApplicationContext = paramReactApplicationContext;
    this.mReactApplicationContext.addLifecycleEventListener(this);
  }
  
  public void emitUpdateDimensionsEvent() {
    ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
    if (reactApplicationContext == null)
      return; 
    if (reactApplicationContext.hasActiveCatalystInstance()) {
      WritableNativeMap writableNativeMap = c.b(this.mFontScale);
      ReadableMap readableMap = this.mPreviousDisplayMetrics;
      if (readableMap == null) {
        this.mPreviousDisplayMetrics = (ReadableMap)writableNativeMap.copy();
        return;
      } 
      if (!writableNativeMap.equals(readableMap)) {
        this.mPreviousDisplayMetrics = (ReadableMap)writableNativeMap.copy();
        ((DeviceEventManagerModule.RCTDeviceEventEmitter)this.mReactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("didUpdateDimensions", writableNativeMap);
        return;
      } 
    } else {
      ReactSoftException.logSoftException("DeviceInfo", (Throwable)new ReactNoCrashSoftException("No active CatalystInstance, cannot emitUpdateDimensionsEvent"));
    } 
  }
  
  public String getName() {
    return "DeviceInfo";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("Dimensions", c.a(this.mFontScale));
    return (Map)hashMap;
  }
  
  public void invalidate() {}
  
  public void onHostDestroy() {}
  
  public void onHostPause() {}
  
  public void onHostResume() {
    ReactApplicationContext reactApplicationContext = this.mReactApplicationContext;
    if (reactApplicationContext == null)
      return; 
    float f = (reactApplicationContext.getResources().getConfiguration()).fontScale;
    if (this.mFontScale != f) {
      this.mFontScale = f;
      emitUpdateDimensionsEvent();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/deviceinfo/DeviceInfoModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */