package e.f.a.e.i.n;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.f.a;
import e.f.a.e.n.d.a;

public final class a7 extends s implements g5 {
  a7(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
  }
  
  public final a[] a(a parama, c7 paramc7) {
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama);
    t.a(parcel2, (Parcelable)paramc7);
    Parcel parcel1 = a(1, parcel2);
    a[] arrayOfA = (a[])parcel1.createTypedArray(a.CREATOR);
    parcel1.recycle();
    return arrayOfA;
  }
  
  public final a[] b(a parama, c7 paramc7) {
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama);
    t.a(parcel2, (Parcelable)paramc7);
    Parcel parcel1 = a(2, parcel2);
    a[] arrayOfA = (a[])parcel1.createTypedArray(a.CREATOR);
    parcel1.recycle();
    return arrayOfA;
  }
  
  public final void zza() {
    b(3, e());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/a7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */