package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.c.a;
import e.f.a.e.i.n.p0;
import e.f.a.e.i.n.t2;
import e.f.a.e.i.n.x;
import e.f.a.e.n.c;

@Keep
public class VisionClearcutLogger {
  private final a zza;
  
  private boolean zzb = true;
  
  public VisionClearcutLogger(@RecentlyNonNull Context paramContext) {
    this.zza = new a(paramContext, "VISION", null);
  }
  
  public final void zza(int paramInt, p0 paramp0) {
    byte[] arrayOfByte = paramp0.h();
    if (paramInt < 0 || paramInt > 3) {
      c.c("Illegal event code: %d", new Object[] { Integer.valueOf(paramInt) });
      return;
    } 
    try {
      a.a a1;
      if (this.zzb) {
        a1 = this.zza.a(arrayOfByte);
        a1.a(paramInt);
        a1.a();
        return;
      } 
      p0.a a2 = p0.zza();
      try {
        t2 t2 = t2.b();
        a2.a((byte[])a1, 0, a1.length, t2);
        c.b("Would have logged:\n%s", new Object[] { a2.toString() });
        return;
      } catch (Exception exception) {
        c.a(exception, "Parsing error", new Object[0]);
        return;
      } 
    } catch (Exception exception) {
      x.a(exception);
      c.a(exception, "Failed to log", new Object[0]);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/clearcut/VisionClearcutLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */