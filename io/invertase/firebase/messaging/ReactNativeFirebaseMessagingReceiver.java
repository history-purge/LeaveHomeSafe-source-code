package io.invertase.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.messaging.j0;
import e.e.o.c;
import f.a.a.a.b;
import io.invertase.firebase.app.a;
import io.invertase.firebase.common.g;
import io.invertase.firebase.common.k;
import java.util.HashMap;

public class ReactNativeFirebaseMessagingReceiver extends BroadcastReceiver {
  static HashMap<String, j0> a = new HashMap<String, j0>();
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    Log.d("RNFirebaseMsgReceiver", "broadcast received for message");
    if (a.a() == null)
      a.a(paramContext.getApplicationContext()); 
    j0 j0 = new j0(paramIntent.getExtras());
    g g = g.b();
    if (j0.t() != null) {
      a.put(j0.e(), j0);
      q.b().a().a(j0);
    } 
    if (k.a(paramContext)) {
      g.b((b)o.a(j0, Boolean.valueOf(false)));
      return;
    } 
    try {
      Intent intent = new Intent(paramContext, ReactNativeFirebaseMessagingHeadlessService.class);
      intent.putExtra("message", (Parcelable)j0);
      if (paramContext.startService(intent) != null) {
        c.a(paramContext);
        return;
      } 
    } catch (IllegalStateException illegalStateException) {
      Log.e("RNFirebaseMsgReceiver", "Background messages only work if the message priority is set to 'high'", illegalStateException);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/messaging/ReactNativeFirebaseMessagingReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */