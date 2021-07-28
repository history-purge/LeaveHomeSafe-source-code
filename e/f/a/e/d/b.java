package e.f.a.e.d;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.util.p.a;
import e.f.a.e.i.e.a;
import e.f.a.e.i.e.f;
import e.f.a.e.m.l;
import e.f.a.e.m.o;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class b extends BroadcastReceiver {
  private final ExecutorService a = a.a().a((ThreadFactory)new a("firebase-iid-executor"), f.a);
  
  private final int a(Context paramContext, Intent paramIntent) {
    PendingIntent pendingIntent = (PendingIntent)paramIntent.getParcelableExtra("pending_intent");
    if (pendingIntent != null)
      try {
        pendingIntent.send();
      } catch (android.app.PendingIntent.CanceledException canceledException) {
        Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
      }  
    Bundle bundle = paramIntent.getExtras();
    if (bundle != null) {
      bundle.remove("pending_intent");
    } else {
      bundle = new Bundle();
    } 
    if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(paramIntent.getAction())) {
      b(paramContext, bundle);
    } else {
      if ("com.google.firebase.messaging.NOTIFICATION_DISMISS".equals(paramIntent.getAction())) {
        a(paramContext, bundle);
        return -1;
      } 
      Log.e("CloudMessagingReceiver", "Unknown notification action");
      return 500;
    } 
    return -1;
  }
  
  private final int b(Context paramContext, Intent paramIntent) {
    l<Void> l;
    if (paramIntent.getExtras() == null)
      return 500; 
    String str2 = paramIntent.getStringExtra("google.message_id");
    if (TextUtils.isEmpty(str2)) {
      l = o.a(null);
    } else {
      Bundle bundle = new Bundle();
      bundle.putString("google.message_id", (String)l);
      l = i.a(paramContext).a(2, bundle);
    } 
    int i = a(paramContext, new a(paramIntent));
    try {
      o.a(l, TimeUnit.SECONDS.toMillis(1L), TimeUnit.MILLISECONDS);
      return i;
    } catch (ExecutionException executionException) {
    
    } catch (InterruptedException interruptedException) {
    
    } catch (TimeoutException timeoutException) {}
    String str1 = String.valueOf(timeoutException);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 20);
    stringBuilder.append("Message ack failed: ");
    stringBuilder.append(str1);
    Log.w("CloudMessagingReceiver", stringBuilder.toString());
    return i;
  }
  
  protected abstract int a(Context paramContext, a parama);
  
  protected Executor a() {
    return this.a;
  }
  
  protected abstract void a(Context paramContext, Bundle paramBundle);
  
  protected void b(Context paramContext, Bundle paramBundle) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    if (paramIntent == null)
      return; 
    boolean bool = isOrderedBroadcast();
    BroadcastReceiver.PendingResult pendingResult = goAsync();
    a().execute(new h(this, paramIntent, paramContext, bool, pendingResult));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */