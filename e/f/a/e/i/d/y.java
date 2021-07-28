package e.f.a.e.i.d;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class y extends Binder implements IInterface {
  protected y(String paramString) {
    attachInterface(this, paramString);
  }
  
  protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    throw null;
  }
  
  public IBinder asBinder() {
    return (IBinder)this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    boolean bool;
    if (paramInt1 > 16777215) {
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    } else {
      paramParcel1.enforceInterface(getInterfaceDescriptor());
      bool = false;
    } 
    return bool ? true : a(paramInt1, paramParcel1, paramParcel2, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */