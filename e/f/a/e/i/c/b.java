package e.f.a.e.i.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class b implements IInterface {
  private final IBinder a;
  
  private final String b;
  
  protected b(IBinder paramIBinder, String paramString) {
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
  
  protected final Parcel e() {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(this.b);
    return parcel;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */