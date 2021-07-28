package e.f.a.e.i.n;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.f.a;

public final class d extends s implements e {
  d(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
  }
  
  public final i[] a(a parama, c7 paramc7, k paramk) {
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama);
    t.a(parcel2, (Parcelable)paramc7);
    t.a(parcel2, (Parcelable)paramk);
    Parcel parcel1 = a(3, parcel2);
    i[] arrayOfI = (i[])parcel1.createTypedArray(i.CREATOR);
    parcel1.recycle();
    return arrayOfI;
  }
  
  public final void zzb() {
    b(2, e());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */