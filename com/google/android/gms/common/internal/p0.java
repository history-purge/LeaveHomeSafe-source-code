package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

final class p0 implements Handler.Callback {
  private p0(o0 paramo0) {}
  
  public final boolean handleMessage(Message paramMessage) {
    int i = paramMessage.what;
    if (i != 0) {
      if (i != 1)
        return false; 
      synchronized (o0.a(this.a)) {
        h.a a = (h.a)paramMessage.obj;
        q0 q0 = (q0)o0.a(this.a).get(a);
        if (q0 != null && q0.b() == 3) {
          String str = String.valueOf(a);
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 47);
          stringBuilder.append("Timeout waiting for ServiceConnection callback ");
          stringBuilder.append(str);
          Log.e("GmsClientSupervisor", stringBuilder.toString(), new Exception());
          ComponentName componentName2 = q0.e();
          ComponentName componentName1 = componentName2;
          if (componentName2 == null)
            componentName1 = a.b(); 
          componentName2 = componentName1;
          if (componentName1 == null) {
            String str1 = a.a();
            q.a(str1);
            componentName2 = new ComponentName(str1, "unknown");
          } 
          q0.onServiceDisconnected(componentName2);
        } 
        return true;
      } 
    } 
    synchronized (o0.a(this.a)) {
      h.a a = (h.a)paramMessage.obj;
      q0 q0 = (q0)o0.a(this.a).get(a);
      if (q0 != null && q0.c()) {
        if (q0.a())
          q0.b("GmsClientSupervisor"); 
        o0.a(this.a).remove(a);
      } 
      return true;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/p0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */