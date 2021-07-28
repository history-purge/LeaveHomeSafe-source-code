package com.google.firebase.messaging;

import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import e.f.a.e.m.l;

class b1 extends Binder {
  private final a a;
  
  b1(a parama) {
    this.a = parama;
  }
  
  void a(e1.a parama) {
    if (Binder.getCallingUid() == Process.myUid()) {
      if (Log.isLoggable("FirebaseMessaging", 3))
        Log.d("FirebaseMessaging", "service received new intent via bind strategy"); 
      this.a.a(parama.a).a(z0.c, new a1(parama));
      return;
    } 
    throw new SecurityException("Binding only allowed within app");
  }
  
  static interface a {
    l<Void> a(Intent param1Intent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/b1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */