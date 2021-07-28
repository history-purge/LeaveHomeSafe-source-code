package e.f.a.a;

import android.os.Parcel;
import android.os.Parcelable;

public final class c {
  static {
    c.class.getClassLoader();
  }
  
  public static <T extends Parcelable> T a(Parcel paramParcel, Parcelable.Creator<T> paramCreator) {
    return (T)((paramParcel.readInt() != 0) ? (Parcelable)paramCreator.createFromParcel(paramParcel) : null);
  }
  
  public static void a(Parcel paramParcel, Parcelable paramParcelable) {
    paramParcel.writeInt(1);
    paramParcelable.writeToParcel(paramParcel, 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */