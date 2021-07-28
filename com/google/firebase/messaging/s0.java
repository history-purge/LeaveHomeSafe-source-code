package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class s0 implements Runnable {
  private final long c;
  
  private final PowerManager.WakeLock d;
  
  private final FirebaseMessaging e;
  
  @SuppressLint({"InvalidWakeLockTag"})
  public s0(FirebaseMessaging paramFirebaseMessaging, long paramLong) {
    new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue<Runnable>(), (ThreadFactory)new com.google.android.gms.common.util.p.a("firebase-iid-executor"));
    this.e = paramFirebaseMessaging;
    this.c = paramLong;
    this.d = ((PowerManager)a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    this.d.setReferenceCounted(false);
  }
  
  static boolean d() {
    boolean bool1 = Log.isLoggable("FirebaseMessaging", 3);
    boolean bool = true;
    if (!bool1) {
      if (Build.VERSION.SDK_INT == 23)
        return Log.isLoggable("FirebaseMessaging", 3); 
      bool = false;
    } 
    return bool;
  }
  
  Context a() {
    return this.e.b();
  }
  
  boolean b() {
    ConnectivityManager connectivityManager = (ConnectivityManager)a().getSystemService("connectivity");
    if (connectivityManager != null) {
      NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
    } else {
      connectivityManager = null;
    } 
    return (connectivityManager != null && connectivityManager.isConnected());
  }
  
  boolean c() {
    String str;
    try {
      if (this.e.a() == null) {
        Log.e("FirebaseMessaging", "Token retrieval failed: null");
        return false;
      } 
      if (Log.isLoggable("FirebaseMessaging", 3))
        Log.d("FirebaseMessaging", "Token successfully retrieved"); 
      return true;
    } catch (IOException iOException) {
      if (c0.b(iOException.getMessage())) {
        str = iOException.getMessage();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 52);
        stringBuilder.append("Token retrieval failed: ");
        stringBuilder.append(str);
        stringBuilder.append(". Will retry token retrieval");
        str = stringBuilder.toString();
        Log.w("FirebaseMessaging", str);
        return false;
      } 
      if (str.getMessage() == null) {
        str = "Token retrieval failed without exception message. Will retry token retrieval";
        Log.w("FirebaseMessaging", str);
        return false;
      } 
      throw str;
    } catch (SecurityException securityException) {
      str = "Token retrieval failed with SecurityException. Will retry token retrieval";
    } 
    Log.w("FirebaseMessaging", str);
    return false;
  }
  
  @SuppressLint({"WakelockTimeout"})
  public void run() {
    if (o0.b().b(a()))
      this.d.acquire(); 
    try {
      this.e.b(true);
      if (!this.e.e()) {
        this.e.b(false);
        if (o0.b().b(a())) {
          this.d.release();
          return;
        } 
        return;
      } 
      if (o0.b().a(a()) && !b()) {
        (new a(this)).a();
        if (!o0.b().b(a()))
          return; 
      } else {
        if (c()) {
          this.e.b(false);
        } else {
          this.e.a(this.c);
        } 
        if (o0.b().b(a())) {
          this.d.release();
          return;
        } 
        return;
      } 
      this.d.release();
      return;
    } catch (IOException iOException) {
      String str = iOException.getMessage();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 93);
      stringBuilder.append("Topic sync or token retrieval failed on hard failure exceptions: ");
      stringBuilder.append(str);
      stringBuilder.append(". Won't retry the operation.");
      Log.e("FirebaseMessaging", stringBuilder.toString());
      this.e.b(false);
      if (o0.b().b(a())) {
        this.d.release();
        return;
      } 
    } finally {
      Exception exception;
    } 
  }
  
  static class a extends BroadcastReceiver {
    private s0 a;
    
    public a(s0 param1s0) {
      this.a = param1s0;
    }
    
    public void a() {
      if (s0.d())
        Log.d("FirebaseMessaging", "Connectivity change received registered"); 
      IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      this.a.a().registerReceiver(this, intentFilter);
    }
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      s0 s01 = this.a;
      if (s01 == null)
        return; 
      if (!s01.b())
        return; 
      if (s0.d())
        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync."); 
      s0.a(this.a).a(this.a, 0L);
      this.a.a().unregisterReceiver(this);
      this.a = null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */