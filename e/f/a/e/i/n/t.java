package e.f.a.e.i.n;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class t {
  static {
    t.class.getClassLoader();
  }
  
  public static void a(Parcel paramParcel, IInterface paramIInterface) {
    IBinder iBinder;
    if (paramIInterface == null) {
      paramIInterface = null;
    } else {
      iBinder = paramIInterface.asBinder();
    } 
    paramParcel.writeStrongBinder(iBinder);
  }
  
  public static void a(Parcel paramParcel, Parcelable paramParcelable) {
    if (paramParcelable == null) {
      paramParcel.writeInt(0);
      return;
    } 
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */