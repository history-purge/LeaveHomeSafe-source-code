package e.f.a.e.i.d;

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
  
  protected final void a(int paramInt, Parcel paramParcel) {
    try {
      this.a.transact(1, paramParcel, null, 1);
      return;
    } finally {
      paramParcel.recycle();
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */