package com.google.android.gms.dynamite;

import android.content.Context;

final class h implements DynamiteModule.b {
  public final DynamiteModule.b.a a(Context paramContext, String paramString, DynamiteModule.b.b paramb) {
    byte b1;
    DynamiteModule.b.a a = new DynamiteModule.b.a();
    a.a = paramb.a(paramContext, paramString);
    a.b = paramb.a(paramContext, paramString, true);
    if (a.a == 0 && a.b == 0) {
      b1 = 0;
    } else {
      if (a.b >= a.a) {
        a.c = 1;
        return a;
      } 
      b1 = -1;
    } 
    a.c = b1;
    return a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */