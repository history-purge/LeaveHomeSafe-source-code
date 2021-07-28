package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.k;
import e.f.a.e.m.l;
import java.util.concurrent.Executor;

public class o {
  private static final Object c = new Object();
  
  private static e1 d;
  
  private final Context a;
  
  private final Executor b;
  
  public o(Context paramContext) {
    this.a = paramContext;
    this.b = h.c;
  }
  
  private static e1 a(Context paramContext, String paramString) {
    synchronized (c) {
      if (d == null)
        d = new e1(paramContext, "com.google.firebase.MESSAGING_EVENT"); 
      return d;
    } 
  }
  
  private static l<Integer> b(Context paramContext, Intent paramIntent) {
    if (Log.isLoggable("FirebaseMessaging", 3))
      Log.d("FirebaseMessaging", "Binding to service"); 
    return a(paramContext, "com.google.firebase.MESSAGING_EVENT").a(paramIntent).a(k.c, l.a);
  }
  
  @SuppressLint({"InlinedApi"})
  public l<Integer> a(Context paramContext, Intent paramIntent) {
    boolean bool = k.h();
    int j = 0;
    int i = j;
    if (bool) {
      i = j;
      if ((paramContext.getApplicationInfo()).targetSdkVersion >= 26)
        i = 1; 
    } 
    j = paramIntent.getFlags();
    return (i != 0 && (j & 0x10000000) == 0) ? b(paramContext, paramIntent) : e.f.a.e.m.o.a(this.b, new i(paramContext, paramIntent)).b(this.b, new j(paramContext, paramIntent));
  }
  
  public l<Integer> a(Intent paramIntent) {
    String str = paramIntent.getStringExtra("gcm.rawData64");
    if (str != null) {
      paramIntent.putExtra("rawData", Base64.decode(str, 0));
      paramIntent.removeExtra("gcm.rawData64");
    } 
    return a(this.a, paramIntent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */