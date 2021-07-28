package e.f.a.e.i.c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public class c {
  static {
    c.class.getClassLoader();
  }
  
  public static <T extends Parcelable> T a(Parcel paramParcel, Parcelable.Creator<T> paramCreator) {
    return (T)((paramParcel.readInt() == 0) ? null : (Parcelable)paramCreator.createFromParcel(paramParcel));
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */