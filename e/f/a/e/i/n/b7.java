package e.f.a.e.i.n;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.f.a;

public final class b7 extends s implements z6 {
  b7(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
  }
  
  public final g5 a(a parama, g4 paramg4) {
    g5 g5;
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama);
    t.a(parcel2, (Parcelable)paramg4);
    Parcel parcel1 = a(1, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
      if (iInterface instanceof g5) {
        g5 = (g5)iInterface;
      } else {
        g5 = new a7((IBinder)g5);
      } 
    } 
    parcel1.recycle();
    return g5;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/b7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */