package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import e.f.a.e.e.n.b;
import e.f.a.e.i.n.b0;
import e.f.a.e.i.n.c7;
import e.f.a.e.i.n.g0;
import e.f.a.e.i.n.j0;
import e.f.a.e.i.n.k0;
import e.f.a.e.i.n.o0;
import e.f.a.e.i.n.p0;
import e.f.a.e.n.c;
import java.util.ArrayList;
import java.util.List;

@Keep
public class LogUtils {
  public static b0 zza(Context paramContext) {
    b0.a a = b0.zza();
    a.a(paramContext.getPackageName());
    String str = zzb(paramContext);
    if (str != null)
      a.b(str); 
    return (b0)a.u();
  }
  
  public static p0 zza(long paramLong, int paramInt, String paramString1, String paramString2, List<o0> paramList, c7 paramc7) {
    j0.a a = j0.zza();
    g0.b b1 = g0.zza();
    b1.a(paramString2);
    b1.a(paramLong);
    b1.b(paramInt);
    b1.a(paramList);
    ArrayList<g0> arrayList = new ArrayList();
    arrayList.add((g0)b1.u());
    a.a(arrayList);
    k0.b b = k0.zza();
    b.b(paramc7.d);
    b.a(paramc7.c);
    b.c(paramc7.e);
    b.d(paramc7.f);
    a.a((k0)b.u());
    j0 j0 = (j0)a.u();
    p0.a a1 = p0.zza();
    a1.a(j0);
    return (p0)a1.u();
  }
  
  private static String zzb(Context paramContext) {
    try {
      return (b.a(paramContext).b(paramContext.getPackageName(), 0)).versionName;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      c.a((Throwable)nameNotFoundException, "Unable to find calling package info for %s", new Object[] { paramContext.getPackageName() });
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/clearcut/LogUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */