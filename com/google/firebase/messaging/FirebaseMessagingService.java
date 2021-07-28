package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends g {
  private static final Queue<String> h = new ArrayDeque<String>(10);
  
  private boolean c(String paramString) {
    if (TextUtils.isEmpty(paramString))
      return false; 
    if (h.contains(paramString)) {
      if (Log.isLoggable("FirebaseMessaging", 3)) {
        paramString = String.valueOf(paramString);
        if (paramString.length() != 0) {
          paramString = "Received duplicate message: ".concat(paramString);
        } else {
          paramString = new String("Received duplicate message: ");
        } 
        Log.d("FirebaseMessaging", paramString);
      } 
      return true;
    } 
    if (h.size() >= 10)
      h.remove(); 
    h.add(paramString);
    return false;
  }
  
  private void d(Intent paramIntent) {
    Bundle bundle2 = paramIntent.getExtras();
    Bundle bundle1 = bundle2;
    if (bundle2 == null)
      bundle1 = new Bundle(); 
    bundle1.remove("androidx.content.wakelockid");
    if (i0.a(bundle1)) {
      i0 i0 = new i0(bundle1);
      ExecutorService executorService = p.c();
      c c = new c((Context)this, i0, executorService);
      try {
        boolean bool = c.a();
        executorService.shutdown();
        if (bool)
          return; 
      } finally {
        executorService.shutdown();
      } 
    } 
    a(new j0(bundle1));
  }
  
  private String e(Intent paramIntent) {
    String str = paramIntent.getStringExtra("google.message_id");
    return (str == null) ? paramIntent.getStringExtra("message_id") : str;
  }
  
  private void f(Intent paramIntent) {
    if (!c(paramIntent.getStringExtra("google.message_id")))
      g(paramIntent); 
  }
  
  private void g(Intent paramIntent) {
    String str1;
    byte b;
    String str3 = paramIntent.getStringExtra("message_type");
    String str2 = str3;
    if (str3 == null)
      str2 = "gcm"; 
    switch (str2.hashCode()) {
      default:
        b = -1;
        break;
      case 814800675:
        if (str2.equals("send_event")) {
          b = 2;
          break;
        } 
      case 814694033:
        if (str2.equals("send_error")) {
          b = 3;
          break;
        } 
      case 102161:
        if (str2.equals("gcm")) {
          b = 0;
          break;
        } 
      case -2062414158:
        if (str2.equals("deleted_messages")) {
          b = 1;
          break;
        } 
    } 
    if (b != 0) {
      if (b != 1) {
        if (b != 2) {
          if (b != 3) {
            if (str2.length() != 0) {
              str1 = "Received message with unknown type: ".concat(str2);
            } else {
              str1 = new String("Received message with unknown type: ");
            } 
            Log.w("FirebaseMessaging", str1);
            return;
          } 
          a(e((Intent)str1), new n0(str1.getStringExtra("error")));
          return;
        } 
        a(str1.getStringExtra("google.message_id"));
        return;
      } 
      a();
      return;
    } 
    g0.d((Intent)str1);
    d((Intent)str1);
  }
  
  protected Intent a(Intent paramIntent) {
    return o0.b().a();
  }
  
  public void a() {}
  
  public void a(j0 paramj0) {}
  
  public void a(String paramString) {}
  
  public void a(String paramString, Exception paramException) {}
  
  public void b(Intent paramIntent) {
    String str2 = paramIntent.getAction();
    if ("com.google.android.c2dm.intent.RECEIVE".equals(str2) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(str2)) {
      f(paramIntent);
      return;
    } 
    if ("com.google.firebase.messaging.NEW_TOKEN".equals(str2)) {
      b(paramIntent.getStringExtra("token"));
      return;
    } 
    String str1 = String.valueOf(paramIntent.getAction());
    if (str1.length() != 0) {
      str1 = "Unknown intent action: ".concat(str1);
    } else {
      str1 = new String("Unknown intent action: ");
    } 
    Log.d("FirebaseMessaging", str1);
  }
  
  public void b(String paramString) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/FirebaseMessagingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */