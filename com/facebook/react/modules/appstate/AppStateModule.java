package com.facebook.react.modules.appstate;

import com.facebook.fbreact.specs.NativeAppStateSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WindowFocusChangeListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.LifecycleState;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import e.e.o.d0.a.a;
import java.util.HashMap;
import java.util.Map;

@a(name = "AppState")
public class AppStateModule extends NativeAppStateSpec implements LifecycleEventListener, WindowFocusChangeListener {
  public static final String APP_STATE_ACTIVE = "active";
  
  public static final String APP_STATE_BACKGROUND = "background";
  
  private static final String INITIAL_STATE = "initialAppState";
  
  public static final String NAME = "AppState";
  
  public static final String TAG = "AppStateModule";
  
  private String mAppState;
  
  public AppStateModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    String str;
    paramReactApplicationContext.addLifecycleEventListener(this);
    paramReactApplicationContext.addWindowFocusChangeListener(this);
    if (paramReactApplicationContext.getLifecycleState() == LifecycleState.e) {
      str = "active";
    } else {
      str = "background";
    } 
    this.mAppState = str;
  }
  
  private WritableMap createAppStateEventMap() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("app_state", this.mAppState);
    return writableMap;
  }
  
  private void sendAppStateChangeEvent() {
    sendEvent("appStateDidChange", createAppStateEventMap());
  }
  
  private void sendEvent(String paramString, Object paramObject) {
    ReactApplicationContext reactApplicationContext = getReactApplicationContext();
    if (reactApplicationContext == null)
      return; 
    if (!reactApplicationContext.hasActiveCatalystInstance())
      return; 
    ((DeviceEventManagerModule.RCTDeviceEventEmitter)reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(paramString, paramObject);
  }
  
  public void addListener(String paramString) {}
  
  public void getCurrentAppState(Callback paramCallback1, Callback paramCallback2) {
    paramCallback1.invoke(new Object[] { createAppStateEventMap() });
  }
  
  public String getName() {
    return "AppState";
  }
  
  public Map<String, Object> getTypedExportedConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("initialAppState", this.mAppState);
    return (Map)hashMap;
  }
  
  public void onHostDestroy() {}
  
  public void onHostPause() {
    this.mAppState = "background";
    sendAppStateChangeEvent();
  }
  
  public void onHostResume() {
    this.mAppState = "active";
    sendAppStateChangeEvent();
  }
  
  public void onWindowFocusChange(boolean paramBoolean) {
    sendEvent("appStateFocusChange", Boolean.valueOf(paramBoolean));
  }
  
  public void removeListeners(double paramDouble) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/appstate/AppStateModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */