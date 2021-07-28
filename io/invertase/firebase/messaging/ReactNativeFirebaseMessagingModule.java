package io.invertase.firebase.messaging;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.core.app.l;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.j0;
import e.f.a.e.m.l;
import e.f.a.e.m.o;
import f.a.a.a.b;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import io.invertase.firebase.common.g;
import java.util.HashMap;
import java.util.Map;

public class ReactNativeFirebaseMessagingModule extends ReactNativeFirebaseModule implements ActivityEventListener {
  private static final String TAG = "Messaging";
  
  j0 initialNotification = null;
  
  private HashMap<String, Boolean> initialNotificationMap = new HashMap<String, Boolean>();
  
  ReactNativeFirebaseMessagingModule(ReactApplicationContext paramReactApplicationContext) {
    super(paramReactApplicationContext, "Messaging");
    paramReactApplicationContext.addActivityEventListener(this);
  }
  
  private j0 popRemoteMessageFromMessagingStore(String paramString) {
    p p = q.b().a();
    j0 j01 = p.b(paramString);
    p.a(paramString);
    return j01;
  }
  
  @ReactMethod
  public void deleteToken(String paramString1, String paramString2, Promise paramPromise) {
    o.a(getExecutor(), new i(paramString1, paramString2)).a(new d(paramPromise));
  }
  
  public Map<String, Object> getConstants() {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put("isAutoInitEnabled", Boolean.valueOf(FirebaseMessaging.g().d()));
    return (Map)hashMap;
  }
  
  @ReactMethod
  public void getInitialNotification(Promise paramPromise) {
    j0 j01 = this.initialNotification;
    if (j01 != null) {
      paramPromise.resolve(o.a(j01));
      this.initialNotification = null;
      return;
    } 
    Activity activity = getCurrentActivity();
    if (activity != null) {
      Intent intent = activity.getIntent();
      if (intent != null && intent.getExtras() != null) {
        String str2 = intent.getExtras().getString("google.message_id");
        String str1 = str2;
        if (str2 == null)
          str1 = intent.getExtras().getString("message_id"); 
        if (str1 != null && this.initialNotificationMap.get(str1) == null) {
          j0 j03 = ReactNativeFirebaseMessagingReceiver.a.get(str1);
          j0 j02 = j03;
          if (j03 == null)
            j02 = popRemoteMessageFromMessagingStore(str1); 
          if (j02 != null) {
            paramPromise.resolve(o.a(j02));
            this.initialNotificationMap.put(str1, Boolean.valueOf(true));
            return;
          } 
        } 
      } 
    } else {
      Log.w("Messaging", "Attempt to call getInitialNotification failed. The current activity is not ready, try calling the method later in the React lifecycle.");
    } 
    paramPromise.resolve(null);
  }
  
  @ReactMethod
  public void getToken(String paramString1, String paramString2, Promise paramPromise) {
    o.a(getExecutor(), new e(paramString1, paramString2)).a(new b(paramPromise));
  }
  
  @ReactMethod
  public void hasPermission(Promise paramPromise) {
    o.a(getExecutor(), new c(this)).a(new f(paramPromise));
  }
  
  public void onActivityResult(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent) {}
  
  public void onNewIntent(Intent paramIntent) {
    if (paramIntent != null && paramIntent.getExtras() != null) {
      String str2 = paramIntent.getExtras().getString("google.message_id");
      String str1 = str2;
      if (str2 == null)
        str1 = paramIntent.getExtras().getString("message_id"); 
      if (str1 != null) {
        j0 j02 = ReactNativeFirebaseMessagingReceiver.a.get(str1);
        j0 j01 = j02;
        if (j02 == null)
          j01 = popRemoteMessageFromMessagingStore(str1); 
        if (j01 != null) {
          this.initialNotification = j01;
          ReactNativeFirebaseMessagingReceiver.a.remove(str1);
          g.b().b((b)o.a(j01, Boolean.valueOf(true)));
        } 
      } 
    } 
  }
  
  @ReactMethod
  public void sendMessage(ReadableMap paramReadableMap, Promise paramPromise) {
    o.a(getExecutor(), new g(paramReadableMap)).a(new h(paramPromise));
  }
  
  @ReactMethod
  public void setAutoInitEnabled(Boolean paramBoolean, Promise paramPromise) {
    o.a(getExecutor(), new l(paramBoolean)).a(new k(paramPromise));
  }
  
  @ReactMethod
  public void subscribeToTopic(String paramString, Promise paramPromise) {
    FirebaseMessaging.g().b(paramString).a(new j(paramPromise));
  }
  
  @ReactMethod
  public void unsubscribeFromTopic(String paramString, Promise paramPromise) {
    FirebaseMessaging.g().c(paramString).a(new a(paramPromise));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/messaging/ReactNativeFirebaseMessagingModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */