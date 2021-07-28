package e.f.a.e.i.d;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import e.f.a.e.c.d;
import e.f.a.e.c.f;

public abstract class s5 extends y implements r5 {
  public s5() {
    super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    switch (paramInt1) {
      default:
        return false;
      case 9:
        b(y0.<Status>a(paramParcel1, Status.CREATOR), y0.<d>a(paramParcel1, d.CREATOR));
        throw null;
      case 8:
        a(y0.<Status>a(paramParcel1, Status.CREATOR), y0.<d>a(paramParcel1, d.CREATOR));
        throw null;
      case 7:
        a(y0.<DataHolder>a(paramParcel1, DataHolder.CREATOR));
        throw null;
      case 6:
        a(y0.<Status>a(paramParcel1, Status.CREATOR), (f[])paramParcel1.createTypedArray(f.CREATOR));
        throw null;
      case 5:
        b(y0.<Status>a(paramParcel1, Status.CREATOR), paramParcel1.readLong());
        throw null;
      case 4:
        g(y0.<Status>a(paramParcel1, Status.CREATOR));
        throw null;
      case 3:
        a(y0.<Status>a(paramParcel1, Status.CREATOR), paramParcel1.readLong());
        throw null;
      case 2:
        e(y0.<Status>a(paramParcel1, Status.CREATOR));
        throw null;
      case 1:
        break;
    } 
    c(y0.<Status>a(paramParcel1, Status.CREATOR));
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/s5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */