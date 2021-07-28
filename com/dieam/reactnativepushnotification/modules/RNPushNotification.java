package com.dieam.reactnativepushnotification.modules;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.l;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.l;
import com.google.firebase.messaging.FirebaseMessaging;
import e.f.a.e.m.f;
import e.f.a.e.m.l;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

public class RNPushNotification extends ReactContextBaseJavaModule implements ActivityEventListener {
  public static final String LOG_TAG = "RNPushNotification";
  
  private d mJsDelivery;
  
  private c mRNPushNotificationHelper;
  
  private final SecureRandom mRandomNumberGenerator = new SecureRandom();
  
  public RNPushNotification(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext);
    paramReactApplicationContext.addActivityEventListener(this);
    this.mRNPushNotificationHelper = new c((Application)paramReactApplicationContext.getApplicationContext());
    this.mJsDelivery = new d((ReactContext)paramReactApplicationContext);
    this.mRNPushNotificationHelper.b();
  }
  
  private Bundle getBundleFromIntent(Intent paramIntent) {
    Bundle bundle;
    if (paramIntent.hasExtra("notification")) {
      bundle = paramIntent.getBundleExtra("notification");
    } else if (bundle.hasExtra("google.message_id")) {
      bundle = bundle.getExtras();
    } else {
      bundle = null;
    } 
    if (bundle != null && !bundle.getBoolean("foreground", false) && !bundle.containsKey("userInteraction"))
      bundle.putBoolean("userInteraction", true); 
    return bundle;
  }
  
  @ReactMethod
  public void abandonPermissions() {
    (new Thread(new b(this))).start();
  }
  
  @ReactMethod
  public void cancelAllLocalNotifications() {
    this.mRNPushNotificationHelper.a();
    this.mRNPushNotificationHelper.c();
  }
  
  @ReactMethod
  public void cancelLocalNotifications(ReadableMap paramReadableMap) {
    this.mRNPushNotificationHelper.a(paramReadableMap);
  }
  
  @ReactMethod
  public void channelBlocked(String paramString, Callback paramCallback) {
    boolean bool = this.mRNPushNotificationHelper.a(paramString);
    if (paramCallback != null)
      paramCallback.invoke(new Object[] { Boolean.valueOf(bool) }); 
  }
  
  @ReactMethod
  public void channelExists(String paramString, Callback paramCallback) {
    boolean bool = this.mRNPushNotificationHelper.b(paramString);
    if (paramCallback != null)
      paramCallback.invoke(new Object[] { Boolean.valueOf(bool) }); 
  }
  
  @ReactMethod
  public void checkPermissions(Promise paramPromise) {
    paramPromise.resolve(Boolean.valueOf(l.a((Context)getReactApplicationContext()).a()));
  }
  
  @ReactMethod
  public void clearLocalNotification(String paramString, int paramInt) {
    this.mRNPushNotificationHelper.a(paramString, paramInt);
  }
  
  @ReactMethod
  public void createChannel(ReadableMap paramReadableMap, Callback paramCallback) {
    boolean bool = this.mRNPushNotificationHelper.b(paramReadableMap);
    if (paramCallback != null)
      paramCallback.invoke(new Object[] { Boolean.valueOf(bool) }); 
  }
  
  @ReactMethod
  public void deleteChannel(String paramString) {
    this.mRNPushNotificationHelper.c(paramString);
  }
  
  @ReactMethod
  public void getChannels(Callback paramCallback) {
    WritableArray writableArray = Arguments.fromList(this.mRNPushNotificationHelper.h());
    if (paramCallback != null)
      paramCallback.invoke(new Object[] { writableArray }); 
  }
  
  public Map<String, Object> getConstants() {
    return new HashMap<String, Object>();
  }
  
  @ReactMethod
  public void getDeliveredNotifications(Callback paramCallback) {
    paramCallback.invoke(new Object[] { this.mRNPushNotificationHelper.d() });
  }
  
  @ReactMethod
  public void getInitialNotification(Promise paramPromise) {
    WritableMap writableMap = Arguments.createMap();
    Activity activity = getCurrentActivity();
    if (activity != null) {
      Bundle bundle = getBundleFromIntent(activity.getIntent());
      if (bundle != null) {
        bundle.putBoolean("foreground", false);
        writableMap.putString("dataJSON", this.mJsDelivery.a(bundle));
      } 
    } 
    paramPromise.resolve(writableMap);
  }
  
  public String getName() {
    return "RNPushNotification";
  }
  
  @ReactMethod
  public void getScheduledLocalNotifications(Callback paramCallback) {
    paramCallback.invoke(new Object[] { this.mRNPushNotificationHelper.f() });
  }
  
  @ReactMethod
  public void invokeApp(ReadableMap paramReadableMap) {
    if (paramReadableMap != null) {
      Bundle bundle = Arguments.toBundle(paramReadableMap);
    } else {
      paramReadableMap = null;
    } 
    this.mRNPushNotificationHelper.a((Bundle)paramReadableMap);
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void onActivityResult(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent) {
    onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onNewIntent(Intent paramIntent) {
    Bundle bundle = getBundleFromIntent(paramIntent);
    if (bundle != null)
      this.mJsDelivery.b(bundle); 
  }
  
  @ReactMethod
  public void presentLocalNotification(ReadableMap paramReadableMap) {
    Bundle bundle = Arguments.toBundle(paramReadableMap);
    if (bundle.getString("id") == null)
      bundle.putString("id", String.valueOf(this.mRandomNumberGenerator.nextInt())); 
    this.mRNPushNotificationHelper.d(bundle);
  }
  
  @ReactMethod
  public void removeAllDeliveredNotifications() {
    this.mRNPushNotificationHelper.c();
  }
  
  @ReactMethod
  public void removeDeliveredNotifications(ReadableArray paramReadableArray) {
    this.mRNPushNotificationHelper.a(paramReadableArray);
  }
  
  @ReactMethod
  public void requestPermissions() {
    d d1 = this.mJsDelivery;
    FirebaseInstanceId.k().e().a(new a(this, d1));
  }
  
  @ReactMethod
  public void scheduleLocalNotification(ReadableMap paramReadableMap) {
    Bundle bundle = Arguments.toBundle(paramReadableMap);
    if (bundle.getString("id") == null)
      bundle.putString("id", String.valueOf(this.mRandomNumberGenerator.nextInt())); 
    this.mRNPushNotificationHelper.b(bundle);
  }
  
  @ReactMethod
  public void setApplicationIconBadgeNumber(int paramInt) {
    e.c.a.b.a.c.a((Context)getReactApplicationContext(), paramInt);
  }
  
  @ReactMethod
  public void subscribeToTopic(String paramString) {
    FirebaseMessaging.g().b(paramString);
  }
  
  @ReactMethod
  public void unsubscribeFromTopic(String paramString) {
    FirebaseMessaging.g().c(paramString);
  }
  
  class a implements f<l> {
    a(RNPushNotification this$0, d param1d) {}
    
    public void a(l<l> param1l) {
      if (!param1l.e()) {
        Log.e("RNPushNotification", "exception", param1l.a());
        return;
      } 
      WritableMap writableMap = Arguments.createMap();
      writableMap.putString("deviceToken", ((l)param1l.b()).a());
      this.a.a("remoteNotificationsRegistered", writableMap);
    }
  }
  
  class b implements Runnable {
    b(RNPushNotification this$0) {}
    
    public void run() {
      try {
        FirebaseInstanceId.k().b();
        Log.i("RNPushNotification", "InstanceID deleted");
        return;
      } catch (IOException iOException) {
        Log.e("RNPushNotification", "exception", iOException);
        return;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/RNPushNotification.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */