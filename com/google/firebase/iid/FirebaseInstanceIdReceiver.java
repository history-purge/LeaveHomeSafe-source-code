package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.g0;
import com.google.firebase.messaging.o;
import e.f.a.e.d.a;
import e.f.a.e.d.b;
import e.f.a.e.m.o;
import java.util.concurrent.ExecutionException;

public final class FirebaseInstanceIdReceiver extends b {
  protected final int a(Context paramContext, a parama) {
    try {
      return ((Integer)o.a((new o(paramContext)).a(parama.b()))).intValue();
    } catch (ExecutionException executionException) {
    
    } catch (InterruptedException interruptedException) {}
    Log.e("FirebaseMessaging", "Failed to send message to service.", interruptedException);
    return 500;
  }
  
  protected final void a(Context paramContext, Bundle paramBundle) {
    Intent intent = (new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS")).putExtras(paramBundle);
    if (g0.f(intent))
      g0.b(intent); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/FirebaseInstanceIdReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */