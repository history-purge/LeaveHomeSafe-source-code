package com.google.android.gms.dynamite;

import android.content.Context;

final class a implements DynamiteModule.b {
  public final DynamiteModule.b.a a(Context paramContext, String paramString, DynamiteModule.b.b paramb) {
    DynamiteModule.b.a a1 = new DynamiteModule.b.a();
    a1.b = paramb.a(paramContext, paramString, true);
    if (a1.b != 0) {
      a1.c = 1;
      return a1;
    } 
    a1.a = paramb.a(paramContext, paramString);
    if (a1.a != 0)
      a1.c = -1; 
    return a1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */