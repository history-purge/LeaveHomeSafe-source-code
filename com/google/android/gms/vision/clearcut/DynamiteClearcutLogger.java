package com.google.android.gms.vision.clearcut;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.i.n.g2;
import e.f.a.e.i.n.p0;
import e.f.a.e.i.n.u;
import e.f.a.e.n.c;
import java.util.concurrent.ExecutorService;

@Keep
public class DynamiteClearcutLogger {
  private static final ExecutorService zza = u.a().a(2, g2.a);
  
  private b zzb = new b(0.03333333333333333D);
  
  private VisionClearcutLogger zzc;
  
  public DynamiteClearcutLogger(@RecentlyNonNull Context paramContext) {
    this.zzc = new VisionClearcutLogger(paramContext);
  }
  
  public final void zza(int paramInt, p0 paramp0) {
    if (paramInt == 3 && !this.zzb.a()) {
      c.d("Skipping image analysis log due to rate limiting", new Object[0]);
      return;
    } 
    zza.execute(new a(this, paramInt, paramp0));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/clearcut/DynamiteClearcutLogger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */