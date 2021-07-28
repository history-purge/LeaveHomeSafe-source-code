package io.invertase.firebase.messaging;

import android.content.Intent;
import com.google.firebase.messaging.j0;
import e.e.o.c;
import e.e.o.c0.a;
import io.invertase.firebase.common.h;

public class ReactNativeFirebaseMessagingHeadlessService extends c {
  protected a a(Intent paramIntent) {
    return (paramIntent.getExtras() == null) ? null : new a("ReactNativeFirebaseMessagingHeadlessTask", o.a((j0)paramIntent.getParcelableExtra("message")), h.c().a("messaging_android_headless_task_timeout", 60000L), true);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/io/invertase/firebase/messaging/ReactNativeFirebaseMessagingHeadlessService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */