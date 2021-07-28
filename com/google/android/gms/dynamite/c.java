package com.google.android.gms.dynamite;

import android.content.Context;

final class c implements DynamiteModule.b {
  public final DynamiteModule.b.a a(Context paramContext, String paramString, DynamiteModule.b.b paramb) {
    DynamiteModule.b.a a = new DynamiteModule.b.a();
    a.b = paramb.a(paramContext, paramString, false);
    if (a.b == 0) {
      a.c = 0;
      return a;
    } 
    a.c = 1;
    return a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */