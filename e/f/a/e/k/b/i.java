package e.f.a.e.k.b;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.i.c.b;
import e.f.a.e.i.c.c;

public final class i extends b implements f {
  i(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.signin.internal.ISignInService");
  }
  
  public final void a(l paraml, d paramd) {
    Parcel parcel = e();
    c.a(parcel, (Parcelable)paraml);
    c.a(parcel, paramd);
    a(12, parcel);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/k/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */