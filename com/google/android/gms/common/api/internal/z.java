package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class z extends BroadcastReceiver {
  private Context a;
  
  private final b0 b;
  
  public z(b0 paramb0) {
    this.b = paramb0;
  }
  
  public final void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/content/Context;
    //   6: ifnull -> 17
    //   9: aload_0
    //   10: getfield a : Landroid/content/Context;
    //   13: aload_0
    //   14: invokevirtual unregisterReceiver : (Landroid/content/BroadcastReceiver;)V
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield a : Landroid/content/Context;
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	17	25	finally
    //   17	22	25	finally
  }
  
  public final void a(Context paramContext) {
    this.a = paramContext;
  }
  
  public final void onReceive(Context paramContext, Intent paramIntent) {
    Uri uri = paramIntent.getData();
    if (uri != null) {
      String str = uri.getSchemeSpecificPart();
    } else {
      uri = null;
    } 
    if ("com.google.android.gms".equals(uri)) {
      this.b.a();
      a();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */