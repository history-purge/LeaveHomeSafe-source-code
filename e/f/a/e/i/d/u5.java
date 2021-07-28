package e.f.a.e.i.d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.c.f;

public final class u5 extends a implements t5 {
  u5(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
  }
  
  public final void a(r5 paramr5, f paramf) {
    Parcel parcel = e();
    y0.a(parcel, paramr5);
    y0.a(parcel, (Parcelable)paramf);
    a(1, parcel);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/u5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */