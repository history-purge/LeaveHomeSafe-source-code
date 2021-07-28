package e.f.a.e.i.f;

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
  
  protected final Parcel a(int paramInt, Parcel paramParcel) {
    Parcel parcel = Parcel.obtain();
    try {
      this.a.transact(paramInt, paramParcel, parcel, 0);
      parcel.readException();
      paramParcel.recycle();
      return parcel;
    } catch (RuntimeException runtimeException) {
      parcel.recycle();
      throw runtimeException;
    } finally {}
    paramParcel.recycle();
    throw parcel;
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/f/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */