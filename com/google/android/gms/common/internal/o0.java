package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Message;
import e.f.a.e.e.m.a;
import e.f.a.e.i.f.h;
import java.util.HashMap;

final class o0 extends h {
  private final HashMap<h.a, q0> d = new HashMap<h.a, q0>();
  
  private final Context e;
  
  private final Handler f;
  
  private final a g;
  
  private final long h;
  
  private final long i;
  
  o0(Context paramContext) {
    this.e = paramContext.getApplicationContext();
    this.f = (Handler)new h(paramContext.getMainLooper(), new p0(this, null));
    this.g = a.a();
    this.h = 5000L;
    this.i = 300000L;
  }
  
  protected final boolean a(h.a parama, ServiceConnection paramServiceConnection, String paramString) {
    q.a(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.d) {
      q0 q01;
      String str;
      q0 q02 = this.d.get(parama);
      if (q02 == null) {
        q02 = new q0(this, parama);
        q02.a(paramServiceConnection, paramServiceConnection, paramString);
        q02.a(paramString);
        this.d.put(parama, q02);
        q01 = q02;
      } else {
        this.f.removeMessages(0, q01);
        if (!q02.a(paramServiceConnection)) {
          q02.a(paramServiceConnection, paramServiceConnection, paramString);
          int i = q02.b();
          if (i != 1) {
            if (i != 2) {
              q01 = q02;
            } else {
              q02.a(paramString);
              q01 = q02;
            } 
          } else {
            paramServiceConnection.onServiceConnected(q02.e(), q02.d());
            q01 = q02;
          } 
          return q01.a();
        } 
        str = String.valueOf(q01);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 81);
        stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
        stringBuilder.append(str);
        throw new IllegalStateException(stringBuilder.toString());
      } 
      return str.a();
    } 
  }
  
  protected final void b(h.a parama, ServiceConnection paramServiceConnection, String paramString) {
    q.a(paramServiceConnection, "ServiceConnection must not be null");
    synchronized (this.d) {
      q0 q0 = this.d.get(parama);
      if (q0 != null) {
        Message message;
        if (q0.a(paramServiceConnection)) {
          q0.a(paramServiceConnection, paramString);
          if (q0.c()) {
            message = this.f.obtainMessage(0, parama);
            this.f.sendMessageDelayed(message, this.h);
          } 
          return;
        } 
        str = String.valueOf(message);
        StringBuilder stringBuilder1 = new StringBuilder(String.valueOf(str).length() + 76);
        stringBuilder1.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
        stringBuilder1.append(str);
        throw new IllegalStateException(stringBuilder1.toString());
      } 
      String str = String.valueOf(str);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 50);
      stringBuilder.append("Nonexistent connection status for service config: ");
      stringBuilder.append(str);
      throw new IllegalStateException(stringBuilder.toString());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */