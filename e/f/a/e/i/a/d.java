package e.f.a.e.i.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class d implements IInterface {
  private final IBinder a;
  
  private final String b;
  
  protected d(IBinder paramIBinder, String paramString) {
    this.a = paramIBinder;
    this.b = paramString;
  }
  
  protected final void a(int paramInt, Parcel paramParcel) {
    Parcel parcel = Parcel.obtain();
    try {
      this.a.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      return;
    } finally {
      paramParcel.recycle();
      parcel.recycle();
    } 
  }
  
  public IBinder asBinder() {
    return this.a;
  }
  
  protected final Parcel g() {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(this.b);
    return parcel;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */