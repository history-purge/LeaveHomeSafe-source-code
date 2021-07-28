package e.f.a.e.g;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.f.a.e.f.a;
import e.f.a.e.i.h.b;
import e.f.a.e.i.h.c;

public abstract class g extends b implements f {
  public g() {
    super("com.google.android.gms.flags.IFlagProvider");
  }
  
  public static f asInterface(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
    return (iInterface instanceof f) ? (f)iInterface : new h(paramIBinder);
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    String str;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        if (paramInt1 != 3) {
          if (paramInt1 != 4) {
            if (paramInt1 != 5)
              return false; 
            str = getStringFlagValue(paramParcel1.readString(), paramParcel1.readString(), paramParcel1.readInt());
            paramParcel2.writeNoException();
            paramParcel2.writeString(str);
            return true;
          } 
          long l = getLongFlagValue(str.readString(), str.readLong(), str.readInt());
          paramParcel2.writeNoException();
          paramParcel2.writeLong(l);
          return true;
        } 
        paramInt1 = getIntFlagValue(str.readString(), str.readInt(), str.readInt());
        paramParcel2.writeNoException();
        paramParcel2.writeInt(paramInt1);
        return true;
      } 
      boolean bool = getBooleanFlagValue(str.readString(), c.a((Parcel)str), str.readInt());
      paramParcel2.writeNoException();
      c.a(paramParcel2, bool);
      return true;
    } 
    init(a.a.a(str.readStrongBinder()));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/g/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */