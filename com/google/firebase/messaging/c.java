package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.i;
import com.google.android.gms.common.util.k;
import e.f.a.e.m.o;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class c {
  private final Executor a;
  
  private final Context b;
  
  private final i0 c;
  
  public c(Context paramContext, i0 parami0, Executor paramExecutor) {
    this.a = paramExecutor;
    this.b = paramContext;
    this.c = parami0;
  }
  
  private void a(i.e parame, e0 parame0) {
    StringBuilder stringBuilder;
    if (parame0 == null)
      return; 
    try {
      Bitmap bitmap = (Bitmap)o.a(parame0.b(), 5L, TimeUnit.SECONDS);
      parame.a(bitmap);
      i.b b = new i.b();
      b.b(bitmap);
      b.a(null);
      parame.a((i.f)b);
      return;
    } catch (ExecutionException executionException) {
      String str = String.valueOf(executionException.getCause());
      stringBuilder = new StringBuilder(String.valueOf(str).length() + 26);
      stringBuilder.append("Failed to download image: ");
      stringBuilder.append(str);
      Log.w("FirebaseMessaging", stringBuilder.toString());
      return;
    } catch (InterruptedException interruptedException) {
      Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
      stringBuilder.close();
      Thread.currentThread().interrupt();
      return;
    } catch (TimeoutException timeoutException) {
      Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
      stringBuilder.close();
      return;
    } 
  }
  
  private void a(a.a parama) {
    if (Log.isLoggable("FirebaseMessaging", 3))
      Log.d("FirebaseMessaging", "Showing notification"); 
    ((NotificationManager)this.b.getSystemService("notification")).notify(parama.b, parama.c, parama.a.a());
  }
  
  private boolean b() {
    if (((KeyguardManager)this.b.getSystemService("keyguard")).inKeyguardRestrictedInputMode())
      return false; 
    if (!k.f())
      SystemClock.sleep(10L); 
    int i = Process.myPid();
    List list = ((ActivityManager)this.b.getSystemService("activity")).getRunningAppProcesses();
    if (list != null)
      for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
        if (runningAppProcessInfo.pid == i) {
          if (runningAppProcessInfo.importance == 100)
            return true; 
          break;
        } 
      }  
    return false;
  }
  
  private e0 c() {
    e0 e0 = e0.b(this.c.g("gcm.n.image"));
    if (e0 != null)
      e0.a(this.a); 
    return e0;
  }
  
  boolean a() {
    if (this.c.a("gcm.n.noui"))
      return true; 
    if (b())
      return false; 
    e0 e0 = c();
    a.a a = a.b(this.b, this.c);
    a(a.a, e0);
    a(a);
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */