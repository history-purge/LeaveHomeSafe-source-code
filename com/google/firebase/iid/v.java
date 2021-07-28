package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class v implements Runnable {
  private final long c;
  
  private final PowerManager.WakeLock d;
  
  private final FirebaseInstanceId e;
  
  v(FirebaseInstanceId paramFirebaseInstanceId, long paramLong) {
    b.b();
    this.e = paramFirebaseInstanceId;
    this.c = paramLong;
    this.d = ((PowerManager)a().getSystemService("power")).newWakeLock(1, "fiid-sync");
    this.d.setReferenceCounted(false);
  }
  
  Context a() {
    return this.e.c().b();
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
    u.a a = this.e.g();
    if (!this.e.a(a))
      return true; 
    try {
      if (this.e.a() == null) {
        Log.e("FirebaseInstanceId", "Token retrieval failed: null");
        return false;
      } 
      if (Log.isLoggable("FirebaseInstanceId", 3))
        Log.d("FirebaseInstanceId", "Token successfully retrieved"); 
      return true;
    } catch (IOException iOException) {
      if (k.a(iOException.getMessage())) {
        str = iOException.getMessage();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 52);
        stringBuilder.append("Token retrieval failed: ");
        stringBuilder.append(str);
        stringBuilder.append(". Will retry token retrieval");
        str = stringBuilder.toString();
        Log.w("FirebaseInstanceId", str);
        return false;
      } 
      if (str.getMessage() == null) {
        str = "Token retrieval failed without exception message. Will retry token retrieval";
        Log.w("FirebaseInstanceId", str);
        return false;
      } 
      throw str;
    } catch (SecurityException securityException) {
      str = "Token retrieval failed with SecurityException. Will retry token retrieval";
    } 
    Log.w("FirebaseInstanceId", str);
    return false;
  }
  
  @SuppressLint({"Wakelock"})
  public void run() {
    if (t.a().b(a()))
      this.d.acquire(); 
    try {
      this.e.a(true);
      if (!this.e.h()) {
        this.e.a(false);
        if (t.a().b(a())) {
          this.d.release();
          return;
        } 
        return;
      } 
      if (t.a().a(a()) && !b()) {
        (new a(this)).a();
        if (!t.a().b(a()))
          return; 
      } else {
        if (c()) {
          this.e.a(false);
        } else {
          this.e.a(this.c);
        } 
        if (t.a().b(a())) {
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
      Log.e("FirebaseInstanceId", stringBuilder.toString());
      this.e.a(false);
      if (t.a().b(a())) {
        this.d.release();
        return;
      } 
    } finally {
      Exception exception;
    } 
  }
  
  static class a extends BroadcastReceiver {
    private v a;
    
    public a(v param1v) {
      this.a = param1v;
    }
    
    public void a() {
      if (FirebaseInstanceId.m())
        Log.d("FirebaseInstanceId", "Connectivity change received registered"); 
      IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
      this.a.a().registerReceiver(this, intentFilter);
    }
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      v v1 = this.a;
      if (v1 == null)
        return; 
      if (!v1.b())
        return; 
      if (FirebaseInstanceId.m())
        Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync."); 
      v.a(this.a).a(this.a, 0L);
      this.a.a().unregisterReceiver(this);
      this.a = null;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */