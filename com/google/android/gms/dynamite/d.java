package com.google.android.gms.dynamite;

import android.content.Context;

final class d implements DynamiteModule.b {
  public final DynamiteModule.b.a a(Context paramContext, String paramString, DynamiteModule.b.b paramb) {
    DynamiteModule.b.a a = new DynamiteModule.b.a();
    a.a = paramb.a(paramContext, paramString);
    if (a.a != 0) {
      a.c = -1;
      return a;
    } 
    a.b = paramb.a(paramContext, paramString, true);
    if (a.b != 0)
      a.c = 1; 
    return a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */