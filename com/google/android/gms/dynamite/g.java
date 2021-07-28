package com.google.android.gms.dynamite;

import android.content.Context;

final class g implements DynamiteModule.b {
  public final DynamiteModule.b.a a(Context paramContext, String paramString, DynamiteModule.b.b paramb) {
    int i;
    DynamiteModule.b.a a = new DynamiteModule.b.a();
    a.a = paramb.a(paramContext, paramString);
    if (a.a != 0) {
      i = paramb.a(paramContext, paramString, false);
    } else {
      i = paramb.a(paramContext, paramString, true);
    } 
    a.b = i;
    if (a.a == 0 && a.b == 0) {
      a.c = 0;
      return a;
    } 
    if (a.b >= a.a) {
      a.c = 1;
      return a;
    } 
    a.c = -1;
    return a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */