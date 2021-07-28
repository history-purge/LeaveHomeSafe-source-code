package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class q0 implements ServiceConnection, s0 {
  private final Map<ServiceConnection, ServiceConnection> a;
  
  private int b;
  
  private boolean c;
  
  private IBinder d;
  
  private final h.a e;
  
  private ComponentName f;
  
  public q0(o0 paramo0, h.a parama) {
    this.e = parama;
    this.a = new HashMap<ServiceConnection, ServiceConnection>();
    this.b = 2;
  }
  
  public final void a(ServiceConnection paramServiceConnection1, ServiceConnection paramServiceConnection2, String paramString) {
    this.a.put(paramServiceConnection1, paramServiceConnection2);
  }
  
  public final void a(ServiceConnection paramServiceConnection, String paramString) {
    this.a.remove(paramServiceConnection);
  }
  
  public final void a(String paramString) {
    this.b = 3;
    this.c = o0.d(this.g).a(o0.c(this.g), paramString, this.e.a(o0.c(this.g)), this, this.e.c());
    if (this.c) {
      Message message = o0.b(this.g).obtainMessage(1, this.e);
      o0.b(this.g).sendMessageDelayed(message, o0.e(this.g));
      return;
    } 
    this.b = 2;
    try {
      o0.d(this.g).a(o0.c(this.g), this);
      return;
    } catch (IllegalArgumentException illegalArgumentException) {
      return;
    } 
  }
  
  public final boolean a() {
    return this.c;
  }
  
  public final boolean a(ServiceConnection paramServiceConnection) {
    return this.a.containsKey(paramServiceConnection);
  }
  
  public final int b() {
    return this.b;
  }
  
  public final void b(String paramString) {
    o0.b(this.g).removeMessages(1, this.e);
    o0.d(this.g).a(o0.c(this.g), this);
    this.c = false;
    this.b = 2;
  }
  
  public final boolean c() {
    return this.a.isEmpty();
  }
  
  public final IBinder d() {
    return this.d;
  }
  
  public final ComponentName e() {
    return this.f;
  }
  
  public final void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder) {
    synchronized (o0.a(this.g)) {
      o0.b(this.g).removeMessages(1, this.e);
      this.d = paramIBinder;
      this.f = paramComponentName;
      Iterator<ServiceConnection> iterator = this.a.values().iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceConnected(paramComponentName, paramIBinder); 
      this.b = 1;
      return;
    } 
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName) {
    synchronized (o0.a(this.g)) {
      o0.b(this.g).removeMessages(1, this.e);
      this.d = null;
      this.f = paramComponentName;
      Iterator<ServiceConnection> iterator = this.a.values().iterator();
      while (iterator.hasNext())
        ((ServiceConnection)iterator.next()).onServiceDisconnected(paramComponentName); 
      this.b = 2;
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */