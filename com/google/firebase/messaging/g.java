package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import e.f.a.e.m.o;
import java.util.concurrent.ExecutorService;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
public abstract class g extends Service {
  final ExecutorService c = p.b();
  
  private Binder d;
  
  private final Object e = new Object();
  
  private int f;
  
  private int g = 0;
  
  private void d(Intent paramIntent) {
    if (paramIntent != null)
      y0.a(paramIntent); 
    synchronized (this.e) {
      int i = this.g - 1;
      this.g = i;
      if (i == 0)
        a(this.f); 
      return;
    } 
  }
  
  private l<Void> e(Intent paramIntent) {
    if (c(paramIntent))
      return o.a(null); 
    m m = new m();
    this.c.execute(new d(this, paramIntent, m));
    return m.a();
  }
  
  protected abstract Intent a(Intent paramIntent);
  
  boolean a(int paramInt) {
    return stopSelfResult(paramInt);
  }
  
  public abstract void b(Intent paramIntent);
  
  public boolean c(Intent paramIntent) {
    return false;
  }
  
  public final IBinder onBind(Intent paramIntent) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'EnhancedIntentService'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifeq -> 19
    //   11: ldc 'EnhancedIntentService'
    //   13: ldc 'Service received bind request'
    //   15: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   18: pop
    //   19: aload_0
    //   20: getfield d : Landroid/os/Binder;
    //   23: ifnonnull -> 45
    //   26: aload_0
    //   27: new com/google/firebase/messaging/b1
    //   30: dup
    //   31: new com/google/firebase/messaging/g$a
    //   34: dup
    //   35: aload_0
    //   36: invokespecial <init> : (Lcom/google/firebase/messaging/g;)V
    //   39: invokespecial <init> : (Lcom/google/firebase/messaging/b1$a;)V
    //   42: putfield d : Landroid/os/Binder;
    //   45: aload_0
    //   46: getfield d : Landroid/os/Binder;
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: areturn
    //   54: astore_1
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_1
    //   58: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	54	finally
    //   19	45	54	finally
    //   45	50	54	finally
  }
  
  public void onDestroy() {
    this.c.shutdown();
    super.onDestroy();
  }
  
  public final int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2) {
    synchronized (this.e) {
      this.f = paramInt2;
      this.g++;
      null = (Object<Void>)a(paramIntent);
      if (null == null) {
        d(paramIntent);
        return 2;
      } 
      null = (Object<Void>)e((Intent)null);
      if (null.d()) {
        d(paramIntent);
        return 2;
      } 
      null.a(e.c, new f(this, paramIntent));
      return 3;
    } 
  }
  
  class a implements b1.a {
    a(g this$0) {}
    
    public l<Void> a(Intent param1Intent) {
      return g.a(this.a, param1Intent);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */