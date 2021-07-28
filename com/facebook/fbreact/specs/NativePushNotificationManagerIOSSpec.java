package com.facebook.fbreact.specs;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReactModuleWithSpec;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.turbomodule.core.interfaces.a;

public abstract class NativePushNotificationManagerIOSSpec extends ReactContextBaseJavaModule implements ReactModuleWithSpec, a {
  public NativePushNotificationManagerIOSSpec(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
  }
  
  @ReactMethod
  public abstract void abandonPermissions();
  
  @ReactMethod
  public abstract void addListener(String paramString);
  
  @ReactMethod
  public abstract void cancelAllLocalNotifications();
  
  @ReactMethod
  public abstract void cancelLocalNotifications(ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void checkPermissions(Callback paramCallback);
  
  @ReactMethod
  public abstract void getApplicationIconBadgeNumber(Callback paramCallback);
  
  @ReactMethod
  public abstract void getDeliveredNotifications(Callback paramCallback);
  
  @ReactMethod
  public abstract void getInitialNotification(Promise paramPromise);
  
  @ReactMethod
  public abstract void getScheduledLocalNotifications(Callback paramCallback);
  
  @ReactMethod
  public abstract void onFinishRemoteNotification(String paramString1, String paramString2);
  
  @ReactMethod
  public abstract void presentLocalNotification(ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void removeAllDeliveredNotifications();
  
  @ReactMethod
  public abstract void removeDeliveredNotifications(ReadableArray paramReadableArray);
  
  @ReactMethod
  public abstract void removeListeners(double paramDouble);
  
  @ReactMethod
  public abstract void requestPermissions(ReadableMap paramReadableMap, Promise paramPromise);
  
  @ReactMethod
  public abstract void scheduleLocalNotification(ReadableMap paramReadableMap);
  
  @ReactMethod
  public abstract void setApplicationIconBadgeNumber(double paramDouble);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/fbreact/specs/NativePushNotificationManagerIOSSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */