package e.f.a.e.i.f;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public class a extends Binder implements IInterface {
  protected a(String paramString) {
    attachInterface(this, paramString);
  }
  
  protected boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    return false;
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */