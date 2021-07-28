package e.f.a.e.k.b;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import e.f.a.e.e.a;
import e.f.a.e.i.c.a;
import e.f.a.e.i.c.c;

public abstract class g extends a implements d {
  public g() {
    super("com.google.android.gms.signin.internal.ISignInCallbacks");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    switch (paramInt1) {
      default:
        return false;
      case 9:
        a((h)c.a(paramParcel1, h.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 8:
        a((n)c.a(paramParcel1, n.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 7:
        a((Status)c.a(paramParcel1, Status.CREATOR), (GoogleSignInAccount)c.a(paramParcel1, GoogleSignInAccount.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 6:
        f((Status)c.a(paramParcel1, Status.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 4:
        a((Status)c.a(paramParcel1, Status.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 3:
        break;
    } 
    a((a)c.a(paramParcel1, a.CREATOR), (c)c.a(paramParcel1, c.CREATOR));
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/k/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */