package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

class x0 implements Runnable {
  private static final Object h = new Object();
  
  private static Boolean i;
  
  private static Boolean j;
  
  private final Context c;
  
  private final h0 d;
  
  private final PowerManager.WakeLock e;
  
  private final w0 f;
  
  private final long g;
  
  x0(w0 paramw0, Context paramContext, h0 paramh0, long paramLong) {
    this.f = paramw0;
    this.c = paramContext;
    this.g = paramLong;
    this.d = paramh0;
    this.e = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
  }
  
  private static String a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(paramString.length() + 142);
    stringBuilder.append("Missing Permission: ");
    stringBuilder.append(paramString);
    stringBuilder.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    return stringBuilder.toString();
  }
  
  private static boolean a(Context paramContext) {
    synchronized (h) {
      if (j == null) {
        bool = a(paramContext, "android.permission.ACCESS_NETWORK_STATE", j);
      } else {
        bool = j.booleanValue();
      } 
      j = Boolean.valueOf(bool);
      boolean bool = j.booleanValue();
      return bool;
    } 
  }
  
  private static boolean a(Context paramContext, String paramString, Boolean paramBoolean) {
    boolean bool;
    if (paramBoolean != null)
      return paramBoolean.booleanValue(); 
    if (paramContext.checkCallingOrSelfPermission(paramString) == 0) {
      bool = true;
    } else {
      bool = false;
    } 
    if (!bool && Log.isLoggable("FirebaseMessaging", 3)) {
      Log.d("FirebaseMessaging", a(paramString));
      return false;
    } 
    return bool;
  }
  
  private boolean b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Landroid/content/Context;
    //   6: ldc 'connectivity'
    //   8: invokevirtual getSystemService : (Ljava/lang/String;)Ljava/lang/Object;
    //   11: checkcast android/net/ConnectivityManager
    //   14: astore_2
    //   15: aload_2
    //   16: ifnull -> 62
    //   19: aload_2
    //   20: invokevirtual getActiveNetworkInfo : ()Landroid/net/NetworkInfo;
    //   23: astore_2
    //   24: goto -> 27
    //   27: aload_2
    //   28: ifnull -> 46
    //   31: aload_2
    //   32: invokevirtual isConnected : ()Z
    //   35: istore_1
    //   36: iload_1
    //   37: ifeq -> 46
    //   40: iconst_1
    //   41: istore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: iload_1
    //   45: ireturn
    //   46: iconst_0
    //   47: istore_1
    //   48: goto -> 42
    //   51: astore_2
    //   52: aload_0
    //   53: monitorexit
    //   54: goto -> 59
    //   57: aload_2
    //   58: athrow
    //   59: goto -> 57
    //   62: aconst_null
    //   63: astore_2
    //   64: goto -> 27
    // Exception table:
    //   from	to	target	type
    //   2	15	51	finally
    //   19	24	51	finally
    //   31	36	51	finally
  }
  
  private static boolean b(Context paramContext) {
    synchronized (h) {
      if (i == null) {
        bool = a(paramContext, "android.permission.WAKE_LOCK", i);
      } else {
        bool = i.booleanValue();
      } 
      i = Boolean.valueOf(bool);
      boolean bool = i.booleanValue();
      return bool;
    } 
  }
  
  private static boolean c() {
    boolean bool1 = Log.isLoggable("FirebaseMessaging", 3);
    boolean bool = true;
    if (!bool1) {
      if (Build.VERSION.SDK_INT == 23)
        return Log.isLoggable("FirebaseMessaging", 3); 
      bool = false;
    } 
    return bool;
  }
  
  @SuppressLint({"Wakelock"})
  public void run() {
    if (b(this.c))
      this.e.acquire(b.a); 
    try {
      this.f.a(true);
      if (!this.d.e()) {
        this.f.a(false);
        if (b(this.c))
          try {
            this.e.release();
            return;
          } catch (RuntimeException runtimeException) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
          }  
        return;
      } 
      if (a(this.c) && !b()) {
        (new a(this, this)).a();
        if (b(this.c))
          try {
            this.e.release();
            return;
          } catch (RuntimeException runtimeException) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
          }  
        return;
      } 
      if (this.f.d()) {
        this.f.a(false);
      } else {
        this.f.a(this.g);
      } 
      if (b(this.c))
        try {
          this.e.release();
          return;
        } catch (RuntimeException runtimeException) {
          Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
          return;
        }  
    } catch (IOException iOException) {
      String str = String.valueOf(iOException.getMessage());
      if (str.length() != 0) {
        str = "Failed to sync topics. Won't retry sync. ".concat(str);
      } else {
        str = new String("Failed to sync topics. Won't retry sync. ");
      } 
      Log.e("FirebaseMessaging", str);
      this.f.a(false);
      if (b(this.c))
        try {
          this.e.release();
          return;
        } catch (RuntimeException runtimeException) {
          Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }  
    } finally {
      Exception exception;
    } 
  }
  
  class a extends BroadcastReceiver {
    private x0 a;
    
    public a(x0 this$0, x0 param1x01) {
      this.a = param1x01;
    }
    
    public void a() {
      if (x0.a())
        Log.d("FirebaseMessaging", "Connectivity change received registered"); 
      x0.c(this.b).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }
    
    public void onReceive(Context param1Context, Intent param1Intent) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield a : Lcom/google/firebase/messaging/x0;
      //   6: astore_2
      //   7: aload_2
      //   8: ifnonnull -> 14
      //   11: aload_0
      //   12: monitorexit
      //   13: return
      //   14: aload_2
      //   15: invokestatic a : (Lcom/google/firebase/messaging/x0;)Z
      //   18: istore_3
      //   19: iload_3
      //   20: ifne -> 26
      //   23: aload_0
      //   24: monitorexit
      //   25: return
      //   26: invokestatic a : ()Z
      //   29: ifeq -> 40
      //   32: ldc 'FirebaseMessaging'
      //   34: ldc 'Connectivity changed. Starting background sync.'
      //   36: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
      //   39: pop
      //   40: aload_0
      //   41: getfield a : Lcom/google/firebase/messaging/x0;
      //   44: invokestatic b : (Lcom/google/firebase/messaging/x0;)Lcom/google/firebase/messaging/w0;
      //   47: aload_0
      //   48: getfield a : Lcom/google/firebase/messaging/x0;
      //   51: lconst_0
      //   52: invokevirtual a : (Ljava/lang/Runnable;J)V
      //   55: aload_1
      //   56: aload_0
      //   57: invokevirtual unregisterReceiver : (Landroid/content/BroadcastReceiver;)V
      //   60: aload_0
      //   61: aconst_null
      //   62: putfield a : Lcom/google/firebase/messaging/x0;
      //   65: aload_0
      //   66: monitorexit
      //   67: return
      //   68: astore_1
      //   69: aload_0
      //   70: monitorexit
      //   71: aload_1
      //   72: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	68	finally
      //   14	19	68	finally
      //   26	40	68	finally
      //   40	65	68	finally
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/x0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */