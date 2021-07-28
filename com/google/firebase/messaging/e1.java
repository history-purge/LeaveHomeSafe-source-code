package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class e1 implements ServiceConnection {
  private final Context a;
  
  private final Intent b;
  
  private final ScheduledExecutorService c;
  
  private final Queue<a> d = new ArrayDeque<a>();
  
  private b1 e;
  
  private boolean f = false;
  
  e1(Context paramContext, String paramString) {
    this(paramContext, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, (ThreadFactory)new com.google.android.gms.common.util.p.a("Firebase-FirebaseInstanceIdServiceConnection")));
  }
  
  e1(Context paramContext, String paramString, ScheduledExecutorService paramScheduledExecutorService) {
    this.a = paramContext.getApplicationContext();
    this.b = (new Intent("com.google.firebase.MESSAGING_EVENT")).setPackage(this.a.getPackageName());
    this.c = paramScheduledExecutorService;
  }
  
  private void a() {
    while (!this.d.isEmpty())
      ((a)this.d.poll()).a(); 
  }
  
  private void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'FirebaseMessaging'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifne -> 14
    //   11: goto -> 22
    //   14: ldc 'FirebaseMessaging'
    //   16: ldc 'flush queue called'
    //   18: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   21: pop
    //   22: aload_0
    //   23: getfield d : Ljava/util/Queue;
    //   26: invokeinterface isEmpty : ()Z
    //   31: ifne -> 115
    //   34: ldc 'FirebaseMessaging'
    //   36: iconst_3
    //   37: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   40: ifeq -> 51
    //   43: ldc 'FirebaseMessaging'
    //   45: ldc 'found intent to be delivered'
    //   47: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   50: pop
    //   51: aload_0
    //   52: getfield e : Lcom/google/firebase/messaging/b1;
    //   55: astore_1
    //   56: aload_1
    //   57: ifnull -> 108
    //   60: aload_1
    //   61: invokevirtual isBinderAlive : ()Z
    //   64: ifeq -> 108
    //   67: ldc 'FirebaseMessaging'
    //   69: iconst_3
    //   70: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   73: ifeq -> 84
    //   76: ldc 'FirebaseMessaging'
    //   78: ldc 'binder is alive, sending the intent.'
    //   80: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   83: pop
    //   84: aload_0
    //   85: getfield d : Ljava/util/Queue;
    //   88: invokeinterface poll : ()Ljava/lang/Object;
    //   93: checkcast com/google/firebase/messaging/e1$a
    //   96: astore_1
    //   97: aload_0
    //   98: getfield e : Lcom/google/firebase/messaging/b1;
    //   101: aload_1
    //   102: invokevirtual a : (Lcom/google/firebase/messaging/e1$a;)V
    //   105: goto -> 22
    //   108: aload_0
    //   109: invokespecial c : ()V
    //   112: aload_0
    //   113: monitorexit
    //   114: return
    //   115: aload_0
    //   116: monitorexit
    //   117: return
    //   118: astore_1
    //   119: aload_0
    //   120: monitorexit
    //   121: goto -> 126
    //   124: aload_1
    //   125: athrow
    //   126: goto -> 124
    // Exception table:
    //   from	to	target	type
    //   2	11	118	finally
    //   14	22	118	finally
    //   22	51	118	finally
    //   51	56	118	finally
    //   60	84	118	finally
    //   84	105	118	finally
    //   108	112	118	finally
  }
  
  private void c() {
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      boolean bool = this.f;
      StringBuilder stringBuilder = new StringBuilder(39);
      stringBuilder.append("binder is dead. start connection? ");
      stringBuilder.append(bool ^ true);
      Log.d("FirebaseMessaging", stringBuilder.toString());
    } 
    if (this.f)
      return; 
    this.f = true;
    try {
      if (e.f.a.e.e.m.a.a().a(this.a, this.b, this, 65))
        return; 
      Log.e("FirebaseMessaging", "binding to the service failed");
    } catch (SecurityException securityException) {
      Log.e("FirebaseMessaging", "Exception while binding the service", securityException);
    } 
    this.f = false;
    a();
  }
  
  l<Void> a(Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'FirebaseMessaging'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifeq -> 19
    //   11: ldc 'FirebaseMessaging'
    //   13: ldc 'new intent queued in the bind-strategy delivery'
    //   15: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   18: pop
    //   19: new com/google/firebase/messaging/e1$a
    //   22: dup
    //   23: aload_1
    //   24: invokespecial <init> : (Landroid/content/Intent;)V
    //   27: astore_1
    //   28: aload_1
    //   29: aload_0
    //   30: getfield c : Ljava/util/concurrent/ScheduledExecutorService;
    //   33: invokevirtual a : (Ljava/util/concurrent/ScheduledExecutorService;)V
    //   36: aload_0
    //   37: getfield d : Ljava/util/Queue;
    //   40: aload_1
    //   41: invokeinterface add : (Ljava/lang/Object;)Z
    //   46: pop
    //   47: aload_0
    //   48: invokespecial b : ()V
    //   51: aload_1
    //   52: invokevirtual b : ()Le/f/a/e/m/l;
    //   55: astore_1
    //   56: aload_0
    //   57: monitorexit
    //   58: aload_1
    //   59: areturn
    //   60: astore_1
    //   61: aload_0
    //   62: monitorexit
    //   63: aload_1
    //   64: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	60	finally
    //   19	56	60	finally
  }
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'FirebaseMessaging'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifeq -> 57
    //   11: aload_1
    //   12: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   15: astore_1
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: aload_1
    //   21: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   24: invokevirtual length : ()I
    //   27: bipush #20
    //   29: iadd
    //   30: invokespecial <init> : (I)V
    //   33: astore_3
    //   34: aload_3
    //   35: ldc 'onServiceConnected: '
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload_3
    //   42: aload_1
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: ldc 'FirebaseMessaging'
    //   49: aload_3
    //   50: invokevirtual toString : ()Ljava/lang/String;
    //   53: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   56: pop
    //   57: aload_0
    //   58: iconst_0
    //   59: putfield f : Z
    //   62: aload_2
    //   63: instanceof com/google/firebase/messaging/b1
    //   66: ifne -> 122
    //   69: aload_2
    //   70: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   73: astore_1
    //   74: new java/lang/StringBuilder
    //   77: dup
    //   78: aload_1
    //   79: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   82: invokevirtual length : ()I
    //   85: bipush #28
    //   87: iadd
    //   88: invokespecial <init> : (I)V
    //   91: astore_2
    //   92: aload_2
    //   93: ldc 'Invalid service connection: '
    //   95: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: aload_2
    //   100: aload_1
    //   101: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: ldc 'FirebaseMessaging'
    //   107: aload_2
    //   108: invokevirtual toString : ()Ljava/lang/String;
    //   111: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   114: pop
    //   115: aload_0
    //   116: invokespecial a : ()V
    //   119: aload_0
    //   120: monitorexit
    //   121: return
    //   122: aload_0
    //   123: aload_2
    //   124: checkcast com/google/firebase/messaging/b1
    //   127: putfield e : Lcom/google/firebase/messaging/b1;
    //   130: aload_0
    //   131: invokespecial b : ()V
    //   134: aload_0
    //   135: monitorexit
    //   136: return
    //   137: astore_1
    //   138: aload_0
    //   139: monitorexit
    //   140: aload_1
    //   141: athrow
    // Exception table:
    //   from	to	target	type
    //   2	57	137	finally
    //   57	119	137	finally
    //   122	134	137	finally
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      String str = String.valueOf(paramComponentName);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
      stringBuilder.append("onServiceDisconnected: ");
      stringBuilder.append(str);
      Log.d("FirebaseMessaging", stringBuilder.toString());
    } 
    b();
  }
  
  static class a {
    final Intent a;
    
    private final m<Void> b = new m();
    
    a(Intent param1Intent) {
      this.a = param1Intent;
    }
    
    void a() {
      this.b.b(null);
    }
    
    void a(ScheduledExecutorService param1ScheduledExecutorService) {
      ScheduledFuture<?> scheduledFuture = param1ScheduledExecutorService.schedule(new c1(this), 9000L, TimeUnit.MILLISECONDS);
      b().a(param1ScheduledExecutorService, new d1(scheduledFuture));
    }
    
    l<Void> b() {
      return this.b.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/e1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */