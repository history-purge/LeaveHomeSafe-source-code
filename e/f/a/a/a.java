package e.f.a.a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a implements IInterface {
  private final IBinder a;
  
  private final String b;
  
  protected a(IBinder paramIBinder, String paramString) {
    this.a = paramIBinder;
    this.b = paramString;
  }
  
  protected final Parcel a(Parcel paramParcel) {
    Parcel parcel = Parcel.obtain();
    try {
      this.a.transact(1, paramParcel, parcel, 0);
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
  
  public final IBinder asBinder() {
    return this.a;
  }
  
  protected final Parcel e() {
    Parcel parcel = Parcel.obtain();
    parcel.writeInterfaceToken(this.b);
    return parcel;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */