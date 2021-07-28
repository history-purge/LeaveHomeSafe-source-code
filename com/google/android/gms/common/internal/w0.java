package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import e.f.a.e.e.n.a;
import e.f.a.e.e.n.b;

public final class w0 {
  private static Object a = new Object();
  
  private static boolean b;
  
  private static int c;
  
  public static int a(Context paramContext) {
    b(paramContext);
    return c;
  }
  
  private static void b(Context paramContext) {
    synchronized (a) {
      if (b)
        return; 
      b = true;
      String str = paramContext.getPackageName();
      a a = b.a(paramContext);
      try {
        Bundle bundle = (a.a(str, 128)).metaData;
        if (bundle == null)
          return; 
        bundle.getString("com.google.app.id");
        c = bundle.getInt("com.google.android.gms.version");
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.wtf("MetadataValueReader", "This should never happen.", (Throwable)nameNotFoundException);
      } 
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */