package e.f.a.e.i.n;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.f.a;

public final class f extends s implements g {
  f(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.vision.text.internal.client.INativeTextRecognizerCreator");
  }
  
  public final e a(a parama, n paramn) {
    e e;
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama);
    t.a(parcel2, (Parcelable)paramn);
    Parcel parcel1 = a(1, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.text.internal.client.INativeTextRecognizer");
      if (iInterface instanceof e) {
        e = (e)iInterface;
      } else {
        e = new d((IBinder)e);
      } 
    } 
    parcel1.recycle();
    return e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */